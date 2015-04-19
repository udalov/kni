// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSPortCoder.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPortCoder(pointer: Long) : NSCoder(pointer) {
    public open fun isBycopy(): Boolean =
        Native.objc_msgSend("boolean", this, "isBycopy") as Boolean

    public open fun isByref(): Boolean =
        Native.objc_msgSend("boolean", this, "isByref") as Boolean

    public open fun encodePortObject(aport: NSPort): Unit {
        Native.objc_msgSend("void", this, "encodePortObject:", aport)
    }

    public open fun decodePortObject(): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "decodePortObject") as NSPort

    public open fun connection(): NSConnection =
        Native.objc_msgSend("class objc.NSConnection", this, "connection") as NSConnection

    public open fun initWithReceivePort_sendPort_components(rcvPort: NSPort, sndPort: NSPort, comps: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithReceivePort:sendPort:components:", rcvPort, sndPort, comps) as ObjCObject

    public open fun dispatch(): Unit {
        Native.objc_msgSend("void", this, "dispatch")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSCoder.metaclass {
        public open fun portCoderWithReceivePort_sendPort_components(rcvPort: NSPort, sndPort: NSPort, comps: NSArray): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "portCoderWithReceivePort:sendPort:components:", rcvPort, sndPort, comps) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSPortCoder")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSDistributedObjects : IObjCObject {
    public open fun classForPortCoder(): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "classForPortCoder") as ObjCClass

    public open fun replacementObjectForPortCoder(coder: NSPortCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "replacementObjectForPortCoder:", coder) as ObjCObject

    trait metaclass : IObjCObject
}
