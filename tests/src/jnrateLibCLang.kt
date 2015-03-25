
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

class LibCLangTests : AbstractIntegrationTest(
        IndexerOptions(Language.CPP, debugDump = false, includePaths = listOf("lib")),
        GeneratorOptions(InteropRuntime.JNR)) {

    override protected val kotlinLibs: List<File> by Delegates.lazy {
        File("lib/jnr").listFiles().toArrayList() +
        (File("lib").listFiles { it.name.contains("junit") }?.toList() ?: listOf())
        /*
        val targets =
                listOf(
                File("lib/jnr/jnr-ffi.jar"),
                File("lib/jnr/jffi-1.2.8.jar"),
                File("lib/jnr/jffi-1.2.8-native.jar"),
                File("lib/asm-all-5.0.3.jar"),
                File("lib/jnr-x86asm-1.0.2.jar")
        )
        for (target in targets) {
            assert(target.exists()) { "$target is not found. Execute 'ant -f update_dependencies.xml' and 'ant dist' before running tests" }
        }
        targets
        */
    }

    test fun JNRateLibCLang() {
        val tmpdir = Files.createTempDirectory("libclangtest").toFile()
        val header = File("lib/clang-c/Index.h").getAbsoluteFile()
        val kotlinSource = File("tests/testData/libCLang/libCLangTest.kt").getAbsoluteFile()
        val dylib = File("libclang.dylib")

        val stubClasses = makeStub(header, dylib, kotlinSource, tmpdir, true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue( reportIfError( compileKotlin(kotlinSource, mainClasses, kotlinLibs + stubClasses)))

        // val result = runKotlin(mainClasses, stubClasses, libpath = tmpdir)
        // Assert.assertEquals("OK", result)
    }
}
