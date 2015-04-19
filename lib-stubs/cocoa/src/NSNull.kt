// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSNull.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSNull(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
        public open fun `null`(): NSNull =
            Native.objc_msgSend("class objc.NSNull", this, "null") as NSNull

    }

    companion object : NSObject(Native.objc_getClass("NSNull")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
