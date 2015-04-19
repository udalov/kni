// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSCalendarDate.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCalendarDate(pointer: Long) : NSDate(pointer) {
    public open fun dateByAddingYears_months_days_hours_minutes_seconds(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int): NSCalendarDate =
        Native.objc_msgSend("class objc.NSCalendarDate", this, "dateByAddingYears:months:days:hours:minutes:seconds:", year, month, day, hour, minute, second) as NSCalendarDate

    public open fun dayOfCommonEra(): Int =
        Native.objc_msgSend("int", this, "dayOfCommonEra") as Int

    public open fun dayOfMonth(): Int =
        Native.objc_msgSend("int", this, "dayOfMonth") as Int

    public open fun dayOfWeek(): Int =
        Native.objc_msgSend("int", this, "dayOfWeek") as Int

    public open fun dayOfYear(): Int =
        Native.objc_msgSend("int", this, "dayOfYear") as Int

    public open fun hourOfDay(): Int =
        Native.objc_msgSend("int", this, "hourOfDay") as Int

    public open fun minuteOfHour(): Int =
        Native.objc_msgSend("int", this, "minuteOfHour") as Int

    public open fun monthOfYear(): Int =
        Native.objc_msgSend("int", this, "monthOfYear") as Int

    public open fun secondOfMinute(): Int =
        Native.objc_msgSend("int", this, "secondOfMinute") as Int

    public open fun yearOfCommonEra(): Int =
        Native.objc_msgSend("int", this, "yearOfCommonEra") as Int

    public open fun calendarFormat(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "calendarFormat") as NSString

    public open fun descriptionWithCalendarFormat_locale(format: NSString, locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithCalendarFormat:locale:", format, locale) as NSString

    public open fun descriptionWithCalendarFormat(format: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithCalendarFormat:", format) as NSString

    override fun descriptionWithLocale(locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:", locale) as NSString

    public open fun timeZone(): NSTimeZone =
        Native.objc_msgSend("class objc.NSTimeZone", this, "timeZone") as NSTimeZone

    public open fun initWithString_calendarFormat_locale(description: NSString, format: NSString, locale: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:calendarFormat:locale:", description, format, locale) as ObjCObject

    public open fun initWithString_calendarFormat(description: NSString, format: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:calendarFormat:", description, format) as ObjCObject

    override fun initWithString(description: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:", description) as ObjCObject

    public open fun initWithYear_month_day_hour_minute_second_timeZone(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int, aTimeZone: NSTimeZone): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithYear:month:day:hour:minute:second:timeZone:", year, month, day, hour, minute, second, aTimeZone) as ObjCObject

    public open fun setCalendarFormat(format: NSString): Unit {
        Native.objc_msgSend("void", this, "setCalendarFormat:", format)
    }

    public open fun setTimeZone(aTimeZone: NSTimeZone): Unit {
        Native.objc_msgSend("void", this, "setTimeZone:", aTimeZone)
    }

    public open fun years_months_days_hours_minutes_seconds_sinceDate(yp: Pointer<Int>, mop: Pointer<Int>, dp: Pointer<Int>, hp: Pointer<Int>, mip: Pointer<Int>, sp: Pointer<Int>, date: NSCalendarDate): Unit {
        Native.objc_msgSend("void", this, "years:months:days:hours:minutes:seconds:sinceDate:", yp, mop, dp, hp, mip, sp, date)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSDate.metaclass {
        public open fun calendarDate(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "calendarDate") as ObjCObject

        public open fun dateWithString_calendarFormat_locale(description: NSString, format: NSString, locale: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithString:calendarFormat:locale:", description, format, locale) as ObjCObject

        public open fun dateWithString_calendarFormat(description: NSString, format: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithString:calendarFormat:", description, format) as ObjCObject

        public open fun dateWithYear_month_day_hour_minute_second_timeZone(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int, aTimeZone: NSTimeZone): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithYear:month:day:hour:minute:second:timeZone:", year, month, day, hour, minute, second, aTimeZone) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSCalendarDate")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSDate_NSCalendarDateExtras : IObjCObject {
    public open fun dateWithCalendarFormat_timeZone(format: NSString, aTimeZone: NSTimeZone): NSCalendarDate =
        Native.objc_msgSend("class objc.NSCalendarDate", this, "dateWithCalendarFormat:timeZone:", format, aTimeZone) as NSCalendarDate

    public open fun descriptionWithCalendarFormat_timeZone_locale(format: NSString, aTimeZone: NSTimeZone, locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithCalendarFormat:timeZone:locale:", format, aTimeZone, locale) as NSString

    public open fun initWithString(description: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:", description) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun dateWithNaturalLanguageString_locale(string: NSString, locale: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithNaturalLanguageString:locale:", string, locale) as ObjCObject

        public open fun dateWithNaturalLanguageString(string: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithNaturalLanguageString:", string) as ObjCObject

        public open fun dateWithString(aString: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithString:", aString) as ObjCObject
    }
}
