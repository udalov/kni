// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSImageCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSImageCell(pointer: Long) : NSCell(pointer), NSCopying, NSCoding {
    public open fun imageAlignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageAlignment")

    public open fun setImageAlignment(imageAlignment: Any): Unit {
        Native.objc_msgSend("void", this, "setImageAlignment:", imageAlignment)
    }

    public open fun imageScaling(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageScaling")

    public open fun setImageScaling(imageScaling: Any): Unit {
        Native.objc_msgSend("void", this, "setImageScaling:", imageScaling)
    }

    public open fun imageFrameStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageFrameStyle")

    public open fun setImageFrameStyle(imageFrameStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setImageFrameStyle:", imageFrameStyle)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSCell.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSImageCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
