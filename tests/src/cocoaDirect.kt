
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

class CocoaDirectTests : ObjCTest( idxOpts = IndexerOptions(Language.OBJC, debugDump = false, includePaths = listOf("lib"))) {

    test fun CocoaDirectTest() {
        val tmpdir = Files.createTempDirectory("cocoadirecttest").toFile()
        val header = File("/System/Library/Frameworks/AppKit.framework/Headers/AppKit.h").getAbsoluteFile()
        val kotlinSource = File("tests/testData/cocoaDirect/cocoaDirectTest.kt").getAbsoluteFile()
        val dylib = File(tmpdir, "/System/Library/Frameworks//AppKit.framework/Versions/C/Resources/BridgeSupport/AppKit.dylib")

        val stubClasses = makeStub(header, dylib, kotlinSource, tmpdir, dumpIdx = true, cliIface = true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue( reportIfError( compileKotlin(kotlinSource, mainClasses, kotlinLibs + stubClasses)))

        // val result = runKotlin(mainClasses, stubClasses, libpath = tmpdir)
        // Assert.assertEquals("OK", result)
    }
}

