package org.jetbrains.kni.jnrator

import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.IndexerOptions
import java.io.File
import org.jetbrains.kni.indexer.Language
import org.jetbrains.kni.gen.generateStub
import org.jetbrains.kni.gen.GeneratorOptions
import org.jetbrains.kni.gen.InteropRuntime

fun main(args: Array<String>) {
    val file = "/usr/local/opt/llvm/include/clang-c/Index.h"
    val indexerOptions = IndexerOptions(Language.CPP, includePaths = listOf("/usr/local/opt/llvm/include"))
    val tu = buildNativeIndex(File(file), indexerOptions)
    val srcIndex = File("out/kni-jnr-stub.idx")
    srcIndex.writeText(tu.toString())
    generateStub(tu, File("libKNITest.dylib"), File("out/kni-jnr-stub.kt"), indexerOptions, GeneratorOptions(InteropRuntime.JNR))
}
