// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSBox.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSBox(pointer: Long) : NSView(pointer), NSBox_NSDeprecated {
    public open fun borderType(): Any =
        Native.objc_msgSend("class objc.Any", this, "borderType")

    public open fun setBorderType(borderType: Any): Unit {
        Native.objc_msgSend("void", this, "setBorderType:", borderType)
    }

    public open fun titlePosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "titlePosition")

    public open fun setTitlePosition(titlePosition: Any): Unit {
        Native.objc_msgSend("void", this, "setTitlePosition:", titlePosition)
    }

    public open fun boxType(): Any =
        Native.objc_msgSend("class objc.Any", this, "boxType")

    public open fun setBoxType(boxType: Any): Unit {
        Native.objc_msgSend("void", this, "setBoxType:", boxType)
    }

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun titleFont(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "titleFont") as NSFont

    public open fun setTitleFont(titleFont: NSFont): Unit {
        Native.objc_msgSend("void", this, "setTitleFont:", titleFont)
    }

    public open fun borderRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "borderRect")

    public open fun titleRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "titleRect")

    public open fun titleCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "titleCell") as ObjCObject

    public open fun sizeToFit(): Unit {
        Native.objc_msgSend("void", this, "sizeToFit")
    }

    public open fun contentViewMargins(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentViewMargins")

    public open fun setContentViewMargins(contentViewMargins: Any): Unit {
        Native.objc_msgSend("void", this, "setContentViewMargins:", contentViewMargins)
    }

    public open fun setFrameFromContentFrame(contentFrame: Any): Unit {
        Native.objc_msgSend("void", this, "setFrameFromContentFrame:", contentFrame)
    }

    public open fun contentView(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "contentView") as ObjCObject

    public open fun setContentView(contentView: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setContentView:", contentView)
    }

    public open fun isTransparent(): Boolean =
        Native.objc_msgSend("boolean", this, "isTransparent") as Boolean

    public open fun setTransparent(transparent: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTransparent:", transparent)
    }

    public open fun borderWidth(): Double =
        Native.objc_msgSend("double", this, "borderWidth") as Double

    public open fun setBorderWidth(borderWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setBorderWidth:", borderWidth)
    }

    public open fun cornerRadius(): Double =
        Native.objc_msgSend("double", this, "cornerRadius") as Double

    public open fun setCornerRadius(cornerRadius: Double): Unit {
        Native.objc_msgSend("void", this, "setCornerRadius:", cornerRadius)
    }

    public open fun borderColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "borderColor") as NSColor

    public open fun setBorderColor(borderColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBorderColor:", borderColor)
    }

    public open fun fillColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "fillColor") as NSColor

    public open fun setFillColor(fillColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setFillColor:", fillColor)
    }

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

    trait metaclass : NSView.metaclass, NSBox_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSBox")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSBox_NSDeprecated : IObjCObject {
    public open fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    trait metaclass : IObjCObject
}
