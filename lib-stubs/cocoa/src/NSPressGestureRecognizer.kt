// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPressGestureRecognizer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPressGestureRecognizer(pointer: Long) : NSGestureRecognizer(pointer), NSCoding {
    public open fun buttonMask(): Int =
        Native.objc_msgSend("int", this, "buttonMask") as Int

    public open fun setButtonMask(buttonMask: Int): Unit {
        Native.objc_msgSend("void", this, "setButtonMask:", buttonMask)
    }

    public open fun minimumPressDuration(): Double =
        Native.objc_msgSend("double", this, "minimumPressDuration") as Double

    public open fun setMinimumPressDuration(minimumPressDuration: Double): Unit {
        Native.objc_msgSend("void", this, "setMinimumPressDuration:", minimumPressDuration)
    }

    public open fun allowableMovement(): Double =
        Native.objc_msgSend("double", this, "allowableMovement") as Double

    public open fun setAllowableMovement(allowableMovement: Double): Unit {
        Native.objc_msgSend("void", this, "setAllowableMovement:", allowableMovement)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun state(): Any =
        Native.objc_msgSend("class objc.Any", this, "state")

    trait metaclass : NSGestureRecognizer.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPressGestureRecognizer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
