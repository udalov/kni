package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.NativeIndex
import org.jetbrains.kotlin.renderer.KeywordStringsGenerated
import java.io.File
import java.io.FileWriter
import java.nio.file.Paths
import java.util.HashMap

abstract class GeneratorBase(
                    val targetPath: String,
                    val namer: Namer,
                    val nativeLib: File,
                    val options: GeneratorOptions) {

    data class FilePrinter(targetPath: String, file_name: String) {
        val file: File = File(targetPath, file_name)
        val fileWriter: FileWriter = FileWriter(file)
        val printer: Printer = Printer(fileWriter)
    }

    val outputs: HashMap<String, FilePrinter> = hashMapOf()

    fun getOutput(sourceFile: String): Printer =
            outputs.getOrPut(namer.targetFileName(sourceFile), {
                val fp = FilePrinter(targetPath, namer.targetFileName(sourceFile))
                startFile(fp.printer, sourceFile)
                fp
            }).printer

    fun closeOutputs() : Collection<File> {
        outputs.forEach { it.getValue().fileWriter.close() }
        val res = outputs.map { it.getValue().file }.toArrayList()
        outputs.clear()
        return res
    }

    open fun startFile(out: Printer, sourceFile: String) {
        out.println("// generated from \"$sourceFile\"").ln()
        out.println("[file: suppress(\"UNCHECKED_CAST\")]").ln()
        genPackage(out, sourceFile)
    }

    fun genInteropConfig(out: Printer) {
        out.println("object interopConfig {")
           .pushoneln("public var nativeLibraryPath: String = \"${nativeLib.getPath()}\"")
           .println("}")
           .ln()
    }

    fun genPackage(out: Printer, sourceFile: String) {
        out.println("package ${namer.packageName(sourceFile)}").ln()
    }

    public fun makeFunSignature(function: NativeIndex.Function, funcParams: Set<FunctionType> = setOf(), ifaceTypes: Set<Type> = setOf(), extPrefix: String = ""): String {

        val typeMapper = { t: Type ->
            if (t is FunctionType && t in funcParams) makePrefixed(SimpleType(namer.funcProxyName(t.name)), extPrefix)
            else if (t in ifaceTypes) makePrefixed(t, extPrefix)
            // assuming those - externs
            // \todo - doublecheck
            else if (t is RecordType && t !in ifaceTypes) JNROpaquePointer
            else t }

        val returnType = parseType(function.getReturnType(), options, LexicalScope.General)

        val paramNames = hashSetOf<String>()

        // in ObjC it is possible to have parameters with the same name
        // \todo find out whether it is possible to name params by appropriate selector part
        fun makeParamName(p: NativeIndex.Function.Parameter, idx: Int) : String {
            var name = namer.parameterName(p.getName(), idx)
            return if (paramNames.add(name)) name else "${name}_$idx"
        }

        return "fun $extPrefix${if (options.runtime == InteropRuntime.ObjC) namer.objCMethodName(function) else namer.cFunctionName(function)}" +
            function.getParameterList()
                    .mapIndexed { i, p -> makeParamName(p, i) + ": " + typeMapper(parseType(p.getType(), options, LexicalScope.General)).getExpr(typeMapper) }
                    .joinToString(separator = ", ", prefix = "(", postfix = ")") +
            ": ${typeMapper(returnType).getExpr()}"
    }

    open fun generate(translationUnit: NativeIndex.TranslationUnit) {
        val out = getOutput(translationUnit.getName())
        genInteropConfig(out)
    }
}


class Namer(translationUnit: NativeIndex.TranslationUnit, outputFile: File, val basePackageName: String = "") {
    private val protocolNames = HashMap<String, String>()
    val name = translationUnit.getName()
    val shortName = File(name).getName().substringBefore(".")
    val multifile = outputFile.isDirectory()
    val mainOutputFile = if (multifile) "${shortName}.kt" else outputFile.getName()

    // TODO: all Kotlin keywords
    val reservedWords = setOf("class", "object", "fun", "in", "as", "null", "trait", "val")
    val invalidIdChars = setOf('<', '>', '*')

    private fun calculateProtocolNames(translationUnit: NativeIndex.TranslationUnit) {
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

    fun cFunctionName(func: NativeIndex.Function): String = escape(func.getName())

    fun objCMethodName(func: NativeIndex.Function): String {
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

    fun targetFileName(source_file: String): String =
        // \todo consider separating same names from different source dirs (for now it is not too important though)
        if (!multifile || source_file.length() == 0|| source_file == name) mainOutputFile
        else File(source_file).getName().substringBeforeLast(".") + ".kt"

    fun packageName(sourceFile: String): String = if (basePackageName.length() == 0) shortName else basePackageName
}