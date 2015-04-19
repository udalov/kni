// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSOpenPanel.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSOpenPanel(pointer: Long) : NSSavePanel(pointer), NSOpenPanel_NSDeprecated {
    public open fun URLs(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "URLs") as NSArray

    public open fun resolvesAliases(): Boolean =
        Native.objc_msgSend("boolean", this, "resolvesAliases") as Boolean

    public open fun setResolvesAliases(resolvesAliases: Boolean): Unit {
        Native.objc_msgSend("void", this, "setResolvesAliases:", resolvesAliases)
    }

    public open fun canChooseDirectories(): Boolean =
        Native.objc_msgSend("boolean", this, "canChooseDirectories") as Boolean

    public open fun setCanChooseDirectories(canChooseDirectories: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanChooseDirectories:", canChooseDirectories)
    }

    public open fun allowsMultipleSelection(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsMultipleSelection") as Boolean

    public open fun setAllowsMultipleSelection(allowsMultipleSelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsMultipleSelection:", allowsMultipleSelection)
    }

    public open fun canChooseFiles(): Boolean =
        Native.objc_msgSend("boolean", this, "canChooseFiles") as Boolean

    public open fun setCanChooseFiles(canChooseFiles: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanChooseFiles:", canChooseFiles)
    }

    public open fun canResolveUbiquitousConflicts(): Boolean =
        Native.objc_msgSend("boolean", this, "canResolveUbiquitousConflicts") as Boolean

    public open fun setCanResolveUbiquitousConflicts(canResolveUbiquitousConflicts: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanResolveUbiquitousConflicts:", canResolveUbiquitousConflicts)
    }

    public open fun canDownloadUbiquitousContents(): Boolean =
        Native.objc_msgSend("boolean", this, "canDownloadUbiquitousContents") as Boolean

    public open fun setCanDownloadUbiquitousContents(canDownloadUbiquitousContents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanDownloadUbiquitousContents:", canDownloadUbiquitousContents)
    }

    override fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

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

    override fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    override fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    override fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    override fun tryToPerform_with(anAction: ObjCSelector, anObject: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "tryToPerform:with:", anAction, anObject) as Boolean

    override fun validRequestorForSendType_returnType(sendType: NSString, returnType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "validRequestorForSendType:returnType:", sendType, returnType) as ObjCObject

    override fun worksWhenModal(): Boolean =
        Native.objc_msgSend("boolean", this, "worksWhenModal") as Boolean

    trait metaclass : NSSavePanel.metaclass, NSOpenPanel_NSDeprecated.metaclass {
        public open fun openPanel(): NSOpenPanel =
            Native.objc_msgSend("class objc.NSOpenPanel", this, "openPanel") as NSOpenPanel

    }

    companion object : NSObject(Native.objc_getClass("NSOpenPanel")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSOpenPanel_NSDeprecated : IObjCObject {
    public open fun filenames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "filenames") as NSArray

    public open fun beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo(path: NSString, name: NSString, fileTypes: NSArray, docWindow: NSWindow, delegate: ObjCObject, didEndSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "beginSheetForDirectory:file:types:modalForWindow:modalDelegate:didEndSelector:contextInfo:", path, name, fileTypes, docWindow, delegate, didEndSelector, contextInfo)
    }

    public open fun beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo(path: NSString, name: NSString, fileTypes: NSArray, delegate: ObjCObject, didEndSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "beginForDirectory:file:types:modelessDelegate:didEndSelector:contextInfo:", path, name, fileTypes, delegate, didEndSelector, contextInfo)
    }

    public open fun runModalForDirectory_file_types(path: NSString, name: NSString, fileTypes: NSArray): Int =
        Native.objc_msgSend("int", this, "runModalForDirectory:file:types:", path, name, fileTypes) as Int

    public open fun runModalForTypes(fileTypes: NSArray): Int =
        Native.objc_msgSend("int", this, "runModalForTypes:", fileTypes) as Int

    trait metaclass : IObjCObject
}
