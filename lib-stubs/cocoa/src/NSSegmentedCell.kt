// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSegmentedCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSSegmentedCell(pointer: Long) : NSActionCell(pointer), NSSegmentedCell_NSSegmentBackgroundStyle {
    public open fun segmentCount(): Int =
        Native.objc_msgSend("int", this, "segmentCount") as Int

    public open fun setSegmentCount(segmentCount: Int): Unit {
        Native.objc_msgSend("void", this, "setSegmentCount:", segmentCount)
    }

    public open fun selectedSegment(): Int =
        Native.objc_msgSend("int", this, "selectedSegment") as Int

    public open fun setSelectedSegment(selectedSegment: Int): Unit {
        Native.objc_msgSend("void", this, "setSelectedSegment:", selectedSegment)
    }

    public open fun selectSegmentWithTag(tag: Int): Boolean =
        Native.objc_msgSend("boolean", this, "selectSegmentWithTag:", tag) as Boolean

    public open fun makeNextSegmentKey(): Unit {
        Native.objc_msgSend("void", this, "makeNextSegmentKey")
    }

    public open fun makePreviousSegmentKey(): Unit {
        Native.objc_msgSend("void", this, "makePreviousSegmentKey")
    }

    public open fun trackingMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "trackingMode")

    public open fun setTrackingMode(trackingMode: Any): Unit {
        Native.objc_msgSend("void", this, "setTrackingMode:", trackingMode)
    }

    public open fun setWidth_forSegment(width: Double, segment: Int): Unit {
        Native.objc_msgSend("void", this, "setWidth:forSegment:", width, segment)
    }

    public open fun widthForSegment(segment: Int): Double =
        Native.objc_msgSend("double", this, "widthForSegment:", segment) as Double

    public open fun setImage_forSegment(image: NSImage, segment: Int): Unit {
        Native.objc_msgSend("void", this, "setImage:forSegment:", image, segment)
    }

    public open fun imageForSegment(segment: Int): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "imageForSegment:", segment) as NSImage

    public open fun setImageScaling_forSegment(scaling: Any, segment: Int): Unit {
        Native.objc_msgSend("void", this, "setImageScaling:forSegment:", scaling, segment)
    }

    public open fun imageScalingForSegment(segment: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "imageScalingForSegment:", segment)

    public open fun setLabel_forSegment(label: NSString, segment: Int): Unit {
        Native.objc_msgSend("void", this, "setLabel:forSegment:", label, segment)
    }

    public open fun labelForSegment(segment: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "labelForSegment:", segment) as NSString

    public open fun setSelected_forSegment(selected: Boolean, segment: Int): Unit {
        Native.objc_msgSend("void", this, "setSelected:forSegment:", selected, segment)
    }

    public open fun isSelectedForSegment(segment: Int): Boolean =
        Native.objc_msgSend("boolean", this, "isSelectedForSegment:", segment) as Boolean

    public open fun setEnabled_forSegment(enabled: Boolean, segment: Int): Unit {
        Native.objc_msgSend("void", this, "setEnabled:forSegment:", enabled, segment)
    }

    public open fun isEnabledForSegment(segment: Int): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabledForSegment:", segment) as Boolean

    public open fun setMenu_forSegment(menu: NSMenu, segment: Int): Unit {
        Native.objc_msgSend("void", this, "setMenu:forSegment:", menu, segment)
    }

    public open fun menuForSegment(segment: Int): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menuForSegment:", segment) as NSMenu

    public open fun setToolTip_forSegment(toolTip: NSString, segment: Int): Unit {
        Native.objc_msgSend("void", this, "setToolTip:forSegment:", toolTip, segment)
    }

    public open fun toolTipForSegment(segment: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "toolTipForSegment:", segment) as NSString

    public open fun setTag_forSegment(tag: Int, segment: Int): Unit {
        Native.objc_msgSend("void", this, "setTag:forSegment:", tag, segment)
    }

    public open fun tagForSegment(segment: Int): Int =
        Native.objc_msgSend("int", this, "tagForSegment:", segment) as Int

    public open fun segmentStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "segmentStyle")

    public open fun setSegmentStyle(segmentStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setSegmentStyle:", segmentStyle)
    }

    public open fun drawSegment_inFrame_withView(segment: Int, frame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawSegment:inFrame:withView:", segment, frame, controlView)
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

    trait metaclass : NSActionCell.metaclass, NSSegmentedCell_NSSegmentBackgroundStyle.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSegmentedCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSSegmentedCell_NSSegmentBackgroundStyle : IObjCObject {
    public open fun interiorBackgroundStyleForSegment(segment: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "interiorBackgroundStyleForSegment:", segment)

    trait metaclass : IObjCObject
}
