// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTableHeaderCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTableHeaderCell(pointer: Long) : NSTextFieldCell(pointer) {
    public open fun drawSortIndicatorWithFrame_inView_ascending_priority(cellFrame: Any, controlView: NSView, ascending: Boolean, priority: Int): Unit {
        Native.objc_msgSend("void", this, "drawSortIndicatorWithFrame:inView:ascending:priority:", cellFrame, controlView, ascending, priority)
    }

    public open fun sortIndicatorRectForBounds(theRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "sortIndicatorRectForBounds:", theRect)

    override fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
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

    override fun setUpFieldEditorAttributes(textObj: NSText): NSText =
        Native.objc_msgSend("class objc.NSText", this, "setUpFieldEditorAttributes:", textObj) as NSText

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    override fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    trait metaclass : NSTextFieldCell.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTableHeaderCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
