package org.jetbrains.kni.jnrator

import org.jetbrains.kni.gen.GeneratorOptions
import org.jetbrains.kni.gen.InteropRuntime
import org.jetbrains.kni.gen.generateStub
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language
import org.jetbrains.kni.indexer.buildNativeIndex
import java.io.File
import java.util.regex.Pattern

fun dequote(arg: String): String = arg.trim().removeSurrounding("\"")

// Multiple read iterator
// Contains a "hole" - if incoming iterator is operated outside the class, the behavior could be inconsistent
// \todo think about more reliable approach, copy source iterator or something like this
class TruIterator<T>(val iterator: Iterator<T>) {
    val internalValue: T? = if (iterator.hasNext()) iterator.next() else null
    val valid: Boolean get() = internalValue != null
    val value: T get() = internalValue ?: throw java.util.NoSuchElementException()
    val hasNext: Boolean = iterator.hasNext()
    val next: TruIterator<T> by lazy { TruIterator(iterator) }
}

abstract class OptionBase {
    abstract fun match(args: TruIterator<String>): Boolean
    abstract fun consume(args: TruIterator<String>): TruIterator<String>
}

abstract class KeyOptionBase(val keys: List<String>, val description: String) : OptionBase() {
    override fun match(args: TruIterator<String>): Boolean =
            args.value in keys
}

class SwitchOption(
        keys: List<String>, description: String, val process: (key: String) -> Unit
) : KeyOptionBase(keys, description) {
    override fun consume(args: TruIterator<String>): TruIterator<String> {
        process(args.value)
        return args.next
    }
}

class ArgumentOption<T>(
        keys: List<String>, description: String,
        val mapper: (arg: String) -> T,
        val process: (arg: T) -> Unit
) : KeyOptionBase(keys, description) {
    override fun consume(args: TruIterator<String>): TruIterator<String> {
        if (!args.hasNext) throw Exception("argument expected")
        val argIt = args.next
        process(mapper(argIt.value))
        return argIt.next
    }
}

class ListOption<T>(
        keys: List<String>, description: String,
        val splitRE: Pattern,
        val mapper: (arg: String) -> T,
        val process: (args: Iterable<T>) -> Unit
) : KeyOptionBase(keys, description) {
    override fun consume(args: TruIterator<String>): TruIterator<String> {
        if (!args.hasNext) throw Exception("argument expected")
        val argIt = args.next
        process(argIt.value.split(splitRE).map { mapper(dequote(it)) })
        return argIt.next
    }
}

class FreeOption<T>(
        val mapper: (arg: String) -> T,
        val process: (arg: T) -> Unit,
        val matcher: (arg: String) -> Boolean = { true }
) : OptionBase() {
    override fun match(args: TruIterator<String>): Boolean = matcher(args.value)

    override fun consume(args: TruIterator<String>): TruIterator<String> {
        process(mapper(args.value))
        return args.next
    }
}

fun parseArgs(args: Iterable<String>, options: Collection<OptionBase>) {
    assert(options.any())
    var iter = TruIterator(args.map{ dequote(it) }.iterator())
    while (iter.valid) {
        var processed = false
        for (option in options)
            if (option.match(iter)) {
                iter = option.consume(iter)
                processed = true
                break // for
            }
        if (!processed)
            throw Exception("Unknown argument '${iter.value}'")
    }
}

fun optionsString(options: Collection<OptionBase>, linePrefix: String = "    ") : String =
    options.filter { it is KeyOptionBase }
           .map { val o = it as KeyOptionBase; "${o.keys.joinToString(", ")}   :   ${o.description}" }
           .joinToString("\n" + linePrefix, prefix = linePrefix)

// ------------------------------

class Params {
    val inputFiles = arrayListOf<File>()
    var inputLanguage : Language? = null
    val inputIncludeDirs = arrayListOf<String>()
    var nativeLibrary : File? = null
    val additionalIndexingArgs = arrayListOf<String>()
    var stubTarget : File? = null
    var multiFileStub : Boolean? = null
    var interopRuntime : InteropRuntime? = null
    var verbose = false
    var debugDumps = false
    var help = false
    var parsingMsg = ""
    var helpText = ""
}

val objcLanguageNames = hashSetOf("objc", "obj-c", "objectivec", "objective-c")
val cppLanguageNames = hashSetOf("c", "c++", "cpp", "cplusplus", "c/c++")
val objcRuntimeNames = objcLanguageNames
val jnrRuntameNames = hashSetOf("jnr")

val pathsListSeparatorRe = Pattern.compile("[:;]") // \todo make platform-dependent, e.g. for windows it should be only ';'


