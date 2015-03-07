
package test

import native.*

val fn1 = { (a: Int) ->  a * 10 }
val fn2 = { (a: Int, b: String) -> a + b.length() * 2 }

fun main(args: Array<String>) {
    val iface = native.get_iface_callbacks_hpp("KNITest")
    var msg = ""
    val res1 = iface.callfn1(fn1)
    val expres1 = fn1(42)
    val res2 = iface.callfn2(fn2)
    val expres2 = fn2(42,"42")
    if (res1 != expres1)
        msg = msg + "\ncallfn1(fn1)==$res1; fn1(42)==$expres1"
    if (res2 != expres2)
        msg = msg + "\ncallfn2(fn2)==$res2; fn2(42,\"42\")==$expres2"
    if (msg.length() > 0)
        print("Fail: '$msg'")
    else
        print("OK")
}
