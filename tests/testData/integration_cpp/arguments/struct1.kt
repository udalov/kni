
package test

import kotlin.*
import jnr.ffi.types.*

fun main(args: Array<String>) {
    val iface = native.get_iface_struct1_hpp("KNITest")
    val runtime = jnr.ffi.Runtime.getRuntime(iface)
    val st1 = native.abcd(runtime)
    val sz_i = jnr.ffi.Struct.size(st1)

    st1.i.set(100)
    val res0 = iface.setabcdi(st1, 10)
    st1.i.set(201)
    val res1 = iface.setabcdi(st1, 20)
    val res = iface.getfromabcd(st1)
    if (res != 20)
        print("Fail ($res0 - $res1 - $res) (interop sz == $sz_i; native sz == ${iface.getabcdsize()}, addr == ${iface.getabcdaddr(st1)})")
    else
        print("OK")
}
