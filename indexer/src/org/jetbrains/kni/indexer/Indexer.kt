package org.jetbrains.kni.indexer

import org.jetbrains.kni.indexer.NativeIndex.TranslationUnit
import java.io.File
import java.util.ArrayList

public enum class Language {
    CPP
    OBJC
}

public data class IndexerOptions(
        public val language: Language,
        public val includePaths: Iterable<String> = listOf()
) {
    fun toParams(): Iterable<String> =
            ( listOf(
                    if (language == Language.OBJC) "-ObjC" else null,
                    if (language == Language.CPP) "-c++" else null
              )
              + includePaths.map { "-I$it" }
            )
            .filterNotNull()
}

public fun buildNativeIndex(headerFile: File, options: IndexerOptions): TranslationUnit {
    val args: ArrayList<String> = arrayListOf(headerFile.getPath())
    args.addAll(options.toParams())
    val bytes = IndexerNative.buildNativeIndex(args.toArray(array<String>()))
    return TranslationUnit.parseFrom(bytes)
}
