package org.jetbrains.kni.tests

import org.jetbrains.kni.gen.GeneratorOptions
import org.jetbrains.kni.gen.generateStub
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.buildNativeIndexCli
import org.junit.Assert
import java.io.File
import java.nio.file.Files

abstract class AbstractIntegrationTest(val indexerOptions: IndexerOptions, val generatorOptions: GeneratorOptions) {

    abstract protected val kotlinLibs: List<File>

    fun diagSeverity(severity: Int) = when(severity) {
        0, 1 -> "Note"
        2 -> "Warning"
        3 -> "Error"
        4 -> "Fatal"
        else -> "Unknown"
    }

    protected fun makeStub(
            cHeader: File,
            nativeLib: File,
            target: File?,
            tempDir: File?,
            dumpIdx: Boolean = false,
            cliIface: Boolean = false
    ): File {
        val stubTempDir : File = when {
            tempDir != null -> tempDir
            target != null && target.isDirectory -> target
            else -> Files.createTempDirectory("test").toFile()
        }
        val stubTarget : File = when {
            target == null -> stubTempDir
            target.isDirectory -> target
            else -> File(stubTempDir, target.path.substringAfterLast(File.separator))
        }
        val translationUnit = if (cliIface) buildNativeIndexCli("indexer/native/out",cHeader, indexerOptions)
                              else buildNativeIndex(cHeader, indexerOptions)
        if (dumpIdx) {
            val srcIndex = File(stubTempDir, "idx")
            srcIndex.writeText(translationUnit.toString())
        }
        var hasErrors = false
        for (diag in translationUnit.diagnosticList)
            if (diag.severity > 1) {
                println("${diagSeverity(diag.severity)} at (${diag.line},${diag.column}: ${diag.message}")
                hasErrors = hasErrors || (diag.severity > 2)
            }
        assert(!hasErrors)

        // println("Generating stub to $stubSource")
        generateStub(translationUnit, nativeLib, stubTarget, generatorOptions)
        val stubClasses = File(stubTempDir, "stub")
        // println("Compiling stub $stubSource")
        Assert.assertTrue( reportIfError( compileKotlin(listOf(stubTarget), stubClasses, kotlinLibs)))
        return stubClasses
    }

    fun reportIfError(res: Pair<Boolean, String>): Boolean {
        if (!res.first)
            println(res.second)
        return res.first
    }
}
