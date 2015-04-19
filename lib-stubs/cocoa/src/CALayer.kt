// generated from "/System/Library/Frameworks/QuartzCore.framework/Headers/CALayer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait CAAction {
    trait metaclass
}

public open class CALayer(pointer: Long) : NSObject(pointer), NSCoding, CAMediaTiming {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithLayer(layer: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithLayer:", layer) as ObjCObject

    public open fun presentationLayer(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "presentationLayer") as ObjCObject

    public open fun modelLayer(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "modelLayer") as ObjCObject

    public open fun shouldArchiveValueForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "shouldArchiveValueForKey:", key) as Boolean

    public open fun bounds(): Any =
        Native.objc_msgSend("class objc.Any", this, "bounds")

    public open fun setBounds(bounds: Any): Unit {
        Native.objc_msgSend("void", this, "setBounds:", bounds)
    }

    public open fun position(): Any =
        Native.objc_msgSend("class objc.Any", this, "position")

    public open fun setPosition(position: Any): Unit {
        Native.objc_msgSend("void", this, "setPosition:", position)
    }

    public open fun zPosition(): Double =
        Native.objc_msgSend("double", this, "zPosition") as Double

    public open fun setZPosition(zPosition: Double): Unit {
        Native.objc_msgSend("void", this, "setZPosition:", zPosition)
    }

    public open fun anchorPoint(): Any =
        Native.objc_msgSend("class objc.Any", this, "anchorPoint")

    public open fun setAnchorPoint(anchorPoint: Any): Unit {
        Native.objc_msgSend("void", this, "setAnchorPoint:", anchorPoint)
    }

    public open fun anchorPointZ(): Double =
        Native.objc_msgSend("double", this, "anchorPointZ") as Double

    public open fun setAnchorPointZ(anchorPointZ: Double): Unit {
        Native.objc_msgSend("void", this, "setAnchorPointZ:", anchorPointZ)
    }

    public open fun transform(): Any =
        Native.objc_msgSend("class objc.Any", this, "transform")

    public open fun setTransform(transform: Any): Unit {
        Native.objc_msgSend("void", this, "setTransform:", transform)
    }

    public open fun affineTransform(): Any =
        Native.objc_msgSend("class objc.Any", this, "affineTransform")

    public open fun setAffineTransform(m: Any): Unit {
        Native.objc_msgSend("void", this, "setAffineTransform:", m)
    }

    public open fun frame(): Any =
        Native.objc_msgSend("class objc.Any", this, "frame")

    public open fun setFrame(frame: Any): Unit {
        Native.objc_msgSend("void", this, "setFrame:", frame)
    }

    public open fun isHidden(): Boolean =
        Native.objc_msgSend("boolean", this, "isHidden") as Boolean

    public open fun setHidden(hidden: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHidden:", hidden)
    }

    public open fun isDoubleSided(): Boolean =
        Native.objc_msgSend("boolean", this, "isDoubleSided") as Boolean

    public open fun setDoubleSided(doubleSided: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDoubleSided:", doubleSided)
    }

    public open fun isGeometryFlipped(): Boolean =
        Native.objc_msgSend("boolean", this, "isGeometryFlipped") as Boolean

    public open fun setGeometryFlipped(geometryFlipped: Boolean): Unit {
        Native.objc_msgSend("void", this, "setGeometryFlipped:", geometryFlipped)
    }

    public open fun contentsAreFlipped(): Boolean =
        Native.objc_msgSend("boolean", this, "contentsAreFlipped") as Boolean

    public open fun superlayer(): CALayer =
        Native.objc_msgSend("class objc.CALayer", this, "superlayer") as CALayer

    public open fun removeFromSuperlayer(): Unit {
        Native.objc_msgSend("void", this, "removeFromSuperlayer")
    }

    public open fun sublayers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sublayers") as NSArray

    public open fun setSublayers(sublayers: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSublayers:", sublayers)
    }

