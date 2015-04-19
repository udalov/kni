// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSValue.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSValue(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding, NSValue_NSValueCreation, NSValue_NSValueExtensionMethods, NSValue_NSValueRangeExtensions, NSValue_NSValueGeometryExtensions, NSValue_CATransform3DAdditions {
    public open fun getValue(value: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "getValue:", value)
    }

    public open fun objCType(): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "objCType") as Pointer<Char>

    public open fun initWithBytes_objCType(value: Pointer<Unit>, type: Pointer<Char>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBytes:objCType:", value, type) as ObjCObject

    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass, NSValue_NSValueCreation.metaclass, NSValue_NSValueExtensionMethods.metaclass, NSValue_NSValueRangeExtensions.metaclass, NSValue_NSValueGeometryExtensions.metaclass, NSValue_CATransform3DAdditions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSValue")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSNumber(pointer: Long) : NSValue(pointer), NSNumber_NSNumberCreation, NSNumber_NSDecimalNumberExtensions {
    override fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    public open fun initWithChar(value: Char): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithChar:", value) as NSNumber

    public open fun initWithUnsignedChar(value: Byte): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithUnsignedChar:", value) as NSNumber

    public open fun initWithShort(value: Short): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithShort:", value) as NSNumber

    public open fun initWithUnsignedShort(value: Short): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithUnsignedShort:", value) as NSNumber

    public open fun initWithInt(value: Int): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithInt:", value) as NSNumber

    public open fun initWithUnsignedInt(value: Int): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithUnsignedInt:", value) as NSNumber

    public open fun initWithLong(value: Int): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithLong:", value) as NSNumber

    public open fun initWithUnsignedLong(value: Int): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithUnsignedLong:", value) as NSNumber

    public open fun initWithLongLong(value: Long): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithLongLong:", value) as NSNumber

    public open fun initWithUnsignedLongLong(value: Long): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithUnsignedLongLong:", value) as NSNumber

    public open fun initWithFloat(value: Float): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithFloat:", value) as NSNumber

    public open fun initWithDouble(value: Double): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithDouble:", value) as NSNumber

    public open fun initWithBool(value: Boolean): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithBool:", value) as NSNumber

    public open fun initWithInteger(value: Int): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithInteger:", value) as NSNumber

    public open fun initWithUnsignedInteger(value: Int): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "initWithUnsignedInteger:", value) as NSNumber

    public open fun charValue(): Char =
        Native.objc_msgSend("char", this, "charValue") as Char

    public open fun unsignedCharValue(): Byte =
        Native.objc_msgSend("class objc.Byte", this, "unsignedCharValue") as Byte

    public open fun shortValue(): Short =
        Native.objc_msgSend("short", this, "shortValue") as Short

    public open fun unsignedShortValue(): Short =
        Native.objc_msgSend("short", this, "unsignedShortValue") as Short

    public open fun intValue(): Int =
        Native.objc_msgSend("int", this, "intValue") as Int

    public open fun unsignedIntValue(): Int =
        Native.objc_msgSend("int", this, "unsignedIntValue") as Int

    public open fun longValue(): Int =
        Native.objc_msgSend("int", this, "longValue") as Int

    public open fun unsignedLongValue(): Int =
        Native.objc_msgSend("int", this, "unsignedLongValue") as Int

    public open fun longLongValue(): Long =
        Native.objc_msgSend("long", this, "longLongValue") as Long

    public open fun unsignedLongLongValue(): Long =
        Native.objc_msgSend("long", this, "unsignedLongLongValue") as Long

    public open fun floatValue(): Float =
        Native.objc_msgSend("float", this, "floatValue") as Float

    public open fun doubleValue(): Double =
        Native.objc_msgSend("double", this, "doubleValue") as Double

    public open fun boolValue(): Boolean =
        Native.objc_msgSend("boolean", this, "boolValue") as Boolean

    public open fun integerValue(): Int =
        Native.objc_msgSend("int", this, "integerValue") as Int

    public open fun unsignedIntegerValue(): Int =
        Native.objc_msgSend("int", this, "unsignedIntegerValue") as Int

    public open fun stringValue(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringValue") as NSString

    public open fun compare(otherNumber: NSNumber): Any =
        Native.objc_msgSend("class objc.Any", this, "compare:", otherNumber)

    public open fun isEqualToNumber(number: NSNumber): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToNumber:", number) as Boolean

    public open fun descriptionWithLocale(locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:", locale) as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSValue.metaclass, NSNumber_NSNumberCreation.metaclass, NSNumber_NSDecimalNumberExtensions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSNumber")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSValue_NSValueCreation : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun valueWithBytes_objCType(value: Pointer<Unit>, type: Pointer<Char>): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "valueWithBytes:objCType:", value, type) as NSValue

        public open fun value_withObjCType(value: Pointer<Unit>, type: Pointer<Char>): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "value:withObjCType:", value, type) as NSValue
    }
}

trait NSValue_NSValueExtensionMethods : IObjCObject {
    public open fun nonretainedObjectValue(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "nonretainedObjectValue") as ObjCObject

    public open fun pointerValue(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "pointerValue") as Pointer<*>

    public open fun isEqualToValue(value: NSValue): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToValue:", value) as Boolean

    trait metaclass : IObjCObject {
        public open fun valueWithNonretainedObject(anObject: ObjCObject): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "valueWithNonretainedObject:", anObject) as NSValue

        public open fun valueWithPointer(pointer: Pointer<Unit>): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "valueWithPointer:", pointer) as NSValue
    }
}

trait NSNumber_NSNumberCreation : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun numberWithChar(value: Char): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithChar:", value) as NSNumber

        public open fun numberWithUnsignedChar(value: Byte): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithUnsignedChar:", value) as NSNumber

        public open fun numberWithShort(value: Short): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithShort:", value) as NSNumber

        public open fun numberWithUnsignedShort(value: Short): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithUnsignedShort:", value) as NSNumber

        public open fun numberWithInt(value: Int): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithInt:", value) as NSNumber

        public open fun numberWithUnsignedInt(value: Int): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithUnsignedInt:", value) as NSNumber

        public open fun numberWithLong(value: Int): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithLong:", value) as NSNumber

        public open fun numberWithUnsignedLong(value: Int): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithUnsignedLong:", value) as NSNumber

        public open fun numberWithLongLong(value: Long): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithLongLong:", value) as NSNumber

        public open fun numberWithUnsignedLongLong(value: Long): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithUnsignedLongLong:", value) as NSNumber

        public open fun numberWithFloat(value: Float): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithFloat:", value) as NSNumber

        public open fun numberWithDouble(value: Double): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithDouble:", value) as NSNumber

        public open fun numberWithBool(value: Boolean): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithBool:", value) as NSNumber

        public open fun numberWithInteger(value: Int): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithInteger:", value) as NSNumber

        public open fun numberWithUnsignedInteger(value: Int): NSNumber =
            Native.objc_msgSend("class objc.NSNumber", this, "numberWithUnsignedInteger:", value) as NSNumber
    }
}
