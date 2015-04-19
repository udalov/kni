// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSApplication.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSApplicationDelegate {
    trait metaclass
}

trait NSServicesMenuRequestor {
    trait metaclass
}

public open class NSApplication(pointer: Long) : NSResponder(pointer), NSUserInterfaceValidations, NSAccessibilityElementProtocol, NSAccessibility, NSApplication_NSWindowsMenu, NSApplication_NSFullKeyboardAccess, NSApplication_NSServicesMenu, NSApplication_NSServicesHandling, NSApplication_NSStandardAboutPanel, NSApplication_NSApplicationLayoutDirection, NSApplication_NSRestorableUserInterface, NSApplication_NSRemoteNotifications, NSApplication_NSDeprecated, NSApplication_NSColorPanel, NSApplication_NSApplicationHelpExtension, NSApplication_NSPageLayoutPanel, NSApplication_NSScripting, NSApplication_NSUserInterfaceItemSearching, NSApplication_NSWindowRestoration, NSApplication_NSRestorableStateExtension {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun context(): NSGraphicsContext =
        Native.objc_msgSend("class objc.NSGraphicsContext", this, "context") as NSGraphicsContext

    public open fun hide(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "hide:", sender)
    }

    public open fun unhide(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "unhide:", sender)
    }

    public open fun unhideWithoutActivation(): Unit {
        Native.objc_msgSend("void", this, "unhideWithoutActivation")
    }

    public open fun windowWithWindowNumber(windowNum: Int): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "windowWithWindowNumber:", windowNum) as NSWindow

    public open fun mainWindow(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "mainWindow") as NSWindow

    public open fun keyWindow(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "keyWindow") as NSWindow

    public open fun isActive(): Boolean =
        Native.objc_msgSend("boolean", this, "isActive") as Boolean

    public open fun isHidden(): Boolean =
        Native.objc_msgSend("boolean", this, "isHidden") as Boolean

    public open fun isRunning(): Boolean =
        Native.objc_msgSend("boolean", this, "isRunning") as Boolean

    public open fun deactivate(): Unit {
        Native.objc_msgSend("void", this, "deactivate")
    }

    public open fun activateIgnoringOtherApps(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "activateIgnoringOtherApps:", flag)
    }

    public open fun hideOtherApplications(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "hideOtherApplications:", sender)
    }

    public open fun unhideAllApplications(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "unhideAllApplications:", sender)
    }

    public open fun finishLaunching(): Unit {
        Native.objc_msgSend("void", this, "finishLaunching")
    }

    public open fun run(): Unit {
        Native.objc_msgSend("void", this, "run")
    }

    public open fun runModalForWindow(theWindow: NSWindow): Int =
        Native.objc_msgSend("int", this, "runModalForWindow:", theWindow) as Int

    public open fun stop(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "stop:", sender)
    }

    public open fun stopModal(): Unit {
        Native.objc_msgSend("void", this, "stopModal")
    }

    public open fun stopModalWithCode(returnCode: Int): Unit {
        Native.objc_msgSend("void", this, "stopModalWithCode:", returnCode)
    }

    public open fun abortModal(): Unit {
        Native.objc_msgSend("void", this, "abortModal")
    }

    public open fun modalWindow(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "modalWindow") as NSWindow

    public open fun beginModalSessionForWindow(theWindow: NSWindow): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "beginModalSessionForWindow:", theWindow) as Pointer<Any>

    public open fun runModalSession(session: Pointer<Any>): Int =
        Native.objc_msgSend("int", this, "runModalSession:", session) as Int

    public open fun endModalSession(session: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "endModalSession:", session)
    }

    public open fun terminate(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "terminate:", sender)
    }

    public open fun requestUserAttention(requestType: Any): Int =
        Native.objc_msgSend("int", this, "requestUserAttention:", requestType) as Int

    public open fun cancelUserAttentionRequest(request: Int): Unit {
        Native.objc_msgSend("void", this, "cancelUserAttentionRequest:", request)
    }

    public open fun nextEventMatchingMask_untilDate_inMode_dequeue(mask: Int, expiration: NSDate, mode: NSString, deqFlag: Boolean): NSEvent =
        Native.objc_msgSend("class objc.NSEvent", this, "nextEventMatchingMask:untilDate:inMode:dequeue:", mask, expiration, mode, deqFlag) as NSEvent

    public open fun discardEventsMatchingMask_beforeEvent(mask: Int, lastEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "discardEventsMatchingMask:beforeEvent:", mask, lastEvent)
    }

    public open fun postEvent_atStart(event: NSEvent, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "postEvent:atStart:", event, flag)
    }

    public open fun currentEvent(): NSEvent =
        Native.objc_msgSend("class objc.NSEvent", this, "currentEvent") as NSEvent

    public open fun sendEvent(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "sendEvent:", theEvent)
    }

    public open fun preventWindowOrdering(): Unit {
        Native.objc_msgSend("void", this, "preventWindowOrdering")
    }

    public open fun makeWindowsPerform_inOrder(aSelector: ObjCSelector, flag: Boolean): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "makeWindowsPerform:inOrder:", aSelector, flag) as NSWindow

    public open fun windows(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "windows") as NSArray

    public open fun setWindowsNeedUpdate(needUpdate: Boolean): Unit {
        Native.objc_msgSend("void", this, "setWindowsNeedUpdate:", needUpdate)
    }

    public open fun updateWindows(): Unit {
        Native.objc_msgSend("void", this, "updateWindows")
    }

    public open fun mainMenu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "mainMenu") as NSMenu

    public open fun setMainMenu(mainMenu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setMainMenu:", mainMenu)
    }

    public open fun helpMenu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "helpMenu") as NSMenu

    public open fun setHelpMenu(helpMenu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setHelpMenu:", helpMenu)
    }

    public open fun applicationIconImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "applicationIconImage") as NSImage

    public open fun setApplicationIconImage(applicationIconImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setApplicationIconImage:", applicationIconImage)
    }

    public open fun activationPolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "activationPolicy")

    public open fun setActivationPolicy(activationPolicy: Any): Boolean =
        Native.objc_msgSend("boolean", this, "setActivationPolicy:", activationPolicy) as Boolean

    public open fun dockTile(): NSDockTile =
        Native.objc_msgSend("class objc.NSDockTile", this, "dockTile") as NSDockTile

    public open fun sendAction_to_from(theAction: ObjCSelector, theTarget: ObjCObject, sender: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "sendAction:to:from:", theAction, theTarget, sender) as Boolean

    public open fun targetForAction(theAction: ObjCSelector): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "targetForAction:", theAction) as ObjCObject

    public open fun targetForAction_to_from(theAction: ObjCSelector, theTarget: ObjCObject, sender: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "targetForAction:to:from:", theAction, theTarget, sender) as ObjCObject

    override fun tryToPerform_with(anAction: ObjCSelector, anObject: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "tryToPerform:with:", anAction, anObject) as Boolean

    override fun validRequestorForSendType_returnType(sendType: NSString, returnType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "validRequestorForSendType:returnType:", sendType, returnType) as ObjCObject

    public open fun reportException(theException: NSException): Unit {
        Native.objc_msgSend("void", this, "reportException:", theException)
    }

    public open fun replyToApplicationShouldTerminate(shouldTerminate: Boolean): Unit {
        Native.objc_msgSend("void", this, "replyToApplicationShouldTerminate:", shouldTerminate)
    }

    public open fun replyToOpenOrPrint(reply: Any): Unit {
        Native.objc_msgSend("void", this, "replyToOpenOrPrint:", reply)
    }

    public open fun orderFrontCharacterPalette(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontCharacterPalette:", sender)
    }

    public open fun presentationOptions(): Any =
        Native.objc_msgSend("class objc.Any", this, "presentationOptions")

    public open fun setPresentationOptions(presentationOptions: Any): Unit {
        Native.objc_msgSend("void", this, "setPresentationOptions:", presentationOptions)
    }

    public open fun currentSystemPresentationOptions(): Any =
        Native.objc_msgSend("class objc.Any", this, "currentSystemPresentationOptions")

    public open fun occlusionState(): Any =
        Native.objc_msgSend("class objc.Any", this, "occlusionState")

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSResponder.metaclass, NSUserInterfaceValidations.metaclass, NSAccessibilityElementProtocol.metaclass, NSAccessibility.metaclass, NSApplication_NSWindowsMenu.metaclass, NSApplication_NSFullKeyboardAccess.metaclass, NSApplication_NSServicesMenu.metaclass, NSApplication_NSServicesHandling.metaclass, NSApplication_NSStandardAboutPanel.metaclass, NSApplication_NSApplicationLayoutDirection.metaclass, NSApplication_NSRestorableUserInterface.metaclass, NSApplication_NSRemoteNotifications.metaclass, NSApplication_NSDeprecated.metaclass, NSApplication_NSColorPanel.metaclass, NSApplication_NSApplicationHelpExtension.metaclass, NSApplication_NSPageLayoutPanel.metaclass, NSApplication_NSScripting.metaclass, NSApplication_NSUserInterfaceItemSearching.metaclass, NSApplication_NSWindowRestoration.metaclass, NSApplication_NSRestorableStateExtension.metaclass {
        public open fun sharedApplication(): NSApplication =
            Native.objc_msgSend("class objc.NSApplication", this, "sharedApplication") as NSApplication

        public open fun detachDrawingThread_toTarget_withObject(selector: ObjCSelector, target: ObjCObject, argument: ObjCObject): Unit {
            Native.objc_msgSend("void", this, "detachDrawingThread:toTarget:withObject:", selector, target, argument)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSApplication")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSApplication_NSWindowsMenu : IObjCObject {
    public open fun windowsMenu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "windowsMenu") as NSMenu

    public open fun setWindowsMenu(windowsMenu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setWindowsMenu:", windowsMenu)
    }

    public open fun arrangeInFront(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "arrangeInFront:", sender)
    }

    public open fun removeWindowsItem(win: NSWindow): Unit {
        Native.objc_msgSend("void", this, "removeWindowsItem:", win)
    }

    public open fun addWindowsItem_title_filename(win: NSWindow, aString: NSString, isFilename: Boolean): Unit {
        Native.objc_msgSend("void", this, "addWindowsItem:title:filename:", win, aString, isFilename)
    }

    public open fun changeWindowsItem_title_filename(win: NSWindow, aString: NSString, isFilename: Boolean): Unit {
        Native.objc_msgSend("void", this, "changeWindowsItem:title:filename:", win, aString, isFilename)
    }

    public open fun updateWindowsItem(win: NSWindow): Unit {
        Native.objc_msgSend("void", this, "updateWindowsItem:", win)
    }

    public open fun miniaturizeAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "miniaturizeAll:", sender)
    }

    trait metaclass : IObjCObject
}

