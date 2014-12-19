package kni.objc

public abstract class ObjCObject protected(private val pointer: Long) {
    class object {
        public val NIL: Nil = Nil.INSTANCE
    }

    override fun toString(): String = "[ObjCObject %s %016x]".format(javaClass.getName(), pointer)
    override fun hashCode(): Int = (pointer xor (pointer ushr 32)).toInt()
    override fun equals(other: Any?): Boolean = other is ObjCObject && other.pointer == pointer
}
