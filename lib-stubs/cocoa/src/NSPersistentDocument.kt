// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPersistentDocument.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPersistentDocument(pointer: Long) : NSDocument(pointer), NSPersistentDocument_NSDeprecated {
    public open fun managedObjectContext(): NSManagedObjectContext =
        Native.objc_msgSend("class objc.NSManagedObjectContext", this, "managedObjectContext") as NSManagedObjectContext

    public open fun setManagedObjectContext(managedObjectContext: NSManagedObjectContext): Unit {
        Native.objc_msgSend("void", this, "setManagedObjectContext:", managedObjectContext)
    }

    public open fun managedObjectModel(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "managedObjectModel") as ObjCObject

    public open fun configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error(url: NSURL, fileType: NSString, configuration: NSString, storeOptions: NSDictionary, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "configurePersistentStoreCoordinatorForURL:ofType:modelConfiguration:storeOptions:error:", url, fileType, configuration, storeOptions, error) as Boolean

    public open fun persistentStoreTypeForFileType(fileType: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "persistentStoreTypeForFileType:", fileType) as NSString

    override fun writeToURL_ofType_forSaveOperation_originalContentsURL_error(absoluteURL: NSURL, typeName: NSString, saveOperation: Any, absoluteOriginalContentsURL: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:ofType:forSaveOperation:originalContentsURL:error:", absoluteURL, typeName, saveOperation, absoluteOriginalContentsURL, error) as Boolean

    override fun readFromURL_ofType_error(absoluteURL: NSURL, typeName: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "readFromURL:ofType:error:", absoluteURL, typeName, error) as Boolean

    override fun revertToContentsOfURL_ofType_error(inAbsoluteURL: NSURL, inTypeName: NSString, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "revertToContentsOfURL:ofType:error:", inAbsoluteURL, inTypeName, outError) as Boolean

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun objectSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "objectSpecifier") as NSScriptObjectSpecifier

    trait metaclass : NSDocument.metaclass, NSPersistentDocument_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPersistentDocument")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSPersistentDocument_NSDeprecated : IObjCObject {
    public open fun configurePersistentStoreCoordinatorForURL_ofType_error(url: NSURL, fileType: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "configurePersistentStoreCoordinatorForURL:ofType:error:", url, fileType, error) as Boolean

    trait metaclass : IObjCObject
}
