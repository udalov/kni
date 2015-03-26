
package org.jetbrains.kni.tests

import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import java.io.File
import kotlin.properties.Delegates
import org.jetbrains.kni.gen.InteropRuntime
import org.jetbrains.kni.gen.GeneratorOptions
import org.jetbrains.kni.tests.*
import org.junit.Assert
import java.nio.file.Files

public open class ObjCTest(idxOpts: IndexerOptions = IndexerOptions(Language.OBJC),
                               genOpts: GeneratorOptions = GeneratorOptions(InteropRuntime.ObjC))
: AbstractIntegrationTest(idxOpts, genOpts) {

    override protected val kotlinLibs: List<File> by Delegates.lazy {
        val target = File("dist/kni-objc-runtime.jar")
        assert(target.exists()) { "$target is not found. Execute 'ant dist' before running tests" }
        listOf(target)
    }
}

public open class ObjCGeneratedTest : ObjCTest() {

    protected fun doTest(source: String) {
        val header = File( source.replace(".kt", ".h")).getAbsoluteFile()
        val implementation = File( source.replace(".kt", ".m")).getAbsoluteFile()
        val kotlinSource = File(source).getAbsoluteFile()

        val tmpdir = Files.createTempDirectory("knitest").toFile()!!
        println("Testing '$source' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNITest.dylib")

        assert( reportIfError( compileObjC(implementation, dylib)))

        val stubClasses = makeStub(header, dylib, kotlinSource, tmpdir, dumpIdx = true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue( reportIfError( compileKotlin(kotlinSource, mainClasses, kotlinLibs + stubClasses)))

        Assert.assertTrue( reportIfError( runKotlin(listOf("test.TestPackage"), listOf(mainClasses, stubClasses) + kotlinLibs, libpath = tmpdir)))
    }

}


public open class CPlusPlusTest( idxOpts: IndexerOptions = IndexerOptions(Language.CPP, debugDump = false),
                                     genOpts: GeneratorOptions = GeneratorOptions(InteropRuntime.JNR))
: AbstractIntegrationTest(idxOpts, genOpts) {

    override val kotlinLibs: List<File> by Delegates.lazy {
        File("lib").listFiles { it.getName().matches("(asm-.+\\.jar)|(jffi-.+\\.jar)|(jnr-.+\\.jar)") }?.toList() ?: listOf()
    }
}

public open class CPlusPlusGeneratedTest : CPlusPlusTest() {

    protected fun doTest(source: String) {
        val header = File( source.replace(".kt", ".hpp")).getAbsoluteFile()
        val implementation = File( source.replace(".kt", ".cpp")).getAbsoluteFile()
        val kotlinSource = File(source).getAbsoluteFile()

        val tmpdir = Files.createTempDirectory("knitest").toFile()!!
        println("Testing '$source' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNITest.dylib")

        Assert.assertTrue( reportIfError( compileNativeC(implementation, dylib)))

        val stubClasses = makeStub(header, dylib, kotlinSource, tmpdir, true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue( reportIfError( compileKotlin(kotlinSource, mainClasses, kotlinLibs + stubClasses)))

        Assert.assertTrue( reportIfError( runKotlin(listOf("test.TestPackage"), listOf(mainClasses, stubClasses) + kotlinLibs, libpath = tmpdir)))
    }

}
