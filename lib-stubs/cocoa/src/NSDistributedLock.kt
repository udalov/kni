// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSDistributedLock.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDistributedLock(pointer: Long) : NSObject(pointer) {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithPath(path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPath:", path) as ObjCObject

    public open fun tryLock(): Boolean =
        Native.objc_msgSend("boolean", this, "tryLock") as Boolean

    public open fun unlock(): Unit {
        Native.objc_msgSend("void", this, "unlock")
    }

    public open fun breakLock(): Unit {
        Native.objc_msgSend("void", this, "breakLock")
    }

    public open fun lockDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "lockDate") as NSDate

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun lockWithPath(path: NSString): NSDistributedLock =
            Native.objc_msgSend("class objc.NSDistributedLock", this, "lockWithPath:", path) as NSDistributedLock

    }

    companion object : NSObject(Native.objc_getClass("NSDistributedLock")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
