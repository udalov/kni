// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSLengthFormatter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSLengthFormatter(pointer: Long) : NSFormatter(pointer) {
    public open fun numberFormatter(): NSNumberFormatter =
        Native.objc_msgSend("class objc.NSNumberFormatter", this, "numberFormatter") as NSNumberFormatter

    public open fun setNumberFormatter(numberFormatter: NSNumberFormatter): Unit {
        Native.objc_msgSend("void", this, "setNumberFormatter:", numberFormatter)
    }

    public open fun unitStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "unitStyle")

    public open fun setUnitStyle(unitStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setUnitStyle:", unitStyle)
    }

    public open fun isForPersonHeightUse(): Boolean =
        Native.objc_msgSend("boolean", this, "isForPersonHeightUse") as Boolean

    public open fun setForPersonHeightUse(forPersonHeightUse: Boolean): Unit {
        Native.objc_msgSend("void", this, "setForPersonHeightUse:", forPersonHeightUse)
    }

    public open fun stringFromValue_unit(value: Double, unit: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromValue:unit:", value, unit) as NSString

    public open fun stringFromMeters(numberInMeters: Double): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromMeters:", numberInMeters) as NSString

    public open fun unitStringFromValue_unit(value: Double, unit: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "unitStringFromValue:unit:", value, unit) as NSString

    public open fun unitStringFromMeters_usedUnit(numberInMeters: Double, unitp: Pointer<Any>): NSString =
        Native.objc_msgSend("class objc.NSString", this, "unitStringFromMeters:usedUnit:", numberInMeters, unitp) as NSString

    override fun getObjectValue_forString_errorDescription(obj: Pointer<ObjCObject>, string: NSString, error: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "getObjectValue:forString:errorDescription:", obj, string, error) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSFormatter.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSLengthFormatter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
