// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSNotificationQueue.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSNotificationQueue(pointer: Long) : NSObject(pointer) {
    public open fun initWithNotificationCenter(notificationCenter: NSNotificationCenter): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithNotificationCenter:", notificationCenter) as ObjCObject

    public open fun enqueueNotification_postingStyle(notification: NSNotification, postingStyle: Any): Unit {
        Native.objc_msgSend("void", this, "enqueueNotification:postingStyle:", notification, postingStyle)
    }

    public open fun enqueueNotification_postingStyle_coalesceMask_forModes(notification: NSNotification, postingStyle: Any, coalesceMask: Int, modes: NSArray): Unit {
        Native.objc_msgSend("void", this, "enqueueNotification:postingStyle:coalesceMask:forModes:", notification, postingStyle, coalesceMask, modes)
    }

    public open fun dequeueNotificationsMatching_coalesceMask(notification: NSNotification, coalesceMask: Int): Unit {
        Native.objc_msgSend("void", this, "dequeueNotificationsMatching:coalesceMask:", notification, coalesceMask)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun defaultQueue(): NSNotificationQueue =
            Native.objc_msgSend("class objc.NSNotificationQueue", this, "defaultQueue") as NSNotificationQueue

    }

    companion object : NSObject(Native.objc_getClass("NSNotificationQueue")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
