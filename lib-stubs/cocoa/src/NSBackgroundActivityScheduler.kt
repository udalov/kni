// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSBackgroundActivityScheduler.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSBackgroundActivityScheduler(pointer: Long) : NSObject(pointer) {
    public open fun initWithIdentifier(identifier: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIdentifier:", identifier) as ObjCObject

    public open fun identifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "identifier") as NSString

    public open fun qualityOfService(): Any =
        Native.objc_msgSend("class objc.Any", this, "qualityOfService")

    public open fun setQualityOfService(qualityOfService: Any): Unit {
        Native.objc_msgSend("void", this, "setQualityOfService:", qualityOfService)
    }

    public open fun repeats(): Boolean =
        Native.objc_msgSend("boolean", this, "repeats") as Boolean

    public open fun setRepeats(repeats: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRepeats:", repeats)
    }

    public open fun interval(): Double =
        Native.objc_msgSend("double", this, "interval") as Double

    public open fun setInterval(interval: Double): Unit {
        Native.objc_msgSend("void", this, "setInterval:", interval)
    }

    public open fun tolerance(): Double =
        Native.objc_msgSend("double", this, "tolerance") as Double

    public open fun setTolerance(tolerance: Double): Unit {
        Native.objc_msgSend("void", this, "setTolerance:", tolerance)
    }

    public open fun scheduleWithBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "scheduleWithBlock:", block)
    }

    public open fun invalidate(): Unit {
        Native.objc_msgSend("void", this, "invalidate")
    }

    public open fun shouldDefer(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldDefer") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSBackgroundActivityScheduler")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
