package org.jetbrains.kni.tests

import kotlin.platform.platformStatic
import org.jetbrains.kni.gen.Printer
import java.io.File

object GenerateTests {
    fun generate(rootDir: String, testName: String, baseClass: String) {
        val sb = StringBuilder()
        val out = Printer(sb)

        out.println("package org.jetbrains.kni.tests")
        out.println()
        out.println("import org.junit.Test as test")
        out.println()
        out.println("class ${testName}Generated : $baseClass() {")
        out.push()

        val root = File(rootDir)
        root.recurse { file ->
            if (file.isFile() && file.getPath().endsWith(".kt")) {
                val name = root.relativePath(file).substringBeforeLast(".kt").replace(File.separatorChar, '_')
                out.println("test fun $name() = doTest(\"$file\")")
            }
        }

        out.pop()
        out.println("}")

        val output = File("tests/src/generated/${testName}Generated.kt")
        output.getParentFile().mkdirs()
        output.writeText(sb.toString())
    }

    platformStatic fun main(args: Array<String>) {
        generate("tests/testData/integration", "IntegrationTest", "ObjCTest")
        generate("tests/testData/integration_cpp", "CPPIntegrationTest", "CPlusPlusTest")
    }
}
