package kni.objc

open class Pointer<T> internal constructor(open val peer: Long) {
    companion object {
        val NULL: Pointer<Any> = Pointer(0)
        val CHAR_SIZE: Int = 1

        fun allocateChar(): Pointer<Char> = allocateChars(1)
        fun allocateChars(size: Long): Pointer<Char> = Pointer<Char>(Native.malloc(size * CHAR_SIZE))
        fun pointerToChar(char: Char): Pointer<Char> {
            val pointer = allocateChar()
            pointer.setChar(char)
            return pointer
        }

        // TODO: support different encodings and stuff
        fun pointerToString(string: String): Pointer<Char> {
            // TODO: very inefficient, use a native function instead
            val n = string.length
            val pointer = allocateChars(n + 1L)
            for (i in 0..n - 1) {
                pointer.setChar(i.toLong(), string[i])
            }
            pointer.setChar(n.toLong(), 0.toChar())
            return pointer
        }
    }

    fun getChar(): Char = getChar(0)
    fun getChar(offset: Long): Char = (Native.getWord(peer + offset) and 0xff).toChar()
    fun setChar(char: Char): Unit = setChar(0, char)
    fun setChar(offset: Long, char: Char): Unit = Native.setWord(peer + offset, char.toByte().toLong())

    fun getString(): String {
        val sb = StringBuilder()
        var offset = 0L
        while (true) {
            val c = getChar(offset)
            if (c == 0.toChar()) break
            sb.append(c)
            offset++
        }
        return sb.toString()
    }

    fun release(): Unit = Native.free(peer)

    override fun toString(): String = "[Pointer %016x]".format(peer)
    override fun hashCode(): Int = (peer xor (peer ushr 32)).toInt()
    override fun equals(other: Any?): Boolean = other is Pointer<*> && other.peer == peer
}
