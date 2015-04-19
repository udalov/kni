// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSMassFormatter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSMassFormatter(pointer: Long) : NSFormatter(pointer) {
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

    public open fun isForPersonMassUse(): Boolean =
        Native.objc_msgSend("boolean", this, "isForPersonMassUse") as Boolean

    public open fun setForPersonMassUse(forPersonMassUse: Boolean): Unit {
        Native.objc_msgSend("void", this, "setForPersonMassUse:", forPersonMassUse)
    }

    public open fun stringFromValue_unit(value: Double, unit: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromValue:unit:", value, unit) as NSString

    public open fun stringFromKilograms(numberInKilograms: Double): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromKilograms:", numberInKilograms) as NSString

    public open fun unitStringFromValue_unit(value: Double, unit: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "unitStringFromValue:unit:", value, unit) as NSString

    public open fun unitStringFromKilograms_usedUnit(numberInKilograms: Double, unitp: Pointer<Any>): NSString =
        Native.objc_msgSend("class objc.NSString", this, "unitStringFromKilograms:usedUnit:", numberInKilograms, unitp) as NSString

    override fun getObjectValue_forString_errorDescription(obj: Pointer<ObjCObject>, string: NSString, error: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "getObjectValue:forString:errorDescription:", obj, string, error) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSFormatter.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMassFormatter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
