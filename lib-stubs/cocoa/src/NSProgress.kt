// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSProgress.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSProgress(pointer: Long) : NSObject(pointer) {
    public open fun initWithParent_userInfo(parentProgressOrNil: NSProgress, userInfoOrNil: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithParent:userInfo:", parentProgressOrNil, userInfoOrNil) as ObjCObject

    public open fun becomeCurrentWithPendingUnitCount(unitCount: Long): Unit {
        Native.objc_msgSend("void", this, "becomeCurrentWithPendingUnitCount:", unitCount)
    }

    public open fun resignCurrent(): Unit {
        Native.objc_msgSend("void", this, "resignCurrent")
    }

    public open fun totalUnitCount(): Long =
        Native.objc_msgSend("long", this, "totalUnitCount") as Long

    public open fun setTotalUnitCount(totalUnitCount: Long): Unit {
        Native.objc_msgSend("void", this, "setTotalUnitCount:", totalUnitCount)
    }

    public open fun completedUnitCount(): Long =
        Native.objc_msgSend("long", this, "completedUnitCount") as Long

    public open fun setCompletedUnitCount(completedUnitCount: Long): Unit {
        Native.objc_msgSend("void", this, "setCompletedUnitCount:", completedUnitCount)
    }

    public open fun localizedDescription(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedDescription") as NSString

    public open fun setLocalizedDescription(localizedDescription: NSString): Unit {
        Native.objc_msgSend("void", this, "setLocalizedDescription:", localizedDescription)
    }

    public open fun localizedAdditionalDescription(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedAdditionalDescription") as NSString

    public open fun setLocalizedAdditionalDescription(localizedAdditionalDescription: NSString): Unit {
        Native.objc_msgSend("void", this, "setLocalizedAdditionalDescription:", localizedAdditionalDescription)
    }

    public open fun isCancellable(): Boolean =
        Native.objc_msgSend("boolean", this, "isCancellable") as Boolean

    public open fun setCancellable(cancellable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCancellable:", cancellable)
    }

    public open fun isPausable(): Boolean =
        Native.objc_msgSend("boolean", this, "isPausable") as Boolean

    public open fun setPausable(pausable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPausable:", pausable)
    }

    public open fun isCancelled(): Boolean =
        Native.objc_msgSend("boolean", this, "isCancelled") as Boolean

    public open fun isPaused(): Boolean =
        Native.objc_msgSend("boolean", this, "isPaused") as Boolean

    public open fun cancellationHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "cancellationHandler")

    public open fun setCancellationHandler(cancellationHandler: Any): Unit {
        Native.objc_msgSend("void", this, "setCancellationHandler:", cancellationHandler)
    }

    public open fun pausingHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "pausingHandler")

    public open fun setPausingHandler(pausingHandler: Any): Unit {
        Native.objc_msgSend("void", this, "setPausingHandler:", pausingHandler)
    }

    public open fun setUserInfoObject_forKey(objectOrNil: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setUserInfoObject:forKey:", objectOrNil, key)
    }

    public open fun isIndeterminate(): Boolean =
        Native.objc_msgSend("boolean", this, "isIndeterminate") as Boolean

    public open fun fractionCompleted(): Double =
        Native.objc_msgSend("double", this, "fractionCompleted") as Double

    public open fun cancel(): Unit {
        Native.objc_msgSend("void", this, "cancel")
    }

    public open fun pause(): Unit {
        Native.objc_msgSend("void", this, "pause")
    }

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    public open fun kind(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "kind") as NSString

    public open fun setKind(kind: NSString): Unit {
        Native.objc_msgSend("void", this, "setKind:", kind)
    }

    public open fun publish(): Unit {
        Native.objc_msgSend("void", this, "publish")
    }

    public open fun unpublish(): Unit {
        Native.objc_msgSend("void", this, "unpublish")
    }

    public open fun isOld(): Boolean =
        Native.objc_msgSend("boolean", this, "isOld") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun currentProgress(): NSProgress =
            Native.objc_msgSend("class objc.NSProgress", this, "currentProgress") as NSProgress

        public open fun progressWithTotalUnitCount(unitCount: Long): NSProgress =
            Native.objc_msgSend("class objc.NSProgress", this, "progressWithTotalUnitCount:", unitCount) as NSProgress

        public open fun addSubscriberForFileURL_withPublishingHandler(url: NSURL, publishingHandler: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "addSubscriberForFileURL:withPublishingHandler:", url, publishingHandler) as ObjCObject

        public open fun removeSubscriber(subscriber: ObjCObject): Unit {
            Native.objc_msgSend("void", this, "removeSubscriber:", subscriber)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSProgress")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
