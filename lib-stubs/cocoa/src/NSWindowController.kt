// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSWindowController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSWindowController(pointer: Long) : NSResponder(pointer), NSCoding, NSSeguePerforming, NSWindowController_NSWindowControllerStoryboardingMethods, NSWindowController_NSWindowControllerDismissing {
    public open fun initWithWindow(window: NSWindow): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithWindow:", window) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun initWithWindowNibName(windowNibName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithWindowNibName:", windowNibName) as ObjCObject

    public open fun initWithWindowNibName_owner(windowNibName: NSString, owner: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithWindowNibName:owner:", windowNibName, owner) as ObjCObject

    public open fun initWithWindowNibPath_owner(windowNibPath: NSString, owner: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithWindowNibPath:owner:", windowNibPath, owner) as ObjCObject

    public open fun windowNibName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "windowNibName") as NSString

    public open fun windowNibPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "windowNibPath") as NSString

    public open fun owner(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "owner") as ObjCObject

    public open fun windowFrameAutosaveName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "windowFrameAutosaveName") as NSString

    public open fun setWindowFrameAutosaveName(windowFrameAutosaveName: NSString): Unit {
        Native.objc_msgSend("void", this, "setWindowFrameAutosaveName:", windowFrameAutosaveName)
    }

    public open fun shouldCascadeWindows(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldCascadeWindows") as Boolean

    public open fun setShouldCascadeWindows(shouldCascadeWindows: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShouldCascadeWindows:", shouldCascadeWindows)
    }

    public open fun document(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "document") as ObjCObject

    public open fun setDocument(document: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setDocument:", document)
    }

    public open fun setDocumentEdited(dirtyFlag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDocumentEdited:", dirtyFlag)
    }

    public open fun shouldCloseDocument(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldCloseDocument") as Boolean

    public open fun setShouldCloseDocument(shouldCloseDocument: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShouldCloseDocument:", shouldCloseDocument)
    }

    public open fun synchronizeWindowTitleWithDocumentName(): Unit {
        Native.objc_msgSend("void", this, "synchronizeWindowTitleWithDocumentName")
    }

    public open fun windowTitleForDocumentDisplayName(displayName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "windowTitleForDocumentDisplayName:", displayName) as NSString

    public open fun contentViewController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "contentViewController") as NSViewController

    public open fun setContentViewController(contentViewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "setContentViewController:", contentViewController)
    }

    public open fun window(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "window") as NSWindow

    public open fun setWindow(window: NSWindow): Unit {
        Native.objc_msgSend("void", this, "setWindow:", window)
    }

    public open fun isWindowLoaded(): Boolean =
        Native.objc_msgSend("boolean", this, "isWindowLoaded") as Boolean

    public open fun windowWillLoad(): Unit {
        Native.objc_msgSend("void", this, "windowWillLoad")
    }

    public open fun windowDidLoad(): Unit {
        Native.objc_msgSend("void", this, "windowDidLoad")
    }

    public open fun loadWindow(): Unit {
        Native.objc_msgSend("void", this, "loadWindow")
    }

    public open fun close(): Unit {
        Native.objc_msgSend("void", this, "close")
    }

    public open fun showWindow(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "showWindow:", sender)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSResponder.metaclass, NSCoding.metaclass, NSSeguePerforming.metaclass, NSWindowController_NSWindowControllerStoryboardingMethods.metaclass, NSWindowController_NSWindowControllerDismissing.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSWindowController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSWindowController_NSWindowControllerStoryboardingMethods : IObjCObject {
    public open fun storyboard(): NSStoryboard =
        Native.objc_msgSend("class objc.NSStoryboard", this, "storyboard") as NSStoryboard

    trait metaclass : IObjCObject
}

trait NSWindowController_NSWindowControllerDismissing : IObjCObject {
    public open fun dismissController(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "dismissController:", sender)
    }

    trait metaclass : IObjCObject
}
