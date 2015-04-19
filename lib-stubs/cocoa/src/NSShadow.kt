// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSShadow.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSShadow(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun shadowOffset(): Any =
        Native.objc_msgSend("class objc.Any", this, "shadowOffset")

    public open fun setShadowOffset(shadowOffset: Any): Unit {
        Native.objc_msgSend("void", this, "setShadowOffset:", shadowOffset)
    }

    public open fun shadowBlurRadius(): Double =
        Native.objc_msgSend("double", this, "shadowBlurRadius") as Double

    public open fun setShadowBlurRadius(shadowBlurRadius: Double): Unit {
        Native.objc_msgSend("void", this, "setShadowBlurRadius:", shadowBlurRadius)
    }

    public open fun shadowColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "shadowColor") as NSColor

    public open fun setShadowColor(shadowColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setShadowColor:", shadowColor)
    }

    public open fun set(): Unit {
        Native.objc_msgSend("void", this, "set")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSShadow")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
