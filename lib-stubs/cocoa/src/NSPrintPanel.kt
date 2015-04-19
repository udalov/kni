// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPrintPanel.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSPrintPanelAccessorizing {
    trait metaclass
}

public open class NSPrintPanel(pointer: Long) : NSObject(pointer), NSPrintPanel_NSDeprecated {
    public open fun addAccessoryController(accessoryController: Any): Unit {
        Native.objc_msgSend("void", this, "addAccessoryController:", accessoryController)
    }

    public open fun removeAccessoryController(accessoryController: Any): Unit {
        Native.objc_msgSend("void", this, "removeAccessoryController:", accessoryController)
    }

    public open fun accessoryControllers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "accessoryControllers") as NSArray

    public open fun options(): Any =
        Native.objc_msgSend("class objc.Any", this, "options")

    public open fun setOptions(options: Any): Unit {
        Native.objc_msgSend("void", this, "setOptions:", options)
    }

    public open fun setDefaultButtonTitle(defaultButtonTitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setDefaultButtonTitle:", defaultButtonTitle)
    }

    public open fun defaultButtonTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "defaultButtonTitle") as NSString

    public open fun helpAnchor(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "helpAnchor") as NSString

    public open fun setHelpAnchor(helpAnchor: NSString): Unit {
        Native.objc_msgSend("void", this, "setHelpAnchor:", helpAnchor)
    }

    public open fun jobStyleHint(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "jobStyleHint") as NSString

    public open fun setJobStyleHint(jobStyleHint: NSString): Unit {
        Native.objc_msgSend("void", this, "setJobStyleHint:", jobStyleHint)
    }

    public open fun beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo(printInfo: NSPrintInfo, docWindow: NSWindow, delegate: ObjCObject, didEndSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "beginSheetWithPrintInfo:modalForWindow:delegate:didEndSelector:contextInfo:", printInfo, docWindow, delegate, didEndSelector, contextInfo)
    }

    public open fun runModalWithPrintInfo(printInfo: NSPrintInfo): Int =
        Native.objc_msgSend("int", this, "runModalWithPrintInfo:", printInfo) as Int

    public open fun runModal(): Int =
        Native.objc_msgSend("int", this, "runModal") as Int

    public open fun printInfo(): NSPrintInfo =
        Native.objc_msgSend("class objc.NSPrintInfo", this, "printInfo") as NSPrintInfo

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSPrintPanel_NSDeprecated.metaclass {
        public open fun printPanel(): NSPrintPanel =
            Native.objc_msgSend("class objc.NSPrintPanel", this, "printPanel") as NSPrintPanel

    }

    companion object : NSObject(Native.objc_getClass("NSPrintPanel")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSPrintPanel_NSDeprecated : IObjCObject {
    public open fun setAccessoryView(accessoryView: NSView): Unit {
        Native.objc_msgSend("void", this, "setAccessoryView:", accessoryView)
    }

    public open fun accessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "accessoryView") as NSView

    public open fun updateFromPrintInfo(): Unit {
        Native.objc_msgSend("void", this, "updateFromPrintInfo")
    }

    public open fun finalWritePrintInfo(): Unit {
        Native.objc_msgSend("void", this, "finalWritePrintInfo")
    }

    trait metaclass : IObjCObject
}
