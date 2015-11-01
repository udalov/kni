package org.jetbrains.kni.tests

import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.nio.file.Files

class LibWinApiTests : CPlusPlusTest(idxOpts = IndexerOptions(Language.CPP, debugDump = false, includePaths = listOf("lib"))) {

    override val kotlinLibs: List<File> by lazy {
        super.kotlinLibs +
                (File("lib").listFiles { it.name.contains("junit") }?.toList() ?: listOf())
    }

    @Test fun JNRateWinAPI() {
        val tmpdir = Files.createTempDirectory("winapitest").toFile()
        val header = File("/usr/local/include/wine/windows/windows.h").absoluteFile
        val kotlinSource = File("tests/testData/winapi/winapi.kt").absoluteFile
        val dylib = File("/usr/local/lib/wine/kernel32.dll.so")

        val stubClasses = makeStub(header, dylib, kotlinSource, tmpdir, true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue(reportIfError(compileKotlin(listOf(kotlinSource), mainClasses, kotlinLibs + stubClasses)))

        // val result = runKotlin(mainClasses, stubClasses, libPath = tmpdir)
        // Assert.assertEquals("OK", result)
    }
}
