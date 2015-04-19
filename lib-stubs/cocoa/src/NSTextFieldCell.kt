// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextFieldCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTextFieldCell(pointer: Long) : NSActionCell(pointer) {
    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun drawsBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsBackground") as Boolean

    public open fun setDrawsBackground(drawsBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsBackground:", drawsBackground)
    }

    public open fun textColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "textColor") as NSColor

    public open fun setTextColor(textColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setTextColor:", textColor)
    }

    override fun setUpFieldEditorAttributes(textObj: NSText): NSText =
        Native.objc_msgSend("class objc.NSText", this, "setUpFieldEditorAttributes:", textObj) as NSText

    public open fun bezelStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "bezelStyle")

    public open fun setBezelStyle(bezelStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setBezelStyle:", bezelStyle)
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

    public open fun setWantsNotificationForMarkedText(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setWantsNotificationForMarkedText:", flag)
    }

    public open fun allowedInputSourceLocales(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allowedInputSourceLocales") as NSArray

    public open fun setAllowedInputSourceLocales(allowedInputSourceLocales: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAllowedInputSourceLocales:", allowedInputSourceLocales)
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

    trait metaclass : NSActionCell.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextFieldCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
