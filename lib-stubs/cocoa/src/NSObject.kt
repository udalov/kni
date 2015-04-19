// generated from "/usr/include/objc/NSObject.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSObjectProtocol {
    trait metaclass
}

trait NSCopying {
    trait metaclass
}

trait NSMutableCopying {
    trait metaclass
}

trait NSCoding {
    trait metaclass
}

trait NSSecureCoding {
    trait metaclass
}

trait NSDiscardableContent {
    trait metaclass
}

public open class NSObject(pointer: Long) : ObjCObject(pointer), NSObjectProtocol, NSObject_NSCoderMethods, NSObject_NSDeprecatedMethods, NSObject_NSDiscardableContentProxy, NSObject_NSErrorRecoveryAttempting, NSObject_NSCopyLinkMoveHandler, NSObject_NSKeyValueCoding, NSObject_NSDeprecatedKeyValueCoding, NSObject_NSKeyValueObserving, NSObject_NSKeyValueObserverRegistration, NSObject_NSKeyValueObserverNotification, NSObject_NSKeyValueObservingCustomization, NSObject_NSDeprecatedKeyValueObservingCustomization, NSObject_NSKeyedArchiverObjectSubstitution, NSObject_NSKeyedUnarchiverObjectSubstitution, NSObject_NSDelayedPerforming, NSObject_NSThreadPerformAdditions, NSObject_NSURLClient, NSObject_NSArchiverCallback, NSObject_NSDistributedObjects, NSObject_NSClassDescriptionPrimitives, NSObject_NSScripting, NSObject_NSScriptClassDescription, NSObject_NSScriptKeyValueCoding, NSObject_NSScriptObjectSpecifiers, NSObject_NSComparisonMethods, NSObject_NSScriptingComparisonMethods, NSObject_NSAccessibility, NSObject_NSAccessibilityAdditions, NSObject_NSDraggingSourceDeprecated, NSObject_NSLayerDelegateContentsScaleUpdating, NSObject_NSToolTipOwner, NSObject_NSControlSubclassNotifications, NSObject_NSFontManagerDelegate, NSObject_NSFontManagerResponderMethod, NSObject_NSFontPanelValidationAdditions, NSObject_NSMenuValidation, NSObject_NSPasteboardOwner, NSObject_NSColorPanelResponderMethod, NSObject_NSNibAwaking, NSObject_NSSavePanelDelegateDeprecated, NSObject_NSTableViewDataSourceDeprecated, NSObject_CALayoutManager, NSObject_CALayerDelegate, NSObject_NSApplicationScriptingDelegation, NSObject_NSToolbarItemValidation, NSObject_NSKeyValueBindingCreation, NSObject_NSPlaceholders, NSObject_NSEditorRegistration, NSObject_NSEditor, NSObject_NSDictionaryControllerKeyValuePair {
    public open fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun dealloc(): Unit {
        Native.objc_msgSend("void", this, "dealloc")
    }

    public open fun copy(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "copy") as ObjCObject

    public open fun mutableCopy(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "mutableCopy") as ObjCObject

    public open fun methodForSelector(aSelector: ObjCSelector): (Any, ObjCSelector) -> Any =
        Native.objc_msgSend("class kotlin.Function2", this, "methodForSelector:", aSelector) as (Any, ObjCSelector) -> Any

