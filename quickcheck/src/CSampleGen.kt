
package org.jetbrains.kni.quickchecks

import java.util.stream.IntStream


public data class CTypedId(public val name: String, public val type: String) {}

public class CSimpleFunc(
        public val name: String,
        public val retType: String,
        public val params: Collection<CTypedId>,
        public val body: String) {

    public fun signature(): String = "$retType $name(${params.map { "${it.type} ${it.name}" }.joinToString(", ")})"
    public fun declaration(): String = signature() + ";"
    public fun definition(): String = "${signature()}{\n$body;\n}"
}


public class CSimpleTransUnit(
        public val name: String,
        public val headerName: String,
        public val guard: String,
        public val includes: Collection<String>,
        public val funcs: Collection<CSimpleFunc>) {

    public fun header(): String =
"""
#ifndef $guard
#define $guard

${includes.map { "#include \"$it\"" }.joinToString("\n")}

#ifdef __cplusplus
extern "C" {
#endif

${funcs.map { it.declaration() }.joinToString("\n\n")}

#ifdef __cplusplus
}
#endif

#endif // $guard
"""

    public fun source(): String =
"""
#include "$headerName"

${funcs.map { it.definition() }.joinToString("\n\n")}
"""
}


public class CGenGrammar(
        val getNextChar:  (Char, Char) -> Char,
        val getRandomInt: (Int, Int) -> Int,
        val maxIdentifierSize: Int = 100,
        val maxParams: Int = 20) {

    class object {
        val firstValidIdChar: Char = '0'
        val lastValidIdChar: Char = 'z'
        val reservedKeywords: Set<String> = hashSetOf(
                "alignas", "alignof", "and", "and_eq", "asm", "auto", "bitand", "bitor", "bool", "break", "case", "catch", "char", "char16_t", "char32_t",
                "class", "compl", "const", "constexpr", "const_cast", "continue", "decltype", "default", "delete", "do", "double", "dynamic_cast",
                "else", "enum", "explicit", "export", "extern", "false", "float", "for", "friend", "goto", "if", "inline", "int", "long", "mutable", "namespace",
                "new", "noexcept", "not", "not_eq", "nullptr", "operator", "or", "or_eq", "private", "protected", "public", "register", "reinterpret_cast",
                "return", "short", "signed", "sizeof", "static", "static_assert", "static_cast", "struct", "switch", "template", "this", "thread_local",
                "throw", "true", "try", "typedef", "typeid", "typename", "union", "unsigned", "using", "virtual", "void", "volatile", "wchar_t", "while",
                "xor", "xor_eq")
        val podTypes: Set<String> = hashSetOf(
                "bool", "char", "char16_t", "char32_t", "double", "float", "int", "long", "long long",
                "short", "signed char", "signed int", "signed long", "signed long long",
                "unsigned", "unsigned char", "unsigned int", "unsigned long", "unsigned long long",
                "wchar_t")

        fun isValidIdChar(c: Char, isFirst: Boolean = false): Boolean =
                ( c >= 'A' && c <= 'Z') || ( c >= 'a' && c <= 'z' ) || c == '_' || (!isFirst && c >= '0' && c <= '9')
    }

    public fun generateId(size: Int) : String {
        val str = FunctionStream({ getNextChar(firstValidIdChar, lastValidIdChar) })
        return (str.dropWhile { !isValidIdChar(it, true) }.take(1) +
                str.filter { isValidIdChar(it, false) }.take(size - 1)
               ).joinToString("")
    }

    private fun getRandomPodType(): String {
        return podTypes.drop(getRandomInt(0, podTypes.size() - 1)).first()
    }

    public fun streamValidIds(sizes: Stream<Int>) : Stream<String> =
            sizes.map {generateId(it)}
                 .filter { !reservedKeywords.contains(it) }

    public fun generateValidId(size: Int) : String =
        streamValidIds(FunctionStream<Int>({ size })).first()

    public fun generateTypedId(size: Int) : CTypedId =
            CTypedId(generateValidId(size), getRandomPodType())

    public fun streamUniqueIds() : Stream<String> {
        val ids = hashSetOf<String>()
        return streamValidIds(FunctionStream({ getRandomInt(1, maxIdentifierSize) }))
                .filter { if (ids.contains(it)) false else { ids.add(it); true } }
    }

    public fun streamSimpleParams() : Stream<CTypedId> =
            streamUniqueIds()
                .map { CTypedId(it, podTypes.drop(getRandomInt(0, podTypes.size() - 1)).first()) }

    public fun streamSimpleSumFuncs() : Stream<CSimpleFunc> =
            streamUniqueIds()
                .map {
                    val ret = getRandomPodType()
                    val params = streamSimpleParams().take(getRandomInt(1, maxParams)).toArrayList()
                    CSimpleFunc(it, ret, params, "return ($ret)${params.map { it.name }.joinToString(" + ")}")
                }

    public fun generateSimpleTransUnit1(numOfFuncs: Int) : CSimpleTransUnit {
        val baseName = generateValidId(getRandomInt(3, maxIdentifierSize))
        return CSimpleTransUnit(baseName,
                                "$baseName.hpp",
                                "_tests_${baseName}_hpp",
                                listOf(),
                                streamSimpleSumFuncs().take(numOfFuncs).toArrayList())
    }
}
