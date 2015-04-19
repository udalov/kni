// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSLevelIndicator.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSLevelIndicator(pointer: Long) : NSControl(pointer) {
    public open fun levelIndicatorStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "levelIndicatorStyle")

    public open fun setLevelIndicatorStyle(levelIndicatorStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setLevelIndicatorStyle:", levelIndicatorStyle)
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

    public open fun warningValue(): Double =
        Native.objc_msgSend("double", this, "warningValue") as Double

    public open fun setWarningValue(warningValue: Double): Unit {
        Native.objc_msgSend("void", this, "setWarningValue:", warningValue)
    }

    public open fun criticalValue(): Double =
        Native.objc_msgSend("double", this, "criticalValue") as Double

    public open fun setCriticalValue(criticalValue: Double): Unit {
        Native.objc_msgSend("void", this, "setCriticalValue:", criticalValue)
    }

    public open fun tickMarkPosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "tickMarkPosition")

    public open fun setTickMarkPosition(tickMarkPosition: Any): Unit {
        Native.objc_msgSend("void", this, "setTickMarkPosition:", tickMarkPosition)
    }

    public open fun numberOfTickMarks(): Int =
        Native.objc_msgSend("int", this, "numberOfTickMarks") as Int

    public open fun setNumberOfTickMarks(numberOfTickMarks: Int): Unit {
        Native.objc_msgSend("void", this, "setNumberOfTickMarks:", numberOfTickMarks)
    }

    public open fun numberOfMajorTickMarks(): Int =
        Native.objc_msgSend("int", this, "numberOfMajorTickMarks") as Int

    public open fun setNumberOfMajorTickMarks(numberOfMajorTickMarks: Int): Unit {
        Native.objc_msgSend("void", this, "setNumberOfMajorTickMarks:", numberOfMajorTickMarks)
    }

    public open fun tickMarkValueAtIndex(index: Int): Double =
        Native.objc_msgSend("double", this, "tickMarkValueAtIndex:", index) as Double

    public open fun rectOfTickMarkAtIndex(index: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rectOfTickMarkAtIndex:", index)

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

    trait metaclass : NSControl.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSLevelIndicator")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
