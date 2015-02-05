package org.jetbrains.kni.indexer

import org.jetbrains.kni.indexer.NativeIndex.TranslationUnit
import java.io.File

public enum class Language {
    CPP
    OBJC
}

public data class IndexerOptions(
        public val language: Language
) {
    fun toParams(): String =
            listOf(
                    if (language == Language.OBJC) "-ObjC" else null,
                    if (language == Language.CPP) "-c++" else null
            ).filterNotNull().join(" ")
}

public fun buildNativeIndex(headerFile: File, options: IndexerOptions): TranslationUnit {
    val bytes = IndexerNative.buildNativeIndex("${headerFile.getPath()} ${options.toParams()}")
    return TranslationUnit.parseFrom(bytes)
}
