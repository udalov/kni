// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSHTTPCookieStorage.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSHTTPCookieStorage(pointer: Long) : NSObject(pointer), NSHTTPCookieStorage_NSURLSessionTaskAdditions {
    public open fun cookies(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "cookies") as NSArray

    public open fun setCookie(cookie: NSHTTPCookie): Unit {
        Native.objc_msgSend("void", this, "setCookie:", cookie)
    }

    public open fun deleteCookie(cookie: NSHTTPCookie): Unit {
        Native.objc_msgSend("void", this, "deleteCookie:", cookie)
    }

    public open fun removeCookiesSinceDate(date: NSDate): Unit {
        Native.objc_msgSend("void", this, "removeCookiesSinceDate:", date)
    }

    public open fun cookiesForURL(URL: NSURL): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "cookiesForURL:", URL) as NSArray

    public open fun setCookies_forURL_mainDocumentURL(cookies: NSArray, URL: NSURL, mainDocumentURL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setCookies:forURL:mainDocumentURL:", cookies, URL, mainDocumentURL)
    }

    public open fun cookieAcceptPolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "cookieAcceptPolicy")

    public open fun setCookieAcceptPolicy(cookieAcceptPolicy: Any): Unit {
        Native.objc_msgSend("void", this, "setCookieAcceptPolicy:", cookieAcceptPolicy)
    }

    public open fun sortedCookiesUsingDescriptors(sortOrder: NSArray): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortedCookiesUsingDescriptors:", sortOrder) as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSHTTPCookieStorage_NSURLSessionTaskAdditions.metaclass {
        public open fun sharedHTTPCookieStorage(): NSHTTPCookieStorage =
            Native.objc_msgSend("class objc.NSHTTPCookieStorage", this, "sharedHTTPCookieStorage") as NSHTTPCookieStorage

    }

    companion object : NSObject(Native.objc_getClass("NSHTTPCookieStorage")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSHTTPCookieStorage_NSURLSessionTaskAdditions : IObjCObject {
    public open fun storeCookies_forTask(cookies: NSArray, task: NSURLSessionTask): Unit {
        Native.objc_msgSend("void", this, "storeCookies:forTask:", cookies, task)
    }

    public open fun getCookiesForTask_completionHandler(task: NSURLSessionTask, completionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "getCookiesForTask:completionHandler:", task, completionHandler)
    }

    trait metaclass : IObjCObject
}
