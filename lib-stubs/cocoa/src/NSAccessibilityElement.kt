// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSAccessibilityElement.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSAccessibilityElement(pointer: Long) : NSObject(pointer), NSAccessibility {
    public open fun accessibilityAddChildElement(childElement: NSAccessibilityElement): Unit {
        Native.objc_msgSend("void", this, "accessibilityAddChildElement:", childElement)
    }

    public open fun accessibilityFrameInParentSpace(): Any =
        Native.objc_msgSend("class objc.Any", this, "accessibilityFrameInParentSpace")

    public open fun setAccessibilityFrameInParentSpace(accessibilityFrameInParentSpace: Any): Unit {
        Native.objc_msgSend("void", this, "setAccessibilityFrameInParentSpace:", accessibilityFrameInParentSpace)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSAccessibility.metaclass {
        public open fun accessibilityElementWithRole_frame_label_parent(role: NSString, frame: Any, label: NSString, parent: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "accessibilityElementWithRole:frame:label:parent:", role, frame, label, parent) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSAccessibilityElement")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
