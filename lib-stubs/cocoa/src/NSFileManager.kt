// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSFileManager.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSFileManagerDelegate {
    trait metaclass
}

public open class NSFileManager(pointer: Long) : NSObject(pointer) {
    public open fun mountedVolumeURLsIncludingResourceValuesForKeys_options(propertyKeys: NSArray, options: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "mountedVolumeURLsIncludingResourceValuesForKeys:options:", propertyKeys, options) as NSArray

    public open fun contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error(url: NSURL, keys: NSArray, mask: Any, error: Pointer<NSError>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:", url, keys, mask, error) as NSArray

    public open fun URLsForDirectory_inDomains(directory: Any, domainMask: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "URLsForDirectory:inDomains:", directory, domainMask) as NSArray

    public open fun URLForDirectory_inDomain_appropriateForURL_create_error(directory: Any, domain: Any, url: NSURL, shouldCreate: Boolean, error: Pointer<NSError>): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForDirectory:inDomain:appropriateForURL:create:error:", directory, domain, url, shouldCreate, error) as NSURL

    public open fun getRelationship_ofDirectoryAtURL_toItemAtURL_error(outRelationship: Pointer<Any>, directoryURL: NSURL, otherURL: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "getRelationship:ofDirectoryAtURL:toItemAtURL:error:", outRelationship, directoryURL, otherURL, error) as Boolean

    public open fun getRelationship_ofDirectory_inDomain_toItemAtURL_error(outRelationship: Pointer<Any>, directory: Any, domainMask: Any, url: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "getRelationship:ofDirectory:inDomain:toItemAtURL:error:", outRelationship, directory, domainMask, url, error) as Boolean

    public open fun createDirectoryAtURL_withIntermediateDirectories_attributes_error(url: NSURL, createIntermediates: Boolean, attributes: NSDictionary, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "createDirectoryAtURL:withIntermediateDirectories:attributes:error:", url, createIntermediates, attributes, error) as Boolean

    public open fun createSymbolicLinkAtURL_withDestinationURL_error(url: NSURL, destURL: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "createSymbolicLinkAtURL:withDestinationURL:error:", url, destURL, error) as Boolean

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun setAttributes_ofItemAtPath_error(attributes: NSDictionary, path: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "setAttributes:ofItemAtPath:error:", attributes, path, error) as Boolean

    public open fun createDirectoryAtPath_withIntermediateDirectories_attributes_error(path: NSString, createIntermediates: Boolean, attributes: NSDictionary, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "createDirectoryAtPath:withIntermediateDirectories:attributes:error:", path, createIntermediates, attributes, error) as Boolean

    public open fun contentsOfDirectoryAtPath_error(path: NSString, error: Pointer<NSError>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "contentsOfDirectoryAtPath:error:", path, error) as NSArray

    public open fun subpathsOfDirectoryAtPath_error(path: NSString, error: Pointer<NSError>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "subpathsOfDirectoryAtPath:error:", path, error) as NSArray

    public open fun attributesOfItemAtPath_error(path: NSString, error: Pointer<NSError>): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "attributesOfItemAtPath:error:", path, error) as NSDictionary

