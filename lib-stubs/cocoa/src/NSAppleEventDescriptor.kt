// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSAppleEventDescriptor.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSAppleEventDescriptor(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    public open fun initWithAEDescNoCopy(aeDesc: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithAEDescNoCopy:", aeDesc) as ObjCObject

    public open fun initWithDescriptorType_bytes_length(descriptorType: Int, bytes: Pointer<Unit>, byteCount: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDescriptorType:bytes:length:", descriptorType, bytes, byteCount) as ObjCObject

    public open fun initWithDescriptorType_data(descriptorType: Int, data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDescriptorType:data:", descriptorType, data) as ObjCObject

    public open fun initWithEventClass_eventID_targetDescriptor_returnID_transactionID(eventClass: Int, eventID: Int, targetDescriptor: NSAppleEventDescriptor, returnID: Short, transactionID: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithEventClass:eventID:targetDescriptor:returnID:transactionID:", eventClass, eventID, targetDescriptor, returnID, transactionID) as ObjCObject

    public open fun initListDescriptor(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initListDescriptor") as ObjCObject

    public open fun initRecordDescriptor(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initRecordDescriptor") as ObjCObject

    public open fun aeDesc(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "aeDesc") as Pointer<Any>

    public open fun descriptorType(): Int =
        Native.objc_msgSend("int", this, "descriptorType") as Int

    public open fun data(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "data") as NSData

    public open fun booleanValue(): Byte =
        Native.objc_msgSend("class objc.Byte", this, "booleanValue") as Byte

    public open fun enumCodeValue(): Int =
        Native.objc_msgSend("int", this, "enumCodeValue") as Int

    public open fun int32Value(): Int =
        Native.objc_msgSend("int", this, "int32Value") as Int

    public open fun typeCodeValue(): Int =
        Native.objc_msgSend("int", this, "typeCodeValue") as Int

    public open fun stringValue(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringValue") as NSString

    public open fun eventClass(): Int =
        Native.objc_msgSend("int", this, "eventClass") as Int

    public open fun eventID(): Int =
        Native.objc_msgSend("int", this, "eventID") as Int

    public open fun returnID(): Short =
        Native.objc_msgSend("short", this, "returnID") as Short

    public open fun transactionID(): Int =
        Native.objc_msgSend("int", this, "transactionID") as Int

    public open fun setParamDescriptor_forKeyword(descriptor: NSAppleEventDescriptor, keyword: Int): Unit {
        Native.objc_msgSend("void", this, "setParamDescriptor:forKeyword:", descriptor, keyword)
    }

    public open fun paramDescriptorForKeyword(keyword: Int): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "paramDescriptorForKeyword:", keyword) as NSAppleEventDescriptor

    public open fun removeParamDescriptorWithKeyword(keyword: Int): Unit {
        Native.objc_msgSend("void", this, "removeParamDescriptorWithKeyword:", keyword)
    }

    public open fun setAttributeDescriptor_forKeyword(descriptor: NSAppleEventDescriptor, keyword: Int): Unit {
        Native.objc_msgSend("void", this, "setAttributeDescriptor:forKeyword:", descriptor, keyword)
    }

    public open fun attributeDescriptorForKeyword(keyword: Int): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "attributeDescriptorForKeyword:", keyword) as NSAppleEventDescriptor

    public open fun numberOfItems(): Int =
        Native.objc_msgSend("int", this, "numberOfItems") as Int

    public open fun insertDescriptor_atIndex(descriptor: NSAppleEventDescriptor, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertDescriptor:atIndex:", descriptor, index)
    }

    public open fun descriptorAtIndex(index: Int): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptorAtIndex:", index) as NSAppleEventDescriptor

    public open fun removeDescriptorAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeDescriptorAtIndex:", index)
    }

    public open fun setDescriptor_forKeyword(descriptor: NSAppleEventDescriptor, keyword: Int): Unit {
        Native.objc_msgSend("void", this, "setDescriptor:forKeyword:", descriptor, keyword)
    }

    public open fun descriptorForKeyword(keyword: Int): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptorForKeyword:", keyword) as NSAppleEventDescriptor

    public open fun removeDescriptorWithKeyword(keyword: Int): Unit {
        Native.objc_msgSend("void", this, "removeDescriptorWithKeyword:", keyword)
    }

    public open fun keywordForDescriptorAtIndex(index: Int): Int =
        Native.objc_msgSend("int", this, "keywordForDescriptorAtIndex:", index) as Int

    public open fun coerceToDescriptorType(descriptorType: Int): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "coerceToDescriptorType:", descriptorType) as NSAppleEventDescriptor

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
        public open fun nullDescriptor(): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "nullDescriptor") as NSAppleEventDescriptor

        public open fun descriptorWithDescriptorType_bytes_length(descriptorType: Int, bytes: Pointer<Unit>, byteCount: Int): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptorWithDescriptorType:bytes:length:", descriptorType, bytes, byteCount) as NSAppleEventDescriptor

        public open fun descriptorWithDescriptorType_data(descriptorType: Int, data: NSData): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptorWithDescriptorType:data:", descriptorType, data) as NSAppleEventDescriptor

        public open fun descriptorWithBoolean(boolean: Byte): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptorWithBoolean:", boolean) as NSAppleEventDescriptor

        public open fun descriptorWithEnumCode(enumerator: Int): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptorWithEnumCode:", enumerator) as NSAppleEventDescriptor

        public open fun descriptorWithInt32(signedInt: Int): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptorWithInt32:", signedInt) as NSAppleEventDescriptor

        public open fun descriptorWithTypeCode(typeCode: Int): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptorWithTypeCode:", typeCode) as NSAppleEventDescriptor

        public open fun descriptorWithString(string: NSString): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptorWithString:", string) as NSAppleEventDescriptor

        public open fun appleEventWithEventClass_eventID_targetDescriptor_returnID_transactionID(eventClass: Int, eventID: Int, targetDescriptor: NSAppleEventDescriptor, returnID: Short, transactionID: Int): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "appleEventWithEventClass:eventID:targetDescriptor:returnID:transactionID:", eventClass, eventID, targetDescriptor, returnID, transactionID) as NSAppleEventDescriptor

        public open fun listDescriptor(): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "listDescriptor") as NSAppleEventDescriptor

        public open fun recordDescriptor(): NSAppleEventDescriptor =
            Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "recordDescriptor") as NSAppleEventDescriptor

    }

    companion object : NSObject(Native.objc_getClass("NSAppleEventDescriptor")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
