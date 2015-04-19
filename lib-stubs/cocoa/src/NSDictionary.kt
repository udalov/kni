// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSDictionary.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDictionary(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration, NSDictionary_NSExtendedDictionary, NSDictionary_NSDictionaryCreation, NSDictionary_NSSharedKeySetDictionary, NSDictionary_NSFileAttributes, NSDictionary_NSKeyValueCoding {
    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    public open fun objectForKey(aKey: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForKey:", aKey) as ObjCObject

    public open fun keyEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "keyEnumerator") as NSEnumerator

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithObjects_forKeys_count(objects: Any, keys: Any, cnt: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithObjects:forKeys:count:", objects, keys, cnt) as ObjCObject

    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun valueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKey:", key) as ObjCObject

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSSecureCoding.metaclass, NSFastEnumeration.metaclass, NSDictionary_NSExtendedDictionary.metaclass, NSDictionary_NSDictionaryCreation.metaclass, NSDictionary_NSSharedKeySetDictionary.metaclass, NSDictionary_NSFileAttributes.metaclass, NSDictionary_NSKeyValueCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDictionary")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableDictionary(pointer: Long) : NSDictionary(pointer), NSMutableDictionary_NSExtendedMutableDictionary, NSMutableDictionary_NSMutableDictionaryCreation, NSMutableDictionary_NSSharedKeySetDictionary, NSMutableDictionary_NSKeyValueCoding {
    public open fun removeObjectForKey(aKey: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObjectForKey:", aKey)
    }

    public open fun setObject_forKey(anObject: ObjCObject, aKey: Any): Unit {
        Native.objc_msgSend("void", this, "setObject:forKey:", anObject, aKey)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithCapacity(numItems: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCapacity:", numItems) as ObjCObject

    override fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun initWithContentsOfFile(path: NSString): NSMutableDictionary =
        Native.objc_msgSend("class objc.NSMutableDictionary", this, "initWithContentsOfFile:", path) as NSMutableDictionary

    override fun initWithContentsOfURL(url: NSURL): NSMutableDictionary =
        Native.objc_msgSend("class objc.NSMutableDictionary", this, "initWithContentsOfURL:", url) as NSMutableDictionary

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forKey:", value, key)
    }

    override fun valueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKey:", key) as ObjCObject

    trait metaclass : NSDictionary.metaclass, NSMutableDictionary_NSExtendedMutableDictionary.metaclass, NSMutableDictionary_NSMutableDictionaryCreation.metaclass, NSMutableDictionary_NSSharedKeySetDictionary.metaclass, NSMutableDictionary_NSKeyValueCoding.metaclass {
        override fun dictionaryWithContentsOfFile(path: NSString): NSMutableDictionary =
            Native.objc_msgSend("class objc.NSMutableDictionary", this, "dictionaryWithContentsOfFile:", path) as NSMutableDictionary

        override fun dictionaryWithContentsOfURL(url: NSURL): NSMutableDictionary =
            Native.objc_msgSend("class objc.NSMutableDictionary", this, "dictionaryWithContentsOfURL:", url) as NSMutableDictionary

    }

    companion object : NSObject(Native.objc_getClass("NSMutableDictionary")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSDictionary_NSExtendedDictionary : IObjCObject {
    public open fun allKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allKeys") as NSArray

    public open fun allKeysForObject(anObject: ObjCObject): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allKeysForObject:", anObject) as NSArray

    public open fun allValues(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allValues") as NSArray

    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun descriptionInStringsFileFormat(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionInStringsFileFormat") as NSString

    public open fun descriptionWithLocale(locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:", locale) as NSString

    public open fun descriptionWithLocale_indent(locale: ObjCObject, level: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:indent:", locale, level) as NSString

    public open fun isEqualToDictionary(otherDictionary: NSDictionary): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToDictionary:", otherDictionary) as Boolean

    public open fun objectEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "objectEnumerator") as NSEnumerator

    public open fun objectsForKeys_notFoundMarker(keys: NSArray, marker: ObjCObject): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "objectsForKeys:notFoundMarker:", keys, marker) as NSArray

    public open fun writeToFile_atomically(path: NSString, useAuxiliaryFile: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:atomically:", path, useAuxiliaryFile) as Boolean

    public open fun writeToURL_atomically(url: NSURL, atomically: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:atomically:", url, atomically) as Boolean

    public open fun keysSortedByValueUsingSelector(comparator: ObjCSelector): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "keysSortedByValueUsingSelector:", comparator) as NSArray

    public open fun getObjects_andKeys(objects: Any, keys: Any): Unit {
        Native.objc_msgSend("void", this, "getObjects:andKeys:", objects, keys)
    }

    public open fun objectForKeyedSubscript(key: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForKeyedSubscript:", key) as ObjCObject

    public open fun enumerateKeysAndObjectsUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateKeysAndObjectsUsingBlock:", block)
    }

    public open fun enumerateKeysAndObjectsWithOptions_usingBlock(opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateKeysAndObjectsWithOptions:usingBlock:", opts, block)
    }

    public open fun keysSortedByValueUsingComparator(cmptr: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "keysSortedByValueUsingComparator:", cmptr) as NSArray

    public open fun keysSortedByValueWithOptions_usingComparator(opts: Any, cmptr: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "keysSortedByValueWithOptions:usingComparator:", opts, cmptr) as NSArray

    public open fun keysOfEntriesPassingTest(predicate: Any): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "keysOfEntriesPassingTest:", predicate) as NSSet

    public open fun keysOfEntriesWithOptions_passingTest(opts: Any, predicate: Any): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "keysOfEntriesWithOptions:passingTest:", opts, predicate) as NSSet

    trait metaclass : IObjCObject
}

trait NSDictionary_NSDictionaryCreation : IObjCObject {
    public open fun initWithObjectsAndKeys(firstObject: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithObjectsAndKeys:", firstObject) as ObjCObject

    public open fun initWithDictionary(otherDictionary: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDictionary:", otherDictionary) as ObjCObject

    public open fun initWithDictionary_copyItems(otherDictionary: NSDictionary, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDictionary:copyItems:", otherDictionary, flag) as ObjCObject

    public open fun initWithObjects_forKeys(objects: NSArray, keys: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithObjects:forKeys:", objects, keys) as ObjCObject

    public open fun initWithContentsOfFile(path: NSString): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "initWithContentsOfFile:", path) as NSDictionary

    public open fun initWithContentsOfURL(url: NSURL): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "initWithContentsOfURL:", url) as NSDictionary

    trait metaclass : IObjCObject {
        public open fun dictionary(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dictionary") as ObjCObject

        public open fun dictionaryWithObject_forKey(`object`: ObjCObject, key: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dictionaryWithObject:forKey:", `object`, key) as ObjCObject

        public open fun dictionaryWithObjects_forKeys_count(objects: Any, keys: Any, cnt: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dictionaryWithObjects:forKeys:count:", objects, keys, cnt) as ObjCObject

        public open fun dictionaryWithObjectsAndKeys(firstObject: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dictionaryWithObjectsAndKeys:", firstObject) as ObjCObject

        public open fun dictionaryWithDictionary(dict: NSDictionary): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dictionaryWithDictionary:", dict) as ObjCObject

        public open fun dictionaryWithObjects_forKeys(objects: NSArray, keys: NSArray): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dictionaryWithObjects:forKeys:", objects, keys) as ObjCObject

        public open fun dictionaryWithContentsOfFile(path: NSString): NSDictionary =
            Native.objc_msgSend("class objc.NSDictionary", this, "dictionaryWithContentsOfFile:", path) as NSDictionary

        public open fun dictionaryWithContentsOfURL(url: NSURL): NSDictionary =
            Native.objc_msgSend("class objc.NSDictionary", this, "dictionaryWithContentsOfURL:", url) as NSDictionary
    }
}

trait NSMutableDictionary_NSExtendedMutableDictionary : IObjCObject {
    public open fun addEntriesFromDictionary(otherDictionary: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "addEntriesFromDictionary:", otherDictionary)
    }

    public open fun removeAllObjects(): Unit {
        Native.objc_msgSend("void", this, "removeAllObjects")
    }

    public open fun removeObjectsForKeys(keyArray: NSArray): Unit {
        Native.objc_msgSend("void", this, "removeObjectsForKeys:", keyArray)
    }

    public open fun setDictionary(otherDictionary: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setDictionary:", otherDictionary)
    }

    public open fun setObject_forKeyedSubscript(obj: ObjCObject, key: Any): Unit {
        Native.objc_msgSend("void", this, "setObject:forKeyedSubscript:", obj, key)
    }

    trait metaclass : IObjCObject
}

trait NSMutableDictionary_NSMutableDictionaryCreation : IObjCObject {
    public open fun initWithContentsOfFile(path: NSString): NSMutableDictionary =
        Native.objc_msgSend("class objc.NSMutableDictionary", this, "initWithContentsOfFile:", path) as NSMutableDictionary

    public open fun initWithContentsOfURL(url: NSURL): NSMutableDictionary =
        Native.objc_msgSend("class objc.NSMutableDictionary", this, "initWithContentsOfURL:", url) as NSMutableDictionary

    trait metaclass : IObjCObject {
        public open fun dictionaryWithCapacity(numItems: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dictionaryWithCapacity:", numItems) as ObjCObject

        public open fun dictionaryWithContentsOfFile(path: NSString): NSMutableDictionary =
            Native.objc_msgSend("class objc.NSMutableDictionary", this, "dictionaryWithContentsOfFile:", path) as NSMutableDictionary

        public open fun dictionaryWithContentsOfURL(url: NSURL): NSMutableDictionary =
            Native.objc_msgSend("class objc.NSMutableDictionary", this, "dictionaryWithContentsOfURL:", url) as NSMutableDictionary
    }
}

trait NSDictionary_NSSharedKeySetDictionary : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun sharedKeySetForKeys(keys: NSArray): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sharedKeySetForKeys:", keys) as ObjCObject
    }
}

trait NSMutableDictionary_NSSharedKeySetDictionary : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun dictionaryWithSharedKeySet(keyset: ObjCObject): NSMutableDictionary =
            Native.objc_msgSend("class objc.NSMutableDictionary", this, "dictionaryWithSharedKeySet:", keyset) as NSMutableDictionary
    }
}
