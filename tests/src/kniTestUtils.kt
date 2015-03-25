
package org.jetbrains.kni.tests

import java.io.File
import java.nio.file.Paths
import kotlin.concurrent.thread

public fun runProcess(command: Collection<String>): Pair<Boolean, String> {
    // println(command.joinToString(" "))
    val process = ProcessBuilder(command.toArrayList()).redirectErrorStream(false).start()
    val result = StringBuilder()
    val error = StringBuilder()
    // read one stream in a separated thread, and another right here, to avoid java's exec deadlock
    val stderrThread = thread { process.getErrorStream().reader().forEachLine { result.appendln(it) } }
    process.getInputStream().reader().forEachLine { result.appendln(it) }
    process.waitFor()
    stderrThread.join()

    //print(result.toString())
    //System.err.print(error.toString())

    fun format_res(str: String, result: String) = if (!result.isEmpty()) ", $str: \n$result\n" else ""

    val exitCode = process.exitValue()
//    assert(exitCode == 0) { "Process exited with code $exitCode${format_res("result", result.toString())}${format_res("error", error.toString())}" }

    return Pair(exitCode == 0,
                if (exitCode == 0) result.toString()
                else "Process exited with code $exitCode${format_res("result", result.toString())}${format_res("error", error.toString())}")
}

public fun escape4cli(s: String): String = if (s.contains(" ")) "\"$s\"" else s


public fun compileNativeC(source: File, target: File): Pair<Boolean, String> =
        runProcess(arrayListOf("c++", "--std=c++11", "-fPIC", "-stdlib=libstdc++", "-dynamiclib", source.getAbsolutePath(), "-o", target.getAbsolutePath()))

public fun compileObjC(source: File, target: File): Pair<Boolean, String> =
    runProcess(arrayListOf("clang", "-ObjC", "-dynamiclib", "-framework", "Foundation", source.getAbsolutePath(), "-o", target.getAbsolutePath()))


public fun compileKotlin(file: File, destination: File, classpath: Collection<File>): Pair<Boolean, String> {
    val kotlinc = File("lib/kotlinc/bin/kotlinc")
    val kotlincompiler = File("lib/kotlinc/lib/kotlin-compiler.jar")
    val javaBin = Paths.get(System.getProperty("java.home"), "bin", "java")
    return runProcess(
            arrayListOf(javaBin.toString(), "-d64", "-jar", kotlincompiler.getAbsolutePath(), escape4cli(file.getAbsolutePath()),
                        "-d", destination.getAbsolutePath(), "-cp",
                        classpath.map { escape4cli(it.getAbsolutePath()) }.joinToString(File.pathSeparator)))
}

public fun runKotlin(commandLine: Iterable<String>, classpath: Iterable<File>, libpath: File? = null): Pair<Boolean, String> {
    val baseLibs = classpath.toArrayList()
    baseLibs.add(File("lib/kotlinc/lib/kotlin-runtime.jar"))
    val cp = baseLibs
            .map { escape4cli(it.getAbsolutePath()) }
            .joinToString(File.pathSeparator)
    val javaBin = Paths.get(System.getProperty("java.home"), "bin", "java")
    return runProcess(arrayListOf(javaBin.toString(),
                                  if (libpath == null) "" else "-Djava.library.path=${escape4cli(libpath.getAbsolutePath())}",
                                  "-cp", cp) +
                      commandLine)
}