    public open fun attributesOfFileSystemForPath_error(path: NSString, error: Pointer<NSError>): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "attributesOfFileSystemForPath:error:", path, error) as NSDictionary

    public open fun createSymbolicLinkAtPath_withDestinationPath_error(path: NSString, destPath: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "createSymbolicLinkAtPath:withDestinationPath:error:", path, destPath, error) as Boolean

    public open fun destinationOfSymbolicLinkAtPath_error(path: NSString, error: Pointer<NSError>): NSString =
        Native.objc_msgSend("class objc.NSString", this, "destinationOfSymbolicLinkAtPath:error:", path, error) as NSString

    public open fun copyItemAtPath_toPath_error(srcPath: NSString, dstPath: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "copyItemAtPath:toPath:error:", srcPath, dstPath, error) as Boolean

    public open fun moveItemAtPath_toPath_error(srcPath: NSString, dstPath: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "moveItemAtPath:toPath:error:", srcPath, dstPath, error) as Boolean

    public open fun linkItemAtPath_toPath_error(srcPath: NSString, dstPath: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "linkItemAtPath:toPath:error:", srcPath, dstPath, error) as Boolean

    public open fun removeItemAtPath_error(path: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "removeItemAtPath:error:", path, error) as Boolean

    public open fun copyItemAtURL_toURL_error(srcURL: NSURL, dstURL: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "copyItemAtURL:toURL:error:", srcURL, dstURL, error) as Boolean

    public open fun moveItemAtURL_toURL_error(srcURL: NSURL, dstURL: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "moveItemAtURL:toURL:error:", srcURL, dstURL, error) as Boolean

    public open fun linkItemAtURL_toURL_error(srcURL: NSURL, dstURL: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "linkItemAtURL:toURL:error:", srcURL, dstURL, error) as Boolean

    public open fun removeItemAtURL_error(URL: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "removeItemAtURL:error:", URL, error) as Boolean

    public open fun trashItemAtURL_resultingItemURL_error(url: NSURL, outResultingURL: Pointer<NSURL>, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "trashItemAtURL:resultingItemURL:error:", url, outResultingURL, error) as Boolean

    public open fun fileAttributesAtPath_traverseLink(path: NSString, yorn: Boolean): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "fileAttributesAtPath:traverseLink:", path, yorn) as NSDictionary

    public open fun changeFileAttributes_atPath(attributes: NSDictionary, path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "changeFileAttributes:atPath:", attributes, path) as Boolean

    public open fun directoryContentsAtPath(path: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "directoryContentsAtPath:", path) as NSArray

    public open fun fileSystemAttributesAtPath(path: NSString): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "fileSystemAttributesAtPath:", path) as NSDictionary

    public open fun pathContentOfSymbolicLinkAtPath(path: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathContentOfSymbolicLinkAtPath:", path) as NSString

    public open fun createSymbolicLinkAtPath_pathContent(path: NSString, otherpath: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "createSymbolicLinkAtPath:pathContent:", path, otherpath) as Boolean

    public open fun createDirectoryAtPath_attributes(path: NSString, attributes: NSDictionary): Boolean =
        Native.objc_msgSend("boolean", this, "createDirectoryAtPath:attributes:", path, attributes) as Boolean

    public open fun linkPath_toPath_handler(src: NSString, dest: NSString, handler: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "linkPath:toPath:handler:", src, dest, handler) as Boolean

    public open fun copyPath_toPath_handler(src: NSString, dest: NSString, handler: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "copyPath:toPath:handler:", src, dest, handler) as Boolean

    public open fun movePath_toPath_handler(src: NSString, dest: NSString, handler: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "movePath:toPath:handler:", src, dest, handler) as Boolean

    public open fun removeFileAtPath_handler(path: NSString, handler: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "removeFileAtPath:handler:", path, handler) as Boolean

    public open fun currentDirectoryPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "currentDirectoryPath") as NSString

    public open fun changeCurrentDirectoryPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "changeCurrentDirectoryPath:", path) as Boolean

    public open fun fileExistsAtPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "fileExistsAtPath:", path) as Boolean

    public open fun fileExistsAtPath_isDirectory(path: NSString, isDirectory: Pointer<Boolean>): Boolean =
        Native.objc_msgSend("boolean", this, "fileExistsAtPath:isDirectory:", path, isDirectory) as Boolean

    public open fun isReadableFileAtPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isReadableFileAtPath:", path) as Boolean

    public open fun isWritableFileAtPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isWritableFileAtPath:", path) as Boolean

    public open fun isExecutableFileAtPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isExecutableFileAtPath:", path) as Boolean

    public open fun isDeletableFileAtPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isDeletableFileAtPath:", path) as Boolean

    public open fun contentsEqualAtPath_andPath(path1: NSString, path2: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "contentsEqualAtPath:andPath:", path1, path2) as Boolean

    public open fun displayNameAtPath(path: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "displayNameAtPath:", path) as NSString

    public open fun componentsToDisplayForPath(path: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "componentsToDisplayForPath:", path) as NSArray

    public open fun enumeratorAtPath(path: NSString): NSDirectoryEnumerator =
        Native.objc_msgSend("class objc.NSDirectoryEnumerator", this, "enumeratorAtPath:", path) as NSDirectoryEnumerator

    public open fun enumeratorAtURL_includingPropertiesForKeys_options_errorHandler(url: NSURL, keys: NSArray, mask: Any, handler: Any): NSDirectoryEnumerator =
        Native.objc_msgSend("class objc.NSDirectoryEnumerator", this, "enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:", url, keys, mask, handler) as NSDirectoryEnumerator

    public open fun subpathsAtPath(path: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "subpathsAtPath:", path) as NSArray

    public open fun contentsAtPath(path: NSString): NSData =
        Native.objc_msgSend("class objc.NSData", this, "contentsAtPath:", path) as NSData

    public open fun createFileAtPath_contents_attributes(path: NSString, data: NSData, attr: NSDictionary): Boolean =
        Native.objc_msgSend("boolean", this, "createFileAtPath:contents:attributes:", path, data, attr) as Boolean

    public open fun fileSystemRepresentationWithPath(path: NSString): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "fileSystemRepresentationWithPath:", path) as Pointer<Char>

    public open fun stringWithFileSystemRepresentation_length(str: Pointer<Char>, len: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringWithFileSystemRepresentation:length:", str, len) as NSString

    public open fun replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error(originalItemURL: NSURL, newItemURL: NSURL, backupItemName: NSString, options: Any, resultingURL: Pointer<NSURL>, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:", originalItemURL, newItemURL, backupItemName, options, resultingURL, error) as Boolean

    public open fun setUbiquitous_itemAtURL_destinationURL_error(flag: Boolean, url: NSURL, destinationURL: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "setUbiquitous:itemAtURL:destinationURL:error:", flag, url, destinationURL, error) as Boolean

    public open fun isUbiquitousItemAtURL(url: NSURL): Boolean =
        Native.objc_msgSend("boolean", this, "isUbiquitousItemAtURL:", url) as Boolean

    public open fun startDownloadingUbiquitousItemAtURL_error(url: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "startDownloadingUbiquitousItemAtURL:error:", url, error) as Boolean

    public open fun evictUbiquitousItemAtURL_error(url: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "evictUbiquitousItemAtURL:error:", url, error) as Boolean

    public open fun URLForUbiquityContainerIdentifier(containerIdentifier: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForUbiquityContainerIdentifier:", containerIdentifier) as NSURL

    public open fun URLForPublishingUbiquitousItemAtURL_expirationDate_error(url: NSURL, outDate: Pointer<NSDate>, error: Pointer<NSError>): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForPublishingUbiquitousItemAtURL:expirationDate:error:", url, outDate, error) as NSURL

    public open fun ubiquityIdentityToken(): Any =
        Native.objc_msgSend("class objc.Any", this, "ubiquityIdentityToken")

    public open fun containerURLForSecurityApplicationGroupIdentifier(groupIdentifier: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "containerURLForSecurityApplicationGroupIdentifier:", groupIdentifier) as NSURL

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun defaultManager(): NSFileManager =
            Native.objc_msgSend("class objc.NSFileManager", this, "defaultManager") as NSFileManager

    }

    companion object : NSObject(Native.objc_getClass("NSFileManager")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSDirectoryEnumerator(pointer: Long) : NSEnumerator(pointer) {
    public open fun fileAttributes(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "fileAttributes") as NSDictionary

    public open fun directoryAttributes(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "directoryAttributes") as NSDictionary

    public open fun skipDescendents(): Unit {
        Native.objc_msgSend("void", this, "skipDescendents")
    }

    public open fun level(): Int =
        Native.objc_msgSend("int", this, "level") as Int

    public open fun skipDescendants(): Unit {
        Native.objc_msgSend("void", this, "skipDescendants")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSEnumerator.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDirectoryEnumerator")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSCopyLinkMoveHandler : IObjCObject {
    public open fun fileManager_shouldProceedAfterError(fm: NSFileManager, errorInfo: NSDictionary): Boolean =
        Native.objc_msgSend("boolean", this, "fileManager:shouldProceedAfterError:", fm, errorInfo) as Boolean

    public open fun fileManager_willProcessPath(fm: NSFileManager, path: NSString): Unit {
        Native.objc_msgSend("void", this, "fileManager:willProcessPath:", fm, path)
    }

    trait metaclass : IObjCObject
}

trait NSDictionary_NSFileAttributes : IObjCObject {
    public open fun fileSize(): Long =
        Native.objc_msgSend("long", this, "fileSize") as Long

    public open fun fileModificationDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "fileModificationDate") as NSDate

    public open fun fileType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fileType") as NSString

    public open fun filePosixPermissions(): Int =
        Native.objc_msgSend("int", this, "filePosixPermissions") as Int

    public open fun fileOwnerAccountName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fileOwnerAccountName") as NSString

    public open fun fileGroupOwnerAccountName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fileGroupOwnerAccountName") as NSString

    public open fun fileSystemNumber(): Int =
        Native.objc_msgSend("int", this, "fileSystemNumber") as Int

    public open fun fileSystemFileNumber(): Int =
        Native.objc_msgSend("int", this, "fileSystemFileNumber") as Int

    public open fun fileExtensionHidden(): Boolean =
        Native.objc_msgSend("boolean", this, "fileExtensionHidden") as Boolean

    public open fun fileHFSCreatorCode(): Int =
        Native.objc_msgSend("int", this, "fileHFSCreatorCode") as Int

    public open fun fileHFSTypeCode(): Int =
        Native.objc_msgSend("int", this, "fileHFSTypeCode") as Int

    public open fun fileIsImmutable(): Boolean =
        Native.objc_msgSend("boolean", this, "fileIsImmutable") as Boolean

    public open fun fileIsAppendOnly(): Boolean =
        Native.objc_msgSend("boolean", this, "fileIsAppendOnly") as Boolean

    public open fun fileCreationDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "fileCreationDate") as NSDate

    public open fun fileOwnerAccountID(): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "fileOwnerAccountID") as NSNumber

    public open fun fileGroupOwnerAccountID(): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "fileGroupOwnerAccountID") as NSNumber

    trait metaclass : IObjCObject
}
