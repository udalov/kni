package test

import kni.objc.*
import objc.*

fun main(args: Array<String>) {
    A.invoke(fun(pointer: Pointer<*>) {
        A.checkIfEqualsToThis(pointer)
    })
}
