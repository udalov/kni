// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSJSONSerialization.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSJSONSerialization(pointer: Long) : NSObject(pointer) {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun isValidJSONObject(obj: ObjCObject): Boolean =
            Native.objc_msgSend("boolean", this, "isValidJSONObject:", obj) as Boolean

        public open fun dataWithJSONObject_options_error(obj: ObjCObject, opt: Any, error: Pointer<NSError>): NSData =
            Native.objc_msgSend("class objc.NSData", this, "dataWithJSONObject:options:error:", obj, opt, error) as NSData

        public open fun JSONObjectWithData_options_error(data: NSData, opt: Any, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "JSONObjectWithData:options:error:", data, opt, error) as ObjCObject

        public open fun writeJSONObject_toStream_options_error(obj: ObjCObject, stream: NSOutputStream, opt: Any, error: Pointer<NSError>): Int =
            Native.objc_msgSend("int", this, "writeJSONObject:toStream:options:error:", obj, stream, opt, error) as Int

        public open fun JSONObjectWithStream_options_error(stream: NSInputStream, opt: Any, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "JSONObjectWithStream:options:error:", stream, opt, error) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSJSONSerialization")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
