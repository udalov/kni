// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSGradient.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSGradient(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun initWithStartingColor_endingColor(startingColor: NSColor, endingColor: NSColor): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithStartingColor:endingColor:", startingColor, endingColor) as ObjCObject

    public open fun initWithColors(colorArray: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithColors:", colorArray) as ObjCObject

    public open fun initWithColorsAndLocations(firstColor: NSColor): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithColorsAndLocations:", firstColor) as ObjCObject

    public open fun initWithColors_atLocations_colorSpace(colorArray: NSArray, locations: Pointer<Double>, colorSpace: NSColorSpace): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithColors:atLocations:colorSpace:", colorArray, locations, colorSpace) as ObjCObject

    public open fun drawFromPoint_toPoint_options(startingPoint: Any, endingPoint: Any, options: Int): Unit {
        Native.objc_msgSend("void", this, "drawFromPoint:toPoint:options:", startingPoint, endingPoint, options)
    }

    public open fun drawInRect_angle(rect: Any, angle: Double): Unit {
        Native.objc_msgSend("void", this, "drawInRect:angle:", rect, angle)
    }

    public open fun drawInBezierPath_angle(path: NSBezierPath, angle: Double): Unit {
        Native.objc_msgSend("void", this, "drawInBezierPath:angle:", path, angle)
    }

    public open fun drawFromCenter_radius_toCenter_radius_options(startCenter: Any, startRadius: Double, endCenter: Any, endRadius: Double, options: Int): Unit {
        Native.objc_msgSend("void", this, "drawFromCenter:radius:toCenter:radius:options:", startCenter, startRadius, endCenter, endRadius, options)
    }

    public open fun drawInRect_relativeCenterPosition(rect: Any, relativeCenterPosition: Any): Unit {
        Native.objc_msgSend("void", this, "drawInRect:relativeCenterPosition:", rect, relativeCenterPosition)
    }

    public open fun drawInBezierPath_relativeCenterPosition(path: NSBezierPath, relativeCenterPosition: Any): Unit {
        Native.objc_msgSend("void", this, "drawInBezierPath:relativeCenterPosition:", path, relativeCenterPosition)
    }

    public open fun colorSpace(): NSColorSpace =
        Native.objc_msgSend("class objc.NSColorSpace", this, "colorSpace") as NSColorSpace

    public open fun numberOfColorStops(): Int =
        Native.objc_msgSend("int", this, "numberOfColorStops") as Int

    public open fun getColor_location_atIndex(color: Pointer<NSColor>, location: Pointer<Double>, index: Int): Unit {
        Native.objc_msgSend("void", this, "getColor:location:atIndex:", color, location, index)
    }

    public open fun interpolatedColorAtLocation(location: Double): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "interpolatedColorAtLocation:", location) as NSColor

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSGradient")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
