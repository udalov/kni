// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSMagnificationGestureRecognizer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSMagnificationGestureRecognizer(pointer: Long) : NSGestureRecognizer(pointer) {
    public open fun magnification(): Double =
        Native.objc_msgSend("double", this, "magnification") as Double

    public open fun setMagnification(magnification: Double): Unit {
        Native.objc_msgSend("void", this, "setMagnification:", magnification)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun state(): Any =
        Native.objc_msgSend("class objc.Any", this, "state")

    trait metaclass : NSGestureRecognizer.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMagnificationGestureRecognizer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
