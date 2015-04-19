// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSData.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSData(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSSecureCoding, NSData_NSExtendedData, NSData_NSDataCreation, NSData_NSDataBase64Encoding, NSData_NSDeprecated {
    public open fun length(): Int =
        Native.objc_msgSend("int", this, "length") as Int

    public open fun bytes(): Pointer<Unit> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "bytes") as Pointer<Unit>

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSSecureCoding.metaclass, NSData_NSExtendedData.metaclass, NSData_NSDataCreation.metaclass, NSData_NSDataBase64Encoding.metaclass, NSData_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSData")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableData(pointer: Long) : NSData(pointer), NSMutableData_NSExtendedMutableData, NSMutableData_NSMutableDataCreation {
    public open fun mutableBytes(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "mutableBytes") as Pointer<*>

    override fun length(): Int =
        Native.objc_msgSend("int", this, "length") as Int

    public open fun setLength(length: Int): Unit {
        Native.objc_msgSend("void", this, "setLength:", length)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSData.metaclass, NSMutableData_NSExtendedMutableData.metaclass, NSMutableData_NSMutableDataCreation.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMutableData")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSPurgeableData(pointer: Long) : NSMutableData(pointer), NSDiscardableContent {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun length(): Int =
        Native.objc_msgSend("int", this, "length") as Int

    trait metaclass : NSMutableData.metaclass, NSDiscardableContent.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPurgeableData")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSData_NSExtendedData : IObjCObject {
    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun getBytes_length(buffer: Pointer<*>, length: Int): Unit {
        Native.objc_msgSend("void", this, "getBytes:length:", buffer, length)
    }

    public open fun getBytes_range(buffer: Pointer<*>, range: Any): Unit {
        Native.objc_msgSend("void", this, "getBytes:range:", buffer, range)
    }

    public open fun isEqualToData(other: NSData): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToData:", other) as Boolean

    public open fun subdataWithRange(range: Any): NSData =
        Native.objc_msgSend("class objc.NSData", this, "subdataWithRange:", range) as NSData

    public open fun writeToFile_atomically(path: NSString, useAuxiliaryFile: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:atomically:", path, useAuxiliaryFile) as Boolean

    public open fun writeToURL_atomically(url: NSURL, atomically: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:atomically:", url, atomically) as Boolean

    public open fun writeToFile_options_error(path: NSString, writeOptionsMask: Any, errorPtr: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:options:error:", path, writeOptionsMask, errorPtr) as Boolean

    public open fun writeToURL_options_error(url: NSURL, writeOptionsMask: Any, errorPtr: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:options:error:", url, writeOptionsMask, errorPtr) as Boolean

    public open fun rangeOfData_options_range(dataToFind: NSData, mask: Any, searchRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfData:options:range:", dataToFind, mask, searchRange)

    public open fun enumerateByteRangesUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateByteRangesUsingBlock:", block)
    }

    trait metaclass : IObjCObject
}

trait NSData_NSDataCreation : IObjCObject {
    public open fun initWithBytes_length(bytes: Pointer<Unit>, length: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBytes:length:", bytes, length) as ObjCObject

    public open fun initWithBytesNoCopy_length(bytes: Pointer<*>, length: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBytesNoCopy:length:", bytes, length) as ObjCObject

    public open fun initWithBytesNoCopy_length_freeWhenDone(bytes: Pointer<*>, length: Int, b: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBytesNoCopy:length:freeWhenDone:", bytes, length, b) as ObjCObject

    public open fun initWithBytesNoCopy_length_deallocator(bytes: Pointer<*>, length: Int, deallocator: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBytesNoCopy:length:deallocator:", bytes, length, deallocator) as ObjCObject

    public open fun initWithContentsOfFile_options_error(path: NSString, readOptionsMask: Any, errorPtr: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfFile:options:error:", path, readOptionsMask, errorPtr) as ObjCObject

    public open fun initWithContentsOfURL_options_error(url: NSURL, readOptionsMask: Any, errorPtr: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:options:error:", url, readOptionsMask, errorPtr) as ObjCObject

    public open fun initWithContentsOfFile(path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfFile:", path) as ObjCObject

    public open fun initWithContentsOfURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:", url) as ObjCObject

    public open fun initWithData(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", data) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun data(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "data") as ObjCObject

        public open fun dataWithBytes_length(bytes: Pointer<Unit>, length: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithBytes:length:", bytes, length) as ObjCObject

        public open fun dataWithBytesNoCopy_length(bytes: Pointer<*>, length: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithBytesNoCopy:length:", bytes, length) as ObjCObject

        public open fun dataWithBytesNoCopy_length_freeWhenDone(bytes: Pointer<*>, length: Int, b: Boolean): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithBytesNoCopy:length:freeWhenDone:", bytes, length, b) as ObjCObject

        public open fun dataWithContentsOfFile_options_error(path: NSString, readOptionsMask: Any, errorPtr: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithContentsOfFile:options:error:", path, readOptionsMask, errorPtr) as ObjCObject

        public open fun dataWithContentsOfURL_options_error(url: NSURL, readOptionsMask: Any, errorPtr: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithContentsOfURL:options:error:", url, readOptionsMask, errorPtr) as ObjCObject

        public open fun dataWithContentsOfFile(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithContentsOfFile:", path) as ObjCObject

        public open fun dataWithContentsOfURL(url: NSURL): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithContentsOfURL:", url) as ObjCObject

        public open fun dataWithData(data: NSData): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithData:", data) as ObjCObject
    }
}

trait NSData_NSDataBase64Encoding : IObjCObject {
    public open fun initWithBase64EncodedString_options(base64String: NSString, options: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBase64EncodedString:options:", base64String, options) as ObjCObject

    public open fun base64EncodedStringWithOptions(options: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "base64EncodedStringWithOptions:", options) as NSString

    public open fun initWithBase64EncodedData_options(base64Data: NSData, options: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBase64EncodedData:options:", base64Data, options) as ObjCObject

    public open fun base64EncodedDataWithOptions(options: Any): NSData =
        Native.objc_msgSend("class objc.NSData", this, "base64EncodedDataWithOptions:", options) as NSData

    trait metaclass : IObjCObject
}

trait NSData_NSDeprecated : IObjCObject {
    public open fun getBytes(buffer: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "getBytes:", buffer)
    }

    public open fun initWithContentsOfMappedFile(path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfMappedFile:", path) as ObjCObject

    public open fun initWithBase64Encoding(base64String: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBase64Encoding:", base64String) as ObjCObject

    public open fun base64Encoding(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "base64Encoding") as NSString

    trait metaclass : IObjCObject {
        public open fun dataWithContentsOfMappedFile(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithContentsOfMappedFile:", path) as ObjCObject
    }
}

trait NSMutableData_NSExtendedMutableData : IObjCObject {
    public open fun appendBytes_length(bytes: Pointer<Unit>, length: Int): Unit {
        Native.objc_msgSend("void", this, "appendBytes:length:", bytes, length)
    }

    public open fun appendData(other: NSData): Unit {
        Native.objc_msgSend("void", this, "appendData:", other)
    }

    public open fun increaseLengthBy(extraLength: Int): Unit {
        Native.objc_msgSend("void", this, "increaseLengthBy:", extraLength)
    }

    public open fun replaceBytesInRange_withBytes(range: Any, bytes: Pointer<Unit>): Unit {
        Native.objc_msgSend("void", this, "replaceBytesInRange:withBytes:", range, bytes)
    }

    public open fun resetBytesInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "resetBytesInRange:", range)
    }

    public open fun setData(data: NSData): Unit {
        Native.objc_msgSend("void", this, "setData:", data)
    }

    public open fun replaceBytesInRange_withBytes_length(range: Any, replacementBytes: Pointer<Unit>, replacementLength: Int): Unit {
        Native.objc_msgSend("void", this, "replaceBytesInRange:withBytes:length:", range, replacementBytes, replacementLength)
    }

    trait metaclass : IObjCObject
}

trait NSMutableData_NSMutableDataCreation : IObjCObject {
    public open fun initWithCapacity(capacity: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCapacity:", capacity) as ObjCObject

    public open fun initWithLength(length: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithLength:", length) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun dataWithCapacity(aNumItems: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithCapacity:", aNumItems) as ObjCObject

        public open fun dataWithLength(length: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataWithLength:", length) as ObjCObject
    }
}
