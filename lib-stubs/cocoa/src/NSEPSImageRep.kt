// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSEPSImageRep.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSEPSImageRep(pointer: Long) : NSImageRep(pointer) {
    public open fun initWithData(epsData: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", epsData) as ObjCObject

    public open fun prepareGState(): Unit {
        Native.objc_msgSend("void", this, "prepareGState")
    }

    public open fun EPSRepresentation(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "EPSRepresentation") as NSData

    public open fun boundingBox(): Any =
        Native.objc_msgSend("class objc.Any", this, "boundingBox")

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSImageRep.metaclass {
        public open fun imageRepWithData(epsData: NSData): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "imageRepWithData:", epsData) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSEPSImageRep")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
