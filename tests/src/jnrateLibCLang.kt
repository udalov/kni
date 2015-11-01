package org.jetbrains.kni.tests

import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.nio.file.Files

class LibCLangTests : CPlusPlusTest(idxOpts = IndexerOptions(Language.CPP, debugDump = false, includePaths = listOf("lib"))) {

    override val kotlinLibs: List<File> by lazy {
        super.kotlinLibs +
                (File("lib").listFiles { it.name.contains("junit") }?.toList() ?: listOf())
    }

    @Test fun JNRateLibCLang() {
        val tmpdir = Files.createTempDirectory("libclangtest").toFile()
        val header = File("lib/clang-c/Index.h").absoluteFile
        val kotlinSource = File("tests/testData/libCLang/libCLangTest.kt").absoluteFile
        val dylib = File("libclang.dylib")

        val stubClasses = makeStub(header, dylib, kotlinSource, tmpdir, true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue(reportIfError(compileKotlin(listOf(kotlinSource), mainClasses, kotlinLibs + stubClasses)))

        // val result = runKotlin(mainClasses, stubClasses, libPath = tmpdir)
        // Assert.assertEquals("OK", result)
    }
}
