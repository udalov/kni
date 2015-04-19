// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSCalendar.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCalendar(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    public open fun initWithCalendarIdentifier(ident: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCalendarIdentifier:", ident) as ObjCObject

    public open fun calendarIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "calendarIdentifier") as NSString

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

    public open fun firstWeekday(): Int =
        Native.objc_msgSend("int", this, "firstWeekday") as Int

    public open fun setFirstWeekday(firstWeekday: Int): Unit {
        Native.objc_msgSend("void", this, "setFirstWeekday:", firstWeekday)
    }

    public open fun minimumDaysInFirstWeek(): Int =
        Native.objc_msgSend("int", this, "minimumDaysInFirstWeek") as Int

    public open fun setMinimumDaysInFirstWeek(minimumDaysInFirstWeek: Int): Unit {
        Native.objc_msgSend("void", this, "setMinimumDaysInFirstWeek:", minimumDaysInFirstWeek)
    }

    public open fun eraSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "eraSymbols") as NSArray

    public open fun longEraSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "longEraSymbols") as NSArray

    public open fun monthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "monthSymbols") as NSArray

    public open fun shortMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortMonthSymbols") as NSArray

    public open fun veryShortMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "veryShortMonthSymbols") as NSArray

    public open fun standaloneMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "standaloneMonthSymbols") as NSArray

    public open fun shortStandaloneMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortStandaloneMonthSymbols") as NSArray

    public open fun veryShortStandaloneMonthSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "veryShortStandaloneMonthSymbols") as NSArray

    public open fun weekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "weekdaySymbols") as NSArray

    public open fun shortWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortWeekdaySymbols") as NSArray

    public open fun veryShortWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "veryShortWeekdaySymbols") as NSArray

    public open fun standaloneWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "standaloneWeekdaySymbols") as NSArray

    public open fun shortStandaloneWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortStandaloneWeekdaySymbols") as NSArray

    public open fun veryShortStandaloneWeekdaySymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "veryShortStandaloneWeekdaySymbols") as NSArray

    public open fun quarterSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "quarterSymbols") as NSArray

    public open fun shortQuarterSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortQuarterSymbols") as NSArray

    public open fun standaloneQuarterSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "standaloneQuarterSymbols") as NSArray

    public open fun shortStandaloneQuarterSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "shortStandaloneQuarterSymbols") as NSArray

    public open fun AMSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "AMSymbol") as NSString

    public open fun PMSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "PMSymbol") as NSString

    public open fun minimumRangeOfUnit(unit: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "minimumRangeOfUnit:", unit)

    public open fun maximumRangeOfUnit(unit: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "maximumRangeOfUnit:", unit)

    public open fun rangeOfUnit_inUnit_forDate(smaller: Any, larger: Any, date: NSDate): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfUnit:inUnit:forDate:", smaller, larger, date)

    public open fun ordinalityOfUnit_inUnit_forDate(smaller: Any, larger: Any, date: NSDate): Int =
        Native.objc_msgSend("int", this, "ordinalityOfUnit:inUnit:forDate:", smaller, larger, date) as Int

    public open fun rangeOfUnit_startDate_interval_forDate(unit: Any, datep: Pointer<NSDate>, tip: Pointer<Double>, date: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "rangeOfUnit:startDate:interval:forDate:", unit, datep, tip, date) as Boolean

    public open fun dateFromComponents(comps: NSDateComponents): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "dateFromComponents:", comps) as NSDate

    public open fun components_fromDate(unitFlags: Any, date: NSDate): NSDateComponents =
        Native.objc_msgSend("class objc.NSDateComponents", this, "components:fromDate:", unitFlags, date) as NSDateComponents

    public open fun dateByAddingComponents_toDate_options(comps: NSDateComponents, date: NSDate, opts: Any): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "dateByAddingComponents:toDate:options:", comps, date, opts) as NSDate

    public open fun components_fromDate_toDate_options(unitFlags: Any, startingDate: NSDate, resultDate: NSDate, opts: Any): NSDateComponents =
        Native.objc_msgSend("class objc.NSDateComponents", this, "components:fromDate:toDate:options:", unitFlags, startingDate, resultDate, opts) as NSDateComponents

    public open fun getEra_year_month_day_fromDate(eraValuePointer: Pointer<Int>, yearValuePointer: Pointer<Int>, monthValuePointer: Pointer<Int>, dayValuePointer: Pointer<Int>, date: NSDate): Unit {
        Native.objc_msgSend("void", this, "getEra:year:month:day:fromDate:", eraValuePointer, yearValuePointer, monthValuePointer, dayValuePointer, date)
    }

    public open fun getEra_yearForWeekOfYear_weekOfYear_weekday_fromDate(eraValuePointer: Pointer<Int>, yearValuePointer: Pointer<Int>, weekValuePointer: Pointer<Int>, weekdayValuePointer: Pointer<Int>, date: NSDate): Unit {
        Native.objc_msgSend("void", this, "getEra:yearForWeekOfYear:weekOfYear:weekday:fromDate:", eraValuePointer, yearValuePointer, weekValuePointer, weekdayValuePointer, date)
    }

    public open fun getHour_minute_second_nanosecond_fromDate(hourValuePointer: Pointer<Int>, minuteValuePointer: Pointer<Int>, secondValuePointer: Pointer<Int>, nanosecondValuePointer: Pointer<Int>, date: NSDate): Unit {
        Native.objc_msgSend("void", this, "getHour:minute:second:nanosecond:fromDate:", hourValuePointer, minuteValuePointer, secondValuePointer, nanosecondValuePointer, date)
    }

    public open fun component_fromDate(unit: Any, date: NSDate): Int =
        Native.objc_msgSend("int", this, "component:fromDate:", unit, date) as Int

    public open fun dateWithEra_year_month_day_hour_minute_second_nanosecond(eraValue: Int, yearValue: Int, monthValue: Int, dayValue: Int, hourValue: Int, minuteValue: Int, secondValue: Int, nanosecondValue: Int): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "dateWithEra:year:month:day:hour:minute:second:nanosecond:", eraValue, yearValue, monthValue, dayValue, hourValue, minuteValue, secondValue, nanosecondValue) as NSDate

    public open fun dateWithEra_yearForWeekOfYear_weekOfYear_weekday_hour_minute_second_nanosecond(eraValue: Int, yearValue: Int, weekValue: Int, weekdayValue: Int, hourValue: Int, minuteValue: Int, secondValue: Int, nanosecondValue: Int): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "dateWithEra:yearForWeekOfYear:weekOfYear:weekday:hour:minute:second:nanosecond:", eraValue, yearValue, weekValue, weekdayValue, hourValue, minuteValue, secondValue, nanosecondValue) as NSDate

    public open fun startOfDayForDate(date: NSDate): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "startOfDayForDate:", date) as NSDate

    public open fun componentsInTimeZone_fromDate(timezone: NSTimeZone, date: NSDate): NSDateComponents =
        Native.objc_msgSend("class objc.NSDateComponents", this, "componentsInTimeZone:fromDate:", timezone, date) as NSDateComponents

    public open fun compareDate_toDate_toUnitGranularity(date1: NSDate, date2: NSDate, unit: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "compareDate:toDate:toUnitGranularity:", date1, date2, unit)

    public open fun isDate_equalToDate_toUnitGranularity(date1: NSDate, date2: NSDate, unit: Any): Boolean =
        Native.objc_msgSend("boolean", this, "isDate:equalToDate:toUnitGranularity:", date1, date2, unit) as Boolean

    public open fun isDate_inSameDayAsDate(date1: NSDate, date2: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "isDate:inSameDayAsDate:", date1, date2) as Boolean

    public open fun isDateInToday(date: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "isDateInToday:", date) as Boolean

    public open fun isDateInYesterday(date: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "isDateInYesterday:", date) as Boolean

    public open fun isDateInTomorrow(date: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "isDateInTomorrow:", date) as Boolean

    public open fun isDateInWeekend(date: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "isDateInWeekend:", date) as Boolean

    public open fun rangeOfWeekendStartDate_interval_containingDate(datep: Pointer<NSDate>, tip: Pointer<Double>, date: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "rangeOfWeekendStartDate:interval:containingDate:", datep, tip, date) as Boolean

    public open fun nextWeekendStartDate_interval_options_afterDate(datep: Pointer<NSDate>, tip: Pointer<Double>, options: Any, date: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "nextWeekendStartDate:interval:options:afterDate:", datep, tip, options, date) as Boolean

    public open fun components_fromDateComponents_toDateComponents_options(unitFlags: Any, startingDateComp: NSDateComponents, resultDateComp: NSDateComponents, options: Any): NSDateComponents =
        Native.objc_msgSend("class objc.NSDateComponents", this, "components:fromDateComponents:toDateComponents:options:", unitFlags, startingDateComp, resultDateComp, options) as NSDateComponents

    public open fun dateByAddingUnit_value_toDate_options(unit: Any, value: Int, date: NSDate, options: Any): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "dateByAddingUnit:value:toDate:options:", unit, value, date, options) as NSDate

    public open fun enumerateDatesStartingAfterDate_matchingComponents_options_usingBlock(start: NSDate, comps: NSDateComponents, opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateDatesStartingAfterDate:matchingComponents:options:usingBlock:", start, comps, opts, block)
    }

    public open fun nextDateAfterDate_matchingComponents_options(date: NSDate, comps: NSDateComponents, options: Any): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "nextDateAfterDate:matchingComponents:options:", date, comps, options) as NSDate

    public open fun nextDateAfterDate_matchingUnit_value_options(date: NSDate, unit: Any, value: Int, options: Any): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "nextDateAfterDate:matchingUnit:value:options:", date, unit, value, options) as NSDate

    public open fun nextDateAfterDate_matchingHour_minute_second_options(date: NSDate, hourValue: Int, minuteValue: Int, secondValue: Int, options: Any): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "nextDateAfterDate:matchingHour:minute:second:options:", date, hourValue, minuteValue, secondValue, options) as NSDate

    public open fun dateBySettingUnit_value_ofDate_options(unit: Any, v: Int, date: NSDate, opts: Any): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "dateBySettingUnit:value:ofDate:options:", unit, v, date, opts) as NSDate

    public open fun dateBySettingHour_minute_second_ofDate_options(h: Int, m: Int, s: Int, date: NSDate, opts: Any): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "dateBySettingHour:minute:second:ofDate:options:", h, m, s, date, opts) as NSDate

    public open fun date_matchesComponents(date: NSDate, components: NSDateComponents): Boolean =
        Native.objc_msgSend("boolean", this, "date:matchesComponents:", date, components) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
        public open fun currentCalendar(): NSCalendar =
            Native.objc_msgSend("class objc.NSCalendar", this, "currentCalendar") as NSCalendar

        public open fun autoupdatingCurrentCalendar(): NSCalendar =
            Native.objc_msgSend("class objc.NSCalendar", this, "autoupdatingCurrentCalendar") as NSCalendar

        public open fun calendarWithIdentifier(calendarIdentifierConstant: NSString): NSCalendar =
            Native.objc_msgSend("class objc.NSCalendar", this, "calendarWithIdentifier:", calendarIdentifierConstant) as NSCalendar

    }

    companion object : NSObject(Native.objc_getClass("NSCalendar")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSDateComponents(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
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

    public open fun era(): Int =
        Native.objc_msgSend("int", this, "era") as Int

    public open fun setEra(era: Int): Unit {
        Native.objc_msgSend("void", this, "setEra:", era)
    }

    public open fun year(): Int =
        Native.objc_msgSend("int", this, "year") as Int

    public open fun setYear(year: Int): Unit {
        Native.objc_msgSend("void", this, "setYear:", year)
    }

    public open fun month(): Int =
        Native.objc_msgSend("int", this, "month") as Int

    public open fun setMonth(month: Int): Unit {
        Native.objc_msgSend("void", this, "setMonth:", month)
    }

    public open fun day(): Int =
        Native.objc_msgSend("int", this, "day") as Int

    public open fun setDay(day: Int): Unit {
        Native.objc_msgSend("void", this, "setDay:", day)
    }

    public open fun hour(): Int =
        Native.objc_msgSend("int", this, "hour") as Int

    public open fun setHour(hour: Int): Unit {
        Native.objc_msgSend("void", this, "setHour:", hour)
    }

    public open fun minute(): Int =
        Native.objc_msgSend("int", this, "minute") as Int

    public open fun setMinute(minute: Int): Unit {
        Native.objc_msgSend("void", this, "setMinute:", minute)
    }

    public open fun second(): Int =
        Native.objc_msgSend("int", this, "second") as Int

    public open fun setSecond(second: Int): Unit {
        Native.objc_msgSend("void", this, "setSecond:", second)
    }

    public open fun nanosecond(): Int =
        Native.objc_msgSend("int", this, "nanosecond") as Int

    public open fun setNanosecond(nanosecond: Int): Unit {
        Native.objc_msgSend("void", this, "setNanosecond:", nanosecond)
    }

    public open fun weekday(): Int =
        Native.objc_msgSend("int", this, "weekday") as Int

    public open fun setWeekday(weekday: Int): Unit {
        Native.objc_msgSend("void", this, "setWeekday:", weekday)
    }

    public open fun weekdayOrdinal(): Int =
        Native.objc_msgSend("int", this, "weekdayOrdinal") as Int

    public open fun setWeekdayOrdinal(weekdayOrdinal: Int): Unit {
        Native.objc_msgSend("void", this, "setWeekdayOrdinal:", weekdayOrdinal)
    }

    public open fun quarter(): Int =
        Native.objc_msgSend("int", this, "quarter") as Int

    public open fun setQuarter(quarter: Int): Unit {
        Native.objc_msgSend("void", this, "setQuarter:", quarter)
    }

    public open fun weekOfMonth(): Int =
        Native.objc_msgSend("int", this, "weekOfMonth") as Int

    public open fun setWeekOfMonth(weekOfMonth: Int): Unit {
        Native.objc_msgSend("void", this, "setWeekOfMonth:", weekOfMonth)
    }

    public open fun weekOfYear(): Int =
        Native.objc_msgSend("int", this, "weekOfYear") as Int

    public open fun setWeekOfYear(weekOfYear: Int): Unit {
        Native.objc_msgSend("void", this, "setWeekOfYear:", weekOfYear)
    }

    public open fun yearForWeekOfYear(): Int =
        Native.objc_msgSend("int", this, "yearForWeekOfYear") as Int

    public open fun setYearForWeekOfYear(yearForWeekOfYear: Int): Unit {
        Native.objc_msgSend("void", this, "setYearForWeekOfYear:", yearForWeekOfYear)
    }

    public open fun isLeapMonth(): Boolean =
        Native.objc_msgSend("boolean", this, "isLeapMonth") as Boolean

    public open fun setLeapMonth(leapMonth: Boolean): Unit {
        Native.objc_msgSend("void", this, "setLeapMonth:", leapMonth)
    }

    public open fun date(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "date") as NSDate

    public open fun week(): Int =
        Native.objc_msgSend("int", this, "week") as Int

    public open fun setWeek(v: Int): Unit {
        Native.objc_msgSend("void", this, "setWeek:", v)
    }

    public open fun setValue_forComponent(value: Int, unit: Any): Unit {
        Native.objc_msgSend("void", this, "setValue:forComponent:", value, unit)
    }

    public open fun valueForComponent(unit: Any): Int =
        Native.objc_msgSend("int", this, "valueForComponent:", unit) as Int

    public open fun isValidDate(): Boolean =
        Native.objc_msgSend("boolean", this, "isValidDate") as Boolean

    public open fun isValidDateInCalendar(calendar: NSCalendar): Boolean =
        Native.objc_msgSend("boolean", this, "isValidDateInCalendar:", calendar) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDateComponents")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
