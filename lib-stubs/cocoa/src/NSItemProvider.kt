// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSItemProvider.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSItemProvider(pointer: Long) : NSObject(pointer), NSCopying, NSItemProvider_NSPreviewSupport, NSItemProvider_NSItemSourceInfo {
    public open fun initWithItem_typeIdentifier(item: Any, typeIdentifier: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithItem:typeIdentifier:", item, typeIdentifier) as ObjCObject

    public open fun initWithContentsOfURL(fileURL: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:", fileURL) as ObjCObject

    public open fun registerItemForTypeIdentifier_loadHandler(typeIdentifier: NSString, loadHandler: Any): Unit {
        Native.objc_msgSend("void", this, "registerItemForTypeIdentifier:loadHandler:", typeIdentifier, loadHandler)
    }

    public open fun registeredTypeIdentifiers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "registeredTypeIdentifiers") as NSArray

    public open fun hasItemConformingToTypeIdentifier(typeIdentifier: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "hasItemConformingToTypeIdentifier:", typeIdentifier) as Boolean

    public open fun loadItemForTypeIdentifier_options_completionHandler(typeIdentifier: NSString, options: NSDictionary, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "loadItemForTypeIdentifier:options:completionHandler:", typeIdentifier, options, completionHandler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSItemProvider_NSPreviewSupport.metaclass, NSItemProvider_NSItemSourceInfo.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSItemProvider")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSItemProvider_NSPreviewSupport : IObjCObject {
    public open fun previewImageHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "previewImageHandler")

    public open fun setPreviewImageHandler(previewImageHandler: Any): Unit {
        Native.objc_msgSend("void", this, "setPreviewImageHandler:", previewImageHandler)
    }

    public open fun loadPreviewImageWithOptions_completionHandler(options: NSDictionary, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "loadPreviewImageWithOptions:completionHandler:", options, completionHandler)
    }

    trait metaclass : IObjCObject
}

trait NSItemProvider_NSItemSourceInfo : IObjCObject {
    public open fun sourceFrame(): Any =
        Native.objc_msgSend("class objc.Any", this, "sourceFrame")

    public open fun containerFrame(): Any =
        Native.objc_msgSend("class objc.Any", this, "containerFrame")

    public open fun preferredPresentationSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "preferredPresentationSize")

    trait metaclass : IObjCObject
}
