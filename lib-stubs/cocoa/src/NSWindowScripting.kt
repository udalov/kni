// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSWindowScripting.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSWindow_NSScripting : IObjCObject {
    public open fun hasCloseBox(): Boolean =
        Native.objc_msgSend("boolean", this, "hasCloseBox") as Boolean

    public open fun hasTitleBar(): Boolean =
        Native.objc_msgSend("boolean", this, "hasTitleBar") as Boolean

    public open fun isFloatingPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "isFloatingPanel") as Boolean

    public open fun isMiniaturizable(): Boolean =
        Native.objc_msgSend("boolean", this, "isMiniaturizable") as Boolean

    public open fun isModalPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "isModalPanel") as Boolean

    public open fun isResizable(): Boolean =
        Native.objc_msgSend("boolean", this, "isResizable") as Boolean

    public open fun isZoomable(): Boolean =
        Native.objc_msgSend("boolean", this, "isZoomable") as Boolean

    public open fun orderedIndex(): Int =
        Native.objc_msgSend("int", this, "orderedIndex") as Int

    public open fun setOrderedIndex(orderedIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setOrderedIndex:", orderedIndex)
    }

    public open fun setIsMiniaturized(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIsMiniaturized:", flag)
    }

    public open fun setIsVisible(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIsVisible:", flag)
    }

    public open fun setIsZoomed(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIsZoomed:", flag)
    }

    public open fun handleCloseScriptCommand(command: NSCloseCommand): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "handleCloseScriptCommand:", command) as ObjCObject

    public open fun handlePrintScriptCommand(command: NSScriptCommand): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "handlePrintScriptCommand:", command) as ObjCObject

    public open fun handleSaveScriptCommand(command: NSScriptCommand): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "handleSaveScriptCommand:", command) as ObjCObject

    trait metaclass : IObjCObject
}
