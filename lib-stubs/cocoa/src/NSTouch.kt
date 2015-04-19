// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTouch.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTouch(pointer: Long) : NSObject(pointer), NSCopying {
    public open fun identity(): Any =
        Native.objc_msgSend("class objc.Any", this, "identity")

    public open fun phase(): Any =
        Native.objc_msgSend("class objc.Any", this, "phase")

    public open fun normalizedPosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "normalizedPosition")

    public open fun isResting(): Boolean =
        Native.objc_msgSend("boolean", this, "isResting") as Boolean

    public open fun device(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "device") as ObjCObject

    public open fun deviceSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "deviceSize")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTouch")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
