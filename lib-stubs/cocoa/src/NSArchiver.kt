// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSArchiver.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSArchiver(pointer: Long) : NSCoder(pointer) {
    public open fun initForWritingWithMutableData(mdata: NSMutableData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initForWritingWithMutableData:", mdata) as ObjCObject

    public open fun archiverData(): NSMutableData =
        Native.objc_msgSend("class objc.NSMutableData", this, "archiverData") as NSMutableData

    override fun encodeRootObject(rootObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "encodeRootObject:", rootObject)
    }

    override fun encodeConditionalObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "encodeConditionalObject:", `object`)
    }

    public open fun encodeClassName_intoClassName(trueName: NSString, inArchiveName: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeClassName:intoClassName:", trueName, inArchiveName)
    }

    public open fun classNameEncodedForTrueClassName(trueName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "classNameEncodedForTrueClassName:", trueName) as NSString

    public open fun replaceObject_withObject(`object`: ObjCObject, newObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "replaceObject:withObject:", `object`, newObject)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSCoder.metaclass {
        public open fun archivedDataWithRootObject(rootObject: ObjCObject): NSData =
            Native.objc_msgSend("class objc.NSData", this, "archivedDataWithRootObject:", rootObject) as NSData

        public open fun archiveRootObject_toFile(rootObject: ObjCObject, path: NSString): Boolean =
            Native.objc_msgSend("boolean", this, "archiveRootObject:toFile:", rootObject, path) as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSArchiver")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSUnarchiver(pointer: Long) : NSCoder(pointer) {
    public open fun initForReadingWithData(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initForReadingWithData:", data) as ObjCObject

    override fun setObjectZone(zone: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "setObjectZone:", zone)
    }

    override fun objectZone(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "objectZone") as Pointer<Any>

    public open fun isAtEnd(): Boolean =
        Native.objc_msgSend("boolean", this, "isAtEnd") as Boolean

    override fun systemVersion(): Int =
        Native.objc_msgSend("int", this, "systemVersion") as Int

    public open fun decodeClassName_asClassName(inArchiveName: NSString, trueName: NSString): Unit {
        Native.objc_msgSend("void", this, "decodeClassName:asClassName:", inArchiveName, trueName)
    }

    public open fun classNameDecodedForArchiveClassName(inArchiveName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "classNameDecodedForArchiveClassName:", inArchiveName) as NSString

    public open fun replaceObject_withObject(`object`: ObjCObject, newObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "replaceObject:withObject:", `object`, newObject)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSCoder.metaclass {
        public open fun unarchiveObjectWithData(data: NSData): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "unarchiveObjectWithData:", data) as ObjCObject

        public open fun unarchiveObjectWithFile(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "unarchiveObjectWithFile:", path) as ObjCObject

        public open fun decodeClassName_asClassName(inArchiveName: NSString, trueName: NSString): Unit {
            Native.objc_msgSend("void", this, "decodeClassName:asClassName:", inArchiveName, trueName)
        }

        public open fun classNameDecodedForArchiveClassName(inArchiveName: NSString): NSString =
            Native.objc_msgSend("class objc.NSString", this, "classNameDecodedForArchiveClassName:", inArchiveName) as NSString

    }

    companion object : NSObject(Native.objc_getClass("NSUnarchiver")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSArchiverCallback : IObjCObject {
    public open fun classForArchiver(): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "classForArchiver") as ObjCClass

    public open fun replacementObjectForArchiver(archiver: NSArchiver): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "replacementObjectForArchiver:", archiver) as ObjCObject

    trait metaclass : IObjCObject
}
