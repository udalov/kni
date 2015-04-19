// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScanner.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScanner(pointer: Long) : NSObject(pointer), NSCopying, NSScanner_NSExtendedScanner, NSScanner_NSDecimalNumberScanning {
    public open fun string(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "string") as NSString

    public open fun scanLocation(): Int =
        Native.objc_msgSend("int", this, "scanLocation") as Int

    public open fun setScanLocation(scanLocation: Int): Unit {
        Native.objc_msgSend("void", this, "setScanLocation:", scanLocation)
    }

    public open fun charactersToBeSkipped(): NSCharacterSet =
        Native.objc_msgSend("class objc.NSCharacterSet", this, "charactersToBeSkipped") as NSCharacterSet

    public open fun setCharactersToBeSkipped(charactersToBeSkipped: NSCharacterSet): Unit {
        Native.objc_msgSend("void", this, "setCharactersToBeSkipped:", charactersToBeSkipped)
    }

    public open fun caseSensitive(): Boolean =
        Native.objc_msgSend("boolean", this, "caseSensitive") as Boolean

    public open fun setCaseSensitive(caseSensitive: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCaseSensitive:", caseSensitive)
    }

    public open fun locale(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "locale") as ObjCObject

    public open fun setLocale(locale: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setLocale:", locale)
    }

    public open fun initWithString(string: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:", string) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSScanner_NSExtendedScanner.metaclass, NSScanner_NSDecimalNumberScanning.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSScanner")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSScanner_NSExtendedScanner : IObjCObject {
    public open fun scanInt(result: Pointer<Int>): Boolean =
        Native.objc_msgSend("boolean", this, "scanInt:", result) as Boolean

    public open fun scanInteger(result: Pointer<Int>): Boolean =
        Native.objc_msgSend("boolean", this, "scanInteger:", result) as Boolean

    public open fun scanLongLong(result: Pointer<Long>): Boolean =
        Native.objc_msgSend("boolean", this, "scanLongLong:", result) as Boolean

    public open fun scanUnsignedLongLong(result: Pointer<Long>): Boolean =
        Native.objc_msgSend("boolean", this, "scanUnsignedLongLong:", result) as Boolean

    public open fun scanFloat(result: Pointer<Float>): Boolean =
        Native.objc_msgSend("boolean", this, "scanFloat:", result) as Boolean

    public open fun scanDouble(result: Pointer<Double>): Boolean =
        Native.objc_msgSend("boolean", this, "scanDouble:", result) as Boolean

    public open fun scanHexInt(result: Pointer<Int>): Boolean =
        Native.objc_msgSend("boolean", this, "scanHexInt:", result) as Boolean

    public open fun scanHexLongLong(result: Pointer<Long>): Boolean =
        Native.objc_msgSend("boolean", this, "scanHexLongLong:", result) as Boolean

    public open fun scanHexFloat(result: Pointer<Float>): Boolean =
        Native.objc_msgSend("boolean", this, "scanHexFloat:", result) as Boolean

    public open fun scanHexDouble(result: Pointer<Double>): Boolean =
        Native.objc_msgSend("boolean", this, "scanHexDouble:", result) as Boolean

    public open fun scanString_intoString(string: NSString, result: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "scanString:intoString:", string, result) as Boolean

    public open fun scanCharactersFromSet_intoString(set: NSCharacterSet, result: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "scanCharactersFromSet:intoString:", set, result) as Boolean

    public open fun scanUpToString_intoString(string: NSString, result: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "scanUpToString:intoString:", string, result) as Boolean

    public open fun scanUpToCharactersFromSet_intoString(set: NSCharacterSet, result: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "scanUpToCharactersFromSet:intoString:", set, result) as Boolean

    public open fun isAtEnd(): Boolean =
        Native.objc_msgSend("boolean", this, "isAtEnd") as Boolean

    trait metaclass : IObjCObject {
        public open fun scannerWithString(string: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "scannerWithString:", string) as ObjCObject

        public open fun localizedScannerWithString(string: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "localizedScannerWithString:", string) as ObjCObject
    }
}
