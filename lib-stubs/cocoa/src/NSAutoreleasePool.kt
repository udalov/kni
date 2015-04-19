// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSAutoreleasePool.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSAutoreleasePool(pointer: Long) : NSObject(pointer) {
    public open fun addObject(anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObject:", anObject)
    }

    public open fun drain(): Unit {
        Native.objc_msgSend("void", this, "drain")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun addObject(anObject: ObjCObject): Unit {
            Native.objc_msgSend("void", this, "addObject:", anObject)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSAutoreleasePool")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
