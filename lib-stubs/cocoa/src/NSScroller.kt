// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSScroller.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScroller(pointer: Long) : NSControl(pointer), NSScroller_NSDeprecated {
    public open fun scrollerStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "scrollerStyle")

    public open fun setScrollerStyle(scrollerStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setScrollerStyle:", scrollerStyle)
    }

    public open fun knobStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "knobStyle")

    public open fun setKnobStyle(knobStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setKnobStyle:", knobStyle)
    }

    public open fun drawParts(): Unit {
        Native.objc_msgSend("void", this, "drawParts")
    }

    public open fun rectForPart(partCode: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rectForPart:", partCode)

    public open fun checkSpaceForParts(): Unit {
        Native.objc_msgSend("void", this, "checkSpaceForParts")
    }

    public open fun usableParts(): Any =
        Native.objc_msgSend("class objc.Any", this, "usableParts")

    public open fun arrowsPosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "arrowsPosition")

    public open fun setArrowsPosition(arrowsPosition: Any): Unit {
        Native.objc_msgSend("void", this, "setArrowsPosition:", arrowsPosition)
    }

    public open fun controlTint(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlTint")

    public open fun setControlTint(controlTint: Any): Unit {
        Native.objc_msgSend("void", this, "setControlTint:", controlTint)
    }

    override fun controlSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlSize")

    override fun setControlSize(controlSize: Any): Unit {
        Native.objc_msgSend("void", this, "setControlSize:", controlSize)
    }

    public open fun drawArrow_highlight(whichArrow: Any, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "drawArrow:highlight:", whichArrow, flag)
    }

    public open fun drawKnob(): Unit {
        Native.objc_msgSend("void", this, "drawKnob")
    }

    public open fun drawKnobSlotInRect_highlight(slotRect: Any, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "drawKnobSlotInRect:highlight:", slotRect, flag)
    }

    public open fun highlight(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "highlight:", flag)
    }

    public open fun testPart(thePoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "testPart:", thePoint)

    public open fun trackKnob(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "trackKnob:", theEvent)
    }

    public open fun trackScrollButtons(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "trackScrollButtons:", theEvent)
    }

    public open fun hitPart(): Any =
        Native.objc_msgSend("class objc.Any", this, "hitPart")

    public open fun knobProportion(): Double =
        Native.objc_msgSend("double", this, "knobProportion") as Double

    public open fun setKnobProportion(proportion: Double): Unit {
        Native.objc_msgSend("void", this, "setKnobProportion:", proportion)
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

    trait metaclass : NSControl.metaclass, NSScroller_NSDeprecated.metaclass {
        public open fun isCompatibleWithOverlayScrollers(): Boolean =
            Native.objc_msgSend("boolean", this, "isCompatibleWithOverlayScrollers") as Boolean

        public open fun scrollerWidthForControlSize_scrollerStyle(controlSize: Any, scrollerStyle: Any): Double =
            Native.objc_msgSend("double", this, "scrollerWidthForControlSize:scrollerStyle:", controlSize, scrollerStyle) as Double

        public open fun scrollerWidthForControlSize(controlSize: Any): Double =
            Native.objc_msgSend("double", this, "scrollerWidthForControlSize:", controlSize) as Double

        public open fun scrollerWidth(): Double =
            Native.objc_msgSend("double", this, "scrollerWidth") as Double

        public open fun preferredScrollerStyle(): Any =
            Native.objc_msgSend("class objc.Any", this, "preferredScrollerStyle")

    }

    companion object : NSObject(Native.objc_getClass("NSScroller")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSScroller_NSDeprecated : IObjCObject {
    public open fun setFloatValue_knobProportion(aFloat: Float, proportion: Double): Unit {
        Native.objc_msgSend("void", this, "setFloatValue:knobProportion:", aFloat, proportion)
    }

    trait metaclass : IObjCObject
}
