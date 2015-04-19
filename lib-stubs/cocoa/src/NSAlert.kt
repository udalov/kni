// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSAlert.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSAlertDelegate {
    trait metaclass
}

public open class NSAlert(pointer: Long) : NSObject(pointer) {
    public open fun messageText(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "messageText") as NSString

    public open fun setMessageText(messageText: NSString): Unit {
        Native.objc_msgSend("void", this, "setMessageText:", messageText)
    }

    public open fun informativeText(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "informativeText") as NSString

    public open fun setInformativeText(informativeText: NSString): Unit {
        Native.objc_msgSend("void", this, "setInformativeText:", informativeText)
    }

    public open fun icon(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "icon") as NSImage

    public open fun setIcon(icon: NSImage): Unit {
        Native.objc_msgSend("void", this, "setIcon:", icon)
    }

    public open fun addButtonWithTitle(title: NSString): NSButton =
        Native.objc_msgSend("class objc.NSButton", this, "addButtonWithTitle:", title) as NSButton

    public open fun buttons(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "buttons") as NSArray

    public open fun showsHelp(): Boolean =
        Native.objc_msgSend("boolean", this, "showsHelp") as Boolean

    public open fun setShowsHelp(showsHelp: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsHelp:", showsHelp)
    }

    public open fun helpAnchor(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "helpAnchor") as NSString

    public open fun setHelpAnchor(helpAnchor: NSString): Unit {
        Native.objc_msgSend("void", this, "setHelpAnchor:", helpAnchor)
    }

    public open fun alertStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "alertStyle")

    public open fun setAlertStyle(alertStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setAlertStyle:", alertStyle)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun showsSuppressionButton(): Boolean =
        Native.objc_msgSend("boolean", this, "showsSuppressionButton") as Boolean

    public open fun setShowsSuppressionButton(showsSuppressionButton: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsSuppressionButton:", showsSuppressionButton)
    }

    public open fun suppressionButton(): NSButton =
        Native.objc_msgSend("class objc.NSButton", this, "suppressionButton") as NSButton

    public open fun accessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "accessoryView") as NSView

    public open fun setAccessoryView(accessoryView: NSView): Unit {
        Native.objc_msgSend("void", this, "setAccessoryView:", accessoryView)
    }

    public open fun layout(): Unit {
        Native.objc_msgSend("void", this, "layout")
    }

    public open fun runModal(): Int =
        Native.objc_msgSend("int", this, "runModal") as Int

    public open fun beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo(window: NSWindow, delegate: ObjCObject, didEndSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "beginSheetModalForWindow:modalDelegate:didEndSelector:contextInfo:", window, delegate, didEndSelector, contextInfo)
    }

    public open fun beginSheetModalForWindow_completionHandler(sheetWindow: NSWindow, handler: Any): Unit {
        Native.objc_msgSend("void", this, "beginSheetModalForWindow:completionHandler:", sheetWindow, handler)
    }

    public open fun window(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "window") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun alertWithError(error: NSError): NSAlert =
            Native.objc_msgSend("class objc.NSAlert", this, "alertWithError:", error) as NSAlert

        public open fun alertWithMessageText_defaultButton_alternateButton_otherButton_informativeTextWithFormat(message: NSString, defaultButton: NSString, alternateButton: NSString, otherButton: NSString, format: NSString): NSAlert =
            Native.objc_msgSend("class objc.NSAlert", this, "alertWithMessageText:defaultButton:alternateButton:otherButton:informativeTextWithFormat:", message, defaultButton, alternateButton, otherButton, format) as NSAlert

    }

    companion object : NSObject(Native.objc_getClass("NSAlert")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
