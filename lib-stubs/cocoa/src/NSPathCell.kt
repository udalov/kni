// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPathCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSPathCellDelegate {
    trait metaclass
}

public open class NSPathCell(pointer: Long) : NSActionCell(pointer), NSOpenSavePanelDelegate {
    public open fun pathStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "pathStyle")

    public open fun setPathStyle(pathStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setPathStyle:", pathStyle)
    }

    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun setURL(URL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setURL:", URL)
    }

    public open fun setObjectValue(obj: Any): Unit {
        Native.objc_msgSend("void", this, "setObjectValue:", obj)
    }

    public open fun allowedTypes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allowedTypes") as NSArray

    public open fun setAllowedTypes(allowedTypes: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAllowedTypes:", allowedTypes)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun pathComponentCells(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "pathComponentCells") as NSArray

    public open fun setPathComponentCells(pathComponentCells: NSArray): Unit {
        Native.objc_msgSend("void", this, "setPathComponentCells:", pathComponentCells)
    }

    public open fun rectOfPathComponentCell_withFrame_inView(cell: NSPathComponentCell, frame: Any, view: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "rectOfPathComponentCell:withFrame:inView:", cell, frame, view)

    public open fun pathComponentCellAtPoint_withFrame_inView(point: Any, frame: Any, view: NSView): NSPathComponentCell =
        Native.objc_msgSend("class objc.NSPathComponentCell", this, "pathComponentCellAtPoint:withFrame:inView:", point, frame, view) as NSPathComponentCell

    public open fun clickedPathComponentCell(): NSPathComponentCell =
        Native.objc_msgSend("class objc.NSPathComponentCell", this, "clickedPathComponentCell") as NSPathComponentCell

    public open fun mouseEntered_withFrame_inView(event: NSEvent, frame: Any, view: NSView): Unit {
        Native.objc_msgSend("void", this, "mouseEntered:withFrame:inView:", event, frame, view)
    }

    public open fun mouseExited_withFrame_inView(event: NSEvent, frame: Any, view: NSView): Unit {
        Native.objc_msgSend("void", this, "mouseExited:withFrame:inView:", event, frame, view)
    }

    public open fun doubleAction(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "doubleAction") as ObjCSelector

    public open fun setDoubleAction(doubleAction: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setDoubleAction:", doubleAction)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun placeholderString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "placeholderString") as NSString

    public open fun setPlaceholderString(placeholderString: NSString): Unit {
        Native.objc_msgSend("void", this, "setPlaceholderString:", placeholderString)
    }

    public open fun placeholderAttributedString(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "placeholderAttributedString") as NSAttributedString

    public open fun setPlaceholderAttributedString(placeholderAttributedString: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setPlaceholderAttributedString:", placeholderAttributedString)
    }

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

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    override fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    trait metaclass : NSActionCell.metaclass, NSOpenSavePanelDelegate.metaclass {
        public open fun pathComponentCellClass(): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "pathComponentCellClass") as ObjCClass

    }

    companion object : NSObject(Native.objc_getClass("NSPathCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
