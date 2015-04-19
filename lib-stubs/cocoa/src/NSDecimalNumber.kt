// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSDecimalNumber.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSDecimalNumberBehaviors {
    trait metaclass
}

public open class NSDecimalNumber(pointer: Long) : NSNumber(pointer) {
    public open fun initWithMantissa_exponent_isNegative(mantissa: Long, exponent: Short, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithMantissa:exponent:isNegative:", mantissa, exponent, flag) as ObjCObject

    public open fun initWithDecimal(dcm: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDecimal:", dcm) as ObjCObject

    public open fun initWithString(numberValue: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:", numberValue) as ObjCObject

    public open fun initWithString_locale(numberValue: NSString, locale: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:locale:", numberValue, locale) as ObjCObject

    override fun descriptionWithLocale(locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:", locale) as NSString

    override fun decimalValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "decimalValue")

    public open fun decimalNumberByAdding(decimalNumber: NSDecimalNumber): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByAdding:", decimalNumber) as NSDecimalNumber

    public open fun decimalNumberByAdding_withBehavior(decimalNumber: NSDecimalNumber, behavior: Any): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByAdding:withBehavior:", decimalNumber, behavior) as NSDecimalNumber

    public open fun decimalNumberBySubtracting(decimalNumber: NSDecimalNumber): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberBySubtracting:", decimalNumber) as NSDecimalNumber

    public open fun decimalNumberBySubtracting_withBehavior(decimalNumber: NSDecimalNumber, behavior: Any): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberBySubtracting:withBehavior:", decimalNumber, behavior) as NSDecimalNumber

    public open fun decimalNumberByMultiplyingBy(decimalNumber: NSDecimalNumber): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByMultiplyingBy:", decimalNumber) as NSDecimalNumber

    public open fun decimalNumberByMultiplyingBy_withBehavior(decimalNumber: NSDecimalNumber, behavior: Any): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByMultiplyingBy:withBehavior:", decimalNumber, behavior) as NSDecimalNumber

    public open fun decimalNumberByDividingBy(decimalNumber: NSDecimalNumber): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByDividingBy:", decimalNumber) as NSDecimalNumber

    public open fun decimalNumberByDividingBy_withBehavior(decimalNumber: NSDecimalNumber, behavior: Any): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByDividingBy:withBehavior:", decimalNumber, behavior) as NSDecimalNumber

    public open fun decimalNumberByRaisingToPower(power: Int): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByRaisingToPower:", power) as NSDecimalNumber

    public open fun decimalNumberByRaisingToPower_withBehavior(power: Int, behavior: Any): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByRaisingToPower:withBehavior:", power, behavior) as NSDecimalNumber

    public open fun decimalNumberByMultiplyingByPowerOf10(power: Short): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByMultiplyingByPowerOf10:", power) as NSDecimalNumber

    public open fun decimalNumberByMultiplyingByPowerOf10_withBehavior(power: Short, behavior: Any): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByMultiplyingByPowerOf10:withBehavior:", power, behavior) as NSDecimalNumber

    public open fun decimalNumberByRoundingAccordingToBehavior(behavior: Any): NSDecimalNumber =
        Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberByRoundingAccordingToBehavior:", behavior) as NSDecimalNumber

    override fun compare(decimalNumber: NSNumber): Any =
        Native.objc_msgSend("class objc.Any", this, "compare:", decimalNumber)

    override fun objCType(): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "objCType") as Pointer<Char>

    override fun doubleValue(): Double =
        Native.objc_msgSend("double", this, "doubleValue") as Double

    override fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSNumber.metaclass {
        public open fun decimalNumberWithMantissa_exponent_isNegative(mantissa: Long, exponent: Short, flag: Boolean): NSDecimalNumber =
            Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberWithMantissa:exponent:isNegative:", mantissa, exponent, flag) as NSDecimalNumber

        public open fun decimalNumberWithDecimal(dcm: Any): NSDecimalNumber =
            Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberWithDecimal:", dcm) as NSDecimalNumber

        public open fun decimalNumberWithString(numberValue: NSString): NSDecimalNumber =
            Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberWithString:", numberValue) as NSDecimalNumber

        public open fun decimalNumberWithString_locale(numberValue: NSString, locale: ObjCObject): NSDecimalNumber =
            Native.objc_msgSend("class objc.NSDecimalNumber", this, "decimalNumberWithString:locale:", numberValue, locale) as NSDecimalNumber

        public open fun zero(): NSDecimalNumber =
            Native.objc_msgSend("class objc.NSDecimalNumber", this, "zero") as NSDecimalNumber

        public open fun one(): NSDecimalNumber =
            Native.objc_msgSend("class objc.NSDecimalNumber", this, "one") as NSDecimalNumber

        public open fun minimumDecimalNumber(): NSDecimalNumber =
            Native.objc_msgSend("class objc.NSDecimalNumber", this, "minimumDecimalNumber") as NSDecimalNumber

        public open fun maximumDecimalNumber(): NSDecimalNumber =
            Native.objc_msgSend("class objc.NSDecimalNumber", this, "maximumDecimalNumber") as NSDecimalNumber

        public open fun notANumber(): NSDecimalNumber =
            Native.objc_msgSend("class objc.NSDecimalNumber", this, "notANumber") as NSDecimalNumber

        public open fun setDefaultBehavior(behavior: Any): Unit {
            Native.objc_msgSend("void", this, "setDefaultBehavior:", behavior)
        }

        public open fun defaultBehavior(): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultBehavior")

    }

    companion object : NSObject(Native.objc_getClass("NSDecimalNumber")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSDecimalNumberHandler(pointer: Long) : NSObject(pointer), NSDecimalNumberBehaviors, NSCoding {
    public open fun initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero(roundingMode: Any, scale: Short, exact: Boolean, overflow: Boolean, underflow: Boolean, divideByZero: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:", roundingMode, scale, exact, overflow, underflow, divideByZero) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSDecimalNumberBehaviors.metaclass, NSCoding.metaclass {
        public open fun defaultDecimalNumberHandler(): NSDecimalNumberHandler =
            Native.objc_msgSend("class objc.NSDecimalNumberHandler", this, "defaultDecimalNumberHandler") as NSDecimalNumberHandler

        public open fun decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero(roundingMode: Any, scale: Short, exact: Boolean, overflow: Boolean, underflow: Boolean, divideByZero: Boolean): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "decimalNumberHandlerWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:", roundingMode, scale, exact, overflow, underflow, divideByZero) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSDecimalNumberHandler")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSNumber_NSDecimalNumberExtensions : IObjCObject {
    public open fun decimalValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "decimalValue")

    trait metaclass : IObjCObject
}

trait NSScanner_NSDecimalNumberScanning : IObjCObject {
    public open fun scanDecimal(dcm: Pointer<Any>): Boolean =
        Native.objc_msgSend("boolean", this, "scanDecimal:", dcm) as Boolean

    trait metaclass : IObjCObject
}
