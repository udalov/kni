// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSAffineTransform.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSAffineTransform(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSAffineTransform_NSAppKitAdditons {
    public open fun initWithTransform(transform: NSAffineTransform): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTransform:", transform) as ObjCObject

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun translateXBy_yBy(deltaX: Double, deltaY: Double): Unit {
        Native.objc_msgSend("void", this, "translateXBy:yBy:", deltaX, deltaY)
    }

    public open fun rotateByDegrees(angle: Double): Unit {
        Native.objc_msgSend("void", this, "rotateByDegrees:", angle)
    }

    public open fun rotateByRadians(angle: Double): Unit {
        Native.objc_msgSend("void", this, "rotateByRadians:", angle)
    }

    public open fun scaleBy(scale: Double): Unit {
        Native.objc_msgSend("void", this, "scaleBy:", scale)
    }

    public open fun scaleXBy_yBy(scaleX: Double, scaleY: Double): Unit {
        Native.objc_msgSend("void", this, "scaleXBy:yBy:", scaleX, scaleY)
    }

    public open fun invert(): Unit {
        Native.objc_msgSend("void", this, "invert")
    }

    public open fun appendTransform(transform: NSAffineTransform): Unit {
        Native.objc_msgSend("void", this, "appendTransform:", transform)
    }

    public open fun prependTransform(transform: NSAffineTransform): Unit {
        Native.objc_msgSend("void", this, "prependTransform:", transform)
    }

    public open fun transformPoint(aPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "transformPoint:", aPoint)

    public open fun transformSize(aSize: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "transformSize:", aSize)

    public open fun transformStruct(): Any =
        Native.objc_msgSend("class objc.Any", this, "transformStruct")

    public open fun setTransformStruct(transformStruct: Any): Unit {
        Native.objc_msgSend("void", this, "setTransformStruct:", transformStruct)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSAffineTransform_NSAppKitAdditons.metaclass {
        public open fun transform(): NSAffineTransform =
            Native.objc_msgSend("class objc.NSAffineTransform", this, "transform") as NSAffineTransform

    }

    companion object : NSObject(Native.objc_getClass("NSAffineTransform")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSAffineTransform_NSAppKitAdditons : IObjCObject {
    public open fun transformBezierPath(aPath: NSBezierPath): NSBezierPath =
        Native.objc_msgSend("class objc.NSBezierPath", this, "transformBezierPath:", aPath) as NSBezierPath

    public open fun set(): Unit {
        Native.objc_msgSend("void", this, "set")
    }

    public open fun concat(): Unit {
        Native.objc_msgSend("void", this, "concat")
    }

    trait metaclass : IObjCObject
}
