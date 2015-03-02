
package org.jetbrains.kni.quickchecks

import java.io.File

public fun runProcess(command: String): Pair<Boolean, String> {
    //println(command)
    val process = Runtime.getRuntime().exec(command)
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

public fun compileNativeC(source: File, target: File): Pair<Boolean, String> =
    runProcess("/usr/bin/c++ --std=c++11 -fPIC -stdlib=libstdc++ -dynamiclib $source -o $target")



