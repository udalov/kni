// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSLayoutConstraint.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSLayoutConstraint(pointer: Long) : NSObject(pointer), NSAnimatablePropertyContainer, NSLayoutConstraint_NSIdentifier {
    public open fun priority(): Float =
        Native.objc_msgSend("float", this, "priority") as Float

    public open fun setPriority(priority: Float): Unit {
        Native.objc_msgSend("void", this, "setPriority:", priority)
    }

    public open fun shouldBeArchived(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldBeArchived") as Boolean

    public open fun setShouldBeArchived(shouldBeArchived: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShouldBeArchived:", shouldBeArchived)
    }

    public open fun firstItem(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "firstItem") as ObjCObject

    public open fun firstAttribute(): Any =
        Native.objc_msgSend("class objc.Any", this, "firstAttribute")

    public open fun relation(): Any =
        Native.objc_msgSend("class objc.Any", this, "relation")

    public open fun secondItem(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "secondItem") as ObjCObject

    public open fun secondAttribute(): Any =
        Native.objc_msgSend("class objc.Any", this, "secondAttribute")

    public open fun multiplier(): Double =
        Native.objc_msgSend("double", this, "multiplier") as Double

    public open fun constant(): Double =
        Native.objc_msgSend("double", this, "constant") as Double

    public open fun setConstant(constant: Double): Unit {
        Native.objc_msgSend("void", this, "setConstant:", constant)
    }

    public open fun isActive(): Boolean =
        Native.objc_msgSend("boolean", this, "isActive") as Boolean

    public open fun setActive(active: Boolean): Unit {
        Native.objc_msgSend("void", this, "setActive:", active)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSAnimatablePropertyContainer.metaclass, NSLayoutConstraint_NSIdentifier.metaclass {
        public open fun constraintsWithVisualFormat_options_metrics_views(format: NSString, opts: Any, metrics: NSDictionary, views: NSDictionary): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "constraintsWithVisualFormat:options:metrics:views:", format, opts, metrics, views) as NSArray

        public open fun constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant(view1: ObjCObject, attr1: Any, relation: Any, view2: ObjCObject, attr2: Any, multiplier: Double, c: Double): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:", view1, attr1, relation, view2, attr2, multiplier, c) as ObjCObject

        public open fun activateConstraints(constraints: NSArray): Unit {
            Native.objc_msgSend("void", this, "activateConstraints:", constraints)
        }

        public open fun deactivateConstraints(constraints: NSArray): Unit {
            Native.objc_msgSend("void", this, "deactivateConstraints:", constraints)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSLayoutConstraint")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSLayoutConstraint_NSIdentifier : IObjCObject {
    public open fun identifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "identifier") as NSString

    public open fun setIdentifier(identifier: NSString): Unit {
        Native.objc_msgSend("void", this, "setIdentifier:", identifier)
    }

    trait metaclass : IObjCObject
}

trait NSView_NSConstraintBasedLayoutInstallingConstraints : IObjCObject {
    public open fun constraints(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "constraints") as NSArray

    public open fun addConstraint(constraint: NSLayoutConstraint): Unit {
        Native.objc_msgSend("void", this, "addConstraint:", constraint)
    }

    public open fun addConstraints(constraints: NSArray): Unit {
        Native.objc_msgSend("void", this, "addConstraints:", constraints)
    }

    public open fun removeConstraint(constraint: NSLayoutConstraint): Unit {
        Native.objc_msgSend("void", this, "removeConstraint:", constraint)
    }

    public open fun removeConstraints(constraints: NSArray): Unit {
        Native.objc_msgSend("void", this, "removeConstraints:", constraints)
    }

    trait metaclass : IObjCObject
}

trait NSWindow_NSConstraintBasedLayoutCoreMethods : IObjCObject {
    public open fun updateConstraintsIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "updateConstraintsIfNeeded")
    }

    public open fun layoutIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "layoutIfNeeded")
    }

    trait metaclass : IObjCObject
}

trait NSView_NSConstraintBasedLayoutCoreMethods : IObjCObject {
    public open fun updateConstraintsForSubtreeIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "updateConstraintsForSubtreeIfNeeded")
    }

    public open fun updateConstraints(): Unit {
        Native.objc_msgSend("void", this, "updateConstraints")
    }

    public open fun needsUpdateConstraints(): Boolean =
        Native.objc_msgSend("boolean", this, "needsUpdateConstraints") as Boolean

    public open fun setNeedsUpdateConstraints(needsUpdateConstraints: Boolean): Unit {
        Native.objc_msgSend("void", this, "setNeedsUpdateConstraints:", needsUpdateConstraints)
    }

    public open fun layoutSubtreeIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "layoutSubtreeIfNeeded")
    }

    public open fun layout(): Unit {
        Native.objc_msgSend("void", this, "layout")
    }

    public open fun needsLayout(): Boolean =
        Native.objc_msgSend("boolean", this, "needsLayout") as Boolean

    public open fun setNeedsLayout(needsLayout: Boolean): Unit {
        Native.objc_msgSend("void", this, "setNeedsLayout:", needsLayout)
    }

    trait metaclass : IObjCObject
}

