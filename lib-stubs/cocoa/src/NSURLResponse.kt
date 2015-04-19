// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLResponse.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSURLResponse(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying {
    public open fun initWithURL_MIMEType_expectedContentLength_textEncodingName(URL: NSURL, MIMEType: NSString, length: Int, name: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:MIMEType:expectedContentLength:textEncodingName:", URL, MIMEType, length, name) as ObjCObject

    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun MIMEType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "MIMEType") as NSString

    public open fun expectedContentLength(): Long =
        Native.objc_msgSend("long", this, "expectedContentLength") as Long

    public open fun textEncodingName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "textEncodingName") as NSString

    public open fun suggestedFilename(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "suggestedFilename") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSURLResponse")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSHTTPURLResponse(pointer: Long) : NSURLResponse(pointer) {
    public open fun initWithURL_statusCode_HTTPVersion_headerFields(url: NSURL, statusCode: Int, HTTPVersion: NSString, headerFields: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:statusCode:HTTPVersion:headerFields:", url, statusCode, HTTPVersion, headerFields) as ObjCObject

    public open fun statusCode(): Int =
        Native.objc_msgSend("int", this, "statusCode") as Int

    public open fun allHeaderFields(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "allHeaderFields") as NSDictionary

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSURLResponse.metaclass {
        public open fun localizedStringForStatusCode(statusCode: Int): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localizedStringForStatusCode:", statusCode) as NSString

    }

    companion object : NSObject(Native.objc_getClass("NSHTTPURLResponse")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
