// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDraggingSession.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDraggingSession(pointer: Long) : NSObject(pointer) {
    public open fun draggingFormation(): Any =
        Native.objc_msgSend("class objc.Any", this, "draggingFormation")

    public open fun setDraggingFormation(draggingFormation: Any): Unit {
        Native.objc_msgSend("void", this, "setDraggingFormation:", draggingFormation)
    }

    public open fun animatesToStartingPositionsOnCancelOrFail(): Boolean =
        Native.objc_msgSend("boolean", this, "animatesToStartingPositionsOnCancelOrFail") as Boolean

    public open fun setAnimatesToStartingPositionsOnCancelOrFail(animatesToStartingPositionsOnCancelOrFail: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAnimatesToStartingPositionsOnCancelOrFail:", animatesToStartingPositionsOnCancelOrFail)
    }

    public open fun draggingLeaderIndex(): Int =
        Native.objc_msgSend("int", this, "draggingLeaderIndex") as Int

    public open fun setDraggingLeaderIndex(draggingLeaderIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setDraggingLeaderIndex:", draggingLeaderIndex)
    }

    public open fun draggingPasteboard(): NSPasteboard =
        Native.objc_msgSend("class objc.NSPasteboard", this, "draggingPasteboard") as NSPasteboard

    public open fun draggingSequenceNumber(): Int =
        Native.objc_msgSend("int", this, "draggingSequenceNumber") as Int

    public open fun draggingLocation(): Any =
        Native.objc_msgSend("class objc.Any", this, "draggingLocation")

    public open fun enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock(enumOpts: Any, view: NSView, classArray: NSArray, searchOptions: NSDictionary, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateDraggingItemsWithOptions:forView:classes:searchOptions:usingBlock:", enumOpts, view, classArray, searchOptions, block)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDraggingSession")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
