package kni.objc

interface IObjCObject {
    val pointer: Long
}

abstract class ObjCObject protected constructor(override val pointer: Long) : IObjCObject {
    companion object {
        val NIL: Nil = Nil.INSTANCE
    }

    override fun toString(): String = "[ObjCObject %s %016x]".format(javaClass.name, pointer)
    override fun hashCode(): Int = (pointer xor (pointer ushr 32)).toInt()
    override fun equals(other: Any?): Boolean = other is ObjCObject && other.pointer == pointer
}
