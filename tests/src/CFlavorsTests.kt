package org.jetbrains.kni.tests

import org.jetbrains.kni.gen.GeneratorOptions
import org.jetbrains.kni.gen.InteropRuntime
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import org.junit.Assert
import java.io.File
import java.nio.file.Files

open class ObjCTest(
        idxOpts: IndexerOptions = IndexerOptions(Language.OBJC),
        genOpts: GeneratorOptions = GeneratorOptions(InteropRuntime.ObjC)
) : AbstractIntegrationTest(idxOpts, genOpts) {
    override protected val kotlinLibs: List<File> by lazy {
        val target = File("dist/kni-objc-runtime.jar")
        assert(target.exists()) { "$target is not found. Execute 'ant dist' before running tests" }
        listOf(target)
    }
}

open class ObjCGeneratedTest : ObjCTest() {
    protected fun doTest(source: String) {
        val header = File(source.replace(".kt", ".h")).absoluteFile
        val implementation = File(source.replace(".kt", ".m")).absoluteFile
        val kotlinSource = File(source).absoluteFile

        val tmpdir = Files.createTempDirectory("knitest").toFile()
        println("Testing '$source' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNITest.dylib")

        assert(reportIfError(compileObjC(implementation, dylib)))

        val stubClasses = makeStub(header, dylib, null, tmpdir, dumpIdx = true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue(reportIfError(compileKotlin(listOf(kotlinSource), mainClasses, kotlinLibs + stubClasses)))

        val result = runKotlin(listOf("test.TestPackage"), listOf(mainClasses, stubClasses) + kotlinLibs, libPath = tmpdir)
        Assert.assertTrue(reportIfError(result))
        Assert.assertEquals("OK", result.second.trim())
    }
}


open class CPlusPlusTest(
        idxOpts: IndexerOptions = IndexerOptions(Language.CPP, debugDump = false),
        genOpts: GeneratorOptions = GeneratorOptions(InteropRuntime.JNR)
) : AbstractIntegrationTest(idxOpts, genOpts) {
    override val kotlinLibs: List<File> by lazy {
        File("lib").listFiles {
            it.name.matches("(asm-.+\\.jar)|(jffi-.+\\.jar)|(jnr-.+\\.jar)".toRegex())
        }?.toList().orEmpty()
    }
}

open class CPlusPlusGeneratedTest : CPlusPlusTest() {
    protected fun doTest(source: String) {
        val header = File(source.replace(".kt", ".hpp")).absoluteFile
        val implementation = File(source.replace(".kt", ".cpp")).absoluteFile
        val kotlinSource = File(source).absoluteFile

        val tmpdir = Files.createTempDirectory("knitest").toFile()
        println("Testing '$source' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNITest.dylib")

        Assert.assertTrue(reportIfError(compileNativeC(implementation, dylib)))

        val stubClasses = makeStub(header, dylib, null, tmpdir, true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue(reportIfError(compileKotlin(listOf(kotlinSource), mainClasses, kotlinLibs + stubClasses)))

        val result = runKotlin(listOf("test.TestPackage"), listOf(mainClasses, stubClasses) + kotlinLibs, libPath = tmpdir)
        Assert.assertTrue(reportIfError(result))
        Assert.assertEquals("OK", result.second.trim())
    }
}
