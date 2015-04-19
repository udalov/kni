// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSHashTable.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSHashTable(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSFastEnumeration {
    public open fun initWithOptions_capacity(options: Int, initialCapacity: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithOptions:capacity:", options, initialCapacity) as ObjCObject

    public open fun initWithPointerFunctions_capacity(functions: NSPointerFunctions, initialCapacity: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPointerFunctions:capacity:", functions, initialCapacity) as ObjCObject

    public open fun pointerFunctions(): NSPointerFunctions =
        Native.objc_msgSend("class objc.NSPointerFunctions", this, "pointerFunctions") as NSPointerFunctions

    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    public open fun member(`object`: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "member:", `object`) as ObjCObject

    public open fun objectEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "objectEnumerator") as NSEnumerator

    public open fun addObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObject:", `object`)
    }

    public open fun removeObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObject:", `object`)
    }

    public open fun removeAllObjects(): Unit {
        Native.objc_msgSend("void", this, "removeAllObjects")
    }

    public open fun allObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allObjects") as NSArray

    public open fun anyObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "anyObject") as ObjCObject

    public open fun containsObject(anObject: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "containsObject:", anObject) as Boolean

    public open fun intersectsHashTable(other: NSHashTable): Boolean =
        Native.objc_msgSend("boolean", this, "intersectsHashTable:", other) as Boolean

    public open fun isEqualToHashTable(other: NSHashTable): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToHashTable:", other) as Boolean

    public open fun isSubsetOfHashTable(other: NSHashTable): Boolean =
        Native.objc_msgSend("boolean", this, "isSubsetOfHashTable:", other) as Boolean

    public open fun intersectHashTable(other: NSHashTable): Unit {
        Native.objc_msgSend("void", this, "intersectHashTable:", other)
    }

    public open fun unionHashTable(other: NSHashTable): Unit {
        Native.objc_msgSend("void", this, "unionHashTable:", other)
    }

    public open fun minusHashTable(other: NSHashTable): Unit {
        Native.objc_msgSend("void", this, "minusHashTable:", other)
    }

    public open fun setRepresentation(): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "setRepresentation") as NSSet

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSFastEnumeration.metaclass {
        public open fun hashTableWithOptions(options: Int): NSHashTable =
            Native.objc_msgSend("class objc.NSHashTable", this, "hashTableWithOptions:", options) as NSHashTable

        public open fun hashTableWithWeakObjects(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "hashTableWithWeakObjects") as ObjCObject

        public open fun weakObjectsHashTable(): NSHashTable =
            Native.objc_msgSend("class objc.NSHashTable", this, "weakObjectsHashTable") as NSHashTable

    }

    companion object : NSObject(Native.objc_getClass("NSHashTable")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
