// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSKeyedArchiver.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSKeyedArchiverDelegate {
    trait metaclass
}

trait NSKeyedUnarchiverDelegate {
    trait metaclass
}

public open class NSKeyedArchiver(pointer: Long) : NSCoder(pointer) {
    public open fun initForWritingWithMutableData(data: NSMutableData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initForWritingWithMutableData:", data) as ObjCObject

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun outputFormat(): Any =
        Native.objc_msgSend("class objc.Any", this, "outputFormat")

    public open fun setOutputFormat(outputFormat: Any): Unit {
        Native.objc_msgSend("void", this, "setOutputFormat:", outputFormat)
    }

    public open fun finishEncoding(): Unit {
        Native.objc_msgSend("void", this, "finishEncoding")
    }

    public open fun setClassName_forClass(codedName: NSString, cls: ObjCClass): Unit {
        Native.objc_msgSend("void", this, "setClassName:forClass:", codedName, cls)
    }

    public open fun classNameForClass(cls: ObjCClass): NSString =
        Native.objc_msgSend("class objc.NSString", this, "classNameForClass:", cls) as NSString

    override fun encodeObject_forKey(objv: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeObject:forKey:", objv, key)
    }

    override fun encodeConditionalObject_forKey(objv: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeConditionalObject:forKey:", objv, key)
    }

    override fun encodeBool_forKey(boolv: Boolean, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeBool:forKey:", boolv, key)
    }

    override fun encodeInt_forKey(intv: Int, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeInt:forKey:", intv, key)
    }

    override fun encodeInt32_forKey(intv: Int, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeInt32:forKey:", intv, key)
    }

    override fun encodeInt64_forKey(intv: Long, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeInt64:forKey:", intv, key)
    }

    override fun encodeFloat_forKey(realv: Float, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeFloat:forKey:", realv, key)
    }

    override fun encodeDouble_forKey(realv: Double, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeDouble:forKey:", realv, key)
    }

    override fun encodeBytes_length_forKey(bytesp: Pointer<Byte>, lenv: Int, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeBytes:length:forKey:", bytesp, lenv, key)
    }

    public open fun setRequiresSecureCoding(b: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRequiresSecureCoding:", b)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSCoder.metaclass {
        public open fun archivedDataWithRootObject(rootObject: ObjCObject): NSData =
            Native.objc_msgSend("class objc.NSData", this, "archivedDataWithRootObject:", rootObject) as NSData

        public open fun archiveRootObject_toFile(rootObject: ObjCObject, path: NSString): Boolean =
            Native.objc_msgSend("boolean", this, "archiveRootObject:toFile:", rootObject, path) as Boolean

        public open fun setClassName_forClass(codedName: NSString, cls: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "setClassName:forClass:", codedName, cls)
        }

        public open fun classNameForClass(cls: ObjCClass): NSString =
            Native.objc_msgSend("class objc.NSString", this, "classNameForClass:", cls) as NSString

    }

    companion object : NSObject(Native.objc_getClass("NSKeyedArchiver")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSKeyedUnarchiver(pointer: Long) : NSCoder(pointer) {
    public open fun initForReadingWithData(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initForReadingWithData:", data) as ObjCObject

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun finishDecoding(): Unit {
        Native.objc_msgSend("void", this, "finishDecoding")
    }

    public open fun setClass_forClassName(cls: ObjCClass, codedName: NSString): Unit {
        Native.objc_msgSend("void", this, "setClass:forClassName:", cls, codedName)
    }

    public open fun classForClassName(codedName: NSString): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "classForClassName:", codedName) as ObjCClass

    override fun containsValueForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "containsValueForKey:", key) as Boolean

    override fun decodeObjectForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "decodeObjectForKey:", key) as ObjCObject

    override fun decodeBoolForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "decodeBoolForKey:", key) as Boolean

    override fun decodeIntForKey(key: NSString): Int =
        Native.objc_msgSend("int", this, "decodeIntForKey:", key) as Int

    override fun decodeInt32ForKey(key: NSString): Int =
        Native.objc_msgSend("int", this, "decodeInt32ForKey:", key) as Int

    override fun decodeInt64ForKey(key: NSString): Long =
        Native.objc_msgSend("long", this, "decodeInt64ForKey:", key) as Long

    override fun decodeFloatForKey(key: NSString): Float =
        Native.objc_msgSend("float", this, "decodeFloatForKey:", key) as Float

    override fun decodeDoubleForKey(key: NSString): Double =
        Native.objc_msgSend("double", this, "decodeDoubleForKey:", key) as Double

    override fun decodeBytesForKey_returnedLength(key: NSString, lengthp: Pointer<Int>): Pointer<Byte> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "decodeBytesForKey:returnedLength:", key, lengthp) as Pointer<Byte>

    public open fun setRequiresSecureCoding(b: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRequiresSecureCoding:", b)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSCoder.metaclass {
        public open fun unarchiveObjectWithData(data: NSData): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "unarchiveObjectWithData:", data) as ObjCObject

        public open fun unarchiveObjectWithFile(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "unarchiveObjectWithFile:", path) as ObjCObject

        public open fun setClass_forClassName(cls: ObjCClass, codedName: NSString): Unit {
            Native.objc_msgSend("void", this, "setClass:forClassName:", cls, codedName)
        }

        public open fun classForClassName(codedName: NSString): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "classForClassName:", codedName) as ObjCClass

    }

    companion object : NSObject(Native.objc_getClass("NSKeyedUnarchiver")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSKeyedArchiverObjectSubstitution : IObjCObject {
    public open fun classForKeyedArchiver(): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "classForKeyedArchiver") as ObjCClass

    public open fun replacementObjectForKeyedArchiver(archiver: NSKeyedArchiver): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "replacementObjectForKeyedArchiver:", archiver) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun classFallbacksForKeyedArchiver(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "classFallbacksForKeyedArchiver") as NSArray
    }
}

trait NSObject_NSKeyedUnarchiverObjectSubstitution : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun classForKeyedUnarchiver(): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "classForKeyedUnarchiver") as ObjCClass
    }
}
