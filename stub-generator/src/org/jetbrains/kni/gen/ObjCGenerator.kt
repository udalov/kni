
package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.NativeIndex
import java.io.File


class ObjCGenerator( targetPath: String, namer: Namer, nativeLib: File, options: GeneratorOptions)
    : GeneratorBase(targetPath, namer, nativeLib, options) {

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

        for (klass in translationUnit.getClass_List()) {
            genClass(klass, classes)
        }

        for (category in translationUnit.getCategoryList()) {
            genCategory(category)
        }
    }

    fun genProtocol(protocol: NativeIndex.ObjCProtocol) {
        val out = getOutput(protocol.getLocationFile())
        out.println("trait ${namer.protocolName(protocol.getName())} {")
           .push()
            // TODO: methods
           .println("trait metaclass")
           .pop()
           .println("}")
           .ln()
    }

    fun genCategory(category: NativeIndex.ObjCCategory) {
        val out = getOutput(category.getLocationFile())
        out.println("trait ${namer.categoryName(category.getName())}")
        // TODO: methods
    }

    fun genClass(klass: NativeIndex.ObjCClass, classes: Map<String, NativeIndex.ObjCClass>) {
        val out = getOutput(klass.getLocationFile())

        out.print("public open class ${klass.getName()}(pointer: Long)")

        val baseClassName =
                if (klass.hasBaseClass()) klass.getBaseClass()
                else "ObjCObject"
        val protocols = klass.getProtocolList()
        val categories = klass.getCategoryList()

        val baseList =
                listOf("$baseClassName(pointer)") +
                protocols.map { namer.protocolName(it) } +
                categories.map { namer.categoryName(it) }

        baseList.joinTo(out, separator = ", ", prefix = " : ")
        out.println(" {")

        out.push()

        // -[NSObject finalize] conflicts with java.lang.Object.finalize
        // TODO: unhardcode
        val methods = klass.getMethodList().filter { it.getFunction().getName() != "finalize" }

        val baseMethodsOverrideIds = getAllBaseMethodsOverrideIds(klass, classes, false).toSortedSet()

        for (method in methods.filter { !it.getClassMethod() }) {
            val overrideId = getFunctionUniqueOverrideId(method.getFunction())
            genObjCFunction(out,
                            method.getFunction(),
                            qualifier = if (overrideId in baseMethodsOverrideIds) OverrideQualifier.override else OverrideQualifier.open,
                            signature = makeFunSignature(method.getFunction(), hashSetOf(), hashSetOf()))
            out.println()
        }

        genMetaClass(out, klass, methods, classes)
        out.println()
        genClassObject(out, klass)

        // TODO: properties

        out.pop()

        out.println("}").ln()
    }

    // the method id which is used to detect necessity of "override" keyword according to kotlin's rules
    private fun getFunctionUniqueOverrideId(func: NativeIndex.Function) =
            func.getName() +
            func.getParameterList()
                    .map { parseType(it.getType(), options, LexicalScope.General).name }
                    .joinToString(",","(",")")

    private fun getAllBaseMethodsOverrideIds(klass: NativeIndex.ObjCClass, classes: Map<String, NativeIndex.ObjCClass>, classMethods: Boolean): Collection<String> {
        if (klass.hasBaseClass()) {
            val baseClass = classes.get(klass.getBaseClass())
            if (baseClass != null)
                return baseClass.getMethodList()
                               .filter { it.getFunction().getName() != "finalize" && (classMethods xor !it.getClassMethod()) }
                               .map { getFunctionUniqueOverrideId(it.getFunction()) } +
                       getAllBaseMethodsOverrideIds(baseClass, classes, classMethods)
        }
        return listOf()
    }

    private fun genObjCFunction(out: Printer, function: NativeIndex.Function, qualifier: OverrideQualifier = OverrideQualifier.none, signature: String? = null) {
        when (qualifier) {
            OverrideQualifier.open -> out.print("public open ")
            OverrideQualifier.override -> out.print("override ")
        }
        out.print(signature ?: makeFunSignature(function, hashSetOf(), hashSetOf()))
        val returnType = parseType(function.getReturnType(), options, LexicalScope.General)
        out.println(" {")

        out.push()
        if (returnType != UnitType) {
            out.print("return ")
        }
        out.print("Native.objc_msgSend(\"${returnTypeReflectString(returnType)}\", this, \"${function.getName()}\"")
        function.getParameterList()
                .mapIndexed { i, p -> namer.parameterName( p.getName(), i) }
                .let {
                    if (it.isNotEmpty()) {
                        out.print(", ")
                        it.joinTo(out, separator = ", ")
                    }
                }
        out.print(")")
        if (returnType != UnitType && returnType.getExpr() != "Any") {
            out.print(" as ${returnType.getExpr()}")
        }
        out.println()
        out.pop()

        out.println("}")
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

    private fun genMetaClass(out: Printer, klass: NativeIndex.ObjCClass, methods: List<NativeIndex.ObjCMethod>, classes: Map<String, NativeIndex.ObjCClass>) {
        val baseMethodsOverrideIds = getAllBaseMethodsOverrideIds(klass, classes, true).toHashSet()
        val baseList =
                (if (klass.hasBaseClass())
                    listOf(klass.getBaseClass() + ".metaclass")
                else listOf("ObjCObject")) +
                klass.getProtocolList().map { namer.protocolName(it) + ".metaclass" }
        out.println("trait metaclass : ${baseList.join(", ")} {")
        out.push()

        var first = true
        for (method in methods.filter { it.getClassMethod() }) {
            if (first) first = false else out.println()
            val overrideId = getFunctionUniqueOverrideId(method.getFunction())
            genObjCFunction(out,
                            method.getFunction(),
                            qualifier = if (overrideId in baseMethodsOverrideIds) OverrideQualifier.override else OverrideQualifier.open,
                            signature = makeFunSignature(method.getFunction(), hashSetOf(), hashSetOf())
            )
        }

        out.pop()
        out.println("}")
    }

    private fun genClassObject(out: Printer, klass: NativeIndex.ObjCClass) {
        // TODO (!): there may be other hierarchy roots!
        out.println("companion object : NSObject(Native.objc_getClass(\"${klass.getName()}\")), metaclass, ObjCClass {")
        out.push()

        // TODO: only generate this into class objects of root classes
        out.println("init { loadLibrary(interopConfig.nativeLibraryPath) }")

        out.pop()
        out.println("}")
    }
}
