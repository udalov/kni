package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.NativeIndexingOptions
import java.io.File

fun main(args: Array<String>) {
    val file = "../kotlin/compiler/testData/objc/java/simpleClassObject.h"
    val tu = buildNativeIndex(File(file), NativeIndexingOptions(objC = true))
    generateStub(tu, File("libKNITest.dylib"), File("out/kni-stub.kt"), NativeIndexingOptions(objC = true))
}
