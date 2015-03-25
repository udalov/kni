
package test

import objc.NSApp

fun main(args: Array<String>) {
    println(if (NSApp.isRunning()) "running!" else "error")
}
