
package org.jetbrains.kni.tests

import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import java.io.File
import kotlin.properties.Delegates
import org.jetbrains.kni.gen.InteropRuntime
import org.jetbrains.kni.gen.GeneratorOptions
import org.junit.Assert
import java.nio.file.Files

public abstract class ObjCTest : AbstractIntegrationTest(IndexerOptions(Language.OBJC), GeneratorOptions(InteropRuntime.ObjC)) {

    override protected val kotlinLibs: List<File> by Delegates.lazy {
        val target = File("dist/kni-objc-runtime.jar")
        assert(target.exists()) { "$target is not found. Execute 'ant dist' before running tests" }
        listOf(target)
    }

    protected fun doTest(source: String) {
        val header = File( source.replace(".kt", ".h")).getAbsoluteFile()
        val implementation = File( source.replace(".kt", ".m")).getAbsoluteFile()
        val kotlinSource = File(source).getAbsoluteFile()

        val tmpdir = Files.createTempDirectory("knitest").toFile()!!
        println("Testing '$source' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNITest.dylib")

        runProcess("/usr/bin/clang -ObjC -dynamiclib -framework Foundation $implementation -o $dylib")

        val stubClasses = makeStub(header, dylib, kotlinSource, tmpdir, true)

        val mainClasses = File(tmpdir, "main")
        compileKotlin(kotlinSource, mainClasses, kotlinLibs + stubClasses)

        val result = runKotlin(mainClasses, stubClasses, libpath = tmpdir)
        Assert.assertEquals("OK", result)
    }

}


public abstract class CPlusPlusTest : AbstractIntegrationTest(IndexerOptions(Language.CPP, debugDump = false), GeneratorOptions(InteropRuntime.JNR)) {

    override protected val kotlinLibs: List<File> by Delegates.lazy {
        File("lib/jnr").listFiles().toArrayList()
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

    protected fun doTest(source: String) {
        val header = File( source.replace(".kt", ".hpp")).getAbsoluteFile()
        val implementation = File( source.replace(".kt", ".cpp")).getAbsoluteFile()
        val kotlinSource = File(source).getAbsoluteFile()

        val tmpdir = Files.createTempDirectory("knitest").toFile()!!
        println("Testing '$source' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNITest.dylib")

        runProcess("/usr/bin/c++ --std=c++11 -fPIC -stdlib=libstdc++ -dynamiclib $implementation -o $dylib")

        val stubClasses = makeStub(header, dylib, kotlinSource, tmpdir, true)

        val mainClasses = File(tmpdir, "main")
        compileKotlin(kotlinSource, mainClasses, kotlinLibs + stubClasses)

        val result = runKotlin(mainClasses, stubClasses, libpath = tmpdir)
        Assert.assertEquals("OK", result)
    }

}
