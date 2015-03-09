
package org.jetbrains.kni.quickchecks

public data class ValueSample(public val native: String, public val kotlin: String = native)

public data class CTypedId(public val name: String, public val type: String, public val sample: ValueSample) {}

public class CSimpleFunc(
        public val name: String,
        public val retType: String,
        public val retSample: ValueSample,
        public val params: Collection<CTypedId>,
        public val body: String) {

    public val signature: String get() = "$retType $name(${params.map { "${it.type} ${it.name}" }.joinToString(", ")})"
    public val declaration: String get() = signature + ";"
    public val definition: String get() = "${signature}{\n$body;\n}"
    public fun testExpression(iface: String): String = "$iface.$name(${params.map { "${it.sample.kotlin}" }.joinToString(", ")})"
    public val testResult: String = retSample.kotlin
}


public class CSimpleTransUnit(
        public val name: String,
        public val headerName: String,
        public val guard: String,
        public val includes: Collection<String>,
        public val funcs: Collection<CSimpleFunc>) {

    public val header: String get() =
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

    public val source: String get() =
"""
#include "$headerName"
#include <stdexcept>

${funcs.map { it.definition }.joinToString("\n\n")}
"""

    public fun kotlinTestBody(iface: String, assertEquals: String): String =
            "${funcs.map { "    $assertEquals(${it.retSample}, ${it.testExpression(iface)})"}}"
}


