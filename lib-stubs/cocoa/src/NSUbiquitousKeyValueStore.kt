// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSUbiquitousKeyValueStore.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSUbiquitousKeyValueStore(pointer: Long) : NSObject(pointer) {
    public open fun objectForKey(aKey: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForKey:", aKey) as ObjCObject

    public open fun setObject_forKey(anObject: ObjCObject, aKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setObject:forKey:", anObject, aKey)
    }

    public open fun removeObjectForKey(aKey: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObjectForKey:", aKey)
    }

    public open fun stringForKey(aKey: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringForKey:", aKey) as NSString

    public open fun arrayForKey(aKey: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "arrayForKey:", aKey) as NSArray

    public open fun dictionaryForKey(aKey: NSString): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "dictionaryForKey:", aKey) as NSDictionary

    public open fun dataForKey(aKey: NSString): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataForKey:", aKey) as NSData

    public open fun longLongForKey(aKey: NSString): Long =
        Native.objc_msgSend("long", this, "longLongForKey:", aKey) as Long

    public open fun doubleForKey(aKey: NSString): Double =
        Native.objc_msgSend("double", this, "doubleForKey:", aKey) as Double

    public open fun boolForKey(aKey: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "boolForKey:", aKey) as Boolean

    public open fun setString_forKey(aString: NSString, aKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setString:forKey:", aString, aKey)
    }

    public open fun setData_forKey(aData: NSData, aKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setData:forKey:", aData, aKey)
    }

    public open fun setArray_forKey(anArray: NSArray, aKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setArray:forKey:", anArray, aKey)
    }

    public open fun setDictionary_forKey(aDictionary: NSDictionary, aKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setDictionary:forKey:", aDictionary, aKey)
    }

    public open fun setLongLong_forKey(value: Long, aKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setLongLong:forKey:", value, aKey)
    }

    public open fun setDouble_forKey(value: Double, aKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setDouble:forKey:", value, aKey)
    }

    public open fun setBool_forKey(value: Boolean, aKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setBool:forKey:", value, aKey)
    }

    public open fun dictionaryRepresentation(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "dictionaryRepresentation") as NSDictionary

    public open fun synchronize(): Boolean =
        Native.objc_msgSend("boolean", this, "synchronize") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun defaultStore(): NSUbiquitousKeyValueStore =
            Native.objc_msgSend("class objc.NSUbiquitousKeyValueStore", this, "defaultStore") as NSUbiquitousKeyValueStore

    }

    companion object : NSObject(Native.objc_getClass("NSUbiquitousKeyValueStore")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
