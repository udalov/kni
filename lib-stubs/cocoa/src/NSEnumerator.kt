// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSEnumerator.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSFastEnumeration {
    trait metaclass
}

public open class NSEnumerator(pointer: Long) : NSObject(pointer), NSFastEnumeration, NSEnumerator_NSExtendedEnumerator {
    public open fun nextObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "nextObject") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSFastEnumeration.metaclass, NSEnumerator_NSExtendedEnumerator.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSEnumerator")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSEnumerator_NSExtendedEnumerator : IObjCObject {
    public open fun allObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allObjects") as NSArray

    trait metaclass : IObjCObject
}
