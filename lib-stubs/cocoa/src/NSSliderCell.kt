// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSliderCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSSliderCell(pointer: Long) : NSActionCell(pointer), NSSliderCell_NSTickMarkSupport {
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

    public open fun sliderType(): Any =
        Native.objc_msgSend("class objc.Any", this, "sliderType")

    public open fun setSliderType(sliderType: Any): Unit {
        Native.objc_msgSend("void", this, "setSliderType:", sliderType)
    }

    public open fun isVertical(): Int =
        Native.objc_msgSend("int", this, "isVertical") as Int

    public open fun trackRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "trackRect")

    public open fun knobThickness(): Double =
        Native.objc_msgSend("double", this, "knobThickness") as Double

    public open fun knobRectFlipped(flipped: Boolean): Any =
        Native.objc_msgSend("class objc.Any", this, "knobRectFlipped:", flipped)

    public open fun drawKnob(knobRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawKnob:", knobRect)
    }

    public open fun drawKnob(): Unit {
        Native.objc_msgSend("void", this, "drawKnob")
    }

    public open fun barRectFlipped(flipped: Boolean): Any =
        Native.objc_msgSend("class objc.Any", this, "barRectFlipped:", flipped)

    public open fun drawBarInside_flipped(aRect: Any, flipped: Boolean): Unit {
        Native.objc_msgSend("void", this, "drawBarInside:flipped:", aRect, flipped)
    }

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

    override fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    override fun setTitle(aString: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", aString)
    }

    public open fun setTitleCell(aCell: NSCell): Unit {
        Native.objc_msgSend("void", this, "setTitleCell:", aCell)
    }

    public open fun titleCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "titleCell") as ObjCObject

    public open fun setKnobThickness(aFloat: Double): Unit {
        Native.objc_msgSend("void", this, "setKnobThickness:", aFloat)
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

    trait metaclass : NSActionCell.metaclass, NSSliderCell_NSTickMarkSupport.metaclass {
        override fun prefersTrackingUntilMouseUp(): Boolean =
            Native.objc_msgSend("boolean", this, "prefersTrackingUntilMouseUp") as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSSliderCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSSliderCell_NSTickMarkSupport : IObjCObject {
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

    public open fun drawTickMarks(): Unit {
        Native.objc_msgSend("void", this, "drawTickMarks")
    }

    trait metaclass : IObjCObject
}
