package org.jetbrains.kni.gen

import java.util.ArrayList

trait Type {
    internal val str: String
    public fun name(runtime: InteropRuntime): String = str
    public fun defaultVal(runtime: InteropRuntime): String = "${name(runtime)}()"
}

class BuiltInType(override val str: String) : Type

class PODType(override val str: String, public val defaultLiteral: String) : Type {
    override fun defaultVal(runtime: InteropRuntime): String = defaultLiteral
}

class ClassType(val name: String) : Type {
    override val str: String get() = name
}

class RecordType(val name: String) : Type {
    override val str: String get() = name
}

object OpaquePointerType : Type {
    override val str: String = ""
    public override fun name(runtime: InteropRuntime): String = when (runtime) {
        InteropRuntime.ObjC -> "Pointer<*>"
        InteropRuntime.JNR -> "Pointer"
    }
}

class PointerType(val pointee: Type) : Type {
    override val str: String = ""
    public override fun name(runtime: InteropRuntime): String = when (runtime) {
        InteropRuntime.ObjC -> "Pointer<${pointee.str}>"
        InteropRuntime.JNR -> "Pointer"
    }
}

class FunctionType(val paramTypes: List<Type>, val returnType: Type) : Type {
    override val str: String = ""
    public override fun name(runtime: InteropRuntime): String =
            paramTypes.map { it.name(runtime) }.joinToString(
                    separator = ", ",
                    prefix = "(",
                    postfix = ")"
            ) + " -> " + returnType.name(runtime)
    override fun defaultVal(runtime: InteropRuntime): String = "null"
}

val ObjCObjectType = BuiltInType("ObjCObject")
val ObjCClassType = BuiltInType("ObjCClass")
val ObjCSelectorType = BuiltInType("ObjCSelector")
val UnitType = BuiltInType("Unit")
val CharType = PODType("Char", "0")
val ShortType = PODType("Short", "0")
val IntType = PODType("Int", "0")
val LongType = PODType("Long", "0")
val BooleanType = PODType("Boolean", "false")
val FloatType = PODType("Float", "0.0f")
val DoubleType = PODType("Double", "0.0")

val builtInTypesMap = mapOf(
        "V" to UnitType,
       "UC" to CharType,
       "US" to ShortType,
       "UI" to IntType,
       "UJ" to LongType,
        "C" to CharType,
        "Z" to BooleanType,
        "S" to ShortType,
        "I" to IntType,
        "J" to LongType,
        "F" to FloatType,
        "D" to DoubleType,
        "OI" to ObjCObjectType,
        "OC" to ObjCClassType,
        "OS" to ObjCSelectorType
)


class TypeParser(private val type: String, private val runtime: InteropRuntime) {
    private var at = 0

    private fun at(s: String): Boolean = type.substring(at).startsWith(s)

    private fun expect(s: String) {
        if (!advance(s)) error("Expecting <" + s + "> (at=" + at + ")")
    }

    private fun advance(s: String): Boolean {
        if (at(s)) {
            at += s.length()
            return true
        }
        return false
    }

    private fun error(s: String) = throw IllegalStateException(s + ": " + type)

    fun parse(): Type {
        if (at == type.length()) error("No type to parse")

        for ((string, type) in builtInTypesMap.entrySet()) {
            if (advance(string)) return type
        }

        if (advance("L")) {
            val semicolon = type.indexOf(';', at)
            if (semicolon < 0) error("L without a matching semicolon")
            val className = type.substring(at, semicolon)
            expect(className)
            expect(";")
            // TODO: for some reason Clang doesn't index forward declaration of the class named 'Protocol' defined in objc/Protocol.h
            if ("Protocol" == className) return ClassType("Any?")
            return ClassType(className)
        }

        if (advance("R")) {
            val semicolon = type.indexOf(';', at)
            if (semicolon < 0) error("L without a matching semicolon")
            val recordName = type.substring(at, semicolon)
            expect(recordName)
            expect(";")
            // \todo check if we really don't want structs in ObjC
            return if (runtime == InteropRuntime.ObjC) ClassType("Any") else RecordType(recordName)
        }

        if (advance("*(")) {
            val paramTypes = ArrayList<Type>()
            while (!advance(")")) {
                if (advance(".")) {
                    // TODO: support vararg
                    continue
                }
                paramTypes.add(parse())
            }
            val returnType = parse()
            expect(";")
            return FunctionType(paramTypes, returnType)
        }

        if (advance("*V;")) {
            // Special case for "void *"
            return OpaquePointerType
        }

        if (advance("*")) {
            val pointee = parse()
            expect(";")
            // if pointer to struct - omit pointer
            return if (runtime == InteropRuntime.JNR && pointee is RecordType) pointee else PointerType(pointee)
        }

        if (at("X(")) {
            at = type.indexOf(')', at) + 1
        }
        else {
            throw UnsupportedOperationException("Unsupported type (at=" + at + "): " + type)
        }

        return ClassType("Any")
    }
}

fun parseType(type: String, runtime: InteropRuntime): Type = TypeParser(type, runtime).parse()
