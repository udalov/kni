// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPopover.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSPopoverDelegate {
    trait metaclass
}

public open class NSPopover(pointer: Long) : NSResponder(pointer), NSAppearanceCustomization, NSAccessibilityElementProtocol, NSAccessibility {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun appearance(): NSAppearance =
        Native.objc_msgSend("class objc.NSAppearance", this, "appearance") as NSAppearance

    public open fun setAppearance(appearance: NSAppearance): Unit {
        Native.objc_msgSend("void", this, "setAppearance:", appearance)
    }

    public open fun effectiveAppearance(): NSAppearance =
        Native.objc_msgSend("class objc.NSAppearance", this, "effectiveAppearance") as NSAppearance

    public open fun behavior(): Any =
        Native.objc_msgSend("class objc.Any", this, "behavior")

    public open fun setBehavior(behavior: Any): Unit {
        Native.objc_msgSend("void", this, "setBehavior:", behavior)
    }

    public open fun animates(): Boolean =
        Native.objc_msgSend("boolean", this, "animates") as Boolean

    public open fun setAnimates(animates: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAnimates:", animates)
    }

    public open fun contentViewController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "contentViewController") as NSViewController

    public open fun setContentViewController(contentViewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "setContentViewController:", contentViewController)
    }

    public open fun contentSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentSize")

    public open fun setContentSize(contentSize: Any): Unit {
        Native.objc_msgSend("void", this, "setContentSize:", contentSize)
    }

    public open fun isShown(): Boolean =
        Native.objc_msgSend("boolean", this, "isShown") as Boolean

    public open fun positioningRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "positioningRect")

    public open fun setPositioningRect(positioningRect: Any): Unit {
        Native.objc_msgSend("void", this, "setPositioningRect:", positioningRect)
    }

    public open fun showRelativeToRect_ofView_preferredEdge(positioningRect: Any, positioningView: NSView, preferredEdge: Int): Unit {
        Native.objc_msgSend("void", this, "showRelativeToRect:ofView:preferredEdge:", positioningRect, positioningView, preferredEdge)
    }

    public open fun performClose(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performClose:", sender)
    }

    public open fun close(): Unit {
        Native.objc_msgSend("void", this, "close")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSResponder.metaclass, NSAppearanceCustomization.metaclass, NSAccessibilityElementProtocol.metaclass, NSAccessibility.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPopover")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
