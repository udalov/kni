// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSLevelIndicatorCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSLevelIndicatorCell(pointer: Long) : NSActionCell(pointer) {
    public open fun initWithLevelIndicatorStyle(levelIndicatorStyle: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithLevelIndicatorStyle:", levelIndicatorStyle) as ObjCObject

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

    public open fun rectOfTickMarkAtIndex(index: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rectOfTickMarkAtIndex:", index)

    public open fun tickMarkValueAtIndex(index: Int): Double =
        Native.objc_msgSend("double", this, "tickMarkValueAtIndex:", index) as Double

    override fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
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

    companion object : NSObject(Native.objc_getClass("NSLevelIndicatorCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
