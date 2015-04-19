// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPrintInfo.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPrintInfo(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSPrintInfo_NSDeprecated {
    public open fun initWithDictionary(attributes: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDictionary:", attributes) as ObjCObject

    public open fun dictionary(): NSMutableDictionary =
        Native.objc_msgSend("class objc.NSMutableDictionary", this, "dictionary") as NSMutableDictionary

    public open fun paperName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "paperName") as NSString

    public open fun setPaperName(paperName: NSString): Unit {
        Native.objc_msgSend("void", this, "setPaperName:", paperName)
    }

    public open fun paperSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "paperSize")

    public open fun setPaperSize(paperSize: Any): Unit {
        Native.objc_msgSend("void", this, "setPaperSize:", paperSize)
    }

    public open fun orientation(): Any =
        Native.objc_msgSend("class objc.Any", this, "orientation")

    public open fun setOrientation(orientation: Any): Unit {
        Native.objc_msgSend("void", this, "setOrientation:", orientation)
    }

    public open fun scalingFactor(): Double =
        Native.objc_msgSend("double", this, "scalingFactor") as Double

    public open fun setScalingFactor(scalingFactor: Double): Unit {
        Native.objc_msgSend("void", this, "setScalingFactor:", scalingFactor)
    }

    public open fun leftMargin(): Double =
        Native.objc_msgSend("double", this, "leftMargin") as Double

    public open fun setLeftMargin(leftMargin: Double): Unit {
        Native.objc_msgSend("void", this, "setLeftMargin:", leftMargin)
    }

    public open fun rightMargin(): Double =
        Native.objc_msgSend("double", this, "rightMargin") as Double

    public open fun setRightMargin(rightMargin: Double): Unit {
        Native.objc_msgSend("void", this, "setRightMargin:", rightMargin)
    }

    public open fun topMargin(): Double =
        Native.objc_msgSend("double", this, "topMargin") as Double

    public open fun setTopMargin(topMargin: Double): Unit {
        Native.objc_msgSend("void", this, "setTopMargin:", topMargin)
    }

    public open fun bottomMargin(): Double =
        Native.objc_msgSend("double", this, "bottomMargin") as Double

    public open fun setBottomMargin(bottomMargin: Double): Unit {
        Native.objc_msgSend("void", this, "setBottomMargin:", bottomMargin)
    }

    public open fun isHorizontallyCentered(): Boolean =
        Native.objc_msgSend("boolean", this, "isHorizontallyCentered") as Boolean

    public open fun setHorizontallyCentered(horizontallyCentered: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHorizontallyCentered:", horizontallyCentered)
    }

    public open fun isVerticallyCentered(): Boolean =
        Native.objc_msgSend("boolean", this, "isVerticallyCentered") as Boolean

    public open fun setVerticallyCentered(verticallyCentered: Boolean): Unit {
        Native.objc_msgSend("void", this, "setVerticallyCentered:", verticallyCentered)
    }

    public open fun horizontalPagination(): Any =
        Native.objc_msgSend("class objc.Any", this, "horizontalPagination")

    public open fun setHorizontalPagination(horizontalPagination: Any): Unit {
        Native.objc_msgSend("void", this, "setHorizontalPagination:", horizontalPagination)
    }

    public open fun verticalPagination(): Any =
        Native.objc_msgSend("class objc.Any", this, "verticalPagination")

    public open fun setVerticalPagination(verticalPagination: Any): Unit {
        Native.objc_msgSend("void", this, "setVerticalPagination:", verticalPagination)
    }

    public open fun jobDisposition(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "jobDisposition") as NSString

    public open fun setJobDisposition(jobDisposition: NSString): Unit {
        Native.objc_msgSend("void", this, "setJobDisposition:", jobDisposition)
    }

    public open fun printer(): NSPrinter =
        Native.objc_msgSend("class objc.NSPrinter", this, "printer") as NSPrinter

    public open fun setPrinter(printer: NSPrinter): Unit {
        Native.objc_msgSend("void", this, "setPrinter:", printer)
    }

    public open fun setUpPrintOperationDefaultValues(): Unit {
        Native.objc_msgSend("void", this, "setUpPrintOperationDefaultValues")
    }

    public open fun imageablePageBounds(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageablePageBounds")

    public open fun localizedPaperName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedPaperName") as NSString

    public open fun printSettings(): NSMutableDictionary =
        Native.objc_msgSend("class objc.NSMutableDictionary", this, "printSettings") as NSMutableDictionary

    public open fun PMPrintSession(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "PMPrintSession") as Pointer<*>

    public open fun PMPageFormat(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "PMPageFormat") as Pointer<*>

    public open fun PMPrintSettings(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "PMPrintSettings") as Pointer<*>

    public open fun updateFromPMPageFormat(): Unit {
        Native.objc_msgSend("void", this, "updateFromPMPageFormat")
    }

    public open fun updateFromPMPrintSettings(): Unit {
        Native.objc_msgSend("void", this, "updateFromPMPrintSettings")
    }

    public open fun isSelectionOnly(): Boolean =
        Native.objc_msgSend("boolean", this, "isSelectionOnly") as Boolean

    public open fun setSelectionOnly(selectionOnly: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectionOnly:", selectionOnly)
    }

    public open fun takeSettingsFromPDFInfo(inPDFInfo: NSPDFInfo): Unit {
        Native.objc_msgSend("void", this, "takeSettingsFromPDFInfo:", inPDFInfo)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSPrintInfo_NSDeprecated.metaclass {
        public open fun setSharedPrintInfo(printInfo: NSPrintInfo): Unit {
            Native.objc_msgSend("void", this, "setSharedPrintInfo:", printInfo)
        }

        public open fun sharedPrintInfo(): NSPrintInfo =
            Native.objc_msgSend("class objc.NSPrintInfo", this, "sharedPrintInfo") as NSPrintInfo

        public open fun defaultPrinter(): NSPrinter =
            Native.objc_msgSend("class objc.NSPrinter", this, "defaultPrinter") as NSPrinter

    }

    companion object : NSObject(Native.objc_getClass("NSPrintInfo")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSPrintInfo_NSDeprecated : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun setDefaultPrinter(printer: NSPrinter): Unit {
            Native.objc_msgSend("void", this, "setDefaultPrinter:", printer)
        }

        public open fun sizeForPaperName(name: NSString): Any =
            Native.objc_msgSend("class objc.Any", this, "sizeForPaperName:", name)
    }
}
