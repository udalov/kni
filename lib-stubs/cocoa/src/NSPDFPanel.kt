// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPDFPanel.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPDFPanel(pointer: Long) : NSObject(pointer) {
    public open fun accessoryController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "accessoryController") as NSViewController

    public open fun setAccessoryController(accessoryController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "setAccessoryController:", accessoryController)
    }

    public open fun options(): Any =
        Native.objc_msgSend("class objc.Any", this, "options")

    public open fun setOptions(options: Any): Unit {
        Native.objc_msgSend("void", this, "setOptions:", options)
    }

    public open fun defaultFileName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "defaultFileName") as NSString

    public open fun setDefaultFileName(defaultFileName: NSString): Unit {
        Native.objc_msgSend("void", this, "setDefaultFileName:", defaultFileName)
    }

    public open fun beginSheetWithPDFInfo_modalForWindow_completionHandler(pdfInfo: NSPDFInfo, docWindow: NSWindow, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "beginSheetWithPDFInfo:modalForWindow:completionHandler:", pdfInfo, docWindow, completionHandler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun panel(): NSPDFPanel =
            Native.objc_msgSend("class objc.NSPDFPanel", this, "panel") as NSPDFPanel

    }

    companion object : NSObject(Native.objc_getClass("NSPDFPanel")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