trait NSApplication_NSFullKeyboardAccess : IObjCObject {
    public open fun isFullKeyboardAccessEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isFullKeyboardAccessEnabled") as Boolean

    trait metaclass : IObjCObject
}

trait NSApplication_NSServicesMenu : IObjCObject {
    public open fun servicesMenu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "servicesMenu") as NSMenu

    public open fun setServicesMenu(servicesMenu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setServicesMenu:", servicesMenu)
    }

    public open fun registerServicesMenuSendTypes_returnTypes(sendTypes: NSArray, returnTypes: NSArray): Unit {
        Native.objc_msgSend("void", this, "registerServicesMenuSendTypes:returnTypes:", sendTypes, returnTypes)
    }

    trait metaclass : IObjCObject
}

trait NSApplication_NSServicesHandling : IObjCObject {
    public open fun servicesProvider(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "servicesProvider") as ObjCObject

    public open fun setServicesProvider(servicesProvider: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setServicesProvider:", servicesProvider)
    }

    trait metaclass : IObjCObject
}

trait NSApplication_NSStandardAboutPanel : IObjCObject {
    public open fun orderFrontStandardAboutPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontStandardAboutPanel:", sender)
    }

    public open fun orderFrontStandardAboutPanelWithOptions(optionsDictionary: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "orderFrontStandardAboutPanelWithOptions:", optionsDictionary)
    }

    trait metaclass : IObjCObject
}