    public open fun addSublayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "addSublayer:", layer)
    }

    public open fun insertSublayer_atIndex(layer: CALayer, idx: Int): Unit {
        Native.objc_msgSend("void", this, "insertSublayer:atIndex:", layer, idx)
    }

    public open fun insertSublayer_below(layer: CALayer, sibling: CALayer): Unit {
        Native.objc_msgSend("void", this, "insertSublayer:below:", layer, sibling)
    }

    public open fun insertSublayer_above(layer: CALayer, sibling: CALayer): Unit {
        Native.objc_msgSend("void", this, "insertSublayer:above:", layer, sibling)
    }

    public open fun replaceSublayer_with(layer: CALayer, layer2: CALayer): Unit {
        Native.objc_msgSend("void", this, "replaceSublayer:with:", layer, layer2)
    }

    public open fun sublayerTransform(): Any =
        Native.objc_msgSend("class objc.Any", this, "sublayerTransform")

    public open fun setSublayerTransform(sublayerTransform: Any): Unit {
        Native.objc_msgSend("void", this, "setSublayerTransform:", sublayerTransform)
    }

    public open fun mask(): CALayer =
        Native.objc_msgSend("class objc.CALayer", this, "mask") as CALayer

    public open fun setMask(mask: CALayer): Unit {
        Native.objc_msgSend("void", this, "setMask:", mask)
    }

    public open fun masksToBounds(): Boolean =
        Native.objc_msgSend("boolean", this, "masksToBounds") as Boolean

    public open fun setMasksToBounds(masksToBounds: Boolean): Unit {
        Native.objc_msgSend("void", this, "setMasksToBounds:", masksToBounds)
    }

    public open fun convertPoint_fromLayer(p: Any, l: CALayer): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPoint:fromLayer:", p, l)

    public open fun convertPoint_toLayer(p: Any, l: CALayer): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPoint:toLayer:", p, l)

    public open fun convertRect_fromLayer(r: Any, l: CALayer): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRect:fromLayer:", r, l)

    public open fun convertRect_toLayer(r: Any, l: CALayer): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRect:toLayer:", r, l)

    public open fun convertTime_fromLayer(t: Double, l: CALayer): Double =
        Native.objc_msgSend("double", this, "convertTime:fromLayer:", t, l) as Double

    public open fun convertTime_toLayer(t: Double, l: CALayer): Double =
        Native.objc_msgSend("double", this, "convertTime:toLayer:", t, l) as Double

    public open fun hitTest(p: Any): CALayer =
        Native.objc_msgSend("class objc.CALayer", this, "hitTest:", p) as CALayer

    public open fun containsPoint(p: Any): Boolean =
        Native.objc_msgSend("boolean", this, "containsPoint:", p) as Boolean

    public open fun contents(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "contents") as ObjCObject

    public open fun setContents(contents: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setContents:", contents)
    }

    public open fun contentsRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentsRect")

    public open fun setContentsRect(contentsRect: Any): Unit {
        Native.objc_msgSend("void", this, "setContentsRect:", contentsRect)
    }

    public open fun contentsGravity(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "contentsGravity") as NSString

    public open fun setContentsGravity(contentsGravity: NSString): Unit {
        Native.objc_msgSend("void", this, "setContentsGravity:", contentsGravity)
    }

    public open fun contentsScale(): Double =
        Native.objc_msgSend("double", this, "contentsScale") as Double

    public open fun setContentsScale(contentsScale: Double): Unit {
        Native.objc_msgSend("void", this, "setContentsScale:", contentsScale)
    }

    public open fun contentsCenter(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentsCenter")

    public open fun setContentsCenter(contentsCenter: Any): Unit {
        Native.objc_msgSend("void", this, "setContentsCenter:", contentsCenter)
    }

    public open fun minificationFilter(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "minificationFilter") as NSString

    public open fun setMinificationFilter(minificationFilter: NSString): Unit {
        Native.objc_msgSend("void", this, "setMinificationFilter:", minificationFilter)
    }

    public open fun magnificationFilter(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "magnificationFilter") as NSString

    public open fun setMagnificationFilter(magnificationFilter: NSString): Unit {
        Native.objc_msgSend("void", this, "setMagnificationFilter:", magnificationFilter)
    }

    public open fun minificationFilterBias(): Float =
        Native.objc_msgSend("float", this, "minificationFilterBias") as Float

    public open fun setMinificationFilterBias(minificationFilterBias: Float): Unit {
        Native.objc_msgSend("void", this, "setMinificationFilterBias:", minificationFilterBias)
    }

    public open fun isOpaque(): Boolean =
        Native.objc_msgSend("boolean", this, "isOpaque") as Boolean

    public open fun setOpaque(opaque: Boolean): Unit {
        Native.objc_msgSend("void", this, "setOpaque:", opaque)
    }

    public open fun display(): Unit {
        Native.objc_msgSend("void", this, "display")
    }

    public open fun setNeedsDisplay(): Unit {
        Native.objc_msgSend("void", this, "setNeedsDisplay")
    }

    public open fun setNeedsDisplayInRect(r: Any): Unit {
        Native.objc_msgSend("void", this, "setNeedsDisplayInRect:", r)
    }

    public open fun needsDisplay(): Boolean =
        Native.objc_msgSend("boolean", this, "needsDisplay") as Boolean

    public open fun displayIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "displayIfNeeded")
    }

    public open fun needsDisplayOnBoundsChange(): Boolean =
        Native.objc_msgSend("boolean", this, "needsDisplayOnBoundsChange") as Boolean

    public open fun setNeedsDisplayOnBoundsChange(needsDisplayOnBoundsChange: Boolean): Unit {
        Native.objc_msgSend("void", this, "setNeedsDisplayOnBoundsChange:", needsDisplayOnBoundsChange)
    }

    public open fun drawsAsynchronously(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsAsynchronously") as Boolean

    public open fun setDrawsAsynchronously(drawsAsynchronously: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsAsynchronously:", drawsAsynchronously)
    }

    public open fun drawInContext(ctx: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "drawInContext:", ctx)
    }

    public open fun renderInContext(ctx: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "renderInContext:", ctx)
    }

    public open fun edgeAntialiasingMask(): Any =
        Native.objc_msgSend("class objc.Any", this, "edgeAntialiasingMask")

    public open fun setEdgeAntialiasingMask(edgeAntialiasingMask: Any): Unit {
        Native.objc_msgSend("void", this, "setEdgeAntialiasingMask:", edgeAntialiasingMask)
    }

    public open fun backgroundColor(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "backgroundColor") as Pointer<Any>

    public open fun setBackgroundColor(backgroundColor: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun cornerRadius(): Double =
        Native.objc_msgSend("double", this, "cornerRadius") as Double

    public open fun setCornerRadius(cornerRadius: Double): Unit {
        Native.objc_msgSend("void", this, "setCornerRadius:", cornerRadius)
    }

    public open fun borderWidth(): Double =
        Native.objc_msgSend("double", this, "borderWidth") as Double

    public open fun setBorderWidth(borderWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setBorderWidth:", borderWidth)
    }

    public open fun borderColor(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "borderColor") as Pointer<Any>

    public open fun setBorderColor(borderColor: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "setBorderColor:", borderColor)
    }

    public open fun opacity(): Float =
        Native.objc_msgSend("float", this, "opacity") as Float

    public open fun setOpacity(opacity: Float): Unit {
        Native.objc_msgSend("void", this, "setOpacity:", opacity)
    }

    public open fun compositingFilter(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "compositingFilter") as ObjCObject

    public open fun setCompositingFilter(compositingFilter: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setCompositingFilter:", compositingFilter)
    }

    public open fun filters(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "filters") as NSArray

    public open fun setFilters(filters: NSArray): Unit {
        Native.objc_msgSend("void", this, "setFilters:", filters)
    }

    public open fun backgroundFilters(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "backgroundFilters") as NSArray

    public open fun setBackgroundFilters(backgroundFilters: NSArray): Unit {
        Native.objc_msgSend("void", this, "setBackgroundFilters:", backgroundFilters)
    }

    public open fun shouldRasterize(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldRasterize") as Boolean

    public open fun setShouldRasterize(shouldRasterize: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShouldRasterize:", shouldRasterize)
    }

    public open fun rasterizationScale(): Double =
        Native.objc_msgSend("double", this, "rasterizationScale") as Double

    public open fun setRasterizationScale(rasterizationScale: Double): Unit {
        Native.objc_msgSend("void", this, "setRasterizationScale:", rasterizationScale)
    }

    public open fun shadowColor(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "shadowColor") as Pointer<Any>

    public open fun setShadowColor(shadowColor: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "setShadowColor:", shadowColor)
    }

    public open fun shadowOpacity(): Float =
        Native.objc_msgSend("float", this, "shadowOpacity") as Float

    public open fun setShadowOpacity(shadowOpacity: Float): Unit {
        Native.objc_msgSend("void", this, "setShadowOpacity:", shadowOpacity)
    }

    public open fun shadowOffset(): Any =
        Native.objc_msgSend("class objc.Any", this, "shadowOffset")

    public open fun setShadowOffset(shadowOffset: Any): Unit {
        Native.objc_msgSend("void", this, "setShadowOffset:", shadowOffset)
    }

    public open fun shadowRadius(): Double =
        Native.objc_msgSend("double", this, "shadowRadius") as Double

    public open fun setShadowRadius(shadowRadius: Double): Unit {
        Native.objc_msgSend("void", this, "setShadowRadius:", shadowRadius)
    }

    public open fun shadowPath(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "shadowPath") as Pointer<Any>

    public open fun setShadowPath(shadowPath: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "setShadowPath:", shadowPath)
    }

    public open fun autoresizingMask(): Any =
        Native.objc_msgSend("class objc.Any", this, "autoresizingMask")

    public open fun setAutoresizingMask(autoresizingMask: Any): Unit {
        Native.objc_msgSend("void", this, "setAutoresizingMask:", autoresizingMask)
    }

    public open fun layoutManager(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "layoutManager") as ObjCObject

    public open fun setLayoutManager(layoutManager: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setLayoutManager:", layoutManager)
    }

    public open fun preferredFrameSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "preferredFrameSize")

    public open fun setNeedsLayout(): Unit {
        Native.objc_msgSend("void", this, "setNeedsLayout")
    }

    public open fun needsLayout(): Boolean =
        Native.objc_msgSend("boolean", this, "needsLayout") as Boolean

    public open fun layoutIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "layoutIfNeeded")
    }

    public open fun layoutSublayers(): Unit {
        Native.objc_msgSend("void", this, "layoutSublayers")
    }

    public open fun resizeSublayersWithOldSize(size: Any): Unit {
        Native.objc_msgSend("void", this, "resizeSublayersWithOldSize:", size)
    }

    public open fun resizeWithOldSuperlayerSize(size: Any): Unit {
        Native.objc_msgSend("void", this, "resizeWithOldSuperlayerSize:", size)
    }

    public open fun actionForKey(event: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "actionForKey:", event)

    public open fun actions(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "actions") as NSDictionary

    public open fun setActions(actions: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setActions:", actions)
    }

    public open fun addAnimation_forKey(anim: CAAnimation, key: NSString): Unit {
        Native.objc_msgSend("void", this, "addAnimation:forKey:", anim, key)
    }

    public open fun removeAllAnimations(): Unit {
        Native.objc_msgSend("void", this, "removeAllAnimations")
    }

    public open fun removeAnimationForKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "removeAnimationForKey:", key)
    }

    public open fun animationKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "animationKeys") as NSArray

    public open fun animationForKey(key: NSString): CAAnimation =
        Native.objc_msgSend("class objc.CAAnimation", this, "animationForKey:", key) as CAAnimation

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    public open fun delegate(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "delegate") as ObjCObject

    public open fun setDelegate(delegate: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun style(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "style") as NSDictionary

    public open fun setStyle(style: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setStyle:", style)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, CAMediaTiming.metaclass {
        public open fun layer(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "layer") as ObjCObject

        public open fun defaultValueForKey(key: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "defaultValueForKey:", key) as ObjCObject

        public open fun needsDisplayForKey(key: NSString): Boolean =
            Native.objc_msgSend("boolean", this, "needsDisplayForKey:", key) as Boolean

        public open fun defaultActionForKey(event: NSString): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultActionForKey:", event)

    }

    companion object : NSObject(Native.objc_getClass("CALayer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_CALayoutManager : IObjCObject {
    public open fun preferredSizeOfLayer(layer: CALayer): Any =
        Native.objc_msgSend("class objc.Any", this, "preferredSizeOfLayer:", layer)

    public open fun invalidateLayoutOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "invalidateLayoutOfLayer:", layer)
    }

    public open fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : IObjCObject
}

trait NSObject_CALayerDelegate : IObjCObject {
    public open fun displayLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "displayLayer:", layer)
    }

    public open fun drawLayer_inContext(layer: CALayer, ctx: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "drawLayer:inContext:", layer, ctx)
    }

    public open fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    public open fun actionForLayer_forKey(layer: CALayer, event: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "actionForLayer:forKey:", layer, event)

    trait metaclass : IObjCObject
}
