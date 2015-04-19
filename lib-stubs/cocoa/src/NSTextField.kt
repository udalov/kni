// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextField.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTextFieldDelegate {
    trait metaclass
}

public open class NSTextField(pointer: Long) : NSControl(pointer), NSUserInterfaceValidations, NSAccessibilityNavigableStaticText, NSTextField_NSTextFieldAttributedStringMethods, NSTextField_NSDeprecated {
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

    public open fun isBordered(): Boolean =
        Native.objc_msgSend("boolean", this, "isBordered") as Boolean

    public open fun setBordered(bordered: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBordered:", bordered)
    }

    public open fun isBezeled(): Boolean =
        Native.objc_msgSend("boolean", this, "isBezeled") as Boolean

    public open fun setBezeled(bezeled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBezeled:", bezeled)
    }

    public open fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    public open fun setEditable(editable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEditable:", editable)
    }

    public open fun isSelectable(): Boolean =
        Native.objc_msgSend("boolean", this, "isSelectable") as Boolean

    public open fun setSelectable(selectable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectable:", selectable)
    }

    public open fun selectText(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectText:", sender)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun textShouldBeginEditing(textObject: NSText): Boolean =
        Native.objc_msgSend("boolean", this, "textShouldBeginEditing:", textObject) as Boolean

    public open fun textShouldEndEditing(textObject: NSText): Boolean =
        Native.objc_msgSend("boolean", this, "textShouldEndEditing:", textObject) as Boolean

    public open fun textDidBeginEditing(notification: NSNotification): Unit {
        Native.objc_msgSend("void", this, "textDidBeginEditing:", notification)
    }

    public open fun textDidEndEditing(notification: NSNotification): Unit {
        Native.objc_msgSend("void", this, "textDidEndEditing:", notification)
    }

    public open fun textDidChange(notification: NSNotification): Unit {
        Native.objc_msgSend("void", this, "textDidChange:", notification)
    }

    override fun acceptsFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsFirstResponder") as Boolean

    public open fun bezelStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "bezelStyle")

    public open fun setBezelStyle(bezelStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setBezelStyle:", bezelStyle)
    }

    public open fun preferredMaxLayoutWidth(): Double =
        Native.objc_msgSend("double", this, "preferredMaxLayoutWidth") as Double

    public open fun setPreferredMaxLayoutWidth(preferredMaxLayoutWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setPreferredMaxLayoutWidth:", preferredMaxLayoutWidth)
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

    trait metaclass : NSControl.metaclass, NSUserInterfaceValidations.metaclass, NSAccessibilityNavigableStaticText.metaclass, NSTextField_NSTextFieldAttributedStringMethods.metaclass, NSTextField_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextField")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSTextField_NSTextFieldAttributedStringMethods : IObjCObject {
    public open fun allowsEditingTextAttributes(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsEditingTextAttributes") as Boolean

    public open fun setAllowsEditingTextAttributes(allowsEditingTextAttributes: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsEditingTextAttributes:", allowsEditingTextAttributes)
    }

    public open fun importsGraphics(): Boolean =
        Native.objc_msgSend("boolean", this, "importsGraphics") as Boolean

    public open fun setImportsGraphics(importsGraphics: Boolean): Unit {
        Native.objc_msgSend("void", this, "setImportsGraphics:", importsGraphics)
    }

    trait metaclass : IObjCObject
}

trait NSTextField_NSDeprecated : IObjCObject {
    public open fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    trait metaclass : IObjCObject
}
