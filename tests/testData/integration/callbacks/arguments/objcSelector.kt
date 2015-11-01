package test

import kni.objc.*
import objc.*

fun main(args: Array<String>) {
    A.invoke(fun(sel: ObjCSelector) {
        A.checkIfEqualsToInvoke(sel)
    })
}
