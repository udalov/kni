// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPICTImageRep.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPICTImageRep(pointer: Long) : NSImageRep(pointer) {
    public open fun initWithData(pictData: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", pictData) as ObjCObject

    public open fun PICTRepresentation(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "PICTRepresentation") as NSData

    public open fun boundingBox(): Any =
        Native.objc_msgSend("class objc.Any", this, "boundingBox")

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSImageRep.metaclass {
        public open fun imageRepWithData(pictData: NSData): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "imageRepWithData:", pictData) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSPICTImageRep")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
