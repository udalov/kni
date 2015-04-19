// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextContainer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTextContainer(pointer: Long) : NSObject(pointer), NSCoding, NSTextLayoutOrientationProvider {
    public open fun initWithContainerSize(size: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContainerSize:", size) as ObjCObject

    public open fun layoutManager(): NSLayoutManager =
        Native.objc_msgSend("class objc.NSLayoutManager", this, "layoutManager") as NSLayoutManager

    public open fun setLayoutManager(layoutManager: NSLayoutManager): Unit {
        Native.objc_msgSend("void", this, "setLayoutManager:", layoutManager)
    }

    public open fun replaceLayoutManager(newLayoutManager: NSLayoutManager): Unit {
        Native.objc_msgSend("void", this, "replaceLayoutManager:", newLayoutManager)
    }

    public open fun textView(): NSTextView =
        Native.objc_msgSend("class objc.NSTextView", this, "textView") as NSTextView

    public open fun setTextView(textView: NSTextView): Unit {
        Native.objc_msgSend("void", this, "setTextView:", textView)
    }

    public open fun widthTracksTextView(): Boolean =
        Native.objc_msgSend("boolean", this, "widthTracksTextView") as Boolean

    public open fun setWidthTracksTextView(widthTracksTextView: Boolean): Unit {
        Native.objc_msgSend("void", this, "setWidthTracksTextView:", widthTracksTextView)
    }

    public open fun heightTracksTextView(): Boolean =
        Native.objc_msgSend("boolean", this, "heightTracksTextView") as Boolean

    public open fun setHeightTracksTextView(heightTracksTextView: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHeightTracksTextView:", heightTracksTextView)
    }

    public open fun containerSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "containerSize")

    public open fun setContainerSize(containerSize: Any): Unit {
        Native.objc_msgSend("void", this, "setContainerSize:", containerSize)
    }

    public open fun lineFragmentPadding(): Double =
        Native.objc_msgSend("double", this, "lineFragmentPadding") as Double

    public open fun setLineFragmentPadding(lineFragmentPadding: Double): Unit {
        Native.objc_msgSend("void", this, "setLineFragmentPadding:", lineFragmentPadding)
    }

    public open fun lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect(proposedRect: Any, sweepDirection: Any, movementDirection: Any, remainingRect: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "lineFragmentRectForProposedRect:sweepDirection:movementDirection:remainingRect:", proposedRect, sweepDirection, movementDirection, remainingRect)

    public open fun isSimpleRectangularTextContainer(): Boolean =
        Native.objc_msgSend("boolean", this, "isSimpleRectangularTextContainer") as Boolean

    public open fun containsPoint(point: Any): Boolean =
        Native.objc_msgSend("boolean", this, "containsPoint:", point) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSTextLayoutOrientationProvider.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextContainer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
