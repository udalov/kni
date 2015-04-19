// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSKeyValueCoding.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSObject_NSKeyValueCoding : IObjCObject {
    public open fun valueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKey:", key) as ObjCObject

    public open fun setValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forKey:", value, key)
    }

    public open fun validateValue_forKey_error(ioValue: Pointer<ObjCObject>, inKey: NSString, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "validateValue:forKey:error:", ioValue, inKey, outError) as Boolean

    public open fun mutableArrayValueForKey(key: NSString): NSMutableArray =
        Native.objc_msgSend("class objc.NSMutableArray", this, "mutableArrayValueForKey:", key) as NSMutableArray

    public open fun mutableOrderedSetValueForKey(key: NSString): NSMutableOrderedSet =
        Native.objc_msgSend("class objc.NSMutableOrderedSet", this, "mutableOrderedSetValueForKey:", key) as NSMutableOrderedSet

    public open fun mutableSetValueForKey(key: NSString): NSMutableSet =
        Native.objc_msgSend("class objc.NSMutableSet", this, "mutableSetValueForKey:", key) as NSMutableSet

    public open fun valueForKeyPath(keyPath: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKeyPath:", keyPath) as ObjCObject

    public open fun setValue_forKeyPath(value: ObjCObject, keyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forKeyPath:", value, keyPath)
    }

    public open fun validateValue_forKeyPath_error(ioValue: Pointer<ObjCObject>, inKeyPath: NSString, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "validateValue:forKeyPath:error:", ioValue, inKeyPath, outError) as Boolean

    public open fun mutableArrayValueForKeyPath(keyPath: NSString): NSMutableArray =
        Native.objc_msgSend("class objc.NSMutableArray", this, "mutableArrayValueForKeyPath:", keyPath) as NSMutableArray

    public open fun mutableOrderedSetValueForKeyPath(keyPath: NSString): NSMutableOrderedSet =
        Native.objc_msgSend("class objc.NSMutableOrderedSet", this, "mutableOrderedSetValueForKeyPath:", keyPath) as NSMutableOrderedSet

    public open fun mutableSetValueForKeyPath(keyPath: NSString): NSMutableSet =
        Native.objc_msgSend("class objc.NSMutableSet", this, "mutableSetValueForKeyPath:", keyPath) as NSMutableSet

    public open fun valueForUndefinedKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForUndefinedKey:", key) as ObjCObject

    public open fun setValue_forUndefinedKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forUndefinedKey:", value, key)
    }

    public open fun setNilValueForKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setNilValueForKey:", key)
    }

    public open fun dictionaryWithValuesForKeys(keys: NSArray): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "dictionaryWithValuesForKeys:", keys) as NSDictionary

    public open fun setValuesForKeysWithDictionary(keyedValues: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setValuesForKeysWithDictionary:", keyedValues)
    }

    trait metaclass : IObjCObject {
        public open fun accessInstanceVariablesDirectly(): Boolean =
            Native.objc_msgSend("boolean", this, "accessInstanceVariablesDirectly") as Boolean
    }
}

trait NSArray_NSKeyValueCoding : IObjCObject {
    public open fun valueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKey:", key) as ObjCObject

    public open fun setValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forKey:", value, key)
    }

    trait metaclass : IObjCObject
}

trait NSDictionary_NSKeyValueCoding : IObjCObject {
    public open fun valueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKey:", key) as ObjCObject

    trait metaclass : IObjCObject
}

trait NSMutableDictionary_NSKeyValueCoding : IObjCObject {
    public open fun setValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forKey:", value, key)
    }

    trait metaclass : IObjCObject
}

trait NSOrderedSet_NSKeyValueCoding : IObjCObject {
    public open fun valueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKey:", key) as ObjCObject

    public open fun setValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forKey:", value, key)
    }

    trait metaclass : IObjCObject
}

trait NSSet_NSKeyValueCoding : IObjCObject {
    public open fun valueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKey:", key) as ObjCObject

    public open fun setValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forKey:", value, key)
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSDeprecatedKeyValueCoding : IObjCObject {
    public open fun storedValueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "storedValueForKey:", key) as ObjCObject

    public open fun takeStoredValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "takeStoredValue:forKey:", value, key)
    }

    public open fun takeValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "takeValue:forKey:", value, key)
    }

    public open fun takeValue_forKeyPath(value: ObjCObject, keyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "takeValue:forKeyPath:", value, keyPath)
    }

    public open fun handleQueryWithUnboundKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "handleQueryWithUnboundKey:", key) as ObjCObject

    public open fun handleTakeValue_forUnboundKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "handleTakeValue:forUnboundKey:", value, key)
    }

    public open fun unableToSetNilForKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "unableToSetNilForKey:", key)
    }

    public open fun valuesForKeys(keys: NSArray): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "valuesForKeys:", keys) as NSDictionary

    public open fun takeValuesFromDictionary(properties: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "takeValuesFromDictionary:", properties)
    }

    trait metaclass : IObjCObject {
        public open fun useStoredAccessor(): Boolean =
            Native.objc_msgSend("boolean", this, "useStoredAccessor") as Boolean
    }
}
