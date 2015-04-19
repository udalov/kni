// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSharingService.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSSharingServiceDelegate {
    trait metaclass
}

trait NSSharingServicePickerDelegate {
    trait metaclass
}

public open class NSSharingService(pointer: Long) : NSObject(pointer) {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun alternateImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "alternateImage") as NSImage

    public open fun menuItemTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "menuItemTitle") as NSString

    public open fun setMenuItemTitle(menuItemTitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setMenuItemTitle:", menuItemTitle)
    }

    public open fun recipients(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "recipients") as NSArray

    public open fun setRecipients(recipients: NSArray): Unit {
        Native.objc_msgSend("void", this, "setRecipients:", recipients)
    }

    public open fun subject(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "subject") as NSString

    public open fun setSubject(subject: NSString): Unit {
        Native.objc_msgSend("void", this, "setSubject:", subject)
    }

    public open fun messageBody(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "messageBody") as NSString

    public open fun permanentLink(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "permanentLink") as NSURL

    public open fun accountName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "accountName") as NSString

    public open fun attachmentFileURLs(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "attachmentFileURLs") as NSArray

    public open fun initWithTitle_image_alternateImage_handler(title: NSString, image: NSImage, alternateImage: NSImage, block: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTitle:image:alternateImage:handler:", title, image, alternateImage, block) as ObjCObject

    public open fun canPerformWithItems(items: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "canPerformWithItems:", items) as Boolean

    public open fun performWithItems(items: NSArray): Unit {
        Native.objc_msgSend("void", this, "performWithItems:", items)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun sharingServicesForItems(items: NSArray): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "sharingServicesForItems:", items) as NSArray

        public open fun sharingServiceNamed(serviceName: NSString): NSSharingService =
            Native.objc_msgSend("class objc.NSSharingService", this, "sharingServiceNamed:", serviceName) as NSSharingService

    }

    companion object : NSObject(Native.objc_getClass("NSSharingService")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSSharingServicePicker(pointer: Long) : NSObject(pointer) {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun initWithItems(items: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithItems:", items) as ObjCObject

    public open fun showRelativeToRect_ofView_preferredEdge(rect: Any, view: NSView, preferredEdge: Int): Unit {
        Native.objc_msgSend("void", this, "showRelativeToRect:ofView:preferredEdge:", rect, view, preferredEdge)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSharingServicePicker")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
