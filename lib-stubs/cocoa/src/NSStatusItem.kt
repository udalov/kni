// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSStatusItem.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSStatusItem(pointer: Long) : NSObject(pointer), NSStatusItem_NSStatusItemDeprecated {
    public open fun statusBar(): NSStatusBar =
        Native.objc_msgSend("class objc.NSStatusBar", this, "statusBar") as NSStatusBar

    public open fun length(): Double =
        Native.objc_msgSend("double", this, "length") as Double

    public open fun setLength(length: Double): Unit {
        Native.objc_msgSend("void", this, "setLength:", length)
    }

    public open fun menu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menu") as NSMenu

    public open fun setMenu(menu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setMenu:", menu)
    }

    public open fun button(): NSStatusBarButton =
        Native.objc_msgSend("class objc.NSStatusBarButton", this, "button") as NSStatusBarButton

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSStatusItem_NSStatusItemDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSStatusItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSStatusItem_NSStatusItemDeprecated : IObjCObject {
    public open fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    public open fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    public open fun doubleAction(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "doubleAction") as ObjCSelector

    public open fun setDoubleAction(doubleAction: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setDoubleAction:", doubleAction)
    }

    public open fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    public open fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun attributedTitle(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedTitle") as NSAttributedString

    public open fun setAttributedTitle(attributedTitle: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedTitle:", attributedTitle)
    }

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
    }

    public open fun alternateImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "alternateImage") as NSImage

    public open fun setAlternateImage(alternateImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setAlternateImage:", alternateImage)
    }

    public open fun isEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabled") as Boolean

    public open fun setEnabled(enabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEnabled:", enabled)
    }

    public open fun highlightMode(): Boolean =
        Native.objc_msgSend("boolean", this, "highlightMode") as Boolean

    public open fun setHighlightMode(highlightMode: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHighlightMode:", highlightMode)
    }

    public open fun toolTip(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "toolTip") as NSString

    public open fun setToolTip(toolTip: NSString): Unit {
        Native.objc_msgSend("void", this, "setToolTip:", toolTip)
    }

    public open fun sendActionOn(mask: Int): Int =
        Native.objc_msgSend("int", this, "sendActionOn:", mask) as Int

    public open fun view(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "view") as NSView

    public open fun setView(view: NSView): Unit {
        Native.objc_msgSend("void", this, "setView:", view)
    }

    public open fun drawStatusBarBackgroundInRect_withHighlight(rect: Any, highlight: Boolean): Unit {
        Native.objc_msgSend("void", this, "drawStatusBarBackgroundInRect:withHighlight:", rect, highlight)
    }

    public open fun popUpStatusItemMenu(menu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "popUpStatusItemMenu:", menu)
    }

    trait metaclass : IObjCObject
}
