// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSClickGestureRecognizer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSClickGestureRecognizer(pointer: Long) : NSGestureRecognizer(pointer), NSCoding {
    public open fun buttonMask(): Int =
        Native.objc_msgSend("int", this, "buttonMask") as Int

    public open fun setButtonMask(buttonMask: Int): Unit {
        Native.objc_msgSend("void", this, "setButtonMask:", buttonMask)
    }

    public open fun numberOfClicksRequired(): Int =
        Native.objc_msgSend("int", this, "numberOfClicksRequired") as Int

    public open fun setNumberOfClicksRequired(numberOfClicksRequired: Int): Unit {
        Native.objc_msgSend("void", this, "setNumberOfClicksRequired:", numberOfClicksRequired)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun state(): Any =
        Native.objc_msgSend("class objc.Any", this, "state")

    trait metaclass : NSGestureRecognizer.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSClickGestureRecognizer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
