// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLHandle.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSURLHandleClient {
    trait metaclass
}

public open class NSURLHandle(pointer: Long) : NSObject(pointer) {
    public open fun status(): Any =
        Native.objc_msgSend("class objc.Any", this, "status")

    public open fun failureReason(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "failureReason") as NSString

    public open fun addClient(client: Any): Unit {
        Native.objc_msgSend("void", this, "addClient:", client)
    }

    public open fun removeClient(client: Any): Unit {
        Native.objc_msgSend("void", this, "removeClient:", client)
    }

    public open fun loadInBackground(): Unit {
        Native.objc_msgSend("void", this, "loadInBackground")
    }

    public open fun cancelLoadInBackground(): Unit {
        Native.objc_msgSend("void", this, "cancelLoadInBackground")
    }

    public open fun resourceData(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "resourceData") as NSData

    public open fun availableResourceData(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "availableResourceData") as NSData

    public open fun expectedResourceDataSize(): Long =
        Native.objc_msgSend("long", this, "expectedResourceDataSize") as Long

    public open fun flushCachedData(): Unit {
        Native.objc_msgSend("void", this, "flushCachedData")
    }

    public open fun backgroundLoadDidFailWithReason(reason: NSString): Unit {
        Native.objc_msgSend("void", this, "backgroundLoadDidFailWithReason:", reason)
    }

    public open fun didLoadBytes_loadComplete(newBytes: NSData, yorn: Boolean): Unit {
        Native.objc_msgSend("void", this, "didLoadBytes:loadComplete:", newBytes, yorn)
    }

    public open fun initWithURL_cached(anURL: NSURL, willCache: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:cached:", anURL, willCache) as ObjCObject

    public open fun propertyForKey(propertyKey: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyForKey:", propertyKey) as ObjCObject

    public open fun propertyForKeyIfAvailable(propertyKey: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyForKeyIfAvailable:", propertyKey) as ObjCObject

    public open fun writeProperty_forKey(propertyValue: ObjCObject, propertyKey: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "writeProperty:forKey:", propertyValue, propertyKey) as Boolean

    public open fun writeData(data: NSData): Boolean =
        Native.objc_msgSend("boolean", this, "writeData:", data) as Boolean

    public open fun loadInForeground(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "loadInForeground") as NSData

    public open fun beginLoadInBackground(): Unit {
        Native.objc_msgSend("void", this, "beginLoadInBackground")
    }

    public open fun endLoadInBackground(): Unit {
        Native.objc_msgSend("void", this, "endLoadInBackground")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun registerURLHandleClass(anURLHandleSubclass: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "registerURLHandleClass:", anURLHandleSubclass)
        }

        public open fun URLHandleClassForURL(anURL: NSURL): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "URLHandleClassForURL:", anURL) as ObjCClass

        public open fun canInitWithURL(anURL: NSURL): Boolean =
            Native.objc_msgSend("boolean", this, "canInitWithURL:", anURL) as Boolean

        public open fun cachedHandleForURL(anURL: NSURL): NSURLHandle =
            Native.objc_msgSend("class objc.NSURLHandle", this, "cachedHandleForURL:", anURL) as NSURLHandle

    }

    companion object : NSObject(Native.objc_getClass("NSURLHandle")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
