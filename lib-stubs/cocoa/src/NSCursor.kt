// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSCursor.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCursor(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun initWithImage_hotSpot(newImage: NSImage, aPoint: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithImage:hotSpot:", newImage, aPoint) as ObjCObject

    public open fun initWithImage_foregroundColorHint_backgroundColorHint_hotSpot(newImage: NSImage, fg: NSColor, bg: NSColor, hotSpot: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithImage:foregroundColorHint:backgroundColorHint:hotSpot:", newImage, fg, bg, hotSpot) as ObjCObject

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun hotSpot(): Any =
        Native.objc_msgSend("class objc.Any", this, "hotSpot")

    public open fun push(): Unit {
        Native.objc_msgSend("void", this, "push")
    }

    public open fun pop(): Unit {
        Native.objc_msgSend("void", this, "pop")
    }

    public open fun set(): Unit {
        Native.objc_msgSend("void", this, "set")
    }

    public open fun setOnMouseExited(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setOnMouseExited:", flag)
    }

    public open fun setOnMouseEntered(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setOnMouseEntered:", flag)
    }

    public open fun isSetOnMouseExited(): Boolean =
        Native.objc_msgSend("boolean", this, "isSetOnMouseExited") as Boolean

    public open fun isSetOnMouseEntered(): Boolean =
        Native.objc_msgSend("boolean", this, "isSetOnMouseEntered") as Boolean

    public open fun mouseEntered(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseEntered:", theEvent)
    }

    public open fun mouseExited(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseExited:", theEvent)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
        public open fun currentCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "currentCursor") as NSCursor

        public open fun currentSystemCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "currentSystemCursor") as NSCursor

        public open fun arrowCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "arrowCursor") as NSCursor

        public open fun IBeamCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "IBeamCursor") as NSCursor

        public open fun pointingHandCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "pointingHandCursor") as NSCursor

        public open fun closedHandCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "closedHandCursor") as NSCursor

        public open fun openHandCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "openHandCursor") as NSCursor

        public open fun resizeLeftCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "resizeLeftCursor") as NSCursor

        public open fun resizeRightCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "resizeRightCursor") as NSCursor

        public open fun resizeLeftRightCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "resizeLeftRightCursor") as NSCursor

        public open fun resizeUpCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "resizeUpCursor") as NSCursor

        public open fun resizeDownCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "resizeDownCursor") as NSCursor

        public open fun resizeUpDownCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "resizeUpDownCursor") as NSCursor

        public open fun crosshairCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "crosshairCursor") as NSCursor

        public open fun disappearingItemCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "disappearingItemCursor") as NSCursor

        public open fun operationNotAllowedCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "operationNotAllowedCursor") as NSCursor

        public open fun dragLinkCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "dragLinkCursor") as NSCursor

        public open fun dragCopyCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "dragCopyCursor") as NSCursor

        public open fun contextualMenuCursor(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "contextualMenuCursor") as NSCursor

        public open fun IBeamCursorForVerticalLayout(): NSCursor =
            Native.objc_msgSend("class objc.NSCursor", this, "IBeamCursorForVerticalLayout") as NSCursor

        public open fun hide(): Unit {
            Native.objc_msgSend("void", this, "hide")
        }

        public open fun unhide(): Unit {
            Native.objc_msgSend("void", this, "unhide")
        }

        public open fun setHiddenUntilMouseMoves(flag: Boolean): Unit {
            Native.objc_msgSend("void", this, "setHiddenUntilMouseMoves:", flag)
        }

        public open fun pop(): Unit {
            Native.objc_msgSend("void", this, "pop")
        }

    }

    companion object : NSObject(Native.objc_getClass("NSCursor")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
