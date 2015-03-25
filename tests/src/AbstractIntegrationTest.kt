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
import org.jetbrains.kni.indexer.buildNativeIndexCli
import org.jetbrains.kni.tests.*

abstract class AbstractIntegrationTest(val indexerOptions: IndexerOptions, val generatorOptions: GeneratorOptions) {

    abstract protected val kotlinLibs: List<File>

    fun diagSeverity(severity: Int) = when(severity) {
        0, 1 -> "Note"
        2 -> "Warning"
        3 -> "Error"
        4 -> "Fatal"
        else -> "Unknown"
    }

    protected fun makeStub(cHeader: File,
                           nativeLib: File,
                           target: File,
                           tempDir: File,
                           dumpIdx: Boolean = false,
                           cliIface: Boolean = false)
            : File {

        val stubSource = File(tempDir, target.getPath().substringAfterLast(File.separator))
        val translationUnit = if (cliIface) buildNativeIndexCli("indexer/native/out",cHeader, indexerOptions)
                              else buildNativeIndex(cHeader, indexerOptions)
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

        // println("Generating stub to $stubSource")
        generateStub(translationUnit, nativeLib, stubSource, indexerOptions, generatorOptions)
        val stubClasses = File(tempDir, "stub")
        // println("Compiling stub $stubSource")
        Assert.assertTrue( reportIfError( compileKotlin(stubSource, stubClasses, kotlinLibs)))
        return stubClasses
    }

    fun reportIfError(res: Pair<Boolean, String>): Boolean {
        if (!res.first)
            println(res.second)
        return res.first
    }
}
