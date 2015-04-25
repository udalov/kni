package kni.objc

class Nil : ObjCObject(0), ObjCClass {
    companion object {
        val INSTANCE = Nil()
    }
}
