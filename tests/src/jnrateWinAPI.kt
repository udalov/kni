package org.jetbrains.kni.tests

import org.jetbrains.kni.gen.GeneratorOptions
import org.jetbrains.kni.gen.InteropRuntime
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import org.jetbrains.kni.indexer.buildNativeIndex
import org.junit.Assert
import java.io.File
import java.nio.file.Files
import kotlin.properties.Delegates
import org.junit.Test as test

class LibWinApiTests : CPlusPlusTest( idxOpts =  IndexerOptions(Language.CPP, debugDump = false, includePaths = listOf("lib"))) {

    override protected val kotlinLibs: List<File> by Delegates.lazy {
        File("lib/jnr").listFiles().toArrayList() +
        (File("lib").listFiles { it.name.contains("junit") }?.toList() ?: listOf())
    }

    test fun JNRateWinAPI() {
        val tmpdir = Files.createTempDirectory("winapitest").toFile()
        val header = File("/usr/local/include/wine/windows/windows.h").getAbsoluteFile()
        val kotlinSource = File("tests/testData/winapi/winapi.kt").getAbsoluteFile()
        val dylib = File("/usr/local/lib/wine/kernel32.dll.so")

        val stubClasses = makeStub(header, dylib, kotlinSource, tmpdir, true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue( reportIfError( compileKotlin(kotlinSource, mainClasses, kotlinLibs + stubClasses)))

        // val result = runKotlin(mainClasses, stubClasses, libpath = tmpdir)
        // Assert.assertEquals("OK", result)
    }
}
