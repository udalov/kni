package org.jetbrains.kni.gen

import java.io.File
import org.jetbrains.kni.indexer.NativeIndex.*
import java.util.HashMap
import java.nio.file.Paths
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language.*
import org.jetbrains.kotlin.renderer.KeywordStringsGenerated
import java.util.ArrayList
import java.util.HashSet

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

enum class OverrideQualifier {
    none
    `open`
    `override`
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

        // preparing list of all classes methods signatures for finding overrides
        val classes = hashMapOf<String, ObjCClass>()
        translationUnit.getClass_List().forEach { classes.put(it.getName(), it) }

        for (klass in translationUnit.getClass_List()) {
            genClass(klass, classes)
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
            if (t is FunctionType && t in funcParams) makePrefixed(SimpleType(namer.funcProxyName(t.name)), extPrefix)
            else if (t in ifaceTypes) makePrefixed(t, extPrefix)
            // assuming those - externs
            // \todo - doublecheck
            else if (t is RecordType && t !in ifaceTypes) JNROpaquePointer
            else t }

        fun mapParam(idx: Int, p: Function.Parameter): String {
            val type = parseType(p.getType(), options, LexicalScope.General)
            val name = namer.parameterName(p.getName(), idx)
            if (type is FunctionType && type in funcParams)
                return "object : ${namer.cFunctionsInterfaceName()}.${namer.funcProxyName(type.name)} { override ${proxyInvokeSignature(type, typeMapper)} = $name(${funcTypeParamsList(type, false, {it})})}"
            else
                return name
        }

        translationUnit.getFunctionList()
                .filter {
                    it.getParameterList()
                            .map { parseType(it.getType(), options, LexicalScope.General) }
                            .any { it is FunctionType && it in funcParams }
                }
                .forEach {
                    out.print("public ")
                    out.print( makeFunSignature(it, hashSetOf(), ifaceTypes, extPrefix))
                    out.println(" = ")
                    out.push()
                    out.print(namer.cFunctionName(it))
                    it.getParameterList()
                            .mapIndexed { i, p -> mapParam(i, p) }
                            .joinTo(out, separator = ", ", prefix = "(", postfix = ")")
                    out.pop()
                    out.println()
                }
    }

    // the method id which is used to detect necessity of "override" keyword according to kotlin's rules
    private fun getFunctionUniqueOverrideId(func: Function) =
        func.getName() +
        func.getParameterList()
                .map { parseType(it.getType(), options, LexicalScope.General).name }
                .joinToString(",","(",")")

    private fun getAllBaseMethodsOverrideIds(klass: ObjCClass, classes: Map<String, ObjCClass>, classMethods: Boolean): Collection<String> {
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

    fun genClass(klass: ObjCClass, classes: Map<String, ObjCClass>) {

        out.print("open class ${klass.getName()}(pointer: Long)")

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
            genObjCFunction(method.getFunction(),
                            qualifier = if (overrideId in baseMethodsOverrideIds) OverrideQualifier.`override` else OverrideQualifier.`open`,
                            signature = makeFunSignature(method.getFunction(), hashSetOf(), hashSetOf()))
            out.println()
        }

        genMetaClass(klass, methods, classes)
        out.println()
        genClassObject(klass)

        // TODO: properties

        out.pop()

        out.println("}")
    }

    private fun genMetaClass(klass: ObjCClass, methods: List<ObjCMethod>, classes: Map<String, ObjCClass>) {
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
            genObjCFunction(method.getFunction(),
                            qualifier = if (overrideId in baseMethodsOverrideIds) OverrideQualifier.`override` else OverrideQualifier.`open`,
                            signature = makeFunSignature(method.getFunction(), hashSetOf(), hashSetOf())
                            )
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
            out.println( makeFunSignature(function, funcTypes, ifaceTypes))
        }
    }

    fun genCStruct(struct: CStruct, funcTypes: Set<FunctionType>, ifaceTypes: Set<Type>): RecordType {

        val typeMapper = { (t: Type) ->
            if (t is FunctionType && t in funcTypes) JNRStructFunctionType(namer.funcProxyName(t.name))
            // assuming those - externs, and that structs are defined and processed in a correct order
            // \todo - doublecheck
            // \todo - support forward defs
            else if ((t is RecordType && t !in ifaceTypes) ||
                     (t is JNRStructPointerType && t.pointee is RecordType && t.pointee !in ifaceTypes)) JNRStructPointerType()
            else t }

        out.println("public class ${struct.getName()}(runtime: jnr.ffi.Runtime) : jnr.ffi.Struct(runtime) {")
        out.push()
        for (field in struct.getFieldList()) {
            val t = typeMapper(parseType(field.getType(), options, LexicalScope.Record))
            // workaround for KT-7051
            // \todo remove then fixed
            if (t is JNRStructFunctionType)
                out.println("[suppress(\"INVISIBLE_MEMBER\", \"INVISIBLE_REFERENCE\")]")
            out.println("public var ${field.getName()}: ${t.getExpr(typeMapper)} = ${t.defaultVal}")
        }
        out.pop()
        out.println("}")
        return RecordType(struct.getName())
    }

    private fun genObjCFunction(function: Function, qualifier: OverrideQualifier = OverrideQualifier.none, signature: String? = null) {
        when (qualifier) {
            OverrideQualifier.`open` -> out.print("open ")
            OverrideQualifier.`override` -> out.print("override ")
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

    public fun makeFunSignature(function: Function, funcParams: Set<FunctionType> = setOf(), ifaceTypes: Set<Type> = setOf(), extPrefix: String = ""): String {

        val typeMapper = { (t: Type) ->
            if (t is FunctionType && t in funcParams) makePrefixed(SimpleType(namer.funcProxyName(t.name)), extPrefix)
            else if (t in ifaceTypes) makePrefixed(t, extPrefix)
            // assuming those - externs
            // \todo - doublecheck
            else if (t is RecordType && t !in ifaceTypes) JNROpaquePointer
            else t }

        val returnType = parseType(function.getReturnType(), options, LexicalScope.General)

        return "fun $extPrefix${if (options.runtime == InteropRuntime.ObjC) namer.objCMethodName(function) else namer.cFunctionName(function)}" +
            function.getParameterList()
                    .mapIndexed { i, p -> namer.parameterName(p.getName(), i) + ": " + typeMapper(parseType(p.getType(), options, LexicalScope.General)).getExpr(typeMapper) }
                    .joinToString(separator = ", ", prefix = "(", postfix = ")") +
            ": ${typeMapper(returnType).getExpr()}"
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
    val reservedWords = setOf("class", "object", "fun", "in", "as", "null", "trait", "val")
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

    fun cFunctionName(func: Function): String = escape(func.getName())

    fun objCMethodName(func: Function): String {
        // Objective-C method names are usually of form 'methodName:withParam:andOtherParam:'
        // The scheme should be preserved to avoid ambiguities
        // Here we replace ':' with '_', which may lead to name conflicts as well
        // \todo consider better (re)naming scheme
        return escape(func.getName().replaceAll(":+$","").replace(':', '_'))
    }

    fun parameterName(name: String, idx: Int): String {
        val n = escape(name)
        return if (n.isEmpty()) "_$idx" else n
    }

    fun funcProxyName(name: String): String = escape("fn_$name")

    private fun escape(name: String): String {
        val fname: String = name.filter { it !in invalidIdChars };
        return when (fname) {
            in KeywordStringsGenerated.KEYWORDS -> "`$fname`"
            else -> fname
        }
    }
}
