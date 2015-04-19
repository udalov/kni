// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSProtocolChecker.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSProtocolChecker(pointer: Long) : NSProxy(pointer), NSProtocolChecker_NSProtocolCheckerCreation {
    public open fun protocol(): Any? =
        Native.objc_msgSend("class objc.Any?", this, "protocol") as Any?

    public open fun target(): NSObject =
        Native.objc_msgSend("class objc.NSObject", this, "target") as NSObject

    trait metaclass : NSProxy.metaclass, NSProtocolChecker_NSProtocolCheckerCreation.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSProtocolChecker")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSProtocolChecker_NSProtocolCheckerCreation : IObjCObject {
    public open fun initWithTarget_protocol(anObject: NSObject, aProtocol: Any?): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTarget:protocol:", anObject, aProtocol) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun protocolCheckerWithTarget_protocol(anObject: NSObject, aProtocol: Any?): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "protocolCheckerWithTarget:protocol:", anObject, aProtocol) as ObjCObject
    }
}
