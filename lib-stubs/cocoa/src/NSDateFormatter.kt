// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSDateFormatter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDateFormatter(pointer: Long) : NSFormatter(pointer), NSDateFormatter_NSDateFormatterCompatibility {
    public open fun formattingContext(): Any =
        Native.objc_msgSend("class objc.Any", this, "formattingContext")

    public open fun setFormattingContext(formattingContext: Any): Unit {
        Native.objc_msgSend("void", this, "setFormattingContext:", formattingContext)
    }

    public open fun getObjectValue_forString_range_error(obj: Pointer<ObjCObject>, string: NSString, rangep: Pointer<Any>, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "getObjectValue:forString:range:error:", obj, string, rangep, error) as Boolean

    public open fun stringFromDate(date: NSDate): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromDate:", date) as NSString

    public open fun dateFromString(string: NSString): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "dateFromString:", string) as NSDate

    public open fun setLocalizedDateFormatFromTemplate(dateFormatTemplate: NSString): Unit {
        Native.objc_msgSend("void", this, "setLocalizedDateFormatFromTemplate:", dateFormatTemplate)
    }

    public open fun dateFormat(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "dateFormat") as NSString

    public open fun setDateFormat(dateFormat: NSString): Unit {
        Native.objc_msgSend("void", this, "setDateFormat:", dateFormat)
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

    public open fun locale(): NSLocale =
        Native.objc_msgSend("class objc.NSLocale", this, "locale") as NSLocale

    public open fun setLocale(locale: NSLocale): Unit {
        Native.objc_msgSend("void", this, "setLocale:", locale)
    }

    public open fun generatesCalendarDates(): Boolean =
        Native.objc_msgSend("boolean", this, "generatesCalendarDates") as Boolean

    public open fun setGeneratesCalendarDates(generatesCalendarDates: Boolean): Unit {
        Native.objc_msgSend("void", this, "setGeneratesCalendarDates:", generatesCalendarDates)
    }

    public open fun formatterBehavior(): Any =
        Native.objc_msgSend("class objc.Any", this, "formatterBehavior")

    public open fun setFormatterBehavior(formatterBehavior: Any): Unit {
        Native.objc_msgSend("void", this, "setFormatterBehavior:", formatterBehavior)
    }

    public open fun timeZone(): NSTimeZone =
        Native.objc_msgSend("class objc.NSTimeZone", this, "timeZone") as NSTimeZone

    public open fun setTimeZone(timeZone: NSTimeZone): Unit {
        Native.objc_msgSend("void", this, "setTimeZone:", timeZone)
    }

    public open fun calendar(): NSCalendar =
        Native.objc_msgSend("class objc.NSCalendar", this, "calendar") as NSCalendar

    public open fun setCalendar(calendar: NSCalendar): Unit {
        Native.objc_msgSend("void", this, "setCalendar:", calendar)
    }

    public open fun isLenient(): Boolean =
        Native.objc_msgSend("boolean", this, "isLenient") as Boolean

    public open fun setLenient(lenient: Boolean): Unit {
        Native.objc_msgSend("void", this, "setLenient:", lenient)
    }

    public open fun twoDigitStartDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "twoDigitStartDate") as NSDate

    public open fun setTwoDigitStartDate(twoDigitStartDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "setTwoDigitStartDate:", twoDigitStartDate)
    }

    public open fun defaultDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "defaultDate") as NSDate

    public open fun setDefaultDate(defaultDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "setDefaultDate:", defaultDate)
    }

    public open fun eraSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "eraSymbols") as NSArray

    public open fun setEraSymbols(eraSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setEraSymbols:", eraSymbols)
    }

    public open fun monthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "monthSymbols") as NSArray

    public open fun setMonthSymbols(monthSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setMonthSymbols:", monthSymbols)
    }

    public open fun shortMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortMonthSymbols") as NSArray

    public open fun setShortMonthSymbols(shortMonthSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setShortMonthSymbols:", shortMonthSymbols)
    }

    public open fun weekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "weekdaySymbols") as NSArray

    public open fun setWeekdaySymbols(weekdaySymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setWeekdaySymbols:", weekdaySymbols)
    }

    public open fun shortWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortWeekdaySymbols") as NSArray

    public open fun setShortWeekdaySymbols(shortWeekdaySymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setShortWeekdaySymbols:", shortWeekdaySymbols)
    }

    public open fun AMSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "AMSymbol") as NSString

    public open fun setAMSymbol(AMSymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setAMSymbol:", AMSymbol)
    }

    public open fun PMSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "PMSymbol") as NSString

    public open fun setPMSymbol(PMSymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setPMSymbol:", PMSymbol)
    }

    public open fun longEraSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "longEraSymbols") as NSArray

    public open fun setLongEraSymbols(longEraSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setLongEraSymbols:", longEraSymbols)
    }

    public open fun veryShortMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "veryShortMonthSymbols") as NSArray

    public open fun setVeryShortMonthSymbols(veryShortMonthSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setVeryShortMonthSymbols:", veryShortMonthSymbols)
    }

    public open fun standaloneMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "standaloneMonthSymbols") as NSArray

    public open fun setStandaloneMonthSymbols(standaloneMonthSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setStandaloneMonthSymbols:", standaloneMonthSymbols)
    }

    public open fun shortStandaloneMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortStandaloneMonthSymbols") as NSArray

    public open fun setShortStandaloneMonthSymbols(shortStandaloneMonthSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setShortStandaloneMonthSymbols:", shortStandaloneMonthSymbols)
    }

    public open fun veryShortStandaloneMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "veryShortStandaloneMonthSymbols") as NSArray

    public open fun setVeryShortStandaloneMonthSymbols(veryShortStandaloneMonthSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setVeryShortStandaloneMonthSymbols:", veryShortStandaloneMonthSymbols)
    }

    public open fun veryShortWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "veryShortWeekdaySymbols") as NSArray

    public open fun setVeryShortWeekdaySymbols(veryShortWeekdaySymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setVeryShortWeekdaySymbols:", veryShortWeekdaySymbols)
    }

    public open fun standaloneWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "standaloneWeekdaySymbols") as NSArray

    public open fun setStandaloneWeekdaySymbols(standaloneWeekdaySymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setStandaloneWeekdaySymbols:", standaloneWeekdaySymbols)
    }

    public open fun shortStandaloneWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortStandaloneWeekdaySymbols") as NSArray

    public open fun setShortStandaloneWeekdaySymbols(shortStandaloneWeekdaySymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setShortStandaloneWeekdaySymbols:", shortStandaloneWeekdaySymbols)
    }

    public open fun veryShortStandaloneWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "veryShortStandaloneWeekdaySymbols") as NSArray

    public open fun setVeryShortStandaloneWeekdaySymbols(veryShortStandaloneWeekdaySymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setVeryShortStandaloneWeekdaySymbols:", veryShortStandaloneWeekdaySymbols)
    }

    public open fun quarterSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "quarterSymbols") as NSArray

    public open fun setQuarterSymbols(quarterSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setQuarterSymbols:", quarterSymbols)
    }

    public open fun shortQuarterSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortQuarterSymbols") as NSArray

    public open fun setShortQuarterSymbols(shortQuarterSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setShortQuarterSymbols:", shortQuarterSymbols)
    }

    public open fun standaloneQuarterSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "standaloneQuarterSymbols") as NSArray

    public open fun setStandaloneQuarterSymbols(standaloneQuarterSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setStandaloneQuarterSymbols:", standaloneQuarterSymbols)
    }

    public open fun shortStandaloneQuarterSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortStandaloneQuarterSymbols") as NSArray

    public open fun setShortStandaloneQuarterSymbols(shortStandaloneQuarterSymbols: NSArray): Unit {
        Native.objc_msgSend("void", this, "setShortStandaloneQuarterSymbols:", shortStandaloneQuarterSymbols)
    }

    public open fun gregorianStartDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "gregorianStartDate") as NSDate

    public open fun setGregorianStartDate(gregorianStartDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "setGregorianStartDate:", gregorianStartDate)
    }

    public open fun doesRelativeDateFormatting(): Boolean =
        Native.objc_msgSend("boolean", this, "doesRelativeDateFormatting") as Boolean

    public open fun setDoesRelativeDateFormatting(doesRelativeDateFormatting: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDoesRelativeDateFormatting:", doesRelativeDateFormatting)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSFormatter.metaclass, NSDateFormatter_NSDateFormatterCompatibility.metaclass {
        public open fun localizedStringFromDate_dateStyle_timeStyle(date: NSDate, dstyle: Any, tstyle: Any): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localizedStringFromDate:dateStyle:timeStyle:", date, dstyle, tstyle) as NSString

        public open fun dateFormatFromTemplate_options_locale(tmplate: NSString, opts: Int, locale: NSLocale): NSString =
            Native.objc_msgSend("class objc.NSString", this, "dateFormatFromTemplate:options:locale:", tmplate, opts, locale) as NSString

        public open fun defaultFormatterBehavior(): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultFormatterBehavior")

        public open fun setDefaultFormatterBehavior(behavior: Any): Unit {
            Native.objc_msgSend("void", this, "setDefaultFormatterBehavior:", behavior)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSDateFormatter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSDateFormatter_NSDateFormatterCompatibility : IObjCObject {
    public open fun initWithDateFormat_allowNaturalLanguage(format: NSString, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDateFormat:allowNaturalLanguage:", format, flag) as ObjCObject

    public open fun allowsNaturalLanguage(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsNaturalLanguage") as Boolean

    trait metaclass : IObjCObject
}
