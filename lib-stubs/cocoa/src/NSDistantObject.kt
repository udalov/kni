// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSDistantObject.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDistantObject(pointer: Long) : NSProxy(pointer), NSCoding {
    public open fun initWithTarget_connection(target: ObjCObject, connection: NSConnection): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTarget:connection:", target, connection) as ObjCObject

    public open fun initWithLocal_connection(target: ObjCObject, connection: NSConnection): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithLocal:connection:", target, connection) as ObjCObject

    public open fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun setProtocolForProxy(proto: Any?): Unit {
        Native.objc_msgSend("void", this, "setProtocolForProxy:", proto)
    }

    public open fun connectionForProxy(): NSConnection =
        Native.objc_msgSend("class objc.NSConnection", this, "connectionForProxy") as NSConnection

    trait metaclass : NSProxy.metaclass, NSCoding.metaclass {
        public open fun proxyWithTarget_connection(target: ObjCObject, connection: NSConnection): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "proxyWithTarget:connection:", target, connection) as ObjCObject

        public open fun proxyWithLocal_connection(target: ObjCObject, connection: NSConnection): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "proxyWithLocal:connection:", target, connection) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSDistantObject")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
