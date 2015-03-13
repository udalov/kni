
package test

import native.*

val fn1 = { (a: Int) ->  a * 10 }
val fn2 = { (a: Int, b: String) -> a + b.length() * 2 }

fun main(args: Array<String>) {
    val iface = native.get_iface_callbacks_hpp("KNITest")
    val runtime = jnr.ffi.Runtime.getRuntime(iface)
    var msg = ""

    val res1 = iface.callfn1(fn1)
    val expres1 = fn1(42)

    val res2 = iface.callfn2(fn2)
    val expres2 = fn2(42,"42")

    val st1 = native.iface_callbacks_hpp.cbwrapper(runtime)
    st1.cb1.set(object : native.iface_callbacks_hpp.fn_Int_Int { override fun invoke(p1: Int) = fn1(p1) })
    st1.cb2.set(object : native.iface_callbacks_hpp.fn_Int_String_Int { override fun invoke(p1: Int, p2: String) = fn2(p1, p2) })

    val res3 = iface.callwrapper(st1)

    if (res1 != expres1)
        msg = msg + "\ncallfn1(fn1)==$res1; fn1(42)==$expres1"
    if (res2 != expres2)
        msg = msg + "\ncallfn2(fn2)==$res2; fn2(42,\"42\")==$expres2"
    if (res3 != expres1 + expres2)
        msg = msg + "\ncallwrapper(st1)==$res3; expected==${expres1 + expres2}"

    if (msg.length() > 0)
        print("Fail: '$msg'")
    else
        print("OK")
}
