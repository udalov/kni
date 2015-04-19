// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSOrderedSet.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSOrderedSet(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration, NSOrderedSet_NSExtendedOrderedSet, NSOrderedSet_NSOrderedSetCreation, NSOrderedSet_NSKeyValueCoding, NSOrderedSet_NSKeyValueObserverRegistration, NSOrderedSet_NSKeyValueSorting, NSOrderedSet_NSPredicateSupport {
    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    public open fun objectAtIndex(idx: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectAtIndex:", idx) as ObjCObject

    public open fun indexOfObject(`object`: ObjCObject): Int =
        Native.objc_msgSend("int", this, "indexOfObject:", `object`) as Int

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithObjects_count(objects: Any, cnt: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithObjects:count:", objects, cnt) as ObjCObject

    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun addObserver_forKeyPath_options_context(observer: NSObject, keyPath: NSString, options: Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addObserver:forKeyPath:options:context:", observer, keyPath, options, context)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun removeObserver_forKeyPath(observer: NSObject, keyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:", observer, keyPath)
    }

    override fun removeObserver_forKeyPath_context(observer: NSObject, keyPath: NSString, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:context:", observer, keyPath, context)
    }

    override fun setValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forKey:", value, key)
    }

    override fun valueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKey:", key) as ObjCObject

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSSecureCoding.metaclass, NSFastEnumeration.metaclass, NSOrderedSet_NSExtendedOrderedSet.metaclass, NSOrderedSet_NSOrderedSetCreation.metaclass, NSOrderedSet_NSKeyValueCoding.metaclass, NSOrderedSet_NSKeyValueObserverRegistration.metaclass, NSOrderedSet_NSKeyValueSorting.metaclass, NSOrderedSet_NSPredicateSupport.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSOrderedSet")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableOrderedSet(pointer: Long) : NSOrderedSet(pointer), NSMutableOrderedSet_NSExtendedMutableOrderedSet, NSMutableOrderedSet_NSMutableOrderedSetCreation, NSMutableOrderedSet_NSKeyValueSorting, NSMutableOrderedSet_NSPredicateSupport {
    public open fun insertObject_atIndex(`object`: ObjCObject, idx: Int): Unit {
        Native.objc_msgSend("void", this, "insertObject:atIndex:", `object`, idx)
    }

    public open fun removeObjectAtIndex(idx: Int): Unit {
        Native.objc_msgSend("void", this, "removeObjectAtIndex:", idx)
    }

    public open fun replaceObjectAtIndex_withObject(idx: Int, `object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "replaceObjectAtIndex:withObject:", idx, `object`)
    }

    override fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithCapacity(numItems: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCapacity:", numItems) as ObjCObject

    override fun addObserver_forKeyPath_options_context(observer: NSObject, keyPath: NSString, options: Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addObserver:forKeyPath:options:context:", observer, keyPath, options, context)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun removeObserver_forKeyPath(observer: NSObject, keyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:", observer, keyPath)
    }

    override fun removeObserver_forKeyPath_context(observer: NSObject, keyPath: NSString, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:context:", observer, keyPath, context)
    }

    override fun setValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forKey:", value, key)
    }

    override fun valueForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForKey:", key) as ObjCObject

    trait metaclass : NSOrderedSet.metaclass, NSMutableOrderedSet_NSExtendedMutableOrderedSet.metaclass, NSMutableOrderedSet_NSMutableOrderedSetCreation.metaclass, NSMutableOrderedSet_NSKeyValueSorting.metaclass, NSMutableOrderedSet_NSPredicateSupport.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMutableOrderedSet")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSOrderedSet_NSExtendedOrderedSet : IObjCObject {
    public open fun getObjects_range(objects: Any, range: Any): Unit {
        Native.objc_msgSend("void", this, "getObjects:range:", objects, range)
    }

    public open fun objectsAtIndexes(indexes: NSIndexSet): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "objectsAtIndexes:", indexes) as NSArray

    public open fun firstObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "firstObject") as ObjCObject

    public open fun lastObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "lastObject") as ObjCObject

    public open fun isEqualToOrderedSet(other: NSOrderedSet): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToOrderedSet:", other) as Boolean

    public open fun containsObject(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "containsObject:", `object`) as Boolean

    public open fun intersectsOrderedSet(other: NSOrderedSet): Boolean =
        Native.objc_msgSend("boolean", this, "intersectsOrderedSet:", other) as Boolean

    public open fun intersectsSet(set: NSSet): Boolean =
        Native.objc_msgSend("boolean", this, "intersectsSet:", set) as Boolean

    public open fun isSubsetOfOrderedSet(other: NSOrderedSet): Boolean =
        Native.objc_msgSend("boolean", this, "isSubsetOfOrderedSet:", other) as Boolean

    public open fun isSubsetOfSet(set: NSSet): Boolean =
        Native.objc_msgSend("boolean", this, "isSubsetOfSet:", set) as Boolean

    public open fun objectAtIndexedSubscript(idx: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectAtIndexedSubscript:", idx) as ObjCObject

    public open fun objectEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "objectEnumerator") as NSEnumerator

    public open fun reverseObjectEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "reverseObjectEnumerator") as NSEnumerator

    public open fun reversedOrderedSet(): NSOrderedSet =
        Native.objc_msgSend("class objc.NSOrderedSet", this, "reversedOrderedSet") as NSOrderedSet

    public open fun array(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "array") as NSArray

    public open fun set(): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "set") as NSSet

    public open fun enumerateObjectsUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateObjectsUsingBlock:", block)
    }

    public open fun enumerateObjectsWithOptions_usingBlock(opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateObjectsWithOptions:usingBlock:", opts, block)
    }

    public open fun enumerateObjectsAtIndexes_options_usingBlock(s: NSIndexSet, opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateObjectsAtIndexes:options:usingBlock:", s, opts, block)
    }

    public open fun indexOfObjectPassingTest(predicate: Any): Int =
        Native.objc_msgSend("int", this, "indexOfObjectPassingTest:", predicate) as Int

    public open fun indexOfObjectWithOptions_passingTest(opts: Any, predicate: Any): Int =
        Native.objc_msgSend("int", this, "indexOfObjectWithOptions:passingTest:", opts, predicate) as Int

    public open fun indexOfObjectAtIndexes_options_passingTest(s: NSIndexSet, opts: Any, predicate: Any): Int =
        Native.objc_msgSend("int", this, "indexOfObjectAtIndexes:options:passingTest:", s, opts, predicate) as Int

    public open fun indexesOfObjectsPassingTest(predicate: Any): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "indexesOfObjectsPassingTest:", predicate) as NSIndexSet

    public open fun indexesOfObjectsWithOptions_passingTest(opts: Any, predicate: Any): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "indexesOfObjectsWithOptions:passingTest:", opts, predicate) as NSIndexSet

    public open fun indexesOfObjectsAtIndexes_options_passingTest(s: NSIndexSet, opts: Any, predicate: Any): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "indexesOfObjectsAtIndexes:options:passingTest:", s, opts, predicate) as NSIndexSet

    public open fun indexOfObject_inSortedRange_options_usingComparator(`object`: ObjCObject, range: Any, opts: Any, cmp: Any): Int =
        Native.objc_msgSend("int", this, "indexOfObject:inSortedRange:options:usingComparator:", `object`, range, opts, cmp) as Int

    public open fun sortedArrayUsingComparator(cmptr: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayUsingComparator:", cmptr) as NSArray

    public open fun sortedArrayWithOptions_usingComparator(opts: Any, cmptr: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayWithOptions:usingComparator:", opts, cmptr) as NSArray

    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun descriptionWithLocale(locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:", locale) as NSString

    public open fun descriptionWithLocale_indent(locale: ObjCObject, level: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:indent:", locale, level) as NSString

    trait metaclass : IObjCObject
}

trait NSOrderedSet_NSOrderedSetCreation : IObjCObject {
    public open fun initWithObject(`object`: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithObject:", `object`) as ObjCObject

    public open fun initWithObjects(firstObj: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithObjects:", firstObj) as ObjCObject

    public open fun initWithOrderedSet(set: NSOrderedSet): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithOrderedSet:", set) as ObjCObject

    public open fun initWithOrderedSet_copyItems(set: NSOrderedSet, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithOrderedSet:copyItems:", set, flag) as ObjCObject

    public open fun initWithOrderedSet_range_copyItems(set: NSOrderedSet, range: Any, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithOrderedSet:range:copyItems:", set, range, flag) as ObjCObject

    public open fun initWithArray(array: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithArray:", array) as ObjCObject

    public open fun initWithArray_copyItems(set: NSArray, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithArray:copyItems:", set, flag) as ObjCObject

    public open fun initWithArray_range_copyItems(set: NSArray, range: Any, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithArray:range:copyItems:", set, range, flag) as ObjCObject

    public open fun initWithSet(set: NSSet): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSet:", set) as ObjCObject

    public open fun initWithSet_copyItems(set: NSSet, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSet:copyItems:", set, flag) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun orderedSet(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSet") as ObjCObject

        public open fun orderedSetWithObject(`object`: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithObject:", `object`) as ObjCObject

        public open fun orderedSetWithObjects_count(objects: Any, cnt: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithObjects:count:", objects, cnt) as ObjCObject

        public open fun orderedSetWithObjects(firstObj: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithObjects:", firstObj) as ObjCObject

        public open fun orderedSetWithOrderedSet(set: NSOrderedSet): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithOrderedSet:", set) as ObjCObject

        public open fun orderedSetWithOrderedSet_range_copyItems(set: NSOrderedSet, range: Any, flag: Boolean): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithOrderedSet:range:copyItems:", set, range, flag) as ObjCObject

        public open fun orderedSetWithArray(array: NSArray): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithArray:", array) as ObjCObject

        public open fun orderedSetWithArray_range_copyItems(array: NSArray, range: Any, flag: Boolean): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithArray:range:copyItems:", array, range, flag) as ObjCObject

        public open fun orderedSetWithSet(set: NSSet): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithSet:", set) as ObjCObject

        public open fun orderedSetWithSet_copyItems(set: NSSet, flag: Boolean): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithSet:copyItems:", set, flag) as ObjCObject
    }
}

trait NSMutableOrderedSet_NSExtendedMutableOrderedSet : IObjCObject {
    public open fun addObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObject:", `object`)
    }

    public open fun addObjects_count(objects: Any, count: Int): Unit {
        Native.objc_msgSend("void", this, "addObjects:count:", objects, count)
    }

    public open fun addObjectsFromArray(array: NSArray): Unit {
        Native.objc_msgSend("void", this, "addObjectsFromArray:", array)
    }

    public open fun exchangeObjectAtIndex_withObjectAtIndex(idx1: Int, idx2: Int): Unit {
        Native.objc_msgSend("void", this, "exchangeObjectAtIndex:withObjectAtIndex:", idx1, idx2)
    }

    public open fun moveObjectsAtIndexes_toIndex(indexes: NSIndexSet, idx: Int): Unit {
        Native.objc_msgSend("void", this, "moveObjectsAtIndexes:toIndex:", indexes, idx)
    }

    public open fun insertObjects_atIndexes(objects: NSArray, indexes: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "insertObjects:atIndexes:", objects, indexes)
    }

    public open fun setObject_atIndex(obj: ObjCObject, idx: Int): Unit {
        Native.objc_msgSend("void", this, "setObject:atIndex:", obj, idx)
    }

    public open fun setObject_atIndexedSubscript(obj: ObjCObject, idx: Int): Unit {
        Native.objc_msgSend("void", this, "setObject:atIndexedSubscript:", obj, idx)
    }

    public open fun replaceObjectsInRange_withObjects_count(range: Any, objects: Any, count: Int): Unit {
        Native.objc_msgSend("void", this, "replaceObjectsInRange:withObjects:count:", range, objects, count)
    }

    public open fun replaceObjectsAtIndexes_withObjects(indexes: NSIndexSet, objects: NSArray): Unit {
        Native.objc_msgSend("void", this, "replaceObjectsAtIndexes:withObjects:", indexes, objects)
    }

    public open fun removeObjectsInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "removeObjectsInRange:", range)
    }

    public open fun removeObjectsAtIndexes(indexes: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "removeObjectsAtIndexes:", indexes)
    }

    public open fun removeAllObjects(): Unit {
        Native.objc_msgSend("void", this, "removeAllObjects")
    }

    public open fun removeObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObject:", `object`)
    }

    public open fun removeObjectsInArray(array: NSArray): Unit {
        Native.objc_msgSend("void", this, "removeObjectsInArray:", array)
    }

    public open fun intersectOrderedSet(other: NSOrderedSet): Unit {
        Native.objc_msgSend("void", this, "intersectOrderedSet:", other)
    }

    public open fun minusOrderedSet(other: NSOrderedSet): Unit {
        Native.objc_msgSend("void", this, "minusOrderedSet:", other)
    }

    public open fun unionOrderedSet(other: NSOrderedSet): Unit {
        Native.objc_msgSend("void", this, "unionOrderedSet:", other)
    }

    public open fun intersectSet(other: NSSet): Unit {
        Native.objc_msgSend("void", this, "intersectSet:", other)
    }

    public open fun minusSet(other: NSSet): Unit {
        Native.objc_msgSend("void", this, "minusSet:", other)
    }

    public open fun unionSet(other: NSSet): Unit {
        Native.objc_msgSend("void", this, "unionSet:", other)
    }

    public open fun sortUsingComparator(cmptr: Any): Unit {
        Native.objc_msgSend("void", this, "sortUsingComparator:", cmptr)
    }

    public open fun sortWithOptions_usingComparator(opts: Any, cmptr: Any): Unit {
        Native.objc_msgSend("void", this, "sortWithOptions:usingComparator:", opts, cmptr)
    }

    public open fun sortRange_options_usingComparator(range: Any, opts: Any, cmptr: Any): Unit {
        Native.objc_msgSend("void", this, "sortRange:options:usingComparator:", range, opts, cmptr)
    }

    trait metaclass : IObjCObject
}

trait NSMutableOrderedSet_NSMutableOrderedSetCreation : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun orderedSetWithCapacity(numItems: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orderedSetWithCapacity:", numItems) as ObjCObject
    }
}
