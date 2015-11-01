package org.jetbrains.kni.gen

class Printer(private val out: Appendable): Appendable {
    private var indent = ""
    private var lineStart = true

    fun push(): Printer { indent += INDENT; return this }
    fun pop(): Printer { indent = indent.substring(INDENT.length); return this }

    fun print(o: Any?): Printer {
        if (lineStart) out.append(indent)
        out.append(o.toString())
        lineStart = false
        return this
    }

    fun println(): Printer {
        out.appendln()
        lineStart = true
        return this
    }

    fun ln(): Printer = println()

    fun println(o: Any?): Printer = print(o).ln()

    fun pushoneln(o: Any?): Printer = push().println(o).pop()

    companion object {
        val INDENT = "    "
    }

    override fun append(csq: CharSequence?): Appendable {
        print(csq)
        return this
    }

    override fun append(csq: CharSequence?, start: Int, end: Int): Appendable {
        print(csq?.subSequence(start, end))
        return this
    }

    override fun append(c: Char): Appendable {
        print(c)
        return this
    }
}


fun Printer.plusAssign(o: Any?): Printer = this.print(o)
