package test

import objc.A

fun main(args: Array<String>) {
    A.invokeWithABC(fun(a: Char, b: Char, c: Char) {
        if ("$a$b$c" == "ABC")
            print("OK")
        else
            print("Fail $a$b$c")
    })
}
