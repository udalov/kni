// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPrinter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPrinter(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSPrinter_NSDeprecated {
    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun type(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "type") as NSString

    public open fun languageLevel(): Int =
        Native.objc_msgSend("int", this, "languageLevel") as Int

    public open fun pageSizeForPaper(paperName: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "pageSizeForPaper:", paperName)

    public open fun deviceDescription(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "deviceDescription") as NSDictionary

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSPrinter_NSDeprecated.metaclass {
        public open fun printerNames(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "printerNames") as NSArray

        public open fun printerTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "printerTypes") as NSArray

        public open fun printerWithName(name: NSString): NSPrinter =
            Native.objc_msgSend("class objc.NSPrinter", this, "printerWithName:", name) as NSPrinter

        public open fun printerWithType(type: NSString): NSPrinter =
            Native.objc_msgSend("class objc.NSPrinter", this, "printerWithType:", type) as NSPrinter

    }

    companion object : NSObject(Native.objc_getClass("NSPrinter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSPrinter_NSDeprecated : IObjCObject {
    public open fun statusForTable(tableName: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "statusForTable:", tableName)

    public open fun isKey_inTable(key: NSString, table: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isKey:inTable:", key, table) as Boolean

    public open fun booleanForKey_inTable(key: NSString, table: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "booleanForKey:inTable:", key, table) as Boolean

    public open fun floatForKey_inTable(key: NSString, table: NSString): Float =
        Native.objc_msgSend("float", this, "floatForKey:inTable:", key, table) as Float

    public open fun intForKey_inTable(key: NSString, table: NSString): Int =
        Native.objc_msgSend("int", this, "intForKey:inTable:", key, table) as Int

    public open fun rectForKey_inTable(key: NSString, table: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "rectForKey:inTable:", key, table)

    public open fun sizeForKey_inTable(key: NSString, table: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "sizeForKey:inTable:", key, table)

    public open fun stringForKey_inTable(key: NSString, table: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringForKey:inTable:", key, table) as NSString

    public open fun stringListForKey_inTable(key: NSString, table: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "stringListForKey:inTable:", key, table) as NSArray

    public open fun imageRectForPaper(paperName: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "imageRectForPaper:", paperName)

    public open fun acceptsBinary(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsBinary") as Boolean

    public open fun isColor(): Boolean =
        Native.objc_msgSend("boolean", this, "isColor") as Boolean

    public open fun isFontAvailable(faceName: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isFontAvailable:", faceName) as Boolean

    public open fun isOutputStackInReverseOrder(): Boolean =
        Native.objc_msgSend("boolean", this, "isOutputStackInReverseOrder") as Boolean

    public open fun domain(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "domain") as NSString

    public open fun host(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "host") as NSString

    public open fun note(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "note") as NSString

    trait metaclass : IObjCObject {
        public open fun printerWithName_domain_includeUnavailable(name: NSString, domain: NSString, flag: Boolean): NSPrinter =
            Native.objc_msgSend("class objc.NSPrinter", this, "printerWithName:domain:includeUnavailable:", name, domain, flag) as NSPrinter
    }
}
