// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSAccessibility.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSObject_NSAccessibility : IObjCObject {
    public open fun accessibilityAttributeNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "accessibilityAttributeNames") as NSArray

    public open fun accessibilityAttributeValue(attribute: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "accessibilityAttributeValue:", attribute) as ObjCObject

    public open fun accessibilityIsAttributeSettable(attribute: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "accessibilityIsAttributeSettable:", attribute) as Boolean

    public open fun accessibilitySetValue_forAttribute(value: ObjCObject, attribute: NSString): Unit {
        Native.objc_msgSend("void", this, "accessibilitySetValue:forAttribute:", value, attribute)
    }

    public open fun accessibilityParameterizedAttributeNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "accessibilityParameterizedAttributeNames") as NSArray

    public open fun accessibilityAttributeValue_forParameter(attribute: NSString, parameter: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "accessibilityAttributeValue:forParameter:", attribute, parameter) as ObjCObject

    public open fun accessibilityActionNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "accessibilityActionNames") as NSArray

    public open fun accessibilityActionDescription(action: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "accessibilityActionDescription:", action) as NSString

    public open fun accessibilityPerformAction(action: NSString): Unit {
        Native.objc_msgSend("void", this, "accessibilityPerformAction:", action)
    }

    public open fun accessibilityIsIgnored(): Boolean =
        Native.objc_msgSend("boolean", this, "accessibilityIsIgnored") as Boolean

    public open fun accessibilityHitTest(point: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "accessibilityHitTest:", point) as ObjCObject

    public open fun accessibilityFocusedUIElement(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "accessibilityFocusedUIElement") as ObjCObject

    public open fun accessibilityIndexOfChild(child: ObjCObject): Int =
        Native.objc_msgSend("int", this, "accessibilityIndexOfChild:", child) as Int

    public open fun accessibilityArrayAttributeCount(attribute: NSString): Int =
        Native.objc_msgSend("int", this, "accessibilityArrayAttributeCount:", attribute) as Int

    public open fun accessibilityArrayAttributeValues_index_maxCount(attribute: NSString, index: Int, maxCount: Int): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "accessibilityArrayAttributeValues:index:maxCount:", attribute, index, maxCount) as NSArray

    public open fun accessibilityNotifiesWhenDestroyed(): Boolean =
        Native.objc_msgSend("boolean", this, "accessibilityNotifiesWhenDestroyed") as Boolean

    trait metaclass : IObjCObject
}

trait NSWorkspace_NSWorkspaceAccessibilityDisplay : IObjCObject {
    public open fun accessibilityDisplayShouldIncreaseContrast(): Boolean =
        Native.objc_msgSend("boolean", this, "accessibilityDisplayShouldIncreaseContrast") as Boolean

    public open fun accessibilityDisplayShouldDifferentiateWithoutColor(): Boolean =
        Native.objc_msgSend("boolean", this, "accessibilityDisplayShouldDifferentiateWithoutColor") as Boolean

    public open fun accessibilityDisplayShouldReduceTransparency(): Boolean =
        Native.objc_msgSend("boolean", this, "accessibilityDisplayShouldReduceTransparency") as Boolean

    trait metaclass : IObjCObject
}

trait NSObject_NSAccessibilityAdditions : IObjCObject {
    public open fun accessibilitySetOverrideValue_forAttribute(value: ObjCObject, attribute: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "accessibilitySetOverrideValue:forAttribute:", value, attribute) as Boolean

    trait metaclass : IObjCObject
}
