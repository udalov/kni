// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSApplicationScripting.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSApplication_NSScripting : IObjCObject {
    public open fun orderedDocuments(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "orderedDocuments") as NSArray

    public open fun orderedWindows(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "orderedWindows") as NSArray

    trait metaclass : IObjCObject
}

trait NSObject_NSApplicationScriptingDelegation : IObjCObject {
    public open fun application_delegateHandlesKey(sender: NSApplication, key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "application:delegateHandlesKey:", sender, key) as Boolean

    trait metaclass : IObjCObject
}
