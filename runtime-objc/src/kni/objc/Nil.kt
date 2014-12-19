package kni.objc

class Nil : ObjCObject(0), ObjCClass {
    class object {
        val INSTANCE = Nil()
    }
}
