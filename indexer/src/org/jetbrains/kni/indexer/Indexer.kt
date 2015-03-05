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
        public val verbose: Boolean = false,
        public val debugDump: Boolean = false,
        public val includePaths: Collection<String> = listOf(),
        public val args: Collection<String> = listOf()) {

    fun toParams(): Iterable<String> {
        val res = arrayListOf<String>()
        if (language == Language.OBJC) res.add("-ObjC")
        if (language == Language.CPP) res.addAll(listOf("-c++", "--std=c++11", "-fPIC", "-stdlib=libstdc++"))
        if (verbose) res.add("---v")
        if (debugDump) res.add("---d")
        res.addAll(includePaths.map { "-I$it" })
        res.addAll(args)
        return res.filterNotNull()
    }
}

public fun buildNativeIndex(headerFile: File, options: IndexerOptions): TranslationUnit {
//    val args: ArrayList<String> = arrayListOf(headerFile.getPath())
//    args.addAll(options.toParams())
    val bytes = IndexerNative.buildNativeIndex((options.toParams() + headerFile.getPath()).toArrayList().toArray(array<String>()))
    return TranslationUnit.parseFrom(bytes)
}
