// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPDFImageRep.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPDFImageRep(pointer: Long) : NSImageRep(pointer) {
    public open fun initWithData(pdfData: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", pdfData) as ObjCObject

    public open fun PDFRepresentation(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "PDFRepresentation") as NSData

    public open fun bounds(): Any =
        Native.objc_msgSend("class objc.Any", this, "bounds")

    public open fun currentPage(): Int =
        Native.objc_msgSend("int", this, "currentPage") as Int

    public open fun setCurrentPage(currentPage: Int): Unit {
        Native.objc_msgSend("void", this, "setCurrentPage:", currentPage)
    }

    public open fun pageCount(): Int =
        Native.objc_msgSend("int", this, "pageCount") as Int

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSImageRep.metaclass {
        public open fun imageRepWithData(pdfData: NSData): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "imageRepWithData:", pdfData) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSPDFImageRep")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
