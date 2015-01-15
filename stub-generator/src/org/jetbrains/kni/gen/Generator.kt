package org.jetbrains.kni.gen

import java.io.File
import org.jetbrains.kni.indexer.NativeIndex.*
import java.util.HashMap
import java.nio.file.Paths
import org.jetbrains.kni.indexer.NativeIndexingOptions
import org.jetbrains.kni.indexer.Language.*

public fun generateStub(translationUnit: TranslationUnit, dylib: File, outputFile: File, options: NativeIndexingOptions): File {
    val result = StringBuilder()
    val out = Printer(result)

    out.println("// This file is auto-generated. DO NOT EDIT!")
    out.println()
    out.println("[file: suppress(\"UNCHECKED_CAST\")]")
    out.println()

    val namer = Namer(translationUnit)
    val generator = Generator(out, namer, dylib)

    when (options.language) {
        OBJC -> {
            out.println("package objc")
            out.println()
            out.println("import kni.objc.*")
            out.println()
            for (protocol in translationUnit.getProtocolList()) {
                generator.genProtocol(protocol)
                out.println()
            }

            for (klass in translationUnit.getClass_List()) {
                generator.genClass(klass)
                out.println()
            }

            for (category in translationUnit.getCategoryList()) {
                generator.genCategory(category)
                out.println()
            }
        }
        CPP -> {
            out.println("package native")
            out.println()
            out.println("import jnr.ffi.*")
            out.println("import jnr.ffi.types.*")
            out.println()
            generator.genCFunctions(translationUnit.getFunctionList().distinct())
        }
        else -> error("Unknown language: ${options.language}")
    }

    outputFile.getParentFile().mkdirs()
    outputFile.writeText(result.toString())
    return outputFile
}

class Generator(private val out: Printer, private val namer: Namer, private val dylib: File) {
    fun genClass(klass: ObjCClass) {
        out.print("open class ${klass.getName()}(pointer: Long)")

        val baseClass =
                if (klass.hasBaseClass()) klass.getBaseClass()
                else "ObjCObject"
        val protocols = klass.getProtocolList()
        val categories = klass.getCategoryList()

        val baseList =
            listOf("$baseClass(pointer)") +
            protocols.map { namer.protocolName(it) } +
            categories.map { namer.categoryName(it) }

        baseList.joinTo(out, separator = ", ", prefix = " : ")
        out.println(" {")

        out.push()

        // -[NSObject finalize] conflicts with java.lang.Object.finalize
        // TODO: unhardcode
        val methods = klass.getMethodList().filter { it.getFunction().getName() != "finalize" }

        for (method in methods.filter { !it.getClassMethod() }) {
            genObjCFunction(method.getFunction(), open = true)
            out.println()
        }

        genMetaClass(klass, methods)
        out.println()
        genClassObject(klass)

        // TODO: properties

        out.pop()

        out.println("}")
    }

    private fun genMetaClass(klass: ObjCClass, methods: List<ObjCMethod>) {
        val baseList =
                (if (klass.hasBaseClass())
                    listOf(klass.getBaseClass() + ".metaclass")
                else listOf("ObjCObject")) +
                klass.getProtocolList().map { namer.protocolName(it) + ".metaclass" }
        out.println("trait metaclass : ${baseList.join(", ")} {")
        out.push()

        var first = true
        for (method in methods.filter { it.getClassMethod() }) {
            if (first) first = false else out.println()
            genObjCFunction(method.getFunction(), open = false)
        }

        out.pop()
        out.println("}")
    }

    private fun genClassObject(klass: ObjCClass) {
        // TODO (!): there may be other hierarchy roots!
        out.println("class object : NSObject(Native.objc_getClass(\"${klass.getName()}\")), metaclass, ObjCClass {")
        out.push()

        // TODO: only generate this into class objects of root classes
        out.println("{ loadLibrary(\"${dylib.getPath()}\") }")

        out.pop()
        out.println("}")
    }

    fun genProtocol(protocol: ObjCProtocol) {
        out.println("trait ${namer.protocolName(protocol.getName())} {")
        out.push()
        // TODO: methods
        out.println("trait metaclass")
        out.pop()
        out.println("}")
    }

