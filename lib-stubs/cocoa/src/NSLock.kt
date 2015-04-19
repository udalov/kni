// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSLock.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSLocking {
    trait metaclass
}

public open class NSLock(pointer: Long) : NSObject(pointer), NSLocking {
    public open fun tryLock(): Boolean =
        Native.objc_msgSend("boolean", this, "tryLock") as Boolean

    public open fun lockBeforeDate(limit: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "lockBeforeDate:", limit) as Boolean

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSLocking.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSLock")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSConditionLock(pointer: Long) : NSObject(pointer), NSLocking {
    public open fun initWithCondition(condition: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCondition:", condition) as ObjCObject

    public open fun condition(): Int =
        Native.objc_msgSend("int", this, "condition") as Int

    public open fun lockWhenCondition(condition: Int): Unit {
        Native.objc_msgSend("void", this, "lockWhenCondition:", condition)
    }

    public open fun tryLock(): Boolean =
        Native.objc_msgSend("boolean", this, "tryLock") as Boolean

    public open fun tryLockWhenCondition(condition: Int): Boolean =
        Native.objc_msgSend("boolean", this, "tryLockWhenCondition:", condition) as Boolean

    public open fun unlockWithCondition(condition: Int): Unit {
        Native.objc_msgSend("void", this, "unlockWithCondition:", condition)
    }

    public open fun lockBeforeDate(limit: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "lockBeforeDate:", limit) as Boolean

    public open fun lockWhenCondition_beforeDate(condition: Int, limit: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "lockWhenCondition:beforeDate:", condition, limit) as Boolean

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSLocking.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSConditionLock")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSRecursiveLock(pointer: Long) : NSObject(pointer), NSLocking {
    public open fun tryLock(): Boolean =
        Native.objc_msgSend("boolean", this, "tryLock") as Boolean

    public open fun lockBeforeDate(limit: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "lockBeforeDate:", limit) as Boolean

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSLocking.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSRecursiveLock")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSCondition(pointer: Long) : NSObject(pointer), NSLocking {
    public open fun wait(): Unit {
        Native.objc_msgSend("void", this, "wait")
    }

    public open fun waitUntilDate(limit: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "waitUntilDate:", limit) as Boolean

    public open fun signal(): Unit {
        Native.objc_msgSend("void", this, "signal")
    }

    public open fun broadcast(): Unit {
        Native.objc_msgSend("void", this, "broadcast")
    }

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSLocking.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCondition")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
