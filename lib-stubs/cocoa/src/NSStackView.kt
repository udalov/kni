// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSStackView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSStackViewDelegate {
    trait metaclass
}

public open class NSStackView(pointer: Long) : NSView(pointer) {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun orientation(): Any =
        Native.objc_msgSend("class objc.Any", this, "orientation")

    public open fun setOrientation(orientation: Any): Unit {
        Native.objc_msgSend("void", this, "setOrientation:", orientation)
    }

    public open fun alignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "alignment")

    public open fun setAlignment(alignment: Any): Unit {
        Native.objc_msgSend("void", this, "setAlignment:", alignment)
    }

    public open fun edgeInsets(): Any =
        Native.objc_msgSend("class objc.Any", this, "edgeInsets")

    public open fun setEdgeInsets(edgeInsets: Any): Unit {
        Native.objc_msgSend("void", this, "setEdgeInsets:", edgeInsets)
    }

    public open fun addView_inGravity(aView: NSView, gravity: Any): Unit {
        Native.objc_msgSend("void", this, "addView:inGravity:", aView, gravity)
    }

    public open fun insertView_atIndex_inGravity(aView: NSView, index: Int, gravity: Any): Unit {
        Native.objc_msgSend("void", this, "insertView:atIndex:inGravity:", aView, index, gravity)
    }

    public open fun removeView(aView: NSView): Unit {
        Native.objc_msgSend("void", this, "removeView:", aView)
    }

    public open fun viewsInGravity(gravity: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "viewsInGravity:", gravity) as NSArray

    public open fun setViews_inGravity(views: NSArray, gravity: Any): Unit {
        Native.objc_msgSend("void", this, "setViews:inGravity:", views, gravity)
    }

    public open fun views(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "views") as NSArray

    public open fun detachedViews(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "detachedViews") as NSArray

    public open fun setVisibilityPriority_forView(priority: Float, aView: NSView): Unit {
        Native.objc_msgSend("void", this, "setVisibilityPriority:forView:", priority, aView)
    }

    public open fun visibilityPriorityForView(aView: NSView): Float =
        Native.objc_msgSend("float", this, "visibilityPriorityForView:", aView) as Float

    public open fun spacing(): Double =
        Native.objc_msgSend("double", this, "spacing") as Double

    public open fun setSpacing(spacing: Double): Unit {
        Native.objc_msgSend("void", this, "setSpacing:", spacing)
    }

    public open fun setCustomSpacing_afterView(spacing: Double, aView: NSView): Unit {
        Native.objc_msgSend("void", this, "setCustomSpacing:afterView:", spacing, aView)
    }

    public open fun customSpacingAfterView(aView: NSView): Double =
        Native.objc_msgSend("double", this, "customSpacingAfterView:", aView) as Double

    public open fun hasEqualSpacing(): Boolean =
        Native.objc_msgSend("boolean", this, "hasEqualSpacing") as Boolean

    public open fun setHasEqualSpacing(hasEqualSpacing: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasEqualSpacing:", hasEqualSpacing)
    }

    public open fun clippingResistancePriorityForOrientation(orientation: Any): Float =
        Native.objc_msgSend("float", this, "clippingResistancePriorityForOrientation:", orientation) as Float

    public open fun setClippingResistancePriority_forOrientation(clippingResistancePriority: Float, orientation: Any): Unit {
        Native.objc_msgSend("void", this, "setClippingResistancePriority:forOrientation:", clippingResistancePriority, orientation)
    }

    public open fun huggingPriorityForOrientation(orientation: Any): Float =
        Native.objc_msgSend("float", this, "huggingPriorityForOrientation:", orientation) as Float

    public open fun setHuggingPriority_forOrientation(huggingPriority: Float, orientation: Any): Unit {
        Native.objc_msgSend("void", this, "setHuggingPriority:forOrientation:", huggingPriority, orientation)
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

    trait metaclass : NSView.metaclass {
        public open fun stackViewWithViews(views: NSArray): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stackViewWithViews:", views) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSStackView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
