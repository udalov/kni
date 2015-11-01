
package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.NativeIndex
import java.io.File
import java.util.*

class ObjCGenerator(
        targetPath: String,
        namer: Namer,
        nativeLib: File,
        options: GeneratorOptions
) : GeneratorBase(targetPath, namer, nativeLib, options) {

    // -[NSObject finalize] conflicts with java.lang.Object.finalize
    val skipMethodsNames = hashSetOf("finalize")

    override fun startFile(out: Printer, sourceFile: String) {
        super.startFile(out, sourceFile)
        out.println("import kni.objc.*").ln()
    }

    override fun generate(translationUnit: NativeIndex.TranslationUnit) {
        super.generate(translationUnit)

        for (protocol in translationUnit.protocolList) {
            genProtocol(protocol)
        }

        // preparing list of all classes methods signatures for finding overrides
        val classes = hashMapOf<String, NativeIndex.ObjCClass>()
        translationUnit.class_List.forEach { classes.put(it.name, it) }

        // preparing list of all categories methods signatures for finding overrides
        val validCategories = translationUnit.categoryList
                .filter { !it.name.endsWith('+') } // skipping private categories
        val categoriesMap = hashMapOf<String, NativeIndex.ObjCCategory>()
        validCategories.forEach { categoriesMap.put(it.name, it) }

        for (klass in translationUnit.class_List) {
            genClass(klass, classes, categoriesMap)
        }

        validCategories.map { genCategory(it) }
    }

    fun genProtocol(protocol: NativeIndex.ObjCProtocol) {
        val out = getOutput(protocol.locationFile)
        out.println()
        out.println("trait ${namer.protocolName(protocol.name)} {")
           .push()
            // TODO: methods
           .println("trait metaclass")
           .pop()
           .println("}")
    }

    fun genCategory(category: NativeIndex.ObjCCategory) {
        val out = getOutput(category.locationFile)
        out.println()
        out.println("trait ${namer.categoryName(category.name)} : IObjCObject {").push()

        for (method in category.methodList.filter { !it.classMethod && it.function.name !in skipMethodsNames }) {
            genObjCFunction(
                    out,
                    method.function,
                    qualifier = OverrideQualifier.open,
                    signature = makeFunSignature(method.function, hashSetOf(), hashSetOf())
            )
            out.println()
        }

        out.print("trait metaclass : IObjCObject")
        val catMetaMethods = category.methodList.filter { it.classMethod && it.function.name !in skipMethodsNames }
        if (catMetaMethods.any()) {
            out.println(" {").push()

            var first = true
            for (method in catMetaMethods) {
                if (first) first = false else out.println()
                genObjCFunction(
                        out,
                        method.function,
                        qualifier = OverrideQualifier.open,
                        signature = makeFunSignature(method.function, hashSetOf(), hashSetOf())
                )
            }

            out.pop().println("}")
        }
        else out.println()

        out.pop().println("}")
    }

    fun genClass(klass: NativeIndex.ObjCClass, allClasses: Map<String, NativeIndex.ObjCClass>, allCategories: HashMap<String, NativeIndex.ObjCCategory>) {
        val out = getOutput(klass.locationFile)
        out.println()

        val baseClassName =
                if (klass.hasBaseClass()) klass.baseClass
                else "ObjCObject"
        val protocols = klass.protocolList
        val categories = klass.categoryList.filter { allCategories.containsKey(it) }
        val baseList =
                listOf("$baseClassName(pointer)") +
                protocols.map { namer.protocolName(it) } +
                categories.map { namer.categoryName(it) }

        out.println("public open class ${klass.name}(pointer: Long) ${baseList.joinToString(separator = ", ", prefix = ": ")} {")
        out.push()

        val methods = klass.methodList.filter { it.function.name !in skipMethodsNames }

        val baseMethods = getAllBaseMethods(klass, allClasses, allCategories)
        genMethods(out, methods.filter { !it.classMethod }, baseMethods.filter { !it.second.classMethod })

        genMetaClass(out, klass, allCategories, methods.filter { it.classMethod }, baseMethods.filter { it.second.classMethod })
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
            val overrideId = getFunctionUniqueOverrideId(method.function)
            classMethodsIds.add(overrideId)
            genObjCFunction(
                    out,
                    method.function,
                    qualifier = if (overrideId in baseMethodsIds) OverrideQualifier.override else OverrideQualifier.open,
                    signature = makeFunSignature(method.function, hashSetOf(), hashSetOf())
            )
            out.println()
        }

        val baseMethodsMap = hashMapOf<String, NativeIndex.ObjCMethod>()
        baseMethodsMap.putAll(baseMethods)

        val manyBaseMethodsImplementations = arrayListOf<NativeIndex.ObjCMethod>()
        var curMethodId: String? = null
        var alreadyAdded = false
        for (methodId in baseMethods.map { it.first }.filter { it !in classMethodsIds }.sorted())
            if (methodId == curMethodId) {
                if (!alreadyAdded) {
                    manyBaseMethodsImplementations.add(baseMethodsMap[methodId]!!)
                    alreadyAdded = true
                }
            }
            else {
                curMethodId = methodId
                alreadyAdded = false
            }

        for (method in manyBaseMethodsImplementations) {
            genObjCFunction(out, method.function, OverrideQualifier.override,
                            signature = makeFunSignature(method.function, hashSetOf(), hashSetOf()))
            out.println()
        }
    }

    // the method id which is used to detect necessity of "override" keyword according to kotlin's rules
    private fun getFunctionUniqueOverrideId(func: NativeIndex.Function) =
            func.name +
            func.parameterList
                .map { parseType(it.type, options, LexicalScope.General).name }
                .joinToString(",","(",")")

    private fun getAllBaseMethods(klass: NativeIndex.ObjCClass, allClasses: Map<String, NativeIndex.ObjCClass>,
                                  allCategories: HashMap<String, NativeIndex.ObjCCategory>)
            : Collection<Pair<String, NativeIndex.ObjCMethod>> {

        val res = arrayListOf<Pair<String, NativeIndex.ObjCMethod>>()
        if (klass.hasBaseClass()) {
            val baseClass = allClasses[klass.baseClass]
            if (baseClass != null) {
                res.addAll(baseClass.methodList
                        .filter { it.function.name !in skipMethodsNames }
                        .map { Pair(getFunctionUniqueOverrideId(it.function), it) })
                res.addAll(getAllBaseMethods(baseClass, allClasses, allCategories))
            }
        }
        for (catName in klass.categoryList) {
            val cat = allCategories[catName]
            if (cat != null) {
                res.addAll(cat.methodList
                        .filter { it.function.name !in skipMethodsNames }
                        .map { Pair(getFunctionUniqueOverrideId(it.function), it) })
            }
        }
        return res
    }

    private fun genObjCFunction(out: Printer, function: NativeIndex.Function, qualifier: OverrideQualifier = OverrideQualifier.none, signature: String? = null) {

        val returnType = parseType(function.returnType, options, LexicalScope.General)
        val isUnit = (returnType == UnitType)
        out.println("${
            when (qualifier) {
                OverrideQualifier.open -> "public open "
                OverrideQualifier.override -> "override "
                else -> ""
            }}${signature ?: makeFunSignature(function, hashSetOf(), hashSetOf())}${
            if (isUnit) " {" else " ="}")

        val params = function.parameterList
                             .mapIndexed { i, p -> namer.parameterName( p.name, i) }
        out.pushoneln("Native.objc_msgSend(\"${returnTypeReflectString(returnType)}\", this, \"${function.name}\"${
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
            is FunctionType -> "class kotlin.Function${type.paramTypes.size}"
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
                    listOf(klass.baseClass + ".metaclass")
                else listOf("IObjCObject")) +
                klass.protocolList.map { namer.protocolName(it) + ".metaclass" } +
                klass.categoryList.filter { allCategories.containsKey(it) }.map { namer.categoryName(it) + ".metaclass" }

        out.println("trait metaclass : ${baseList.joinToString(", ")} {")
        out.push()

        genMethods(out, methods, baseMethods)

        out.pop()
        out.println("}")
    }

    private fun genClassObject(out: Printer, klass: NativeIndex.ObjCClass) {
        // TODO (!): there may be other hierarchy roots!
        out.println("companion object : NSObject(Native.objc_getClass(\"${klass.name}\")), metaclass, ObjCClass {")
        // TODO: only generate this into companion objects of root classes
           .pushoneln("init { loadLibrary(interopConfig.nativeLibraryPath) }")
           .println("}")
    }
}
