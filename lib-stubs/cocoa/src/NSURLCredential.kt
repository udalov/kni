// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLCredential.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSURLCredential(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying, NSURLCredential_NSInternetPassword, NSURLCredential_NSClientCertificate, NSURLCredential_NSServerTrust {
    public open fun persistence(): Any =
        Native.objc_msgSend("class objc.Any", this, "persistence")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass, NSURLCredential_NSInternetPassword.metaclass, NSURLCredential_NSClientCertificate.metaclass, NSURLCredential_NSServerTrust.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSURLCredential")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSURLCredential_NSInternetPassword : IObjCObject {
    public open fun initWithUser_password_persistence(user: NSString, password: NSString, persistence: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithUser:password:persistence:", user, password, persistence) as ObjCObject

    public open fun user(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "user") as NSString

    public open fun password(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "password") as NSString

    public open fun hasPassword(): Boolean =
        Native.objc_msgSend("boolean", this, "hasPassword") as Boolean

    trait metaclass : IObjCObject {
        public open fun credentialWithUser_password_persistence(user: NSString, password: NSString, persistence: Any): NSURLCredential =
            Native.objc_msgSend("class objc.NSURLCredential", this, "credentialWithUser:password:persistence:", user, password, persistence) as NSURLCredential
    }
}

trait NSURLCredential_NSClientCertificate : IObjCObject {
    public open fun initWithIdentity_certificates_persistence(identity: Pointer<Any>, certArray: NSArray, persistence: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIdentity:certificates:persistence:", identity, certArray, persistence) as ObjCObject

    public open fun identity(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "identity") as Pointer<Any>

    public open fun certificates(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "certificates") as NSArray

    trait metaclass : IObjCObject {
        public open fun credentialWithIdentity_certificates_persistence(identity: Pointer<Any>, certArray: NSArray, persistence: Any): NSURLCredential =
            Native.objc_msgSend("class objc.NSURLCredential", this, "credentialWithIdentity:certificates:persistence:", identity, certArray, persistence) as NSURLCredential
    }
}

trait NSURLCredential_NSServerTrust : IObjCObject {
    public open fun initWithTrust(trust: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTrust:", trust) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun credentialForTrust(trust: Pointer<Any>): NSURLCredential =
            Native.objc_msgSend("class objc.NSURLCredential", this, "credentialForTrust:", trust) as NSURLCredential
    }
}
