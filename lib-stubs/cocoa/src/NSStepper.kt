// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSStepper.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSStepper(pointer: Long) : NSControl(pointer), NSAccessibilityStepper {
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

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun mouseDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDown:", theEvent)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    override fun refusesFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "refusesFirstResponder") as Boolean

    override fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    trait metaclass : NSControl.metaclass, NSAccessibilityStepper.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSStepper")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
