// generated from "/System/Library/Frameworks/QuartzCore.framework/Headers/../Frameworks/CoreImage.framework/Headers/CIColor.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class CIColor(pointer: Long) : NSObject(pointer), NSCoding, NSCopying, CIColor_NSAppKitAdditions {
    public open fun initWithCGColor(c: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGColor:", c) as ObjCObject

    public open fun numberOfComponents(): Int =
        Native.objc_msgSend("int", this, "numberOfComponents") as Int

    public open fun components(): Pointer<Double> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "components") as Pointer<Double>

    public open fun alpha(): Double =
        Native.objc_msgSend("double", this, "alpha") as Double

    public open fun colorSpace(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "colorSpace") as Pointer<Any>

    public open fun red(): Double =
        Native.objc_msgSend("double", this, "red") as Double

    public open fun green(): Double =
        Native.objc_msgSend("double", this, "green") as Double

    public open fun blue(): Double =
        Native.objc_msgSend("double", this, "blue") as Double

    public open fun stringRepresentation(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringRepresentation") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSCopying.metaclass, CIColor_NSAppKitAdditions.metaclass {
        public open fun colorWithCGColor(c: Pointer<Any>): CIColor =
            Native.objc_msgSend("class objc.CIColor", this, "colorWithCGColor:", c) as CIColor

        public open fun colorWithRed_green_blue_alpha(r: Double, g: Double, b: Double, a: Double): CIColor =
            Native.objc_msgSend("class objc.CIColor", this, "colorWithRed:green:blue:alpha:", r, g, b, a) as CIColor

        public open fun colorWithRed_green_blue(r: Double, g: Double, b: Double): CIColor =
            Native.objc_msgSend("class objc.CIColor", this, "colorWithRed:green:blue:", r, g, b) as CIColor

        public open fun colorWithString(representation: NSString): CIColor =
            Native.objc_msgSend("class objc.CIColor", this, "colorWithString:", representation) as CIColor

    }

    companion object : NSObject(Native.objc_getClass("CIColor")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
