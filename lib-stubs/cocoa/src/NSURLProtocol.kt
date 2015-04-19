// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLProtocol.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSURLProtocolClient {
    trait metaclass
}

public open class NSURLProtocol(pointer: Long) : NSObject(pointer), NSURLProtocol_NSURLSessionTaskAdditions {
    public open fun initWithRequest_cachedResponse_client(request: NSURLRequest, cachedResponse: NSCachedURLResponse, client: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRequest:cachedResponse:client:", request, cachedResponse, client) as ObjCObject

    public open fun client(): Any =
        Native.objc_msgSend("class objc.Any", this, "client")

    public open fun request(): NSURLRequest =
        Native.objc_msgSend("class objc.NSURLRequest", this, "request") as NSURLRequest

    public open fun cachedResponse(): NSCachedURLResponse =
        Native.objc_msgSend("class objc.NSCachedURLResponse", this, "cachedResponse") as NSCachedURLResponse

    public open fun startLoading(): Unit {
        Native.objc_msgSend("void", this, "startLoading")
    }

    public open fun stopLoading(): Unit {
        Native.objc_msgSend("void", this, "stopLoading")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSURLProtocol_NSURLSessionTaskAdditions.metaclass {
        public open fun canInitWithRequest(request: NSURLRequest): Boolean =
            Native.objc_msgSend("boolean", this, "canInitWithRequest:", request) as Boolean

        public open fun canonicalRequestForRequest(request: NSURLRequest): NSURLRequest =
            Native.objc_msgSend("class objc.NSURLRequest", this, "canonicalRequestForRequest:", request) as NSURLRequest

        public open fun requestIsCacheEquivalent_toRequest(a: NSURLRequest, b: NSURLRequest): Boolean =
            Native.objc_msgSend("boolean", this, "requestIsCacheEquivalent:toRequest:", a, b) as Boolean

        public open fun propertyForKey_inRequest(key: NSString, request: NSURLRequest): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyForKey:inRequest:", key, request) as ObjCObject

        public open fun setProperty_forKey_inRequest(value: ObjCObject, key: NSString, request: NSMutableURLRequest): Unit {
            Native.objc_msgSend("void", this, "setProperty:forKey:inRequest:", value, key, request)
        }

        public open fun removePropertyForKey_inRequest(key: NSString, request: NSMutableURLRequest): Unit {
            Native.objc_msgSend("void", this, "removePropertyForKey:inRequest:", key, request)
        }

        public open fun registerClass(protocolClass: ObjCClass): Boolean =
            Native.objc_msgSend("boolean", this, "registerClass:", protocolClass) as Boolean

        public open fun unregisterClass(protocolClass: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "unregisterClass:", protocolClass)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSURLProtocol")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSURLProtocol_NSURLSessionTaskAdditions : IObjCObject {
    public open fun initWithTask_cachedResponse_client(task: NSURLSessionTask, cachedResponse: NSCachedURLResponse, client: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTask:cachedResponse:client:", task, cachedResponse, client) as ObjCObject

    public open fun task(): NSURLSessionTask =
        Native.objc_msgSend("class objc.NSURLSessionTask", this, "task") as NSURLSessionTask

    trait metaclass : IObjCObject {
        public open fun canInitWithTask(task: NSURLSessionTask): Boolean =
            Native.objc_msgSend("boolean", this, "canInitWithTask:", task) as Boolean
    }
}
