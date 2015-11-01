package test

import objc.*

fun main(args: Array<String>) {
    PrintingServices.invokeOnPrinter(fun(p: Printer) {
        p.printOK()
    })
}
