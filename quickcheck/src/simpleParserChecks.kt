
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

//    Rule public val onFailed : ErrorReporter = ErrorReporter(this)

    Theory public fun NameAndGuard(ForAll From(javaClass<SimpleCHeaderGenerator>()) cunit: CSimpleTransUnit) {
        assumeNotNull(cunit, cunit.name)
        lastLogBuf = StringBuilder()
        val tmpdir = Files.createTempDirectory("kniqc").toFile()
        lastLogBuf.appendln("Testing '${cunit.name}' in '$tmpdir'")
        val dylib = File(tmpdir, "libKNIQC.dylib")
        val implFilePath = Paths.get(tmpdir.getAbsolutePath(), "${cunit.name}.cpp")
        val impFile = FileWriter(implFilePath.toString())
        impFile.write(cunit.source())
        impFile.flush()
        val headerFile = FileWriter(Paths.get(tmpdir.getAbsolutePath(), "${cunit.headerName}").toString())
        headerFile.write(cunit.header())
        headerFile.flush()
        val (success, msg) = compileNativeC(implFilePath.toFile(), dylib)
        lastLogBuf.appendln(msg)
        if (!success) println(lastLog)
        assertTrue(success)
//        assertEquals(cunit.name, "a")
    }
}

