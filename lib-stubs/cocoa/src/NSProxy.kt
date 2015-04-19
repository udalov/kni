// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSProxy.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSProxy(pointer: Long) : ObjCObject(pointer), NSObjectProtocol {
    public open fun forwardInvocation(invocation: NSInvocation): Unit {
        Native.objc_msgSend("void", this, "forwardInvocation:", invocation)
    }

    public open fun methodSignatureForSelector(sel: ObjCSelector): NSMethodSignature =
        Native.objc_msgSend("class objc.NSMethodSignature", this, "methodSignatureForSelector:", sel) as NSMethodSignature

    public open fun dealloc(): Unit {
        Native.objc_msgSend("void", this, "dealloc")
    }

    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun debugDescription(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "debugDescription") as NSString

    public open fun allowsWeakReference(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsWeakReference") as Boolean

    public open fun retainWeakReference(): Boolean =
        Native.objc_msgSend("boolean", this, "retainWeakReference") as Boolean

    trait metaclass : IObjCObject, NSObjectProtocol.metaclass {
        public open fun alloc(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "alloc") as ObjCObject

        public open fun allocWithZone(zone: Pointer<Any>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "allocWithZone:", zone) as ObjCObject

        public open fun `class`(): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "class") as ObjCClass

        public open fun respondsToSelector(aSelector: ObjCSelector): Boolean =
            Native.objc_msgSend("boolean", this, "respondsToSelector:", aSelector) as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSProxy")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
