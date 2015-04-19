// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSStoryboard.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSStoryboard(pointer: Long) : NSObject(pointer) {
    public open fun instantiateInitialController(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "instantiateInitialController") as ObjCObject

    public open fun instantiateControllerWithIdentifier(identifier: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "instantiateControllerWithIdentifier:", identifier) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun storyboardWithName_bundle(name: NSString, storyboardBundleOrNil: NSBundle): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "storyboardWithName:bundle:", name, storyboardBundleOrNil) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSStoryboard")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
