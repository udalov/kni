package org.jetbrains.kni.gen

import java.io.File
import org.jetbrains.kni.indexer.NativeIndex.*

public fun generateStub(outputDir: File, translationUnit: TranslationUnit) {
    val result = StringBuilder()
    val out = Printer(result)

    out.println("// This file is auto-generated. DO NOT EDIT!")
    out.println()
    out.println("package objc")
    out.println()
    out.println("import kni.objc.*")
    out.println()

    for (klass in translationUnit.getClass_List()) {
        Generator(out).genClass(klass)
        out.println()
    }

    // TODO: protocols
    // TODO: categories

    // TODO: unhardcode
    outputDir.mkdirs()
    File(outputDir, "kni-stub.kt").writeText(result.toString())
}

class Generator(private val out: Printer) {
    fun genClass(klass: ObjCClass) {
        out.print("open class ${klass.getName()}(pointer: Long)")

        val baseClass =
                if (klass.hasBaseClass()) klass.getBaseClass()
                else "ObjCObject"
        val protocols = klass.getProtocolList()
        val categories = klass.getCategoryList()

        val baseList =
            listOf("$baseClass(pointer)") +
            protocols +
            categories.map { category -> "`$category`" }

        baseList.joinTo(out, separator = ", ", prefix = " : ")
        out.println(" {")

        out.push()

        val instanceMethods = klass.getMethodList().filter { !it.getClassMethod() }
        for ((index, method) in instanceMethods.withIndex()) {
            genFunction(method.getFunction())
            if (index != instanceMethods.lastIndex) out.println()
        }

        // TODO: properties

        out.pop()

        out.println("}")

        // TODO: $metaclass and class object
    }

    private fun genFunction(function: Function) {
        out.print("open fun ")
        out.print(jvmMethodName(function.getName()))

        function.getParameterList()
                .map { p -> p.getName() + ": " + parseType(p.getType()).str }
                .joinTo(out, separator = ", ", prefix = "(", postfix = ")")

        val returnType = parseType(function.getReturnType())
        if (returnType != UnitType) {
            out.print(": ${returnType.str}")
        }
        out.println(" {")

        out.push()
        if (returnType != UnitType) {
            out.print("return ")
        }
        out.print("Native.objc_msgSend(\"${returnTypeReflectString(returnType)}\", this, \"${function.getName()}\"")
        function.getParameterList()
                .map { p -> p.getName() }
                .let {
                    if (it.isNotEmpty()) {
                        out.print(", ")
                        it.joinTo(out, separator = ", ")
                    }
                }
        out.println(")")
        out.pop()

        out.println("}")
    }

    private fun returnTypeReflectString(type: Type): String {
        return when (type) {
            UnitType -> "void"
            BooleanType -> "boolean"
            CharType -> "char"
            // ByteType -> "byte"
            ShortType -> "short"
            IntType -> "int"
            FloatType -> "float"
            LongType -> "long"
            DoubleType -> "double"
            ObjCClassType -> "interface kni.objc.ObjCClass"
            is FunctionType -> "class kotlin.Function${type.paramTypes.size()}"
            else -> "class ${type.str}"
        }
    }

    private fun jvmMethodName(objcSelectorName: String): String {
        // Objective-C method names are usually of form 'methodName:withParam:andOtherParam:'
        // Here we strip away everything but the first part
        // TODO: handle methods with the same effective signature or invent something different
        return objcSelectorName.substringBefore(':')
    }
}
