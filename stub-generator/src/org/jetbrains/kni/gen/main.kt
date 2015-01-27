package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.NativeIndexingOptions
import java.io.File
import org.jetbrains.kni.indexer.Language

fun main(args: Array<String>) {
    val file = "tests/testData/integration/simpleClassObject.h"
    val options = NativeIndexingOptions(Language.OBJC)
    val tu = buildNativeIndex(File(file), options)
    generateStub(tu, File("libKNITest.dylib"), File("out/kni-stub.kt"), options, InteropRuntime.ObjC)
}
