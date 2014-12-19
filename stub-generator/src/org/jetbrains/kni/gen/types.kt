package org.jetbrains.kni.gen

import java.util.ArrayList

trait Type {
    val str: String

    override fun toString() = str
}

class BuiltInType(override val str: String) : Type

class ClassType(val name: String) : Type {
    override val str: String get() = name
}

object OpaquePointerType : Type {
    override val str: String get() = "Pointer<*>"
}

class PointerType(val pointee: Type) : Type {
    override val str: String get() = "Pointer<${pointee.str}>"
}

class FunctionType(val paramTypes: List<Type>, val returnType: Type) : Type {
    override val str: String get() =
            paramTypes.map { it.str }.joinToString(
                    separator = ", ",
                    prefix = "(",
                    postfix = ")"
            ) + " -> " + returnType.str
}

val ObjCObjectType = BuiltInType("ObjCObject")
val ObjCClassType = BuiltInType("ObjCClass")
val ObjCSelectorType = BuiltInType("ObjCSelector")
val UnitType = BuiltInType("Unit")
val CharType = BuiltInType("Char")
val ShortType = BuiltInType("Short")
val IntType = BuiltInType("Int")
val LongType = BuiltInType("Long")
val BooleanType = BuiltInType("Boolean")
val FloatType = BuiltInType("Float")
val DoubleType = BuiltInType("Double")

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


class TypeParser(private val type: String) {
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
            return PointerType(pointee)
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

fun parseType(type: String): Type = TypeParser(type).parse()