    public open fun doesNotRecognizeSelector(aSelector: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "doesNotRecognizeSelector:", aSelector)
    }

    public open fun forwardingTargetForSelector(aSelector: ObjCSelector): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "forwardingTargetForSelector:", aSelector) as ObjCObject

    public open fun forwardInvocation(anInvocation: NSInvocation): Unit {
        Native.objc_msgSend("void", this, "forwardInvocation:", anInvocation)
    }

    public open fun methodSignatureForSelector(aSelector: ObjCSelector): NSMethodSignature =
        Native.objc_msgSend("class objc.NSMethodSignature", this, "methodSignatureForSelector:", aSelector) as NSMethodSignature

    public open fun allowsWeakReference(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsWeakReference") as Boolean

    public open fun retainWeakReference(): Boolean =
        Native.objc_msgSend("boolean", this, "retainWeakReference") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : IObjCObject, NSObjectProtocol.metaclass, NSObject_NSCoderMethods.metaclass, NSObject_NSDeprecatedMethods.metaclass, NSObject_NSDiscardableContentProxy.metaclass, NSObject_NSErrorRecoveryAttempting.metaclass, NSObject_NSCopyLinkMoveHandler.metaclass, NSObject_NSKeyValueCoding.metaclass, NSObject_NSDeprecatedKeyValueCoding.metaclass, NSObject_NSKeyValueObserving.metaclass, NSObject_NSKeyValueObserverRegistration.metaclass, NSObject_NSKeyValueObserverNotification.metaclass, NSObject_NSKeyValueObservingCustomization.metaclass, NSObject_NSDeprecatedKeyValueObservingCustomization.metaclass, NSObject_NSKeyedArchiverObjectSubstitution.metaclass, NSObject_NSKeyedUnarchiverObjectSubstitution.metaclass, NSObject_NSDelayedPerforming.metaclass, NSObject_NSThreadPerformAdditions.metaclass, NSObject_NSURLClient.metaclass, NSObject_NSArchiverCallback.metaclass, NSObject_NSDistributedObjects.metaclass, NSObject_NSClassDescriptionPrimitives.metaclass, NSObject_NSScripting.metaclass, NSObject_NSScriptClassDescription.metaclass, NSObject_NSScriptKeyValueCoding.metaclass, NSObject_NSScriptObjectSpecifiers.metaclass, NSObject_NSComparisonMethods.metaclass, NSObject_NSScriptingComparisonMethods.metaclass, NSObject_NSAccessibility.metaclass, NSObject_NSAccessibilityAdditions.metaclass, NSObject_NSDraggingSourceDeprecated.metaclass, NSObject_NSLayerDelegateContentsScaleUpdating.metaclass, NSObject_NSToolTipOwner.metaclass, NSObject_NSControlSubclassNotifications.metaclass, NSObject_NSFontManagerDelegate.metaclass, NSObject_NSFontManagerResponderMethod.metaclass, NSObject_NSFontPanelValidationAdditions.metaclass, NSObject_NSMenuValidation.metaclass, NSObject_NSPasteboardOwner.metaclass, NSObject_NSColorPanelResponderMethod.metaclass, NSObject_NSNibAwaking.metaclass, NSObject_NSSavePanelDelegateDeprecated.metaclass, NSObject_NSTableViewDataSourceDeprecated.metaclass, NSObject_CALayoutManager.metaclass, NSObject_CALayerDelegate.metaclass, NSObject_NSApplicationScriptingDelegation.metaclass, NSObject_NSToolbarItemValidation.metaclass, NSObject_NSKeyValueBindingCreation.metaclass, NSObject_NSPlaceholders.metaclass, NSObject_NSEditorRegistration.metaclass, NSObject_NSEditor.metaclass, NSObject_NSDictionaryControllerKeyValuePair.metaclass {
        public open fun load(): Unit {
            Native.objc_msgSend("void", this, "load")
        }

        public open fun initialize(): Unit {
            Native.objc_msgSend("void", this, "initialize")
        }

        public open fun new(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "new") as ObjCObject

        public open fun allocWithZone(zone: Pointer<Any>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "allocWithZone:", zone) as ObjCObject

        public open fun alloc(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "alloc") as ObjCObject

        public open fun copyWithZone(zone: Pointer<Any>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "copyWithZone:", zone) as ObjCObject

        public open fun mutableCopyWithZone(zone: Pointer<Any>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "mutableCopyWithZone:", zone) as ObjCObject

        public open fun instancesRespondToSelector(aSelector: ObjCSelector): Boolean =
            Native.objc_msgSend("boolean", this, "instancesRespondToSelector:", aSelector) as Boolean

        public open fun conformsToProtocol(protocol: Any?): Boolean =
            Native.objc_msgSend("boolean", this, "conformsToProtocol:", protocol) as Boolean

        public open fun instanceMethodForSelector(aSelector: ObjCSelector): (Any, ObjCSelector) -> Any =
            Native.objc_msgSend("class kotlin.Function2", this, "instanceMethodForSelector:", aSelector) as (Any, ObjCSelector) -> Any

        public open fun instanceMethodSignatureForSelector(aSelector: ObjCSelector): NSMethodSignature =
            Native.objc_msgSend("class objc.NSMethodSignature", this, "instanceMethodSignatureForSelector:", aSelector) as NSMethodSignature

        public open fun isSubclassOfClass(aClass: ObjCClass): Boolean =
            Native.objc_msgSend("boolean", this, "isSubclassOfClass:", aClass) as Boolean

        public open fun resolveClassMethod(sel: ObjCSelector): Boolean =
            Native.objc_msgSend("boolean", this, "resolveClassMethod:", sel) as Boolean

        public open fun resolveInstanceMethod(sel: ObjCSelector): Boolean =
            Native.objc_msgSend("boolean", this, "resolveInstanceMethod:", sel) as Boolean

        public open fun hash(): Int =
            Native.objc_msgSend("int", this, "hash") as Int

        public open fun superclass(): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "superclass") as ObjCClass

        public open fun `class`(): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "class") as ObjCClass

        public open fun description(): NSString =
            Native.objc_msgSend("class objc.NSString", this, "description") as NSString

        public open fun debugDescription(): NSString =
            Native.objc_msgSend("class objc.NSString", this, "debugDescription") as NSString

    }

    companion object : NSObject(Native.objc_getClass("NSObject")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSCoderMethods : IObjCObject {
    public open fun classForCoder(): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "classForCoder") as ObjCClass

    public open fun replacementObjectForCoder(aCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "replacementObjectForCoder:", aCoder) as ObjCObject

    public open fun awakeAfterUsingCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "awakeAfterUsingCoder:", aDecoder) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun version(): Int =
            Native.objc_msgSend("int", this, "version") as Int

        public open fun setVersion(aVersion: Int): Unit {
            Native.objc_msgSend("void", this, "setVersion:", aVersion)
        }
    }
}

trait NSObject_NSDeprecatedMethods : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun poseAsClass(aClass: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "poseAsClass:", aClass)
        }
    }
}

trait NSObject_NSDiscardableContentProxy : IObjCObject {
    public open fun autoContentAccessingProxy(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "autoContentAccessingProxy") as ObjCObject

    trait metaclass : IObjCObject
}
