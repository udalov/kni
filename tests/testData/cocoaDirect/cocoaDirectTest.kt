
package test

import objc.*

fun main(args: Array<String>) {
    val app = NSApplication.sharedApplication() as NSApplication
    print(if (app.isRunning()) "Strange" else "OK")
}
