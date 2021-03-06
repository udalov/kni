package org.jetbrains.kni.quickchecks

import java.util.*

data class ValueSample(val native: String, val kotlin: String = native)

data class CTypedId(val name: String, val type: String, val sample: ValueSample)

class CSimpleFunc(
        val name: String,
        val retType: String,
        val retSample: ValueSample,
        val params: Collection<CTypedId>,
        val body: String
) {
    val signature: String get() = "$retType $name(${params.map { "${it.type} ${it.name}" }.joinToString(", ")})"
    val declaration: String get() = "$signature;"
    val definition: String get() = "$signature{\n$body;\n}"
    fun testExpression(iface: String): String = "$iface.$name(${params.map { "${it.sample.kotlin}" }.joinToString(", ")})"
    val testResult: String = retSample.kotlin
}

class CSimpleTransUnit(
        val name: String,
        val headerName: String,
        val guard: String,
        val includes: Collection<String>,
        val funcs: Collection<CSimpleFunc>
) {

    val header: String get() =
"""
#ifndef $guard
#define $guard

${includes.map { "#include \"$it\"" }.joinToString("\n")}

#ifdef __cplusplus
extern "C" {
#endif

${funcs.map { it.declaration }.joinToString("\n\n")}

#ifdef __cplusplus
}
#endif

#endif // $guard
"""

    val source: String get() =
"""
#include "$headerName"
#include <stdexcept>
#include <sstream>

template <typename T, typename U>
void checkEq(const std::string& name, T actual, U expected)
{
    if (actual != expected) {
        std::stringstream ss;
        ss << "unexpected value of " << name << ": expecting " << expected << " but got " << actual;
        throw std::logic_error(ss.str());
    }
}

${funcs.map { it.definition }.joinToString("\n\n")}
"""

    fun kotlinTestBody(iface: String, assertEquals: String, separator: String = "\n"): String =
            "${funcs.map { "println(\"${it.name}:\"); $assertEquals(${it.retSample.kotlin}, ${it.testExpression(iface)})"}.joinToString(separator)}"
}


