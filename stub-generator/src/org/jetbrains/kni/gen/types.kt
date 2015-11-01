package org.jetbrains.kni.gen

import java.util.*

interface Type {
    val expr: String get() = ""
    fun getExpr(typeMapper: (Type) -> Type = {it}): String = expr
    val name: String get() = getExpr()
    val defaultVal: String get() = "${getExpr()}()"
}

data class PrefixedType(val wrapped: Type, val prefix: String) : Type {
    override fun getExpr(typeMapper: (Type) -> Type): String = prefix + wrapped.getExpr(typeMapper)
}


fun makePrefixed(t: Type, prefix: String) = if (prefix.length == 0 || t is FunctionType) t else PrefixedType(t, prefix)


data class SimpleType(override val expr: String) : Type

data class BuiltInType(override val expr: String) : Type

data class PODType(override val expr: String, val defaultLiteral: String) : Type {
    override val defaultVal: String = defaultLiteral
}

class JNRType(val baseName: String, val annotation: String? = null) : Type {
    override val expr: String get() = if (annotation != null) "$annotation $baseName" else baseName

    override fun equals(other: Any?) = other is JNRType && expr == other.expr
    override fun hashCode() = expr.hashCode()
}

open class JNRStructFieldType(internal val baseName: String) : Type {
    override val expr: String get() = "jnr.ffi.Struct.$baseName"

    override val defaultVal: String get() = "super.$baseName()"
}

open class JNRStructPointerType(val pointee: Type = UnitType) : JNRStructFieldType("Pointer")

class JNRStructString(baseName: String, internal val size: Int = 0) : JNRStructFieldType(baseName) {
    override val defaultVal: String = "super.$baseName(${if (size > 0) size.toString() else ""})"
}

fun JNRStructString(isRef: Boolean, options: GeneratorOptions, size: Int = 0) =
        when (options.charStringType) {
            CharStringType.Ascii -> JNRStructString(if (isRef) "AsciiStringRef" else "AsciiString", size)
            CharStringType.Utf8 -> JNRStructString(if (isRef) "UTF8StringRef" else "UTF8String", size)
        }

fun JNRStructStringRef(options: GeneratorOptions, size: Int = 0) = JNRStructString(true, options, size)

data class ObjCClassRefType(override val expr: String) : Type {
}

data class RecordType(override val expr: String) : Type {
    override val defaultVal: String get() = "${getExpr()}(runtime)"
}

object ObjCOpaquePointerType : Type {
    override val expr: String = "Pointer<*>"
}

object JNROpaquePointerType : Type {
    override val expr: String = "Pointer"
}

data class ObjCPointerType(val pointee: Type) : Type {
    override fun getExpr(typeMapper: (Type) -> Type): String = "Pointer<${pointee.getExpr(typeMapper)}>"
}

data class JNRPointerType(val pointee: Type) : Type {
    override val expr: String = "Pointer"
}

data class FunctionType(val paramTypes: List<Type>, val returnType: Type) : Type {
    override fun getExpr(typeMapper: (Type) -> Type): String =
            paramTypes.map { typeMapper(it).getExpr(typeMapper) }.joinToString(
                    separator = ", ",
                    prefix = "(",
                    postfix = ")"
            ) + " -> " + typeMapper(returnType).getExpr(typeMapper)
    override val defaultVal: String = "null"
    override val name: String =
            paramTypes.map { it.getExpr() }.joinToString( separator = "_" ) + "_" + returnType.getExpr()
}

data class JNRStructFunctionType(val proxyName: String) : Type {
    override val expr: String get() = "jnr.ffi.Struct.Function<$proxyName>"
    override val defaultVal: String get() = "function($proxyName::class.java)"
}

val ObjCObjectType = BuiltInType("ObjCObject")
val ObjCClassType = BuiltInType("ObjCClass")
val ObjCSelectorType = BuiltInType("ObjCSelector")
val UnitType = BuiltInType("Unit")
val ByteType = PODType("Byte", "0")
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

val JNROpaquePointer = JNROpaquePointerType

object primitiveTypesMapper {
    val generalTypes = mapOf(
            "V" to UnitType,
            "US" to ShortType,
            "UI" to IntType,
            "UJ" to LongType,
            "UB" to ByteType,
            "B" to ByteType,
            "C" to CharType,
            "W" to CharType,
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

    fun get_types(options: GeneratorOptions, scope: LexicalScope): Map<String, Type> =
            if (options.runtime == InteropRuntime.JNR && scope == LexicalScope.Record) jnrStructTypes
            else generalTypes
}


class TypeParser(private val type: String, private val options: GeneratorOptions) {
    private var at = 0

    private fun at(s: String): Boolean = type.substring(at).startsWith(s)

    private fun expect(s: String) {
        if (!advance(s)) error("Expecting <$s> (at=$at)")
    }

    private fun advance(s: String): Boolean {
        if (at(s)) {
            at += s.length
            return true
        }
        return false
    }

    private fun error(s: String) = throw IllegalStateException(s + ": " + type)

    fun parse(scope: LexicalScope): Type {
        if (at == type.length) error("No type to parse")

        @Suppress("UNUSED_VARIABLE")
        val isConst = advance("c")

        for ((string, type) in primitiveTypesMapper.get_types(options, scope).entries) {
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
            return if (options.runtime == InteropRuntime.JNR)
                        if (scope == LexicalScope.Record) JNRStructPointerType() else  JNROpaquePointerType
                   else ObjCOpaquePointerType
        }

        if (advance("*")) {
            val pointee = parse(scope)
            expect(";")
            // if pointer to struct - omit pointer
            return if (options.runtime == InteropRuntime.JNR) {
                when (pointee) {
                    is RecordType -> pointee
                    JNRStructSInt8 -> JNRStructStringRef(options)
                    CharType -> JNRType("String") // \todo consider: JNRType(if (isConst) "String" else "StringBuilder")
                    else -> if (scope == LexicalScope.Record) JNRStructPointerType(pointee) else JNRPointerType(pointee)
                }
            } else {
                when (pointee) {
                    ObjCSelectorType -> ObjCSelectorType
                    else -> ObjCPointerType(pointee)
                }
            }
        }

        if (at("X(")) {
            at = type.indexOf(')', at) + 1
        }
        else {
            throw UnsupportedOperationException("Unsupported type (at=$at): $type")
        }

        return ObjCClassRefType("Any")
    }
}

fun parseType(type: String, options: GeneratorOptions, baseScope: LexicalScope): Type = TypeParser(type, options).parse(baseScope)
