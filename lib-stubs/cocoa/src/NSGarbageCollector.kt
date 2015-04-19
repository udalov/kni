// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSGarbageCollector.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSGarbageCollector(pointer: Long) : NSObject(pointer) {
    public open fun isCollecting(): Boolean =
        Native.objc_msgSend("boolean", this, "isCollecting") as Boolean

    public open fun disable(): Unit {
        Native.objc_msgSend("void", this, "disable")
    }

    public open fun enable(): Unit {
        Native.objc_msgSend("void", this, "enable")
    }

    public open fun isEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabled") as Boolean

    public open fun collectIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "collectIfNeeded")
    }

    public open fun collectExhaustively(): Unit {
        Native.objc_msgSend("void", this, "collectExhaustively")
    }

    public open fun disableCollectorForPointer(ptr: Pointer<Unit>): Unit {
        Native.objc_msgSend("void", this, "disableCollectorForPointer:", ptr)
    }

    public open fun enableCollectorForPointer(ptr: Pointer<Unit>): Unit {
        Native.objc_msgSend("void", this, "enableCollectorForPointer:", ptr)
    }

    public open fun zone(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "zone") as Pointer<Any>

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun defaultCollector(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "defaultCollector") as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSGarbageCollector")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
