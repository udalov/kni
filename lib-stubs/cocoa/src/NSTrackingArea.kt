// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTrackingArea.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTrackingArea(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun initWithRect_options_owner_userInfo(rect: Any, options: Any, owner: ObjCObject, userInfo: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRect:options:owner:userInfo:", rect, options, owner, userInfo) as ObjCObject

    public open fun rect(): Any =
        Native.objc_msgSend("class objc.Any", this, "rect")

    public open fun options(): Any =
        Native.objc_msgSend("class objc.Any", this, "options")

    public open fun owner(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "owner") as ObjCObject

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTrackingArea")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