class CGenGrammar(
        val getRandomChar:  (Char, Char) -> Char,
        val getRandomLong: (Long, Long) -> Long,
        val getRandomDouble: (Double, Double) -> Double,
        val maxIdentifierSize: Int = 100,
        val maxParams: Int = 20
) {
    companion object {
        val firstValidIdChar: Char = '0'
        val lastValidIdChar: Char = 'z'
        val reservedKeywords: Set<String> = hashSetOf(
                "alignas", "alignof", "and", "and_eq", "asm", "auto", "bitand", "bitor", "bool", "break", "case", "catch", "char", "char16_t", "char32_t",
                "class", "compl", "const", "constexpr", "const_cast", "continue", "decltype", "default", "delete", "do", "double", "dynamic_cast",
                "else", "enum", "explicit", "export", "extern", "false", "float", "for", "friend", "goto", "if", "inline", "int", "long", "mutable", "namespace",
                "new", "noexcept", "not", "not_eq", "nullptr", "operator", "or", "or_eq", "private", "protected", "public", "register", "reinterpret_cast",
                "return", "short", "signed", "sizeof", "static", "static_assert", "static_cast", "struct", "switch", "template", "this", "thread_local",
                "throw", "true", "try", "typedef", "typeid", "typename", "union", "unsigned", "using", "virtual", "void", "volatile", "wchar_t", "while",
                "xor", "xor_eq",
                "EOF", "NULL")

        fun isValidIdChar(c: Char, isFirst: Boolean = false): Boolean =
                ( c >= 'A' && c <= 'Z') || ( c >= 'a' && c <= 'z' ) || c == '_' || (!isFirst && c >= '0' && c <= '9')
    }

    // commented out types are not supported:
    // all single char types - seems JNR problem - to investigate
    // float/double - runtime error - to investigate
    // short - KT-6959
    // long double - no support in indexer/generator yet
    val podTypes: Map<String, () -> ValueSample> = hashMapOf(
            "bool"              to { ValueSample(if (getRandomLong(0,1) != 0L) "true" else "false") },
//            "char"              to { () -> val v = getRandomLong(0, 255); ValueSample("'\\x%x'".format(v), "'\\u%04x'".format(v))},
                                // note: checkig only valid 16-bit codepoints
//            "char16_t"          to { () -> val v = getRandomChar(java.lang.Character.MIN_VALUE, '\ucfff'); ValueSample("L'\\u%04x'".format(v.toInt()), "'\\u%04x'".format(v.toInt()))},
                                // note: only char16 range is generated
//            "char32_t"          to { () -> val v = getRandomChar(java.lang.Character.MIN_VALUE, '\ucfff'); ValueSample("L'\\u%04x'".format(v.toInt()), "'\\u%04x'".format(v.toInt()))},
//            "double"            to { () -> ValueSample("%e".format(getRandomDouble(java.lang.Double.MIN_VALUE, java.lang.Double.MAX_VALUE)))},
//            "float"             to { () -> val v = getRandomDouble(java.lang.Float.MIN_VALUE.toDouble(), java.lang.Float.MAX_VALUE.toDouble()); ValueSample("%e".format(v), "%ef".format(v))},
            "int"               to { ValueSample("%d".format(getRandomLong(java.lang.Integer.MIN_VALUE.toLong(), java.lang.Integer.MAX_VALUE.toLong())))},
            "long"              to { val v = getRandomLong(java.lang.Integer.MIN_VALUE.toLong() + 256L, java.lang.Integer.MAX_VALUE.toLong()); ValueSample("%dl".format(v), "%d".format(v))},
                                // note: only double range is used
//            "long double"       to { () -> ValueSample("%e".format(getRandomDouble(java.lang.Double.MIN_VALUE, java.lang.Double.MAX_VALUE)))},
            "long long"         to { val v = getRandomLong(java.lang.Long.MIN_VALUE, java.lang.Long.MAX_VALUE); ValueSample("%dll".format(v), "%dL".format(v))},
//            "short"             to { () -> val v = getRandomLong(java.lang.Short.MIN_VALUE.toLong(), java.lang.Short.MAX_VALUE.toLong()); ValueSample("%d".format(v), "%d.toShort()".format(v))},
//            "signed char"       to { () -> ValueSample("%d".format(getRandomLong(-128, 127)))},
            "signed int"        to { ValueSample("%d".format(getRandomLong(java.lang.Integer.MIN_VALUE.toLong(), java.lang.Integer.MAX_VALUE.toLong())))},
            "signed long"       to { val v = getRandomLong(java.lang.Integer.MIN_VALUE.toLong(), java.lang.Integer.MAX_VALUE.toLong()); ValueSample("%dl".format(v), "%d".format(v))},
            "signed long long"  to { val v = getRandomLong(java.lang.Long.MIN_VALUE, java.lang.Long.MAX_VALUE); ValueSample("%dll".format(v), "%dL".format(v))},
//            "signed short"      to { () -> val v = getRandomLong(java.lang.Short.MIN_VALUE.toLong(), java.lang.Short.MAX_VALUE.toLong()); ValueSample("%d".format(v), "%d.toShort()".format(v))},
                                // note - unsigned types (except the char) only tested in the range [0..<signed max val>]
            "unsigned"          to { val v = getRandomLong(0, java.lang.Short.MAX_VALUE.toLong()); ValueSample("%du".format(v), "%d".format(v))},
//            "unsigned char"     to { () -> ValueSample("%d".format(getRandomLong(0, java.lang.Byte.MAX_VALUE.toLong())))},
            "unsigned int"      to { val v = getRandomLong(0, java.lang.Short.MAX_VALUE.toLong()); ValueSample("%du".format(v), "%d".format(v))},
            "unsigned long"     to { val v = getRandomLong(0, java.lang.Integer.MAX_VALUE.toLong()); ValueSample("%dul".format(v), "%d".format(v))},
            "unsigned long long" to { val v = getRandomLong(0, java.lang.Long.MAX_VALUE); ValueSample("%dull".format(v), "%dL".format(v))},
            "unsigned short"    to { val v = getRandomLong(0, java.lang.Short.MAX_VALUE.toLong()); ValueSample("%du".format(v), "%d.toShort()".format(v))}
//            "wchar_t"           to { () -> val v = getRandomChar(java.lang.Character.MIN_VALUE, '\ucfff'); ValueSample("L'\\u%04x'".format(v.toInt()), "'\\u%04x'".format(v.toInt()))}
    )

    fun generateId(size: Int) : String {
        val str = FunctionSequence({ getRandomChar(firstValidIdChar, lastValidIdChar) })
        return (str.dropWhile { !isValidIdChar(it, true) }.take(1) +
                str.filter { isValidIdChar(it, false) }.take(size - 1)
               ).joinToString("")
    }

    private fun getRandomPodType(): String {
        return podTypes.keys.drop(getRandomLong(0, podTypes.size.toLong() - 1).toInt()).first()
    }

    fun streamValidIds(sizes: Sequence<Int>) : Sequence<String> =
            sizes.map {generateId(it)}
                 .filter { !reservedKeywords.contains(it) }

    fun generateValidId(size: Int) : String =
        streamValidIds(FunctionSequence({ size })).first()

    fun streamUniqueIds() : Sequence<String> {
        val ids = hashSetOf<String>()
        return streamValidIds(FunctionSequence({ getRandomLong(1, maxIdentifierSize.toLong()).toInt() }))
                .filter { if (ids.contains(it)) false else { ids.add(it); true } }
    }

    fun streamSimpleParams(): Sequence<CTypedId> =
            streamUniqueIds().map {
                val t = podTypes.keys.drop(getRandomLong(0, podTypes.size.toLong() - 1).toInt()).first()
                CTypedId(it, t, podTypes[t]!!())
            }

    fun streamSimpleCheckFuncs(): Sequence<CSimpleFunc> =
            streamUniqueIds().map { func ->
                val ret = getRandomPodType()
                val retSample = podTypes[ret]!!()
                val params = streamSimpleParams().take(getRandomLong(1, maxParams.toLong()).toInt()).toArrayList()
                CSimpleFunc(func, ret, retSample, params,
"""
    ${params.map { "checkEq(\"$func.${it.name}(${it.type})\", ${it.name}, ${it.sample.native});" }.joinToString("\n    ")}
    return ${retSample.native};""")
                }

    fun generateSimpleTransUnit1(numOfFuncs: Int) : CSimpleTransUnit {
        val baseName = generateValidId(getRandomLong(3, maxIdentifierSize.toLong()).toInt())
        return CSimpleTransUnit(
                baseName,
                "$baseName.hpp",
                "_tests_${baseName}_hpp",
                listOf(),
                streamSimpleCheckFuncs().take(numOfFuncs).toArrayList()
        )
    }
}

// TODO: get rid of this, use stdlib instead
class FunctionSequence<T : Any>(private val producer: () -> T?) : Sequence<T> {
    override fun iterator(): Iterator<T> = object : Iterator<T> {
        var nextState: Int = -1 // -1 for unknown, 0 for done, 1 for continue
        var nextItem: T? = null

        private fun calcNext() {
            val item = producer()
            if (item == null) {
                nextState = 0
            } else {
                nextState = 1
                nextItem = item
            }
        }

        override fun next(): T {
            if (nextState == -1)
                calcNext()
            if (nextState == 0)
                throw NoSuchElementException()
            val result = nextItem as T
            // Clean next to avoid keeping reference on yielded instance
            nextItem = null
            nextState = -1
            return result
        }

        override fun hasNext(): Boolean {
            if (nextState == -1)
                calcNext()
            return nextState == 1
        }
    }
}
