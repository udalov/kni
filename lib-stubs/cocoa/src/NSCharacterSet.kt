// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSCharacterSet.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCharacterSet(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSCoding, NSCharacterSet_NSURLUtilities {
    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    public open fun characterIsMember(aCharacter: Short): Boolean =
        Native.objc_msgSend("boolean", this, "characterIsMember:", aCharacter) as Boolean

    public open fun bitmapRepresentation(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "bitmapRepresentation") as NSData

    public open fun invertedSet(): NSCharacterSet =
        Native.objc_msgSend("class objc.NSCharacterSet", this, "invertedSet") as NSCharacterSet

    public open fun longCharacterIsMember(theLongChar: Int): Boolean =
        Native.objc_msgSend("boolean", this, "longCharacterIsMember:", theLongChar) as Boolean

    public open fun isSupersetOfSet(theOtherSet: NSCharacterSet): Boolean =
        Native.objc_msgSend("boolean", this, "isSupersetOfSet:", theOtherSet) as Boolean

    public open fun hasMemberInPlane(thePlane: Byte): Boolean =
        Native.objc_msgSend("boolean", this, "hasMemberInPlane:", thePlane) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSCoding.metaclass, NSCharacterSet_NSURLUtilities.metaclass {
        public open fun controlCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "controlCharacterSet") as NSCharacterSet

        public open fun whitespaceCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "whitespaceCharacterSet") as NSCharacterSet

        public open fun whitespaceAndNewlineCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "whitespaceAndNewlineCharacterSet") as NSCharacterSet

        public open fun decimalDigitCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "decimalDigitCharacterSet") as NSCharacterSet

        public open fun letterCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "letterCharacterSet") as NSCharacterSet

        public open fun lowercaseLetterCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "lowercaseLetterCharacterSet") as NSCharacterSet

        public open fun uppercaseLetterCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "uppercaseLetterCharacterSet") as NSCharacterSet

        public open fun nonBaseCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "nonBaseCharacterSet") as NSCharacterSet

        public open fun alphanumericCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "alphanumericCharacterSet") as NSCharacterSet

        public open fun decomposableCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "decomposableCharacterSet") as NSCharacterSet

        public open fun illegalCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "illegalCharacterSet") as NSCharacterSet

        public open fun punctuationCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "punctuationCharacterSet") as NSCharacterSet

        public open fun capitalizedLetterCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "capitalizedLetterCharacterSet") as NSCharacterSet

        public open fun symbolCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "symbolCharacterSet") as NSCharacterSet

        public open fun newlineCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "newlineCharacterSet") as NSCharacterSet

        public open fun characterSetWithRange(aRange: Any): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "characterSetWithRange:", aRange) as NSCharacterSet

        public open fun characterSetWithCharactersInString(aString: NSString): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "characterSetWithCharactersInString:", aString) as NSCharacterSet

        public open fun characterSetWithBitmapRepresentation(data: NSData): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "characterSetWithBitmapRepresentation:", data) as NSCharacterSet

        public open fun characterSetWithContentsOfFile(fName: NSString): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "characterSetWithContentsOfFile:", fName) as NSCharacterSet

    }

    companion object : NSObject(Native.objc_getClass("NSCharacterSet")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableCharacterSet(pointer: Long) : NSCharacterSet(pointer), NSCopying, NSMutableCopying {
    public open fun addCharactersInRange(aRange: Any): Unit {
        Native.objc_msgSend("void", this, "addCharactersInRange:", aRange)
    }

    public open fun removeCharactersInRange(aRange: Any): Unit {
        Native.objc_msgSend("void", this, "removeCharactersInRange:", aRange)
    }

    public open fun addCharactersInString(aString: NSString): Unit {
        Native.objc_msgSend("void", this, "addCharactersInString:", aString)
    }

    public open fun removeCharactersInString(aString: NSString): Unit {
        Native.objc_msgSend("void", this, "removeCharactersInString:", aString)
    }

    public open fun formUnionWithCharacterSet(otherSet: NSCharacterSet): Unit {
        Native.objc_msgSend("void", this, "formUnionWithCharacterSet:", otherSet)
    }

    public open fun formIntersectionWithCharacterSet(otherSet: NSCharacterSet): Unit {
        Native.objc_msgSend("void", this, "formIntersectionWithCharacterSet:", otherSet)
    }

    public open fun invert(): Unit {
        Native.objc_msgSend("void", this, "invert")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSCharacterSet.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass {
        override fun controlCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "controlCharacterSet") as NSMutableCharacterSet

        override fun whitespaceCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "whitespaceCharacterSet") as NSMutableCharacterSet

        override fun whitespaceAndNewlineCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "whitespaceAndNewlineCharacterSet") as NSMutableCharacterSet

        override fun decimalDigitCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "decimalDigitCharacterSet") as NSMutableCharacterSet

        override fun letterCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "letterCharacterSet") as NSMutableCharacterSet

        override fun lowercaseLetterCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "lowercaseLetterCharacterSet") as NSMutableCharacterSet

        override fun uppercaseLetterCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "uppercaseLetterCharacterSet") as NSMutableCharacterSet

        override fun nonBaseCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "nonBaseCharacterSet") as NSMutableCharacterSet

        override fun alphanumericCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "alphanumericCharacterSet") as NSMutableCharacterSet

        override fun decomposableCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "decomposableCharacterSet") as NSMutableCharacterSet

        override fun illegalCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "illegalCharacterSet") as NSMutableCharacterSet

        override fun punctuationCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "punctuationCharacterSet") as NSMutableCharacterSet

        override fun capitalizedLetterCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "capitalizedLetterCharacterSet") as NSMutableCharacterSet

        override fun symbolCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "symbolCharacterSet") as NSMutableCharacterSet

        override fun newlineCharacterSet(): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "newlineCharacterSet") as NSMutableCharacterSet

        override fun characterSetWithRange(aRange: Any): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "characterSetWithRange:", aRange) as NSMutableCharacterSet

        override fun characterSetWithCharactersInString(aString: NSString): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "characterSetWithCharactersInString:", aString) as NSMutableCharacterSet

        override fun characterSetWithBitmapRepresentation(data: NSData): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "characterSetWithBitmapRepresentation:", data) as NSMutableCharacterSet

        override fun characterSetWithContentsOfFile(fName: NSString): NSMutableCharacterSet =
            Native.objc_msgSend("class objc.NSMutableCharacterSet", this, "characterSetWithContentsOfFile:", fName) as NSMutableCharacterSet

    }

    companion object : NSObject(Native.objc_getClass("NSMutableCharacterSet")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
