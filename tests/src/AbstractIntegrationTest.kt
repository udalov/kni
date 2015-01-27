package org.jetbrains.kni.tests

import java.io.File
import java.nio.file.Files
import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.NativeIndexingOptions
import org.jetbrains.kni.gen.generateStub
import org.junit.Assert
import kotlin.properties.Delegates
import java.nio.file.Paths
import kni.objc.loadLibrary
import org.jetbrains.kni.gen.InteropRuntime

abstract class AbstractIntegrationTest(val options: NativeIndexingOptions, val runtime: InteropRuntime) {

    abstract protected val kotlinLibs: List<File>

    abstract protected fun src2header(source: String): String
    abstract protected fun src2implementation(source: String): String

    abstract protected fun compileNative(source: File, target: File)

    protected fun doTest(source: String) {
        val header = File( src2header(source)).getAbsoluteFile()
        val implementation = File( src2implementation(source)).getAbsoluteFile()
        val kotlinSource = File(source).getAbsoluteFile()

        val tmpdir = Files.createTempDirectory("knitest").toFile()
        println("Testing '$source' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNITest.dylib")

        compileNative(implementation, dylib)

        val stubSource = File(tmpdir, kotlinSource.getPath().substringAfterLast(File.separator))
        val translationUnit = buildNativeIndex(header, options)
        val srcIndex = File(tmpdir, "idx")
        srcIndex.writeText(translationUnit.toString())

        generateStub(translationUnit, dylib, stubSource, options, runtime)
        val stubClasses = File(tmpdir, "stub")
        compileKotlin(stubSource, stubClasses, kotlinLibs)

        val mainClasses = File(tmpdir, "main")
        compileKotlin(kotlinSource, mainClasses, kotlinLibs + stubClasses)

        val result = runKotlin(mainClasses, stubClasses, libpath = tmpdir)
        Assert.assertEquals("OK", result)
    }

    private fun compileKotlin(file: File, destination: File, classpath: List<File>) {
        val kotlinc = File("lib/kotlinc/bin/kotlinc").getAbsoluteFile()
        val cp = classpath.joinToString(File.pathSeparator)
        runProcess("$kotlinc $file -d $destination -cp $cp")
    }

    private fun runKotlin(vararg classpath: File, libpath: File? = null): String {
        val baseLibs = arrayListOf(*classpath)
        baseLibs.add(File("lib/kotlinc/lib/kotlin-runtime.jar"))
        val cp = kotlinLibs
                .toCollection( baseLibs)
                .map { it.getAbsolutePath() }
                .joinToString(File.pathSeparator)
        return runProcess("java ${if (libpath == null) "" else "-Djava.library.path=${File.pathSeparator}${libpath.getAbsolutePath()}"} -cp $cp test.TestPackage")
    }

    protected fun runProcess(command: String): String {
        println(command)
        val process = Runtime.getRuntime().exec(command)
        process.waitFor()

        val result = process.getInputStream().reader().use { it.readText() }
        val error = process.getErrorStream().reader().use { it.readText() }
        System.err.print(error)

        val exitCode = process.exitValue()
        assert(exitCode == 0) { "Process exited with code $exitCode, result: $result" }

        return result
    }
}
