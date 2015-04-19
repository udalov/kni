// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSUUID.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSUUID(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithUUIDString(string: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithUUIDString:", string) as ObjCObject

    public open fun initWithUUIDBytes(bytes: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithUUIDBytes:", bytes) as ObjCObject

    public open fun getUUIDBytes(uuid: Any): Unit {
        Native.objc_msgSend("void", this, "getUUIDBytes:", uuid)
    }

    public open fun UUIDString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "UUIDString") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
        public open fun UUID(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "UUID") as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSUUID")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
