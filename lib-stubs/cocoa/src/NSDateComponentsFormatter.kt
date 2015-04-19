// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSDateComponentsFormatter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDateComponentsFormatter(pointer: Long) : NSFormatter(pointer) {
    override fun stringForObjectValue(obj: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringForObjectValue:", obj) as NSString

    public open fun stringFromDateComponents(components: NSDateComponents): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromDateComponents:", components) as NSString

    public open fun stringFromDate_toDate(startDate: NSDate, endDate: NSDate): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromDate:toDate:", startDate, endDate) as NSString

    public open fun stringFromTimeInterval(ti: Double): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromTimeInterval:", ti) as NSString

    public open fun unitsStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "unitsStyle")

    public open fun setUnitsStyle(unitsStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setUnitsStyle:", unitsStyle)
    }

    public open fun allowedUnits(): Any =
        Native.objc_msgSend("class objc.Any", this, "allowedUnits")

    public open fun setAllowedUnits(allowedUnits: Any): Unit {
        Native.objc_msgSend("void", this, "setAllowedUnits:", allowedUnits)
    }

    public open fun zeroFormattingBehavior(): Any =
        Native.objc_msgSend("class objc.Any", this, "zeroFormattingBehavior")

    public open fun setZeroFormattingBehavior(zeroFormattingBehavior: Any): Unit {
        Native.objc_msgSend("void", this, "setZeroFormattingBehavior:", zeroFormattingBehavior)
    }

    public open fun calendar(): NSCalendar =
        Native.objc_msgSend("class objc.NSCalendar", this, "calendar") as NSCalendar

    public open fun setCalendar(calendar: NSCalendar): Unit {
        Native.objc_msgSend("void", this, "setCalendar:", calendar)
    }

    public open fun allowsFractionalUnits(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsFractionalUnits") as Boolean

    public open fun setAllowsFractionalUnits(allowsFractionalUnits: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsFractionalUnits:", allowsFractionalUnits)
    }

    public open fun maximumUnitCount(): Int =
        Native.objc_msgSend("int", this, "maximumUnitCount") as Int

    public open fun setMaximumUnitCount(maximumUnitCount: Int): Unit {
        Native.objc_msgSend("void", this, "setMaximumUnitCount:", maximumUnitCount)
    }

    public open fun collapsesLargestUnit(): Boolean =
        Native.objc_msgSend("boolean", this, "collapsesLargestUnit") as Boolean

    public open fun setCollapsesLargestUnit(collapsesLargestUnit: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCollapsesLargestUnit:", collapsesLargestUnit)
    }

    public open fun includesApproximationPhrase(): Boolean =
        Native.objc_msgSend("boolean", this, "includesApproximationPhrase") as Boolean

    public open fun setIncludesApproximationPhrase(includesApproximationPhrase: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncludesApproximationPhrase:", includesApproximationPhrase)
    }

    public open fun includesTimeRemainingPhrase(): Boolean =
        Native.objc_msgSend("boolean", this, "includesTimeRemainingPhrase") as Boolean

    public open fun setIncludesTimeRemainingPhrase(includesTimeRemainingPhrase: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncludesTimeRemainingPhrase:", includesTimeRemainingPhrase)
    }

    public open fun formattingContext(): Any =
        Native.objc_msgSend("class objc.Any", this, "formattingContext")

    public open fun setFormattingContext(formattingContext: Any): Unit {
        Native.objc_msgSend("void", this, "setFormattingContext:", formattingContext)
    }

    override fun getObjectValue_forString_errorDescription(obj: Pointer<ObjCObject>, string: NSString, error: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "getObjectValue:forString:errorDescription:", obj, string, error) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSFormatter.metaclass {
        public open fun localizedStringFromDateComponents_unitsStyle(components: NSDateComponents, unitsStyle: Any): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localizedStringFromDateComponents:unitsStyle:", components, unitsStyle) as NSString

    }

    companion object : NSObject(Native.objc_getClass("NSDateComponentsFormatter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
