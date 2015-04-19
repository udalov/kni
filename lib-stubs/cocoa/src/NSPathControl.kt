// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPathControl.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSPathControlDelegate {
    trait metaclass
}

public open class NSPathControl(pointer: Long) : NSControl(pointer), NSPathControl_NSDeprecated {
    public open fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    public open fun setEditable(editable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEditable:", editable)
    }

    public open fun allowedTypes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allowedTypes") as NSArray

    public open fun setAllowedTypes(allowedTypes: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAllowedTypes:", allowedTypes)
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

    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun setURL(URL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setURL:", URL)
    }

    public open fun doubleAction(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "doubleAction") as ObjCSelector

    public open fun setDoubleAction(doubleAction: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setDoubleAction:", doubleAction)
    }

    public open fun pathStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "pathStyle")

    public open fun setPathStyle(pathStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setPathStyle:", pathStyle)
    }

    public open fun clickedPathItem(): NSPathControlItem =
        Native.objc_msgSend("class objc.NSPathControlItem", this, "clickedPathItem") as NSPathControlItem

    public open fun pathItems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "pathItems") as NSArray

    public open fun setPathItems(pathItems: NSArray): Unit {
        Native.objc_msgSend("void", this, "setPathItems:", pathItems)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun setDraggingSourceOperationMask_forLocal(mask: Any, isLocal: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDraggingSourceOperationMask:forLocal:", mask, isLocal)
    }

    override fun menu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menu") as NSMenu

    override fun setMenu(menu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setMenu:", menu)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun mouseDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDown:", theEvent)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    override fun refusesFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "refusesFirstResponder") as Boolean

    override fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    trait metaclass : NSControl.metaclass, NSPathControl_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPathControl")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSPathControl_NSDeprecated : IObjCObject {
    public open fun clickedPathComponentCell(): NSPathComponentCell =
        Native.objc_msgSend("class objc.NSPathComponentCell", this, "clickedPathComponentCell") as NSPathComponentCell

    public open fun pathComponentCells(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "pathComponentCells") as NSArray

    public open fun setPathComponentCells(cells: NSArray): Unit {
        Native.objc_msgSend("void", this, "setPathComponentCells:", cells)
    }

    trait metaclass : IObjCObject
}
