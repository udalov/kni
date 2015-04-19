// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLRequest.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSURLRequest(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying, NSMutableCopying, NSURLRequest_NSHTTPURLRequest {
    public open fun initWithURL(URL: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:", URL) as ObjCObject

    public open fun initWithURL_cachePolicy_timeoutInterval(URL: NSURL, cachePolicy: Any, timeoutInterval: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:cachePolicy:timeoutInterval:", URL, cachePolicy, timeoutInterval) as ObjCObject

    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun cachePolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "cachePolicy")

    public open fun timeoutInterval(): Double =
        Native.objc_msgSend("double", this, "timeoutInterval") as Double

    public open fun mainDocumentURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "mainDocumentURL") as NSURL

    public open fun networkServiceType(): Any =
        Native.objc_msgSend("class objc.Any", this, "networkServiceType")

    public open fun allowsCellularAccess(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsCellularAccess") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSURLRequest_NSHTTPURLRequest.metaclass {
        public open fun requestWithURL(URL: NSURL): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "requestWithURL:", URL) as ObjCObject

        public open fun supportsSecureCoding(): Boolean =
            Native.objc_msgSend("boolean", this, "supportsSecureCoding") as Boolean

        public open fun requestWithURL_cachePolicy_timeoutInterval(URL: NSURL, cachePolicy: Any, timeoutInterval: Double): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "requestWithURL:cachePolicy:timeoutInterval:", URL, cachePolicy, timeoutInterval) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSURLRequest")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableURLRequest(pointer: Long) : NSURLRequest(pointer), NSMutableURLRequest_NSMutableHTTPURLRequest {
    override fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun setURL(URL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setURL:", URL)
    }

    override fun cachePolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "cachePolicy")

    public open fun setCachePolicy(cachePolicy: Any): Unit {
        Native.objc_msgSend("void", this, "setCachePolicy:", cachePolicy)
    }

    override fun timeoutInterval(): Double =
        Native.objc_msgSend("double", this, "timeoutInterval") as Double

    public open fun setTimeoutInterval(timeoutInterval: Double): Unit {
        Native.objc_msgSend("void", this, "setTimeoutInterval:", timeoutInterval)
    }

    override fun mainDocumentURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "mainDocumentURL") as NSURL

    public open fun setMainDocumentURL(mainDocumentURL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setMainDocumentURL:", mainDocumentURL)
    }

    override fun networkServiceType(): Any =
        Native.objc_msgSend("class objc.Any", this, "networkServiceType")

    public open fun setNetworkServiceType(networkServiceType: Any): Unit {
        Native.objc_msgSend("void", this, "setNetworkServiceType:", networkServiceType)
    }

    override fun allowsCellularAccess(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsCellularAccess") as Boolean

    public open fun setAllowsCellularAccess(allowsCellularAccess: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsCellularAccess:", allowsCellularAccess)
    }

    override fun HTTPBody(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "HTTPBody") as NSData

    override fun HTTPBodyStream(): NSInputStream =
        Native.objc_msgSend("class objc.NSInputStream", this, "HTTPBodyStream") as NSInputStream

    override fun HTTPMethod(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "HTTPMethod") as NSString

    override fun HTTPShouldHandleCookies(): Boolean =
        Native.objc_msgSend("boolean", this, "HTTPShouldHandleCookies") as Boolean

    override fun HTTPShouldUsePipelining(): Boolean =
        Native.objc_msgSend("boolean", this, "HTTPShouldUsePipelining") as Boolean

    override fun allHTTPHeaderFields(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "allHTTPHeaderFields") as NSDictionary

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSURLRequest.metaclass, NSMutableURLRequest_NSMutableHTTPURLRequest.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMutableURLRequest")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSURLRequest_NSHTTPURLRequest : IObjCObject {
    public open fun HTTPMethod(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "HTTPMethod") as NSString

    public open fun allHTTPHeaderFields(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "allHTTPHeaderFields") as NSDictionary

    public open fun valueForHTTPHeaderField(field: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "valueForHTTPHeaderField:", field) as NSString

    public open fun HTTPBody(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "HTTPBody") as NSData

    public open fun HTTPBodyStream(): NSInputStream =
        Native.objc_msgSend("class objc.NSInputStream", this, "HTTPBodyStream") as NSInputStream

    public open fun HTTPShouldHandleCookies(): Boolean =
        Native.objc_msgSend("boolean", this, "HTTPShouldHandleCookies") as Boolean

    public open fun HTTPShouldUsePipelining(): Boolean =
        Native.objc_msgSend("boolean", this, "HTTPShouldUsePipelining") as Boolean

    trait metaclass : IObjCObject
}

trait NSMutableURLRequest_NSMutableHTTPURLRequest : IObjCObject {
    public open fun HTTPMethod(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "HTTPMethod") as NSString

    public open fun setHTTPMethod(HTTPMethod: NSString): Unit {
        Native.objc_msgSend("void", this, "setHTTPMethod:", HTTPMethod)
    }

    public open fun allHTTPHeaderFields(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "allHTTPHeaderFields") as NSDictionary

    public open fun setAllHTTPHeaderFields(allHTTPHeaderFields: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setAllHTTPHeaderFields:", allHTTPHeaderFields)
    }

    public open fun setValue_forHTTPHeaderField(value: NSString, field: NSString): Unit {
        Native.objc_msgSend("void", this, "setValue:forHTTPHeaderField:", value, field)
    }

    public open fun addValue_forHTTPHeaderField(value: NSString, field: NSString): Unit {
        Native.objc_msgSend("void", this, "addValue:forHTTPHeaderField:", value, field)
    }

    public open fun HTTPBody(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "HTTPBody") as NSData

    public open fun setHTTPBody(HTTPBody: NSData): Unit {
        Native.objc_msgSend("void", this, "setHTTPBody:", HTTPBody)
    }

    public open fun HTTPBodyStream(): NSInputStream =
        Native.objc_msgSend("class objc.NSInputStream", this, "HTTPBodyStream") as NSInputStream

    public open fun setHTTPBodyStream(HTTPBodyStream: NSInputStream): Unit {
        Native.objc_msgSend("void", this, "setHTTPBodyStream:", HTTPBodyStream)
    }

    public open fun HTTPShouldHandleCookies(): Boolean =
        Native.objc_msgSend("boolean", this, "HTTPShouldHandleCookies") as Boolean

    public open fun setHTTPShouldHandleCookies(HTTPShouldHandleCookies: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHTTPShouldHandleCookies:", HTTPShouldHandleCookies)
    }

    public open fun HTTPShouldUsePipelining(): Boolean =
        Native.objc_msgSend("boolean", this, "HTTPShouldUsePipelining") as Boolean

    public open fun setHTTPShouldUsePipelining(HTTPShouldUsePipelining: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHTTPShouldUsePipelining:", HTTPShouldUsePipelining)
    }

    trait metaclass : IObjCObject
}
