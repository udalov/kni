// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSThread.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSThread(pointer: Long) : NSObject(pointer) {
    public open fun threadDictionary(): NSMutableDictionary =
        Native.objc_msgSend("class objc.NSMutableDictionary", this, "threadDictionary") as NSMutableDictionary

    public open fun threadPriority(): Double =
        Native.objc_msgSend("double", this, "threadPriority") as Double

    public open fun setThreadPriority(threadPriority: Double): Unit {
        Native.objc_msgSend("void", this, "setThreadPriority:", threadPriority)
    }

    public open fun qualityOfService(): Any =
        Native.objc_msgSend("class objc.Any", this, "qualityOfService")

    public open fun setQualityOfService(qualityOfService: Any): Unit {
        Native.objc_msgSend("void", this, "setQualityOfService:", qualityOfService)
    }

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    public open fun stackSize(): Int =
        Native.objc_msgSend("int", this, "stackSize") as Int

    public open fun setStackSize(stackSize: Int): Unit {
        Native.objc_msgSend("void", this, "setStackSize:", stackSize)
    }

    public open fun isMainThread(): Boolean =
        Native.objc_msgSend("boolean", this, "isMainThread") as Boolean

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithTarget_selector_object(target: ObjCObject, selector: ObjCSelector, argument: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTarget:selector:object:", target, selector, argument) as ObjCObject

    public open fun isExecuting(): Boolean =
        Native.objc_msgSend("boolean", this, "isExecuting") as Boolean

    public open fun isFinished(): Boolean =
        Native.objc_msgSend("boolean", this, "isFinished") as Boolean

    public open fun isCancelled(): Boolean =
        Native.objc_msgSend("boolean", this, "isCancelled") as Boolean

    public open fun cancel(): Unit {
        Native.objc_msgSend("void", this, "cancel")
    }

    public open fun start(): Unit {
        Native.objc_msgSend("void", this, "start")
    }

    public open fun main(): Unit {
        Native.objc_msgSend("void", this, "main")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun currentThread(): NSThread =
            Native.objc_msgSend("class objc.NSThread", this, "currentThread") as NSThread

        public open fun detachNewThreadSelector_toTarget_withObject(selector: ObjCSelector, target: ObjCObject, argument: ObjCObject): Unit {
            Native.objc_msgSend("void", this, "detachNewThreadSelector:toTarget:withObject:", selector, target, argument)
        }

        public open fun isMultiThreaded(): Boolean =
            Native.objc_msgSend("boolean", this, "isMultiThreaded") as Boolean

        public open fun sleepUntilDate(date: NSDate): Unit {
            Native.objc_msgSend("void", this, "sleepUntilDate:", date)
        }

        public open fun sleepForTimeInterval(ti: Double): Unit {
            Native.objc_msgSend("void", this, "sleepForTimeInterval:", ti)
        }

        public open fun exit(): Unit {
            Native.objc_msgSend("void", this, "exit")
        }

        public open fun threadPriority(): Double =
            Native.objc_msgSend("double", this, "threadPriority") as Double

        public open fun setThreadPriority(p: Double): Boolean =
            Native.objc_msgSend("boolean", this, "setThreadPriority:", p) as Boolean

        public open fun callStackReturnAddresses(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "callStackReturnAddresses") as NSArray

        public open fun callStackSymbols(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "callStackSymbols") as NSArray

        public open fun isMainThread(): Boolean =
            Native.objc_msgSend("boolean", this, "isMainThread") as Boolean

        public open fun mainThread(): NSThread =
            Native.objc_msgSend("class objc.NSThread", this, "mainThread") as NSThread

    }

    companion object : NSObject(Native.objc_getClass("NSThread")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSThreadPerformAdditions : IObjCObject {
    public open fun performSelectorOnMainThread_withObject_waitUntilDone_modes(aSelector: ObjCSelector, arg: ObjCObject, wait: Boolean, array: NSArray): Unit {
        Native.objc_msgSend("void", this, "performSelectorOnMainThread:withObject:waitUntilDone:modes:", aSelector, arg, wait, array)
    }

    public open fun performSelectorOnMainThread_withObject_waitUntilDone(aSelector: ObjCSelector, arg: ObjCObject, wait: Boolean): Unit {
        Native.objc_msgSend("void", this, "performSelectorOnMainThread:withObject:waitUntilDone:", aSelector, arg, wait)
    }

    public open fun performSelector_onThread_withObject_waitUntilDone_modes(aSelector: ObjCSelector, thr: NSThread, arg: ObjCObject, wait: Boolean, array: NSArray): Unit {
        Native.objc_msgSend("void", this, "performSelector:onThread:withObject:waitUntilDone:modes:", aSelector, thr, arg, wait, array)
    }

    public open fun performSelector_onThread_withObject_waitUntilDone(aSelector: ObjCSelector, thr: NSThread, arg: ObjCObject, wait: Boolean): Unit {
        Native.objc_msgSend("void", this, "performSelector:onThread:withObject:waitUntilDone:", aSelector, thr, arg, wait)
    }

    public open fun performSelectorInBackground_withObject(aSelector: ObjCSelector, arg: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performSelectorInBackground:withObject:", aSelector, arg)
    }

    trait metaclass : IObjCObject
}
