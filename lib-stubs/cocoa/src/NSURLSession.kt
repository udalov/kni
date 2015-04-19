// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLSession.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSURLSessionDelegate {
    trait metaclass
}

trait NSURLSessionTaskDelegate {
    trait metaclass
}

trait NSURLSessionDataDelegate {
    trait metaclass
}

trait NSURLSessionDownloadDelegate {
    trait metaclass
}

public open class NSURLSession(pointer: Long) : NSObject(pointer), NSURLSession_NSURLSessionAsynchronousConvenience, NSURLSession_NSURLSessionDeprecated {
    public open fun delegateQueue(): NSOperationQueue =
        Native.objc_msgSend("class objc.NSOperationQueue", this, "delegateQueue") as NSOperationQueue

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun configuration(): NSURLSessionConfiguration =
        Native.objc_msgSend("class objc.NSURLSessionConfiguration", this, "configuration") as NSURLSessionConfiguration

    public open fun sessionDescription(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "sessionDescription") as NSString

    public open fun setSessionDescription(sessionDescription: NSString): Unit {
        Native.objc_msgSend("void", this, "setSessionDescription:", sessionDescription)
    }

    public open fun finishTasksAndInvalidate(): Unit {
        Native.objc_msgSend("void", this, "finishTasksAndInvalidate")
    }

    public open fun invalidateAndCancel(): Unit {
        Native.objc_msgSend("void", this, "invalidateAndCancel")
    }

