// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPrintOperation.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPrintOperation(pointer: Long) : NSObject(pointer), NSPrintOperation_NSDeprecated {
    public open fun isCopyingOperation(): Boolean =
        Native.objc_msgSend("boolean", this, "isCopyingOperation") as Boolean

    public open fun preferredRenderingQuality(): Any =
        Native.objc_msgSend("class objc.Any", this, "preferredRenderingQuality")

    public open fun jobTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "jobTitle") as NSString

    public open fun setJobTitle(jobTitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setJobTitle:", jobTitle)
    }

    public open fun showsPrintPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "showsPrintPanel") as Boolean

    public open fun setShowsPrintPanel(showsPrintPanel: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsPrintPanel:", showsPrintPanel)
    }

    public open fun showsProgressPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "showsProgressPanel") as Boolean

    public open fun setShowsProgressPanel(showsProgressPanel: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsProgressPanel:", showsProgressPanel)
    }

    public open fun printPanel(): NSPrintPanel =
        Native.objc_msgSend("class objc.NSPrintPanel", this, "printPanel") as NSPrintPanel

    public open fun setPrintPanel(printPanel: NSPrintPanel): Unit {
        Native.objc_msgSend("void", this, "setPrintPanel:", printPanel)
    }

    public open fun PDFPanel(): NSPDFPanel =
        Native.objc_msgSend("class objc.NSPDFPanel", this, "PDFPanel") as NSPDFPanel

    public open fun setPDFPanel(PDFPanel: NSPDFPanel): Unit {
        Native.objc_msgSend("void", this, "setPDFPanel:", PDFPanel)
    }

    public open fun canSpawnSeparateThread(): Boolean =
        Native.objc_msgSend("boolean", this, "canSpawnSeparateThread") as Boolean

    public open fun setCanSpawnSeparateThread(canSpawnSeparateThread: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanSpawnSeparateThread:", canSpawnSeparateThread)
    }

    public open fun pageOrder(): Any =
        Native.objc_msgSend("class objc.Any", this, "pageOrder")

    public open fun setPageOrder(pageOrder: Any): Unit {
        Native.objc_msgSend("void", this, "setPageOrder:", pageOrder)
    }

    public open fun runOperationModalForWindow_delegate_didRunSelector_contextInfo(docWindow: NSWindow, delegate: ObjCObject, didRunSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "runOperationModalForWindow:delegate:didRunSelector:contextInfo:", docWindow, delegate, didRunSelector, contextInfo)
    }

    public open fun runOperation(): Boolean =
        Native.objc_msgSend("boolean", this, "runOperation") as Boolean

    public open fun view(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "view") as NSView

    public open fun printInfo(): NSPrintInfo =
        Native.objc_msgSend("class objc.NSPrintInfo", this, "printInfo") as NSPrintInfo

    public open fun setPrintInfo(printInfo: NSPrintInfo): Unit {
        Native.objc_msgSend("void", this, "setPrintInfo:", printInfo)
    }

    public open fun context(): NSGraphicsContext =
        Native.objc_msgSend("class objc.NSGraphicsContext", this, "context") as NSGraphicsContext

    public open fun pageRange(): Any =
        Native.objc_msgSend("class objc.Any", this, "pageRange")

    public open fun currentPage(): Int =
        Native.objc_msgSend("int", this, "currentPage") as Int

    public open fun createContext(): NSGraphicsContext =
        Native.objc_msgSend("class objc.NSGraphicsContext", this, "createContext") as NSGraphicsContext

    public open fun destroyContext(): Unit {
        Native.objc_msgSend("void", this, "destroyContext")
    }

    public open fun deliverResult(): Boolean =
        Native.objc_msgSend("boolean", this, "deliverResult") as Boolean

    public open fun cleanUpOperation(): Unit {
        Native.objc_msgSend("void", this, "cleanUpOperation")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSPrintOperation_NSDeprecated.metaclass {
        public open fun printOperationWithView_printInfo(view: NSView, printInfo: NSPrintInfo): NSPrintOperation =
            Native.objc_msgSend("class objc.NSPrintOperation", this, "printOperationWithView:printInfo:", view, printInfo) as NSPrintOperation

        public open fun PDFOperationWithView_insideRect_toData_printInfo(view: NSView, rect: Any, data: NSMutableData, printInfo: NSPrintInfo): NSPrintOperation =
            Native.objc_msgSend("class objc.NSPrintOperation", this, "PDFOperationWithView:insideRect:toData:printInfo:", view, rect, data, printInfo) as NSPrintOperation

        public open fun PDFOperationWithView_insideRect_toPath_printInfo(view: NSView, rect: Any, path: NSString, printInfo: NSPrintInfo): NSPrintOperation =
            Native.objc_msgSend("class objc.NSPrintOperation", this, "PDFOperationWithView:insideRect:toPath:printInfo:", view, rect, path, printInfo) as NSPrintOperation

        public open fun EPSOperationWithView_insideRect_toData_printInfo(view: NSView, rect: Any, data: NSMutableData, printInfo: NSPrintInfo): NSPrintOperation =
            Native.objc_msgSend("class objc.NSPrintOperation", this, "EPSOperationWithView:insideRect:toData:printInfo:", view, rect, data, printInfo) as NSPrintOperation

        public open fun EPSOperationWithView_insideRect_toPath_printInfo(view: NSView, rect: Any, path: NSString, printInfo: NSPrintInfo): NSPrintOperation =
            Native.objc_msgSend("class objc.NSPrintOperation", this, "EPSOperationWithView:insideRect:toPath:printInfo:", view, rect, path, printInfo) as NSPrintOperation

        public open fun printOperationWithView(view: NSView): NSPrintOperation =
            Native.objc_msgSend("class objc.NSPrintOperation", this, "printOperationWithView:", view) as NSPrintOperation

        public open fun PDFOperationWithView_insideRect_toData(view: NSView, rect: Any, data: NSMutableData): NSPrintOperation =
            Native.objc_msgSend("class objc.NSPrintOperation", this, "PDFOperationWithView:insideRect:toData:", view, rect, data) as NSPrintOperation

        public open fun EPSOperationWithView_insideRect_toData(view: NSView, rect: Any, data: NSMutableData): NSPrintOperation =
            Native.objc_msgSend("class objc.NSPrintOperation", this, "EPSOperationWithView:insideRect:toData:", view, rect, data) as NSPrintOperation

        public open fun currentOperation(): NSPrintOperation =
            Native.objc_msgSend("class objc.NSPrintOperation", this, "currentOperation") as NSPrintOperation

        public open fun setCurrentOperation(operation: NSPrintOperation): Unit {
            Native.objc_msgSend("void", this, "setCurrentOperation:", operation)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSPrintOperation")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSPrintOperation_NSDeprecated : IObjCObject {
    public open fun setAccessoryView(view: NSView): Unit {
        Native.objc_msgSend("void", this, "setAccessoryView:", view)
    }

    public open fun accessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "accessoryView") as NSView

    public open fun setJobStyleHint(hint: NSString): Unit {
        Native.objc_msgSend("void", this, "setJobStyleHint:", hint)
    }

    public open fun jobStyleHint(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "jobStyleHint") as NSString

    public open fun setShowPanels(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowPanels:", flag)
    }

    public open fun showPanels(): Boolean =
        Native.objc_msgSend("boolean", this, "showPanels") as Boolean

    trait metaclass : IObjCObject
}