public class CGenGrammar(
        val getRandomChar:  (Char, Char) -> Char,
        val getRandomLong: (Long, Long) -> Long,
        val getRandomDouble: (Double, Double) -> Double,
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

        fun isValidIdChar(c: Char, isFirst: Boolean = false): Boolean =
                ( c >= 'A' && c <= 'Z') || ( c >= 'a' && c <= 'z' ) || c == '_' || (!isFirst && c >= '0' && c <= '9')
    }

    val podTypes: Map<String, () -> ValueSample> = hashMapOf(
            "bool"              to { () -> ValueSample(if (getRandomLong(0,1) != 0L) "true" else "false") },
            "char"              to { () -> val v = getRandomLong(0, 255); ValueSample("'\\x%x'".format(v), "'\\u%04x'".format(v))},
                                // note: checkig only valid 16-bit codepoints
            "char16_t"          to { () -> val v = getRandomChar(java.lang.Character.MIN_VALUE, '\ucfff'); ValueSample("L'\\u%04x'".format(v.toInt()), "'\\u%04x'".format(v.toInt()))},
                                // note: only char16 range is generated
            "char32_t"          to { () -> val v = getRandomChar(java.lang.Character.MIN_VALUE, '\ucfff'); ValueSample("L'\\u%04x'".format(v.toInt()), "'\\u%04x'".format(v.toInt()))},
            "double"            to { () -> ValueSample("%e".format(getRandomDouble(java.lang.Double.MIN_VALUE, java.lang.Double.MAX_VALUE)))},
            "float"             to { () -> ValueSample("%e".format(getRandomDouble(java.lang.Float.MIN_VALUE.toDouble(), java.lang.Float.MAX_VALUE.toDouble())))},
            "int"               to { () -> ValueSample("%d".format(getRandomLong(java.lang.Integer.MIN_VALUE.toLong(), java.lang.Integer.MAX_VALUE.toLong())))},
            "long"              to { () -> val v = getRandomLong(java.lang.Integer.MIN_VALUE.toLong(), java.lang.Integer.MAX_VALUE.toLong()); ValueSample("%dl".format(v), "%d".format(v))},
                                // note: only double range is used
            "long double"       to { () -> ValueSample("%e".format(getRandomDouble(java.lang.Double.MIN_VALUE, java.lang.Double.MAX_VALUE)))},
            "long long"         to { () -> val v = getRandomLong(java.lang.Long.MIN_VALUE, java.lang.Long.MAX_VALUE); ValueSample("%dll".format(v), "%d".format(v))},
            "short"             to { () -> ValueSample("%d".format(getRandomLong(java.lang.Short.MIN_VALUE.toLong(), java.lang.Short.MAX_VALUE.toLong())))},
            "signed char"       to { () -> ValueSample("%d".format(getRandomLong(-128, 127)))},
            "signed int"        to { () -> ValueSample("%d".format(getRandomLong(java.lang.Integer.MIN_VALUE.toLong(), java.lang.Integer.MAX_VALUE.toLong())))},
            "signed long"       to { () -> val v = getRandomLong(java.lang.Integer.MIN_VALUE.toLong(), java.lang.Integer.MAX_VALUE.toLong()); ValueSample("%dl".format(v), "%d".format(v))},
            "signed long long"  to { () -> val v = getRandomLong(java.lang.Long.MIN_VALUE, java.lang.Long.MAX_VALUE); ValueSample("%dll".format(v), "%d".format(v))},
            "signed short"      to { () -> ValueSample("%d".format(getRandomLong(java.lang.Short.MIN_VALUE.toLong(), java.lang.Short.MAX_VALUE.toLong())))},
                                // note - unsigned types (except the char) only tested in the range [0..<signed max val>]
            "unsigned"          to { () -> ValueSample("%d".format(getRandomLong(0, java.lang.Integer.MAX_VALUE.toLong())))},
            "unsigned char"     to { () -> ValueSample("%d".format(getRandomLong(0, 255)))},
            "unsigned int"      to { () -> ValueSample("%d".format(getRandomLong(0, java.lang.Short.MAX_VALUE.toLong())))},
            "unsigned long"     to { () -> val v = getRandomLong(0, java.lang.Integer.MAX_VALUE.toLong()); ValueSample("%dl".format(v), "%d".format(v))},
            "unsigned long long"to { () -> val v = getRandomLong(0, java.lang.Long.MAX_VALUE); ValueSample("%dll".format(v), "%d".format(v))},
            "unsigned short"    to { () -> ValueSample("%d".format(getRandomLong(0, java.lang.Short.MAX_VALUE.toLong())))},
            "wchar_t"           to { () -> val v = getRandomChar(java.lang.Character.MIN_VALUE, '\ucfff'); ValueSample("L'\\u%04x'".format(v.toInt()), "'\\u%04x'".format(v.toInt()))}
    )

    public fun generateId(size: Int) : String {
        val str = FunctionStream({ getRandomChar(firstValidIdChar, lastValidIdChar) })
        return (str.dropWhile { !isValidIdChar(it, true) }.take(1) +
                str.filter { isValidIdChar(it, false) }.take(size - 1)
               ).joinToString("")
    }

    private fun getRandomPodType(): String {
        return podTypes.keySet().drop(getRandomLong(0, podTypes.size().toLong() - 1).toInt()).first()
    }

    public fun streamValidIds(sizes: Stream<Int>) : Stream<String> =
            sizes.map {generateId(it)}
                 .filter { !reservedKeywords.contains(it) }

    public fun generateValidId(size: Int) : String =
        streamValidIds(FunctionStream<Int>({ size })).first()

    public fun streamUniqueIds() : Stream<String> {
        val ids = hashSetOf<String>()
        return streamValidIds(FunctionStream({ getRandomLong(1, maxIdentifierSize.toLong()).toInt() }))
                .filter { if (ids.contains(it)) false else { ids.add(it); true } }
    }

    public fun streamSimpleParams() : Stream<CTypedId> =
            streamUniqueIds()
                .map {
                    val t = podTypes.keySet().drop(getRandomLong(0, podTypes.size().toLong() - 1).toInt()).first()
                    CTypedId(it, t, podTypes.get(t)!!()) }

    public fun streamSimpleCheckFuncs() : Stream<CSimpleFunc> =
            streamUniqueIds()
                .map {
                    val ret = getRandomPodType()
                    val retSample = podTypes.get(ret)!!()
                    val params = streamSimpleParams().take(getRandomLong(1, maxParams.toLong()).toInt()).toArrayList()
                    CSimpleFunc(it, ret, retSample, params,
"""
    if (${params.map { "${it.name} != ${it.sample.native}" }.joinToString("\n        || ")})
      throw std::logic_error("unexpected value");
    return ${retSample.native};""")
                }

    public fun generateSimpleTransUnit1(numOfFuncs: Int) : CSimpleTransUnit {
        val baseName = generateValidId(getRandomLong(3, maxIdentifierSize.toLong()).toInt())
        return CSimpleTransUnit(baseName,
                                "$baseName.hpp",
                                "_tests_${baseName}_hpp",
                                listOf(),
                                streamSimpleCheckFuncs().take(numOfFuncs).toArrayList())
    }
}
