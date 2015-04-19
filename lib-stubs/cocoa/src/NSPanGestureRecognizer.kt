// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPanGestureRecognizer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPanGestureRecognizer(pointer: Long) : NSGestureRecognizer(pointer), NSCoding {
    public open fun buttonMask(): Int =
        Native.objc_msgSend("int", this, "buttonMask") as Int

    public open fun setButtonMask(buttonMask: Int): Unit {
        Native.objc_msgSend("void", this, "setButtonMask:", buttonMask)
    }

    public open fun translationInView(view: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "translationInView:", view)

    public open fun setTranslation_inView(translation: Any, view: NSView): Unit {
        Native.objc_msgSend("void", this, "setTranslation:inView:", translation, view)
    }

    public open fun velocityInView(view: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "velocityInView:", view)

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun state(): Any =
        Native.objc_msgSend("class objc.Any", this, "state")

    trait metaclass : NSGestureRecognizer.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPanGestureRecognizer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
