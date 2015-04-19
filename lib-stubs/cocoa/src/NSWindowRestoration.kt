// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSWindowRestoration.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSWindowRestoration {
    trait metaclass
}

trait NSDocumentController_NSWindowRestoration : IObjCObject {
    trait metaclass : IObjCObject
}

trait NSApplication_NSWindowRestoration : IObjCObject {
    public open fun restoreWindowWithIdentifier_state_completionHandler(identifier: NSString, state: NSCoder, completionHandler: Any): Boolean =
        Native.objc_msgSend("boolean", this, "restoreWindowWithIdentifier:state:completionHandler:", identifier, state, completionHandler) as Boolean

    trait metaclass : IObjCObject
}

trait NSWindow_NSUserInterfaceRestoration : IObjCObject {
    public open fun isRestorable(): Boolean =
        Native.objc_msgSend("boolean", this, "isRestorable") as Boolean

    public open fun setRestorable(restorable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRestorable:", restorable)
    }

    public open fun restorationClass(): Any =
        Native.objc_msgSend("class objc.Any", this, "restorationClass")

    public open fun setRestorationClass(restorationClass: Any): Unit {
        Native.objc_msgSend("void", this, "setRestorationClass:", restorationClass)
    }

    public open fun disableSnapshotRestoration(): Unit {
        Native.objc_msgSend("void", this, "disableSnapshotRestoration")
    }

    public open fun enableSnapshotRestoration(): Unit {
        Native.objc_msgSend("void", this, "enableSnapshotRestoration")
    }

    trait metaclass : IObjCObject
}

trait NSResponder_NSRestorableState : IObjCObject {
    public open fun encodeRestorableStateWithCoder(coder: NSCoder): Unit {
        Native.objc_msgSend("void", this, "encodeRestorableStateWithCoder:", coder)
    }

    public open fun restoreStateWithCoder(coder: NSCoder): Unit {
        Native.objc_msgSend("void", this, "restoreStateWithCoder:", coder)
    }

    public open fun invalidateRestorableState(): Unit {
        Native.objc_msgSend("void", this, "invalidateRestorableState")
    }

    trait metaclass : IObjCObject {
        public open fun restorableStateKeyPaths(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "restorableStateKeyPaths") as NSArray
    }
}

trait NSApplication_NSRestorableStateExtension : IObjCObject {
    public open fun extendStateRestoration(): Unit {
        Native.objc_msgSend("void", this, "extendStateRestoration")
    }

    public open fun completeStateRestoration(): Unit {
        Native.objc_msgSend("void", this, "completeStateRestoration")
    }

    trait metaclass : IObjCObject
}

trait NSDocument_NSRestorableState : IObjCObject {
    public open fun restoreDocumentWindowWithIdentifier_state_completionHandler(identifier: NSString, state: NSCoder, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "restoreDocumentWindowWithIdentifier:state:completionHandler:", identifier, state, completionHandler)
    }

    public open fun encodeRestorableStateWithCoder(coder: NSCoder): Unit {
        Native.objc_msgSend("void", this, "encodeRestorableStateWithCoder:", coder)
    }

    public open fun restoreStateWithCoder(coder: NSCoder): Unit {
        Native.objc_msgSend("void", this, "restoreStateWithCoder:", coder)
    }

    public open fun invalidateRestorableState(): Unit {
        Native.objc_msgSend("void", this, "invalidateRestorableState")
    }

    trait metaclass : IObjCObject {
        public open fun restorableStateKeyPaths(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "restorableStateKeyPaths") as NSArray
    }
}
