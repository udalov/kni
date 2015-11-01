package test

import native.*
import org.junit.Test
import org.junit.Assert.*

class NativeTest {
    Test fun test() {
        val iface = get_iface_windows_h("/usr/local/lib/wine/kernel32.dll.so")
    }
}
