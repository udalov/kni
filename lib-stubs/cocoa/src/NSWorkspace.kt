// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSWorkspace.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSWorkspace(pointer: Long) : NSObject(pointer), NSWorkspace_NSDesktopImages, NSWorkspace_NSDeprecated, NSWorkspace_NSWorkspaceAccessibilityDisplay, NSWorkspace_NSWorkspaceRunningApplications {
    public open fun notificationCenter(): NSNotificationCenter =
        Native.objc_msgSend("class objc.NSNotificationCenter", this, "notificationCenter") as NSNotificationCenter

    public open fun openFile(fullPath: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "openFile:", fullPath) as Boolean

    public open fun openFile_withApplication(fullPath: NSString, appName: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "openFile:withApplication:", fullPath, appName) as Boolean

    public open fun openFile_withApplication_andDeactivate(fullPath: NSString, appName: NSString, flag: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "openFile:withApplication:andDeactivate:", fullPath, appName, flag) as Boolean

    public open fun openFile_fromImage_at_inView(fullPath: NSString, anImage: NSImage, point: Any, aView: NSView): Boolean =
        Native.objc_msgSend("boolean", this, "openFile:fromImage:at:inView:", fullPath, anImage, point, aView) as Boolean

    public open fun openURL(url: NSURL): Boolean =
        Native.objc_msgSend("boolean", this, "openURL:", url) as Boolean

    public open fun launchApplication(appName: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "launchApplication:", appName) as Boolean

    public open fun launchApplicationAtURL_options_configuration_error(url: NSURL, options: Any, configuration: NSDictionary, error: Pointer<NSError>): NSRunningApplication =
        Native.objc_msgSend("class objc.NSRunningApplication", this, "launchApplicationAtURL:options:configuration:error:", url, options, configuration, error) as NSRunningApplication

    public open fun openURL_options_configuration_error(url: NSURL, options: Any, configuration: NSDictionary, error: Pointer<NSError>): NSRunningApplication =
        Native.objc_msgSend("class objc.NSRunningApplication", this, "openURL:options:configuration:error:", url, options, configuration, error) as NSRunningApplication

    public open fun openURLs_withApplicationAtURL_options_configuration_error(urls: NSArray, applicationURL: NSURL, options: Any, configuration: NSDictionary, error: Pointer<NSError>): NSRunningApplication =
        Native.objc_msgSend("class objc.NSRunningApplication", this, "openURLs:withApplicationAtURL:options:configuration:error:", urls, applicationURL, options, configuration, error) as NSRunningApplication

    public open fun launchApplication_showIcon_autolaunch(appName: NSString, showIcon: Boolean, autolaunch: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "launchApplication:showIcon:autolaunch:", appName, showIcon, autolaunch) as Boolean

    public open fun fullPathForApplication(appName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fullPathForApplication:", appName) as NSString

    public open fun selectFile_inFileViewerRootedAtPath(fullPath: NSString, rootFullPath: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "selectFile:inFileViewerRootedAtPath:", fullPath, rootFullPath) as Boolean

    public open fun activateFileViewerSelectingURLs(fileURLs: NSArray): Unit {
        Native.objc_msgSend("void", this, "activateFileViewerSelectingURLs:", fileURLs)
    }

    public open fun showSearchResultsForQueryString(queryString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "showSearchResultsForQueryString:", queryString) as Boolean

    public open fun noteFileSystemChanged(path: NSString): Unit {
        Native.objc_msgSend("void", this, "noteFileSystemChanged:", path)
    }

    public open fun getInfoForFile_application_type(fullPath: NSString, appName: Pointer<NSString>, type: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "getInfoForFile:application:type:", fullPath, appName, type) as Boolean

    public open fun isFilePackageAtPath(fullPath: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isFilePackageAtPath:", fullPath) as Boolean

    public open fun iconForFile(fullPath: NSString): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "iconForFile:", fullPath) as NSImage

    public open fun iconForFiles(fullPaths: NSArray): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "iconForFiles:", fullPaths) as NSImage

    public open fun iconForFileType(fileType: NSString): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "iconForFileType:", fileType) as NSImage

    public open fun setIcon_forFile_options(image: NSImage, fullPath: NSString, options: Any): Boolean =
        Native.objc_msgSend("boolean", this, "setIcon:forFile:options:", image, fullPath, options) as Boolean

    public open fun fileLabels(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "fileLabels") as NSArray

    public open fun fileLabelColors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "fileLabelColors") as NSArray

    public open fun recycleURLs_completionHandler(URLs: NSArray, handler: Any): Unit {
        Native.objc_msgSend("void", this, "recycleURLs:completionHandler:", URLs, handler)
    }

    public open fun duplicateURLs_completionHandler(URLs: NSArray, handler: Any): Unit {
        Native.objc_msgSend("void", this, "duplicateURLs:completionHandler:", URLs, handler)
    }

    public open fun getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type(fullPath: NSString, removableFlag: Pointer<Boolean>, writableFlag: Pointer<Boolean>, unmountableFlag: Pointer<Boolean>, description: Pointer<NSString>, fileSystemType: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "getFileSystemInfoForPath:isRemovable:isWritable:isUnmountable:description:type:", fullPath, removableFlag, writableFlag, unmountableFlag, description, fileSystemType) as Boolean

    public open fun performFileOperation_source_destination_files_tag(operation: NSString, source: NSString, destination: NSString, files: NSArray, tag: Pointer<Int>): Boolean =
        Native.objc_msgSend("boolean", this, "performFileOperation:source:destination:files:tag:", operation, source, destination, files, tag) as Boolean

    public open fun unmountAndEjectDeviceAtPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "unmountAndEjectDeviceAtPath:", path) as Boolean

    public open fun unmountAndEjectDeviceAtURL_error(url: NSURL, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "unmountAndEjectDeviceAtURL:error:", url, error) as Boolean

    public open fun extendPowerOffBy(requested: Int): Int =
        Native.objc_msgSend("int", this, "extendPowerOffBy:", requested) as Int

    public open fun hideOtherApplications(): Unit {
        Native.objc_msgSend("void", this, "hideOtherApplications")
    }

    public open fun URLForApplicationWithBundleIdentifier(bundleIdentifier: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForApplicationWithBundleIdentifier:", bundleIdentifier) as NSURL

    public open fun URLForApplicationToOpenURL(url: NSURL): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForApplicationToOpenURL:", url) as NSURL

    public open fun absolutePathForAppBundleWithIdentifier(bundleIdentifier: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "absolutePathForAppBundleWithIdentifier:", bundleIdentifier) as NSString

    public open fun launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier(bundleIdentifier: NSString, options: Any, descriptor: NSAppleEventDescriptor, identifier: Pointer<NSNumber>): Boolean =
        Native.objc_msgSend("boolean", this, "launchAppWithBundleIdentifier:options:additionalEventParamDescriptor:launchIdentifier:", bundleIdentifier, options, descriptor, identifier) as Boolean

    public open fun openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers(urls: NSArray, bundleIdentifier: NSString, options: Any, descriptor: NSAppleEventDescriptor, identifiers: Pointer<NSArray>): Boolean =
        Native.objc_msgSend("boolean", this, "openURLs:withAppBundleIdentifier:options:additionalEventParamDescriptor:launchIdentifiers:", urls, bundleIdentifier, options, descriptor, identifiers) as Boolean

    public open fun frontmostApplication(): NSRunningApplication =
        Native.objc_msgSend("class objc.NSRunningApplication", this, "frontmostApplication") as NSRunningApplication

    public open fun menuBarOwningApplication(): NSRunningApplication =
        Native.objc_msgSend("class objc.NSRunningApplication", this, "menuBarOwningApplication") as NSRunningApplication

    public open fun typeOfFile_error(absoluteFilePath: NSString, outError: Pointer<NSError>): NSString =
        Native.objc_msgSend("class objc.NSString", this, "typeOfFile:error:", absoluteFilePath, outError) as NSString

    public open fun localizedDescriptionForType(typeName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedDescriptionForType:", typeName) as NSString

    public open fun preferredFilenameExtensionForType(typeName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "preferredFilenameExtensionForType:", typeName) as NSString

    public open fun filenameExtension_isValidForType(filenameExtension: NSString, typeName: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "filenameExtension:isValidForType:", filenameExtension, typeName) as Boolean

    public open fun type_conformsToType(firstTypeName: NSString, secondTypeName: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "type:conformsToType:", firstTypeName, secondTypeName) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSWorkspace_NSDesktopImages.metaclass, NSWorkspace_NSDeprecated.metaclass, NSWorkspace_NSWorkspaceAccessibilityDisplay.metaclass, NSWorkspace_NSWorkspaceRunningApplications.metaclass {
        public open fun sharedWorkspace(): NSWorkspace =
            Native.objc_msgSend("class objc.NSWorkspace", this, "sharedWorkspace") as NSWorkspace

    }

    companion object : NSObject(Native.objc_getClass("NSWorkspace")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSWorkspace_NSDesktopImages : IObjCObject {
    public open fun setDesktopImageURL_forScreen_options_error(url: NSURL, screen: NSScreen, options: NSDictionary, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "setDesktopImageURL:forScreen:options:error:", url, screen, options, error) as Boolean

    public open fun desktopImageURLForScreen(screen: NSScreen): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "desktopImageURLForScreen:", screen) as NSURL

    public open fun desktopImageOptionsForScreen(screen: NSScreen): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "desktopImageOptionsForScreen:", screen) as NSDictionary

    trait metaclass : IObjCObject
}

trait NSWorkspace_NSDeprecated : IObjCObject {
    public open fun openTempFile(fullPath: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "openTempFile:", fullPath) as Boolean

    public open fun findApplications(): Unit {
        Native.objc_msgSend("void", this, "findApplications")
    }

    public open fun noteUserDefaultsChanged(): Unit {
        Native.objc_msgSend("void", this, "noteUserDefaultsChanged")
    }

    public open fun slideImage_from_to(image: NSImage, fromPoint: Any, toPoint: Any): Unit {
        Native.objc_msgSend("void", this, "slideImage:from:to:", image, fromPoint, toPoint)
    }

    public open fun checkForRemovableMedia(): Unit {
        Native.objc_msgSend("void", this, "checkForRemovableMedia")
    }

    public open fun noteFileSystemChanged(): Unit {
        Native.objc_msgSend("void", this, "noteFileSystemChanged")
    }

    public open fun fileSystemChanged(): Boolean =
        Native.objc_msgSend("boolean", this, "fileSystemChanged") as Boolean

    public open fun userDefaultsChanged(): Boolean =
        Native.objc_msgSend("boolean", this, "userDefaultsChanged") as Boolean

    public open fun mountNewRemovableMedia(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "mountNewRemovableMedia") as NSArray

    public open fun activeApplication(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "activeApplication") as NSDictionary

    public open fun mountedLocalVolumePaths(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "mountedLocalVolumePaths") as NSArray

    public open fun mountedRemovableMedia(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "mountedRemovableMedia") as NSArray

    public open fun launchedApplications(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "launchedApplications") as NSArray

    trait metaclass : IObjCObject
}
