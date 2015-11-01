package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.NativeIndex
import java.io.File
import java.io.FileWriter
import java.nio.file.Paths
import java.util.*
import kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated

abstract class GeneratorBase(
        val targetPath: String,
        val namer: Namer,
        val nativeLib: File,
        val options: GeneratorOptions
) {
    class FilePrinter(targetPath: String, fileName: String) {
        val file: File = File(targetPath, fileName)
        val fileWriter: FileWriter = FileWriter(file)
        val printer: Printer = Printer(fileWriter)
    }

    val outputs: HashMap<String, FilePrinter> = hashMapOf()

    fun getOutput(sourceFile: String): Printer =
            outputs.getOrPut(namer.targetFileName(sourceFile).toLowerCase(), {
                val fp = FilePrinter(targetPath, namer.targetFileName(sourceFile))
                startFile(fp.printer, sourceFile)
                fp
            }).printer

    fun closeOutputs() : Collection<File> {
        outputs.forEach { it.value.fileWriter.close() }
        val res = outputs.map { it.value.file }.toArrayList()
        outputs.clear()
        return res
    }

    open fun startFile(out: Printer, sourceFile: String) {
        out.println("// generated from \"$sourceFile\"").ln()
        out.println("[file: suppress(\"UNCHECKED_CAST\")]").ln()
        genPackage(out)
    }

    fun genInteropConfig(out: Printer) {
        out.println("object interopConfig {")
           .pushoneln("public var nativeLibraryPath: String = \"${nativeLib.path}\"")
           .println("}")
    }

    fun genPackage(out: Printer) {
        out.println("package ${namer.packageName()}").ln()
    }

    fun makeFunSignature(
            function: NativeIndex.Function,
            funcParams: Set<FunctionType> = setOf(),
            ifaceTypes: Set<Type> = setOf(),
            extPrefix: String = ""
    ): String {
        val typeMapper = { t: Type ->
            when {
                t is FunctionType && t in funcParams -> makePrefixed(SimpleType(namer.funcProxyName(t.name)), extPrefix)
                t in ifaceTypes -> makePrefixed(t, extPrefix)
                // assuming those - externs
                // \todo - doublecheck
                t is RecordType && t !in ifaceTypes -> JNROpaquePointer
                else -> t
            }
        }

        val returnType = parseType(function.returnType, options, LexicalScope.General)

        val paramNames = hashSetOf<String>()

        // in ObjC it is possible to have parameters with the same name
        // \todo find out whether it is possible to name params by appropriate selector part
        fun makeParamName(p: NativeIndex.Function.Parameter, idx: Int): String {
            var name = namer.parameterName(p.name, idx)
            return if (paramNames.add(name)) name else "${name}_$idx"
        }

        return "fun $extPrefix${if (options.runtime == InteropRuntime.ObjC) namer.objCMethodName(function) else namer.cFunctionName(function)}" +
                function.parameterList
                        .mapIndexed { i, p ->
                            makeParamName(p, i) + ": " + typeMapper(parseType(p.type, options, LexicalScope.General)).getExpr(typeMapper)
                        }
                        .joinToString(separator = ", ", prefix = "(", postfix = ")") +
                ": ${typeMapper(returnType).getExpr()}"
    }

    open fun generate(translationUnit: NativeIndex.TranslationUnit) {
        val out = getOutput(translationUnit.name)
        out.println()
        genInteropConfig(out)
    }
}


class Namer(translationUnit: NativeIndex.TranslationUnit, outputFile: File, val basePackageName: String = "") {
    private val protocolNames = HashMap<String, String>()
    val name = translationUnit.name
    val shortName = File(name).name.substringBefore(".")
    val multifile = outputFile.isDirectory
    val mainOutputFile = if (multifile) "$shortName.kt" else outputFile.name

    val invalidIdChars = setOf('<', '>', '*')

    private fun calculateProtocolNames(translationUnit: NativeIndex.TranslationUnit) {
        val existingNames = translationUnit.class_List.map { it.name }.toMutableSet()

        for (protocol in translationUnit.protocolList) {
            val protocolName = protocol.name
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

    init {
        calculateProtocolNames(translationUnit)
    }

    fun cFunctionsInterfaceName(): String {
        val p = Paths.get(name)
        return "iface_${p.fileName.toString().replace('.', '_')}"
    }

    fun protocolName(name: String): String {
        return protocolNames[name]!!
    }

    fun categoryName(name: String): String {
        // ASM verifier incorrectly requires names to be Java identifiers, see CheckMethodAdapter.checkInternalName
        // TODO: fix ASM
        return name.replace('+', '_')
    }

    fun cFunctionName(func: NativeIndex.Function): String = escape(func.name)

    fun objCMethodName(func: NativeIndex.Function): String {
        // Objective-C method names are usually of form 'methodName:withParam:andOtherParam:'
        // The scheme should be preserved to avoid ambiguities
        // Here we replace ':' with '_', which may lead to name conflicts as well
        // \todo consider better (re)naming scheme
        return escape(func.name.trimEnd(':').replace(':', '_'))
    }

    fun parameterName(name: String, idx: Int): String {
        val n = escape(name)
        return if (n.isEmpty()) "_$idx" else n
    }

    fun funcProxyName(name: String): String = escape("fn_$name")

    private fun escape(name: String): String {
        val filteredName = name.filter { it !in invalidIdChars }
        return when (filteredName) {
            in KeywordStringsGenerated.KEYWORDS -> "`$filteredName`"
            else -> filteredName
        }
    }

    fun targetFileName(sourceFile: String): String =
        // \todo consider separating same names from different source dirs (for now it is not too important though)
        if (!multifile || sourceFile.length == 0|| sourceFile == name) mainOutputFile
        else File(sourceFile).name.substringBeforeLast(".") + ".kt"

    fun packageName(): String = if (basePackageName.isEmpty()) shortName else basePackageName
}
