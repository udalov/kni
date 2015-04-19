// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSDate.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDate(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding, NSDate_NSExtendedDate, NSDate_NSDateCreation, NSDate_NSCalendarDateExtras {
    public open fun timeIntervalSinceReferenceDate(): Double =
        Native.objc_msgSend("double", this, "timeIntervalSinceReferenceDate") as Double

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithTimeIntervalSinceReferenceDate(ti: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTimeIntervalSinceReferenceDate:", ti) as ObjCObject

    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass, NSDate_NSExtendedDate.metaclass, NSDate_NSDateCreation.metaclass, NSDate_NSCalendarDateExtras.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDate")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSDate_NSExtendedDate : IObjCObject {
    public open fun timeIntervalSinceDate(anotherDate: NSDate): Double =
        Native.objc_msgSend("double", this, "timeIntervalSinceDate:", anotherDate) as Double

    public open fun timeIntervalSinceNow(): Double =
        Native.objc_msgSend("double", this, "timeIntervalSinceNow") as Double

    public open fun timeIntervalSince1970(): Double =
        Native.objc_msgSend("double", this, "timeIntervalSince1970") as Double

    public open fun addTimeInterval(seconds: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "addTimeInterval:", seconds) as ObjCObject

    public open fun dateByAddingTimeInterval(ti: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateByAddingTimeInterval:", ti) as ObjCObject

    public open fun earlierDate(anotherDate: NSDate): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "earlierDate:", anotherDate) as NSDate

    public open fun laterDate(anotherDate: NSDate): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "laterDate:", anotherDate) as NSDate

    public open fun compare(other: NSDate): Any =
        Native.objc_msgSend("class objc.Any", this, "compare:", other)

    public open fun isEqualToDate(otherDate: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToDate:", otherDate) as Boolean

    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun descriptionWithLocale(locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:", locale) as NSString

    trait metaclass : IObjCObject {
        public open fun timeIntervalSinceReferenceDate(): Double =
            Native.objc_msgSend("double", this, "timeIntervalSinceReferenceDate") as Double
    }
}

trait NSDate_NSDateCreation : IObjCObject {
    public open fun initWithTimeIntervalSinceNow(secs: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTimeIntervalSinceNow:", secs) as ObjCObject

    public open fun initWithTimeIntervalSince1970(secs: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTimeIntervalSince1970:", secs) as ObjCObject

    public open fun initWithTimeInterval_sinceDate(secsToBeAdded: Double, date: NSDate): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTimeInterval:sinceDate:", secsToBeAdded, date) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun date(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "date") as ObjCObject

        public open fun dateWithTimeIntervalSinceNow(secs: Double): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithTimeIntervalSinceNow:", secs) as ObjCObject

        public open fun dateWithTimeIntervalSinceReferenceDate(ti: Double): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithTimeIntervalSinceReferenceDate:", ti) as ObjCObject

        public open fun dateWithTimeIntervalSince1970(secs: Double): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithTimeIntervalSince1970:", secs) as ObjCObject

        public open fun dateWithTimeInterval_sinceDate(secsToBeAdded: Double, date: NSDate): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dateWithTimeInterval:sinceDate:", secsToBeAdded, date) as ObjCObject

        public open fun distantFuture(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "distantFuture") as ObjCObject

        public open fun distantPast(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "distantPast") as ObjCObject
    }
}
