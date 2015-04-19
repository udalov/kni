// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTableRowView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTableRowView(pointer: Long) : NSView(pointer), NSAccessibilityRow {
    public open fun selectionHighlightStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "selectionHighlightStyle")

    public open fun setSelectionHighlightStyle(selectionHighlightStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setSelectionHighlightStyle:", selectionHighlightStyle)
    }

    public open fun isEmphasized(): Boolean =
        Native.objc_msgSend("boolean", this, "isEmphasized") as Boolean

    public open fun setEmphasized(emphasized: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEmphasized:", emphasized)
    }

    public open fun isGroupRowStyle(): Boolean =
        Native.objc_msgSend("boolean", this, "isGroupRowStyle") as Boolean

    public open fun setGroupRowStyle(groupRowStyle: Boolean): Unit {
        Native.objc_msgSend("void", this, "setGroupRowStyle:", groupRowStyle)
    }

    public open fun isSelected(): Boolean =
        Native.objc_msgSend("boolean", this, "isSelected") as Boolean

    public open fun setSelected(selected: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelected:", selected)
    }

    public open fun isPreviousRowSelected(): Boolean =
        Native.objc_msgSend("boolean", this, "isPreviousRowSelected") as Boolean

    public open fun setPreviousRowSelected(previousRowSelected: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPreviousRowSelected:", previousRowSelected)
    }

    public open fun isNextRowSelected(): Boolean =
        Native.objc_msgSend("boolean", this, "isNextRowSelected") as Boolean

    public open fun setNextRowSelected(nextRowSelected: Boolean): Unit {
        Native.objc_msgSend("void", this, "setNextRowSelected:", nextRowSelected)
    }

    public open fun isFloating(): Boolean =
        Native.objc_msgSend("boolean", this, "isFloating") as Boolean

    public open fun setFloating(floating: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFloating:", floating)
    }

    public open fun isTargetForDropOperation(): Boolean =
        Native.objc_msgSend("boolean", this, "isTargetForDropOperation") as Boolean

    public open fun setTargetForDropOperation(targetForDropOperation: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTargetForDropOperation:", targetForDropOperation)
    }

    public open fun draggingDestinationFeedbackStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "draggingDestinationFeedbackStyle")

    public open fun setDraggingDestinationFeedbackStyle(draggingDestinationFeedbackStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setDraggingDestinationFeedbackStyle:", draggingDestinationFeedbackStyle)
    }

    public open fun indentationForDropOperation(): Double =
        Native.objc_msgSend("double", this, "indentationForDropOperation") as Double

    public open fun setIndentationForDropOperation(indentationForDropOperation: Double): Unit {
        Native.objc_msgSend("void", this, "setIndentationForDropOperation:", indentationForDropOperation)
    }

    public open fun interiorBackgroundStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "interiorBackgroundStyle")

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun drawBackgroundInRect(dirtyRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawBackgroundInRect:", dirtyRect)
    }

    public open fun drawSelectionInRect(dirtyRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawSelectionInRect:", dirtyRect)
    }

    public open fun drawSeparatorInRect(dirtyRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawSeparatorInRect:", dirtyRect)
    }

    public open fun drawDraggingDestinationFeedbackInRect(dirtyRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawDraggingDestinationFeedbackInRect:", dirtyRect)
    }

    public open fun viewAtColumn(column: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "viewAtColumn:", column) as ObjCObject

    public open fun numberOfColumns(): Int =
        Native.objc_msgSend("int", this, "numberOfColumns") as Int

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass, NSAccessibilityRow.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTableRowView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
