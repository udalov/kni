// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSStepperCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSStepperCell(pointer: Long) : NSActionCell(pointer) {
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

    public open fun increment(): Double =
        Native.objc_msgSend("double", this, "increment") as Double

    public open fun setIncrement(increment: Double): Unit {
        Native.objc_msgSend("void", this, "setIncrement:", increment)
    }

    public open fun valueWraps(): Boolean =
        Native.objc_msgSend("boolean", this, "valueWraps") as Boolean

    public open fun setValueWraps(valueWraps: Boolean): Unit {
        Native.objc_msgSend("void", this, "setValueWraps:", valueWraps)
    }

    public open fun autorepeat(): Boolean =
        Native.objc_msgSend("boolean", this, "autorepeat") as Boolean

    public open fun setAutorepeat(autorepeat: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutorepeat:", autorepeat)
    }

    override fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    override fun setTag(tag: Int): Unit {
        Native.objc_msgSend("void", this, "setTag:", tag)
    }

    override fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    override fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    trait metaclass : NSActionCell.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSStepperCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
