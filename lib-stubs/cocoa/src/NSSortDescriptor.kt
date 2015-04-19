// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSSortDescriptor.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSSortDescriptor(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying {
    public open fun initWithKey_ascending(key: NSString, ascending: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKey:ascending:", key, ascending) as ObjCObject

    public open fun initWithKey_ascending_selector(key: NSString, ascending: Boolean, selector: ObjCSelector): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKey:ascending:selector:", key, ascending, selector) as ObjCObject

    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    public open fun ascending(): Boolean =
        Native.objc_msgSend("boolean", this, "ascending") as Boolean

    public open fun selector(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "selector") as ObjCSelector

    public open fun allowEvaluation(): Unit {
        Native.objc_msgSend("void", this, "allowEvaluation")
    }

    public open fun initWithKey_ascending_comparator(key: NSString, ascending: Boolean, cmptr: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKey:ascending:comparator:", key, ascending, cmptr) as ObjCObject

    public open fun comparator(): Any =
        Native.objc_msgSend("class objc.Any", this, "comparator")

    public open fun compareObject_toObject(object1: ObjCObject, object2: ObjCObject): Any =
        Native.objc_msgSend("class objc.Any", this, "compareObject:toObject:", object1, object2)

    public open fun reversedSortDescriptor(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "reversedSortDescriptor") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass {
        public open fun sortDescriptorWithKey_ascending(key: NSString, ascending: Boolean): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sortDescriptorWithKey:ascending:", key, ascending) as ObjCObject

        public open fun sortDescriptorWithKey_ascending_selector(key: NSString, ascending: Boolean, selector: ObjCSelector): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sortDescriptorWithKey:ascending:selector:", key, ascending, selector) as ObjCObject

        public open fun sortDescriptorWithKey_ascending_comparator(key: NSString, ascending: Boolean, cmptr: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sortDescriptorWithKey:ascending:comparator:", key, ascending, cmptr) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSSortDescriptor")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSSet_NSSortDescriptorSorting : IObjCObject {
    public open fun sortedArrayUsingDescriptors(sortDescriptors: NSArray): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayUsingDescriptors:", sortDescriptors) as NSArray

    trait metaclass : IObjCObject
}

trait NSArray_NSSortDescriptorSorting : IObjCObject {
    public open fun sortedArrayUsingDescriptors(sortDescriptors: NSArray): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayUsingDescriptors:", sortDescriptors) as NSArray

    trait metaclass : IObjCObject
}

trait NSMutableArray_NSSortDescriptorSorting : IObjCObject {
    public open fun sortUsingDescriptors(sortDescriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "sortUsingDescriptors:", sortDescriptors)
    }

    trait metaclass : IObjCObject
}

trait NSOrderedSet_NSKeyValueSorting : IObjCObject {
    public open fun sortedArrayUsingDescriptors(sortDescriptors: NSArray): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedArrayUsingDescriptors:", sortDescriptors) as NSArray

    trait metaclass : IObjCObject
}

trait NSMutableOrderedSet_NSKeyValueSorting : IObjCObject {
    public open fun sortUsingDescriptors(sortDescriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "sortUsingDescriptors:", sortDescriptors)
    }

    trait metaclass : IObjCObject
}
