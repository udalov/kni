package kni.objc

public open class Pointer<T> internal(open val peer: Long) {
    companion object {
        public val NULL: Pointer<Any> = Pointer(0)
        public val CHAR_SIZE: Int = 1

        public fun allocateChar(): Pointer<Char> = allocateChars(1)
        public fun allocateChars(size: Long): Pointer<Char> = Pointer<Char>(Native.malloc(size * CHAR_SIZE))
        public fun pointerToChar(char: Char): Pointer<Char> {
            val pointer = allocateChar()
            pointer.setChar(char)
            return pointer
        }

        // TODO: support different encodings and stuff
        public fun pointerToString(string: String): Pointer<Char> {
            // TODO: very inefficient, use a native function instead
            val n = string.length()
            val pointer = allocateChars(n + 1L)
            for (i in n.indices) {
                pointer.setChar(i.toLong(), string[i])
            }
            pointer.setChar(n.toLong(), 0.toChar())
            return pointer
        }
    }

    public fun getChar(): Char = getChar(0)
    public fun getChar(offset: Long): Char = (Native.getWord(peer + offset) and 0xff).toChar()
    public fun setChar(char: Char): Unit = setChar(0, char)
    public fun setChar(offset: Long, char: Char): Unit = Native.setWord(peer + offset, char.toByte().toLong())

    public fun getString(): String {
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

    public fun release(): Unit = Native.free(peer)

    override fun toString(): String = "[Pointer %016x]".format(peer)
    override fun hashCode(): Int = (peer xor (peer ushr 32)).toInt()
    override fun equals(other: Any?): Boolean = other is Pointer<*> && other.peer == peer
}
