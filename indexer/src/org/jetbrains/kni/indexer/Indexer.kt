package org.jetbrains.kni.indexer

import com.google.protobuf.TextFormat
import org.jetbrains.kni.indexer.NativeIndex.TranslationUnit
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

enum class Language {
    CPP,
    OBJC
}

data class IndexerOptions(
        val language: Language,
        val verbose: Boolean = false,
        val debugDump: Boolean = false,
        val debugDumpTarget: File? = null,
        val includePaths: Collection<String> = listOf(),
        val args: Collection<String> = listOf()
) {

    fun toParams(): Iterable<String> {
        val res = arrayListOf<String>()
        if (language == Language.OBJC) res.add("-ObjC")
        if (language == Language.CPP) res.addAll(listOf("-c++", "--std=c++11", "-fPIC", "-stdlib=libstdc++"))
        if (verbose) res.add("---v")
        if (debugDump) if (debugDumpTarget == null) res.add("---d")
                       else if (debugDumpTarget.toString().contains(" ")) res.add("\"---d=$debugDumpTarget\"")
                            else res.add("---d=$debugDumpTarget")
        res.addAll(includePaths.map { "-I$it" })
        res.addAll(args)
        return res.filterNotNull()
    }
}

public fun buildNativeIndex(headerFile: File, options: IndexerOptions): TranslationUnit {
//    val args: ArrayList<String> = arrayListOf(headerFile.getPath())
//    args.addAll(options.toParams())
    val bytes = IndexerNative.buildNativeIndex((options.toParams() + headerFile.path).toTypedArray())
    return TranslationUnit.parseFrom(bytes)
}

public fun buildNativeIndexCli(kniidxPath: String, headerFile: File, options: IndexerOptions, useBinary: Boolean = false): TranslationUnit {
    val rt = Runtime.getRuntime()
    val kniidx = if (kniidxPath.length == 0) File("kniidx") else File(kniidxPath, "kniidx")
    if (!kniidx.exists() || !kniidx.isFile || !kniidx.canExecute())
        throw Exception("Invalid kniidx executable: $kniidx")
    val args = arrayListOf(kniidx.path, headerFile.path)
    args.addAll(options.toParams())
    if (useBinary) args.add("---b")
    val proc = rt.exec(args.toTypedArray())
    if (useBinary) {
        return TranslationUnit.parseFrom(proc.inputStream)
    }
    val out = BufferedReader(InputStreamReader(proc.inputStream))
    val builder = TranslationUnit.newBuilder()
    TextFormat.merge(out, builder)
    return builder.build()
}
