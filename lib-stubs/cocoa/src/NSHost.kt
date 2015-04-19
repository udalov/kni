// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSHost.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSHost(pointer: Long) : NSObject(pointer) {
    public open fun isEqualToHost(aHost: NSHost): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToHost:", aHost) as Boolean

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun names(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "names") as NSArray

    public open fun address(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "address") as NSString

    public open fun addresses(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "addresses") as NSArray

    public open fun localizedName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedName") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun currentHost(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "currentHost") as ObjCObject

        public open fun hostWithName(name: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "hostWithName:", name) as ObjCObject

        public open fun hostWithAddress(address: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "hostWithAddress:", address) as ObjCObject

        public open fun setHostCacheEnabled(flag: Boolean): Unit {
            Native.objc_msgSend("void", this, "setHostCacheEnabled:", flag)
        }

        public open fun isHostCacheEnabled(): Boolean =
            Native.objc_msgSend("boolean", this, "isHostCacheEnabled") as Boolean

        public open fun flushHostCache(): Unit {
            Native.objc_msgSend("void", this, "flushHostCache")
        }

    }

    companion object : NSObject(Native.objc_getClass("NSHost")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
