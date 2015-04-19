// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextList.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTextList(pointer: Long) : NSObject(pointer), NSCoding, NSCopying {
    public open fun initWithMarkerFormat_options(format: NSString, mask: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithMarkerFormat:options:", format, mask) as ObjCObject

    public open fun markerFormat(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "markerFormat") as NSString

    public open fun listOptions(): Any =
        Native.objc_msgSend("class objc.Any", this, "listOptions")

    public open fun markerForItemNumber(itemNum: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "markerForItemNumber:", itemNum) as NSString

    public open fun startingItemNumber(): Int =
        Native.objc_msgSend("int", this, "startingItemNumber") as Int

    public open fun setStartingItemNumber(startingItemNumber: Int): Unit {
        Native.objc_msgSend("void", this, "setStartingItemNumber:", startingItemNumber)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSCopying.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextList")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
