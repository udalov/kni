package org.jetbrains.kni.gen

class Printer(private val out: Appendable): Appendable {
    private var indent = ""
    private var lineStart = true

    fun push() { indent += INDENT }
    fun pop() { indent = indent.substring(INDENT.length()) }

    fun print(o: Any?) {
        if (lineStart) out.append(indent)
        out.append(o.toString())
        lineStart = false
    }

    fun println() {
        out.appendln()
        lineStart = true
    }

    fun println(o: Any?) {
        print(o)
        println()
    }

    class object {
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
