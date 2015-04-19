// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSSet.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSSet(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration, NSSet_NSExtendedSet, NSSet_NSSetCreation, NSSet_NSKeyValueCoding, NSSet_NSKeyValueObserverRegistration, NSSet_NSSortDescriptorSorting, NSSet_NSPredicateSupport {
    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    public open fun member(`object`: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "member:", `object`) as ObjCObject

    public open fun objectEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "objectEnumerator") as NSEnumerator

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

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSSecureCoding.metaclass, NSFastEnumeration.metaclass, NSSet_NSExtendedSet.metaclass, NSSet_NSSetCreation.metaclass, NSSet_NSKeyValueCoding.metaclass, NSSet_NSKeyValueObserverRegistration.metaclass, NSSet_NSSortDescriptorSorting.metaclass, NSSet_NSPredicateSupport.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSet")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableSet(pointer: Long) : NSSet(pointer), NSMutableSet_NSExtendedMutableSet, NSMutableSet_NSMutableSetCreation, NSMutableSet_NSPredicateSupport {
    public open fun addObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObject:", `object`)
    }

    public open fun removeObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObject:", `object`)
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

    trait metaclass : NSSet.metaclass, NSMutableSet_NSExtendedMutableSet.metaclass, NSMutableSet_NSMutableSetCreation.metaclass, NSMutableSet_NSPredicateSupport.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMutableSet")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSCountedSet(pointer: Long) : NSMutableSet(pointer) {
    override fun initWithCapacity(numItems: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCapacity:", numItems) as ObjCObject

    override fun initWithArray(array: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithArray:", array) as ObjCObject

    override fun initWithSet(set: NSSet): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSet:", set) as ObjCObject

    public open fun countForObject(`object`: ObjCObject): Int =
        Native.objc_msgSend("int", this, "countForObject:", `object`) as Int

    override fun objectEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "objectEnumerator") as NSEnumerator

    override fun addObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObject:", `object`)
    }

    override fun removeObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObject:", `object`)
    }

    override fun addObserver_forKeyPath_options_context(observer: NSObject, keyPath: NSString, options: Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addObserver:forKeyPath:options:context:", observer, keyPath, options, context)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

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

    trait metaclass : NSMutableSet.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCountedSet")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSSet_NSExtendedSet : IObjCObject {
    public open fun allObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allObjects") as NSArray

    public open fun anyObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "anyObject") as ObjCObject

    public open fun containsObject(anObject: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "containsObject:", anObject) as Boolean

    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun descriptionWithLocale(locale: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "descriptionWithLocale:", locale) as NSString

    public open fun intersectsSet(otherSet: NSSet): Boolean =
        Native.objc_msgSend("boolean", this, "intersectsSet:", otherSet) as Boolean

    public open fun isEqualToSet(otherSet: NSSet): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToSet:", otherSet) as Boolean

    public open fun isSubsetOfSet(otherSet: NSSet): Boolean =
        Native.objc_msgSend("boolean", this, "isSubsetOfSet:", otherSet) as Boolean

    public open fun makeObjectsPerformSelector(aSelector: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "makeObjectsPerformSelector:", aSelector)
    }

    public open fun makeObjectsPerformSelector_withObject(aSelector: ObjCSelector, argument: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "makeObjectsPerformSelector:withObject:", aSelector, argument)
    }

    public open fun setByAddingObject(anObject: ObjCObject): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "setByAddingObject:", anObject) as NSSet

    public open fun setByAddingObjectsFromSet(other: NSSet): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "setByAddingObjectsFromSet:", other) as NSSet

    public open fun setByAddingObjectsFromArray(other: NSArray): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "setByAddingObjectsFromArray:", other) as NSSet

    public open fun enumerateObjectsUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateObjectsUsingBlock:", block)
    }

    public open fun enumerateObjectsWithOptions_usingBlock(opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateObjectsWithOptions:usingBlock:", opts, block)
    }

    public open fun objectsPassingTest(predicate: Any): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "objectsPassingTest:", predicate) as NSSet

    public open fun objectsWithOptions_passingTest(opts: Any, predicate: Any): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "objectsWithOptions:passingTest:", opts, predicate) as NSSet

    trait metaclass : IObjCObject
}

trait NSSet_NSSetCreation : IObjCObject {
    public open fun initWithObjects(firstObj: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithObjects:", firstObj) as ObjCObject

    public open fun initWithSet(set: NSSet): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSet:", set) as ObjCObject

    public open fun initWithSet_copyItems(set: NSSet, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSet:copyItems:", set, flag) as ObjCObject

    public open fun initWithArray(array: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithArray:", array) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun set(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "set") as ObjCObject

        public open fun setWithObject(`object`: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "setWithObject:", `object`) as ObjCObject

        public open fun setWithObjects_count(objects: Any, cnt: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "setWithObjects:count:", objects, cnt) as ObjCObject

        public open fun setWithObjects(firstObj: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "setWithObjects:", firstObj) as ObjCObject

        public open fun setWithSet(set: NSSet): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "setWithSet:", set) as ObjCObject

        public open fun setWithArray(array: NSArray): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "setWithArray:", array) as ObjCObject
    }
}

trait NSMutableSet_NSExtendedMutableSet : IObjCObject {
    public open fun addObjectsFromArray(array: NSArray): Unit {
        Native.objc_msgSend("void", this, "addObjectsFromArray:", array)
    }

    public open fun intersectSet(otherSet: NSSet): Unit {
        Native.objc_msgSend("void", this, "intersectSet:", otherSet)
    }

    public open fun minusSet(otherSet: NSSet): Unit {
        Native.objc_msgSend("void", this, "minusSet:", otherSet)
    }

    public open fun removeAllObjects(): Unit {
        Native.objc_msgSend("void", this, "removeAllObjects")
    }

    public open fun unionSet(otherSet: NSSet): Unit {
        Native.objc_msgSend("void", this, "unionSet:", otherSet)
    }

    public open fun setSet(otherSet: NSSet): Unit {
        Native.objc_msgSend("void", this, "setSet:", otherSet)
    }

    trait metaclass : IObjCObject
}

trait NSMutableSet_NSMutableSetCreation : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun setWithCapacity(numItems: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "setWithCapacity:", numItems) as ObjCObject
    }
}
