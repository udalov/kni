// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextAlternatives.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTextAlternatives(pointer: Long) : NSObject(pointer) {
    public open fun initWithPrimaryString_alternativeStrings(primaryString: NSString, alternativeStrings: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPrimaryString:alternativeStrings:", primaryString, alternativeStrings) as ObjCObject

    public open fun primaryString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "primaryString") as NSString

    public open fun alternativeStrings(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "alternativeStrings") as NSArray

    public open fun noteSelectedAlternativeString(alternativeString: NSString): Unit {
        Native.objc_msgSend("void", this, "noteSelectedAlternativeString:", alternativeString)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextAlternatives")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
