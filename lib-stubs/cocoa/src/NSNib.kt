// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSNib.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSNib(pointer: Long) : NSObject(pointer), NSCoding, NSNib_NSDeprecated {
    public open fun initWithNibNamed_bundle(nibName: NSString, bundle: NSBundle): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithNibNamed:bundle:", nibName, bundle) as ObjCObject

    public open fun initWithNibData_bundle(nibData: NSData, bundle: NSBundle): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithNibData:bundle:", nibData, bundle) as ObjCObject

    public open fun instantiateWithOwner_topLevelObjects(owner: ObjCObject, topLevelObjects: Pointer<NSArray>): Boolean =
        Native.objc_msgSend("boolean", this, "instantiateWithOwner:topLevelObjects:", owner, topLevelObjects) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSNib_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSNib")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSNib_NSDeprecated : IObjCObject {
    public open fun initWithContentsOfURL(nibFileURL: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:", nibFileURL) as ObjCObject

    public open fun instantiateNibWithExternalNameTable(externalNameTable: NSDictionary): Boolean =
        Native.objc_msgSend("boolean", this, "instantiateNibWithExternalNameTable:", externalNameTable) as Boolean

    public open fun instantiateNibWithOwner_topLevelObjects(owner: ObjCObject, topLevelObjects: Pointer<NSArray>): Boolean =
        Native.objc_msgSend("boolean", this, "instantiateNibWithOwner:topLevelObjects:", owner, topLevelObjects) as Boolean

    trait metaclass : IObjCObject
}
