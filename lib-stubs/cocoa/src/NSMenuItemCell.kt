// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSMenuItemCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSMenuItemCell(pointer: Long) : NSButtonCell(pointer) {
    public open fun menuItem(): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "menuItem") as NSMenuItem

    public open fun setMenuItem(menuItem: NSMenuItem): Unit {
        Native.objc_msgSend("void", this, "setMenuItem:", menuItem)
    }

    public open fun needsSizing(): Boolean =
        Native.objc_msgSend("boolean", this, "needsSizing") as Boolean

    public open fun setNeedsSizing(needsSizing: Boolean): Unit {
        Native.objc_msgSend("void", this, "setNeedsSizing:", needsSizing)
    }

    public open fun calcSize(): Unit {
        Native.objc_msgSend("void", this, "calcSize")
    }

    public open fun needsDisplay(): Boolean =
        Native.objc_msgSend("boolean", this, "needsDisplay") as Boolean

    public open fun setNeedsDisplay(needsDisplay: Boolean): Unit {
        Native.objc_msgSend("void", this, "setNeedsDisplay:", needsDisplay)
    }

    public open fun stateImageWidth(): Double =
        Native.objc_msgSend("double", this, "stateImageWidth") as Double

    public open fun imageWidth(): Double =
        Native.objc_msgSend("double", this, "imageWidth") as Double

    public open fun titleWidth(): Double =
        Native.objc_msgSend("double", this, "titleWidth") as Double

    public open fun keyEquivalentWidth(): Double =
        Native.objc_msgSend("double", this, "keyEquivalentWidth") as Double

    public open fun stateImageRectForBounds(cellFrame: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "stateImageRectForBounds:", cellFrame)

    override fun titleRectForBounds(cellFrame: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "titleRectForBounds:", cellFrame)

    public open fun keyEquivalentRectForBounds(cellFrame: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "keyEquivalentRectForBounds:", cellFrame)

    public open fun drawSeparatorItemWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawSeparatorItemWithFrame:inView:", cellFrame, controlView)
    }

    public open fun drawStateImageWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawStateImageWithFrame:inView:", cellFrame, controlView)
    }

    public open fun drawImageWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawImageWithFrame:inView:", cellFrame, controlView)
    }

    public open fun drawTitleWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawTitleWithFrame:inView:", cellFrame, controlView)
    }

    public open fun drawKeyEquivalentWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawKeyEquivalentWithFrame:inView:", cellFrame, controlView)
    }

    public open fun drawBorderAndBackgroundWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawBorderAndBackgroundWithFrame:inView:", cellFrame, controlView)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    override fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    override fun getPeriodicDelay_interval(delay: Pointer<Float>, interval: Pointer<Float>): Unit {
        Native.objc_msgSend("void", this, "getPeriodicDelay:interval:", delay, interval)
    }

    override fun isOpaque(): Boolean =
        Native.objc_msgSend("boolean", this, "isOpaque") as Boolean

    override fun keyEquivalent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "keyEquivalent") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performClick(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performClick:", sender)
    }

    override fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    override fun setTag(tag: Int): Unit {
        Native.objc_msgSend("void", this, "setTag:", tag)
    }

    override fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    override fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    override fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    override fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    override fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    trait metaclass : NSButtonCell.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMenuItemCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
