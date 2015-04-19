// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSCoder.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCoder(pointer: Long) : NSObject(pointer), NSCoder_NSExtendedCoder, NSCoder_NSTypedstreamCompatibility, NSCoder_NSGeometryCoding, NSCoder_NSGeometryKeyedCoding, NSCoder_NSAppKitColorExtensions {
    public open fun encodeValueOfObjCType_at(type: Pointer<Char>, addr: Pointer<Unit>): Unit {
        Native.objc_msgSend("void", this, "encodeValueOfObjCType:at:", type, addr)
    }

    public open fun encodeDataObject(data: NSData): Unit {
        Native.objc_msgSend("void", this, "encodeDataObject:", data)
    }

    public open fun decodeValueOfObjCType_at(type: Pointer<Char>, data: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "decodeValueOfObjCType:at:", type, data)
    }

    public open fun decodeDataObject(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "decodeDataObject") as NSData

    public open fun versionForClassName(className: NSString): Int =
        Native.objc_msgSend("int", this, "versionForClassName:", className) as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoder_NSExtendedCoder.metaclass, NSCoder_NSTypedstreamCompatibility.metaclass, NSCoder_NSGeometryCoding.metaclass, NSCoder_NSGeometryKeyedCoding.metaclass, NSCoder_NSAppKitColorExtensions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCoder")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSCoder_NSExtendedCoder : IObjCObject {
    public open fun encodeObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "encodeObject:", `object`)
    }

    public open fun encodeRootObject(rootObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "encodeRootObject:", rootObject)
    }

    public open fun encodeBycopyObject(anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "encodeBycopyObject:", anObject)
    }

    public open fun encodeByrefObject(anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "encodeByrefObject:", anObject)
    }

    public open fun encodeConditionalObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "encodeConditionalObject:", `object`)
    }

    public open fun encodeValuesOfObjCTypes(types: Pointer<Char>): Unit {
        Native.objc_msgSend("void", this, "encodeValuesOfObjCTypes:", types)
    }

    public open fun encodeArrayOfObjCType_count_at(type: Pointer<Char>, count: Int, array: Pointer<Unit>): Unit {
        Native.objc_msgSend("void", this, "encodeArrayOfObjCType:count:at:", type, count, array)
    }

    public open fun encodeBytes_length(byteaddr: Pointer<Unit>, length: Int): Unit {
        Native.objc_msgSend("void", this, "encodeBytes:length:", byteaddr, length)
    }

    public open fun decodeObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "decodeObject") as ObjCObject

    public open fun decodeValuesOfObjCTypes(types: Pointer<Char>): Unit {
        Native.objc_msgSend("void", this, "decodeValuesOfObjCTypes:", types)
    }

    public open fun decodeArrayOfObjCType_count_at(itemType: Pointer<Char>, count: Int, array: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "decodeArrayOfObjCType:count:at:", itemType, count, array)
    }

    public open fun decodeBytesWithReturnedLength(lengthp: Pointer<Int>): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "decodeBytesWithReturnedLength:", lengthp) as Pointer<*>

    public open fun encodePropertyList(aPropertyList: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "encodePropertyList:", aPropertyList)
    }

    public open fun decodePropertyList(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "decodePropertyList") as ObjCObject

    public open fun setObjectZone(zone: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "setObjectZone:", zone)
    }

    public open fun objectZone(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "objectZone") as Pointer<Any>

    public open fun systemVersion(): Int =
        Native.objc_msgSend("int", this, "systemVersion") as Int

    public open fun allowsKeyedCoding(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsKeyedCoding") as Boolean

    public open fun encodeObject_forKey(objv: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeObject:forKey:", objv, key)
    }

    public open fun encodeConditionalObject_forKey(objv: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeConditionalObject:forKey:", objv, key)
    }

    public open fun encodeBool_forKey(boolv: Boolean, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeBool:forKey:", boolv, key)
    }

    public open fun encodeInt_forKey(intv: Int, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeInt:forKey:", intv, key)
    }

    public open fun encodeInt32_forKey(intv: Int, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeInt32:forKey:", intv, key)
    }

    public open fun encodeInt64_forKey(intv: Long, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeInt64:forKey:", intv, key)
    }

    public open fun encodeFloat_forKey(realv: Float, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeFloat:forKey:", realv, key)
    }

    public open fun encodeDouble_forKey(realv: Double, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeDouble:forKey:", realv, key)
    }

    public open fun encodeBytes_length_forKey(bytesp: Pointer<Byte>, lenv: Int, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeBytes:length:forKey:", bytesp, lenv, key)
    }

    public open fun containsValueForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "containsValueForKey:", key) as Boolean

    public open fun decodeObjectForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "decodeObjectForKey:", key) as ObjCObject

    public open fun decodeBoolForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "decodeBoolForKey:", key) as Boolean

    public open fun decodeIntForKey(key: NSString): Int =
        Native.objc_msgSend("int", this, "decodeIntForKey:", key) as Int

    public open fun decodeInt32ForKey(key: NSString): Int =
        Native.objc_msgSend("int", this, "decodeInt32ForKey:", key) as Int

    public open fun decodeInt64ForKey(key: NSString): Long =
        Native.objc_msgSend("long", this, "decodeInt64ForKey:", key) as Long

    public open fun decodeFloatForKey(key: NSString): Float =
        Native.objc_msgSend("float", this, "decodeFloatForKey:", key) as Float

    public open fun decodeDoubleForKey(key: NSString): Double =
        Native.objc_msgSend("double", this, "decodeDoubleForKey:", key) as Double

    public open fun decodeBytesForKey_returnedLength(key: NSString, lengthp: Pointer<Int>): Pointer<Byte> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "decodeBytesForKey:returnedLength:", key, lengthp) as Pointer<Byte>

    public open fun encodeInteger_forKey(intv: Int, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeInteger:forKey:", intv, key)
    }

    public open fun decodeIntegerForKey(key: NSString): Int =
        Native.objc_msgSend("int", this, "decodeIntegerForKey:", key) as Int

    public open fun requiresSecureCoding(): Boolean =
        Native.objc_msgSend("boolean", this, "requiresSecureCoding") as Boolean

    public open fun decodeObjectOfClass_forKey(aClass: ObjCClass, key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "decodeObjectOfClass:forKey:", aClass, key) as ObjCObject

    public open fun decodeObjectOfClasses_forKey(classes: NSSet, key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "decodeObjectOfClasses:forKey:", classes, key) as ObjCObject

    public open fun decodePropertyListForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "decodePropertyListForKey:", key) as ObjCObject

    public open fun allowedClasses(): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "allowedClasses") as NSSet

    trait metaclass : IObjCObject
}

trait NSCoder_NSTypedstreamCompatibility : IObjCObject {
    public open fun encodeNXObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "encodeNXObject:", `object`)
    }

    public open fun decodeNXObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "decodeNXObject") as ObjCObject

    trait metaclass : IObjCObject
}
