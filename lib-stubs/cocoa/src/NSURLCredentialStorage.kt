// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLCredentialStorage.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSURLCredentialStorage(pointer: Long) : NSObject(pointer), NSURLCredentialStorage_NSURLSessionTaskAdditions {
    public open fun credentialsForProtectionSpace(space: NSURLProtectionSpace): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "credentialsForProtectionSpace:", space) as NSDictionary

    public open fun allCredentials(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "allCredentials") as NSDictionary

    public open fun setCredential_forProtectionSpace(credential: NSURLCredential, space: NSURLProtectionSpace): Unit {
        Native.objc_msgSend("void", this, "setCredential:forProtectionSpace:", credential, space)
    }

    public open fun removeCredential_forProtectionSpace(credential: NSURLCredential, space: NSURLProtectionSpace): Unit {
        Native.objc_msgSend("void", this, "removeCredential:forProtectionSpace:", credential, space)
    }

    public open fun removeCredential_forProtectionSpace_options(credential: NSURLCredential, space: NSURLProtectionSpace, options: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "removeCredential:forProtectionSpace:options:", credential, space, options)
    }

    public open fun defaultCredentialForProtectionSpace(space: NSURLProtectionSpace): NSURLCredential =
        Native.objc_msgSend("class objc.NSURLCredential", this, "defaultCredentialForProtectionSpace:", space) as NSURLCredential

    public open fun setDefaultCredential_forProtectionSpace(credential: NSURLCredential, space: NSURLProtectionSpace): Unit {
        Native.objc_msgSend("void", this, "setDefaultCredential:forProtectionSpace:", credential, space)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSURLCredentialStorage_NSURLSessionTaskAdditions.metaclass {
        public open fun sharedCredentialStorage(): NSURLCredentialStorage =
            Native.objc_msgSend("class objc.NSURLCredentialStorage", this, "sharedCredentialStorage") as NSURLCredentialStorage

    }

    companion object : NSObject(Native.objc_getClass("NSURLCredentialStorage")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSURLCredentialStorage_NSURLSessionTaskAdditions : IObjCObject {
    public open fun getCredentialsForProtectionSpace_task_completionHandler(protectionSpace: NSURLProtectionSpace, task: NSURLSessionTask, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "getCredentialsForProtectionSpace:task:completionHandler:", protectionSpace, task, completionHandler)
    }

    public open fun setCredential_forProtectionSpace_task(credential: NSURLCredential, protectionSpace: NSURLProtectionSpace, task: NSURLSessionTask): Unit {
        Native.objc_msgSend("void", this, "setCredential:forProtectionSpace:task:", credential, protectionSpace, task)
    }

    public open fun removeCredential_forProtectionSpace_options_task(credential: NSURLCredential, protectionSpace: NSURLProtectionSpace, options: NSDictionary, task: NSURLSessionTask): Unit {
        Native.objc_msgSend("void", this, "removeCredential:forProtectionSpace:options:task:", credential, protectionSpace, options, task)
    }

    public open fun getDefaultCredentialForProtectionSpace_task_completionHandler(space: NSURLProtectionSpace, task: NSURLSessionTask, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "getDefaultCredentialForProtectionSpace:task:completionHandler:", space, task, completionHandler)
    }

    public open fun setDefaultCredential_forProtectionSpace_task(credential: NSURLCredential, protectionSpace: NSURLProtectionSpace, task: NSURLSessionTask): Unit {
        Native.objc_msgSend("void", this, "setDefaultCredential:forProtectionSpace:task:", credential, protectionSpace, task)
    }

    trait metaclass : IObjCObject
}
