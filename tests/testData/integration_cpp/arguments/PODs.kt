
package test

fun main(args: Array<String>) {
    val iface = native.get_iface_PODs_h("KNITest")
    // \todo find out why boolean is mapped to int in the first arg
    if (iface.ifathenbelsec(1, 1, 2) != 1 || iface.ifathenbelsec(0, 1, 2) != 2)
        print("Fail")
    else
        print("OK")
}

