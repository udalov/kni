
package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.NativeIndex
import java.io.File
import java.util.HashMap


class ObjCGenerator( targetPath: String, namer: Namer, nativeLib: File, options: GeneratorOptions)
    : GeneratorBase(targetPath, namer, nativeLib, options) {

    // -[NSObject finalize] conflicts with java.lang.Object.finalize
    val skipMethodsNames = hashSetOf("finalize")

    override fun startFile(out: Printer, sourceFile: String) {
        super.startFile(out, sourceFile)
        out.println("import kni.objc.*").ln()
    }

    override fun generate(translationUnit: NativeIndex.TranslationUnit) {
        super.generate(translationUnit)

        for (protocol in translationUnit.getProtocolList()) {
            genProtocol(protocol)
        }

        // preparing list of all classes methods signatures for finding overrides
        val classes = hashMapOf<String, NativeIndex.ObjCClass>()
        translationUnit.getClass_List().forEach { classes.put(it.getName(), it) }

        // preparing list of all categories methods signatures for finding overrides
        val validCategories = translationUnit.getCategoryList()
                .filter { !it.getName().endsWith('+') } // skipping private categories
        val categoriesMap = hashMapOf<String, NativeIndex.ObjCCategory>()
        validCategories.forEach { categoriesMap.put(it.getName(), it) }

        for (klass in translationUnit.getClass_List()) {
            genClass(klass, classes, categoriesMap)
        }

        validCategories.map { genCategory(it) }
    }

    fun genProtocol(protocol: NativeIndex.ObjCProtocol) {
        val out = getOutput(protocol.getLocationFile())
        out.println()
        out.println("trait ${namer.protocolName(protocol.getName())} {")
           .push()
            // TODO: methods
           .println("trait metaclass")
           .pop()
           .println("}")
    }

    fun genCategory(category: NativeIndex.ObjCCategory) {
        val out = getOutput(category.getLocationFile())
        out.println()
        out.println("trait ${namer.categoryName(category.getName())} : IObjCObject {")
           .push()

        for (method in category.getMethodList().filter { !it.getClassMethod() && it.getFunction().getName() !in skipMethodsNames }) {
            genObjCFunction(out,
                            method.getFunction(),
                            qualifier = OverrideQualifier.open,
                            signature = makeFunSignature(method.getFunction(), hashSetOf(), hashSetOf()))
            out.println()
        }

        out.print("trait metaclass : IObjCObject")
        val catMetaMethods = category.getMethodList().filter { it.getClassMethod() && it.getFunction().getName() !in skipMethodsNames }
        if (catMetaMethods.any()) {
            out.println(" {")
               .push()

            var first = true
            for (method in catMetaMethods) {
                if (first) first = false else out.println()
                genObjCFunction(out,
                                method.getFunction(),
                                qualifier = OverrideQualifier.open,
                                signature = makeFunSignature(method.getFunction(), hashSetOf(), hashSetOf()))
            }

            out.pop()
               .println("}")
        }
        else out.println()

        out.pop()
           .println("}")
    }

    fun genClass(klass: NativeIndex.ObjCClass, allClasses: Map<String, NativeIndex.ObjCClass>, allCategories: HashMap<String, NativeIndex.ObjCCategory>) {
        val out = getOutput(klass.getLocationFile())
        out.println()

        val baseClassName =
                if (klass.hasBaseClass()) klass.getBaseClass()
                else "ObjCObject"
        val protocols = klass.getProtocolList()
        val categories = klass.getCategoryList().filter { allCategories.containsKey(it) }
        val baseList =
                listOf("$baseClassName(pointer)") +
                protocols.map { namer.protocolName(it) } +
                categories.map { namer.categoryName(it) }

        out.println("public open class ${klass.getName()}(pointer: Long) ${baseList.joinToString(separator = ", ", prefix = ": ")} {")
        out.push()

        val methods = klass.getMethodList().filter { it.getFunction().getName() !in skipMethodsNames }

        val baseMethods = getAllBaseMethods(klass, allClasses, allCategories)
        genMethods(out, methods.filter { !it.getClassMethod() }, baseMethods.filter { !it.second.getClassMethod() })

        genMetaClass(out, klass, allCategories, methods.filter { it.getClassMethod() }, baseMethods.filter { it.second.getClassMethod() })
        out.println()
        genClassObject(out, klass)

        // TODO: properties

        out.pop()

        out.println("}")
    }

    private fun genMethods(out: Printer,
                           methods: List<NativeIndex.ObjCMethod>,
                           baseMethods: Collection<Pair<String, NativeIndex.ObjCMethod>>) {

        val baseMethodsIds = baseMethods.map { it.first }.toHashSet()
        val classMethodsIds = hashSetOf<String>()

        for (method in methods) {
            val overrideId = getFunctionUniqueOverrideId(method.getFunction())
            classMethodsIds.add(overrideId)
            genObjCFunction(out,
                            method.getFunction(),
                            qualifier = if (overrideId in baseMethodsIds) OverrideQualifier.override else OverrideQualifier.open,
                            signature = makeFunSignature(method.getFunction(), hashSetOf(), hashSetOf()))
            out.println()
        }

        val baseMethodsMap = hashMapOf<String, NativeIndex.ObjCMethod>()
        baseMethodsMap.putAll(baseMethods)

        val manyBaseMethodsImplementations = arrayListOf<NativeIndex.ObjCMethod>()
        var curMethodId: String? = null
        var alreadyAdded = false
        for (methodId in baseMethods.map { it.first }.filter { it !in classMethodsIds }.sort())
            if (methodId == curMethodId) {
                if (!alreadyAdded) {
                    manyBaseMethodsImplementations.add(baseMethodsMap.get(methodId))
                    alreadyAdded = true
                }
            }
            else {
                curMethodId = methodId
                alreadyAdded = false
            }

        for (method in manyBaseMethodsImplementations) {
            genObjCFunction(out, method.getFunction(), OverrideQualifier.override,
                            signature = makeFunSignature(method.getFunction(), hashSetOf(), hashSetOf()))
            out.println()
        }
    }

    // the method id which is used to detect necessity of "override" keyword according to kotlin's rules
    private fun getFunctionUniqueOverrideId(func: NativeIndex.Function) =
            func.getName() +
            func.getParameterList()
                .map { parseType(it.getType(), options, LexicalScope.General).name }
                .joinToString(",","(",")")

    private fun getAllBaseMethods(klass: NativeIndex.ObjCClass, allClasses: Map<String, NativeIndex.ObjCClass>,
                                  allCategories: HashMap<String, NativeIndex.ObjCCategory>)
            : Collection<Pair<String, NativeIndex.ObjCMethod>> {

        val res = arrayListOf<Pair<String, NativeIndex.ObjCMethod>>()
        if (klass.hasBaseClass()) {
            val baseClass = allClasses.get(klass.getBaseClass())
            if (baseClass != null) {
                res.addAll(baseClass.getMethodList()
                                    .filter { it.getFunction().getName() !in  skipMethodsNames }
                                    .map { Pair(getFunctionUniqueOverrideId(it.getFunction()), it) })
                res.addAll(getAllBaseMethods(baseClass, allClasses, allCategories))
            }
        }
        for (catName in klass.getCategoryList()) {
            val cat = allCategories.get(catName)
            if (cat != null)
                res.addAll(cat.getMethodList()
                              .filter { it.getFunction().getName() !in  skipMethodsNames }
                              .map { Pair(getFunctionUniqueOverrideId(it.getFunction()), it) })
        }
        return res
    }

    private fun genObjCFunction(out: Printer, function: NativeIndex.Function, qualifier: OverrideQualifier = OverrideQualifier.none, signature: String? = null) {

        val returnType = parseType(function.getReturnType(), options, LexicalScope.General)
        val isUnit = (returnType == UnitType)
        out.println("${
            when (qualifier) {
                OverrideQualifier.open -> "public open "
                OverrideQualifier.override -> "override "
                else -> ""
            }}${signature ?: makeFunSignature(function, hashSetOf(), hashSetOf())}${
            if (isUnit) " {" else " ="}")

        val params = function.getParameterList()
                             .mapIndexed { i, p -> namer.parameterName( p.getName(), i) }
        out.pushoneln("Native.objc_msgSend(\"${returnTypeReflectString(returnType)}\", this, \"${function.getName()}\"${
            if (params.any()) params.joinToString(", ", prefix = ", ") else ""
            })${if (returnType != UnitType && returnType.getExpr() != "Any") " as ${returnType.getExpr()}" else ""}")
        if (isUnit) out.println("}")
    }

    private fun returnTypeReflectString(type: Type): String {
        return when (type) {
            UnitType -> "void"
            BooleanType -> "boolean"
            CharType -> "char"
        // ByteType -> "byte"
            ShortType -> "short"
            IntType -> "int"
            FloatType -> "float"
            LongType -> "long"
            DoubleType -> "double"
            ObjCClassType -> "interface kni.objc.ObjCClass"
            ObjCOpaquePointerType, is ObjCPointerType -> "class kni.objc.Pointer"
            ObjCObjectType, ObjCSelectorType -> "class kni.objc.${type.getExpr()}"
            is FunctionType -> "class kotlin.Function${type.paramTypes.size()}"
            else -> "class objc.${type.getExpr()}"
        }
    }

    private fun genMetaClass(out: Printer,
                             klass: NativeIndex.ObjCClass,
                             allCategories: HashMap<String, NativeIndex.ObjCCategory>,
                             methods: List<NativeIndex.ObjCMethod>,
                             baseMethods: Collection<Pair<String, NativeIndex.ObjCMethod>>) {
        val baseList =
                (if (klass.hasBaseClass())
                    listOf(klass.getBaseClass() + ".metaclass")
                else listOf("IObjCObject")) +
                klass.getProtocolList().map { namer.protocolName(it) + ".metaclass" } +
                klass.getCategoryList().filter { allCategories.containsKey(it) }.map { namer.categoryName(it) + ".metaclass" }

        out.println("trait metaclass : ${baseList.join(", ")} {")
        out.push()

        genMethods(out, methods, baseMethods)

        out.pop()
        out.println("}")
    }

    private fun genClassObject(out: Printer, klass: NativeIndex.ObjCClass) {
        // TODO (!): there may be other hierarchy roots!
        out.println("companion object : NSObject(Native.objc_getClass(\"${klass.getName()}\")), metaclass, ObjCClass {")
        // TODO: only generate this into class objects of root classes
           .pushoneln("init { loadLibrary(interopConfig.nativeLibraryPath) }")
           .println("}")
    }
}
