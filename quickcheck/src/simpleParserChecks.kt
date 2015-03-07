
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
import java.nio.file.Files
import java.io.File
import java.nio.file.Paths
import java.io.FileWriter
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.junit.Rule


public class SimpleCHeaderGenerator : Generator<CSimpleTransUnit>(javaClass<CSimpleTransUnit>()) {
    override fun generate( random: SourceOfRandomness, status: GenerationStatus): CSimpleTransUnit {
        val gen = CGenGrammar({ (f,l) -> random.nextChar(f,l) }, { (f,l) -> random.nextInt(f,l) })
        return gen.generateSimpleTransUnit1(random.nextInt(1,100))
    }
}

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

    // Rule public val onFailed : ErrorReporter = ErrorReporter(this)

    Theory public fun SimpleSumFuncs(ForAll From(javaClass<SimpleCHeaderGenerator>()) cunit: CSimpleTransUnit) {
        val indexerOptions = IndexerOptions(Language.CPP, verbose = true, debugDump = false)
        assumeNotNull(cunit, cunit.name)
        lastLogBuf = StringBuilder()
        val tmpdir = Files.createTempDirectory("kniqc").toFile()
        lastLogBuf.appendln("Testing '${cunit.name}' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNIQC.dylib")
        val implFilePath = Paths.get(tmpdir.getAbsolutePath(), "${cunit.name}.cpp")
        val impFile = FileWriter(implFilePath.toString())
        impFile.write(cunit.source())
        impFile.flush()
        val header = Paths.get(tmpdir.getAbsolutePath(), "${cunit.headerName}").toString()
        val headerWriter = FileWriter(header)
        headerWriter.write(cunit.header())
        headerWriter.flush()

        val (success, msg) = compileNativeC(implFilePath.toFile(), dylib)
        lastLogBuf.appendln(msg)
        if (!success) println(lastLog)
        assertTrue(success)

        val translationUnit = buildNativeIndex(File(header), indexerOptions)
        val srcIndex = File(tmpdir, "idx")
        lastLogBuf.appendln("Dimping index to ${srcIndex.getAbsolutePath()}")
        srcIndex.writeText(translationUnit.toString())

        val kotlinStub = File(tmpdir, "${cunit.name}.kt")
        generateStub(translationUnit, dylib, kotlinStub, indexerOptions, generatorOptions)
//        assertEquals(cunit.name, "a")

    }
}

