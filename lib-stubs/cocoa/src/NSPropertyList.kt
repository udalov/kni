// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSPropertyList.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPropertyListSerialization(pointer: Long) : NSObject(pointer) {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun propertyList_isValidForFormat(plist: ObjCObject, format: Any): Boolean =
            Native.objc_msgSend("boolean", this, "propertyList:isValidForFormat:", plist, format) as Boolean

        public open fun dataWithPropertyList_format_options_error(plist: ObjCObject, format: Any, opt: Int, error: Pointer<NSError>): NSData =
            Native.objc_msgSend("class objc.NSData", this, "dataWithPropertyList:format:options:error:", plist, format, opt, error) as NSData

        public open fun writePropertyList_toStream_format_options_error(plist: ObjCObject, stream: NSOutputStream, format: Any, opt: Int, error: Pointer<NSError>): Int =
            Native.objc_msgSend("int", this, "writePropertyList:toStream:format:options:error:", plist, stream, format, opt, error) as Int

        public open fun propertyListWithData_options_format_error(data: NSData, opt: Int, format: Pointer<Any>, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyListWithData:options:format:error:", data, opt, format, error) as ObjCObject

        public open fun propertyListWithStream_options_format_error(stream: NSInputStream, opt: Int, format: Pointer<Any>, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyListWithStream:options:format:error:", stream, opt, format, error) as ObjCObject

        public open fun dataFromPropertyList_format_errorDescription(plist: ObjCObject, format: Any, errorString: Pointer<NSString>): NSData =
            Native.objc_msgSend("class objc.NSData", this, "dataFromPropertyList:format:errorDescription:", plist, format, errorString) as NSData

        public open fun propertyListFromData_mutabilityOption_format_errorDescription(data: NSData, opt: Any, format: Pointer<Any>, errorString: Pointer<NSString>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyListFromData:mutabilityOption:format:errorDescription:", data, opt, format, errorString) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSPropertyListSerialization")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
