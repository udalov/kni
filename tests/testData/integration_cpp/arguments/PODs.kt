package test

fun main(args: Array<String>) {
    val iface = native.get_iface_PODs_hpp("KNITest")
    // \todo find out why boolean is mapped to int in the first arg
    var fail = (iface.ifathenbelsec(true, 1, 2) != 1) || (iface.ifathenbelsec(false, 1, 2) != 2)
    var msg = "ifathenbelsec"
    fail = fail || (iface.stringlen("abcd") != 4)
    msg = "strlen"
    if (fail)
        print("Fail: '$msg'")
    else
        print("OK")
}
