// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSProgressIndicator.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSProgressIndicator(pointer: Long) : NSView(pointer), NSAccessibilityProgressIndicator, NSProgressIndicator_NSProgressIndicatorDeprecated {
    public open fun isIndeterminate(): Boolean =
        Native.objc_msgSend("boolean", this, "isIndeterminate") as Boolean

    public open fun setIndeterminate(indeterminate: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIndeterminate:", indeterminate)
    }

    public open fun isBezeled(): Boolean =
        Native.objc_msgSend("boolean", this, "isBezeled") as Boolean

    public open fun setBezeled(bezeled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBezeled:", bezeled)
    }

    public open fun controlTint(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlTint")

    public open fun setControlTint(controlTint: Any): Unit {
        Native.objc_msgSend("void", this, "setControlTint:", controlTint)
    }

    public open fun controlSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlSize")

    public open fun setControlSize(controlSize: Any): Unit {
        Native.objc_msgSend("void", this, "setControlSize:", controlSize)
    }

    public open fun doubleValue(): Double =
        Native.objc_msgSend("double", this, "doubleValue") as Double

    public open fun setDoubleValue(doubleValue: Double): Unit {
        Native.objc_msgSend("void", this, "setDoubleValue:", doubleValue)
    }

    public open fun incrementBy(delta: Double): Unit {
        Native.objc_msgSend("void", this, "incrementBy:", delta)
    }

    public open fun minValue(): Double =
        Native.objc_msgSend("double", this, "minValue") as Double

    public open fun setMinValue(minValue: Double): Unit {
        Native.objc_msgSend("void", this, "setMinValue:", minValue)
    }

    public open fun maxValue(): Double =
        Native.objc_msgSend("double", this, "maxValue") as Double

    public open fun setMaxValue(maxValue: Double): Unit {
        Native.objc_msgSend("void", this, "setMaxValue:", maxValue)
    }

    public open fun usesThreadedAnimation(): Boolean =
        Native.objc_msgSend("boolean", this, "usesThreadedAnimation") as Boolean

    public open fun setUsesThreadedAnimation(usesThreadedAnimation: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesThreadedAnimation:", usesThreadedAnimation)
    }

    public open fun startAnimation(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "startAnimation:", sender)
    }

    public open fun stopAnimation(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "stopAnimation:", sender)
    }

    public open fun style(): Any =
        Native.objc_msgSend("class objc.Any", this, "style")

    public open fun setStyle(style: Any): Unit {
        Native.objc_msgSend("void", this, "setStyle:", style)
    }

    public open fun sizeToFit(): Unit {
        Native.objc_msgSend("void", this, "sizeToFit")
    }

    public open fun isDisplayedWhenStopped(): Boolean =
        Native.objc_msgSend("boolean", this, "isDisplayedWhenStopped") as Boolean

    public open fun setDisplayedWhenStopped(displayedWhenStopped: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDisplayedWhenStopped:", displayedWhenStopped)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass, NSAccessibilityProgressIndicator.metaclass, NSProgressIndicator_NSProgressIndicatorDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSProgressIndicator")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSProgressIndicator_NSProgressIndicatorDeprecated : IObjCObject {
    public open fun animationDelay(): Double =
        Native.objc_msgSend("double", this, "animationDelay") as Double

    public open fun setAnimationDelay(delay: Double): Unit {
        Native.objc_msgSend("void", this, "setAnimationDelay:", delay)
    }

    public open fun animate(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "animate:", sender)
    }

    trait metaclass : IObjCObject
}
