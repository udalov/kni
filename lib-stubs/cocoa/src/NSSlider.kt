// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSlider.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSSlider(pointer: Long) : NSControl(pointer), NSAccessibilitySlider, NSSlider_NSTickMarkSupport {
    public open fun sliderType(): Any =
        Native.objc_msgSend("class objc.Any", this, "sliderType")

    public open fun setSliderType(sliderType: Any): Unit {
        Native.objc_msgSend("void", this, "setSliderType:", sliderType)
    }

    public open fun minValue(): Double =
        Native.objc_msgSend("double", this, "minValue") as Double

    public open fun setMinValue(minValue: Double): Unit {
        Native.objc_msgSend("void", this, "setMinValue:", minValue)
    }

    public open fun maxValue(): Double =
        Native.objc_msgSend("double", this, "maxValue") as Double

    public open fun setMaxValue(maxValue: Double): Unit {
        Native.objc_msgSend("void", this, "setMaxValue:", maxValue)
    }

    public open fun altIncrementValue(): Double =
        Native.objc_msgSend("double", this, "altIncrementValue") as Double

    public open fun setAltIncrementValue(altIncrementValue: Double): Unit {
        Native.objc_msgSend("void", this, "setAltIncrementValue:", altIncrementValue)
    }

    public open fun knobThickness(): Double =
        Native.objc_msgSend("double", this, "knobThickness") as Double

    public open fun isVertical(): Int =
        Native.objc_msgSend("int", this, "isVertical") as Int

    override fun acceptsFirstMouse(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsFirstMouse:", theEvent) as Boolean

    public open fun setTitleCell(aCell: NSCell): Unit {
        Native.objc_msgSend("void", this, "setTitleCell:", aCell)
    }

    public open fun titleCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "titleCell") as ObjCObject

    public open fun setTitleColor(newColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setTitleColor:", newColor)
    }

    public open fun titleColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "titleColor") as NSColor

    public open fun setTitleFont(fontObj: NSFont): Unit {
        Native.objc_msgSend("void", this, "setTitleFont:", fontObj)
    }

    public open fun titleFont(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "titleFont") as NSFont

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(aString: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", aString)
    }

    public open fun setKnobThickness(aFloat: Double): Unit {
        Native.objc_msgSend("void", this, "setKnobThickness:", aFloat)
    }

    public open fun setImage(backgroundImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", backgroundImage)
    }

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

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

    trait metaclass : NSControl.metaclass, NSAccessibilitySlider.metaclass, NSSlider_NSTickMarkSupport.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSlider")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSSlider_NSTickMarkSupport : IObjCObject {
    public open fun numberOfTickMarks(): Int =
        Native.objc_msgSend("int", this, "numberOfTickMarks") as Int

    public open fun setNumberOfTickMarks(numberOfTickMarks: Int): Unit {
        Native.objc_msgSend("void", this, "setNumberOfTickMarks:", numberOfTickMarks)
    }

    public open fun tickMarkPosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "tickMarkPosition")

    public open fun setTickMarkPosition(tickMarkPosition: Any): Unit {
        Native.objc_msgSend("void", this, "setTickMarkPosition:", tickMarkPosition)
    }

    public open fun allowsTickMarkValuesOnly(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsTickMarkValuesOnly") as Boolean

    public open fun setAllowsTickMarkValuesOnly(allowsTickMarkValuesOnly: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsTickMarkValuesOnly:", allowsTickMarkValuesOnly)
    }

    public open fun tickMarkValueAtIndex(index: Int): Double =
        Native.objc_msgSend("double", this, "tickMarkValueAtIndex:", index) as Double

    public open fun rectOfTickMarkAtIndex(index: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rectOfTickMarkAtIndex:", index)

    public open fun indexOfTickMarkAtPoint(point: Any): Int =
        Native.objc_msgSend("int", this, "indexOfTickMarkAtPoint:", point) as Int

    public open fun closestTickMarkValueToValue(value: Double): Double =
        Native.objc_msgSend("double", this, "closestTickMarkValueToValue:", value) as Double

    trait metaclass : IObjCObject
}
