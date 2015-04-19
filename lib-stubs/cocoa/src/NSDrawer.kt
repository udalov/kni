// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDrawer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSDrawerDelegate {
    trait metaclass
}

public open class NSDrawer(pointer: Long) : NSResponder(pointer), NSAccessibilityElementProtocol, NSAccessibility {
    public open fun initWithContentSize_preferredEdge(contentSize: Any, edge: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentSize:preferredEdge:", contentSize, edge) as ObjCObject

    public open fun parentWindow(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "parentWindow") as NSWindow

    public open fun setParentWindow(parentWindow: NSWindow): Unit {
        Native.objc_msgSend("void", this, "setParentWindow:", parentWindow)
    }

    public open fun contentView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "contentView") as NSView

    public open fun setContentView(contentView: NSView): Unit {
        Native.objc_msgSend("void", this, "setContentView:", contentView)
    }

    public open fun preferredEdge(): Int =
        Native.objc_msgSend("int", this, "preferredEdge") as Int

    public open fun setPreferredEdge(preferredEdge: Int): Unit {
        Native.objc_msgSend("void", this, "setPreferredEdge:", preferredEdge)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun open(): Unit {
        Native.objc_msgSend("void", this, "open")
    }

    public open fun openOnEdge(edge: Int): Unit {
        Native.objc_msgSend("void", this, "openOnEdge:", edge)
    }

    public open fun close(): Unit {
        Native.objc_msgSend("void", this, "close")
    }

    public open fun open(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "open:", sender)
    }

    public open fun close(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "close:", sender)
    }

    public open fun toggle(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggle:", sender)
    }

    public open fun state(): Int =
        Native.objc_msgSend("int", this, "state") as Int

    public open fun edge(): Int =
        Native.objc_msgSend("int", this, "edge") as Int

    public open fun contentSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentSize")

    public open fun setContentSize(contentSize: Any): Unit {
        Native.objc_msgSend("void", this, "setContentSize:", contentSize)
    }

    public open fun minContentSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "minContentSize")

    public open fun setMinContentSize(minContentSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMinContentSize:", minContentSize)
    }

    public open fun maxContentSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "maxContentSize")

    public open fun setMaxContentSize(maxContentSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMaxContentSize:", maxContentSize)
    }

    public open fun leadingOffset(): Double =
        Native.objc_msgSend("double", this, "leadingOffset") as Double

    public open fun setLeadingOffset(leadingOffset: Double): Unit {
        Native.objc_msgSend("void", this, "setLeadingOffset:", leadingOffset)
    }

    public open fun trailingOffset(): Double =
        Native.objc_msgSend("double", this, "trailingOffset") as Double

    public open fun setTrailingOffset(trailingOffset: Double): Unit {
        Native.objc_msgSend("void", this, "setTrailingOffset:", trailingOffset)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSResponder.metaclass, NSAccessibilityElementProtocol.metaclass, NSAccessibility.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDrawer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSWindow_Drawers : IObjCObject {
    public open fun drawers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "drawers") as NSArray

    trait metaclass : IObjCObject
}
