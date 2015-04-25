package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import org.jetbrains.kni.indexer.buildNativeIndex
import java.io.File

fun main(args: Array<String>) {
    val file = "tests/testData/integration/simpleClassObject.h"
    val indexerOptions = IndexerOptions(Language.OBJC)
    val tu = buildNativeIndex(File(file), indexerOptions)
    generateStub(tu, File("libKNITest.dylib"), File("out/kni-stub.kt"), GeneratorOptions(InteropRuntime.ObjC))
}
