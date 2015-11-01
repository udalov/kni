package kni.objc

import java.util.*

private val loadedLibraries = HashSet<String>()

fun loadLibrary(fileName: String) {
    if (loadedLibraries.add(fileName)) {
        Native.dlopen(fileName)
    }
}
