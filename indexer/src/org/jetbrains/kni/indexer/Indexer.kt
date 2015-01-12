package org.jetbrains.kni.indexer

import org.jetbrains.kni.indexer.NativeIndex.TranslationUnit
import java.io.File

public data class NativeIndexingOptions(
        public val objC: Boolean = false,
        public val CPlusPlus: Boolean = false
) {
    private fun toParam(v: Boolean, s: String) = if (v) s else null
    internal fun toParams(): String =
            listOf( toParam(objC, "-ObjC"),
                    toParam(CPlusPlus, "-c++"))
                  .filterNotNull().join(" ")
}

public fun buildNativeIndex(headerFile: File, options: NativeIndexingOptions): TranslationUnit {
    val bytes = IndexerNative.buildNativeIndex( "${headerFile.getPath()} ${options.toParams()}")
    return TranslationUnit.parseFrom(bytes)
}
