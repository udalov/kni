// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPDFInfo.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPDFInfo(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun setURL(URL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setURL:", URL)
    }

    public open fun isFileExtensionHidden(): Boolean =
        Native.objc_msgSend("boolean", this, "isFileExtensionHidden") as Boolean

    public open fun setFileExtensionHidden(fileExtensionHidden: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFileExtensionHidden:", fileExtensionHidden)
    }

    public open fun tagNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "tagNames") as NSArray

    public open fun setTagNames(tagNames: NSArray): Unit {
        Native.objc_msgSend("void", this, "setTagNames:", tagNames)
    }

    public open fun orientation(): Any =
        Native.objc_msgSend("class objc.Any", this, "orientation")

    public open fun setOrientation(orientation: Any): Unit {
        Native.objc_msgSend("void", this, "setOrientation:", orientation)
    }

    public open fun paperSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "paperSize")

    public open fun setPaperSize(paperSize: Any): Unit {
        Native.objc_msgSend("void", this, "setPaperSize:", paperSize)
    }

    public open fun attributes(): NSMutableDictionary =
        Native.objc_msgSend("class objc.NSMutableDictionary", this, "attributes") as NSMutableDictionary

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPDFInfo")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
