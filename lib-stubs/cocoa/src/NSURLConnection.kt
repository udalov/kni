// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLConnection.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSURLConnectionDelegate {
    trait metaclass
}

trait NSURLConnectionDataDelegate {
    trait metaclass
}

trait NSURLConnectionDownloadDelegate {
    trait metaclass
}

public open class NSURLConnection(pointer: Long) : NSObject(pointer), NSURLConnection_NSURLConnectionSynchronousLoading, NSURLConnection_NSURLConnectionQueuedLoading {
    public open fun initWithRequest_delegate_startImmediately(request: NSURLRequest, delegate: ObjCObject, startImmediately: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRequest:delegate:startImmediately:", request, delegate, startImmediately) as ObjCObject

    public open fun initWithRequest_delegate(request: NSURLRequest, delegate: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRequest:delegate:", request, delegate) as ObjCObject

    public open fun originalRequest(): NSURLRequest =
        Native.objc_msgSend("class objc.NSURLRequest", this, "originalRequest") as NSURLRequest

    public open fun currentRequest(): NSURLRequest =
        Native.objc_msgSend("class objc.NSURLRequest", this, "currentRequest") as NSURLRequest

    public open fun start(): Unit {
        Native.objc_msgSend("void", this, "start")
    }

    public open fun cancel(): Unit {
        Native.objc_msgSend("void", this, "cancel")
    }

    public open fun scheduleInRunLoop_forMode(aRunLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "scheduleInRunLoop:forMode:", aRunLoop, mode)
    }

    public open fun unscheduleFromRunLoop_forMode(aRunLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "unscheduleFromRunLoop:forMode:", aRunLoop, mode)
    }

    public open fun setDelegateQueue(queue: NSOperationQueue): Unit {
        Native.objc_msgSend("void", this, "setDelegateQueue:", queue)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSURLConnection_NSURLConnectionSynchronousLoading.metaclass, NSURLConnection_NSURLConnectionQueuedLoading.metaclass {
        public open fun connectionWithRequest_delegate(request: NSURLRequest, delegate: ObjCObject): NSURLConnection =
            Native.objc_msgSend("class objc.NSURLConnection", this, "connectionWithRequest:delegate:", request, delegate) as NSURLConnection

        public open fun canHandleRequest(request: NSURLRequest): Boolean =
            Native.objc_msgSend("boolean", this, "canHandleRequest:", request) as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSURLConnection")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSURLConnection_NSURLConnectionSynchronousLoading : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun sendSynchronousRequest_returningResponse_error(request: NSURLRequest, response: Pointer<NSURLResponse>, error: Pointer<NSError>): NSData =
            Native.objc_msgSend("class objc.NSData", this, "sendSynchronousRequest:returningResponse:error:", request, response, error) as NSData
    }
}

trait NSURLConnection_NSURLConnectionQueuedLoading : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun sendAsynchronousRequest_queue_completionHandler(request: NSURLRequest, queue: NSOperationQueue, handler: Any): Unit {
            Native.objc_msgSend("void", this, "sendAsynchronousRequest:queue:completionHandler:", request, queue, handler)
        }
    }
}
