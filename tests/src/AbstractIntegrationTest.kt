package org.jetbrains.kni.tests

import java.io.File
import java.nio.file.Files
import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.gen.generateStub
import org.junit.Assert
import kotlin.properties.Delegates
import java.nio.file.Paths
import kni.objc.loadLibrary
import org.jetbrains.kni.gen.InteropRuntime
import org.jetbrains.kni.gen.GeneratorOptions

abstract class AbstractIntegrationTest(val indexerOptions: IndexerOptions, val generatorOptions: GeneratorOptions) {

    abstract protected val kotlinLibs: List<File>

    fun diagSeverity(severity: Int) = when(severity) {
        0, 1 -> "Note"
        2 -> "Warning"
        3 -> "Error"
        4 -> "Fatal"
        else -> "Unknown"
    }

    protected fun makeStub(cHeader: File, nativeLib: File, target: File, tempDir: File, dumpIdx: Boolean = false): File {
        val stubSource = File(tempDir, target.getPath().substringAfterLast(File.separator))
        val translationUnit = buildNativeIndex(cHeader, indexerOptions)
        if (dumpIdx) {
            val srcIndex = File(tempDir, "idx")
            srcIndex.writeText(translationUnit.toString())
        }
        var hasErrors = false
        for (diag in translationUnit.getDiagnosticList())
            if (diag.getSeverity() > 1) {
                println("${diagSeverity(diag.getSeverity())} at (${diag.getLine()},${diag.getColumn()}: ${diag.getMessage()}")
                hasErrors = hasErrors || (diag.getSeverity() > 2)
            }
        assert(!hasErrors)

        generateStub(translationUnit, nativeLib, stubSource, indexerOptions, generatorOptions)
        val stubClasses = File(tempDir, "stub")
        compileKotlin(stubSource, stubClasses, kotlinLibs)
        return stubClasses
    }

    protected fun compileKotlin(file: File, destination: File, classpath: List<File>) {
        val kotlinc = File("lib/kotlinc/bin/kotlinc").getAbsoluteFile()
        val cp = classpath.joinToString(File.pathSeparator)
        runProcess("$kotlinc $file -d $destination -cp $cp")
    }

    protected fun runKotlin(vararg classpath: File, libpath: File? = null): String {
        val baseLibs = arrayListOf(*classpath)
        baseLibs.add(File("lib/kotlinc/lib/kotlin-runtime.jar"))
        val cp = kotlinLibs
                .toCollection( baseLibs)
                .map { it.getAbsolutePath() }
                .joinToString(File.pathSeparator)
        val javaBin = Paths.get(System.getProperty("java.home"), "bin", "java")
        return runProcess("$javaBin ${if (libpath == null) "" else "-Djava.library.path=${File.pathSeparator}${libpath.getAbsolutePath()}"} -cp $cp test.TestPackage")
    }

    protected fun runProcess(command: String): String {
        println(command)
        val process = Runtime.getRuntime().exec(command)
        process.waitFor()

        val result = process.getInputStream().reader().use { it.readText() }
        val error = process.getErrorStream().reader().use { it.readText() }
        System.err.print(error)

        fun format_res(str: String, result: String) = if (!result.isEmpty()) ", $str: \n$result\n" else ""

        val exitCode = process.exitValue()
        assert(exitCode == 0) { "Process exited with code $exitCode${format_res("result", result)}${format_res("error", error)}" }

        return result
    }
}
