// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDragging.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSDraggingInfo {
    trait metaclass
}

trait NSDraggingDestination {
    trait metaclass
}

trait NSDraggingSource {
    trait metaclass
}

trait NSObject_NSDraggingSourceDeprecated : IObjCObject {
    public open fun namesOfPromisedFilesDroppedAtDestination(dropDestination: NSURL): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "namesOfPromisedFilesDroppedAtDestination:", dropDestination) as NSArray

    public open fun draggingSourceOperationMaskForLocal(flag: Boolean): Any =
        Native.objc_msgSend("class objc.Any", this, "draggingSourceOperationMaskForLocal:", flag)

    public open fun draggedImage_beganAt(image: NSImage, screenPoint: Any): Unit {
        Native.objc_msgSend("void", this, "draggedImage:beganAt:", image, screenPoint)
    }

    public open fun draggedImage_endedAt_operation(image: NSImage, screenPoint: Any, operation: Any): Unit {
        Native.objc_msgSend("void", this, "draggedImage:endedAt:operation:", image, screenPoint, operation)
    }

    public open fun draggedImage_movedTo(image: NSImage, screenPoint: Any): Unit {
        Native.objc_msgSend("void", this, "draggedImage:movedTo:", image, screenPoint)
    }

    public open fun ignoreModifierKeysWhileDragging(): Boolean =
        Native.objc_msgSend("boolean", this, "ignoreModifierKeysWhileDragging") as Boolean

    public open fun draggedImage_endedAt_deposited(image: NSImage, screenPoint: Any, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "draggedImage:endedAt:deposited:", image, screenPoint, flag)
    }

    trait metaclass : IObjCObject
}
