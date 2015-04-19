// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSStatusBar.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSStatusBar(pointer: Long) : NSObject(pointer) {
    public open fun statusItemWithLength(length: Double): NSStatusItem =
        Native.objc_msgSend("class objc.NSStatusItem", this, "statusItemWithLength:", length) as NSStatusItem

    public open fun removeStatusItem(item: NSStatusItem): Unit {
        Native.objc_msgSend("void", this, "removeStatusItem:", item)
    }

    public open fun isVertical(): Boolean =
        Native.objc_msgSend("boolean", this, "isVertical") as Boolean

    public open fun thickness(): Double =
        Native.objc_msgSend("double", this, "thickness") as Double

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun systemStatusBar(): NSStatusBar =
            Native.objc_msgSend("class objc.NSStatusBar", this, "systemStatusBar") as NSStatusBar

    }

    companion object : NSObject(Native.objc_getClass("NSStatusBar")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
