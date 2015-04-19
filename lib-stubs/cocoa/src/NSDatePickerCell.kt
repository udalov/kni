// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDatePickerCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSDatePickerCellDelegate {
    trait metaclass
}

public open class NSDatePickerCell(pointer: Long) : NSActionCell(pointer) {
    public open fun datePickerStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "datePickerStyle")

    public open fun setDatePickerStyle(datePickerStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setDatePickerStyle:", datePickerStyle)
    }

    public open fun drawsBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsBackground") as Boolean

    public open fun setDrawsBackground(drawsBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsBackground:", drawsBackground)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun textColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "textColor") as NSColor

    public open fun setTextColor(textColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setTextColor:", textColor)
    }

    public open fun datePickerMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "datePickerMode")

    public open fun setDatePickerMode(datePickerMode: Any): Unit {
        Native.objc_msgSend("void", this, "setDatePickerMode:", datePickerMode)
    }

    public open fun datePickerElements(): Any =
        Native.objc_msgSend("class objc.Any", this, "datePickerElements")

    public open fun setDatePickerElements(datePickerElements: Any): Unit {
        Native.objc_msgSend("void", this, "setDatePickerElements:", datePickerElements)
    }

    public open fun calendar(): NSCalendar =
        Native.objc_msgSend("class objc.NSCalendar", this, "calendar") as NSCalendar

    public open fun setCalendar(calendar: NSCalendar): Unit {
        Native.objc_msgSend("void", this, "setCalendar:", calendar)
    }

    public open fun locale(): NSLocale =
        Native.objc_msgSend("class objc.NSLocale", this, "locale") as NSLocale

    public open fun setLocale(locale: NSLocale): Unit {
        Native.objc_msgSend("void", this, "setLocale:", locale)
    }

    public open fun timeZone(): NSTimeZone =
        Native.objc_msgSend("class objc.NSTimeZone", this, "timeZone") as NSTimeZone

    public open fun setTimeZone(timeZone: NSTimeZone): Unit {
        Native.objc_msgSend("void", this, "setTimeZone:", timeZone)
    }

    public open fun dateValue(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "dateValue") as NSDate

    public open fun setDateValue(dateValue: NSDate): Unit {
        Native.objc_msgSend("void", this, "setDateValue:", dateValue)
    }

    public open fun timeInterval(): Double =
        Native.objc_msgSend("double", this, "timeInterval") as Double

    public open fun setTimeInterval(timeInterval: Double): Unit {
        Native.objc_msgSend("void", this, "setTimeInterval:", timeInterval)
    }

    public open fun minDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "minDate") as NSDate

    public open fun setMinDate(minDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "setMinDate:", minDate)
    }

    public open fun maxDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "maxDate") as NSDate

    public open fun setMaxDate(maxDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "setMaxDate:", maxDate)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
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

    companion object : NSObject(Native.objc_getClass("NSDatePickerCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
