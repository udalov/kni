// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSTimer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTimer(pointer: Long) : NSObject(pointer) {
    public open fun initWithFireDate_interval_target_selector_userInfo_repeats(date: NSDate, ti: Double, t: ObjCObject, s: ObjCSelector, ui: ObjCObject, rep: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFireDate:interval:target:selector:userInfo:repeats:", date, ti, t, s, ui, rep) as ObjCObject

    public open fun fire(): Unit {
        Native.objc_msgSend("void", this, "fire")
    }

    public open fun fireDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "fireDate") as NSDate

    public open fun setFireDate(fireDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "setFireDate:", fireDate)
    }

    public open fun timeInterval(): Double =
        Native.objc_msgSend("double", this, "timeInterval") as Double

    public open fun tolerance(): Double =
        Native.objc_msgSend("double", this, "tolerance") as Double

    public open fun setTolerance(tolerance: Double): Unit {
        Native.objc_msgSend("void", this, "setTolerance:", tolerance)
    }

    public open fun invalidate(): Unit {
        Native.objc_msgSend("void", this, "invalidate")
    }

    public open fun isValid(): Boolean =
        Native.objc_msgSend("boolean", this, "isValid") as Boolean

    public open fun userInfo(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "userInfo") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun timerWithTimeInterval_invocation_repeats(ti: Double, invocation: NSInvocation, yesOrNo: Boolean): NSTimer =
            Native.objc_msgSend("class objc.NSTimer", this, "timerWithTimeInterval:invocation:repeats:", ti, invocation, yesOrNo) as NSTimer

        public open fun scheduledTimerWithTimeInterval_invocation_repeats(ti: Double, invocation: NSInvocation, yesOrNo: Boolean): NSTimer =
            Native.objc_msgSend("class objc.NSTimer", this, "scheduledTimerWithTimeInterval:invocation:repeats:", ti, invocation, yesOrNo) as NSTimer

        public open fun timerWithTimeInterval_target_selector_userInfo_repeats(ti: Double, aTarget: ObjCObject, aSelector: ObjCSelector, userInfo: ObjCObject, yesOrNo: Boolean): NSTimer =
            Native.objc_msgSend("class objc.NSTimer", this, "timerWithTimeInterval:target:selector:userInfo:repeats:", ti, aTarget, aSelector, userInfo, yesOrNo) as NSTimer

        public open fun scheduledTimerWithTimeInterval_target_selector_userInfo_repeats(ti: Double, aTarget: ObjCObject, aSelector: ObjCSelector, userInfo: ObjCObject, yesOrNo: Boolean): NSTimer =
            Native.objc_msgSend("class objc.NSTimer", this, "scheduledTimerWithTimeInterval:target:selector:userInfo:repeats:", ti, aTarget, aSelector, userInfo, yesOrNo) as NSTimer

    }

    companion object : NSObject(Native.objc_getClass("NSTimer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
