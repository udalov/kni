// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSFileVersion.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFileVersion(pointer: Long) : NSObject(pointer) {
    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun localizedName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedName") as NSString

    public open fun localizedNameOfSavingComputer(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedNameOfSavingComputer") as NSString

    public open fun modificationDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "modificationDate") as NSDate

    public open fun persistentIdentifier(): Any =
        Native.objc_msgSend("class objc.Any", this, "persistentIdentifier")

    public open fun isConflict(): Boolean =
        Native.objc_msgSend("boolean", this, "isConflict") as Boolean

    public open fun isResolved(): Boolean =
        Native.objc_msgSend("boolean", this, "isResolved") as Boolean

    public open fun setResolved(resolved: Boolean): Unit {
        Native.objc_msgSend("void", this, "setResolved:", resolved)
    }

    public open fun isDiscardable(): Boolean =
        Native.objc_msgSend("boolean", this, "isDiscardable") as Boolean

    public open fun setDiscardable(discardable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDiscardable:", discardable)
    }

    public open fun hasLocalContents(): Boolean =
        Native.objc_msgSend("boolean", this, "hasLocalContents") as Boolean

    public open fun hasThumbnail(): Boolean =
        Native.objc_msgSend("boolean", this, "hasThumbnail") as Boolean

    public open fun replaceItemAtURL_options_error(url: NSURL, options: Any, error: Pointer<NSError>): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "replaceItemAtURL:options:error:", url, options, error) as NSURL

    public open fun removeAndReturnError(outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "removeAndReturnError:", outError) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun currentVersionOfItemAtURL(url: NSURL): NSFileVersion =
            Native.objc_msgSend("class objc.NSFileVersion", this, "currentVersionOfItemAtURL:", url) as NSFileVersion

        public open fun otherVersionsOfItemAtURL(url: NSURL): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "otherVersionsOfItemAtURL:", url) as NSArray

        public open fun unresolvedConflictVersionsOfItemAtURL(url: NSURL): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "unresolvedConflictVersionsOfItemAtURL:", url) as NSArray

        public open fun getNonlocalVersionsOfItemAtURL_completionHandler(url: NSURL, completionHandler: Any): Unit {
            Native.objc_msgSend("void", this, "getNonlocalVersionsOfItemAtURL:completionHandler:", url, completionHandler)
        }

        public open fun versionOfItemAtURL_forPersistentIdentifier(url: NSURL, persistentIdentifier: ObjCObject): NSFileVersion =
            Native.objc_msgSend("class objc.NSFileVersion", this, "versionOfItemAtURL:forPersistentIdentifier:", url, persistentIdentifier) as NSFileVersion

        public open fun addVersionOfItemAtURL_withContentsOfURL_options_error(url: NSURL, contentsURL: NSURL, options: Any, outError: Pointer<NSError>): NSFileVersion =
            Native.objc_msgSend("class objc.NSFileVersion", this, "addVersionOfItemAtURL:withContentsOfURL:options:error:", url, contentsURL, options, outError) as NSFileVersion

        public open fun temporaryDirectoryURLForNewVersionOfItemAtURL(url: NSURL): NSURL =
            Native.objc_msgSend("class objc.NSURL", this, "temporaryDirectoryURLForNewVersionOfItemAtURL:", url) as NSURL

        public open fun removeOtherVersionsOfItemAtURL_error(url: NSURL, outError: Pointer<NSError>): Boolean =
            Native.objc_msgSend("boolean", this, "removeOtherVersionsOfItemAtURL:error:", url, outError) as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSFileVersion")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
