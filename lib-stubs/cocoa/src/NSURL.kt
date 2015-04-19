// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURL.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSURL(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying, NSURLHandleClient, NSURL_NSPromisedItems, NSURL_NSURLPathUtilities, NSURL_NSURLLoading, NSURL_NSPasteboardSupport {
    public open fun initWithScheme_host_path(scheme: NSString, host: NSString, path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithScheme:host:path:", scheme, host, path) as ObjCObject

    public open fun initFileURLWithPath_isDirectory(path: NSString, isDir: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initFileURLWithPath:isDirectory:", path, isDir) as ObjCObject

    public open fun initFileURLWithPath(path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initFileURLWithPath:", path) as ObjCObject

    public open fun initFileURLWithFileSystemRepresentation_isDirectory_relativeToURL(path: Pointer<Char>, isDir: Boolean, baseURL: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:", path, isDir, baseURL) as ObjCObject

    public open fun initWithString(URLString: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:", URLString) as ObjCObject

    public open fun initWithString_relativeToURL(URLString: NSString, baseURL: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:relativeToURL:", URLString, baseURL) as ObjCObject

    public open fun absoluteString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "absoluteString") as NSString

    public open fun relativeString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "relativeString") as NSString

    public open fun baseURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "baseURL") as NSURL

    public open fun absoluteURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "absoluteURL") as NSURL

    public open fun scheme(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "scheme") as NSString

    public open fun resourceSpecifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "resourceSpecifier") as NSString

    public open fun host(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "host") as NSString

    public open fun port(): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "port") as NSNumber

    public open fun user(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "user") as NSString

    public open fun password(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "password") as NSString

    public open fun path(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "path") as NSString

    public open fun fragment(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fragment") as NSString

    public open fun parameterString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "parameterString") as NSString

    public open fun query(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "query") as NSString

    public open fun relativePath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "relativePath") as NSString

    public open fun getFileSystemRepresentation_maxLength(buffer: Pointer<Char>, maxBufferLength: Int): Boolean =
        Native.objc_msgSend("boolean", this, "getFileSystemRepresentation:maxLength:", buffer, maxBufferLength) as Boolean

    public open fun fileSystemRepresentation(): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "fileSystemRepresentation") as Pointer<Char>

    public open fun isFileURL(): Boolean =
        Native.objc_msgSend("boolean", this, "isFileURL") as Boolean

    public open fun standardizedURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "standardizedURL") as NSURL

    public open fun checkResourceIsReachableAndReturnError(error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "checkResourceIsReachableAndReturnError:", error) as Boolean

    public open fun isFileReferenceURL(): Boolean =
        Native.objc_msgSend("boolean", this, "isFileReferenceURL") as Boolean

    public open fun fileReferenceURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "fileReferenceURL") as NSURL

    public open fun filePathURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "filePathURL") as NSURL

    public open fun getResourceValue_forKey_error(value: Pointer<ObjCObject>, key: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "getResourceValue:forKey:error:", value, key, error) as Boolean

    public open fun resourceValuesForKeys_error(keys: NSArray, error: Pointer<NSError>): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "resourceValuesForKeys:error:", keys, error) as NSDictionary

    public open fun setResourceValue_forKey_error(value: ObjCObject, key: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "setResourceValue:forKey:error:", value, key, error) as Boolean

    public open fun setResourceValues_error(keyedValues: NSDictionary, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "setResourceValues:error:", keyedValues, error) as Boolean

    public open fun removeCachedResourceValueForKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "removeCachedResourceValueForKey:", key)
    }

    public open fun removeAllCachedResourceValues(): Unit {
        Native.objc_msgSend("void", this, "removeAllCachedResourceValues")
    }

    public open fun setTemporaryResourceValue_forKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setTemporaryResourceValue:forKey:", value, key)
    }

    public open fun bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error(options: Any, keys: NSArray, relativeURL: NSURL, error: Pointer<NSError>): NSData =
        Native.objc_msgSend("class objc.NSData", this, "bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:", options, keys, relativeURL, error) as NSData

    public open fun initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error(bookmarkData: NSData, options: Any, relativeURL: NSURL, isStale: Pointer<Boolean>, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:", bookmarkData, options, relativeURL, isStale, error) as ObjCObject

    public open fun startAccessingSecurityScopedResource(): Boolean =
        Native.objc_msgSend("boolean", this, "startAccessingSecurityScopedResource") as Boolean

    public open fun stopAccessingSecurityScopedResource(): Unit {
        Native.objc_msgSend("void", this, "stopAccessingSecurityScopedResource")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass, NSURLHandleClient.metaclass, NSURL_NSPromisedItems.metaclass, NSURL_NSURLPathUtilities.metaclass, NSURL_NSURLLoading.metaclass, NSURL_NSPasteboardSupport.metaclass {
        public open fun fileURLWithPath_isDirectory(path: NSString, isDir: Boolean): NSURL =
            Native.objc_msgSend("class objc.NSURL", this, "fileURLWithPath:isDirectory:", path, isDir) as NSURL

        public open fun fileURLWithPath(path: NSString): NSURL =
            Native.objc_msgSend("class objc.NSURL", this, "fileURLWithPath:", path) as NSURL

        public open fun fileURLWithFileSystemRepresentation_isDirectory_relativeToURL(path: Pointer<Char>, isDir: Boolean, baseURL: NSURL): NSURL =
            Native.objc_msgSend("class objc.NSURL", this, "fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:", path, isDir, baseURL) as NSURL

        public open fun URLWithString(URLString: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "URLWithString:", URLString) as ObjCObject

        public open fun URLWithString_relativeToURL(URLString: NSString, baseURL: NSURL): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "URLWithString:relativeToURL:", URLString, baseURL) as ObjCObject

        public open fun URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error(bookmarkData: NSData, options: Any, relativeURL: NSURL, isStale: Pointer<Boolean>, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:", bookmarkData, options, relativeURL, isStale, error) as ObjCObject

        public open fun resourceValuesForKeys_fromBookmarkData(keys: NSArray, bookmarkData: NSData): NSDictionary =
            Native.objc_msgSend("class objc.NSDictionary", this, "resourceValuesForKeys:fromBookmarkData:", keys, bookmarkData) as NSDictionary

        public open fun writeBookmarkData_toURL_options_error(bookmarkData: NSData, bookmarkFileURL: NSURL, options: Int, error: Pointer<NSError>): Boolean =
            Native.objc_msgSend("boolean", this, "writeBookmarkData:toURL:options:error:", bookmarkData, bookmarkFileURL, options, error) as Boolean

        public open fun bookmarkDataWithContentsOfURL_error(bookmarkFileURL: NSURL, error: Pointer<NSError>): NSData =
            Native.objc_msgSend("class objc.NSData", this, "bookmarkDataWithContentsOfURL:error:", bookmarkFileURL, error) as NSData

        public open fun URLByResolvingAliasFileAtURL_options_error(url: NSURL, options: Any, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "URLByResolvingAliasFileAtURL:options:error:", url, options, error) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSURL")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSURLQueryItem(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying {
    public open fun initWithName_value(name: NSString, value: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:value:", name, value) as ObjCObject

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    override fun value(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "value") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass {
        public open fun queryItemWithName_value(name: NSString, value: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "queryItemWithName:value:", name, value) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSURLQueryItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSURLComponents(pointer: Long) : NSObject(pointer), NSCopying {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithURL_resolvingAgainstBaseURL(url: NSURL, resolve: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:resolvingAgainstBaseURL:", url, resolve) as ObjCObject

    public open fun initWithString(URLString: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:", URLString) as ObjCObject

    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun URLRelativeToURL(baseURL: NSURL): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLRelativeToURL:", baseURL) as NSURL

    public open fun string(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "string") as NSString

    public open fun scheme(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "scheme") as NSString

    public open fun setScheme(scheme: NSString): Unit {
        Native.objc_msgSend("void", this, "setScheme:", scheme)
    }

    public open fun user(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "user") as NSString

    public open fun setUser(user: NSString): Unit {
        Native.objc_msgSend("void", this, "setUser:", user)
    }

    public open fun password(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "password") as NSString

    public open fun setPassword(password: NSString): Unit {
        Native.objc_msgSend("void", this, "setPassword:", password)
    }

    public open fun host(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "host") as NSString

    public open fun setHost(host: NSString): Unit {
        Native.objc_msgSend("void", this, "setHost:", host)
    }

    public open fun port(): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "port") as NSNumber

    public open fun setPort(port: NSNumber): Unit {
        Native.objc_msgSend("void", this, "setPort:", port)
    }

    public open fun path(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "path") as NSString

    public open fun setPath(path: NSString): Unit {
        Native.objc_msgSend("void", this, "setPath:", path)
    }

    public open fun query(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "query") as NSString

    public open fun setQuery(query: NSString): Unit {
        Native.objc_msgSend("void", this, "setQuery:", query)
    }

    public open fun fragment(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fragment") as NSString

    public open fun setFragment(fragment: NSString): Unit {
        Native.objc_msgSend("void", this, "setFragment:", fragment)
    }

    public open fun percentEncodedUser(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "percentEncodedUser") as NSString

    public open fun setPercentEncodedUser(percentEncodedUser: NSString): Unit {
        Native.objc_msgSend("void", this, "setPercentEncodedUser:", percentEncodedUser)
    }

    public open fun percentEncodedPassword(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "percentEncodedPassword") as NSString

    public open fun setPercentEncodedPassword(percentEncodedPassword: NSString): Unit {
        Native.objc_msgSend("void", this, "setPercentEncodedPassword:", percentEncodedPassword)
    }

    public open fun percentEncodedHost(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "percentEncodedHost") as NSString

    public open fun setPercentEncodedHost(percentEncodedHost: NSString): Unit {
        Native.objc_msgSend("void", this, "setPercentEncodedHost:", percentEncodedHost)
    }

    public open fun percentEncodedPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "percentEncodedPath") as NSString

    public open fun setPercentEncodedPath(percentEncodedPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setPercentEncodedPath:", percentEncodedPath)
    }

    public open fun percentEncodedQuery(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "percentEncodedQuery") as NSString

    public open fun setPercentEncodedQuery(percentEncodedQuery: NSString): Unit {
        Native.objc_msgSend("void", this, "setPercentEncodedQuery:", percentEncodedQuery)
    }

    public open fun percentEncodedFragment(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "percentEncodedFragment") as NSString

    public open fun setPercentEncodedFragment(percentEncodedFragment: NSString): Unit {
        Native.objc_msgSend("void", this, "setPercentEncodedFragment:", percentEncodedFragment)
    }

    public open fun queryItems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "queryItems") as NSArray

    public open fun setQueryItems(queryItems: NSArray): Unit {
        Native.objc_msgSend("void", this, "setQueryItems:", queryItems)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass {
        public open fun componentsWithURL_resolvingAgainstBaseURL(url: NSURL, resolve: Boolean): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "componentsWithURL:resolvingAgainstBaseURL:", url, resolve) as ObjCObject

        public open fun componentsWithString(URLString: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "componentsWithString:", URLString) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSURLComponents")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSFileSecurity(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSFileSecurity")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSURL_NSPromisedItems : IObjCObject {
    public open fun getPromisedItemResourceValue_forKey_error(value: Pointer<ObjCObject>, key: NSString, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "getPromisedItemResourceValue:forKey:error:", value, key, error) as Boolean

    public open fun promisedItemResourceValuesForKeys_error(keys: NSArray, error: Pointer<NSError>): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "promisedItemResourceValuesForKeys:error:", keys, error) as NSDictionary

    public open fun checkPromisedItemIsReachableAndReturnError(error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "checkPromisedItemIsReachableAndReturnError:", error) as Boolean

    trait metaclass : IObjCObject
}

trait NSCharacterSet_NSURLUtilities : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun URLUserAllowedCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "URLUserAllowedCharacterSet") as NSCharacterSet

        public open fun URLPasswordAllowedCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "URLPasswordAllowedCharacterSet") as NSCharacterSet

        public open fun URLHostAllowedCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "URLHostAllowedCharacterSet") as NSCharacterSet

        public open fun URLPathAllowedCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "URLPathAllowedCharacterSet") as NSCharacterSet

        public open fun URLQueryAllowedCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "URLQueryAllowedCharacterSet") as NSCharacterSet

        public open fun URLFragmentAllowedCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "URLFragmentAllowedCharacterSet") as NSCharacterSet
    }
}