trait NSView_NSConstraintBasedCompatibility : IObjCObject {
    public open fun translatesAutoresizingMaskIntoConstraints(): Boolean =
        Native.objc_msgSend("boolean", this, "translatesAutoresizingMaskIntoConstraints") as Boolean

    public open fun setTranslatesAutoresizingMaskIntoConstraints(translatesAutoresizingMaskIntoConstraints: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTranslatesAutoresizingMaskIntoConstraints:", translatesAutoresizingMaskIntoConstraints)
    }

    trait metaclass : IObjCObject {
        public open fun requiresConstraintBasedLayout(): Boolean =
            Native.objc_msgSend("boolean", this, "requiresConstraintBasedLayout") as Boolean
    }
}

trait NSView_NSConstraintBasedLayoutLayering : IObjCObject {
    public open fun alignmentRectForFrame(frame: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "alignmentRectForFrame:", frame)

    public open fun frameForAlignmentRect(alignmentRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "frameForAlignmentRect:", alignmentRect)

    public open fun alignmentRectInsets(): Any =
        Native.objc_msgSend("class objc.Any", this, "alignmentRectInsets")

    public open fun baselineOffsetFromBottom(): Double =
        Native.objc_msgSend("double", this, "baselineOffsetFromBottom") as Double

    public open fun intrinsicContentSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "intrinsicContentSize")

    public open fun invalidateIntrinsicContentSize(): Unit {
        Native.objc_msgSend("void", this, "invalidateIntrinsicContentSize")
    }

    public open fun contentHuggingPriorityForOrientation(orientation: Any): Float =
        Native.objc_msgSend("float", this, "contentHuggingPriorityForOrientation:", orientation) as Float

    public open fun setContentHuggingPriority_forOrientation(priority: Float, orientation: Any): Unit {
        Native.objc_msgSend("void", this, "setContentHuggingPriority:forOrientation:", priority, orientation)
    }

    public open fun contentCompressionResistancePriorityForOrientation(orientation: Any): Float =
        Native.objc_msgSend("float", this, "contentCompressionResistancePriorityForOrientation:", orientation) as Float

    public open fun setContentCompressionResistancePriority_forOrientation(priority: Float, orientation: Any): Unit {
        Native.objc_msgSend("void", this, "setContentCompressionResistancePriority:forOrientation:", priority, orientation)
    }

    trait metaclass : IObjCObject
}

trait NSControl_NSConstraintBasedLayoutLayering : IObjCObject {
    public open fun invalidateIntrinsicContentSizeForCell(cell: NSCell): Unit {
        Native.objc_msgSend("void", this, "invalidateIntrinsicContentSizeForCell:", cell)
    }

    trait metaclass : IObjCObject
}

trait NSWindow_NSConstraintBasedLayoutAnchoring : IObjCObject {
    public open fun anchorAttributeForOrientation(orientation: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "anchorAttributeForOrientation:", orientation)

    public open fun setAnchorAttribute_forOrientation(attr: Any, orientation: Any): Unit {
        Native.objc_msgSend("void", this, "setAnchorAttribute:forOrientation:", attr, orientation)
    }

    trait metaclass : IObjCObject
}

trait NSView_NSConstraintBasedLayoutFittingSize : IObjCObject {
    public open fun fittingSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "fittingSize")

    trait metaclass : IObjCObject
}

trait NSView_NSConstraintBasedLayoutDebugging : IObjCObject {
    public open fun constraintsAffectingLayoutForOrientation(orientation: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "constraintsAffectingLayoutForOrientation:", orientation) as NSArray

    public open fun hasAmbiguousLayout(): Boolean =
        Native.objc_msgSend("boolean", this, "hasAmbiguousLayout") as Boolean

    public open fun exerciseAmbiguityInLayout(): Unit {
        Native.objc_msgSend("void", this, "exerciseAmbiguityInLayout")
    }

    trait metaclass : IObjCObject
}

trait NSWindow_NSConstraintBasedLayoutDebugging : IObjCObject {
    public open fun visualizeConstraints(constraints: NSArray): Unit {
        Native.objc_msgSend("void", this, "visualizeConstraints:", constraints)
    }

    trait metaclass : IObjCObject
}
