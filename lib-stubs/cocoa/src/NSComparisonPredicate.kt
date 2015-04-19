// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSComparisonPredicate.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSComparisonPredicate(pointer: Long) : NSPredicate(pointer) {
    public open fun initWithLeftExpression_rightExpression_modifier_type_options(lhs: NSExpression, rhs: NSExpression, modifier: Any, type: Any, options: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithLeftExpression:rightExpression:modifier:type:options:", lhs, rhs, modifier, type, options) as ObjCObject

    public open fun initWithLeftExpression_rightExpression_customSelector(lhs: NSExpression, rhs: NSExpression, selector: ObjCSelector): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithLeftExpression:rightExpression:customSelector:", lhs, rhs, selector) as ObjCObject

    public open fun predicateOperatorType(): Any =
        Native.objc_msgSend("class objc.Any", this, "predicateOperatorType")

    public open fun comparisonPredicateModifier(): Any =
        Native.objc_msgSend("class objc.Any", this, "comparisonPredicateModifier")

    public open fun leftExpression(): NSExpression =
        Native.objc_msgSend("class objc.NSExpression", this, "leftExpression") as NSExpression

    public open fun rightExpression(): NSExpression =
        Native.objc_msgSend("class objc.NSExpression", this, "rightExpression") as NSExpression

    public open fun customSelector(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "customSelector") as ObjCSelector

    public open fun options(): Any =
        Native.objc_msgSend("class objc.Any", this, "options")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSPredicate.metaclass {
        public open fun predicateWithLeftExpression_rightExpression_modifier_type_options(lhs: NSExpression, rhs: NSExpression, modifier: Any, type: Any, options: Any): NSComparisonPredicate =
            Native.objc_msgSend("class objc.NSComparisonPredicate", this, "predicateWithLeftExpression:rightExpression:modifier:type:options:", lhs, rhs, modifier, type, options) as NSComparisonPredicate

        public open fun predicateWithLeftExpression_rightExpression_customSelector(lhs: NSExpression, rhs: NSExpression, selector: ObjCSelector): NSComparisonPredicate =
            Native.objc_msgSend("class objc.NSComparisonPredicate", this, "predicateWithLeftExpression:rightExpression:customSelector:", lhs, rhs, selector) as NSComparisonPredicate

    }

    companion object : NSObject(Native.objc_getClass("NSComparisonPredicate")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