trait NSString_NSURLUtilities : IObjCObject {
    public open fun stringByAddingPercentEncodingWithAllowedCharacters(allowedCharacters: NSCharacterSet): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByAddingPercentEncodingWithAllowedCharacters:", allowedCharacters) as NSString

    public open fun stringByRemovingPercentEncoding(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByRemovingPercentEncoding") as NSString

    public open fun stringByAddingPercentEscapesUsingEncoding(enc: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByAddingPercentEscapesUsingEncoding:", enc) as NSString

    public open fun stringByReplacingPercentEscapesUsingEncoding(enc: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByReplacingPercentEscapesUsingEncoding:", enc) as NSString

    trait metaclass : IObjCObject
}

trait NSURL_NSURLPathUtilities : IObjCObject {
    public open fun pathComponents(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "pathComponents") as NSArray

    public open fun lastPathComponent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "lastPathComponent") as NSString

    public open fun pathExtension(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathExtension") as NSString

    public open fun URLByAppendingPathComponent(pathComponent: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLByAppendingPathComponent:", pathComponent) as NSURL

    public open fun URLByAppendingPathComponent_isDirectory(pathComponent: NSString, isDirectory: Boolean): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLByAppendingPathComponent:isDirectory:", pathComponent, isDirectory) as NSURL

    public open fun URLByDeletingLastPathComponent(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLByDeletingLastPathComponent") as NSURL

    public open fun URLByAppendingPathExtension(pathExtension: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLByAppendingPathExtension:", pathExtension) as NSURL

    public open fun URLByDeletingPathExtension(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLByDeletingPathExtension") as NSURL

    public open fun URLByStandardizingPath(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLByStandardizingPath") as NSURL

    public open fun URLByResolvingSymlinksInPath(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLByResolvingSymlinksInPath") as NSURL

    trait metaclass : IObjCObject {
        public open fun fileURLWithPathComponents(components: NSArray): NSURL =
            Native.objc_msgSend("class objc.NSURL", this, "fileURLWithPathComponents:", components) as NSURL
    }
}

trait NSObject_NSURLClient : IObjCObject {
    public open fun URL_resourceDataDidBecomeAvailable(sender: NSURL, newBytes: NSData): Unit {
        Native.objc_msgSend("void", this, "URL:resourceDataDidBecomeAvailable:", sender, newBytes)
    }

    public open fun URLResourceDidFinishLoading(sender: NSURL): Unit {
        Native.objc_msgSend("void", this, "URLResourceDidFinishLoading:", sender)
    }

    public open fun URLResourceDidCancelLoading(sender: NSURL): Unit {
        Native.objc_msgSend("void", this, "URLResourceDidCancelLoading:", sender)
    }

    public open fun URL_resourceDidFailLoadingWithReason(sender: NSURL, reason: NSString): Unit {
        Native.objc_msgSend("void", this, "URL:resourceDidFailLoadingWithReason:", sender, reason)
    }

    trait metaclass : IObjCObject
}

trait NSURL_NSURLLoading : IObjCObject {
    public open fun resourceDataUsingCache(shouldUseCache: Boolean): NSData =
        Native.objc_msgSend("class objc.NSData", this, "resourceDataUsingCache:", shouldUseCache) as NSData

    public open fun loadResourceDataNotifyingClient_usingCache(client: ObjCObject, shouldUseCache: Boolean): Unit {
        Native.objc_msgSend("void", this, "loadResourceDataNotifyingClient:usingCache:", client, shouldUseCache)
    }

    public open fun propertyForKey(propertyKey: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyForKey:", propertyKey) as ObjCObject

    public open fun setResourceData(data: NSData): Boolean =
        Native.objc_msgSend("boolean", this, "setResourceData:", data) as Boolean

    public open fun setProperty_forKey(property: ObjCObject, propertyKey: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setProperty:forKey:", property, propertyKey) as Boolean

    public open fun URLHandleUsingCache(shouldUseCache: Boolean): NSURLHandle =
        Native.objc_msgSend("class objc.NSURLHandle", this, "URLHandleUsingCache:", shouldUseCache) as NSURLHandle

    trait metaclass : IObjCObject
}
