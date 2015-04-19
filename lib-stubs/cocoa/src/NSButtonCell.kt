// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSButtonCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSButtonCell(pointer: Long) : NSActionCell(pointer), NSButtonCell_NSButtonCellExtensions, NSButtonCell_NSButtonCellAttributedStringMethods, NSButtonCell_NSButtonCellBezelStyles, NSButtonCell_NSButtonCellSoundExtensions, NSButtonCell_NSKeyboardUI {
    override fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    override fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun alternateTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "alternateTitle") as NSString

    public open fun setAlternateTitle(alternateTitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setAlternateTitle:", alternateTitle)
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

    public open fun imageScaling(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageScaling")

    public open fun setImageScaling(imageScaling: Any): Unit {
        Native.objc_msgSend("void", this, "setImageScaling:", imageScaling)
    }

    public open fun highlightsBy(): Any =
        Native.objc_msgSend("class objc.Any", this, "highlightsBy")

    public open fun setHighlightsBy(highlightsBy: Any): Unit {
        Native.objc_msgSend("void", this, "setHighlightsBy:", highlightsBy)
    }

    public open fun showsStateBy(): Any =
        Native.objc_msgSend("class objc.Any", this, "showsStateBy")

    public open fun setShowsStateBy(showsStateBy: Any): Unit {
        Native.objc_msgSend("void", this, "setShowsStateBy:", showsStateBy)
    }

    public open fun setButtonType(aType: Any): Unit {
        Native.objc_msgSend("void", this, "setButtonType:", aType)
    }

    override fun isOpaque(): Boolean =
        Native.objc_msgSend("boolean", this, "isOpaque") as Boolean

    public open fun isTransparent(): Boolean =
        Native.objc_msgSend("boolean", this, "isTransparent") as Boolean

    public open fun setTransparent(transparent: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTransparent:", transparent)
    }

    public open fun setPeriodicDelay_interval(delay: Float, interval: Float): Unit {
        Native.objc_msgSend("void", this, "setPeriodicDelay:interval:", delay, interval)
    }

    override fun getPeriodicDelay_interval(delay: Pointer<Float>, interval: Pointer<Float>): Unit {
        Native.objc_msgSend("void", this, "getPeriodicDelay:interval:", delay, interval)
    }

    override fun keyEquivalent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "keyEquivalent") as NSString

    public open fun setKeyEquivalent(keyEquivalent: NSString): Unit {
        Native.objc_msgSend("void", this, "setKeyEquivalent:", keyEquivalent)
    }

    public open fun keyEquivalentModifierMask(): Int =
        Native.objc_msgSend("int", this, "keyEquivalentModifierMask") as Int

    public open fun setKeyEquivalentModifierMask(keyEquivalentModifierMask: Int): Unit {
        Native.objc_msgSend("void", this, "setKeyEquivalentModifierMask:", keyEquivalentModifierMask)
    }

    public open fun keyEquivalentFont(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "keyEquivalentFont") as NSFont

    public open fun setKeyEquivalentFont(keyEquivalentFont: NSFont): Unit {
        Native.objc_msgSend("void", this, "setKeyEquivalentFont:", keyEquivalentFont)
    }

    public open fun setKeyEquivalentFont_size(fontName: NSString, fontSize: Double): Unit {
        Native.objc_msgSend("void", this, "setKeyEquivalentFont:size:", fontName, fontSize)
    }

    override fun performClick(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performClick:", sender)
    }

    public open fun drawImage_withFrame_inView(image: NSImage, frame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawImage:withFrame:inView:", image, frame, controlView)
    }

    public open fun drawTitle_withFrame_inView(title: NSAttributedString, frame: Any, controlView: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "drawTitle:withFrame:inView:", title, frame, controlView)

    public open fun drawBezelWithFrame_inView(frame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawBezelWithFrame:inView:", frame, controlView)
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

    trait metaclass : NSActionCell.metaclass, NSButtonCell_NSButtonCellExtensions.metaclass, NSButtonCell_NSButtonCellAttributedStringMethods.metaclass, NSButtonCell_NSButtonCellBezelStyles.metaclass, NSButtonCell_NSButtonCellSoundExtensions.metaclass, NSButtonCell_NSKeyboardUI.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSButtonCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSButtonCell_NSButtonCellExtensions : IObjCObject {
    public open fun gradientType(): Any =
        Native.objc_msgSend("class objc.Any", this, "gradientType")

    public open fun setGradientType(gradientType: Any): Unit {
        Native.objc_msgSend("void", this, "setGradientType:", gradientType)
    }

    public open fun imageDimsWhenDisabled(): Boolean =
        Native.objc_msgSend("boolean", this, "imageDimsWhenDisabled") as Boolean

    public open fun setImageDimsWhenDisabled(imageDimsWhenDisabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setImageDimsWhenDisabled:", imageDimsWhenDisabled)
    }

    public open fun showsBorderOnlyWhileMouseInside(): Boolean =
        Native.objc_msgSend("boolean", this, "showsBorderOnlyWhileMouseInside") as Boolean

    public open fun setShowsBorderOnlyWhileMouseInside(showsBorderOnlyWhileMouseInside: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsBorderOnlyWhileMouseInside:", showsBorderOnlyWhileMouseInside)
    }

    public open fun mouseEntered(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseEntered:", event)
    }

    public open fun mouseExited(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseExited:", event)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    trait metaclass : IObjCObject
}

trait NSButtonCell_NSButtonCellAttributedStringMethods : IObjCObject {
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

trait NSButtonCell_NSButtonCellBezelStyles : IObjCObject {
    public open fun bezelStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "bezelStyle")

    public open fun setBezelStyle(bezelStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setBezelStyle:", bezelStyle)
    }

    trait metaclass : IObjCObject
}

trait NSButtonCell_NSButtonCellSoundExtensions : IObjCObject {
    public open fun sound(): NSSound =
        Native.objc_msgSend("class objc.NSSound", this, "sound") as NSSound

    public open fun setSound(sound: NSSound): Unit {
        Native.objc_msgSend("void", this, "setSound:", sound)
    }

    trait metaclass : IObjCObject
}

trait NSButtonCell_NSKeyboardUI : IObjCObject {
    public open fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    public open fun setAlternateTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setAlternateTitleWithMnemonic:", stringWithAmpersand)
    }

    public open fun setAlternateMnemonicLocation(location: Int): Unit {
        Native.objc_msgSend("void", this, "setAlternateMnemonicLocation:", location)
    }

    public open fun alternateMnemonicLocation(): Int =
        Native.objc_msgSend("int", this, "alternateMnemonicLocation") as Int

    public open fun alternateMnemonic(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "alternateMnemonic") as NSString

    trait metaclass : IObjCObject
}
