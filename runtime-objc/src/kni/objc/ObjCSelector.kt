package kni.objc

class ObjCSelector internal constructor(override val peer: Long) : Pointer<Any>(peer)
