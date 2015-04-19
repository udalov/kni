// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDocumentScripting.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSDocument_NSScripting : IObjCObject {
    public open fun lastComponentOfFileName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "lastComponentOfFileName") as NSString

    public open fun setLastComponentOfFileName(lastComponentOfFileName: NSString): Unit {
        Native.objc_msgSend("void", this, "setLastComponentOfFileName:", lastComponentOfFileName)
    }

    public open fun handleSaveScriptCommand(command: NSScriptCommand): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "handleSaveScriptCommand:", command) as ObjCObject

    public open fun handleCloseScriptCommand(command: NSCloseCommand): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "handleCloseScriptCommand:", command) as ObjCObject

    public open fun handlePrintScriptCommand(command: NSScriptCommand): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "handlePrintScriptCommand:", command) as ObjCObject

    public open fun objectSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "objectSpecifier") as NSScriptObjectSpecifier

    trait metaclass : IObjCObject
}
