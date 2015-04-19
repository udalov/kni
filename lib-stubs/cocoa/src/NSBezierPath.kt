// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSBezierPath.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSBezierPath(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSBezierPath_NSBezierPathDeprecated {
    public open fun moveToPoint(point: Any): Unit {
        Native.objc_msgSend("void", this, "moveToPoint:", point)
    }

    public open fun lineToPoint(point: Any): Unit {
        Native.objc_msgSend("void", this, "lineToPoint:", point)
    }

    public open fun curveToPoint_controlPoint1_controlPoint2(endPoint: Any, controlPoint1: Any, controlPoint2: Any): Unit {
        Native.objc_msgSend("void", this, "curveToPoint:controlPoint1:controlPoint2:", endPoint, controlPoint1, controlPoint2)
    }

    public open fun closePath(): Unit {
        Native.objc_msgSend("void", this, "closePath")
    }

    public open fun removeAllPoints(): Unit {
        Native.objc_msgSend("void", this, "removeAllPoints")
    }

    public open fun relativeMoveToPoint(point: Any): Unit {
        Native.objc_msgSend("void", this, "relativeMoveToPoint:", point)
    }

    public open fun relativeLineToPoint(point: Any): Unit {
        Native.objc_msgSend("void", this, "relativeLineToPoint:", point)
    }

    public open fun relativeCurveToPoint_controlPoint1_controlPoint2(endPoint: Any, controlPoint1: Any, controlPoint2: Any): Unit {
        Native.objc_msgSend("void", this, "relativeCurveToPoint:controlPoint1:controlPoint2:", endPoint, controlPoint1, controlPoint2)
    }

    public open fun lineWidth(): Double =
        Native.objc_msgSend("double", this, "lineWidth") as Double

    public open fun setLineWidth(lineWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setLineWidth:", lineWidth)
    }

    public open fun lineCapStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "lineCapStyle")

    public open fun setLineCapStyle(lineCapStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setLineCapStyle:", lineCapStyle)
    }

    public open fun lineJoinStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "lineJoinStyle")

    public open fun setLineJoinStyle(lineJoinStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setLineJoinStyle:", lineJoinStyle)
    }

    public open fun windingRule(): Any =
        Native.objc_msgSend("class objc.Any", this, "windingRule")

    public open fun setWindingRule(windingRule: Any): Unit {
        Native.objc_msgSend("void", this, "setWindingRule:", windingRule)
    }

    public open fun miterLimit(): Double =
        Native.objc_msgSend("double", this, "miterLimit") as Double

    public open fun setMiterLimit(miterLimit: Double): Unit {
        Native.objc_msgSend("void", this, "setMiterLimit:", miterLimit)
    }

    public open fun flatness(): Double =
        Native.objc_msgSend("double", this, "flatness") as Double

    public open fun setFlatness(flatness: Double): Unit {
        Native.objc_msgSend("void", this, "setFlatness:", flatness)
    }

    public open fun getLineDash_count_phase(pattern: Pointer<Double>, count: Pointer<Int>, phase: Pointer<Double>): Unit {
        Native.objc_msgSend("void", this, "getLineDash:count:phase:", pattern, count, phase)
    }

    public open fun setLineDash_count_phase(pattern: Pointer<Double>, count: Int, phase: Double): Unit {
        Native.objc_msgSend("void", this, "setLineDash:count:phase:", pattern, count, phase)
    }

    public open fun stroke(): Unit {
        Native.objc_msgSend("void", this, "stroke")
    }

    public open fun fill(): Unit {
        Native.objc_msgSend("void", this, "fill")
    }

    public open fun addClip(): Unit {
        Native.objc_msgSend("void", this, "addClip")
    }

    public open fun setClip(): Unit {
        Native.objc_msgSend("void", this, "setClip")
    }

    public open fun bezierPathByFlatteningPath(): NSBezierPath =
        Native.objc_msgSend("class objc.NSBezierPath", this, "bezierPathByFlatteningPath") as NSBezierPath

    public open fun bezierPathByReversingPath(): NSBezierPath =
        Native.objc_msgSend("class objc.NSBezierPath", this, "bezierPathByReversingPath") as NSBezierPath

    public open fun transformUsingAffineTransform(transform: NSAffineTransform): Unit {
        Native.objc_msgSend("void", this, "transformUsingAffineTransform:", transform)
    }

    public open fun isEmpty(): Boolean =
        Native.objc_msgSend("boolean", this, "isEmpty") as Boolean

    public open fun currentPoint(): Any =
        Native.objc_msgSend("class objc.Any", this, "currentPoint")

    public open fun controlPointBounds(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlPointBounds")

    public open fun bounds(): Any =
        Native.objc_msgSend("class objc.Any", this, "bounds")

    public open fun elementCount(): Int =
        Native.objc_msgSend("int", this, "elementCount") as Int

    public open fun elementAtIndex_associatedPoints(index: Int, points: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "elementAtIndex:associatedPoints:", index, points)

    public open fun elementAtIndex(index: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "elementAtIndex:", index)

    public open fun setAssociatedPoints_atIndex(points: Pointer<Any>, index: Int): Unit {
        Native.objc_msgSend("void", this, "setAssociatedPoints:atIndex:", points, index)
    }

    public open fun appendBezierPath(path: NSBezierPath): Unit {
        Native.objc_msgSend("void", this, "appendBezierPath:", path)
    }

    public open fun appendBezierPathWithRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithRect:", rect)
    }

    public open fun appendBezierPathWithPoints_count(points: Pointer<Any>, count: Int): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithPoints:count:", points, count)
    }

    public open fun appendBezierPathWithOvalInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithOvalInRect:", rect)
    }

    public open fun appendBezierPathWithArcWithCenter_radius_startAngle_endAngle_clockwise(center: Any, radius: Double, startAngle: Double, endAngle: Double, clockwise: Boolean): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithArcWithCenter:radius:startAngle:endAngle:clockwise:", center, radius, startAngle, endAngle, clockwise)
    }

    public open fun appendBezierPathWithArcWithCenter_radius_startAngle_endAngle(center: Any, radius: Double, startAngle: Double, endAngle: Double): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithArcWithCenter:radius:startAngle:endAngle:", center, radius, startAngle, endAngle)
    }

    public open fun appendBezierPathWithArcFromPoint_toPoint_radius(point1: Any, point2: Any, radius: Double): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithArcFromPoint:toPoint:radius:", point1, point2, radius)
    }

    public open fun appendBezierPathWithGlyph_inFont(glyph: Int, font: NSFont): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithGlyph:inFont:", glyph, font)
    }

    public open fun appendBezierPathWithGlyphs_count_inFont(glyphs: Pointer<Int>, count: Int, font: NSFont): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithGlyphs:count:inFont:", glyphs, count, font)
    }

    public open fun appendBezierPathWithPackedGlyphs(packedGlyphs: Pointer<Char>): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithPackedGlyphs:", packedGlyphs)
    }

    public open fun appendBezierPathWithRoundedRect_xRadius_yRadius(rect: Any, xRadius: Double, yRadius: Double): Unit {
        Native.objc_msgSend("void", this, "appendBezierPathWithRoundedRect:xRadius:yRadius:", rect, xRadius, yRadius)
    }

    public open fun containsPoint(point: Any): Boolean =
        Native.objc_msgSend("boolean", this, "containsPoint:", point) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSBezierPath_NSBezierPathDeprecated.metaclass {
        public open fun bezierPath(): NSBezierPath =
            Native.objc_msgSend("class objc.NSBezierPath", this, "bezierPath") as NSBezierPath

        public open fun bezierPathWithRect(rect: Any): NSBezierPath =
            Native.objc_msgSend("class objc.NSBezierPath", this, "bezierPathWithRect:", rect) as NSBezierPath

        public open fun bezierPathWithOvalInRect(rect: Any): NSBezierPath =
            Native.objc_msgSend("class objc.NSBezierPath", this, "bezierPathWithOvalInRect:", rect) as NSBezierPath

        public open fun bezierPathWithRoundedRect_xRadius_yRadius(rect: Any, xRadius: Double, yRadius: Double): NSBezierPath =
            Native.objc_msgSend("class objc.NSBezierPath", this, "bezierPathWithRoundedRect:xRadius:yRadius:", rect, xRadius, yRadius) as NSBezierPath

        public open fun fillRect(rect: Any): Unit {
            Native.objc_msgSend("void", this, "fillRect:", rect)
        }

        public open fun strokeRect(rect: Any): Unit {
            Native.objc_msgSend("void", this, "strokeRect:", rect)
        }

        public open fun clipRect(rect: Any): Unit {
            Native.objc_msgSend("void", this, "clipRect:", rect)
        }

        public open fun strokeLineFromPoint_toPoint(point1: Any, point2: Any): Unit {
            Native.objc_msgSend("void", this, "strokeLineFromPoint:toPoint:", point1, point2)
        }

        public open fun drawPackedGlyphs_atPoint(packedGlyphs: Pointer<Char>, point: Any): Unit {
            Native.objc_msgSend("void", this, "drawPackedGlyphs:atPoint:", packedGlyphs, point)
        }

        public open fun setDefaultMiterLimit(limit: Double): Unit {
            Native.objc_msgSend("void", this, "setDefaultMiterLimit:", limit)
        }

        public open fun defaultMiterLimit(): Double =
            Native.objc_msgSend("double", this, "defaultMiterLimit") as Double

        public open fun setDefaultFlatness(flatness: Double): Unit {
            Native.objc_msgSend("void", this, "setDefaultFlatness:", flatness)
        }

        public open fun defaultFlatness(): Double =
            Native.objc_msgSend("double", this, "defaultFlatness") as Double

        public open fun setDefaultWindingRule(windingRule: Any): Unit {
            Native.objc_msgSend("void", this, "setDefaultWindingRule:", windingRule)
        }

        public open fun defaultWindingRule(): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultWindingRule")

        public open fun setDefaultLineCapStyle(lineCapStyle: Any): Unit {
            Native.objc_msgSend("void", this, "setDefaultLineCapStyle:", lineCapStyle)
        }

        public open fun defaultLineCapStyle(): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultLineCapStyle")

        public open fun setDefaultLineJoinStyle(lineJoinStyle: Any): Unit {
            Native.objc_msgSend("void", this, "setDefaultLineJoinStyle:", lineJoinStyle)
        }

        public open fun defaultLineJoinStyle(): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultLineJoinStyle")

        public open fun setDefaultLineWidth(lineWidth: Double): Unit {
            Native.objc_msgSend("void", this, "setDefaultLineWidth:", lineWidth)
        }

        public open fun defaultLineWidth(): Double =
            Native.objc_msgSend("double", this, "defaultLineWidth") as Double

    }

    companion object : NSObject(Native.objc_getClass("NSBezierPath")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSBezierPath_NSBezierPathDeprecated : IObjCObject {
    public open fun cachesBezierPath(): Boolean =
        Native.objc_msgSend("boolean", this, "cachesBezierPath") as Boolean

    public open fun setCachesBezierPath(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCachesBezierPath:", flag)
    }

    trait metaclass : IObjCObject
}
