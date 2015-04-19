// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSStoryboardSegue.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSSeguePerforming {
    trait metaclass
}

public open class NSStoryboardSegue(pointer: Long) : NSObject(pointer) {
    public open fun initWithIdentifier_source_destination(identifier: NSString, sourceController: ObjCObject, destinationController: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIdentifier:source:destination:", identifier, sourceController, destinationController) as ObjCObject

    public open fun identifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "identifier") as NSString

    public open fun sourceController(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "sourceController") as ObjCObject

    public open fun destinationController(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "destinationController") as ObjCObject

    public open fun perform(): Unit {
        Native.objc_msgSend("void", this, "perform")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun segueWithIdentifier_source_destination_performHandler(identifier: NSString, sourceController: ObjCObject, destinationController: ObjCObject, performHandler: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "segueWithIdentifier:source:destination:performHandler:", identifier, sourceController, destinationController, performHandler) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSStoryboardSegue")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