    fun genCategory(category: ObjCCategory) {
        out.println("trait ${namer.categoryName(category.getName())}")
        // TODO: methods
    }

    fun genCFunctions(functions: Iterable<Function>) {
        out.println()
        out.println("public trait ${namer.cFunctionsInterfaceName()} {")
        for (function in functions) {
            out.print("    ")
            makeFunSignature(function)
            out.println()
        }
        out.println("}")
        out.println()
        out.println("public fun get_${namer.cFunctionsInterfaceName()}(libName: String): ${namer.cFunctionsInterfaceName()} = LibraryLoader.create(javaClass<${namer.cFunctionsInterfaceName()}>()).load(libName)")
        out.println()
    }

    private fun genObjCFunction(function: Function, open: Boolean) {
        if (open) {
            out.print("open ")
        }
        val returnType = makeFunSignature(function)
        out.println(" {")

        out.push()
        if (returnType != UnitType) {
            out.print("return ")
        }
        out.print("Native.objc_msgSend(\"${returnTypeReflectString(returnType)}\", this, \"${function.getName()}\"")
        function.getParameterList()
                .mapIndexed { i, p -> namer.parameterName( p.getName(), i) }
                .let {
                    if (it.isNotEmpty()) {
                        out.print(", ")
                        it.joinTo(out, separator = ", ")
                    }
                }
        out.print(")")
        if (returnType != UnitType && returnType.str != "Any") {
            out.print(" as ${returnType.str}")
        }
        out.println()
        out.pop()

        out.println("}")
    }

    private fun makeFunSignature(function: Function): Type {
        out.print("fun ${namer.methodName(function.getName())}")

        function.getParameterList()
                .mapIndexed { i, p -> namer.parameterName(p.getName(), i) + ": " + parseType(p.getType()).str }
                .joinTo(out, separator = ", ", prefix = "(", postfix = ")")

        val returnType = parseType(function.getReturnType())
        if (returnType != UnitType) {
            out.print(": ${returnType.str}")
        }
        return returnType
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
            OpaquePointerType, is PointerType -> "class kni.objc.Pointer"
            ObjCObjectType, ObjCSelectorType -> "class kni.objc.${type.str}"
            is FunctionType -> "class kotlin.Function${type.paramTypes.size()}"
            else -> "class objc.${type.str}"
        }
    }
}

class Namer(translationUnit: TranslationUnit) {
    private val protocolNames = HashMap<String, String>()
    val name = translationUnit.getName()

    private fun calculateProtocolNames(translationUnit: TranslationUnit) {
        val existingNames = translationUnit.getClass_List().map { it.getName() }.toMutableSet()

        for (protocol in translationUnit.getProtocolList()) {
            val protocolName = protocol.getName()
            var name = protocolName
            if (name in existingNames) {
                // Since Objective-C classes and protocols exist in different namespaces and Kotlin classes and traits
                // don't, we invent a new name here for the trait when a class with the same name exists already
                // TODO: handle collisions (where both classes X and XProtocol and a protocol X exist)
                name = protocolName + "Protocol"
            }

            protocolNames[protocolName] = name
            existingNames.add(name)
        }
    }

    {
        calculateProtocolNames(translationUnit)
    }

    fun cFunctionsInterfaceName(): String {
        val p = Paths.get(name)
        return "iface_${p.getFileName().toString().replaceAll("\\.","_")}"
    }

    fun protocolName(name: String): String {
        return protocolNames[name]
    }

    fun categoryName(name: String): String {
        // ASM verifier incorrectly requires names to be Java identifiers, see CheckMethodAdapter.checkInternalName
        // TODO: fix ASM
        return name.replace('+', '_')
    }

    fun methodName(objcSelectorName: String): String {
        // Objective-C method names are usually of form 'methodName:withParam:andOtherParam:'
        // Here we strip away everything but the first part
        // TODO: handle methods with the same effective signature or invent something different
        return escape(objcSelectorName.substringBefore(':'))
    }

    fun parameterName(name: String, idx: Int): String {
        val n = escape(name)
        return if (n.isEmpty()) "_$idx" else n
    }

    private fun escape(name: String): String {
        // TODO: all Kotlin keywords
        if (name in setOf("class", "object", "fun")) return "`$name`"
        return name
    }
}
