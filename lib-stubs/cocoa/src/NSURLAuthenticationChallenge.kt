// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLAuthenticationChallenge.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSURLAuthenticationChallengeSender {
    trait metaclass
}

public open class NSURLAuthenticationChallenge(pointer: Long) : NSObject(pointer), NSSecureCoding {
    public open fun initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender(space: NSURLProtectionSpace, credential: NSURLCredential, previousFailureCount: Int, response: NSURLResponse, error: NSError, sender: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:sender:", space, credential, previousFailureCount, response, error, sender) as ObjCObject

    public open fun initWithAuthenticationChallenge_sender(challenge: NSURLAuthenticationChallenge, sender: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithAuthenticationChallenge:sender:", challenge, sender) as ObjCObject

    public open fun protectionSpace(): NSURLProtectionSpace =
        Native.objc_msgSend("class objc.NSURLProtectionSpace", this, "protectionSpace") as NSURLProtectionSpace

    public open fun proposedCredential(): NSURLCredential =
        Native.objc_msgSend("class objc.NSURLCredential", this, "proposedCredential") as NSURLCredential

    public open fun previousFailureCount(): Int =
        Native.objc_msgSend("int", this, "previousFailureCount") as Int

    public open fun failureResponse(): NSURLResponse =
        Native.objc_msgSend("class objc.NSURLResponse", this, "failureResponse") as NSURLResponse

    public open fun error(): NSError =
        Native.objc_msgSend("class objc.NSError", this, "error") as NSError

    public open fun sender(): Any =
        Native.objc_msgSend("class objc.Any", this, "sender")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSURLAuthenticationChallenge")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
