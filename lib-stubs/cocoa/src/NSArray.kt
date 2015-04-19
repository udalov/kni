// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSArray.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSArray(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration, NSArray_NSExtendedArray, NSArray_NSArrayCreation, NSArray_NSDeprecated, NSArray_NSArrayPathExtensions, NSArray_NSKeyValueCoding, NSArray_NSKeyValueObserverRegistration, NSArray_NSSortDescriptorSorting, NSArray_NSPredicateSupport {
    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    public open fun objectAtIndex(index: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectAtIndex:", index) as ObjCObject

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

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSSecureCoding.metaclass, NSFastEnumeration.metaclass, NSArray_NSExtendedArray.metaclass, NSArray_NSArrayCreation.metaclass, NSArray_NSDeprecated.metaclass, NSArray_NSArrayPathExtensions.metaclass, NSArray_NSKeyValueCoding.metaclass, NSArray_NSKeyValueObserverRegistration.metaclass, NSArray_NSSortDescriptorSorting.metaclass, NSArray_NSPredicateSupport.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSArray")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableArray(pointer: Long) : NSArray(pointer), NSMutableArray_NSExtendedMutableArray, NSMutableArray_NSMutableArrayCreation, NSMutableArray_NSSortDescriptorSorting, NSMutableArray_NSPredicateSupport {
    public open fun addObject(anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObject:", anObject)
    }

    public open fun insertObject_atIndex(anObject: ObjCObject, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertObject:atIndex:", anObject, index)
    }

    public open fun removeLastObject(): Unit {
        Native.objc_msgSend("void", this, "removeLastObject")
    }

    public open fun removeObjectAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeObjectAtIndex:", index)
    }

    public open fun replaceObjectAtIndex_withObject(index: Int, anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "replaceObjectAtIndex:withObject:", index, anObject)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithCapacity(numItems: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCapacity:", numItems) as ObjCObject

    override fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun addObserver_forKeyPath_options_context(observer: NSObject, keyPath: NSString, options: Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addObserver:forKeyPath:options:context:", observer, keyPath, options, context)
    }

    override fun initWithContentsOfFile(path: NSString): NSMutableArray =
        Native.objc_msgSend("class objc.NSMutableArray", this, "initWithContentsOfFile:", path) as NSMutableArray

    override fun initWithContentsOfURL(url: NSURL): NSMutableArray =
        Native.objc_msgSend("class objc.NSMutableArray", this, "initWithContentsOfURL:", url) as NSMutableArray

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

    trait metaclass : NSArray.metaclass, NSMutableArray_NSExtendedMutableArray.metaclass, NSMutableArray_NSMutableArrayCreation.metaclass, NSMutableArray_NSSortDescriptorSorting.metaclass, NSMutableArray_NSPredicateSupport.metaclass {
        override fun arrayWithContentsOfFile(path: NSString): NSMutableArray =
            Native.objc_msgSend("class objc.NSMutableArray", this, "arrayWithContentsOfFile:", path) as NSMutableArray

        override fun arrayWithContentsOfURL(url: NSURL): NSMutableArray =
            Native.objc_msgSend("class objc.NSMutableArray", this, "arrayWithContentsOfURL:", url) as NSMutableArray

    }

    companion object : NSObject(Native.objc_getClass("NSMutableArray")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSArray_NSExtendedArray : IObjCObject {
    public open fun arrayByAddingObject(anObject: ObjCObject): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "arrayByAddingObject:", anObject) as NSArray

    public open fun arrayByAddingObjectsFromArray(otherArray: NSArray): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "arrayByAddingObjectsFromArray:", otherArray) as NSArray

    public open fun componentsJoinedByString(separator: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "componentsJoinedByString:", separator) as NSString

    public open fun containsObject(anObject: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "containsObject:", anObject) as Boolean

    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun descriptionWithLocale(locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:", locale) as NSString

    public open fun descriptionWithLocale_indent(locale: ObjCObject, level: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:indent:", locale, level) as NSString

    public open fun firstObjectCommonWithArray(otherArray: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "firstObjectCommonWithArray:", otherArray) as ObjCObject

    public open fun getObjects_range(objects: Any, range: Any): Unit {
        Native.objc_msgSend("void", this, "getObjects:range:", objects, range)
    }

    public open fun indexOfObject(anObject: ObjCObject): Int =
        Native.objc_msgSend("int", this, "indexOfObject:", anObject) as Int

    public open fun indexOfObject_inRange(anObject: ObjCObject, range: Any): Int =
        Native.objc_msgSend("int", this, "indexOfObject:inRange:", anObject, range) as Int

    public open fun indexOfObjectIdenticalTo(anObject: ObjCObject): Int =
        Native.objc_msgSend("int", this, "indexOfObjectIdenticalTo:", anObject) as Int

    public open fun indexOfObjectIdenticalTo_inRange(anObject: ObjCObject, range: Any): Int =
        Native.objc_msgSend("int", this, "indexOfObjectIdenticalTo:inRange:", anObject, range) as Int

    public open fun isEqualToArray(otherArray: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToArray:", otherArray) as Boolean

    public open fun firstObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "firstObject") as ObjCObject

    public open fun lastObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "lastObject") as ObjCObject

    public open fun objectEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "objectEnumerator") as NSEnumerator

    public open fun reverseObjectEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "reverseObjectEnumerator") as NSEnumerator

    public open fun sortedArrayHint(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "sortedArrayHint") as NSData

    public open fun sortedArrayUsingFunction_context(comparator: (Any, Any, Pointer<*>) -> Int, context: Pointer<*>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayUsingFunction:context:", comparator, context) as NSArray

    public open fun sortedArrayUsingFunction_context_hint(comparator: (Any, Any, Pointer<*>) -> Int, context: Pointer<*>, hint: NSData): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayUsingFunction:context:hint:", comparator, context, hint) as NSArray

    public open fun sortedArrayUsingSelector(comparator: ObjCSelector): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayUsingSelector:", comparator) as NSArray

    public open fun subarrayWithRange(range: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "subarrayWithRange:", range) as NSArray

    public open fun writeToFile_atomically(path: NSString, useAuxiliaryFile: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:atomically:", path, useAuxiliaryFile) as Boolean

    public open fun writeToURL_atomically(url: NSURL, atomically: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:atomically:", url, atomically) as Boolean

    public open fun makeObjectsPerformSelector(aSelector: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "makeObjectsPerformSelector:", aSelector)
    }

    public open fun makeObjectsPerformSelector_withObject(aSelector: ObjCSelector, argument: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "makeObjectsPerformSelector:withObject:", aSelector, argument)
    }

    public open fun objectsAtIndexes(indexes: NSIndexSet): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "objectsAtIndexes:", indexes) as NSArray

    public open fun objectAtIndexedSubscript(idx: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectAtIndexedSubscript:", idx) as ObjCObject

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

    public open fun sortedArrayUsingComparator(cmptr: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayUsingComparator:", cmptr) as NSArray

    public open fun sortedArrayWithOptions_usingComparator(opts: Any, cmptr: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayWithOptions:usingComparator:", opts, cmptr) as NSArray

    public open fun indexOfObject_inSortedRange_options_usingComparator(obj: ObjCObject, r: Any, opts: Any, cmp: Any): Int =
        Native.objc_msgSend("int", this, "indexOfObject:inSortedRange:options:usingComparator:", obj, r, opts, cmp) as Int

    trait metaclass : IObjCObject
}

trait NSArray_NSArrayCreation : IObjCObject {
    public open fun initWithObjects(firstObj: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithObjects:", firstObj) as ObjCObject

    public open fun initWithArray(array: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithArray:", array) as ObjCObject

    public open fun initWithArray_copyItems(array: NSArray, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithArray:copyItems:", array, flag) as ObjCObject

    public open fun initWithContentsOfFile(path: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "initWithContentsOfFile:", path) as NSArray

    public open fun initWithContentsOfURL(url: NSURL): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "initWithContentsOfURL:", url) as NSArray

    trait metaclass : IObjCObject {
        public open fun array(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "array") as ObjCObject

        public open fun arrayWithObject(anObject: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "arrayWithObject:", anObject) as ObjCObject

        public open fun arrayWithObjects_count(objects: Any, cnt: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "arrayWithObjects:count:", objects, cnt) as ObjCObject

        public open fun arrayWithObjects(firstObj: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "arrayWithObjects:", firstObj) as ObjCObject

        public open fun arrayWithArray(array: NSArray): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "arrayWithArray:", array) as ObjCObject

        public open fun arrayWithContentsOfFile(path: NSString): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "arrayWithContentsOfFile:", path) as NSArray

        public open fun arrayWithContentsOfURL(url: NSURL): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "arrayWithContentsOfURL:", url) as NSArray
    }
}

trait NSArray_NSDeprecated : IObjCObject {
    public open fun getObjects(objects: Any): Unit {
        Native.objc_msgSend("void", this, "getObjects:", objects)
    }

    trait metaclass : IObjCObject
}

trait NSMutableArray_NSExtendedMutableArray : IObjCObject {
    public open fun addObjectsFromArray(otherArray: NSArray): Unit {
        Native.objc_msgSend("void", this, "addObjectsFromArray:", otherArray)
    }

    public open fun exchangeObjectAtIndex_withObjectAtIndex(idx1: Int, idx2: Int): Unit {
        Native.objc_msgSend("void", this, "exchangeObjectAtIndex:withObjectAtIndex:", idx1, idx2)
    }

    public open fun removeAllObjects(): Unit {
        Native.objc_msgSend("void", this, "removeAllObjects")
    }

    public open fun removeObject_inRange(anObject: ObjCObject, range: Any): Unit {
        Native.objc_msgSend("void", this, "removeObject:inRange:", anObject, range)
    }

    public open fun removeObject(anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObject:", anObject)
    }

    public open fun removeObjectIdenticalTo_inRange(anObject: ObjCObject, range: Any): Unit {
        Native.objc_msgSend("void", this, "removeObjectIdenticalTo:inRange:", anObject, range)
    }

    public open fun removeObjectIdenticalTo(anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObjectIdenticalTo:", anObject)
    }

    public open fun removeObjectsFromIndices_numIndices(indices: Pointer<Int>, cnt: Int): Unit {
        Native.objc_msgSend("void", this, "removeObjectsFromIndices:numIndices:", indices, cnt)
    }

    public open fun removeObjectsInArray(otherArray: NSArray): Unit {
        Native.objc_msgSend("void", this, "removeObjectsInArray:", otherArray)
    }

    public open fun removeObjectsInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "removeObjectsInRange:", range)
    }

    public open fun replaceObjectsInRange_withObjectsFromArray_range(range: Any, otherArray: NSArray, otherRange: Any): Unit {
        Native.objc_msgSend("void", this, "replaceObjectsInRange:withObjectsFromArray:range:", range, otherArray, otherRange)
    }

    public open fun replaceObjectsInRange_withObjectsFromArray(range: Any, otherArray: NSArray): Unit {
        Native.objc_msgSend("void", this, "replaceObjectsInRange:withObjectsFromArray:", range, otherArray)
    }

    public open fun setArray(otherArray: NSArray): Unit {
        Native.objc_msgSend("void", this, "setArray:", otherArray)
    }

    public open fun sortUsingFunction_context(compare: (Any, Any, Pointer<*>) -> Int, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "sortUsingFunction:context:", compare, context)
    }

    public open fun sortUsingSelector(comparator: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "sortUsingSelector:", comparator)
    }

    public open fun insertObjects_atIndexes(objects: NSArray, indexes: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "insertObjects:atIndexes:", objects, indexes)
    }

    public open fun removeObjectsAtIndexes(indexes: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "removeObjectsAtIndexes:", indexes)
    }

    public open fun replaceObjectsAtIndexes_withObjects(indexes: NSIndexSet, objects: NSArray): Unit {
        Native.objc_msgSend("void", this, "replaceObjectsAtIndexes:withObjects:", indexes, objects)
    }

    public open fun setObject_atIndexedSubscript(obj: ObjCObject, idx: Int): Unit {
        Native.objc_msgSend("void", this, "setObject:atIndexedSubscript:", obj, idx)
    }

    public open fun sortUsingComparator(cmptr: Any): Unit {
        Native.objc_msgSend("void", this, "sortUsingComparator:", cmptr)
    }

    public open fun sortWithOptions_usingComparator(opts: Any, cmptr: Any): Unit {
        Native.objc_msgSend("void", this, "sortWithOptions:usingComparator:", opts, cmptr)
    }

    trait metaclass : IObjCObject
}

trait NSMutableArray_NSMutableArrayCreation : IObjCObject {
    public open fun initWithContentsOfFile(path: NSString): NSMutableArray =
        Native.objc_msgSend("class objc.NSMutableArray", this, "initWithContentsOfFile:", path) as NSMutableArray

    public open fun initWithContentsOfURL(url: NSURL): NSMutableArray =
        Native.objc_msgSend("class objc.NSMutableArray", this, "initWithContentsOfURL:", url) as NSMutableArray

    trait metaclass : IObjCObject {
        public open fun arrayWithCapacity(numItems: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "arrayWithCapacity:", numItems) as ObjCObject

        public open fun arrayWithContentsOfFile(path: NSString): NSMutableArray =
            Native.objc_msgSend("class objc.NSMutableArray", this, "arrayWithContentsOfFile:", path) as NSMutableArray

        public open fun arrayWithContentsOfURL(url: NSURL): NSMutableArray =
            Native.objc_msgSend("class objc.NSMutableArray", this, "arrayWithContentsOfURL:", url) as NSMutableArray
    }
}
