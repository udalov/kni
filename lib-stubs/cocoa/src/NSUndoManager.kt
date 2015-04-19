// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSUndoManager.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSUndoManager(pointer: Long) : NSObject(pointer) {
    public open fun beginUndoGrouping(): Unit {
        Native.objc_msgSend("void", this, "beginUndoGrouping")
    }

    public open fun endUndoGrouping(): Unit {
        Native.objc_msgSend("void", this, "endUndoGrouping")
    }

    public open fun groupingLevel(): Int =
        Native.objc_msgSend("int", this, "groupingLevel") as Int

    public open fun disableUndoRegistration(): Unit {
        Native.objc_msgSend("void", this, "disableUndoRegistration")
    }

    public open fun enableUndoRegistration(): Unit {
        Native.objc_msgSend("void", this, "enableUndoRegistration")
    }

    public open fun isUndoRegistrationEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isUndoRegistrationEnabled") as Boolean

    public open fun groupsByEvent(): Boolean =
        Native.objc_msgSend("boolean", this, "groupsByEvent") as Boolean

    public open fun setGroupsByEvent(groupsByEvent: Boolean): Unit {
        Native.objc_msgSend("void", this, "setGroupsByEvent:", groupsByEvent)
    }

    public open fun levelsOfUndo(): Int =
        Native.objc_msgSend("int", this, "levelsOfUndo") as Int

    public open fun setLevelsOfUndo(levelsOfUndo: Int): Unit {
        Native.objc_msgSend("void", this, "setLevelsOfUndo:", levelsOfUndo)
    }

    public open fun runLoopModes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "runLoopModes") as NSArray

    public open fun setRunLoopModes(runLoopModes: NSArray): Unit {
        Native.objc_msgSend("void", this, "setRunLoopModes:", runLoopModes)
    }

    public open fun undo(): Unit {
        Native.objc_msgSend("void", this, "undo")
    }

    public open fun redo(): Unit {
        Native.objc_msgSend("void", this, "redo")
    }

    public open fun undoNestedGroup(): Unit {
        Native.objc_msgSend("void", this, "undoNestedGroup")
    }

    public open fun canUndo(): Boolean =
        Native.objc_msgSend("boolean", this, "canUndo") as Boolean

    public open fun canRedo(): Boolean =
        Native.objc_msgSend("boolean", this, "canRedo") as Boolean

    public open fun isUndoing(): Boolean =
        Native.objc_msgSend("boolean", this, "isUndoing") as Boolean

    public open fun isRedoing(): Boolean =
        Native.objc_msgSend("boolean", this, "isRedoing") as Boolean

    public open fun removeAllActions(): Unit {
        Native.objc_msgSend("void", this, "removeAllActions")
    }

    public open fun removeAllActionsWithTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeAllActionsWithTarget:", target)
    }

    public open fun registerUndoWithTarget_selector_object(target: ObjCObject, selector: ObjCSelector, anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "registerUndoWithTarget:selector:object:", target, selector, anObject)
    }

    public open fun prepareWithInvocationTarget(target: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "prepareWithInvocationTarget:", target) as ObjCObject

    public open fun setActionIsDiscardable(discardable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setActionIsDiscardable:", discardable)
    }

    public open fun undoActionIsDiscardable(): Boolean =
        Native.objc_msgSend("boolean", this, "undoActionIsDiscardable") as Boolean

    public open fun redoActionIsDiscardable(): Boolean =
        Native.objc_msgSend("boolean", this, "redoActionIsDiscardable") as Boolean

    public open fun undoActionName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "undoActionName") as NSString

    public open fun redoActionName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "redoActionName") as NSString

    public open fun setActionName(actionName: NSString): Unit {
        Native.objc_msgSend("void", this, "setActionName:", actionName)
    }

    public open fun undoMenuItemTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "undoMenuItemTitle") as NSString

    public open fun redoMenuItemTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "redoMenuItemTitle") as NSString

    public open fun undoMenuTitleForUndoActionName(actionName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "undoMenuTitleForUndoActionName:", actionName) as NSString

    public open fun redoMenuTitleForUndoActionName(actionName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "redoMenuTitleForUndoActionName:", actionName) as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSUndoManager")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
