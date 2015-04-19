// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSButton.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSButton(pointer: Long) : NSControl(pointer), NSUserInterfaceValidations, NSAccessibilityButton, NSButton_NSButtonAttributedStringMethods, NSButton_NSButtonBezelStyles, NSButton_NSButtonMixedState, NSButton_NSButtonBorder, NSButton_NSButtonSoundExtensions, NSButton_NSKeyboardUI {
    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun alternateTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "alternateTitle") as NSString

    public open fun setAlternateTitle(alternateTitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setAlternateTitle:", alternateTitle)
    }

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
    }

    public open fun alternateImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "alternateImage") as NSImage

    public open fun setAlternateImage(alternateImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setAlternateImage:", alternateImage)
    }

    public open fun imagePosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "imagePosition")

    public open fun setImagePosition(imagePosition: Any): Unit {
        Native.objc_msgSend("void", this, "setImagePosition:", imagePosition)
    }

    public open fun setButtonType(aType: Any): Unit {
        Native.objc_msgSend("void", this, "setButtonType:", aType)
    }

    public open fun state(): Int =
        Native.objc_msgSend("int", this, "state") as Int

    public open fun setState(state: Int): Unit {
        Native.objc_msgSend("void", this, "setState:", state)
    }

    public open fun isBordered(): Boolean =
        Native.objc_msgSend("boolean", this, "isBordered") as Boolean

    public open fun setBordered(bordered: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBordered:", bordered)
    }

    public open fun isTransparent(): Boolean =
        Native.objc_msgSend("boolean", this, "isTransparent") as Boolean

    public open fun setTransparent(transparent: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTransparent:", transparent)
    }

    public open fun setPeriodicDelay_interval(delay: Float, interval: Float): Unit {
        Native.objc_msgSend("void", this, "setPeriodicDelay:interval:", delay, interval)
    }

    public open fun getPeriodicDelay_interval(delay: Pointer<Float>, interval: Pointer<Float>): Unit {
        Native.objc_msgSend("void", this, "getPeriodicDelay:interval:", delay, interval)
    }

    public open fun keyEquivalent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "keyEquivalent") as NSString

    public open fun setKeyEquivalent(keyEquivalent: NSString): Unit {
        Native.objc_msgSend("void", this, "setKeyEquivalent:", keyEquivalent)
    }

    public open fun keyEquivalentModifierMask(): Int =
        Native.objc_msgSend("int", this, "keyEquivalentModifierMask") as Int

    public open fun setKeyEquivalentModifierMask(keyEquivalentModifierMask: Int): Unit {
        Native.objc_msgSend("void", this, "setKeyEquivalentModifierMask:", keyEquivalentModifierMask)
    }

    public open fun highlight(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "highlight:", flag)
    }

    override fun performKeyEquivalent(key: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", key) as Boolean

    public open fun isSpringLoaded(): Boolean =
        Native.objc_msgSend("boolean", this, "isSpringLoaded") as Boolean

    public open fun setSpringLoaded(springLoaded: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSpringLoaded:", springLoaded)
    }

    public open fun maxAcceleratorLevel(): Int =
        Native.objc_msgSend("int", this, "maxAcceleratorLevel") as Int

    public open fun setMaxAcceleratorLevel(maxAcceleratorLevel: Int): Unit {
        Native.objc_msgSend("void", this, "setMaxAcceleratorLevel:", maxAcceleratorLevel)
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

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    override fun refusesFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "refusesFirstResponder") as Boolean

    override fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    trait metaclass : NSControl.metaclass, NSUserInterfaceValidations.metaclass, NSAccessibilityButton.metaclass, NSButton_NSButtonAttributedStringMethods.metaclass, NSButton_NSButtonBezelStyles.metaclass, NSButton_NSButtonMixedState.metaclass, NSButton_NSButtonBorder.metaclass, NSButton_NSButtonSoundExtensions.metaclass, NSButton_NSKeyboardUI.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSButton")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSButton_NSButtonAttributedStringMethods : IObjCObject {
    public open fun attributedTitle(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedTitle") as NSAttributedString

    public open fun setAttributedTitle(attributedTitle: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedTitle:", attributedTitle)
    }

    public open fun attributedAlternateTitle(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedAlternateTitle") as NSAttributedString

    public open fun setAttributedAlternateTitle(attributedAlternateTitle: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedAlternateTitle:", attributedAlternateTitle)
    }

    trait metaclass : IObjCObject
}

trait NSButton_NSButtonBezelStyles : IObjCObject {
    public open fun bezelStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "bezelStyle")

    public open fun setBezelStyle(bezelStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setBezelStyle:", bezelStyle)
    }

    trait metaclass : IObjCObject
}

trait NSButton_NSButtonMixedState : IObjCObject {
    public open fun allowsMixedState(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsMixedState") as Boolean

    public open fun setAllowsMixedState(allowsMixedState: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsMixedState:", allowsMixedState)
    }

    public open fun setNextState(): Unit {
        Native.objc_msgSend("void", this, "setNextState")
    }

    trait metaclass : IObjCObject
}

trait NSButton_NSButtonBorder : IObjCObject {
    public open fun showsBorderOnlyWhileMouseInside(): Boolean =
        Native.objc_msgSend("boolean", this, "showsBorderOnlyWhileMouseInside") as Boolean

    public open fun setShowsBorderOnlyWhileMouseInside(showsBorderOnlyWhileMouseInside: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsBorderOnlyWhileMouseInside:", showsBorderOnlyWhileMouseInside)
    }

    trait metaclass : IObjCObject
}

trait NSButton_NSButtonSoundExtensions : IObjCObject {
    public open fun sound(): NSSound =
        Native.objc_msgSend("class objc.NSSound", this, "sound") as NSSound

    public open fun setSound(sound: NSSound): Unit {
        Native.objc_msgSend("void", this, "setSound:", sound)
    }

    trait metaclass : IObjCObject
}

trait NSButton_NSKeyboardUI : IObjCObject {
    public open fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    trait metaclass : IObjCObject
}
