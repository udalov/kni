package org.jetbrains.kni.gen

import java.util.ArrayList

trait Type {
    public val name: String
    public val defaultVal: String get() = "${name}()"
}

open class BuiltInType(override val name: String) : Type

class PODType(override val name: String, public val defaultLiteral: String) : Type {
    override val defaultVal: String = defaultLiteral
}

open class JNRType(baseName: String, annotation: String? = null)
    : BuiltInType(if (annotation != null) "${annotation} ${baseName}" else baseName) {}

open class JNRStructFieldType(internal val baseName: String) : BuiltInType("jnr.ffi.Struct.$baseName") {
    override val defaultVal: String = "super.$baseName()"
}

open class JNRStructPointerType(val pointee: Type) : JNRStructFieldType("Pointer") {}

class JNRStructString(baseName: String, internal val size: Int = 0) : JNRStructFieldType(baseName) {
    override val defaultVal: String = "super.$baseName(${if (size > 0) size.toString() else ""})"
}

fun JNRStructString(isRef: Boolean, options: GeneratorOptions, size: Int = 0) =
        when (options.charStringType) {
            CharStringType.Ascii -> JNRStructString(if (isRef) "AsciiStringRef" else "AsciiString", size)
            CharStringType.Utf8 -> JNRStructString(if (isRef) "UTF8StringRef" else "UTF8String", size)
        }

fun JNRStructString(options: GeneratorOptions, size: Int = 0) = JNRStructString(false, options, size)
fun JNRStructStringRef(options: GeneratorOptions, size: Int = 0) = JNRStructString(true, options, size)

class ObjCClassRefType(override val name: String) : Type {
}

class RecordType(override val name: String) : Type {
}

object ObjCOpaquePointerType : Type {
    override val name: String = "Pointer<*>"
}

object JNROpaquePointerType : Type {
    override val name: String = "Pointer"
}

class ObjCPointerType(val pointee: Type) : Type {
    override val name: String = "Pointer<${pointee.name}>"
}

class JNRPointerType(val pointee: Type) : Type {
    override val name: String = "Pointer"
}

class FunctionType(val paramTypes: List<Type>, val returnType: Type) : Type {
    override val name: String =
            paramTypes.map { it.name }.joinToString(
                    separator = ", ",
                    prefix = "(",
                    postfix = ")"
            ) + " -> " + returnType.name
    override val defaultVal: String = "null"
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

val JNRStructBool = JNRStructFieldType("Boolean")
val JNRStructUInt8 = JNRStructFieldType("Unsigned8")
val JNRStructSInt8 = JNRStructFieldType("Signed8")
val JNRStructUInt16 = JNRStructFieldType("Unsigned16")
val JNRStructSInt16 = JNRStructFieldType("Signed16")
val JNRStructUInt32 = JNRStructFieldType("Unsigned32")
val JNRStructSInt32 = JNRStructFieldType("Signed32")
val JNRStructUInt64 = JNRStructFieldType("Unsigned64")
val JNRStructSInt64 = JNRStructFieldType("Signed64")
val JNRStructULong = JNRStructFieldType("UnsignedLong")
val JNRStructSLong = JNRStructFieldType("SignedLong")
val JNRStructFloat = JNRStructFieldType("Float")
val JNRStructDouble = JNRStructFieldType("Double")

object primitiveTypesMapper {
    val generalTypes = mapOf(
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
    val jnrStructTypes = mapOf(
            "V"  to UnitType,
            "Z"  to JNRStructBool,
            "UC" to JNRStructUInt8,
            "C"  to JNRStructSInt8,
            "US" to JNRStructUInt16,
            "S"  to JNRStructSInt16,
            "UI" to JNRStructUInt32,
            "I"  to JNRStructSInt32,
            "I8" to JNRStructUInt64,
            "U8" to JNRStructSInt64,
            "UJ" to JNRStructULong,
            "J"  to JNRStructSLong,
            "F"  to JNRStructFloat,
            "D"  to JNRStructDouble
    )
    public fun get_types(options: GeneratorOptions, scope: LexicalScope): Map<String, Type> =
            if (options.runtime == InteropRuntime.JNR && scope == LexicalScope.Record) jnrStructTypes else generalTypes
}


class TypeParser(private val type: String, private val options: GeneratorOptions) {
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

    fun parse(scope: LexicalScope): Type {
        if (at == type.length()) error("No type to parse")

        val isConst = advance("c")

        for ((string, type) in primitiveTypesMapper.get_types(options, scope).entrySet()) {
            if (advance(string)) return type
        }

        if (advance("L")) {
            val semicolon = type.indexOf(';', at)
            if (semicolon < 0) error("L without a matching semicolon")
            val className = type.substring(at, semicolon)
            expect(className)
            expect(";")
            // TODO: for some reason Clang doesn't index forward declaration of the class named 'Protocol' defined in objc/Protocol.h
            if ("Protocol" == className) return ObjCClassRefType("Any?")
            return ObjCClassRefType(className)
        }

        if (advance("R")) {
            val semicolon = type.indexOf(';', at)
            if (semicolon < 0) error("L without a matching semicolon")
            val recordName = type.substring(at, semicolon)
            expect(recordName)
            expect(";")
            // \todo check if we really don't want structs in ObjC
            return if (options.runtime == InteropRuntime.ObjC) ObjCClassRefType("Any") else RecordType(recordName)
        }

        if (advance("*(")) {
            val paramTypes = ArrayList<Type>()
            while (!advance(")")) {
                if (advance(".")) {
                    // TODO: support vararg
                    continue
                }
                paramTypes.add(parse(LexicalScope.General))
            }
            val returnType = parse(LexicalScope.General)
            expect(";")
            return FunctionType(paramTypes, returnType)
        }

        if (advance("*V;")) {
            // Special case for "void *"
            return ObjCOpaquePointerType
        }

        if (advance("*")) {
            val pointee = parse(scope)
            expect(";")
            // if pointer to struct - omit pointer
            return if (options.runtime == InteropRuntime.JNR)
                   when {
                       pointee is RecordType -> pointee
                       pointee == JNRStructSInt8 -> JNRStructStringRef(options)
                       pointee == CharType ->  JNRType("String") // \todo consider: JNRType(if (isConst) "String" else "StringBuilder")
                       else -> if (scope == LexicalScope.Record) JNRStructPointerType(pointee) else JNRPointerType(pointee)
                   }
                else ObjCPointerType(pointee)
        }

        if (at("X(")) {
            at = type.indexOf(')', at) + 1
        }
        else {
            throw UnsupportedOperationException("Unsupported type (at=" + at + "): " + type)
        }

        return ObjCClassRefType("Any")
    }
}

fun parseType(type: String, options: GeneratorOptions, baseScope: LexicalScope): Type = TypeParser(type, options).parse(baseScope)
