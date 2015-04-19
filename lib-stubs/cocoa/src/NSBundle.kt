// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSBundle.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSBundle(pointer: Long) : NSObject(pointer), NSBundle_NSBundleHelpExtension, NSBundle_NSBundleImageExtension, NSBundle_NSNibLoading, NSBundle_NSNibLoadingDeprecated, NSBundle_NSBundleSoundExtensions {
    public open fun initWithPath(path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPath:", path) as ObjCObject

    public open fun initWithURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:", url) as ObjCObject

    public open fun load(): Boolean =
        Native.objc_msgSend("boolean", this, "load") as Boolean

    public open fun isLoaded(): Boolean =
        Native.objc_msgSend("boolean", this, "isLoaded") as Boolean

    public open fun unload(): Boolean =
        Native.objc_msgSend("boolean", this, "unload") as Boolean

    public open fun preflightAndReturnError(error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "preflightAndReturnError:", error) as Boolean

    public open fun loadAndReturnError(error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "loadAndReturnError:", error) as Boolean

    public open fun bundleURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "bundleURL") as NSURL

    public open fun resourceURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "resourceURL") as NSURL

    public open fun executableURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "executableURL") as NSURL

    public open fun URLForAuxiliaryExecutable(executableName: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForAuxiliaryExecutable:", executableName) as NSURL

    public open fun privateFrameworksURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "privateFrameworksURL") as NSURL

    public open fun sharedFrameworksURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "sharedFrameworksURL") as NSURL

    public open fun sharedSupportURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "sharedSupportURL") as NSURL

    public open fun builtInPlugInsURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "builtInPlugInsURL") as NSURL

    public open fun appStoreReceiptURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "appStoreReceiptURL") as NSURL

    public open fun bundlePath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "bundlePath") as NSString

    public open fun resourcePath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "resourcePath") as NSString

    public open fun executablePath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "executablePath") as NSString

    public open fun pathForAuxiliaryExecutable(executableName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathForAuxiliaryExecutable:", executableName) as NSString

    public open fun privateFrameworksPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "privateFrameworksPath") as NSString

    public open fun sharedFrameworksPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "sharedFrameworksPath") as NSString

    public open fun sharedSupportPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "sharedSupportPath") as NSString

    public open fun builtInPlugInsPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "builtInPlugInsPath") as NSString

    public open fun URLForResource_withExtension(name: NSString, ext: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForResource:withExtension:", name, ext) as NSURL

    public open fun URLForResource_withExtension_subdirectory(name: NSString, ext: NSString, subpath: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForResource:withExtension:subdirectory:", name, ext, subpath) as NSURL

    public open fun URLForResource_withExtension_subdirectory_localization(name: NSString, ext: NSString, subpath: NSString, localizationName: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForResource:withExtension:subdirectory:localization:", name, ext, subpath, localizationName) as NSURL

    public open fun URLsForResourcesWithExtension_subdirectory(ext: NSString, subpath: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "URLsForResourcesWithExtension:subdirectory:", ext, subpath) as NSArray

    public open fun URLsForResourcesWithExtension_subdirectory_localization(ext: NSString, subpath: NSString, localizationName: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "URLsForResourcesWithExtension:subdirectory:localization:", ext, subpath, localizationName) as NSArray

    public open fun pathForResource_ofType(name: NSString, ext: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathForResource:ofType:", name, ext) as NSString

    public open fun pathForResource_ofType_inDirectory(name: NSString, ext: NSString, subpath: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathForResource:ofType:inDirectory:", name, ext, subpath) as NSString

    public open fun pathForResource_ofType_inDirectory_forLocalization(name: NSString, ext: NSString, subpath: NSString, localizationName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathForResource:ofType:inDirectory:forLocalization:", name, ext, subpath, localizationName) as NSString

    public open fun pathsForResourcesOfType_inDirectory(ext: NSString, subpath: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "pathsForResourcesOfType:inDirectory:", ext, subpath) as NSArray

    public open fun pathsForResourcesOfType_inDirectory_forLocalization(ext: NSString, subpath: NSString, localizationName: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "pathsForResourcesOfType:inDirectory:forLocalization:", ext, subpath, localizationName) as NSArray

    public open fun localizedStringForKey_value_table(key: NSString, value: NSString, tableName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedStringForKey:value:table:", key, value, tableName) as NSString

    public open fun bundleIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "bundleIdentifier") as NSString

    public open fun infoDictionary(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "infoDictionary") as NSDictionary

    public open fun localizedInfoDictionary(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "localizedInfoDictionary") as NSDictionary

    public open fun objectForInfoDictionaryKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForInfoDictionaryKey:", key) as ObjCObject

    public open fun classNamed(className: NSString): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "classNamed:", className) as ObjCClass

    public open fun principalClass(): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "principalClass") as ObjCClass

    public open fun preferredLocalizations(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "preferredLocalizations") as NSArray

    public open fun localizations(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "localizations") as NSArray

    public open fun developmentLocalization(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "developmentLocalization") as NSString

    public open fun executableArchitectures(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "executableArchitectures") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSBundle_NSBundleHelpExtension.metaclass, NSBundle_NSBundleImageExtension.metaclass, NSBundle_NSNibLoading.metaclass, NSBundle_NSNibLoadingDeprecated.metaclass, NSBundle_NSBundleSoundExtensions.metaclass {
        public open fun mainBundle(): NSBundle =
            Native.objc_msgSend("class objc.NSBundle", this, "mainBundle") as NSBundle

        public open fun bundleWithPath(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "bundleWithPath:", path) as ObjCObject

        public open fun bundleWithURL(url: NSURL): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "bundleWithURL:", url) as ObjCObject

        public open fun bundleForClass(aClass: ObjCClass): NSBundle =
            Native.objc_msgSend("class objc.NSBundle", this, "bundleForClass:", aClass) as NSBundle

        public open fun bundleWithIdentifier(identifier: NSString): NSBundle =
            Native.objc_msgSend("class objc.NSBundle", this, "bundleWithIdentifier:", identifier) as NSBundle

        public open fun allBundles(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "allBundles") as NSArray

        public open fun allFrameworks(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "allFrameworks") as NSArray

        public open fun URLForResource_withExtension_subdirectory_inBundleWithURL(name: NSString, ext: NSString, subpath: NSString, bundleURL: NSURL): NSURL =
            Native.objc_msgSend("class objc.NSURL", this, "URLForResource:withExtension:subdirectory:inBundleWithURL:", name, ext, subpath, bundleURL) as NSURL

        public open fun URLsForResourcesWithExtension_subdirectory_inBundleWithURL(ext: NSString, subpath: NSString, bundleURL: NSURL): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "URLsForResourcesWithExtension:subdirectory:inBundleWithURL:", ext, subpath, bundleURL) as NSArray

        public open fun pathForResource_ofType_inDirectory(name: NSString, ext: NSString, bundlePath: NSString): NSString =
            Native.objc_msgSend("class objc.NSString", this, "pathForResource:ofType:inDirectory:", name, ext, bundlePath) as NSString

        public open fun pathsForResourcesOfType_inDirectory(ext: NSString, bundlePath: NSString): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "pathsForResourcesOfType:inDirectory:", ext, bundlePath) as NSArray

        public open fun preferredLocalizationsFromArray(localizationsArray: NSArray): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "preferredLocalizationsFromArray:", localizationsArray) as NSArray

        public open fun preferredLocalizationsFromArray_forPreferences(localizationsArray: NSArray, preferencesArray: NSArray): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "preferredLocalizationsFromArray:forPreferences:", localizationsArray, preferencesArray) as NSArray

    }

    companion object : NSObject(Native.objc_getClass("NSBundle")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
