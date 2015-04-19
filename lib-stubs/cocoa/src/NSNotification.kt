// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSNotification.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSNotification(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSNotification_NSNotificationCreation {
    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun `object`(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "object") as ObjCObject

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    public open fun initWithName_object_userInfo(name: NSString, `object`: ObjCObject, userInfo: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:object:userInfo:", name, `object`, userInfo) as ObjCObject

    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSNotification_NSNotificationCreation.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSNotification")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSNotificationCenter(pointer: Long) : NSObject(pointer) {
    public open fun addObserver_selector_name_object(observer: ObjCObject, aSelector: ObjCSelector, aName: NSString, anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObserver:selector:name:object:", observer, aSelector, aName, anObject)
    }

    public open fun postNotification(notification: NSNotification): Unit {
        Native.objc_msgSend("void", this, "postNotification:", notification)
    }

    public open fun postNotificationName_object(aName: NSString, anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "postNotificationName:object:", aName, anObject)
    }

    public open fun postNotificationName_object_userInfo(aName: NSString, anObject: ObjCObject, aUserInfo: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "postNotificationName:object:userInfo:", aName, anObject, aUserInfo)
    }

    public open fun removeObserver(observer: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObserver:", observer)
    }

    public open fun removeObserver_name_object(observer: ObjCObject, aName: NSString, anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObserver:name:object:", observer, aName, anObject)
    }

    public open fun addObserverForName_object_queue_usingBlock(name: NSString, obj: ObjCObject, queue: NSOperationQueue, block: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "addObserverForName:object:queue:usingBlock:", name, obj, queue, block)

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun defaultCenter(): NSNotificationCenter =
            Native.objc_msgSend("class objc.NSNotificationCenter", this, "defaultCenter") as NSNotificationCenter

    }

    companion object : NSObject(Native.objc_getClass("NSNotificationCenter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSNotification_NSNotificationCreation : IObjCObject {
    public open fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    trait metaclass : IObjCObject {
        public open fun notificationWithName_object(aName: NSString, anObject: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "notificationWithName:object:", aName, anObject) as ObjCObject

        public open fun notificationWithName_object_userInfo(aName: NSString, anObject: ObjCObject, aUserInfo: NSDictionary): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "notificationWithName:object:userInfo:", aName, anObject, aUserInfo) as ObjCObject
    }
}
