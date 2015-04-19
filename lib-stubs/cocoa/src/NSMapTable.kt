// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSMapTable.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSMapTable(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSFastEnumeration {
    public open fun initWithKeyOptions_valueOptions_capacity(keyOptions: Int, valueOptions: Int, initialCapacity: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKeyOptions:valueOptions:capacity:", keyOptions, valueOptions, initialCapacity) as ObjCObject

    public open fun initWithKeyPointerFunctions_valuePointerFunctions_capacity(keyFunctions: NSPointerFunctions, valueFunctions: NSPointerFunctions, initialCapacity: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKeyPointerFunctions:valuePointerFunctions:capacity:", keyFunctions, valueFunctions, initialCapacity) as ObjCObject

    public open fun keyPointerFunctions(): NSPointerFunctions =
        Native.objc_msgSend("class objc.NSPointerFunctions", this, "keyPointerFunctions") as NSPointerFunctions

    public open fun valuePointerFunctions(): NSPointerFunctions =
        Native.objc_msgSend("class objc.NSPointerFunctions", this, "valuePointerFunctions") as NSPointerFunctions

    public open fun objectForKey(aKey: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForKey:", aKey) as ObjCObject

    public open fun removeObjectForKey(aKey: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObjectForKey:", aKey)
    }

    public open fun setObject_forKey(anObject: ObjCObject, aKey: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setObject:forKey:", anObject, aKey)
    }

    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    public open fun keyEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "keyEnumerator") as NSEnumerator

    public open fun objectEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "objectEnumerator") as NSEnumerator

    public open fun removeAllObjects(): Unit {
        Native.objc_msgSend("void", this, "removeAllObjects")
    }

    public open fun dictionaryRepresentation(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "dictionaryRepresentation") as NSDictionary

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSFastEnumeration.metaclass {
        public open fun mapTableWithKeyOptions_valueOptions(keyOptions: Int, valueOptions: Int): NSMapTable =
            Native.objc_msgSend("class objc.NSMapTable", this, "mapTableWithKeyOptions:valueOptions:", keyOptions, valueOptions) as NSMapTable

        public open fun mapTableWithStrongToStrongObjects(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "mapTableWithStrongToStrongObjects") as ObjCObject

        public open fun mapTableWithWeakToStrongObjects(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "mapTableWithWeakToStrongObjects") as ObjCObject

        public open fun mapTableWithStrongToWeakObjects(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "mapTableWithStrongToWeakObjects") as ObjCObject

        public open fun mapTableWithWeakToWeakObjects(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "mapTableWithWeakToWeakObjects") as ObjCObject

        public open fun strongToStrongObjectsMapTable(): NSMapTable =
            Native.objc_msgSend("class objc.NSMapTable", this, "strongToStrongObjectsMapTable") as NSMapTable

        public open fun weakToStrongObjectsMapTable(): NSMapTable =
            Native.objc_msgSend("class objc.NSMapTable", this, "weakToStrongObjectsMapTable") as NSMapTable

        public open fun strongToWeakObjectsMapTable(): NSMapTable =
            Native.objc_msgSend("class objc.NSMapTable", this, "strongToWeakObjectsMapTable") as NSMapTable

        public open fun weakToWeakObjectsMapTable(): NSMapTable =
            Native.objc_msgSend("class objc.NSMapTable", this, "weakToWeakObjectsMapTable") as NSMapTable

    }

    companion object : NSObject(Native.objc_getClass("NSMapTable")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