trait NSApplication_NSApplicationLayoutDirection : IObjCObject {
    public open fun userInterfaceLayoutDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "userInterfaceLayoutDirection")

    trait metaclass : IObjCObject
}

trait NSApplication_NSRestorableUserInterface : IObjCObject {
    public open fun disableRelaunchOnLogin(): Unit {
        Native.objc_msgSend("void", this, "disableRelaunchOnLogin")
    }

    public open fun enableRelaunchOnLogin(): Unit {
        Native.objc_msgSend("void", this, "enableRelaunchOnLogin")
    }

    trait metaclass : IObjCObject
}

trait NSApplication_NSRemoteNotifications : IObjCObject {
    public open fun registerForRemoteNotificationTypes(types: Any): Unit {
        Native.objc_msgSend("void", this, "registerForRemoteNotificationTypes:", types)
    }

    public open fun unregisterForRemoteNotifications(): Unit {
        Native.objc_msgSend("void", this, "unregisterForRemoteNotifications")
    }

    public open fun enabledRemoteNotificationTypes(): Any =
        Native.objc_msgSend("class objc.Any", this, "enabledRemoteNotificationTypes")

    trait metaclass : IObjCObject
}

trait NSApplication_NSDeprecated : IObjCObject {
    public open fun runModalForWindow_relativeToWindow(theWindow: NSWindow, docWindow: NSWindow): Int =
        Native.objc_msgSend("int", this, "runModalForWindow:relativeToWindow:", theWindow, docWindow) as Int

    public open fun beginModalSessionForWindow_relativeToWindow(theWindow: NSWindow, docWindow: NSWindow): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "beginModalSessionForWindow:relativeToWindow:", theWindow, docWindow) as Pointer<Any>

    public open fun application_printFiles(sender: NSApplication, filenames: NSArray): Unit {
        Native.objc_msgSend("void", this, "application:printFiles:", sender, filenames)
    }

    public open fun beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo(sheet: NSWindow, docWindow: NSWindow, modalDelegate: ObjCObject, didEndSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "beginSheet:modalForWindow:modalDelegate:didEndSelector:contextInfo:", sheet, docWindow, modalDelegate, didEndSelector, contextInfo)
    }

    public open fun endSheet(sheet: NSWindow): Unit {
        Native.objc_msgSend("void", this, "endSheet:", sheet)
    }

    public open fun endSheet_returnCode(sheet: NSWindow, returnCode: Int): Unit {
        Native.objc_msgSend("void", this, "endSheet:returnCode:", sheet, returnCode)
    }

    trait metaclass : IObjCObject
}
