// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSCachedImageRep.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCachedImageRep(pointer: Long) : NSImageRep(pointer) {
    public open fun initWithWindow_rect(win: NSWindow, rect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithWindow:rect:", win, rect) as ObjCObject

    public open fun initWithSize_depth_separate_alpha(size: Any, depth: Int, flag: Boolean, alpha: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSize:depth:separate:alpha:", size, depth, flag, alpha) as ObjCObject

    public open fun window(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "window") as NSWindow

    public open fun rect(): Any =
        Native.objc_msgSend("class objc.Any", this, "rect")

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSImageRep.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCachedImageRep")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
