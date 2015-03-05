
package org.jetbrains.kni.tests

import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import java.io.File
import kotlin.properties.Delegates
import org.jetbrains.kni.gen.InteropRuntime
import org.jetbrains.kni.gen.GeneratorOptions

public abstract class ObjCTest : AbstractIntegrationTest(IndexerOptions(Language.OBJC), GeneratorOptions(InteropRuntime.ObjC)) {

    override protected fun src2header(source: String): String = source.replace(".kt", ".h")
    override protected fun src2implementation(source: String): String = source.replace(".kt", ".m")

    override protected val kotlinLibs: List<File> by Delegates.lazy {
        val target = File("dist/kni-objc-runtime.jar")
        assert(target.exists()) { "$target is not found. Execute 'ant dist' before running tests" }
        listOf(target)
    }

    override protected fun compileNative(source: File, target: File) {
        runProcess("/usr/bin/clang -ObjC -dynamiclib -framework Foundation $source -o $target")
    }
}


public abstract class CPlusPlusTest : AbstractIntegrationTest(IndexerOptions(Language.CPP, debugDump = true), GeneratorOptions(InteropRuntime.JNR)) {

    override protected fun src2header(source: String): String = source.replace(".kt", ".hpp")
    override protected fun src2implementation(source: String): String = source.replace(".kt", ".cpp")

    override protected val kotlinLibs: List<File> by Delegates.lazy {
        val targets = listOf(
                File("lib/jnr-ffi-2.0.1.jar"),
                File("lib/jffi-1.2.7.jar"),
                File("lib/jffi-1.2.7-native.jar"),
                File("lib/asm-all-5.0.3.jar"),
                File("lib/jnr-x86asm-1.0.2.jar")
        )
        for (target in targets) {
            assert(target.exists()) { "$target is not found. Execute 'ant -f update_dependencies.xml' and 'ant dist' before running tests" }
        }
        targets
    }

    override protected fun compileNative(source: File, target: File) {
        runProcess("/usr/bin/c++ --std=c++11 -fPIC -stdlib=libstdc++ -dynamiclib $source -o $target")
    }
}
