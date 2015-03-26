
package org.jetbrains.kni.quickchecks

import com.pholser.junit.quickcheck.ForAll
import org.junit.contrib.theories.*
import org.junit.runner.RunWith
import org.junit.Assume.*
import org.junit.Assert.*
import com.pholser.junit.quickcheck.From
import com.pholser.junit.quickcheck.generator.Generator
import com.pholser.junit.quickcheck.random.SourceOfRandomness
import com.pholser.junit.quickcheck.generator.GenerationStatus
import org.jetbrains.kni.gen.GeneratorOptions
import org.jetbrains.kni.gen.InteropRuntime
import org.jetbrains.kni.gen.generateStub
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.tests.*
import java.nio.file.Files
import java.io.File
import java.nio.file.Paths
import java.io.FileWriter
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.junit.Rule
import java.util.ArrayList
import kotlin.properties.Delegates


public class SimpleCHeaderGenerator : Generator<CSimpleTransUnit>(javaClass<CSimpleTransUnit>()) {
    override fun generate( random: SourceOfRandomness, status: GenerationStatus): CSimpleTransUnit {
        val gen = CGenGrammar({ (f,l) -> random.nextChar(f,l) },
                              { (f,l) -> random.nextLong(f,l) },
                              { (f,l) -> random.nextDouble(f,l) },
                              maxIdentifierSize = 10,
                              // seems that more than 5 params lead to jffi problems
                              // \todo investigate
                              maxParams = 5)
        return gen.generateSimpleTransUnit1(random.nextInt(30,100))
    }
}

public fun testGen(cunit: CSimpleTransUnit): String =
"""
package test
import native.*
import org.junit.Test
import org.junit.Assert.*

class NativeTest {
    Test fun test() {
        val iface = get_iface_${cunit.name}_hpp("KNIQC")
        ${cunit.kotlinTestBody("iface", "assertEquals", "\n        ")}
    }
}
"""


public trait LastLogKeeper {
    public val lastLog: String
}

public class ErrorReporter(public val keeper: LastLogKeeper) : TestWatcher() {
    override fun failed(e: Throwable?, description: Description?) {
        println(keeper.lastLog)
        super.failed(e, description)
    }
}

RunWith(javaClass<Theories>())
public class SimpleCHeaderCheck : LastLogKeeper {
    var lastLogBuf: StringBuilder = StringBuilder()
    override val lastLog: String get() = lastLogBuf.toString()
    val generatorOptions = GeneratorOptions(InteropRuntime.JNR)

    private val classpath: Collection<File> by Delegates.lazy {
        // System.getProperty("java.class.path").split(File.pathSeparator).map { File(it) }.toArrayList()
        val libDir = File("lib")
        val res = arrayListOf<File>()
        for (jar in libDir.listFiles())
            if (jar.getName().contains("ffi") || jar.getName().contains("jnr") || jar.getName().contains("asm")
                || jar.getName().contains("junit") || jar.getName().contains("hamcrest"))
                res.add(jar)
        //res.add(File("lib/kotlinc/lib/kotlin-runtime.jar"))
        res +
        File("lib/jnr").listFiles().toArrayList()
    }

    // doesn't work due to KT-3441
    // \todo reenable after fix or find a workaround
    // Rule public val onFailed : ErrorReporter = ErrorReporter(this)

    Theory public fun SimpleArgsFuncs(ForAll(sampleSize = 10) From(javaClass<SimpleCHeaderGenerator>()) cunit: CSimpleTransUnit) {
        val indexerOptions = IndexerOptions(Language.CPP, verbose = true, debugDump = false)
        assumeNotNull(cunit, cunit.name)
        lastLogBuf = StringBuilder()
        val tmpdir = Files.createTempDirectory("kniqc").toFile()
        lastLogBuf.appendln("Testing '${cunit.name}' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNIQC.dylib")
        val implFile = File(tmpdir.getAbsolutePath(), "${cunit.name}.cpp")
        implFile.writeText(cunit.source)
        val headerFile = File(tmpdir.getAbsolutePath(), "${cunit.headerName}")
        headerFile.writeText(cunit.header)

        assertTrue( check( compileNativeC(implFile, dylib)))

        val translationUnit = buildNativeIndex(headerFile, indexerOptions)
        val srcIndex = File(tmpdir, "idx")
        lastLogBuf.appendln("Dumping index to ${srcIndex.getAbsolutePath()}")
        srcIndex.writeText(translationUnit.toString())

        val kotlinStub = File(tmpdir, "${cunit.name}.kt")
        val stubClasses = File(tmpdir, "stub")
        generateStub(translationUnit, dylib, kotlinStub, indexerOptions, generatorOptions)
        assertTrue( check( compileKotlin(kotlinStub, stubClasses, classpath)))

        val testSource = File(tmpdir, "test.kt")
        val testClasses = File(tmpdir, "test")
        testSource.writeText(testGen(cunit))
        assertTrue( check( compileKotlin(testSource, testClasses, classpath + stubClasses)))

        assertTrue( check( runKotlin(arrayListOf("org.junit.runner.JUnitCore", "test.NativeTest"),
                                     listOf(testClasses, stubClasses) + classpath, libpath = tmpdir)))
    }

    fun check(res: Pair<Boolean, String>): Boolean {
        lastLogBuf.appendln(res.second)
        if (!res.first)
            println(lastLog)
        return res.first
    }
}

