package org.jetbrains.kni.gen

import org.jetbrains.kni.indexer.NativeIndex.TranslationUnit
import java.io.File

public enum class InteropRuntime {
    ObjC
    JNR
}

public enum class LexicalScope {
    General
    Record
}

public enum class CharStringType {
    Ascii
    Utf8
}

enum class OverrideQualifier {
    none
    `open`
    `override`
}

public class GeneratorOptions(
        public val runtime: InteropRuntime,
        public val charStringType: CharStringType = CharStringType.Ascii
) {}

public fun generateStub(
        translationUnit: TranslationUnit,
        nativeLib: File,
        outputFile: File,
        generatorOptions: GeneratorOptions,
        basePackageName: String = ""
): Iterable<File> {

    val namer = Namer(translationUnit, outputFile,
                      if (basePackageName.length() != 0) basePackageName
                      else when (generatorOptions.runtime) {
                          InteropRuntime.ObjC -> "objc"
                          InteropRuntime.JNR -> "native"
                          else -> error("Unknown runtime ${generatorOptions.runtime}")
                      } )

    val outputPath = if (outputFile.isDirectory()) outputFile.getPath() else outputFile.getParent()

    var generator: GeneratorBase = when (generatorOptions.runtime) {
        InteropRuntime.ObjC -> ObjCGenerator(outputPath, namer, nativeLib, generatorOptions)
        InteropRuntime.JNR -> CPPGenerator(outputPath, namer, nativeLib, generatorOptions)
        else -> error("Unknown runtime: ${generatorOptions.runtime}")
    }

    generator.generate(translationUnit)
    return generator.closeOutputs()
}

