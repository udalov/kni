// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSDistributedNotificationCenter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDistributedNotificationCenter(pointer: Long) : NSNotificationCenter(pointer) {
    public open fun addObserver_selector_name_object_suspensionBehavior(observer: ObjCObject, selector: ObjCSelector, name: NSString, `object`: NSString, suspensionBehavior: Any): Unit {
        Native.objc_msgSend("void", this, "addObserver:selector:name:object:suspensionBehavior:", observer, selector, name, `object`, suspensionBehavior)
    }

    public open fun postNotificationName_object_userInfo_deliverImmediately(name: NSString, `object`: NSString, userInfo: NSDictionary, deliverImmediately: Boolean): Unit {
        Native.objc_msgSend("void", this, "postNotificationName:object:userInfo:deliverImmediately:", name, `object`, userInfo, deliverImmediately)
    }

    public open fun postNotificationName_object_userInfo_options(name: NSString, `object`: NSString, userInfo: NSDictionary, options: Int): Unit {
        Native.objc_msgSend("void", this, "postNotificationName:object:userInfo:options:", name, `object`, userInfo, options)
    }

    public open fun suspended(): Boolean =
        Native.objc_msgSend("boolean", this, "suspended") as Boolean

    public open fun setSuspended(suspended: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSuspended:", suspended)
    }

    public open fun addObserver_selector_name_object(observer: ObjCObject, aSelector: ObjCSelector, aName: NSString, anObject: NSString): Unit {
        Native.objc_msgSend("void", this, "addObserver:selector:name:object:", observer, aSelector, aName, anObject)
    }

    public open fun postNotificationName_object(aName: NSString, anObject: NSString): Unit {
        Native.objc_msgSend("void", this, "postNotificationName:object:", aName, anObject)
    }

    public open fun postNotificationName_object_userInfo(aName: NSString, anObject: NSString, aUserInfo: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "postNotificationName:object:userInfo:", aName, anObject, aUserInfo)
    }

    public open fun removeObserver_name_object(observer: ObjCObject, aName: NSString, anObject: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObserver:name:object:", observer, aName, anObject)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSNotificationCenter.metaclass {
        public open fun notificationCenterForType(notificationCenterType: NSString): NSDistributedNotificationCenter =
            Native.objc_msgSend("class objc.NSDistributedNotificationCenter", this, "notificationCenterForType:", notificationCenterType) as NSDistributedNotificationCenter

        override fun defaultCenter(): NSDistributedNotificationCenter =
            Native.objc_msgSend("class objc.NSDistributedNotificationCenter", this, "defaultCenter") as NSDistributedNotificationCenter

    }

    companion object : NSObject(Native.objc_getClass("NSDistributedNotificationCenter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
