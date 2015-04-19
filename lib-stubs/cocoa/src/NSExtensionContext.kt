// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSExtensionContext.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSExtensionContext(pointer: Long) : NSObject(pointer) {
    public open fun inputItems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "inputItems") as NSArray

    public open fun completeRequestReturningItems_completionHandler(items: NSArray, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "completeRequestReturningItems:completionHandler:", items, completionHandler)
    }

    public open fun cancelRequestWithError(error: NSError): Unit {
        Native.objc_msgSend("void", this, "cancelRequestWithError:", error)
    }

    public open fun openURL_completionHandler(URL: NSURL, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "openURL:completionHandler:", URL, completionHandler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSExtensionContext")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
