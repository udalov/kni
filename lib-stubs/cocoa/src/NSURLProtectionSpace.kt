// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLProtectionSpace.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSURLProtectionSpace(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying, NSURLProtectionSpace_NSClientCertificateSpace, NSURLProtectionSpace_NSServerTrustValidationSpace {
    public open fun initWithHost_port_protocol_realm_authenticationMethod(host: NSString, port: Int, protocol: NSString, realm: NSString, authenticationMethod: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithHost:port:protocol:realm:authenticationMethod:", host, port, protocol, realm, authenticationMethod) as ObjCObject

    public open fun initWithProxyHost_port_type_realm_authenticationMethod(host: NSString, port: Int, type: NSString, realm: NSString, authenticationMethod: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithProxyHost:port:type:realm:authenticationMethod:", host, port, type, realm, authenticationMethod) as ObjCObject

    public open fun realm(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "realm") as NSString

    public open fun receivesCredentialSecurely(): Boolean =
        Native.objc_msgSend("boolean", this, "receivesCredentialSecurely") as Boolean

    public open fun isProxy(): Boolean =
        Native.objc_msgSend("boolean", this, "isProxy") as Boolean

    public open fun host(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "host") as NSString

    public open fun port(): Int =
        Native.objc_msgSend("int", this, "port") as Int

    public open fun proxyType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "proxyType") as NSString

    public open fun protocol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "protocol") as NSString

    public open fun authenticationMethod(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "authenticationMethod") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass, NSURLProtectionSpace_NSClientCertificateSpace.metaclass, NSURLProtectionSpace_NSServerTrustValidationSpace.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSURLProtectionSpace")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSURLProtectionSpace_NSClientCertificateSpace : IObjCObject {
    public open fun distinguishedNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "distinguishedNames") as NSArray

    trait metaclass : IObjCObject
}

trait NSURLProtectionSpace_NSServerTrustValidationSpace : IObjCObject {
    public open fun serverTrust(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "serverTrust") as Pointer<Any>

    trait metaclass : IObjCObject
}
