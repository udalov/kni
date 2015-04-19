// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSForm.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSForm(pointer: Long) : NSMatrix(pointer) {
    public open fun indexOfSelectedItem(): Int =
        Native.objc_msgSend("int", this, "indexOfSelectedItem") as Int

    public open fun setEntryWidth(width: Double): Unit {
        Native.objc_msgSend("void", this, "setEntryWidth:", width)
    }

    public open fun setInterlineSpacing(spacing: Double): Unit {
        Native.objc_msgSend("void", this, "setInterlineSpacing:", spacing)
    }

    public open fun setBordered(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBordered:", flag)
    }

    public open fun setBezeled(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBezeled:", flag)
    }

    public open fun setTitleAlignment(mode: Any): Unit {
        Native.objc_msgSend("void", this, "setTitleAlignment:", mode)
    }

    public open fun setTextAlignment(mode: Any): Unit {
        Native.objc_msgSend("void", this, "setTextAlignment:", mode)
    }

    public open fun setTitleFont(fontObj: NSFont): Unit {
        Native.objc_msgSend("void", this, "setTitleFont:", fontObj)
    }

    public open fun setTextFont(fontObj: NSFont): Unit {
        Native.objc_msgSend("void", this, "setTextFont:", fontObj)
    }

    public open fun cellAtIndex(index: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "cellAtIndex:", index) as ObjCObject

    public open fun drawCellAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "drawCellAtIndex:", index)
    }

    public open fun addEntry(title: NSString): NSFormCell =
        Native.objc_msgSend("class objc.NSFormCell", this, "addEntry:", title) as NSFormCell

    public open fun insertEntry_atIndex(title: NSString, index: Int): NSFormCell =
        Native.objc_msgSend("class objc.NSFormCell", this, "insertEntry:atIndex:", title, index) as NSFormCell

    public open fun removeEntryAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeEntryAtIndex:", index)
    }

    public open fun indexOfCellWithTag(aTag: Int): Int =
        Native.objc_msgSend("int", this, "indexOfCellWithTag:", aTag) as Int

    public open fun selectTextAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "selectTextAtIndex:", index)
    }

    override fun setFrameSize(newSize: Any): Unit {
        Native.objc_msgSend("void", this, "setFrameSize:", newSize)
    }

    public open fun setTitleBaseWritingDirection(writingDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setTitleBaseWritingDirection:", writingDirection)
    }

    public open fun setTextBaseWritingDirection(writingDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setTextBaseWritingDirection:", writingDirection)
    }

    public open fun setPreferredTextFieldWidth(preferredWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setPreferredTextFieldWidth:", preferredWidth)
    }

    public open fun preferredTextFieldWidth(): Double =
        Native.objc_msgSend("double", this, "preferredTextFieldWidth") as Double

    override fun acceptsFirstMouse(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsFirstMouse:", theEvent) as Boolean

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

    override fun resetCursorRects(): Unit {
        Native.objc_msgSend("void", this, "resetCursorRects")
    }

    override fun selectAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectAll:", sender)
    }

    override fun selectedCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "selectedCell") as ObjCObject

    override fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    trait metaclass : NSMatrix.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSForm")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
