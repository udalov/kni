
package org.jetbrains.kni.quickchecks

import java.io.File
import java.nio.file.Paths

public fun runProcess(command: Collection<String>): Pair<Boolean, String> {
    // println(command.joinToString(" "))
    val process = Runtime.getRuntime().exec(command.copyToArray())
    process.waitFor()

    val result = process.getInputStream().reader().use { it.readText() }
    val error = process.getErrorStream().reader().use { it.readText() }
    // System.err.print(error)

    fun format_res(str: String, result: String) = if (!result.isEmpty()) ", $str: \n$result\n" else ""

    val exitCode = process.exitValue()
//    assert(exitCode == 0) { "Process exited with code $exitCode${format_res("result", result)}${format_res("error", error)}" }

    return Pair(exitCode == 0,
                if (exitCode == 0) result
                else "Process exited with code $exitCode${format_res("result", result)}${format_res("error", error)}")
}

public fun escape4cli(s: String): String = if (s.contains(" ")) "\"$s\"" else s


public fun compileNativeC(source: File, target: File): Pair<Boolean, String> =
    runProcess(arrayListOf("c++", "--std=c++11", "-fPIC", "-stdlib=libstdc++", "-dynamiclib", source.getAbsolutePath(), "-o", target.getAbsolutePath()))


public fun compileKotlin(file: File, destination: File, classpath: Collection<File>): Pair<Boolean, String> {
    val kotlinc = File("lib/kotlinc/bin/kotlinc")
    return runProcess(arrayListOf(kotlinc.getAbsolutePath(), escape4cli(file.getAbsolutePath()),
                                  "-d", destination.getAbsolutePath(), "-cp",
                                  classpath.map { escape4cli(it.getAbsolutePath()) }.joinToString(File.pathSeparator)))
}

public fun runKotlin(commandLine: Iterable<String>, classpath: Iterable<File>, kotlinLibs: Iterable<File>, libpath: File? = null): Pair<Boolean, String> {
    val baseLibs = classpath.toArrayList()
    baseLibs.add(File("lib/kotlinc/lib/kotlin-runtime.jar"))
    val cp = kotlinLibs
            .toCollection( baseLibs)
            .map { escape4cli(it.getAbsolutePath()) }
            .joinToString(File.pathSeparator)
    val javaBin = Paths.get(System.getProperty("java.home"), "bin", "java")
    return runProcess(arrayListOf(javaBin.toString(),
                                  if (libpath == null) "" else "-Djava.library.path=${escape4cli(libpath.getAbsolutePath())}",
                                  "-cp", cp) +
                      commandLine)
}

