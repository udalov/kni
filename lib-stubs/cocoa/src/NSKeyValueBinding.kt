// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSKeyValueBinding.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSObject_NSKeyValueBindingCreation : IObjCObject {
    public open fun exposedBindings(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "exposedBindings") as NSArray

    public open fun valueClassForBinding(binding: NSString): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "valueClassForBinding:", binding) as ObjCClass

    public open fun bind_toObject_withKeyPath_options(binding: NSString, observable: ObjCObject, keyPath: NSString, options: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "bind:toObject:withKeyPath:options:", binding, observable, keyPath, options)
    }

    public open fun unbind(binding: NSString): Unit {
        Native.objc_msgSend("void", this, "unbind:", binding)
    }

    public open fun infoForBinding(binding: NSString): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "infoForBinding:", binding) as NSDictionary

    public open fun optionDescriptionsForBinding(aBinding: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "optionDescriptionsForBinding:", aBinding) as NSArray

    trait metaclass : IObjCObject {
        public open fun exposeBinding(binding: NSString): Unit {
            Native.objc_msgSend("void", this, "exposeBinding:", binding)
        }
    }
}

trait NSObject_NSPlaceholders : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun setDefaultPlaceholder_forMarker_withBinding(placeholder: ObjCObject, marker: ObjCObject, binding: NSString): Unit {
            Native.objc_msgSend("void", this, "setDefaultPlaceholder:forMarker:withBinding:", placeholder, marker, binding)
        }

        public open fun defaultPlaceholderForMarker_withBinding(marker: ObjCObject, binding: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "defaultPlaceholderForMarker:withBinding:", marker, binding) as ObjCObject
    }
}

trait NSObject_NSEditorRegistration : IObjCObject {
    public open fun objectDidBeginEditing(editor: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "objectDidBeginEditing:", editor)
    }

    public open fun objectDidEndEditing(editor: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "objectDidEndEditing:", editor)
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSEditor : IObjCObject {
    public open fun discardEditing(): Unit {
        Native.objc_msgSend("void", this, "discardEditing")
    }

    public open fun commitEditing(): Boolean =
        Native.objc_msgSend("boolean", this, "commitEditing") as Boolean

    public open fun commitEditingWithDelegate_didCommitSelector_contextInfo(delegate: ObjCObject, didCommitSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "commitEditingWithDelegate:didCommitSelector:contextInfo:", delegate, didCommitSelector, contextInfo)
    }

    public open fun commitEditingAndReturnError(error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "commitEditingAndReturnError:", error) as Boolean

    trait metaclass : IObjCObject
}
