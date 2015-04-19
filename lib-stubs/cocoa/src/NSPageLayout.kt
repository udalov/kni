// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPageLayout.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPageLayout(pointer: Long) : NSObject(pointer), NSPageLayout_NSDeprecated {
    public open fun addAccessoryController(accessoryController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "addAccessoryController:", accessoryController)
    }

    public open fun removeAccessoryController(accessoryController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "removeAccessoryController:", accessoryController)
    }

    public open fun accessoryControllers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "accessoryControllers") as NSArray

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

    trait metaclass : NSObject.metaclass, NSPageLayout_NSDeprecated.metaclass {
        public open fun pageLayout(): NSPageLayout =
            Native.objc_msgSend("class objc.NSPageLayout", this, "pageLayout") as NSPageLayout

    }

    companion object : NSObject(Native.objc_getClass("NSPageLayout")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSPageLayout_NSDeprecated : IObjCObject {
    public open fun setAccessoryView(accessoryView: NSView): Unit {
        Native.objc_msgSend("void", this, "setAccessoryView:", accessoryView)
    }

    public open fun accessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "accessoryView") as NSView

    public open fun readPrintInfo(): Unit {
        Native.objc_msgSend("void", this, "readPrintInfo")
    }

    public open fun writePrintInfo(): Unit {
        Native.objc_msgSend("void", this, "writePrintInfo")
    }

    trait metaclass : IObjCObject
}

trait NSApplication_NSPageLayoutPanel : IObjCObject {
    public open fun runPageLayout(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "runPageLayout:", sender)
    }

    trait metaclass : IObjCObject
}