// \todo de-quoting
fun parseCmdLine(args: Array<String>): Params {
    val params = Params()
    val kniratorOptions = listOf(
            SwitchOption(listOf("-h", "--help"), "display help", { params.help = true }),
            ArgumentOption(
                    listOf("-l", "--lang", "--language"),
                    "source language; c/c++ or obj-c",
                    { when (it.toLowerCase()) {
                        in objcLanguageNames -> Language.OBJC
                        in cppLanguageNames -> Language.CPP
                        else -> throw Exception("Unrecognized language '$it'") } },
                    { if (params.inputLanguage != null) throw Exception("Language already specified to '${params.inputLanguage}'")
                      params.inputLanguage = it
                      if (params.interopRuntime != null && (
                            (params.inputLanguage == Language.OBJC && params.interopRuntime == InteropRuntime.JNR) ||
                            (params.inputLanguage == Language.CPP && params.interopRuntime == InteropRuntime.ObjC)))
                        throw Exception("Specified runtime '${params.interopRuntime}' is not compatible with language '$it'; it is enough to specify only language or runtime correctly")
                    }),
            ArgumentOption(
                    listOf("-r", "--rt", "--runtime"),
                    "target interop runtime: obj-c for obj-c language, jnr for c/c++",
                    { when (it.toLowerCase()) {
                        in objcRuntimeNames -> InteropRuntime.ObjC
                        in jnrRuntameNames -> InteropRuntime.JNR
                        else -> throw Exception("Unrecognized runtime '$it'") }},
                    { if (params.interopRuntime != null) throw Exception("Runtime already specified to '${params.interopRuntime}'")
                      params.interopRuntime = it
                      if (params.inputLanguage != null && (
                            (params.inputLanguage == Language.OBJC && params.interopRuntime == InteropRuntime.JNR) ||
                            (params.inputLanguage == Language.CPP && params.interopRuntime == InteropRuntime.ObjC)))
                        throw Exception("Specified language '${params.inputLanguage}' is not compatible with runtime '$it'; it is enough to specify only language or runtime correctly")
                    }),
            SwitchOption(listOf("-v", "--verbose"), "verbose output", { params.verbose = true }),
            SwitchOption(listOf("-d", "--dbg", "--debug"), "intermediate debug output", { params.debugDumps = true }),
            ArgumentOption(listOf("-n", "--native", "--lib", "--library"),
                           "path to native library to use at runtime",
                           { File(it) },
                           { if (!it.exists()) throw Exception("Library '$it' not found")
                             params.nativeLibrary = it
                           }),
            ArgumentOption(listOf("-t", "--target"),
                           "path to stub target",
                           { File(it) },
                           { if (it.isDirectory) {
                                 if (!it.exists()) throw Exception("Target directory '$it' not found")
                                 if (params.multiFileStub != null && params.multiFileStub == false)
                                     throw Exception("Target directory '$it' not found")
                             }
                             params.stubTarget = it
                           }),
            ListOption(listOf("-i", "--include", "--includes"),
                       "",
                       pathsListSeparatorRe,
                       { it },
                       { it.forEach {
                               val file = File(it)
                               if (!file.exists()) throw Exception("Include path '$file' not found")
                               params.inputIncludeDirs.add(it)
                           }
                       }),
            FreeOption({ File(it) }, { params.inputFiles.add(it) }, matcher = { !it.startsWith('-') })
            )

    if (args.none()) params.help = true
    else
        try {
            parseArgs(args.asIterable(), kniratorOptions)

            // validation and completing
            if (params.inputLanguage == null && params.interopRuntime == null)
                throw Exception("Neither language nor runtime is specified")
        }
        catch (e: Exception) {
            params.parsingMsg = e.message ?: e.toString()
            params.help = true
        }
    if (params.help) {
        params.helpText =
            "knirator - native interop stub generator for kotlin\n" +
            "usage: knirator [<options>] <sources>\n" +
            "where possible <options> are:\n" +
            optionsString(kniratorOptions)
    }
    return params
}

fun main(args: Array<String>) {
    val params = parseCmdLine(args)
    if (params.parsingMsg.isNotEmpty())
        System.err.println(params.parsingMsg)
    if (params.help)
        println(params.helpText)
    else {
        val indexerOptions = IndexerOptions(
                params.inputLanguage!!,
                includePaths = params.inputIncludeDirs,
                verbose = params.verbose,
                debugDump = params.debugDumps,
                debugDumpTarget = if (params.stubTarget!!.isDirectory) params.stubTarget!! else params.stubTarget!!.parentFile
        )
        for (src in params.inputFiles) {
            val tu = buildNativeIndex(src, indexerOptions)
            generateStub(tu, params.nativeLibrary!!, params.stubTarget!!, GeneratorOptions(params.interopRuntime!!))
        }
    }
}
