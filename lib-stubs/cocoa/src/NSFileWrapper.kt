// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSFileWrapper.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFileWrapper(pointer: Long) : NSObject(pointer), NSCoding, NSFileWrapper_NSDeprecated, NSFileWrapper_NSExtensions {
    public open fun initWithURL_options_error(url: NSURL, options: Any, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:options:error:", url, options, outError) as ObjCObject

    public open fun initDirectoryWithFileWrappers(childrenByPreferredName: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initDirectoryWithFileWrappers:", childrenByPreferredName) as ObjCObject

    public open fun initRegularFileWithContents(contents: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initRegularFileWithContents:", contents) as ObjCObject

    public open fun initSymbolicLinkWithDestinationURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initSymbolicLinkWithDestinationURL:", url) as ObjCObject

    public open fun initWithSerializedRepresentation(serializeRepresentation: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSerializedRepresentation:", serializeRepresentation) as ObjCObject

    public open fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun isDirectory(): Boolean =
        Native.objc_msgSend("boolean", this, "isDirectory") as Boolean

    public open fun isRegularFile(): Boolean =
        Native.objc_msgSend("boolean", this, "isRegularFile") as Boolean

    public open fun isSymbolicLink(): Boolean =
        Native.objc_msgSend("boolean", this, "isSymbolicLink") as Boolean

    public open fun preferredFilename(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "preferredFilename") as NSString

    public open fun setPreferredFilename(preferredFilename: NSString): Unit {
        Native.objc_msgSend("void", this, "setPreferredFilename:", preferredFilename)
    }

    public open fun filename(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "filename") as NSString

    public open fun setFilename(filename: NSString): Unit {
        Native.objc_msgSend("void", this, "setFilename:", filename)
    }

    public open fun fileAttributes(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "fileAttributes") as NSDictionary

    public open fun setFileAttributes(fileAttributes: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setFileAttributes:", fileAttributes)
    }

    public open fun matchesContentsOfURL(url: NSURL): Boolean =
        Native.objc_msgSend("boolean", this, "matchesContentsOfURL:", url) as Boolean

    public open fun readFromURL_options_error(url: NSURL, options: Any, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "readFromURL:options:error:", url, options, outError) as Boolean

    public open fun writeToURL_options_originalContentsURL_error(url: NSURL, options: Any, originalContentsURL: NSURL, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:options:originalContentsURL:error:", url, options, originalContentsURL, outError) as Boolean

    public open fun serializedRepresentation(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "serializedRepresentation") as NSData

    public open fun addFileWrapper(child: NSFileWrapper): NSString =
        Native.objc_msgSend("class objc.NSString", this, "addFileWrapper:", child) as NSString

    public open fun addRegularFileWithContents_preferredFilename(data: NSData, fileName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "addRegularFileWithContents:preferredFilename:", data, fileName) as NSString

    public open fun removeFileWrapper(child: NSFileWrapper): Unit {
        Native.objc_msgSend("void", this, "removeFileWrapper:", child)
    }

    public open fun fileWrappers(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "fileWrappers") as NSDictionary

    public open fun keyForFileWrapper(child: NSFileWrapper): NSString =
        Native.objc_msgSend("class objc.NSString", this, "keyForFileWrapper:", child) as NSString

    public open fun regularFileContents(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "regularFileContents") as NSData

    public open fun symbolicLinkDestinationURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "symbolicLinkDestinationURL") as NSURL

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSFileWrapper_NSDeprecated.metaclass, NSFileWrapper_NSExtensions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSFileWrapper")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSFileWrapper_NSDeprecated : IObjCObject {
    public open fun initWithPath(path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPath:", path) as ObjCObject

    public open fun initSymbolicLinkWithDestination(path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initSymbolicLinkWithDestination:", path) as ObjCObject

    public open fun needsToBeUpdatedFromPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "needsToBeUpdatedFromPath:", path) as Boolean

    public open fun updateFromPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "updateFromPath:", path) as Boolean

    public open fun writeToFile_atomically_updateFilenames(path: NSString, atomicFlag: Boolean, updateFilenamesFlag: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:atomically:updateFilenames:", path, atomicFlag, updateFilenamesFlag) as Boolean

    public open fun addFileWithPath(path: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "addFileWithPath:", path) as NSString

    public open fun addSymbolicLinkWithDestination_preferredFilename(path: NSString, filename: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "addSymbolicLinkWithDestination:preferredFilename:", path, filename) as NSString

    public open fun symbolicLinkDestination(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "symbolicLinkDestination") as NSString

    trait metaclass : IObjCObject
}
