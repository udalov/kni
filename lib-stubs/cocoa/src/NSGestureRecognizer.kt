// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSGestureRecognizer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSGestureRecognizerDelegate {
    trait metaclass
}

public open class NSGestureRecognizer(pointer: Long) : NSObject(pointer), NSCoding, NSGestureRecognizer_NSSubclassUse {
    public open fun initWithTarget_action(target: ObjCObject, action: ObjCSelector): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTarget:action:", target, action) as ObjCObject

    public open fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    public open fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    public open fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    public open fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    override fun state(): Any =
        Native.objc_msgSend("class objc.Any", this, "state")

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun isEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabled") as Boolean

    public open fun setEnabled(enabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEnabled:", enabled)
    }

    public open fun view(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "view") as NSView

    public open fun delaysPrimaryMouseButtonEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "delaysPrimaryMouseButtonEvents") as Boolean

    public open fun setDelaysPrimaryMouseButtonEvents(delaysPrimaryMouseButtonEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDelaysPrimaryMouseButtonEvents:", delaysPrimaryMouseButtonEvents)
    }

    public open fun delaysSecondaryMouseButtonEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "delaysSecondaryMouseButtonEvents") as Boolean

    public open fun setDelaysSecondaryMouseButtonEvents(delaysSecondaryMouseButtonEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDelaysSecondaryMouseButtonEvents:", delaysSecondaryMouseButtonEvents)
    }

    public open fun delaysOtherMouseButtonEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "delaysOtherMouseButtonEvents") as Boolean

    public open fun setDelaysOtherMouseButtonEvents(delaysOtherMouseButtonEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDelaysOtherMouseButtonEvents:", delaysOtherMouseButtonEvents)
    }

    public open fun delaysKeyEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "delaysKeyEvents") as Boolean

    public open fun setDelaysKeyEvents(delaysKeyEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDelaysKeyEvents:", delaysKeyEvents)
    }

    public open fun delaysMagnificationEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "delaysMagnificationEvents") as Boolean

    public open fun setDelaysMagnificationEvents(delaysMagnificationEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDelaysMagnificationEvents:", delaysMagnificationEvents)
    }

    public open fun delaysRotationEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "delaysRotationEvents") as Boolean

    public open fun setDelaysRotationEvents(delaysRotationEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDelaysRotationEvents:", delaysRotationEvents)
    }

    public open fun locationInView(view: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "locationInView:", view)

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSGestureRecognizer_NSSubclassUse.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSGestureRecognizer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSGestureRecognizer_NSSubclassUse : IObjCObject {
    public open fun state(): Any =
        Native.objc_msgSend("class objc.Any", this, "state")

    public open fun setState(state: Any): Unit {
        Native.objc_msgSend("void", this, "setState:", state)
    }

    public open fun reset(): Unit {
        Native.objc_msgSend("void", this, "reset")
    }

    public open fun canPreventGestureRecognizer(preventedGestureRecognizer: NSGestureRecognizer): Boolean =
        Native.objc_msgSend("boolean", this, "canPreventGestureRecognizer:", preventedGestureRecognizer) as Boolean

    public open fun canBePreventedByGestureRecognizer(preventingGestureRecognizer: NSGestureRecognizer): Boolean =
        Native.objc_msgSend("boolean", this, "canBePreventedByGestureRecognizer:", preventingGestureRecognizer) as Boolean

    public open fun shouldRequireFailureOfGestureRecognizer(otherGestureRecognizer: NSGestureRecognizer): Boolean =
        Native.objc_msgSend("boolean", this, "shouldRequireFailureOfGestureRecognizer:", otherGestureRecognizer) as Boolean

    public open fun shouldBeRequiredToFailByGestureRecognizer(otherGestureRecognizer: NSGestureRecognizer): Boolean =
        Native.objc_msgSend("boolean", this, "shouldBeRequiredToFailByGestureRecognizer:", otherGestureRecognizer) as Boolean

    public open fun mouseDown(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDown:", event)
    }

    public open fun rightMouseDown(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rightMouseDown:", event)
    }

    public open fun otherMouseDown(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "otherMouseDown:", event)
    }

    public open fun mouseUp(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseUp:", event)
    }

    public open fun rightMouseUp(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rightMouseUp:", event)
    }

    public open fun otherMouseUp(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "otherMouseUp:", event)
    }

    public open fun mouseDragged(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDragged:", event)
    }

    public open fun rightMouseDragged(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rightMouseDragged:", event)
    }

    public open fun otherMouseDragged(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "otherMouseDragged:", event)
    }

    public open fun keyDown(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "keyDown:", event)
    }

    public open fun keyUp(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "keyUp:", event)
    }

    public open fun flagsChanged(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "flagsChanged:", event)
    }

    public open fun tabletPoint(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "tabletPoint:", event)
    }

    public open fun magnifyWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "magnifyWithEvent:", event)
    }

    public open fun rotateWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rotateWithEvent:", event)
    }

    public open fun pressureChangeWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "pressureChangeWithEvent:", event)
    }

    trait metaclass : IObjCObject
}
