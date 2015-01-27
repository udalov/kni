
package test

import kotlin.*

fun main(args: Array<String>) {
    val iface = native.get_iface_struct1_h("KNITest")
    val runtime = jnr.ffi.Runtime.getRuntime(iface)
    val s = native.abcd(runtime)
    s.i = 10
    val res = iface.getfromabcd(s)
    if (res != 10)
        print("Fail ($res)")
    else
        print("OK")
}
