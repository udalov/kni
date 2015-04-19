// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSHelpManager.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSHelpManager(pointer: Long) : NSObject(pointer) {
    public open fun setContextHelp_forObject(attrString: NSAttributedString, `object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setContextHelp:forObject:", attrString, `object`)
    }

    public open fun removeContextHelpForObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeContextHelpForObject:", `object`)
    }

    public open fun contextHelpForObject(`object`: ObjCObject): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "contextHelpForObject:", `object`) as NSAttributedString

    public open fun showContextHelpForObject_locationHint(`object`: ObjCObject, pt: Any): Boolean =
        Native.objc_msgSend("boolean", this, "showContextHelpForObject:locationHint:", `object`, pt) as Boolean

    public open fun openHelpAnchor_inBook(anchor: NSString, book: NSString): Unit {
        Native.objc_msgSend("void", this, "openHelpAnchor:inBook:", anchor, book)
    }

    public open fun findString_inBook(query: NSString, book: NSString): Unit {
        Native.objc_msgSend("void", this, "findString:inBook:", query, book)
    }

    public open fun registerBooksInBundle(bundle: NSBundle): Boolean =
        Native.objc_msgSend("boolean", this, "registerBooksInBundle:", bundle) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun sharedHelpManager(): NSHelpManager =
            Native.objc_msgSend("class objc.NSHelpManager", this, "sharedHelpManager") as NSHelpManager

        public open fun setContextHelpModeActive(active: Boolean): Unit {
            Native.objc_msgSend("void", this, "setContextHelpModeActive:", active)
        }

        public open fun isContextHelpModeActive(): Boolean =
            Native.objc_msgSend("boolean", this, "isContextHelpModeActive") as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSHelpManager")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSBundle_NSBundleHelpExtension : IObjCObject {
    public open fun contextHelpForKey(key: NSString): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "contextHelpForKey:", key) as NSAttributedString

    trait metaclass : IObjCObject
}

trait NSApplication_NSApplicationHelpExtension : IObjCObject {
    public open fun activateContextHelpMode(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "activateContextHelpMode:", sender)
    }

    public open fun showHelp(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "showHelp:", sender)
    }

    trait metaclass : IObjCObject
}
