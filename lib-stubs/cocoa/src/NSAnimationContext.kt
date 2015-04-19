// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSAnimationContext.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSAnimationContext(pointer: Long) : NSObject(pointer) {
    public open fun duration(): Double =
        Native.objc_msgSend("double", this, "duration") as Double

    public open fun setDuration(duration: Double): Unit {
        Native.objc_msgSend("void", this, "setDuration:", duration)
    }

    public open fun timingFunction(): CAMediaTimingFunction =
        Native.objc_msgSend("class objc.CAMediaTimingFunction", this, "timingFunction") as CAMediaTimingFunction

    public open fun setTimingFunction(timingFunction: CAMediaTimingFunction): Unit {
        Native.objc_msgSend("void", this, "setTimingFunction:", timingFunction)
    }

    public open fun completionHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "completionHandler")

    public open fun setCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "setCompletionHandler:", completionHandler)
    }

    public open fun allowsImplicitAnimation(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsImplicitAnimation") as Boolean

    public open fun setAllowsImplicitAnimation(allowsImplicitAnimation: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsImplicitAnimation:", allowsImplicitAnimation)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun runAnimationGroup_completionHandler(changes: Any, completionHandler: Any): Unit {
            Native.objc_msgSend("void", this, "runAnimationGroup:completionHandler:", changes, completionHandler)
        }

        public open fun beginGrouping(): Unit {
            Native.objc_msgSend("void", this, "beginGrouping")
        }

        public open fun endGrouping(): Unit {
            Native.objc_msgSend("void", this, "endGrouping")
        }

        public open fun currentContext(): NSAnimationContext =
            Native.objc_msgSend("class objc.NSAnimationContext", this, "currentContext") as NSAnimationContext

    }

    companion object : NSObject(Native.objc_getClass("NSAnimationContext")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