    public open fun resetWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "resetWithCompletionHandler:", completionHandler)
    }

    public open fun flushWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "flushWithCompletionHandler:", completionHandler)
    }

    public open fun getTasksWithCompletionHandler(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "getTasksWithCompletionHandler:", completionHandler)
    }

    public open fun dataTaskWithRequest(request: NSURLRequest): NSURLSessionDataTask =
        Native.objc_msgSend("class objc.NSURLSessionDataTask", this, "dataTaskWithRequest:", request) as NSURLSessionDataTask

    public open fun dataTaskWithURL(url: NSURL): NSURLSessionDataTask =
        Native.objc_msgSend("class objc.NSURLSessionDataTask", this, "dataTaskWithURL:", url) as NSURLSessionDataTask

    public open fun uploadTaskWithRequest_fromFile(request: NSURLRequest, fileURL: NSURL): NSURLSessionUploadTask =
        Native.objc_msgSend("class objc.NSURLSessionUploadTask", this, "uploadTaskWithRequest:fromFile:", request, fileURL) as NSURLSessionUploadTask

    public open fun uploadTaskWithRequest_fromData(request: NSURLRequest, bodyData: NSData): NSURLSessionUploadTask =
        Native.objc_msgSend("class objc.NSURLSessionUploadTask", this, "uploadTaskWithRequest:fromData:", request, bodyData) as NSURLSessionUploadTask

    public open fun uploadTaskWithStreamedRequest(request: NSURLRequest): NSURLSessionUploadTask =
        Native.objc_msgSend("class objc.NSURLSessionUploadTask", this, "uploadTaskWithStreamedRequest:", request) as NSURLSessionUploadTask

    public open fun downloadTaskWithRequest(request: NSURLRequest): NSURLSessionDownloadTask =
        Native.objc_msgSend("class objc.NSURLSessionDownloadTask", this, "downloadTaskWithRequest:", request) as NSURLSessionDownloadTask

    public open fun downloadTaskWithURL(url: NSURL): NSURLSessionDownloadTask =
        Native.objc_msgSend("class objc.NSURLSessionDownloadTask", this, "downloadTaskWithURL:", url) as NSURLSessionDownloadTask

    public open fun downloadTaskWithResumeData(resumeData: NSData): NSURLSessionDownloadTask =
        Native.objc_msgSend("class objc.NSURLSessionDownloadTask", this, "downloadTaskWithResumeData:", resumeData) as NSURLSessionDownloadTask

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSURLSession_NSURLSessionAsynchronousConvenience.metaclass, NSURLSession_NSURLSessionDeprecated.metaclass {
        public open fun sharedSession(): NSURLSession =
            Native.objc_msgSend("class objc.NSURLSession", this, "sharedSession") as NSURLSession

        public open fun sessionWithConfiguration(configuration: NSURLSessionConfiguration): NSURLSession =
            Native.objc_msgSend("class objc.NSURLSession", this, "sessionWithConfiguration:", configuration) as NSURLSession

        public open fun sessionWithConfiguration_delegate_delegateQueue(configuration: NSURLSessionConfiguration, delegate: Any, queue: NSOperationQueue): NSURLSession =
            Native.objc_msgSend("class objc.NSURLSession", this, "sessionWithConfiguration:delegate:delegateQueue:", configuration, delegate, queue) as NSURLSession

    }

    companion object : NSObject(Native.objc_getClass("NSURLSession")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSURLSessionTask(pointer: Long) : NSObject(pointer), NSCopying {
    public open fun taskIdentifier(): Int =
        Native.objc_msgSend("int", this, "taskIdentifier") as Int

    public open fun originalRequest(): NSURLRequest =
        Native.objc_msgSend("class objc.NSURLRequest", this, "originalRequest") as NSURLRequest

    public open fun currentRequest(): NSURLRequest =
        Native.objc_msgSend("class objc.NSURLRequest", this, "currentRequest") as NSURLRequest

    public open fun response(): NSURLResponse =
        Native.objc_msgSend("class objc.NSURLResponse", this, "response") as NSURLResponse

    public open fun countOfBytesReceived(): Long =
        Native.objc_msgSend("long", this, "countOfBytesReceived") as Long

    public open fun countOfBytesSent(): Long =
        Native.objc_msgSend("long", this, "countOfBytesSent") as Long

    public open fun countOfBytesExpectedToSend(): Long =
        Native.objc_msgSend("long", this, "countOfBytesExpectedToSend") as Long

    public open fun countOfBytesExpectedToReceive(): Long =
        Native.objc_msgSend("long", this, "countOfBytesExpectedToReceive") as Long

    public open fun taskDescription(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "taskDescription") as NSString

    public open fun setTaskDescription(taskDescription: NSString): Unit {
        Native.objc_msgSend("void", this, "setTaskDescription:", taskDescription)
    }

    public open fun cancel(): Unit {
        Native.objc_msgSend("void", this, "cancel")
    }

    public open fun state(): Any =
        Native.objc_msgSend("class objc.Any", this, "state")

    public open fun error(): NSError =
        Native.objc_msgSend("class objc.NSError", this, "error") as NSError

    public open fun suspend(): Unit {
        Native.objc_msgSend("void", this, "suspend")
    }

    public open fun resume(): Unit {
        Native.objc_msgSend("void", this, "resume")
    }

    public open fun priority(): Float =
        Native.objc_msgSend("float", this, "priority") as Float

    public open fun setPriority(priority: Float): Unit {
        Native.objc_msgSend("void", this, "setPriority:", priority)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSURLSessionTask")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSURLSessionDataTask(pointer: Long) : NSURLSessionTask(pointer) {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSURLSessionTask.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSURLSessionDataTask")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSURLSessionUploadTask(pointer: Long) : NSURLSessionDataTask(pointer) {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSURLSessionDataTask.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSURLSessionUploadTask")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSURLSessionDownloadTask(pointer: Long) : NSURLSessionTask(pointer) {
    public open fun cancelByProducingResumeData(completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "cancelByProducingResumeData:", completionHandler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSURLSessionTask.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSURLSessionDownloadTask")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSURLSessionConfiguration(pointer: Long) : NSObject(pointer), NSCopying, NSURLSessionConfiguration_NSURLSessionDeprecated {
    public open fun identifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "identifier") as NSString

    public open fun requestCachePolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "requestCachePolicy")

    public open fun setRequestCachePolicy(requestCachePolicy: Any): Unit {
        Native.objc_msgSend("void", this, "setRequestCachePolicy:", requestCachePolicy)
    }

    public open fun timeoutIntervalForRequest(): Double =
        Native.objc_msgSend("double", this, "timeoutIntervalForRequest") as Double

    public open fun setTimeoutIntervalForRequest(timeoutIntervalForRequest: Double): Unit {
        Native.objc_msgSend("void", this, "setTimeoutIntervalForRequest:", timeoutIntervalForRequest)
    }

    public open fun timeoutIntervalForResource(): Double =
        Native.objc_msgSend("double", this, "timeoutIntervalForResource") as Double

    public open fun setTimeoutIntervalForResource(timeoutIntervalForResource: Double): Unit {
        Native.objc_msgSend("void", this, "setTimeoutIntervalForResource:", timeoutIntervalForResource)
    }

    public open fun networkServiceType(): Any =
        Native.objc_msgSend("class objc.Any", this, "networkServiceType")

    public open fun setNetworkServiceType(networkServiceType: Any): Unit {
        Native.objc_msgSend("void", this, "setNetworkServiceType:", networkServiceType)
    }

    public open fun allowsCellularAccess(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsCellularAccess") as Boolean

    public open fun setAllowsCellularAccess(allowsCellularAccess: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsCellularAccess:", allowsCellularAccess)
    }

    public open fun isDiscretionary(): Boolean =
        Native.objc_msgSend("boolean", this, "isDiscretionary") as Boolean

    public open fun setDiscretionary(discretionary: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDiscretionary:", discretionary)
    }

    public open fun sharedContainerIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "sharedContainerIdentifier") as NSString

    public open fun setSharedContainerIdentifier(sharedContainerIdentifier: NSString): Unit {
        Native.objc_msgSend("void", this, "setSharedContainerIdentifier:", sharedContainerIdentifier)
    }

    public open fun sessionSendsLaunchEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "sessionSendsLaunchEvents") as Boolean

    public open fun setSessionSendsLaunchEvents(sessionSendsLaunchEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSessionSendsLaunchEvents:", sessionSendsLaunchEvents)
    }

    public open fun connectionProxyDictionary(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "connectionProxyDictionary") as NSDictionary

    public open fun setConnectionProxyDictionary(connectionProxyDictionary: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setConnectionProxyDictionary:", connectionProxyDictionary)
    }

    public open fun TLSMinimumSupportedProtocol(): Any =
        Native.objc_msgSend("class objc.Any", this, "TLSMinimumSupportedProtocol")

    public open fun setTLSMinimumSupportedProtocol(TLSMinimumSupportedProtocol: Any): Unit {
        Native.objc_msgSend("void", this, "setTLSMinimumSupportedProtocol:", TLSMinimumSupportedProtocol)
    }

    public open fun TLSMaximumSupportedProtocol(): Any =
        Native.objc_msgSend("class objc.Any", this, "TLSMaximumSupportedProtocol")

    public open fun setTLSMaximumSupportedProtocol(TLSMaximumSupportedProtocol: Any): Unit {
        Native.objc_msgSend("void", this, "setTLSMaximumSupportedProtocol:", TLSMaximumSupportedProtocol)
    }

    public open fun HTTPShouldUsePipelining(): Boolean =
        Native.objc_msgSend("boolean", this, "HTTPShouldUsePipelining") as Boolean

    public open fun setHTTPShouldUsePipelining(HTTPShouldUsePipelining: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHTTPShouldUsePipelining:", HTTPShouldUsePipelining)
    }

    public open fun HTTPShouldSetCookies(): Boolean =
        Native.objc_msgSend("boolean", this, "HTTPShouldSetCookies") as Boolean

    public open fun setHTTPShouldSetCookies(HTTPShouldSetCookies: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHTTPShouldSetCookies:", HTTPShouldSetCookies)
    }

    public open fun HTTPCookieAcceptPolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "HTTPCookieAcceptPolicy")

    public open fun setHTTPCookieAcceptPolicy(HTTPCookieAcceptPolicy: Any): Unit {
        Native.objc_msgSend("void", this, "setHTTPCookieAcceptPolicy:", HTTPCookieAcceptPolicy)
    }

    public open fun HTTPAdditionalHeaders(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "HTTPAdditionalHeaders") as NSDictionary

    public open fun setHTTPAdditionalHeaders(HTTPAdditionalHeaders: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setHTTPAdditionalHeaders:", HTTPAdditionalHeaders)
    }

    public open fun HTTPMaximumConnectionsPerHost(): Int =
        Native.objc_msgSend("int", this, "HTTPMaximumConnectionsPerHost") as Int

    public open fun setHTTPMaximumConnectionsPerHost(HTTPMaximumConnectionsPerHost: Int): Unit {
        Native.objc_msgSend("void", this, "setHTTPMaximumConnectionsPerHost:", HTTPMaximumConnectionsPerHost)
    }

    public open fun HTTPCookieStorage(): NSHTTPCookieStorage =
        Native.objc_msgSend("class objc.NSHTTPCookieStorage", this, "HTTPCookieStorage") as NSHTTPCookieStorage

    public open fun setHTTPCookieStorage(HTTPCookieStorage: NSHTTPCookieStorage): Unit {
        Native.objc_msgSend("void", this, "setHTTPCookieStorage:", HTTPCookieStorage)
    }

    public open fun URLCredentialStorage(): NSURLCredentialStorage =
        Native.objc_msgSend("class objc.NSURLCredentialStorage", this, "URLCredentialStorage") as NSURLCredentialStorage

    public open fun setURLCredentialStorage(URLCredentialStorage: NSURLCredentialStorage): Unit {
        Native.objc_msgSend("void", this, "setURLCredentialStorage:", URLCredentialStorage)
    }

    public open fun URLCache(): NSURLCache =
        Native.objc_msgSend("class objc.NSURLCache", this, "URLCache") as NSURLCache

    public open fun setURLCache(URLCache: NSURLCache): Unit {
        Native.objc_msgSend("void", this, "setURLCache:", URLCache)
    }

    public open fun protocolClasses(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "protocolClasses") as NSArray

    public open fun setProtocolClasses(protocolClasses: NSArray): Unit {
        Native.objc_msgSend("void", this, "setProtocolClasses:", protocolClasses)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSURLSessionConfiguration_NSURLSessionDeprecated.metaclass {
        public open fun defaultSessionConfiguration(): NSURLSessionConfiguration =
            Native.objc_msgSend("class objc.NSURLSessionConfiguration", this, "defaultSessionConfiguration") as NSURLSessionConfiguration

        public open fun ephemeralSessionConfiguration(): NSURLSessionConfiguration =
            Native.objc_msgSend("class objc.NSURLSessionConfiguration", this, "ephemeralSessionConfiguration") as NSURLSessionConfiguration

        public open fun backgroundSessionConfigurationWithIdentifier(identifier: NSString): NSURLSessionConfiguration =
            Native.objc_msgSend("class objc.NSURLSessionConfiguration", this, "backgroundSessionConfigurationWithIdentifier:", identifier) as NSURLSessionConfiguration

    }

    companion object : NSObject(Native.objc_getClass("NSURLSessionConfiguration")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSURLSession_NSURLSessionAsynchronousConvenience : IObjCObject {
    public open fun dataTaskWithRequest_completionHandler(request: NSURLRequest, completionHandler: Any): NSURLSessionDataTask =
        Native.objc_msgSend("class objc.NSURLSessionDataTask", this, "dataTaskWithRequest:completionHandler:", request, completionHandler) as NSURLSessionDataTask

    public open fun dataTaskWithURL_completionHandler(url: NSURL, completionHandler: Any): NSURLSessionDataTask =
        Native.objc_msgSend("class objc.NSURLSessionDataTask", this, "dataTaskWithURL:completionHandler:", url, completionHandler) as NSURLSessionDataTask

    public open fun uploadTaskWithRequest_fromFile_completionHandler(request: NSURLRequest, fileURL: NSURL, completionHandler: Any): NSURLSessionUploadTask =
        Native.objc_msgSend("class objc.NSURLSessionUploadTask", this, "uploadTaskWithRequest:fromFile:completionHandler:", request, fileURL, completionHandler) as NSURLSessionUploadTask

    public open fun uploadTaskWithRequest_fromData_completionHandler(request: NSURLRequest, bodyData: NSData, completionHandler: Any): NSURLSessionUploadTask =
        Native.objc_msgSend("class objc.NSURLSessionUploadTask", this, "uploadTaskWithRequest:fromData:completionHandler:", request, bodyData, completionHandler) as NSURLSessionUploadTask

    public open fun downloadTaskWithRequest_completionHandler(request: NSURLRequest, completionHandler: Any): NSURLSessionDownloadTask =
        Native.objc_msgSend("class objc.NSURLSessionDownloadTask", this, "downloadTaskWithRequest:completionHandler:", request, completionHandler) as NSURLSessionDownloadTask

    public open fun downloadTaskWithURL_completionHandler(url: NSURL, completionHandler: Any): NSURLSessionDownloadTask =
        Native.objc_msgSend("class objc.NSURLSessionDownloadTask", this, "downloadTaskWithURL:completionHandler:", url, completionHandler) as NSURLSessionDownloadTask

    public open fun downloadTaskWithResumeData_completionHandler(resumeData: NSData, completionHandler: Any): NSURLSessionDownloadTask =
        Native.objc_msgSend("class objc.NSURLSessionDownloadTask", this, "downloadTaskWithResumeData:completionHandler:", resumeData, completionHandler) as NSURLSessionDownloadTask

    trait metaclass : IObjCObject
}

trait NSURLSession_NSURLSessionDeprecated : IObjCObject {
    public open fun dataTaskWithHTTPGetRequest(url: NSURL): NSURLSessionDataTask =
        Native.objc_msgSend("class objc.NSURLSessionDataTask", this, "dataTaskWithHTTPGetRequest:", url) as NSURLSessionDataTask

    public open fun dataTaskWithHTTPGetRequest_completionHandler(url: NSURL, completionHandler: Any): NSURLSessionDataTask =
        Native.objc_msgSend("class objc.NSURLSessionDataTask", this, "dataTaskWithHTTPGetRequest:completionHandler:", url, completionHandler) as NSURLSessionDataTask

    trait metaclass : IObjCObject
}

trait NSURLSessionConfiguration_NSURLSessionDeprecated : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun backgroundSessionConfiguration(identifier: NSString): NSURLSessionConfiguration =
            Native.objc_msgSend("class objc.NSURLSessionConfiguration", this, "backgroundSessionConfiguration:", identifier) as NSURLSessionConfiguration
    }
}
