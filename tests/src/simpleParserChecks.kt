package org.jetbrains.kni.quickchecks

import com.pholser.junit.quickcheck.ForAll
import com.pholser.junit.quickcheck.From
import com.pholser.junit.quickcheck.generator.GenerationStatus
import com.pholser.junit.quickcheck.generator.Generator
import com.pholser.junit.quickcheck.random.SourceOfRandomness
import org.jetbrains.kni.gen.generateStub
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.tests.CPlusPlusTest
import org.jetbrains.kni.tests.compileKotlin
import org.jetbrains.kni.tests.compileNativeC
import org.jetbrains.kni.tests.runKotlin
import org.junit.Assert.assertTrue
import org.junit.Assume.assumeNotNull
import org.junit.contrib.theories.Theories
import org.junit.contrib.theories.Theory
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.junit.runner.RunWith
import java.io.File
import java.nio.file.Files

class SimpleCHeaderGenerator : Generator<CSimpleTransUnit>(CSimpleTransUnit::class.java) {
    override fun generate(random: SourceOfRandomness, status: GenerationStatus): CSimpleTransUnit {
        val gen = CGenGrammar(
                { f, l -> random.nextChar(f, l) },
                { f, l -> random.nextLong(f, l) },
                { f, l -> random.nextDouble(f, l) },
                maxIdentifierSize = 10,
                // seems that more than 5 params lead to jffi problems
                // \todo investigate
                maxParams = 5
        )
        return gen.generateSimpleTransUnit1(random.nextInt(30,100))
    }
}

fun testGen(cunit: CSimpleTransUnit): String =
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


interface LastLogKeeper {
    val lastLog: String
}

class ErrorReporter(public val keeper: LastLogKeeper) : TestWatcher() {
    override fun failed(e: Throwable?, description: Description?) {
        println(keeper.lastLog)
        super.failed(e, description)
    }
}

@RunWith(Theories::class)
class SimpleCHeaderCheck : LastLogKeeper, CPlusPlusTest() {
    var lastLogBuf: StringBuilder = StringBuilder()
    override val lastLog: String get() = lastLogBuf.toString()

    private val classpath: Collection<File> by lazy {
        // System.getProperty("java.class.path").split(File.pathSeparator).map { File(it) }.toArrayList()
        val libDir = File("lib")
        val res = arrayListOf<File>()
        for (jar in libDir.listFiles()) {
            if ("ffi" in jar.name || "jnr" in jar.name || "asm" in jar.name ||
                    "junit" in jar.name || "hamcrest" in jar.name) {
                res.add(jar)
            }
        }
        //res.add(File("lib/kotlinc/lib/kotlin-runtime.jar"))
        res + kotlinLibs
    }

    // doesn't work due to KT-3441
    // \todo reenable after fix or find a workaround
    // @Rule public val onFailed : ErrorReporter = ErrorReporter(this)

    @Theory fun SimpleArgsFuncs(@ForAll(sampleSize = 10) @From(SimpleCHeaderGenerator::class) cunit: CSimpleTransUnit) {
        val indexerOptions = IndexerOptions(Language.CPP, verbose = true, debugDump = false)
        assumeNotNull(cunit, cunit.name)
        lastLogBuf = StringBuilder()
        val tmpdir = Files.createTempDirectory("kniqc").toFile()
        lastLogBuf.appendln("Testing '${cunit.name}' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNIQC.dylib")
        val implFile = File(tmpdir.absolutePath, "${cunit.name}.cpp")
        implFile.writeText(cunit.source)
        val headerFile = File(tmpdir.absolutePath, "${cunit.headerName}")
        headerFile.writeText(cunit.header)

        assertTrue(check(compileNativeC(implFile, dylib)))

        val translationUnit = buildNativeIndex(headerFile, indexerOptions)
        val srcIndex = File(tmpdir, "idx")
        lastLogBuf.appendln("Dumping index to ${srcIndex.absolutePath}")
        srcIndex.writeText(translationUnit.toString())

        val kotlinStub = File(tmpdir, "${cunit.name}.kt")
        val stubClasses = File(tmpdir, "stub")
        generateStub(translationUnit, dylib, kotlinStub, generatorOptions)
        assertTrue(check(compileKotlin(listOf(kotlinStub), stubClasses, classpath)))

        val testSource = File(tmpdir, "test.kt")
        val testClasses = File(tmpdir, "test")
        testSource.writeText(testGen(cunit))
        assertTrue(check(compileKotlin(listOf(testSource), testClasses, classpath + stubClasses)))

        assertTrue(check(runKotlin(arrayListOf("org.junit.runner.JUnitCore", "test.NativeTest"),
                listOf(testClasses, stubClasses) + classpath, libPath = tmpdir)))
    }

    fun check(res: Pair<Boolean, String>): Boolean {
        lastLogBuf.appendln(res.second)
        if (!res.first)
            println(lastLog)
        return res.first
    }
}
