// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSUserNotification.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSUserNotificationCenterDelegate {
    trait metaclass
}

public open class NSUserNotification(pointer: Long) : NSObject(pointer), NSCopying {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun subtitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "subtitle") as NSString

    public open fun setSubtitle(subtitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setSubtitle:", subtitle)
    }

    public open fun informativeText(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "informativeText") as NSString

    public open fun setInformativeText(informativeText: NSString): Unit {
        Native.objc_msgSend("void", this, "setInformativeText:", informativeText)
    }

    public open fun actionButtonTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "actionButtonTitle") as NSString

    public open fun setActionButtonTitle(actionButtonTitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setActionButtonTitle:", actionButtonTitle)
    }

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    public open fun setUserInfo(userInfo: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setUserInfo:", userInfo)
    }

    public open fun deliveryDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "deliveryDate") as NSDate

    public open fun setDeliveryDate(deliveryDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "setDeliveryDate:", deliveryDate)
    }

    public open fun deliveryTimeZone(): NSTimeZone =
        Native.objc_msgSend("class objc.NSTimeZone", this, "deliveryTimeZone") as NSTimeZone

    public open fun setDeliveryTimeZone(deliveryTimeZone: NSTimeZone): Unit {
        Native.objc_msgSend("void", this, "setDeliveryTimeZone:", deliveryTimeZone)
    }

    public open fun deliveryRepeatInterval(): NSDateComponents =
        Native.objc_msgSend("class objc.NSDateComponents", this, "deliveryRepeatInterval") as NSDateComponents

    public open fun setDeliveryRepeatInterval(deliveryRepeatInterval: NSDateComponents): Unit {
        Native.objc_msgSend("void", this, "setDeliveryRepeatInterval:", deliveryRepeatInterval)
    }

    public open fun actualDeliveryDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "actualDeliveryDate") as NSDate

    public open fun isPresented(): Boolean =
        Native.objc_msgSend("boolean", this, "isPresented") as Boolean

    public open fun isRemote(): Boolean =
        Native.objc_msgSend("boolean", this, "isRemote") as Boolean

    public open fun soundName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "soundName") as NSString

    public open fun setSoundName(soundName: NSString): Unit {
        Native.objc_msgSend("void", this, "setSoundName:", soundName)
    }

    public open fun hasActionButton(): Boolean =
        Native.objc_msgSend("boolean", this, "hasActionButton") as Boolean

    public open fun setHasActionButton(hasActionButton: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasActionButton:", hasActionButton)
    }

    public open fun activationType(): Any =
        Native.objc_msgSend("class objc.Any", this, "activationType")

    public open fun otherButtonTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "otherButtonTitle") as NSString

    public open fun setOtherButtonTitle(otherButtonTitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setOtherButtonTitle:", otherButtonTitle)
    }

    public open fun identifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "identifier") as NSString

    public open fun setIdentifier(identifier: NSString): Unit {
        Native.objc_msgSend("void", this, "setIdentifier:", identifier)
    }

    public open fun contentImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "contentImage") as NSImage

    public open fun setContentImage(contentImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setContentImage:", contentImage)
    }

    public open fun hasReplyButton(): Boolean =
        Native.objc_msgSend("boolean", this, "hasReplyButton") as Boolean

    public open fun setHasReplyButton(hasReplyButton: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasReplyButton:", hasReplyButton)
    }

    public open fun responsePlaceholder(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "responsePlaceholder") as NSString

    public open fun setResponsePlaceholder(responsePlaceholder: NSString): Unit {
        Native.objc_msgSend("void", this, "setResponsePlaceholder:", responsePlaceholder)
    }

    public open fun response(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "response") as NSAttributedString

    public open fun additionalActions(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "additionalActions") as NSArray

    public open fun setAdditionalActions(additionalActions: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAdditionalActions:", additionalActions)
    }

    public open fun additionalActivationAction(): NSUserNotificationAction =
        Native.objc_msgSend("class objc.NSUserNotificationAction", this, "additionalActivationAction") as NSUserNotificationAction

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSUserNotification")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSUserNotificationAction(pointer: Long) : NSObject(pointer), NSCopying {
    public open fun identifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "identifier") as NSString

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass {
        public open fun actionWithIdentifier_title(identifier: NSString, title: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "actionWithIdentifier:title:", identifier, title) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSUserNotificationAction")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSUserNotificationCenter(pointer: Long) : NSObject(pointer) {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun scheduledNotifications(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "scheduledNotifications") as NSArray

    public open fun setScheduledNotifications(scheduledNotifications: NSArray): Unit {
        Native.objc_msgSend("void", this, "setScheduledNotifications:", scheduledNotifications)
    }

    public open fun scheduleNotification(notification: NSUserNotification): Unit {
        Native.objc_msgSend("void", this, "scheduleNotification:", notification)
    }

    public open fun removeScheduledNotification(notification: NSUserNotification): Unit {
        Native.objc_msgSend("void", this, "removeScheduledNotification:", notification)
    }

    public open fun deliveredNotifications(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "deliveredNotifications") as NSArray

    public open fun deliverNotification(notification: NSUserNotification): Unit {
        Native.objc_msgSend("void", this, "deliverNotification:", notification)
    }

    public open fun removeDeliveredNotification(notification: NSUserNotification): Unit {
        Native.objc_msgSend("void", this, "removeDeliveredNotification:", notification)
    }

    public open fun removeAllDeliveredNotifications(): Unit {
        Native.objc_msgSend("void", this, "removeAllDeliveredNotifications")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun defaultUserNotificationCenter(): NSUserNotificationCenter =
            Native.objc_msgSend("class objc.NSUserNotificationCenter", this, "defaultUserNotificationCenter") as NSUserNotificationCenter

    }

    companion object : NSObject(Native.objc_getClass("NSUserNotificationCenter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
