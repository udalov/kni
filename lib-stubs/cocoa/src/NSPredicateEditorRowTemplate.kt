// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPredicateEditorRowTemplate.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPredicateEditorRowTemplate(pointer: Long) : NSObject(pointer), NSCoding, NSCopying {
    public open fun matchForPredicate(predicate: NSPredicate): Double =
        Native.objc_msgSend("double", this, "matchForPredicate:", predicate) as Double

    public open fun templateViews(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "templateViews") as NSArray

    public open fun setPredicate(predicate: NSPredicate): Unit {
        Native.objc_msgSend("void", this, "setPredicate:", predicate)
    }

    public open fun predicateWithSubpredicates(subpredicates: NSArray): NSPredicate =
        Native.objc_msgSend("class objc.NSPredicate", this, "predicateWithSubpredicates:", subpredicates) as NSPredicate

    public open fun displayableSubpredicatesOfPredicate(predicate: NSPredicate): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "displayableSubpredicatesOfPredicate:", predicate) as NSArray

    public open fun initWithLeftExpressions_rightExpressions_modifier_operators_options(leftExpressions: NSArray, rightExpressions: NSArray, modifier: Any, operators: NSArray, options: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithLeftExpressions:rightExpressions:modifier:operators:options:", leftExpressions, rightExpressions, modifier, operators, options) as ObjCObject

    public open fun initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options(leftExpressions: NSArray, attributeType: Any, modifier: Any, operators: NSArray, options: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithLeftExpressions:rightExpressionAttributeType:modifier:operators:options:", leftExpressions, attributeType, modifier, operators, options) as ObjCObject

    public open fun initWithCompoundTypes(compoundTypes: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCompoundTypes:", compoundTypes) as ObjCObject

    public open fun leftExpressions(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "leftExpressions") as NSArray

    public open fun rightExpressions(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "rightExpressions") as NSArray

    public open fun rightExpressionAttributeType(): Any =
        Native.objc_msgSend("class objc.Any", this, "rightExpressionAttributeType")

    public open fun modifier(): Any =
        Native.objc_msgSend("class objc.Any", this, "modifier")

    public open fun operators(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "operators") as NSArray

    public open fun options(): Int =
        Native.objc_msgSend("int", this, "options") as Int

    public open fun compoundTypes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "compoundTypes") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSCopying.metaclass {
        public open fun templatesWithAttributeKeyPaths_inEntityDescription(keyPaths: NSArray, entityDescription: NSEntityDescription): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "templatesWithAttributeKeyPaths:inEntityDescription:", keyPaths, entityDescription) as NSArray

    }

    companion object : NSObject(Native.objc_getClass("NSPredicateEditorRowTemplate")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
