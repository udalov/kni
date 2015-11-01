package test

import objc.A

fun main(args: Array<String>) {
    A.invokeWithTrueAndFalse(fun(t: Boolean, f: Boolean) {
        if (t && !f)
            print("OK")
        else
            print("Fail $t $f")
    })
}
