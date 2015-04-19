// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSError.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSError(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    public open fun initWithDomain_code_userInfo(domain: NSString, code: Int, dict: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDomain:code:userInfo:", domain, code, dict) as ObjCObject

    public open fun domain(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "domain") as NSString

    public open fun code(): Int =
        Native.objc_msgSend("int", this, "code") as Int

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    public open fun localizedDescription(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedDescription") as NSString

    public open fun localizedFailureReason(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedFailureReason") as NSString

    public open fun localizedRecoverySuggestion(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedRecoverySuggestion") as NSString

    public open fun localizedRecoveryOptions(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "localizedRecoveryOptions") as NSArray

    public open fun recoveryAttempter(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "recoveryAttempter") as ObjCObject

    public open fun helpAnchor(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "helpAnchor") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
        public open fun errorWithDomain_code_userInfo(domain: NSString, code: Int, dict: NSDictionary): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "errorWithDomain:code:userInfo:", domain, code, dict) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSError")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSErrorRecoveryAttempting : IObjCObject {
    public open fun attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo(error: NSError, recoveryOptionIndex: Int, delegate: ObjCObject, didRecoverSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:", error, recoveryOptionIndex, delegate, didRecoverSelector, contextInfo)
    }

    public open fun attemptRecoveryFromError_optionIndex(error: NSError, recoveryOptionIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "attemptRecoveryFromError:optionIndex:", error, recoveryOptionIndex) as Boolean

    trait metaclass : IObjCObject
}
