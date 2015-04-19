// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSHTTPCookie.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSHTTPCookie(pointer: Long) : NSObject(pointer) {
    public open fun initWithProperties(properties: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithProperties:", properties) as ObjCObject

    public open fun properties(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "properties") as NSDictionary

    public open fun version(): Int =
        Native.objc_msgSend("int", this, "version") as Int

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    override fun value(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "value") as NSString

    public open fun expiresDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "expiresDate") as NSDate

    public open fun isSessionOnly(): Boolean =
        Native.objc_msgSend("boolean", this, "isSessionOnly") as Boolean

    public open fun domain(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "domain") as NSString

    public open fun path(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "path") as NSString

    public open fun isSecure(): Boolean =
        Native.objc_msgSend("boolean", this, "isSecure") as Boolean

    public open fun isHTTPOnly(): Boolean =
        Native.objc_msgSend("boolean", this, "isHTTPOnly") as Boolean

    public open fun comment(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "comment") as NSString

    public open fun commentURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "commentURL") as NSURL

    public open fun portList(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "portList") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun cookieWithProperties(properties: NSDictionary): NSHTTPCookie =
            Native.objc_msgSend("class objc.NSHTTPCookie", this, "cookieWithProperties:", properties) as NSHTTPCookie

        public open fun requestHeaderFieldsWithCookies(cookies: NSArray): NSDictionary =
            Native.objc_msgSend("class objc.NSDictionary", this, "requestHeaderFieldsWithCookies:", cookies) as NSDictionary

        public open fun cookiesWithResponseHeaderFields_forURL(headerFields: NSDictionary, URL: NSURL): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "cookiesWithResponseHeaderFields:forURL:", headerFields, URL) as NSArray

    }

    companion object : NSObject(Native.objc_getClass("NSHTTPCookie")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
