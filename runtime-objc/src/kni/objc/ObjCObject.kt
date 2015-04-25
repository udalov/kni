package kni.objc

public trait IObjCObject {
    protected val pointer: Long
}

public abstract class ObjCObject protected(override val pointer: Long) : IObjCObject {
    companion object {
        public val NIL: Nil = Nil.INSTANCE
    }

    override fun toString(): String = "[ObjCObject %s %016x]".format(javaClass.getName(), pointer)
    override fun hashCode(): Int = (pointer xor (pointer ushr 32)).toInt()
    override fun equals(other: Any?): Boolean = other is ObjCObject && other.pointer == pointer
}
