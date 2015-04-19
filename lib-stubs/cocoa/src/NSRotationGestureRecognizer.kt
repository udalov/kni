// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSRotationGestureRecognizer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSRotationGestureRecognizer(pointer: Long) : NSGestureRecognizer(pointer) {
    public open fun rotation(): Double =
        Native.objc_msgSend("double", this, "rotation") as Double

    public open fun setRotation(rotation: Double): Unit {
        Native.objc_msgSend("void", this, "setRotation:", rotation)
    }

    public open fun rotationInDegrees(): Double =
        Native.objc_msgSend("double", this, "rotationInDegrees") as Double

    public open fun setRotationInDegrees(rotationInDegrees: Double): Unit {
        Native.objc_msgSend("void", this, "setRotationInDegrees:", rotationInDegrees)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun state(): Any =
        Native.objc_msgSend("class objc.Any", this, "state")

    trait metaclass : NSGestureRecognizer.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSRotationGestureRecognizer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
