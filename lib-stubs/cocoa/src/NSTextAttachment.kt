// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextAttachment.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTextAttachmentCellProtocol {
    trait metaclass
}

public open class NSTextAttachmentCell(pointer: Long) : NSCell(pointer), NSTextAttachmentCellProtocol {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSCell.metaclass, NSTextAttachmentCellProtocol.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextAttachmentCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSTextAttachment(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun initWithFileWrapper(fileWrapper: NSFileWrapper): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFileWrapper:", fileWrapper) as ObjCObject

    public open fun fileWrapper(): NSFileWrapper =
        Native.objc_msgSend("class objc.NSFileWrapper", this, "fileWrapper") as NSFileWrapper

    public open fun setFileWrapper(fileWrapper: NSFileWrapper): Unit {
        Native.objc_msgSend("void", this, "setFileWrapper:", fileWrapper)
    }

    public open fun attachmentCell(): Any =
        Native.objc_msgSend("class objc.Any", this, "attachmentCell")

    public open fun setAttachmentCell(attachmentCell: Any): Unit {
        Native.objc_msgSend("void", this, "setAttachmentCell:", attachmentCell)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextAttachment")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSAttributedString_NSAttributedStringAttachmentConveniences : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun attributedStringWithAttachment(attachment: NSTextAttachment): NSAttributedString =
            Native.objc_msgSend("class objc.NSAttributedString", this, "attributedStringWithAttachment:", attachment) as NSAttributedString
    }
}

trait NSMutableAttributedString_NSMutableAttributedStringAttachmentConveniences : IObjCObject {
    public open fun updateAttachmentsFromPath(path: NSString): Unit {
        Native.objc_msgSend("void", this, "updateAttachmentsFromPath:", path)
    }

    trait metaclass : IObjCObject
}
