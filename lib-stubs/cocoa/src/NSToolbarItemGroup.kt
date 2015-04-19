// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSToolbarItemGroup.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSToolbarItemGroup(pointer: Long) : NSToolbarItem(pointer) {
    public open fun subitems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "subitems") as NSArray

    public open fun setSubitems(subitems: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSubitems:", subitems)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSToolbarItem.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSToolbarItemGroup")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
