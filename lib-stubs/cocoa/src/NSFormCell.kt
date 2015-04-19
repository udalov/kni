// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSFormCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFormCell(pointer: Long) : NSActionCell(pointer), NSFormCell_NSKeyboardUI, NSFormCell_NSFormCellAttributedStringMethods {
    override fun initTextCell(aString: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initTextCell:", aString) as ObjCObject

    public open fun titleWidth(aSize: Any): Double =
        Native.objc_msgSend("double", this, "titleWidth:", aSize) as Double

    public open fun titleWidth(): Double =
        Native.objc_msgSend("double", this, "titleWidth") as Double

    public open fun setTitleWidth(titleWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setTitleWidth:", titleWidth)
    }

    override fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    override fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun titleFont(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "titleFont") as NSFont

    public open fun setTitleFont(titleFont: NSFont): Unit {
        Native.objc_msgSend("void", this, "setTitleFont:", titleFont)
    }

    public open fun titleAlignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "titleAlignment")

    public open fun setTitleAlignment(titleAlignment: Any): Unit {
        Native.objc_msgSend("void", this, "setTitleAlignment:", titleAlignment)
    }

    override fun isOpaque(): Boolean =
        Native.objc_msgSend("boolean", this, "isOpaque") as Boolean

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

    public open fun titleBaseWritingDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "titleBaseWritingDirection")

    public open fun setTitleBaseWritingDirection(titleBaseWritingDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setTitleBaseWritingDirection:", titleBaseWritingDirection)
    }

    public open fun preferredTextFieldWidth(): Double =
        Native.objc_msgSend("double", this, "preferredTextFieldWidth") as Double

    public open fun setPreferredTextFieldWidth(preferredTextFieldWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setPreferredTextFieldWidth:", preferredTextFieldWidth)
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

    override fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    override fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    trait metaclass : NSActionCell.metaclass, NSFormCell_NSKeyboardUI.metaclass, NSFormCell_NSFormCellAttributedStringMethods.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSFormCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSFormCell_NSKeyboardUI : IObjCObject {
    public open fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    trait metaclass : IObjCObject
}

trait NSFormCell_NSFormCellAttributedStringMethods : IObjCObject {
    public open fun attributedTitle(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedTitle") as NSAttributedString

    public open fun setAttributedTitle(attributedTitle: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedTitle:", attributedTitle)
    }

    trait metaclass : IObjCObject
}
