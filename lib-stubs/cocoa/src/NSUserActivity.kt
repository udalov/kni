// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSUserActivity.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSUserActivityDelegate {
    trait metaclass
}

public open class NSUserActivity(pointer: Long) : NSObject(pointer) {
    public open fun initWithActivityType(activityType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithActivityType:", activityType) as ObjCObject

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun activityType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "activityType") as NSString

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    public open fun setUserInfo(userInfo: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setUserInfo:", userInfo)
    }

    public open fun addUserInfoEntriesFromDictionary(otherDictionary: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "addUserInfoEntriesFromDictionary:", otherDictionary)
    }

    public open fun needsSave(): Boolean =
        Native.objc_msgSend("boolean", this, "needsSave") as Boolean

    public open fun setNeedsSave(needsSave: Boolean): Unit {
        Native.objc_msgSend("void", this, "setNeedsSave:", needsSave)
    }

    public open fun webpageURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "webpageURL") as NSURL

    public open fun setWebpageURL(webpageURL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setWebpageURL:", webpageURL)
    }

    public open fun supportsContinuationStreams(): Boolean =
        Native.objc_msgSend("boolean", this, "supportsContinuationStreams") as Boolean

    public open fun setSupportsContinuationStreams(supportsContinuationStreams: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSupportsContinuationStreams:", supportsContinuationStreams)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun becomeCurrent(): Unit {
        Native.objc_msgSend("void", this, "becomeCurrent")
    }

    public open fun invalidate(): Unit {
        Native.objc_msgSend("void", this, "invalidate")
    }

    public open fun getContinuationStreamsWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "getContinuationStreamsWithCompletionHandler:", completionHandler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSUserActivity")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSResponder_NSUserActivity : IObjCObject {
    public open fun userActivity(): NSUserActivity =
        Native.objc_msgSend("class objc.NSUserActivity", this, "userActivity") as NSUserActivity

    public open fun setUserActivity(userActivity: NSUserActivity): Unit {
        Native.objc_msgSend("void", this, "setUserActivity:", userActivity)
    }

    public open fun updateUserActivityState(userActivity: NSUserActivity): Unit {
        Native.objc_msgSend("void", this, "updateUserActivityState:", userActivity)
    }

    public open fun restoreUserActivityState(userActivity: NSUserActivity): Unit {
        Native.objc_msgSend("void", this, "restoreUserActivityState:", userActivity)
    }

    trait metaclass : IObjCObject
}

trait NSDocument_NSUserActivity : IObjCObject {
    public open fun userActivity(): NSUserActivity =
        Native.objc_msgSend("class objc.NSUserActivity", this, "userActivity") as NSUserActivity

    public open fun setUserActivity(userActivity: NSUserActivity): Unit {
        Native.objc_msgSend("void", this, "setUserActivity:", userActivity)
    }

    public open fun updateUserActivityState(activity: NSUserActivity): Unit {
        Native.objc_msgSend("void", this, "updateUserActivityState:", activity)
    }

    public open fun restoreUserActivityState(activity: NSUserActivity): Unit {
        Native.objc_msgSend("void", this, "restoreUserActivityState:", activity)
    }

    trait metaclass : IObjCObject
}
