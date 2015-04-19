// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSExtensionItem.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSExtensionItem(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    public open fun attributedTitle(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedTitle") as NSAttributedString

    public open fun setAttributedTitle(attributedTitle: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedTitle:", attributedTitle)
    }

    public open fun attributedContentText(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedContentText") as NSAttributedString

    public open fun setAttributedContentText(attributedContentText: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedContentText:", attributedContentText)
    }

    public open fun attachments(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "attachments") as NSArray

    public open fun setAttachments(attachments: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAttachments:", attachments)
    }

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    public open fun setUserInfo(userInfo: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setUserInfo:", userInfo)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSExtensionItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
