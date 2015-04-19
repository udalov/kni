// generated from "/System/Library/Frameworks/QuartzCore.framework/Frameworks/CoreImage.framework/Headers/CIVector.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class CIVector(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun initWithValues_count(values: Pointer<Double>, count: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithValues:count:", values, count) as ObjCObject

    public open fun initWithX(x: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithX:", x) as ObjCObject

    public open fun initWithX_Y(x: Double, y: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithX:Y:", x, y) as ObjCObject

    public open fun initWithX_Y_Z(x: Double, y: Double, z: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithX:Y:Z:", x, y, z) as ObjCObject

    public open fun initWithX_Y_Z_W(x: Double, y: Double, z: Double, w: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithX:Y:Z:W:", x, y, z, w) as ObjCObject

    public open fun initWithCGPoint(p: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGPoint:", p) as ObjCObject

    public open fun initWithCGRect(r: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGRect:", r) as ObjCObject

    public open fun initWithCGAffineTransform(r: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGAffineTransform:", r) as ObjCObject

    public open fun initWithString(representation: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:", representation) as ObjCObject

    public open fun valueAtIndex(index: Int): Double =
        Native.objc_msgSend("double", this, "valueAtIndex:", index) as Double

    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    public open fun X(): Double =
        Native.objc_msgSend("double", this, "X") as Double

    public open fun Y(): Double =
        Native.objc_msgSend("double", this, "Y") as Double

    public open fun Z(): Double =
        Native.objc_msgSend("double", this, "Z") as Double

    public open fun W(): Double =
        Native.objc_msgSend("double", this, "W") as Double

    public open fun CGPointValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "CGPointValue")

    public open fun CGRectValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "CGRectValue")

    public open fun CGAffineTransformValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "CGAffineTransformValue")

    public open fun stringRepresentation(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringRepresentation") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
        public open fun vectorWithValues_count(values: Pointer<Double>, count: Int): CIVector =
            Native.objc_msgSend("class objc.CIVector", this, "vectorWithValues:count:", values, count) as CIVector

        public open fun vectorWithX(x: Double): CIVector =
            Native.objc_msgSend("class objc.CIVector", this, "vectorWithX:", x) as CIVector

        public open fun vectorWithX_Y(x: Double, y: Double): CIVector =
            Native.objc_msgSend("class objc.CIVector", this, "vectorWithX:Y:", x, y) as CIVector

        public open fun vectorWithX_Y_Z(x: Double, y: Double, z: Double): CIVector =
            Native.objc_msgSend("class objc.CIVector", this, "vectorWithX:Y:Z:", x, y, z) as CIVector

        public open fun vectorWithX_Y_Z_W(x: Double, y: Double, z: Double, w: Double): CIVector =
            Native.objc_msgSend("class objc.CIVector", this, "vectorWithX:Y:Z:W:", x, y, z, w) as CIVector

        public open fun vectorWithCGPoint(p: Any): CIVector =
            Native.objc_msgSend("class objc.CIVector", this, "vectorWithCGPoint:", p) as CIVector

        public open fun vectorWithCGRect(r: Any): CIVector =
            Native.objc_msgSend("class objc.CIVector", this, "vectorWithCGRect:", r) as CIVector

        public open fun vectorWithCGAffineTransform(t: Any): CIVector =
            Native.objc_msgSend("class objc.CIVector", this, "vectorWithCGAffineTransform:", t) as CIVector

        public open fun vectorWithString(representation: NSString): CIVector =
            Native.objc_msgSend("class objc.CIVector", this, "vectorWithString:", representation) as CIVector

    }

    companion object : NSObject(Native.objc_getClass("CIVector")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
