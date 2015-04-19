// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSRunLoop.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSRunLoop(pointer: Long) : NSObject(pointer), NSRunLoop_NSRunLoopConveniences, NSRunLoop_NSOrderedPerform {
    public open fun currentMode(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "currentMode") as NSString

    public open fun getCFRunLoop(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "getCFRunLoop") as Pointer<Any>

    public open fun addTimer_forMode(timer: NSTimer, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "addTimer:forMode:", timer, mode)
    }

    public open fun addPort_forMode(aPort: NSPort, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "addPort:forMode:", aPort, mode)
    }

    public open fun removePort_forMode(aPort: NSPort, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "removePort:forMode:", aPort, mode)
    }

    public open fun limitDateForMode(mode: NSString): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "limitDateForMode:", mode) as NSDate

    public open fun acceptInputForMode_beforeDate(mode: NSString, limitDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "acceptInputForMode:beforeDate:", mode, limitDate)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSRunLoop_NSRunLoopConveniences.metaclass, NSRunLoop_NSOrderedPerform.metaclass {
        public open fun currentRunLoop(): NSRunLoop =
            Native.objc_msgSend("class objc.NSRunLoop", this, "currentRunLoop") as NSRunLoop

        public open fun mainRunLoop(): NSRunLoop =
            Native.objc_msgSend("class objc.NSRunLoop", this, "mainRunLoop") as NSRunLoop

    }

    companion object : NSObject(Native.objc_getClass("NSRunLoop")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSRunLoop_NSRunLoopConveniences : IObjCObject {
    public open fun run(): Unit {
        Native.objc_msgSend("void", this, "run")
    }

    public open fun runUntilDate(limitDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "runUntilDate:", limitDate)
    }

    public open fun runMode_beforeDate(mode: NSString, limitDate: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "runMode:beforeDate:", mode, limitDate) as Boolean

    public open fun configureAsServer(): Unit {
        Native.objc_msgSend("void", this, "configureAsServer")
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSDelayedPerforming : IObjCObject {
    public open fun performSelector_withObject_afterDelay_inModes(aSelector: ObjCSelector, anArgument: ObjCObject, delay: Double, modes: NSArray): Unit {
        Native.objc_msgSend("void", this, "performSelector:withObject:afterDelay:inModes:", aSelector, anArgument, delay, modes)
    }

    public open fun performSelector_withObject_afterDelay(aSelector: ObjCSelector, anArgument: ObjCObject, delay: Double): Unit {
        Native.objc_msgSend("void", this, "performSelector:withObject:afterDelay:", aSelector, anArgument, delay)
    }

    trait metaclass : IObjCObject {
        public open fun cancelPreviousPerformRequestsWithTarget_selector_object(aTarget: ObjCObject, aSelector: ObjCSelector, anArgument: ObjCObject): Unit {
            Native.objc_msgSend("void", this, "cancelPreviousPerformRequestsWithTarget:selector:object:", aTarget, aSelector, anArgument)
        }

        public open fun cancelPreviousPerformRequestsWithTarget(aTarget: ObjCObject): Unit {
            Native.objc_msgSend("void", this, "cancelPreviousPerformRequestsWithTarget:", aTarget)
        }
    }
}

trait NSRunLoop_NSOrderedPerform : IObjCObject {
    public open fun performSelector_target_argument_order_modes(aSelector: ObjCSelector, target: ObjCObject, arg: ObjCObject, order: Int, modes: NSArray): Unit {
        Native.objc_msgSend("void", this, "performSelector:target:argument:order:modes:", aSelector, target, arg, order, modes)
    }

    public open fun cancelPerformSelector_target_argument(aSelector: ObjCSelector, target: ObjCObject, arg: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "cancelPerformSelector:target:argument:", aSelector, target, arg)
    }

    public open fun cancelPerformSelectorsWithTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "cancelPerformSelectorsWithTarget:", target)
    }

    trait metaclass : IObjCObject
}
