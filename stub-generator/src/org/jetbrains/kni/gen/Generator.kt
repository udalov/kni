package org.jetbrains.kni.gen

import java.io.File
import org.jetbrains.kni.indexer.NativeIndex.*
import java.util.HashMap
import java.nio.file.Paths
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language.*
import java.util.ArrayList

public enum class InteropRuntime {
    ObjC
    JNR
}

public enum class LexicalScope {
    General
    Record
}

public enum class CharStringType {
    Ascii
    Utf8
}

public class GeneratorOptions(
        public val runtime: InteropRuntime,
        public val charStringType: CharStringType = CharStringType.Ascii
) {}

public fun generateStub(translationUnit: TranslationUnit,
                        dylib: File,
                        outputFile: File,
                        indexingOptions: IndexerOptions,
                        generatorOptions: GeneratorOptions
): File {
    val result = StringBuilder()
    val out = Printer(result)

    out.println("// This file is auto-generated. DO NOT EDIT!")
    out.println()
    out.println("[file: suppress(\"UNCHECKED_CAST\")]")
    out.println()

    val namer = Namer(translationUnit)
    val generator = Generator(out, namer, dylib, generatorOptions)

    when (indexingOptions.language) {
        OBJC -> generator.genObjCUnit(translationUnit)
        CPP -> generator.genCppUnit(translationUnit)
        else -> error("Unknown language: ${indexingOptions.language}")
    }

    outputFile.getParentFile().mkdirs()
    outputFile.writeText(result.toString())
    return outputFile
}

