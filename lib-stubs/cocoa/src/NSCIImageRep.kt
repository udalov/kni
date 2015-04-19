// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSCIImageRep.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCIImageRep(pointer: Long) : NSImageRep(pointer) {
    public open fun initWithCIImage(image: CIImage): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCIImage:", image) as ObjCObject

    public open fun CIImage(): CIImage =
        Native.objc_msgSend("class objc.CIImage", this, "CIImage") as CIImage

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSImageRep.metaclass {
        public open fun imageRepWithCIImage(image: CIImage): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "imageRepWithCIImage:", image) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSCIImageRep")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait CIImage_NSAppKitAdditions : IObjCObject {
    public open fun initWithBitmapImageRep(bitmapImageRep: NSBitmapImageRep): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBitmapImageRep:", bitmapImageRep) as ObjCObject

    public open fun drawInRect_fromRect_operation_fraction(rect: Any, fromRect: Any, op: Any, delta: Double): Unit {
        Native.objc_msgSend("void", this, "drawInRect:fromRect:operation:fraction:", rect, fromRect, op, delta)
    }

    public open fun drawAtPoint_fromRect_operation_fraction(point: Any, fromRect: Any, op: Any, delta: Double): Unit {
        Native.objc_msgSend("void", this, "drawAtPoint:fromRect:operation:fraction:", point, fromRect, op, delta)
    }

    trait metaclass : IObjCObject
}
