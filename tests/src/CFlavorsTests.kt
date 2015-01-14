
package org.jetbrains.kni.tests

import org.jetbrains.kni.indexer.NativeIndexingOptions
import java.io.File
import kotlin.properties.Delegates
import com.jcabi.aether.Aether
import org.sonatype.aether.util.artifact.DefaultArtifact
import org.sonatype.aether.repository.RemoteRepository
import org.sonatype.aether.util.artifact.JavaScopes
import org.apache.maven.project.MavenProject
import java.util.Arrays

public abstract class ObjCTest : AbstractIntegrationTest(NativeIndexingOptions(objC = true)) {

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


public abstract class CPlusPlusTest : AbstractIntegrationTest(NativeIndexingOptions(CPlusPlus = true)) {

    override protected fun src2header(source: String): String = source.replace(".kt", ".h")
    override protected fun src2implementation(source: String): String = source.replace(".kt", ".cpp")

    override protected val kotlinLibs: List<File> by Delegates.lazy {
        val jnrref = "com.github.jnr:jnr-ffi:2.0.1"
        val localRepo: File = File("lib")
        val remoteRepos: MutableList<RemoteRepository> = Arrays.asList(RemoteRepository("maven-central", "default", "http://repo1.maven.org/maven2/"))
        val deps = Aether(remoteRepos, localRepo).resolve(DefaultArtifact(jnrref), JavaScopes.RUNTIME)
        deps?.map { File(it.getFile().path) } ?: arrayListOf()
    }

    override protected fun compileNative(source: File, target: File) {
        runProcess("/usr/bin/clang --std=c++11 -stdlib=libstdc++ -dynamiclib $source -o $target")
    }
}