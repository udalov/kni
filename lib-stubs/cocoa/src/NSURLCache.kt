// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLCache.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCachedURLResponse(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying {
    public open fun initWithResponse_data(response: NSURLResponse, data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithResponse:data:", response, data) as ObjCObject

    public open fun initWithResponse_data_userInfo_storagePolicy(response: NSURLResponse, data: NSData, userInfo: NSDictionary, storagePolicy: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithResponse:data:userInfo:storagePolicy:", response, data, userInfo, storagePolicy) as ObjCObject

    public open fun response(): NSURLResponse =
        Native.objc_msgSend("class objc.NSURLResponse", this, "response") as NSURLResponse

    public open fun data(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "data") as NSData

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    public open fun storagePolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "storagePolicy")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCachedURLResponse")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSURLCache(pointer: Long) : NSObject(pointer), NSURLCache_NSURLSessionTaskAdditions {
    public open fun initWithMemoryCapacity_diskCapacity_diskPath(memoryCapacity: Int, diskCapacity: Int, path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithMemoryCapacity:diskCapacity:diskPath:", memoryCapacity, diskCapacity, path) as ObjCObject

    public open fun cachedResponseForRequest(request: NSURLRequest): NSCachedURLResponse =
        Native.objc_msgSend("class objc.NSCachedURLResponse", this, "cachedResponseForRequest:", request) as NSCachedURLResponse

    public open fun storeCachedResponse_forRequest(cachedResponse: NSCachedURLResponse, request: NSURLRequest): Unit {
        Native.objc_msgSend("void", this, "storeCachedResponse:forRequest:", cachedResponse, request)
    }

    public open fun removeCachedResponseForRequest(request: NSURLRequest): Unit {
        Native.objc_msgSend("void", this, "removeCachedResponseForRequest:", request)
    }

    public open fun removeAllCachedResponses(): Unit {
        Native.objc_msgSend("void", this, "removeAllCachedResponses")
    }

    public open fun removeCachedResponsesSinceDate(date: NSDate): Unit {
        Native.objc_msgSend("void", this, "removeCachedResponsesSinceDate:", date)
    }

    public open fun memoryCapacity(): Int =
        Native.objc_msgSend("int", this, "memoryCapacity") as Int

    public open fun setMemoryCapacity(memoryCapacity: Int): Unit {
        Native.objc_msgSend("void", this, "setMemoryCapacity:", memoryCapacity)
    }

    public open fun diskCapacity(): Int =
        Native.objc_msgSend("int", this, "diskCapacity") as Int

    public open fun setDiskCapacity(diskCapacity: Int): Unit {
        Native.objc_msgSend("void", this, "setDiskCapacity:", diskCapacity)
    }

    public open fun currentMemoryUsage(): Int =
        Native.objc_msgSend("int", this, "currentMemoryUsage") as Int

    public open fun currentDiskUsage(): Int =
        Native.objc_msgSend("int", this, "currentDiskUsage") as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSURLCache_NSURLSessionTaskAdditions.metaclass {
        public open fun sharedURLCache(): NSURLCache =
            Native.objc_msgSend("class objc.NSURLCache", this, "sharedURLCache") as NSURLCache

        public open fun setSharedURLCache(cache: NSURLCache): Unit {
            Native.objc_msgSend("void", this, "setSharedURLCache:", cache)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSURLCache")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSURLCache_NSURLSessionTaskAdditions : IObjCObject {
    public open fun storeCachedResponse_forDataTask(cachedResponse: NSCachedURLResponse, dataTask: NSURLSessionDataTask): Unit {
        Native.objc_msgSend("void", this, "storeCachedResponse:forDataTask:", cachedResponse, dataTask)
    }

    public open fun getCachedResponseForDataTask_completionHandler(dataTask: NSURLSessionDataTask, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "getCachedResponseForDataTask:completionHandler:", dataTask, completionHandler)
    }

    public open fun removeCachedResponseForDataTask(dataTask: NSURLSessionDataTask): Unit {
        Native.objc_msgSend("void", this, "removeCachedResponseForDataTask:", dataTask)
    }

    trait metaclass : IObjCObject
}
