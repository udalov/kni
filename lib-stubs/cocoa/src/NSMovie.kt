// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSMovie.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSMovie(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun initWithMovie(movie: QTMovie): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithMovie:", movie) as ObjCObject

    public open fun QTMovie(): QTMovie =
        Native.objc_msgSend("class objc.QTMovie", this, "QTMovie") as QTMovie

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMovie")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
