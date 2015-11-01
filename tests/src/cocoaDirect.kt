
package org.jetbrains.kni.tests

import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.nio.file.Files

class CocoaDirectTests : ObjCTest(idxOpts = IndexerOptions(Language.OBJC, debugDump = false, includePaths = listOf("lib"))) {
    @Test fun CocoaDirectTest() {
        val tmpdir = Files.createTempDirectory("cocoadirecttest").toFile()
        val header = File("/System/Library/Frameworks/AppKit.framework/Headers/AppKit.h").absoluteFile
        val kotlinSource = File("tests/testData/cocoaDirect/cocoaDirectTest.kt").absoluteFile
        val dylib = File("/System/Library/Frameworks//AppKit.framework/Versions/C/Resources/BridgeSupport/AppKit.dylib")

        val stubClasses = makeStub(header, dylib, null, tmpdir, dumpIdx = true, cliIface = true)

        val mainClasses = File(tmpdir, "main")
        Assert.assertTrue(reportIfError(compileKotlin(listOf(kotlinSource), mainClasses, kotlinLibs + stubClasses)))

        val result = runKotlin(listOf("test.TestPackage"), listOf(mainClasses, stubClasses) + kotlinLibs, libPath = tmpdir)
        Assert.assertTrue(reportIfError(result))
        Assert.assertEquals("OK", result.second.trim())
    }
}
