// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSavePanel.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSOpenSavePanelDelegate {
    trait metaclass
}

public open class NSSavePanel(pointer: Long) : NSPanel(pointer), NSSavePanel_NSDeprecated {
    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun directoryURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "directoryURL") as NSURL

    public open fun setDirectoryURL(directoryURL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setDirectoryURL:", directoryURL)
    }

    public open fun allowedFileTypes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allowedFileTypes") as NSArray

    public open fun setAllowedFileTypes(allowedFileTypes: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAllowedFileTypes:", allowedFileTypes)
    }

    public open fun allowsOtherFileTypes(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsOtherFileTypes") as Boolean

    public open fun setAllowsOtherFileTypes(allowsOtherFileTypes: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsOtherFileTypes:", allowsOtherFileTypes)
    }

    public open fun accessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "accessoryView") as NSView

    public open fun setAccessoryView(accessoryView: NSView): Unit {
        Native.objc_msgSend("void", this, "setAccessoryView:", accessoryView)
    }

    override fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    override fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun isExpanded(): Boolean =
        Native.objc_msgSend("boolean", this, "isExpanded") as Boolean

    public open fun canCreateDirectories(): Boolean =
        Native.objc_msgSend("boolean", this, "canCreateDirectories") as Boolean

    public open fun setCanCreateDirectories(canCreateDirectories: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanCreateDirectories:", canCreateDirectories)
    }

    public open fun canSelectHiddenExtension(): Boolean =
        Native.objc_msgSend("boolean", this, "canSelectHiddenExtension") as Boolean

    public open fun setCanSelectHiddenExtension(canSelectHiddenExtension: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanSelectHiddenExtension:", canSelectHiddenExtension)
    }

    public open fun isExtensionHidden(): Boolean =
        Native.objc_msgSend("boolean", this, "isExtensionHidden") as Boolean

    public open fun setExtensionHidden(extensionHidden: Boolean): Unit {
        Native.objc_msgSend("void", this, "setExtensionHidden:", extensionHidden)
    }

    public open fun treatsFilePackagesAsDirectories(): Boolean =
        Native.objc_msgSend("boolean", this, "treatsFilePackagesAsDirectories") as Boolean

    public open fun setTreatsFilePackagesAsDirectories(treatsFilePackagesAsDirectories: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTreatsFilePackagesAsDirectories:", treatsFilePackagesAsDirectories)
    }

    public open fun prompt(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "prompt") as NSString

    public open fun setPrompt(prompt: NSString): Unit {
        Native.objc_msgSend("void", this, "setPrompt:", prompt)
    }

    override fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    override fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun nameFieldLabel(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "nameFieldLabel") as NSString

    public open fun setNameFieldLabel(nameFieldLabel: NSString): Unit {
        Native.objc_msgSend("void", this, "setNameFieldLabel:", nameFieldLabel)
    }

    public open fun nameFieldStringValue(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "nameFieldStringValue") as NSString

    public open fun setNameFieldStringValue(nameFieldStringValue: NSString): Unit {
        Native.objc_msgSend("void", this, "setNameFieldStringValue:", nameFieldStringValue)
    }

    public open fun message(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "message") as NSString

    public open fun setMessage(message: NSString): Unit {
        Native.objc_msgSend("void", this, "setMessage:", message)
    }

    public open fun validateVisibleColumns(): Unit {
        Native.objc_msgSend("void", this, "validateVisibleColumns")
    }

    public open fun showsHiddenFiles(): Boolean =
        Native.objc_msgSend("boolean", this, "showsHiddenFiles") as Boolean

    public open fun setShowsHiddenFiles(showsHiddenFiles: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsHiddenFiles:", showsHiddenFiles)
    }

    public open fun showsTagField(): Boolean =
        Native.objc_msgSend("boolean", this, "showsTagField") as Boolean

    public open fun setShowsTagField(showsTagField: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsTagField:", showsTagField)
    }

    public open fun tagNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "tagNames") as NSArray

    public open fun setTagNames(tagNames: NSArray): Unit {
        Native.objc_msgSend("void", this, "setTagNames:", tagNames)
    }

    public open fun ok(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "ok:", sender)
    }

    public open fun cancel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "cancel:", sender)
    }

    public open fun beginSheetModalForWindow_completionHandler(window: NSWindow, handler: Any): Unit {
        Native.objc_msgSend("void", this, "beginSheetModalForWindow:completionHandler:", window, handler)
    }

    public open fun beginWithCompletionHandler(handler: Any): Unit {
        Native.objc_msgSend("void", this, "beginWithCompletionHandler:", handler)
    }

    public open fun runModal(): Int =
        Native.objc_msgSend("int", this, "runModal") as Int

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun isFloatingPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "isFloatingPanel") as Boolean

    override fun keyDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "keyDown:", theEvent)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun tryToPerform_with(anAction: ObjCSelector, anObject: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "tryToPerform:with:", anAction, anObject) as Boolean

    override fun validRequestorForSendType_returnType(sendType: NSString, returnType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "validRequestorForSendType:returnType:", sendType, returnType) as ObjCObject

    override fun worksWhenModal(): Boolean =
        Native.objc_msgSend("boolean", this, "worksWhenModal") as Boolean

    trait metaclass : NSPanel.metaclass, NSSavePanel_NSDeprecated.metaclass {
        public open fun savePanel(): NSSavePanel =
            Native.objc_msgSend("class objc.NSSavePanel", this, "savePanel") as NSSavePanel

    }

    companion object : NSObject(Native.objc_getClass("NSSavePanel")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSSavePanelDelegateDeprecated : IObjCObject {
    public open fun panel_isValidFilename(sender: ObjCObject, filename: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "panel:isValidFilename:", sender, filename) as Boolean

    public open fun panel_directoryDidChange(sender: ObjCObject, path: NSString): Unit {
        Native.objc_msgSend("void", this, "panel:directoryDidChange:", sender, path)
    }

    public open fun panel_compareFilename_with_caseSensitive(sender: ObjCObject, name1: NSString, name2: NSString, caseSensitive: Boolean): Any =
        Native.objc_msgSend("class objc.Any", this, "panel:compareFilename:with:caseSensitive:", sender, name1, name2, caseSensitive)

    public open fun panel_shouldShowFilename(sender: ObjCObject, filename: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "panel:shouldShowFilename:", sender, filename) as Boolean

    trait metaclass : IObjCObject
}

trait NSSavePanel_NSDeprecated : IObjCObject {
    public open fun filename(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "filename") as NSString

    public open fun directory(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "directory") as NSString

    public open fun setDirectory(path: NSString): Unit {
        Native.objc_msgSend("void", this, "setDirectory:", path)
    }

    public open fun requiredFileType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "requiredFileType") as NSString

    public open fun setRequiredFileType(type: NSString): Unit {
        Native.objc_msgSend("void", this, "setRequiredFileType:", type)
    }

    public open fun beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo(path: NSString, name: NSString, docWindow: NSWindow, delegate: ObjCObject, didEndSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "beginSheetForDirectory:file:modalForWindow:modalDelegate:didEndSelector:contextInfo:", path, name, docWindow, delegate, didEndSelector, contextInfo)
    }

    public open fun runModalForDirectory_file(path: NSString, name: NSString): Int =
        Native.objc_msgSend("int", this, "runModalForDirectory:file:", path, name) as Int

    public open fun selectText(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectText:", sender)
    }

    trait metaclass : IObjCObject
}
