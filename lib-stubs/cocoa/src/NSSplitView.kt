// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSplitView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSSplitViewDelegate {
    trait metaclass
}

public open class NSSplitView(pointer: Long) : NSView(pointer), NSSplitView_NSDeprecated {
    public open fun isVertical(): Boolean =
        Native.objc_msgSend("boolean", this, "isVertical") as Boolean

    public open fun setVertical(vertical: Boolean): Unit {
        Native.objc_msgSend("void", this, "setVertical:", vertical)
    }

    public open fun dividerStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "dividerStyle")

    public open fun setDividerStyle(dividerStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setDividerStyle:", dividerStyle)
    }

    public open fun autosaveName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "autosaveName") as NSString

    public open fun setAutosaveName(autosaveName: NSString): Unit {
        Native.objc_msgSend("void", this, "setAutosaveName:", autosaveName)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun drawDividerInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "drawDividerInRect:", rect)
    }

    public open fun dividerColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "dividerColor") as NSColor

    public open fun dividerThickness(): Double =
        Native.objc_msgSend("double", this, "dividerThickness") as Double

    public open fun adjustSubviews(): Unit {
        Native.objc_msgSend("void", this, "adjustSubviews")
    }

    public open fun isSubviewCollapsed(subview: NSView): Boolean =
        Native.objc_msgSend("boolean", this, "isSubviewCollapsed:", subview) as Boolean

    public open fun minPossiblePositionOfDividerAtIndex(dividerIndex: Int): Double =
        Native.objc_msgSend("double", this, "minPossiblePositionOfDividerAtIndex:", dividerIndex) as Double

    public open fun maxPossiblePositionOfDividerAtIndex(dividerIndex: Int): Double =
        Native.objc_msgSend("double", this, "maxPossiblePositionOfDividerAtIndex:", dividerIndex) as Double

    public open fun setPosition_ofDividerAtIndex(position: Double, dividerIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setPosition:ofDividerAtIndex:", position, dividerIndex)
    }

    public open fun holdingPriorityForSubviewAtIndex(subviewIndex: Int): Float =
        Native.objc_msgSend("float", this, "holdingPriorityForSubviewAtIndex:", subviewIndex) as Float

    public open fun setHoldingPriority_forSubviewAtIndex(priority: Float, subviewIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setHoldingPriority:forSubviewAtIndex:", priority, subviewIndex)
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

    trait metaclass : NSView.metaclass, NSSplitView_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSplitView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSSplitView_NSDeprecated : IObjCObject {
    public open fun setIsPaneSplitter(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIsPaneSplitter:", flag)
    }

    public open fun isPaneSplitter(): Boolean =
        Native.objc_msgSend("boolean", this, "isPaneSplitter") as Boolean

    trait metaclass : IObjCObject
}
