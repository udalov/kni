// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSCache.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSCacheDelegate {
    trait metaclass
}

public open class NSCache(pointer: Long) : NSObject(pointer) {
    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun objectForKey(key: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForKey:", key) as ObjCObject

    public open fun setObject_forKey(obj: ObjCObject, key: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setObject:forKey:", obj, key)
    }

    public open fun setObject_forKey_cost(obj: ObjCObject, key: ObjCObject, g: Int): Unit {
        Native.objc_msgSend("void", this, "setObject:forKey:cost:", obj, key, g)
    }

    public open fun removeObjectForKey(key: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObjectForKey:", key)
    }

    public open fun removeAllObjects(): Unit {
        Native.objc_msgSend("void", this, "removeAllObjects")
    }

    public open fun totalCostLimit(): Int =
        Native.objc_msgSend("int", this, "totalCostLimit") as Int

    public open fun setTotalCostLimit(totalCostLimit: Int): Unit {
        Native.objc_msgSend("void", this, "setTotalCostLimit:", totalCostLimit)
    }

    public open fun countLimit(): Int =
        Native.objc_msgSend("int", this, "countLimit") as Int

    public open fun setCountLimit(countLimit: Int): Unit {
        Native.objc_msgSend("void", this, "setCountLimit:", countLimit)
    }

    public open fun evictsObjectsWithDiscardedContent(): Boolean =
        Native.objc_msgSend("boolean", this, "evictsObjectsWithDiscardedContent") as Boolean

    public open fun setEvictsObjectsWithDiscardedContent(evictsObjectsWithDiscardedContent: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEvictsObjectsWithDiscardedContent:", evictsObjectsWithDiscardedContent)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCache")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
