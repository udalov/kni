// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSDateIntervalFormatter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDateIntervalFormatter(pointer: Long) : NSFormatter(pointer) {
    public open fun locale(): NSLocale =
        Native.objc_msgSend("class objc.NSLocale", this, "locale") as NSLocale

    public open fun setLocale(locale: NSLocale): Unit {
        Native.objc_msgSend("void", this, "setLocale:", locale)
    }

    public open fun calendar(): NSCalendar =
        Native.objc_msgSend("class objc.NSCalendar", this, "calendar") as NSCalendar

    public open fun setCalendar(calendar: NSCalendar): Unit {
        Native.objc_msgSend("void", this, "setCalendar:", calendar)
    }

    public open fun timeZone(): NSTimeZone =
        Native.objc_msgSend("class objc.NSTimeZone", this, "timeZone") as NSTimeZone

    public open fun setTimeZone(timeZone: NSTimeZone): Unit {
        Native.objc_msgSend("void", this, "setTimeZone:", timeZone)
    }

    public open fun dateTemplate(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "dateTemplate") as NSString

    public open fun setDateTemplate(dateTemplate: NSString): Unit {
        Native.objc_msgSend("void", this, "setDateTemplate:", dateTemplate)
    }

    public open fun dateStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "dateStyle")

    public open fun setDateStyle(dateStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setDateStyle:", dateStyle)
    }

    public open fun timeStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "timeStyle")

    public open fun setTimeStyle(timeStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setTimeStyle:", timeStyle)
    }

    public open fun stringFromDate_toDate(fromDate: NSDate, toDate: NSDate): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromDate:toDate:", fromDate, toDate) as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSFormatter.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDateIntervalFormatter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
