// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDocumentController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDocumentController(pointer: Long) : NSObject(pointer), NSCoding, NSUserInterfaceValidations, NSDocumentController_NSDeprecated, NSDocumentController_NSWindowRestoration {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun documents(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "documents") as NSArray

    public open fun currentDocument(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "currentDocument") as ObjCObject

    public open fun currentDirectory(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "currentDirectory") as NSString

    public open fun documentForURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "documentForURL:", url) as ObjCObject

    public open fun documentForWindow(window: NSWindow): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "documentForWindow:", window) as ObjCObject

    public open fun addDocument(document: NSDocument): Unit {
        Native.objc_msgSend("void", this, "addDocument:", document)
    }

    public open fun removeDocument(document: NSDocument): Unit {
        Native.objc_msgSend("void", this, "removeDocument:", document)
    }

    public open fun newDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "newDocument:", sender)
    }

    public open fun openUntitledDocumentAndDisplay_error(displayDocument: Boolean, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "openUntitledDocumentAndDisplay:error:", displayDocument, outError) as ObjCObject

    public open fun makeUntitledDocumentOfType_error(typeName: NSString, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "makeUntitledDocumentOfType:error:", typeName, outError) as ObjCObject

    public open fun openDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "openDocument:", sender)
    }

    public open fun URLsFromRunningOpenPanel(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "URLsFromRunningOpenPanel") as NSArray

    public open fun runModalOpenPanel_forTypes(openPanel: NSOpenPanel, types: NSArray): Int =
        Native.objc_msgSend("int", this, "runModalOpenPanel:forTypes:", openPanel, types) as Int

    public open fun beginOpenPanelWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "beginOpenPanelWithCompletionHandler:", completionHandler)
    }

    public open fun beginOpenPanel_forTypes_completionHandler(openPanel: NSOpenPanel, inTypes: NSArray, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "beginOpenPanel:forTypes:completionHandler:", openPanel, inTypes, completionHandler)
    }

    public open fun openDocumentWithContentsOfURL_display_completionHandler(url: NSURL, displayDocument: Boolean, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "openDocumentWithContentsOfURL:display:completionHandler:", url, displayDocument, completionHandler)
    }

    public open fun makeDocumentWithContentsOfURL_ofType_error(url: NSURL, typeName: NSString, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "makeDocumentWithContentsOfURL:ofType:error:", url, typeName, outError) as ObjCObject

    public open fun reopenDocumentForURL_withContentsOfURL_display_completionHandler(urlOrNil: NSURL, contentsURL: NSURL, displayDocument: Boolean, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "reopenDocumentForURL:withContentsOfURL:display:completionHandler:", urlOrNil, contentsURL, displayDocument, completionHandler)
    }

    public open fun makeDocumentForURL_withContentsOfURL_ofType_error(urlOrNil: NSURL, contentsURL: NSURL, typeName: NSString, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "makeDocumentForURL:withContentsOfURL:ofType:error:", urlOrNil, contentsURL, typeName, outError) as ObjCObject

    public open fun autosavingDelay(): Double =
        Native.objc_msgSend("double", this, "autosavingDelay") as Double

    public open fun setAutosavingDelay(autosavingDelay: Double): Unit {
        Native.objc_msgSend("void", this, "setAutosavingDelay:", autosavingDelay)
    }

    public open fun saveAllDocuments(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "saveAllDocuments:", sender)
    }

    public open fun hasEditedDocuments(): Boolean =
        Native.objc_msgSend("boolean", this, "hasEditedDocuments") as Boolean

    public open fun reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo(title: NSString, cancellable: Boolean, delegate: ObjCObject, didReviewAllSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "reviewUnsavedDocumentsWithAlertTitle:cancellable:delegate:didReviewAllSelector:contextInfo:", title, cancellable, delegate, didReviewAllSelector, contextInfo)
    }

    public open fun closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo(delegate: ObjCObject, didCloseAllSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "closeAllDocumentsWithDelegate:didCloseAllSelector:contextInfo:", delegate, didCloseAllSelector, contextInfo)
    }

    public open fun duplicateDocumentWithContentsOfURL_copying_displayName_error(url: NSURL, duplicateByCopying: Boolean, displayNameOrNil: NSString, outError: Pointer<NSError>): NSDocument =
        Native.objc_msgSend("class objc.NSDocument", this, "duplicateDocumentWithContentsOfURL:copying:displayName:error:", url, duplicateByCopying, displayNameOrNil, outError) as NSDocument

    public open fun presentError_modalForWindow_delegate_didPresentSelector_contextInfo(error: NSError, window: NSWindow, delegate: ObjCObject, didPresentSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "presentError:modalForWindow:delegate:didPresentSelector:contextInfo:", error, window, delegate, didPresentSelector, contextInfo)
    }

    public open fun presentError(error: NSError): Boolean =
        Native.objc_msgSend("boolean", this, "presentError:", error) as Boolean

    public open fun willPresentError(error: NSError): NSError =
        Native.objc_msgSend("class objc.NSError", this, "willPresentError:", error) as NSError

    public open fun maximumRecentDocumentCount(): Int =
        Native.objc_msgSend("int", this, "maximumRecentDocumentCount") as Int

    public open fun clearRecentDocuments(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "clearRecentDocuments:", sender)
    }

    public open fun noteNewRecentDocument(document: NSDocument): Unit {
        Native.objc_msgSend("void", this, "noteNewRecentDocument:", document)
    }

    public open fun noteNewRecentDocumentURL(url: NSURL): Unit {
        Native.objc_msgSend("void", this, "noteNewRecentDocumentURL:", url)
    }

    public open fun recentDocumentURLs(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "recentDocumentURLs") as NSArray

    public open fun defaultType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "defaultType") as NSString

    public open fun typeForContentsOfURL_error(url: NSURL, outError: Pointer<NSError>): NSString =
        Native.objc_msgSend("class objc.NSString", this, "typeForContentsOfURL:error:", url, outError) as NSString

    public open fun documentClassNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "documentClassNames") as NSArray

    public open fun documentClassForType(typeName: NSString): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "documentClassForType:", typeName) as ObjCClass

    public open fun displayNameForType(typeName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "displayNameForType:", typeName) as NSString

    public open fun validateUserInterfaceItem(anItem: Any): Boolean =
        Native.objc_msgSend("boolean", this, "validateUserInterfaceItem:", anItem) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSUserInterfaceValidations.metaclass, NSDocumentController_NSDeprecated.metaclass, NSDocumentController_NSWindowRestoration.metaclass {
        public open fun sharedDocumentController(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sharedDocumentController") as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSDocumentController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSDocumentController_NSDeprecated : IObjCObject {
    public open fun openDocumentWithContentsOfURL_display_error(url: NSURL, displayDocument: Boolean, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "openDocumentWithContentsOfURL:display:error:", url, displayDocument, outError) as ObjCObject

    public open fun reopenDocumentForURL_withContentsOfURL_error(url: NSURL, contentsURL: NSURL, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "reopenDocumentForURL:withContentsOfURL:error:", url, contentsURL, outError) as Boolean

    public open fun fileExtensionsFromType(typeName: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "fileExtensionsFromType:", typeName) as NSArray

    public open fun typeFromFileExtension(fileNameExtensionOrHFSFileType: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "typeFromFileExtension:", fileNameExtensionOrHFSFileType) as NSString

    public open fun documentForFileName(fileName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "documentForFileName:", fileName) as ObjCObject

    public open fun fileNamesFromRunningOpenPanel(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "fileNamesFromRunningOpenPanel") as NSArray

    public open fun makeDocumentWithContentsOfFile_ofType(fileName: NSString, type: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "makeDocumentWithContentsOfFile:ofType:", fileName, type) as ObjCObject

    public open fun makeDocumentWithContentsOfURL_ofType(url: NSURL, type: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "makeDocumentWithContentsOfURL:ofType:", url, type) as ObjCObject

    public open fun makeUntitledDocumentOfType(type: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "makeUntitledDocumentOfType:", type) as ObjCObject

    public open fun openDocumentWithContentsOfFile_display(fileName: NSString, display: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "openDocumentWithContentsOfFile:display:", fileName, display) as ObjCObject

    public open fun openDocumentWithContentsOfURL_display(url: NSURL, display: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "openDocumentWithContentsOfURL:display:", url, display) as ObjCObject

    public open fun openUntitledDocumentOfType_display(type: NSString, display: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "openUntitledDocumentOfType:display:", type, display) as ObjCObject

    public open fun setShouldCreateUI(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShouldCreateUI:", flag)
    }

    public open fun shouldCreateUI(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldCreateUI") as Boolean

    trait metaclass : IObjCObject
}
