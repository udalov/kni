// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSClipView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSClipView(pointer: Long) : NSView(pointer), NSClipView_NSDeprecated {
    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun drawsBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsBackground") as Boolean

    public open fun setDrawsBackground(drawsBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsBackground:", drawsBackground)
    }

    public open fun documentView(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "documentView") as ObjCObject

    public open fun setDocumentView(documentView: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setDocumentView:", documentView)
    }

    public open fun documentRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "documentRect")

    public open fun documentCursor(): NSCursor =
        Native.objc_msgSend("class objc.NSCursor", this, "documentCursor") as NSCursor

    public open fun setDocumentCursor(documentCursor: NSCursor): Unit {
        Native.objc_msgSend("void", this, "setDocumentCursor:", documentCursor)
    }

    public open fun documentVisibleRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "documentVisibleRect")

    public open fun viewFrameChanged(notification: NSNotification): Unit {
        Native.objc_msgSend("void", this, "viewFrameChanged:", notification)
    }

    public open fun viewBoundsChanged(notification: NSNotification): Unit {
        Native.objc_msgSend("void", this, "viewBoundsChanged:", notification)
    }

    public open fun copiesOnScroll(): Boolean =
        Native.objc_msgSend("boolean", this, "copiesOnScroll") as Boolean

    public open fun setCopiesOnScroll(copiesOnScroll: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCopiesOnScroll:", copiesOnScroll)
    }

    override fun autoscroll(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "autoscroll:", theEvent) as Boolean

    public open fun scrollToPoint(newOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "scrollToPoint:", newOrigin)
    }

    public open fun constrainBoundsRect(proposedBounds: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "constrainBoundsRect:", proposedBounds)

    public open fun contentInsets(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentInsets")

    public open fun setContentInsets(contentInsets: Any): Unit {
        Native.objc_msgSend("void", this, "setContentInsets:", contentInsets)
    }

    public open fun automaticallyAdjustsContentInsets(): Boolean =
        Native.objc_msgSend("boolean", this, "automaticallyAdjustsContentInsets") as Boolean

    public open fun setAutomaticallyAdjustsContentInsets(automaticallyAdjustsContentInsets: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticallyAdjustsContentInsets:", automaticallyAdjustsContentInsets)
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

    trait metaclass : NSView.metaclass, NSClipView_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSClipView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSClipView_NSDeprecated : IObjCObject {
    public open fun constrainScrollPoint(newOrigin: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "constrainScrollPoint:", newOrigin)

    trait metaclass : IObjCObject
}

trait NSView_NSClipViewSuperview : IObjCObject {
    public open fun reflectScrolledClipView(aClipView: NSClipView): Unit {
        Native.objc_msgSend("void", this, "reflectScrolledClipView:", aClipView)
    }

    public open fun scrollClipView_toPoint(aClipView: NSClipView, aPoint: Any): Unit {
        Native.objc_msgSend("void", this, "scrollClipView:toPoint:", aClipView, aPoint)
    }

    trait metaclass : IObjCObject
}
