// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSTimeZone.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTimeZone(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding, NSTimeZone_NSExtendedTimeZone, NSTimeZone_NSTimeZoneCreation {
    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun data(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "data") as NSData

    public open fun secondsFromGMTForDate(aDate: NSDate): Int =
        Native.objc_msgSend("int", this, "secondsFromGMTForDate:", aDate) as Int

    public open fun abbreviationForDate(aDate: NSDate): NSString =
        Native.objc_msgSend("class objc.NSString", this, "abbreviationForDate:", aDate) as NSString

    public open fun isDaylightSavingTimeForDate(aDate: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "isDaylightSavingTimeForDate:", aDate) as Boolean

    public open fun daylightSavingTimeOffsetForDate(aDate: NSDate): Double =
        Native.objc_msgSend("double", this, "daylightSavingTimeOffsetForDate:", aDate) as Double

    public open fun nextDaylightSavingTimeTransitionAfterDate(aDate: NSDate): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "nextDaylightSavingTimeTransitionAfterDate:", aDate) as NSDate

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass, NSTimeZone_NSExtendedTimeZone.metaclass, NSTimeZone_NSTimeZoneCreation.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTimeZone")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSTimeZone_NSExtendedTimeZone : IObjCObject {
    public open fun secondsFromGMT(): Int =
        Native.objc_msgSend("int", this, "secondsFromGMT") as Int

    public open fun abbreviation(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "abbreviation") as NSString

    public open fun isDaylightSavingTime(): Boolean =
        Native.objc_msgSend("boolean", this, "isDaylightSavingTime") as Boolean

    public open fun daylightSavingTimeOffset(): Double =
        Native.objc_msgSend("double", this, "daylightSavingTimeOffset") as Double

    public open fun nextDaylightSavingTimeTransition(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "nextDaylightSavingTimeTransition") as NSDate

    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun isEqualToTimeZone(aTimeZone: NSTimeZone): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToTimeZone:", aTimeZone) as Boolean

    public open fun localizedName_locale(style: Any, locale: NSLocale): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedName:locale:", style, locale) as NSString

    trait metaclass : IObjCObject {
        public open fun systemTimeZone(): NSTimeZone =
            Native.objc_msgSend("class objc.NSTimeZone", this, "systemTimeZone") as NSTimeZone

        public open fun resetSystemTimeZone(): Unit {
            Native.objc_msgSend("void", this, "resetSystemTimeZone")
        }

        public open fun defaultTimeZone(): NSTimeZone =
            Native.objc_msgSend("class objc.NSTimeZone", this, "defaultTimeZone") as NSTimeZone

        public open fun setDefaultTimeZone(aTimeZone: NSTimeZone): Unit {
            Native.objc_msgSend("void", this, "setDefaultTimeZone:", aTimeZone)
        }

        public open fun localTimeZone(): NSTimeZone =
            Native.objc_msgSend("class objc.NSTimeZone", this, "localTimeZone") as NSTimeZone

        public open fun knownTimeZoneNames(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "knownTimeZoneNames") as NSArray

        public open fun abbreviationDictionary(): NSDictionary =
            Native.objc_msgSend("class objc.NSDictionary", this, "abbreviationDictionary") as NSDictionary

        public open fun setAbbreviationDictionary(dict: NSDictionary): Unit {
            Native.objc_msgSend("void", this, "setAbbreviationDictionary:", dict)
        }

        public open fun timeZoneDataVersion(): NSString =
            Native.objc_msgSend("class objc.NSString", this, "timeZoneDataVersion") as NSString
    }
}

trait NSTimeZone_NSTimeZoneCreation : IObjCObject {
    public open fun initWithName(tzName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:", tzName) as ObjCObject

    public open fun initWithName_data(tzName: NSString, aData: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:data:", tzName, aData) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun timeZoneWithName(tzName: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "timeZoneWithName:", tzName) as ObjCObject

        public open fun timeZoneWithName_data(tzName: NSString, aData: NSData): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "timeZoneWithName:data:", tzName, aData) as ObjCObject

        public open fun timeZoneForSecondsFromGMT(seconds: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "timeZoneForSecondsFromGMT:", seconds) as ObjCObject

        public open fun timeZoneWithAbbreviation(abbreviation: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "timeZoneWithAbbreviation:", abbreviation) as ObjCObject
    }
}
