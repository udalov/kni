package org.jetbrains.kni.it

import org.junit.Test as test
import java.io.File
import java.nio.file.Files
import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.gen.generateStub
import org.junit.Assert

class IntegrationTest {
    private fun doTest(testName: String) {
        val path = "tests/testData/integration/$testName"
        val header = File("$path.h").getAbsoluteFile()
        val implementation = File("$path.m").getAbsoluteFile()
        val kotlinSource = File("$path.kt").getAbsoluteFile()

        val tmpdir = Files.createTempDirectory("knitest").toFile()
        val dylib = File(tmpdir, "libKNITest.dylib")

        compileObjectiveC(implementation, dylib)

        val stubSource = generateStub(buildNativeIndex(header), dylib, tmpdir)
        val stubClasses = File(tmpdir, "stub")
        compileKotlin(stubSource, stubClasses, listOf(File("out/production/runtime-objc")))

        val mainClasses = File(tmpdir, "main")
        compileKotlin(kotlinSource, mainClasses, listOf(File("out/production/runtime-objc"), stubClasses))

        val result = runKotlin(mainClasses, stubClasses)
        Assert.assertEquals("OK", result)
    }

    private fun compileObjectiveC(source: File, target: File) {
        runProcess("/usr/bin/clang -ObjC -dynamiclib -framework Foundation $source -o $target")
    }

    private fun compileKotlin(file: File, destination: File, classpath: List<File>) {
        val kotlinc = File("dependencies/kotlinc/bin/kotlinc").getAbsoluteFile()
        val cp = classpath.joinToString(File.pathSeparator)
        runProcess("$kotlinc $file -d $destination -cp $cp")
    }

    private fun runKotlin(vararg classpath: File): String {
        val cp = listOf(
                *classpath,
                File("dependencies/kotlinc/lib/kotlin-runtime.jar"),
                File("out/production/runtime-objc"),
                File("runtime-objc/native/out")
        ).map { it.getAbsolutePath() }.joinToString(File.pathSeparator)

        return runProcess("java -cp $cp test.TestPackage")
    }

    private fun runProcess(command: String): String {
        val process = Runtime.getRuntime().exec(command)
        process.waitFor()

        val result = process.getInputStream().reader().use { it.readText() }
        val error = process.getErrorStream().reader().use { it.readText() }
        System.err.print(error)

        val exitCode = process.exitValue()
        assert(exitCode == 0) { "Process exited with code $exitCode, result: $result" }

        return result
    }


    test fun simpleClass() {
        doTest("simpleClass")
    }
}
