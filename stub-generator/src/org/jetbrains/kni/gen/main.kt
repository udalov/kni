package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.buildNativeIndex
import java.io.File

fun main(args: Array<String>) {
    val file = "../kotlin/compiler/testData/objc/java/simpleClassObject.h"
    val tu = buildNativeIndex(File(file))
    generateStub(tu, File("libKNITest.dylib"), File("out"))
}
