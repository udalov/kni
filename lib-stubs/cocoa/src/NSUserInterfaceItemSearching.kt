// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSUserInterfaceItemSearching.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSUserInterfaceItemSearching {
    trait metaclass
}

trait NSApplication_NSUserInterfaceItemSearching : IObjCObject {
    public open fun registerUserInterfaceItemSearchHandler(handler: Any): Unit {
        Native.objc_msgSend("void", this, "registerUserInterfaceItemSearchHandler:", handler)
    }

    public open fun unregisterUserInterfaceItemSearchHandler(handler: Any): Unit {
        Native.objc_msgSend("void", this, "unregisterUserInterfaceItemSearchHandler:", handler)
    }

    public open fun searchString_inUserInterfaceItemString_searchRange_foundRange(searchString: NSString, stringToSearch: NSString, searchRange: Any, foundRange: Pointer<Any>): Boolean =
        Native.objc_msgSend("boolean", this, "searchString:inUserInterfaceItemString:searchRange:foundRange:", searchString, stringToSearch, searchRange, foundRange) as Boolean

    trait metaclass : IObjCObject
}
