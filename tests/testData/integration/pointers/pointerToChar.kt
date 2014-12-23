package test

import kni.objc.*
import objc.A

fun main(args: Array<String>) {
    val o = Pointer.pointerToChar('O')
    val k = Pointer.pointerToChar('K')
    A.printTwoChars(o, k)
    o.release()
    k.release()
}
