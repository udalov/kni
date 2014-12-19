package kni.objc

import java.util.HashSet

private val loadedLibraries = HashSet<String>()

public fun loadLibrary(fileName: String) {
    if (loadedLibraries.add(fileName)) {
        Native.dlopen(fileName)
    }
}
