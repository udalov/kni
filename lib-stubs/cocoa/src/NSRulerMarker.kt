// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSRulerMarker.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSRulerMarker(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun initWithRulerView_markerLocation_image_imageOrigin(ruler: NSRulerView, location: Double, image: NSImage, imageOrigin: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRulerView:markerLocation:image:imageOrigin:", ruler, location, image, imageOrigin) as ObjCObject

    public open fun ruler(): NSRulerView =
        Native.objc_msgSend("class objc.NSRulerView", this, "ruler") as NSRulerView

    public open fun markerLocation(): Double =
        Native.objc_msgSend("double", this, "markerLocation") as Double

    public open fun setMarkerLocation(markerLocation: Double): Unit {
        Native.objc_msgSend("void", this, "setMarkerLocation:", markerLocation)
    }

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
    }

    public open fun imageOrigin(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageOrigin")

    public open fun setImageOrigin(imageOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "setImageOrigin:", imageOrigin)
    }

    public open fun isMovable(): Boolean =
        Native.objc_msgSend("boolean", this, "isMovable") as Boolean

    public open fun setMovable(movable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setMovable:", movable)
    }

    public open fun isRemovable(): Boolean =
        Native.objc_msgSend("boolean", this, "isRemovable") as Boolean

    public open fun setRemovable(removable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRemovable:", removable)
    }

    public open fun isDragging(): Boolean =
        Native.objc_msgSend("boolean", this, "isDragging") as Boolean

    public open fun representedObject(): Any =
        Native.objc_msgSend("class objc.Any", this, "representedObject")

    public open fun setRepresentedObject(representedObject: Any): Unit {
        Native.objc_msgSend("void", this, "setRepresentedObject:", representedObject)
    }

    public open fun imageRectInRuler(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageRectInRuler")

    public open fun thicknessRequiredInRuler(): Double =
        Native.objc_msgSend("double", this, "thicknessRequiredInRuler") as Double

    public open fun drawRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "drawRect:", rect)
    }

    public open fun trackMouse_adding(mouseDownEvent: NSEvent, isAdding: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "trackMouse:adding:", mouseDownEvent, isAdding) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSRulerMarker")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
