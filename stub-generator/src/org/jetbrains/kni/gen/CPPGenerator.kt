package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.NativeIndex
import java.io.File

class CPPGenerator( targetPath: String, namer: Namer, nativeLib: File, options: GeneratorOptions)
    : GeneratorBase(targetPath, namer, nativeLib, options) {

    override fun startFile(out: Printer, sourceFile: String) {
        super.startFile(out, sourceFile)
        out.println("import jnr.ffi.types.*")
           .println("import jnr.ffi.Pointer")
    }

    override fun generate(translationUnit: NativeIndex.TranslationUnit) {
        // \todo implement multifile output as for ObjC
        super.generate(translationUnit)
        val out = getOutput(translationUnit.getName())
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
        genFuncProxies(out, funcParams)
        out.println()
        val structs = hashSetOf<Type>()
        for (it in translationUnit.getStructList())
        // \todo support forward defs
            structs.add( genCStruct(out, it, funcParams, structs))
        out.println()
        genCFunctions(out, translationUnit.getFunctionList().distinct(), funcParams, structs)
        out.pop()
        out.println("}").ln()
        // generate extension methods that accept directly kotlin lambdas
        genCFunctionExts(out, translationUnit, funcParams, (structs.map { it as Type } + funcParams).toHashSet(), "${namer.cFunctionsInterfaceName()}.")
        out.println("\npublic fun get_${namer.cFunctionsInterfaceName()}(libName: String): ${namer.cFunctionsInterfaceName()} = jnr.ffi.LibraryLoader.create(javaClass<${namer.cFunctionsInterfaceName()}>()).load(libName)\n")
    }

    public fun genFuncProxies(out: Printer, funcs: Set<FunctionType>) {
        if (options.runtime == InteropRuntime.JNR)
            for (fn in funcs)
                out.println("public trait ${namer.funcProxyName(fn.name)} {")
                   .push()
                   .println("jnr.ffi.annotations.Delegate")
                   .println("public ${proxyInvokeSignature(fn)}")
                   .pop()
                   .println("}").ln()
    }

    private fun funcTypeParamsList(fn: FunctionType, withTypes: Boolean, typeMapper: (Type) -> Type): String =
        fn.paramTypes
                .mapIndexed { i, p -> namer.parameterName("p${i+1}", i) + if (withTypes) ": ${typeMapper(p).getExpr(typeMapper)}" else "" }
                .joinToString(separator = ", ")

    private fun proxyInvokeSignature(fn: FunctionType, typeMapper: (Type) -> Type = {it}): String =
        "fun invoke(${funcTypeParamsList(fn, true, typeMapper)}): ${fn.returnType.getExpr(typeMapper)}"

    fun genCStruct(out: Printer, struct: NativeIndex.CStruct, funcTypes: Set<FunctionType>, ifaceTypes: Set<Type>): RecordType {

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
        out.println("}").ln()
        return RecordType(struct.getName())
    }

    fun genCFunctions(out: Printer, functions: Iterable<NativeIndex.Function>, funcTypes: Set<FunctionType>, ifaceTypes: Set<Type>) {
        for (function in functions) {
            out.println( makeFunSignature(function, funcTypes, ifaceTypes))
        }
    }

    private fun genCFunctionExts(out: Printer,
                                 translationUnit: NativeIndex.TranslationUnit,
                                 funcParams: Set<FunctionType>,
                                 ifaceTypes: Set<Type>,
                                 extPrefix: String) {

        // \todo coded duplication in makeFunSignature
        val typeMapper = { (t: Type) ->
            if (t is FunctionType && t in funcParams) makePrefixed(SimpleType(namer.funcProxyName(t.name)), extPrefix)
            else if (t in ifaceTypes) makePrefixed(t, extPrefix)
            // assuming those - externs
            // \todo - doublecheck
            else if (t is RecordType && t !in ifaceTypes) JNROpaquePointer
            else t }

        fun mapParam(idx: Int, p: NativeIndex.Function.Parameter): String {
            val type = parseType(p.getType(), options, LexicalScope.General)
            val name = namer.parameterName(p.getName(), idx)
            return if (type is FunctionType && type in funcParams)
                "object : ${namer.cFunctionsInterfaceName()}.${namer.funcProxyName(type.name)} { override ${proxyInvokeSignature(type, typeMapper)} = $name(${funcTypeParamsList(type, false, { it })})}"
            else
                name
        }

        translationUnit.getFunctionList()
                .filter {
                    it.getParameterList()
                            .map { parseType(it.getType(), options, LexicalScope.General) }
                            .any { it is FunctionType && it in funcParams }
                }
                .forEach {
                    out.println("public ${makeFunSignature(it, hashSetOf(), ifaceTypes, extPrefix)} = ")
                       .pushoneln("${namer.cFunctionName(it)}${it.getParameterList()
                                                                 .mapIndexed { i, p -> mapParam(i, p) }
                                                                 .joinToString(separator = ", ", prefix = "(", postfix = ")")}")
                       .ln()
                }
    }
}