class Generator(private val out: Printer,
                private val namer: Namer,
                private val dylib: File,
                private val options: GeneratorOptions) {

    public fun genObjCUnit(translationUnit: TranslationUnit) {
        out.println("package objc")
        out.println()
        out.println("import kni.objc.*")
        out.println()
        for (protocol in translationUnit.getProtocolList()) {
            genProtocol(protocol)
            out.println()
        }

        for (klass in translationUnit.getClass_List()) {
            genClass(klass)
            out.println()
        }

        for (category in translationUnit.getCategoryList()) {
            genCategory(category)
            out.println()
        }
    }

    public fun genCppUnit(translationUnit: TranslationUnit) {
        out.println("package native")
        out.println()
        out.println("import jnr.ffi.types.*")
        out.println("import jnr.ffi.Pointer")
        out.println()
        val funcParams =
                (translationUnit.getFunctionList()
                    .flatMap { it.getParameterList().map { parseType(it.getType(), options, LexicalScope.General) }}
                 +
                 translationUnit.getStructList()
                     .flatMap { it.getFieldList().map { parseType(it.getType(), options, LexicalScope.General) }}
                )
                .filter { it is FunctionType }
                .map { it as FunctionType }
                .distinct()
        out.println("\npublic trait ${namer.cFunctionsInterfaceName()} {")
        out.push()
        genFuncProxies(funcParams)
        out.println()
        val structs = hashSetOf<Type>()
        for (it in translationUnit.getStructList())
            // \todo support forward defs
            structs.add( genCStruct(it, funcParams, structs))
        out.println()
        genCFunctions(translationUnit.getFunctionList().distinct(), funcParams, structs)
        out.pop()
        out.println("}")
        out.println()
        // generate extension methods that accept directly kotlin lambdas
        genCFunctionExts(translationUnit, funcParams, (structs.map { it as Type } + funcParams).toHashSet(), "${namer.cFunctionsInterfaceName()}.")
        out.println("\npublic fun get_${namer.cFunctionsInterfaceName()}(libName: String): ${namer.cFunctionsInterfaceName()} = jnr.ffi.LibraryLoader.create(javaClass<${namer.cFunctionsInterfaceName()}>()).load(libName)\n")
    }

    private fun genCFunctionExts(translationUnit: TranslationUnit, funcParams: Set<FunctionType>, ifaceTypes: Set<Type>, extPrefix: String) {

        // \todo coded duplication in makeFunSignature
        val typeMapper = { (t: Type) ->
            if (t is FunctionType && funcParams.contains(t)) makePrefixed(SimpleType(namer.funcProxyName(t.name)), extPrefix)
            else if (ifaceTypes.contains(t)) makePrefixed(t, extPrefix)
            // assuming those - externs
            // \todo - doublecheck
            else if (t is RecordType && !ifaceTypes.contains(t)) JNROpaquePointer
            else t }

        fun mapParam(idx: Int, p: Function.Parameter): String {
            val type = parseType(p.getType(), options, LexicalScope.General)
            val name = namer.parameterName(p.getName(), idx)
            if (type is FunctionType && funcParams.contains(type))
                return "object : ${namer.cFunctionsInterfaceName()}.${namer.funcProxyName(type.name)} { override ${proxyInvokeSignature(type, typeMapper)} = $name(${funcTypeParamsList(type, false, {it})})}"
            else
                return name
        }

        translationUnit.getFunctionList()
                .filter {
                    it.getParameterList()
                            .map { parseType(it.getType(), options, LexicalScope.General) }
                            .any { it is FunctionType && funcParams.contains(it) }
                }
                .forEach {
                    out.print("public ")
                    makeFunSignature(it, hashSetOf(), ifaceTypes, extPrefix)
                    out.println(" = ")
                    out.push()
                    out.print(namer.methodName(it.getName()))
                    it.getParameterList()
                            .mapIndexed { i, p -> mapParam(i, p) }
                            .joinTo(out, separator = ", ", prefix = "(", postfix = ")")
                    out.pop()
                    out.println()
                }
    }

    fun genClass(klass: ObjCClass) {
        out.print("open class ${klass.getName()}(pointer: Long)")

        val baseClass =
                if (klass.hasBaseClass()) klass.getBaseClass()
                else "ObjCObject"
        val protocols = klass.getProtocolList()
        val categories = klass.getCategoryList()

        val baseList =
            listOf("$baseClass(pointer)") +
            protocols.map { namer.protocolName(it) } +
            categories.map { namer.categoryName(it) }

        baseList.joinTo(out, separator = ", ", prefix = " : ")
        out.println(" {")

        out.push()

        // -[NSObject finalize] conflicts with java.lang.Object.finalize
        // TODO: unhardcode
        val methods = klass.getMethodList().filter { it.getFunction().getName() != "finalize" }

        for (method in methods.filter { !it.getClassMethod() }) {
            genObjCFunction(method.getFunction(), open = true)
            out.println()
        }

        genMetaClass(klass, methods)
        out.println()
        genClassObject(klass)

        // TODO: properties

        out.pop()

        out.println("}")
    }

    private fun genMetaClass(klass: ObjCClass, methods: List<ObjCMethod>) {
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
            genObjCFunction(method.getFunction(), open = false)
        }

        out.pop()
        out.println("}")
    }

    private fun genClassObject(klass: ObjCClass) {
        // TODO (!): there may be other hierarchy roots!
        out.println("class object : NSObject(Native.objc_getClass(\"${klass.getName()}\")), metaclass, ObjCClass {")
        out.push()

        // TODO: only generate this into class objects of root classes
        out.println("{ loadLibrary(\"${dylib.getPath()}\") }")

        out.pop()
        out.println("}")
    }

    fun genProtocol(protocol: ObjCProtocol) {
        out.println("trait ${namer.protocolName(protocol.getName())} {")
        out.push()
        // TODO: methods
        out.println("trait metaclass")
        out.pop()
        out.println("}")
    }

    fun genCategory(category: ObjCCategory) {
        out.println("trait ${namer.categoryName(category.getName())}")
        // TODO: methods
    }

    fun genCFunctions(functions: Iterable<Function>, funcTypes: Set<FunctionType>, ifaceTypes: Set<Type>) {
        for (function in functions) {
            makeFunSignature(function, funcTypes, ifaceTypes)
            out.println()
        }
    }

    fun genCStruct(struct: CStruct, funcTypes: Set<FunctionType>, ifaceTypes: Set<Type>): RecordType {

        val typeMapper = { (t: Type) ->
            if (t is FunctionType && funcTypes.contains(t)) JNRStructFunctionType(namer.funcProxyName(t.name))
            // assuming those - externs, and that structs are defined and processed in a correct order
            // \todo - doublecheck
            // \todo - support forward defs
            else if ((t is RecordType && !ifaceTypes.contains(t)) ||
                     (t is JNRStructPointerType && t.pointee is RecordType && !ifaceTypes.contains(t.pointee))) JNRStructPointerType()
            else t }

        out.println("public class ${struct.getName()}(runtime: jnr.ffi.Runtime) : jnr.ffi.Struct(runtime) {")
        out.push()
        for (field in struct.getFieldList()) {
            val t = typeMapper(parseType(field.getType(), options, LexicalScope.Record))
            out.println("public var ${field.getName()}: ${t.getExpr(typeMapper)} = ${t.defaultVal}")
        }
        out.pop()
        out.println("}")
        return RecordType(struct.getName())
    }

    private fun genObjCFunction(function: Function, open: Boolean) {
        if (open) {
            out.print("open ")
        }
        val returnType = makeFunSignature(function, hashSetOf(), hashSetOf())
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

    public fun makeFunSignature(function: Function, funcParams: Set<FunctionType>, ifaceTypes: Set<Type>, extPrefix: String = ""): Type {

        val typeMapper = { (t: Type) ->
            if (t is FunctionType && funcParams.contains(t)) makePrefixed(SimpleType(namer.funcProxyName(t.name)), extPrefix)
            else if (ifaceTypes.contains(t)) makePrefixed(t, extPrefix)
            // assuming those - externs
            // \todo - doublecheck
            else if (t is RecordType && !ifaceTypes.contains(t)) JNROpaquePointer
            else t }

        out.print("fun $extPrefix${namer.methodName(function.getName())}")

        function.getParameterList()
                .mapIndexed { i, p -> namer.parameterName(p.getName(), i) + ": " + typeMapper(parseType(p.getType(), options, LexicalScope.General)).getExpr(typeMapper) }
                .joinTo(out, separator = ", ", prefix = "(", postfix = ")")

        val returnType = parseType(function.getReturnType(), options, LexicalScope.General)
//        if (returnType != UnitType) {
            out.print(": ${typeMapper(returnType).getExpr()}")
//        }
        return returnType
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

    private fun funcTypeParamsList(fn: FunctionType, withTypes: Boolean, typeMapper: (Type) -> Type): String =
        fn.paramTypes
                .mapIndexed { i, p -> namer.parameterName("p${i+1}", i) + if (withTypes) ": ${typeMapper(p).getExpr(typeMapper)}" else "" }
                .joinToString(separator = ", ")

    private fun proxyInvokeSignature(fn: FunctionType, typeMapper: (Type) -> Type = {it}): String =
            "fun invoke(${funcTypeParamsList(fn, true, typeMapper)}): ${fn.returnType.getExpr(typeMapper)}"

    public fun genFuncProxies(funcs: Set<FunctionType>) {
        if (options.runtime == InteropRuntime.JNR)
            for (fn in funcs) {
                out.println("public trait ${namer.funcProxyName(fn.name)} {")
                out.push()
                out.println("jnr.ffi.annotations.Delegate")
                out.println("public ${proxyInvokeSignature(fn)}")
                out.pop()
                out.println("}")
                out.println()
            }
    }
}

class Namer(translationUnit: TranslationUnit) {
    private val protocolNames = HashMap<String, String>()
    val name = translationUnit.getName()

    // TODO: all Kotlin keywords
    val reservedWords = setOf("class", "object", "fun", "in")
    val invalidIdChars = setOf('<', '>', '*')

    private fun calculateProtocolNames(translationUnit: TranslationUnit) {
        val existingNames = translationUnit.getClass_List().map { it.getName() }.toMutableSet()

        for (protocol in translationUnit.getProtocolList()) {
            val protocolName = protocol.getName()
            var name = protocolName
            if (name in existingNames) {
                // Since Objective-C classes and protocols exist in different namespaces and Kotlin classes and traits
                // don't, we invent a new name here for the trait when a class with the same name exists already
                // TODO: handle collisions (where both classes X and XProtocol and a protocol X exist)
                name = protocolName + "Protocol"
            }

            protocolNames[protocolName] = name
            existingNames.add(name)
        }
    }

    {
        calculateProtocolNames(translationUnit)
    }

    fun cFunctionsInterfaceName(): String {
        val p = Paths.get(name)
        return "iface_${p.getFileName().toString().replaceAll("\\.","_")}"
    }

    fun protocolName(name: String): String {
        return protocolNames[name]
    }

    fun categoryName(name: String): String {
        // ASM verifier incorrectly requires names to be Java identifiers, see CheckMethodAdapter.checkInternalName
        // TODO: fix ASM
        return name.replace('+', '_')
    }

    fun methodName(objcSelectorName: String): String {
        // Objective-C method names are usually of form 'methodName:withParam:andOtherParam:'
        // Here we strip away everything but the first part
        // TODO: handle methods with the same effective signature or invent something different
        return escape(objcSelectorName.substringBefore(':'))
    }

    fun parameterName(name: String, idx: Int): String {
        val n = escape(name)
        return if (n.isEmpty()) "_$idx" else n
    }

    fun funcProxyName(name: String): String = escape("fn_$name")

    private fun escape(name: String): String {
        val fname: String = name.filter { !invalidIdChars.contains(it) };
        return when (fname) {
            in reservedWords -> "`$fname`"
            else -> fname
        }
    }
}
