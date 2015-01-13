package org.jetbrains.kni.tests

import java.io.File
import java.nio.file.Files
import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.NativeIndexingOptions
import org.jetbrains.kni.gen.generateStub
import org.junit.Assert
import kotlin.properties.Delegates
import java.util.Arrays
import java.nio.file.Paths
import com.jcabi.aether.Aether
import org.sonatype.aether.util.artifact.DefaultArtifact
import org.sonatype.aether.repository.RemoteRepository
import org.sonatype.aether.util.artifact.JavaScopes
import org.apache.maven.project.MavenProject

abstract class AbstractIntegrationTest(val options: NativeIndexingOptions) {
    private val kniObjCRuntime: File by Delegates.lazy {
        val target = File("dist/kni-objc-runtime.jar")
        assert(target.exists()) { "$target is not found. Execute 'ant dist' before running tests" }
        target
    }

    private val knJNRLibs: Iterable<File> by Delegates.lazy {
        val jnrref = "com.github.jnr:jnr-ffi:2.0.1"
        val localRepo: File = File("lib")
        val remoteRepos: MutableList<RemoteRepository> = Arrays.asList(RemoteRepository("maven-central", "default", "http://repo1.maven.org/maven2/"))
        val deps = Aether(remoteRepos, localRepo).resolve(DefaultArtifact(jnrref), JavaScopes.RUNTIME)
        deps?.map { File(it.getFile().path) } ?: arrayListOf()
    }

    protected fun doTest(source: String) {
        val header = File(source.replace(".kt", ".h")).getAbsoluteFile()
        val implementation = File(source.replace(".kt", ".m")).getAbsoluteFile()
        val kotlinSource = File(source).getAbsoluteFile()

        val tmpdir = Files.createTempDirectory("knitest").toFile()
        val dylib = File(tmpdir, "libKNITest.dylib")

        compileNative(implementation, dylib)

        val stubSource = File(tmpdir, kotlinSource.getPath().substringAfterLast(File.separator))
        generateStub(buildNativeIndex(header, options), dylib, stubSource, options)
        val stubClasses = File(tmpdir, "stub")
        compileKotlin(stubSource, stubClasses, knJNRLibs + kniObjCRuntime)

        val mainClasses = File(tmpdir, "main")
        compileKotlin(kotlinSource, mainClasses, listOf(kniObjCRuntime, stubClasses))

        val result = runKotlin(mainClasses, stubClasses)
        Assert.assertEquals("OK", result)
    }

    abstract protected fun compileNative(source: File, target: File)

    private fun compileKotlin(file: File, destination: File, classpath: List<File>) {
        val kotlinc = File("lib/kotlinc/bin/kotlinc").getAbsoluteFile()
        val cp = classpath.joinToString(File.pathSeparator)
        runProcess("$kotlinc $file -d $destination -cp $cp")
    }

    private fun runKotlin(vararg classpath: File): String {
        // causes compiler error
        //val cp = listOf(*classpath, kniObjCRuntime, File("lib/kotlinc/lib/kotlin-runtime.jar"))
        val cp = (classpath.toArrayList() + kniObjCRuntime + File("lib/kotlinc/lib/kotlin-runtime.jar"))
                .map { it.getAbsolutePath() }
                .joinToString(File.pathSeparator)
        return runProcess("java -cp $cp test.TestPackage")
    }

    protected fun runProcess(command: String): String {
        val process = Runtime.getRuntime().exec(command)
        process.waitFor()

        val result = process.getInputStream().reader().use { it.readText() }
        val error = process.getErrorStream().reader().use { it.readText() }
        System.err.print(error)

        val exitCode = process.exitValue()
        assert(exitCode == 0) { "Process exited with code $exitCode, result: $result" }

        return result
    }
}
