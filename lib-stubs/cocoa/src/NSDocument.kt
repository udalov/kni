// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDocument.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDocument(pointer: Long) : NSObject(pointer), NSFilePresenter, NSUserInterfaceValidations, NSDocument_NSDeprecated, NSDocument_NSUserActivity, NSDocument_NSScripting, NSDocument_NSRestorableState {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithType_error(typeName: NSString, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithType:error:", typeName, outError) as ObjCObject

    public open fun initWithContentsOfURL_ofType_error(url: NSURL, typeName: NSString, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:ofType:error:", url, typeName, outError) as ObjCObject

    public open fun initForURL_withContentsOfURL_ofType_error(urlOrNil: NSURL, contentsURL: NSURL, typeName: NSString, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initForURL:withContentsOfURL:ofType:error:", urlOrNil, contentsURL, typeName, outError) as ObjCObject

    public open fun fileType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fileType") as NSString

    public open fun setFileType(fileType: NSString): Unit {
        Native.objc_msgSend("void", this, "setFileType:", fileType)
    }

    public open fun fileURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "fileURL") as NSURL

    public open fun setFileURL(fileURL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setFileURL:", fileURL)
    }

    public open fun fileModificationDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "fileModificationDate") as NSDate

    public open fun setFileModificationDate(fileModificationDate: NSDate): Unit {
        Native.objc_msgSend("void", this, "setFileModificationDate:", fileModificationDate)
    }

    public open fun isDraft(): Boolean =
        Native.objc_msgSend("boolean", this, "isDraft") as Boolean

    public open fun setDraft(draft: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDraft:", draft)
    }

    public open fun performActivityWithSynchronousWaiting_usingBlock(waitSynchronously: Boolean, block: Any): Unit {
        Native.objc_msgSend("void", this, "performActivityWithSynchronousWaiting:usingBlock:", waitSynchronously, block)
    }

    public open fun continueActivityUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "continueActivityUsingBlock:", block)
    }

    public open fun continueAsynchronousWorkOnMainThreadUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "continueAsynchronousWorkOnMainThreadUsingBlock:", block)
    }

    public open fun performSynchronousFileAccessUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "performSynchronousFileAccessUsingBlock:", block)
    }

    public open fun performAsynchronousFileAccessUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "performAsynchronousFileAccessUsingBlock:", block)
    }

    public open fun revertDocumentToSaved(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "revertDocumentToSaved:", sender)
    }

    public open fun revertToContentsOfURL_ofType_error(url: NSURL, typeName: NSString, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "revertToContentsOfURL:ofType:error:", url, typeName, outError) as Boolean

    public open fun readFromURL_ofType_error(url: NSURL, typeName: NSString, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "readFromURL:ofType:error:", url, typeName, outError) as Boolean

    public open fun readFromFileWrapper_ofType_error(fileWrapper: NSFileWrapper, typeName: NSString, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "readFromFileWrapper:ofType:error:", fileWrapper, typeName, outError) as Boolean

    public open fun readFromData_ofType_error(data: NSData, typeName: NSString, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "readFromData:ofType:error:", data, typeName, outError) as Boolean

    public open fun isEntireFileLoaded(): Boolean =
        Native.objc_msgSend("boolean", this, "isEntireFileLoaded") as Boolean

    public open fun writeToURL_ofType_error(url: NSURL, typeName: NSString, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:ofType:error:", url, typeName, outError) as Boolean

    public open fun fileWrapperOfType_error(typeName: NSString, outError: Pointer<NSError>): NSFileWrapper =
        Native.objc_msgSend("class objc.NSFileWrapper", this, "fileWrapperOfType:error:", typeName, outError) as NSFileWrapper

    public open fun dataOfType_error(typeName: NSString, outError: Pointer<NSError>): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataOfType:error:", typeName, outError) as NSData

    public open fun unblockUserInteraction(): Unit {
        Native.objc_msgSend("void", this, "unblockUserInteraction")
    }

    public open fun autosavingIsImplicitlyCancellable(): Boolean =
        Native.objc_msgSend("boolean", this, "autosavingIsImplicitlyCancellable") as Boolean

    public open fun writeSafelyToURL_ofType_forSaveOperation_error(url: NSURL, typeName: NSString, saveOperation: Any, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "writeSafelyToURL:ofType:forSaveOperation:error:", url, typeName, saveOperation, outError) as Boolean

    public open fun writeToURL_ofType_forSaveOperation_originalContentsURL_error(url: NSURL, typeName: NSString, saveOperation: Any, absoluteOriginalContentsURL: NSURL, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:ofType:forSaveOperation:originalContentsURL:error:", url, typeName, saveOperation, absoluteOriginalContentsURL, outError) as Boolean

    public open fun fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error(url: NSURL, typeName: NSString, saveOperation: Any, absoluteOriginalContentsURL: NSURL, outError: Pointer<NSError>): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "fileAttributesToWriteToURL:ofType:forSaveOperation:originalContentsURL:error:", url, typeName, saveOperation, absoluteOriginalContentsURL, outError) as NSDictionary

    public open fun keepBackupFile(): Boolean =
        Native.objc_msgSend("boolean", this, "keepBackupFile") as Boolean

    public open fun backupFileURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "backupFileURL") as NSURL

    public open fun saveDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "saveDocument:", sender)
    }

    public open fun saveDocumentAs(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "saveDocumentAs:", sender)
    }

    public open fun saveDocumentTo(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "saveDocumentTo:", sender)
    }

    public open fun saveDocumentWithDelegate_didSaveSelector_contextInfo(delegate: ObjCObject, didSaveSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "saveDocumentWithDelegate:didSaveSelector:contextInfo:", delegate, didSaveSelector, contextInfo)
    }

    public open fun runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo(saveOperation: Any, delegate: ObjCObject, didSaveSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "runModalSavePanelForSaveOperation:delegate:didSaveSelector:contextInfo:", saveOperation, delegate, didSaveSelector, contextInfo)
    }

    public open fun shouldRunSavePanelWithAccessoryView(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldRunSavePanelWithAccessoryView") as Boolean

    public open fun prepareSavePanel(savePanel: NSSavePanel): Boolean =
        Native.objc_msgSend("boolean", this, "prepareSavePanel:", savePanel) as Boolean

    public open fun fileNameExtensionWasHiddenInLastRunSavePanel(): Boolean =
        Native.objc_msgSend("boolean", this, "fileNameExtensionWasHiddenInLastRunSavePanel") as Boolean

    public open fun fileTypeFromLastRunSavePanel(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fileTypeFromLastRunSavePanel") as NSString

    public open fun saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo(url: NSURL, typeName: NSString, saveOperation: Any, delegate: ObjCObject, didSaveSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "saveToURL:ofType:forSaveOperation:delegate:didSaveSelector:contextInfo:", url, typeName, saveOperation, delegate, didSaveSelector, contextInfo)
    }

    public open fun saveToURL_ofType_forSaveOperation_completionHandler(url: NSURL, typeName: NSString, saveOperation: Any, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "saveToURL:ofType:forSaveOperation:completionHandler:", url, typeName, saveOperation, completionHandler)
    }

    public open fun canAsynchronouslyWriteToURL_ofType_forSaveOperation(url: NSURL, typeName: NSString, saveOperation: Any): Boolean =
        Native.objc_msgSend("boolean", this, "canAsynchronouslyWriteToURL:ofType:forSaveOperation:", url, typeName, saveOperation) as Boolean

    public open fun checkAutosavingSafetyAndReturnError(outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "checkAutosavingSafetyAndReturnError:", outError) as Boolean

    public open fun scheduleAutosaving(): Unit {
        Native.objc_msgSend("void", this, "scheduleAutosaving")
    }

    public open fun hasUnautosavedChanges(): Boolean =
        Native.objc_msgSend("boolean", this, "hasUnautosavedChanges") as Boolean

    public open fun autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo(delegate: ObjCObject, didAutosaveSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "autosaveDocumentWithDelegate:didAutosaveSelector:contextInfo:", delegate, didAutosaveSelector, contextInfo)
    }

    public open fun autosaveWithImplicitCancellability_completionHandler(autosavingIsImplicitlyCancellable: Boolean, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "autosaveWithImplicitCancellability:completionHandler:", autosavingIsImplicitlyCancellable, completionHandler)
    }

    public open fun browseDocumentVersions(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "browseDocumentVersions:", sender)
    }

    public open fun autosavingFileType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "autosavingFileType") as NSString

    public open fun autosavedContentsFileURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "autosavedContentsFileURL") as NSURL

    public open fun setAutosavedContentsFileURL(autosavedContentsFileURL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setAutosavedContentsFileURL:", autosavedContentsFileURL)
    }

    public open fun canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo(delegate: ObjCObject, shouldCloseSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "canCloseDocumentWithDelegate:shouldCloseSelector:contextInfo:", delegate, shouldCloseSelector, contextInfo)
    }

    public open fun close(): Unit {
        Native.objc_msgSend("void", this, "close")
    }

    public open fun duplicateDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "duplicateDocument:", sender)
    }

    public open fun duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo(delegate: ObjCObject, didDuplicateSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "duplicateDocumentWithDelegate:didDuplicateSelector:contextInfo:", delegate, didDuplicateSelector, contextInfo)
    }

    public open fun duplicateAndReturnError(outError: Pointer<NSError>): NSDocument =
        Native.objc_msgSend("class objc.NSDocument", this, "duplicateAndReturnError:", outError) as NSDocument

    public open fun renameDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "renameDocument:", sender)
    }

    public open fun moveDocumentToUbiquityContainer(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveDocumentToUbiquityContainer:", sender)
    }

    public open fun moveDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveDocument:", sender)
    }

    public open fun moveDocumentWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "moveDocumentWithCompletionHandler:", completionHandler)
    }

    public open fun moveToURL_completionHandler(url: NSURL, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "moveToURL:completionHandler:", url, completionHandler)
    }

    public open fun lockDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "lockDocument:", sender)
    }

    public open fun unlockDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "unlockDocument:", sender)
    }

    public open fun lockDocumentWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "lockDocumentWithCompletionHandler:", completionHandler)
    }

    public open fun lockWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "lockWithCompletionHandler:", completionHandler)
    }

    public open fun unlockDocumentWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "unlockDocumentWithCompletionHandler:", completionHandler)
    }

    public open fun unlockWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "unlockWithCompletionHandler:", completionHandler)
    }

    public open fun isLocked(): Boolean =
        Native.objc_msgSend("boolean", this, "isLocked") as Boolean

    public open fun runPageLayout(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "runPageLayout:", sender)
    }

    public open fun runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo(printInfo: NSPrintInfo, delegate: ObjCObject, didRunSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "runModalPageLayoutWithPrintInfo:delegate:didRunSelector:contextInfo:", printInfo, delegate, didRunSelector, contextInfo)
    }

    public open fun preparePageLayout(pageLayout: NSPageLayout): Boolean =
        Native.objc_msgSend("boolean", this, "preparePageLayout:", pageLayout) as Boolean

    public open fun shouldChangePrintInfo(newPrintInfo: NSPrintInfo): Boolean =
        Native.objc_msgSend("boolean", this, "shouldChangePrintInfo:", newPrintInfo) as Boolean

    public open fun printInfo(): NSPrintInfo =
        Native.objc_msgSend("class objc.NSPrintInfo", this, "printInfo") as NSPrintInfo

    public open fun setPrintInfo(printInfo: NSPrintInfo): Unit {
        Native.objc_msgSend("void", this, "setPrintInfo:", printInfo)
    }

    public open fun printDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "printDocument:", sender)
    }

    public open fun printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo(printSettings: NSDictionary, showPrintPanel: Boolean, delegate: ObjCObject, didPrintSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "printDocumentWithSettings:showPrintPanel:delegate:didPrintSelector:contextInfo:", printSettings, showPrintPanel, delegate, didPrintSelector, contextInfo)
    }

    public open fun printOperationWithSettings_error(printSettings: NSDictionary, outError: Pointer<NSError>): NSPrintOperation =
        Native.objc_msgSend("class objc.NSPrintOperation", this, "printOperationWithSettings:error:", printSettings, outError) as NSPrintOperation

    public open fun runModalPrintOperation_delegate_didRunSelector_contextInfo(printOperation: NSPrintOperation, delegate: ObjCObject, didRunSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "runModalPrintOperation:delegate:didRunSelector:contextInfo:", printOperation, delegate, didRunSelector, contextInfo)
    }

    public open fun saveDocumentToPDF(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "saveDocumentToPDF:", sender)
    }

    public open fun PDFPrintOperation(): NSPrintOperation =
        Native.objc_msgSend("class objc.NSPrintOperation", this, "PDFPrintOperation") as NSPrintOperation

    public open fun isDocumentEdited(): Boolean =
        Native.objc_msgSend("boolean", this, "isDocumentEdited") as Boolean

    public open fun isInViewingMode(): Boolean =
        Native.objc_msgSend("boolean", this, "isInViewingMode") as Boolean

    public open fun updateChangeCount(change: Any): Unit {
        Native.objc_msgSend("void", this, "updateChangeCount:", change)
    }

    public open fun changeCountTokenForSaveOperation(saveOperation: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "changeCountTokenForSaveOperation:", saveOperation) as ObjCObject

    public open fun updateChangeCountWithToken_forSaveOperation(changeCountToken: ObjCObject, saveOperation: Any): Unit {
        Native.objc_msgSend("void", this, "updateChangeCountWithToken:forSaveOperation:", changeCountToken, saveOperation)
    }

    public open fun undoManager(): NSUndoManager =
        Native.objc_msgSend("class objc.NSUndoManager", this, "undoManager") as NSUndoManager

    public open fun setUndoManager(undoManager: NSUndoManager): Unit {
        Native.objc_msgSend("void", this, "setUndoManager:", undoManager)
    }

    public open fun hasUndoManager(): Boolean =
        Native.objc_msgSend("boolean", this, "hasUndoManager") as Boolean

    public open fun setHasUndoManager(hasUndoManager: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasUndoManager:", hasUndoManager)
    }

    public open fun presentError_modalForWindow_delegate_didPresentSelector_contextInfo(error: NSError, window: NSWindow, delegate: ObjCObject, didPresentSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "presentError:modalForWindow:delegate:didPresentSelector:contextInfo:", error, window, delegate, didPresentSelector, contextInfo)
    }

    public open fun presentError(error: NSError): Boolean =
        Native.objc_msgSend("boolean", this, "presentError:", error) as Boolean

    public open fun willPresentError(error: NSError): NSError =
        Native.objc_msgSend("class objc.NSError", this, "willPresentError:", error) as NSError

    public open fun willNotPresentError(error: NSError): Unit {
        Native.objc_msgSend("void", this, "willNotPresentError:", error)
    }

    public open fun makeWindowControllers(): Unit {
        Native.objc_msgSend("void", this, "makeWindowControllers")
    }

    public open fun windowNibName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "windowNibName") as NSString

    public open fun windowControllerWillLoadNib(windowController: NSWindowController): Unit {
        Native.objc_msgSend("void", this, "windowControllerWillLoadNib:", windowController)
    }

    public open fun windowControllerDidLoadNib(windowController: NSWindowController): Unit {
        Native.objc_msgSend("void", this, "windowControllerDidLoadNib:", windowController)
    }

    public open fun setWindow(window: NSWindow): Unit {
        Native.objc_msgSend("void", this, "setWindow:", window)
    }

    public open fun addWindowController(windowController: NSWindowController): Unit {
        Native.objc_msgSend("void", this, "addWindowController:", windowController)
    }

    public open fun removeWindowController(windowController: NSWindowController): Unit {
        Native.objc_msgSend("void", this, "removeWindowController:", windowController)
    }

    public open fun showWindows(): Unit {
        Native.objc_msgSend("void", this, "showWindows")
    }

    public open fun windowControllers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "windowControllers") as NSArray

    public open fun shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo(windowController: NSWindowController, delegate: ObjCObject, shouldCloseSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "shouldCloseWindowController:delegate:shouldCloseSelector:contextInfo:", windowController, delegate, shouldCloseSelector, contextInfo)
    }

    public open fun setDisplayName(displayNameOrNil: NSString): Unit {
        Native.objc_msgSend("void", this, "setDisplayName:", displayNameOrNil)
    }

    public open fun displayName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "displayName") as NSString

    public open fun defaultDraftName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "defaultDraftName") as NSString

    public open fun windowForSheet(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "windowForSheet") as NSWindow

    public open fun writableTypesForSaveOperation(saveOperation: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "writableTypesForSaveOperation:", saveOperation) as NSArray

    public open fun fileNameExtensionForType_saveOperation(typeName: NSString, saveOperation: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fileNameExtensionForType:saveOperation:", typeName, saveOperation) as NSString

    public open fun validateUserInterfaceItem(anItem: Any): Boolean =
        Native.objc_msgSend("boolean", this, "validateUserInterfaceItem:", anItem) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun objectSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "objectSpecifier") as NSScriptObjectSpecifier

    trait metaclass : NSObject.metaclass, NSFilePresenter.metaclass, NSUserInterfaceValidations.metaclass, NSDocument_NSDeprecated.metaclass, NSDocument_NSUserActivity.metaclass, NSDocument_NSScripting.metaclass, NSDocument_NSRestorableState.metaclass {
        public open fun canConcurrentlyReadDocumentsOfType(typeName: NSString): Boolean =
            Native.objc_msgSend("boolean", this, "canConcurrentlyReadDocumentsOfType:", typeName) as Boolean

        public open fun autosavesInPlace(): Boolean =
            Native.objc_msgSend("boolean", this, "autosavesInPlace") as Boolean

        public open fun preservesVersions(): Boolean =
            Native.objc_msgSend("boolean", this, "preservesVersions") as Boolean

        public open fun autosavesDrafts(): Boolean =
            Native.objc_msgSend("boolean", this, "autosavesDrafts") as Boolean

        public open fun readableTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "readableTypes") as NSArray

        public open fun writableTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "writableTypes") as NSArray

        public open fun isNativeType(type: NSString): Boolean =
            Native.objc_msgSend("boolean", this, "isNativeType:", type) as Boolean

        public open fun usesUbiquitousStorage(): Boolean =
            Native.objc_msgSend("boolean", this, "usesUbiquitousStorage") as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSDocument")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSDocument_NSDeprecated : IObjCObject {
    public open fun saveToURL_ofType_forSaveOperation_error(url: NSURL, typeName: NSString, saveOperation: Any, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "saveToURL:ofType:forSaveOperation:error:", url, typeName, saveOperation, outError) as Boolean

    public open fun dataRepresentationOfType(type: NSString): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataRepresentationOfType:", type) as NSData

    public open fun fileAttributesToWriteToFile_ofType_saveOperation(fullDocumentPath: NSString, documentTypeName: NSString, saveOperationType: Any): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "fileAttributesToWriteToFile:ofType:saveOperation:", fullDocumentPath, documentTypeName, saveOperationType) as NSDictionary

    public open fun fileName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fileName") as NSString

    public open fun fileWrapperRepresentationOfType(type: NSString): NSFileWrapper =
        Native.objc_msgSend("class objc.NSFileWrapper", this, "fileWrapperRepresentationOfType:", type) as NSFileWrapper

    public open fun initWithContentsOfFile_ofType(absolutePath: NSString, typeName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfFile:ofType:", absolutePath, typeName) as ObjCObject

    public open fun initWithContentsOfURL_ofType(url: NSURL, typeName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:ofType:", url, typeName) as ObjCObject

    public open fun loadDataRepresentation_ofType(data: NSData, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "loadDataRepresentation:ofType:", data, type) as Boolean

    public open fun loadFileWrapperRepresentation_ofType(wrapper: NSFileWrapper, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "loadFileWrapperRepresentation:ofType:", wrapper, type) as Boolean

    public open fun printShowingPrintPanel(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "printShowingPrintPanel:", flag)
    }

    public open fun readFromFile_ofType(fileName: NSString, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "readFromFile:ofType:", fileName, type) as Boolean

    public open fun readFromURL_ofType(url: NSURL, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "readFromURL:ofType:", url, type) as Boolean

    public open fun revertToSavedFromFile_ofType(fileName: NSString, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "revertToSavedFromFile:ofType:", fileName, type) as Boolean

    public open fun revertToSavedFromURL_ofType(url: NSURL, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "revertToSavedFromURL:ofType:", url, type) as Boolean

    public open fun runModalPageLayoutWithPrintInfo(printInfo: NSPrintInfo): Int =
        Native.objc_msgSend("int", this, "runModalPageLayoutWithPrintInfo:", printInfo) as Int

    public open fun saveToFile_saveOperation_delegate_didSaveSelector_contextInfo(fileName: NSString, saveOperation: Any, delegate: ObjCObject, didSaveSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "saveToFile:saveOperation:delegate:didSaveSelector:contextInfo:", fileName, saveOperation, delegate, didSaveSelector, contextInfo)
    }

    public open fun setFileName(fileName: NSString): Unit {
        Native.objc_msgSend("void", this, "setFileName:", fileName)
    }

    public open fun writeToFile_ofType(fileName: NSString, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:ofType:", fileName, type) as Boolean

    public open fun writeToFile_ofType_originalFile_saveOperation(fullDocumentPath: NSString, documentTypeName: NSString, fullOriginalDocumentPath: NSString, saveOperationType: Any): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:ofType:originalFile:saveOperation:", fullDocumentPath, documentTypeName, fullOriginalDocumentPath, saveOperationType) as Boolean

    public open fun writeToURL_ofType(url: NSURL, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:ofType:", url, type) as Boolean

    public open fun writeWithBackupToFile_ofType_saveOperation(fullDocumentPath: NSString, documentTypeName: NSString, saveOperationType: Any): Boolean =
        Native.objc_msgSend("boolean", this, "writeWithBackupToFile:ofType:saveOperation:", fullDocumentPath, documentTypeName, saveOperationType) as Boolean

    trait metaclass : IObjCObject
}
