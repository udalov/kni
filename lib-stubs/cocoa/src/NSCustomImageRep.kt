// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSCustomImageRep.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCustomImageRep(pointer: Long) : NSImageRep(pointer) {
    public open fun initWithSize_flipped_drawingHandler(size: Any, drawingHandlerShouldBeCalledWithFlippedContext: Boolean, drawingHandler: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSize:flipped:drawingHandler:", size, drawingHandlerShouldBeCalledWithFlippedContext, drawingHandler) as ObjCObject

    public open fun drawingHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "drawingHandler")

    public open fun initWithDrawSelector_delegate(aMethod: ObjCSelector, anObject: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDrawSelector:delegate:", aMethod, anObject) as ObjCObject

    public open fun drawSelector(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "drawSelector") as ObjCSelector

    public open fun delegate(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "delegate") as ObjCObject

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSImageRep.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCustomImageRep")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
