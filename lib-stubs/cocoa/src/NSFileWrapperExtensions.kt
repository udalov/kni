// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSFileWrapperExtensions.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSFileWrapper_NSExtensions : IObjCObject {
    public open fun icon(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "icon") as NSImage

    public open fun setIcon(icon: NSImage): Unit {
        Native.objc_msgSend("void", this, "setIcon:", icon)
    }

    trait metaclass : IObjCObject
}
