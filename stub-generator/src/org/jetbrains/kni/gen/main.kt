package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.IndexerOptions
import java.io.File
import org.jetbrains.kni.indexer.Language

fun main(args: Array<String>) {
    val file = "tests/testData/integration/simpleClassObject.h"
    val indexerOptions = IndexerOptions(Language.OBJC)
    val tu = buildNativeIndex(File(file), indexerOptions)
    generateStub(tu, File("libKNITest.dylib"), File("out/kni-stub.kt"), GeneratorOptions(InteropRuntime.ObjC))
}
