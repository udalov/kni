// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSAppearance.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSAppearanceCustomization {
    trait metaclass
}

public open class NSAppearance(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun initWithAppearanceNamed_bundle(name: NSString, bundle: NSBundle): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithAppearanceNamed:bundle:", name, bundle) as ObjCObject

    public open fun allowsVibrancy(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsVibrancy") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
        public open fun currentAppearance(): NSAppearance =
            Native.objc_msgSend("class objc.NSAppearance", this, "currentAppearance") as NSAppearance

        public open fun setCurrentAppearance(appearance: NSAppearance): Unit {
            Native.objc_msgSend("void", this, "setCurrentAppearance:", appearance)
        }

        public open fun appearanceNamed(name: NSString): NSAppearance =
            Native.objc_msgSend("class objc.NSAppearance", this, "appearanceNamed:", name) as NSAppearance

    }

    companion object : NSObject(Native.objc_getClass("NSAppearance")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
