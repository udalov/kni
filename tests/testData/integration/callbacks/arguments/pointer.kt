package test

import kni.objc.*
import objc.*

fun main(args: Array<String>) {
    A.invoke {
        (pointer: Pointer<*>): Unit -> A.checkIfEqualsToThis(pointer)
    }
}
