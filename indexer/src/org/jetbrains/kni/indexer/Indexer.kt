package org.jetbrains.kni.indexer

import org.jetbrains.kni.indexer.NativeIndex.TranslationUnit
import java.io.File

public fun buildNativeIndex(headerFile: File): TranslationUnit {
    val bytes = IndexerNative.buildNativeIndex(headerFile.getPath())
    return TranslationUnit.parseFrom(bytes)
}
