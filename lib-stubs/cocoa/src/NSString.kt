// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSString.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSString(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSSecureCoding, NSString_NSStringExtensionMethods, NSString_NSStringEncodingDetection, NSString_NSExtendedStringPropertyListParsing, NSString_NSStringDeprecated, NSString_NSStringPathExtensions, NSString_NSURLUtilities, NSString_NSLinguisticAnalysis, NSString_NSPasteboardSupport, NSString_NSStringDrawing, NSString_NSExtendedStringDrawing {
    public open fun length(): Int =
        Native.objc_msgSend("int", this, "length") as Int

    public open fun characterAtIndex(index: Int): Short =
        Native.objc_msgSend("short", this, "characterAtIndex:", index) as Short

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSSecureCoding.metaclass, NSString_NSStringExtensionMethods.metaclass, NSString_NSStringEncodingDetection.metaclass, NSString_NSExtendedStringPropertyListParsing.metaclass, NSString_NSStringDeprecated.metaclass, NSString_NSStringPathExtensions.metaclass, NSString_NSURLUtilities.metaclass, NSString_NSLinguisticAnalysis.metaclass, NSString_NSPasteboardSupport.metaclass, NSString_NSStringDrawing.metaclass, NSString_NSExtendedStringDrawing.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSString")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableString(pointer: Long) : NSString(pointer), NSMutableString_NSMutableStringExtensionMethods {
    public open fun replaceCharactersInRange_withString(range: Any, aString: NSString): Unit {
        Native.objc_msgSend("void", this, "replaceCharactersInRange:withString:", range, aString)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSString.metaclass, NSMutableString_NSMutableStringExtensionMethods.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMutableString")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSSimpleCString(pointer: Long) : NSString(pointer) {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSString.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSimpleCString")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSConstantString(pointer: Long) : NSSimpleCString(pointer) {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSSimpleCString.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSConstantString")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSString_NSStringExtensionMethods : IObjCObject {
    public open fun getCharacters_range(buffer: Pointer<Short>, aRange: Any): Unit {
        Native.objc_msgSend("void", this, "getCharacters:range:", buffer, aRange)
    }

    public open fun substringFromIndex(from: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "substringFromIndex:", from) as NSString

    public open fun substringToIndex(to: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "substringToIndex:", to) as NSString

    public open fun substringWithRange(range: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "substringWithRange:", range) as NSString

    public open fun compare(string: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "compare:", string)

    public open fun compare_options(string: NSString, mask: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "compare:options:", string, mask)

    public open fun compare_options_range(string: NSString, mask: Any, compareRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "compare:options:range:", string, mask, compareRange)

    public open fun compare_options_range_locale(string: NSString, mask: Any, compareRange: Any, locale: ObjCObject): Any =
        Native.objc_msgSend("class objc.Any", this, "compare:options:range:locale:", string, mask, compareRange, locale)

    public open fun caseInsensitiveCompare(string: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "caseInsensitiveCompare:", string)

    public open fun localizedCompare(string: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "localizedCompare:", string)

    public open fun localizedCaseInsensitiveCompare(string: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "localizedCaseInsensitiveCompare:", string)

    public open fun localizedStandardCompare(string: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "localizedStandardCompare:", string)

    public open fun isEqualToString(aString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToString:", aString) as Boolean

    public open fun hasPrefix(aString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "hasPrefix:", aString) as Boolean

    public open fun hasSuffix(aString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "hasSuffix:", aString) as Boolean

    public open fun containsString(aString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "containsString:", aString) as Boolean

    public open fun localizedCaseInsensitiveContainsString(aString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "localizedCaseInsensitiveContainsString:", aString) as Boolean

    public open fun rangeOfString(aString: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfString:", aString)

    public open fun rangeOfString_options(aString: NSString, mask: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfString:options:", aString, mask)

    public open fun rangeOfString_options_range(aString: NSString, mask: Any, searchRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfString:options:range:", aString, mask, searchRange)

    public open fun rangeOfString_options_range_locale(aString: NSString, mask: Any, searchRange: Any, locale: NSLocale): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfString:options:range:locale:", aString, mask, searchRange, locale)

    public open fun rangeOfCharacterFromSet(aSet: NSCharacterSet): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfCharacterFromSet:", aSet)

    public open fun rangeOfCharacterFromSet_options(aSet: NSCharacterSet, mask: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfCharacterFromSet:options:", aSet, mask)

    public open fun rangeOfCharacterFromSet_options_range(aSet: NSCharacterSet, mask: Any, searchRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfCharacterFromSet:options:range:", aSet, mask, searchRange)

    public open fun rangeOfComposedCharacterSequenceAtIndex(index: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfComposedCharacterSequenceAtIndex:", index)

    public open fun rangeOfComposedCharacterSequencesForRange(range: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfComposedCharacterSequencesForRange:", range)

    public open fun stringByAppendingString(aString: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByAppendingString:", aString) as NSString

    public open fun stringByAppendingFormat(format: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByAppendingFormat:", format) as NSString

    public open fun doubleValue(): Double =
        Native.objc_msgSend("double", this, "doubleValue") as Double

    public open fun floatValue(): Float =
        Native.objc_msgSend("float", this, "floatValue") as Float

    public open fun intValue(): Int =
        Native.objc_msgSend("int", this, "intValue") as Int

    public open fun integerValue(): Int =
        Native.objc_msgSend("int", this, "integerValue") as Int

    public open fun longLongValue(): Long =
        Native.objc_msgSend("long", this, "longLongValue") as Long

    public open fun boolValue(): Boolean =
        Native.objc_msgSend("boolean", this, "boolValue") as Boolean

    public open fun componentsSeparatedByString(separator: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "componentsSeparatedByString:", separator) as NSArray

    public open fun componentsSeparatedByCharactersInSet(separator: NSCharacterSet): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "componentsSeparatedByCharactersInSet:", separator) as NSArray

    public open fun commonPrefixWithString_options(aString: NSString, mask: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "commonPrefixWithString:options:", aString, mask) as NSString

    public open fun uppercaseString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "uppercaseString") as NSString

    public open fun lowercaseString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "lowercaseString") as NSString

    public open fun capitalizedString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "capitalizedString") as NSString

    public open fun uppercaseStringWithLocale(locale: NSLocale): NSString =
        Native.objc_msgSend("class objc.NSString", this, "uppercaseStringWithLocale:", locale) as NSString

    public open fun lowercaseStringWithLocale(locale: NSLocale): NSString =
        Native.objc_msgSend("class objc.NSString", this, "lowercaseStringWithLocale:", locale) as NSString

    public open fun capitalizedStringWithLocale(locale: NSLocale): NSString =
        Native.objc_msgSend("class objc.NSString", this, "capitalizedStringWithLocale:", locale) as NSString

    public open fun stringByTrimmingCharactersInSet(set: NSCharacterSet): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByTrimmingCharactersInSet:", set) as NSString

    public open fun stringByPaddingToLength_withString_startingAtIndex(newLength: Int, padString: NSString, padIndex: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByPaddingToLength:withString:startingAtIndex:", newLength, padString, padIndex) as NSString

    public open fun getLineStart_end_contentsEnd_forRange(startPtr: Pointer<Int>, lineEndPtr: Pointer<Int>, contentsEndPtr: Pointer<Int>, range: Any): Unit {
        Native.objc_msgSend("void", this, "getLineStart:end:contentsEnd:forRange:", startPtr, lineEndPtr, contentsEndPtr, range)
    }

    public open fun lineRangeForRange(range: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "lineRangeForRange:", range)

    public open fun getParagraphStart_end_contentsEnd_forRange(startPtr: Pointer<Int>, parEndPtr: Pointer<Int>, contentsEndPtr: Pointer<Int>, range: Any): Unit {
        Native.objc_msgSend("void", this, "getParagraphStart:end:contentsEnd:forRange:", startPtr, parEndPtr, contentsEndPtr, range)
    }

    public open fun paragraphRangeForRange(range: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "paragraphRangeForRange:", range)

    public open fun enumerateSubstringsInRange_options_usingBlock(range: Any, opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateSubstringsInRange:options:usingBlock:", range, opts, block)
    }

    public open fun enumerateLinesUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateLinesUsingBlock:", block)
    }

    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun hash(): Int =
        Native.objc_msgSend("int", this, "hash") as Int

    public open fun fastestEncoding(): Int =
        Native.objc_msgSend("int", this, "fastestEncoding") as Int

    public open fun smallestEncoding(): Int =
        Native.objc_msgSend("int", this, "smallestEncoding") as Int

    public open fun dataUsingEncoding_allowLossyConversion(encoding: Int, lossy: Boolean): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataUsingEncoding:allowLossyConversion:", encoding, lossy) as NSData

    public open fun dataUsingEncoding(encoding: Int): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataUsingEncoding:", encoding) as NSData

    public open fun canBeConvertedToEncoding(encoding: Int): Boolean =
        Native.objc_msgSend("boolean", this, "canBeConvertedToEncoding:", encoding) as Boolean

    public open fun cStringUsingEncoding(encoding: Int): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "cStringUsingEncoding:", encoding) as Pointer<Char>

    public open fun getCString_maxLength_encoding(buffer: Pointer<Char>, maxBufferCount: Int, encoding: Int): Boolean =
        Native.objc_msgSend("boolean", this, "getCString:maxLength:encoding:", buffer, maxBufferCount, encoding) as Boolean

    public open fun getBytes_maxLength_usedLength_encoding_options_range_remainingRange(buffer: Pointer<*>, maxBufferCount: Int, usedBufferCount: Pointer<Int>, encoding: Int, options: Any, range: Any, leftover: Pointer<Any>): Boolean =
        Native.objc_msgSend("boolean", this, "getBytes:maxLength:usedLength:encoding:options:range:remainingRange:", buffer, maxBufferCount, usedBufferCount, encoding, options, range, leftover) as Boolean

    public open fun maximumLengthOfBytesUsingEncoding(enc: Int): Int =
        Native.objc_msgSend("int", this, "maximumLengthOfBytesUsingEncoding:", enc) as Int

    public open fun lengthOfBytesUsingEncoding(enc: Int): Int =
        Native.objc_msgSend("int", this, "lengthOfBytesUsingEncoding:", enc) as Int

    public open fun decomposedStringWithCanonicalMapping(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "decomposedStringWithCanonicalMapping") as NSString

    public open fun precomposedStringWithCanonicalMapping(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "precomposedStringWithCanonicalMapping") as NSString

    public open fun decomposedStringWithCompatibilityMapping(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "decomposedStringWithCompatibilityMapping") as NSString

    public open fun precomposedStringWithCompatibilityMapping(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "precomposedStringWithCompatibilityMapping") as NSString

    public open fun stringByFoldingWithOptions_locale(options: Any, locale: NSLocale): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByFoldingWithOptions:locale:", options, locale) as NSString

    public open fun stringByReplacingOccurrencesOfString_withString_options_range(target: NSString, replacement: NSString, options: Any, searchRange: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByReplacingOccurrencesOfString:withString:options:range:", target, replacement, options, searchRange) as NSString

    public open fun stringByReplacingOccurrencesOfString_withString(target: NSString, replacement: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByReplacingOccurrencesOfString:withString:", target, replacement) as NSString

    public open fun stringByReplacingCharactersInRange_withString(range: Any, replacement: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByReplacingCharactersInRange:withString:", range, replacement) as NSString

    public open fun UTF8String(): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "UTF8String") as Pointer<Char>

    public open fun initWithCharactersNoCopy_length_freeWhenDone(characters: Pointer<Short>, length: Int, freeBuffer: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCharactersNoCopy:length:freeWhenDone:", characters, length, freeBuffer) as ObjCObject

    public open fun initWithCharacters_length(characters: Pointer<Short>, length: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCharacters:length:", characters, length) as ObjCObject

    public open fun initWithUTF8String(nullTerminatedCString: Pointer<Char>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithUTF8String:", nullTerminatedCString) as ObjCObject

    public open fun initWithString(aString: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:", aString) as ObjCObject

    public open fun initWithFormat(format: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFormat:", format) as ObjCObject

    public open fun initWithFormat_arguments(format: NSString, argList: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFormat:arguments:", format, argList) as ObjCObject

    public open fun initWithFormat_locale(format: NSString, locale: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFormat:locale:", format, locale) as ObjCObject

    public open fun initWithFormat_locale_arguments(format: NSString, locale: ObjCObject, argList: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFormat:locale:arguments:", format, locale, argList) as ObjCObject

    public open fun initWithData_encoding(data: NSData, encoding: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:encoding:", data, encoding) as ObjCObject

    public open fun initWithBytes_length_encoding(bytes: Pointer<Unit>, len: Int, encoding: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBytes:length:encoding:", bytes, len, encoding) as ObjCObject

    public open fun initWithBytesNoCopy_length_encoding_freeWhenDone(bytes: Pointer<*>, len: Int, encoding: Int, freeBuffer: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBytesNoCopy:length:encoding:freeWhenDone:", bytes, len, encoding, freeBuffer) as ObjCObject

    public open fun initWithCString_encoding(nullTerminatedCString: Pointer<Char>, encoding: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCString:encoding:", nullTerminatedCString, encoding) as ObjCObject

    public open fun initWithContentsOfURL_encoding_error(url: NSURL, enc: Int, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:encoding:error:", url, enc, error) as ObjCObject

    public open fun initWithContentsOfFile_encoding_error(path: NSString, enc: Int, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfFile:encoding:error:", path, enc, error) as ObjCObject

    public open fun initWithContentsOfURL_usedEncoding_error(url: NSURL, enc: Pointer<Int>, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:usedEncoding:error:", url, enc, error) as ObjCObject

    public open fun initWithContentsOfFile_usedEncoding_error(path: NSString, enc: Pointer<Int>, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfFile:usedEncoding:error:", path, enc, error) as ObjCObject

    public open fun writeToURL_atomically_encoding_error(url: NSURL, useAuxiliaryFile: Boolean, enc: Int, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:atomically:encoding:error:", url, useAuxiliaryFile, enc, error) as Boolean

    public open fun writeToFile_atomically_encoding_error(path: NSString, useAuxiliaryFile: Boolean, enc: Int, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:atomically:encoding:error:", path, useAuxiliaryFile, enc, error) as Boolean

    trait metaclass : IObjCObject {
        public open fun defaultCStringEncoding(): Int =
            Native.objc_msgSend("int", this, "defaultCStringEncoding") as Int

        public open fun availableStringEncodings(): Pointer<Int> =
            Native.objc_msgSend("class kni.objc.Pointer", this, "availableStringEncodings") as Pointer<Int>

        public open fun localizedNameOfStringEncoding(encoding: Int): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localizedNameOfStringEncoding:", encoding) as NSString

        public open fun string(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "string") as ObjCObject

        public open fun stringWithString(string: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithString:", string) as ObjCObject

        public open fun stringWithCharacters_length(characters: Pointer<Short>, length: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithCharacters:length:", characters, length) as ObjCObject

        public open fun stringWithUTF8String(nullTerminatedCString: Pointer<Char>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithUTF8String:", nullTerminatedCString) as ObjCObject

        public open fun stringWithFormat(format: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithFormat:", format) as ObjCObject

        public open fun localizedStringWithFormat(format: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "localizedStringWithFormat:", format) as ObjCObject

        public open fun stringWithCString_encoding(cString: Pointer<Char>, enc: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithCString:encoding:", cString, enc) as ObjCObject

        public open fun stringWithContentsOfURL_encoding_error(url: NSURL, enc: Int, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithContentsOfURL:encoding:error:", url, enc, error) as ObjCObject

        public open fun stringWithContentsOfFile_encoding_error(path: NSString, enc: Int, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithContentsOfFile:encoding:error:", path, enc, error) as ObjCObject

        public open fun stringWithContentsOfURL_usedEncoding_error(url: NSURL, enc: Pointer<Int>, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithContentsOfURL:usedEncoding:error:", url, enc, error) as ObjCObject

        public open fun stringWithContentsOfFile_usedEncoding_error(path: NSString, enc: Pointer<Int>, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithContentsOfFile:usedEncoding:error:", path, enc, error) as ObjCObject
    }
}

trait NSMutableString_NSMutableStringExtensionMethods : IObjCObject {
    public open fun insertString_atIndex(aString: NSString, loc: Int): Unit {
        Native.objc_msgSend("void", this, "insertString:atIndex:", aString, loc)
    }

    public open fun deleteCharactersInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "deleteCharactersInRange:", range)
    }

    public open fun appendString(aString: NSString): Unit {
        Native.objc_msgSend("void", this, "appendString:", aString)
    }

    public open fun appendFormat(format: NSString): Unit {
        Native.objc_msgSend("void", this, "appendFormat:", format)
    }

    public open fun setString(aString: NSString): Unit {
        Native.objc_msgSend("void", this, "setString:", aString)
    }

    public open fun initWithCapacity(capacity: Int): NSMutableString =
        Native.objc_msgSend("class objc.NSMutableString", this, "initWithCapacity:", capacity) as NSMutableString

    public open fun replaceOccurrencesOfString_withString_options_range(target: NSString, replacement: NSString, options: Any, searchRange: Any): Int =
        Native.objc_msgSend("int", this, "replaceOccurrencesOfString:withString:options:range:", target, replacement, options, searchRange) as Int

    trait metaclass : IObjCObject {
        public open fun stringWithCapacity(capacity: Int): NSMutableString =
            Native.objc_msgSend("class objc.NSMutableString", this, "stringWithCapacity:", capacity) as NSMutableString
    }
}

trait NSString_NSStringEncodingDetection : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun stringEncodingForData_encodingOptions_convertedString_usedLossyConversion(data: NSData, opts: NSDictionary, string: Pointer<NSString>, usedLossyConversion: Pointer<Boolean>): Int =
            Native.objc_msgSend("int", this, "stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:", data, opts, string, usedLossyConversion) as Int
    }
}

trait NSString_NSExtendedStringPropertyListParsing : IObjCObject {
    public open fun propertyList(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyList") as ObjCObject

    public open fun propertyListFromStringsFileFormat(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "propertyListFromStringsFileFormat") as NSDictionary

    trait metaclass : IObjCObject
}

trait NSString_NSStringDeprecated : IObjCObject {
    public open fun cString(): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "cString") as Pointer<Char>

    public open fun lossyCString(): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "lossyCString") as Pointer<Char>

    public open fun cStringLength(): Int =
        Native.objc_msgSend("int", this, "cStringLength") as Int

    public open fun getCString(bytes: Pointer<Char>): Unit {
        Native.objc_msgSend("void", this, "getCString:", bytes)
    }

    public open fun getCString_maxLength(bytes: Pointer<Char>, maxLength: Int): Unit {
        Native.objc_msgSend("void", this, "getCString:maxLength:", bytes, maxLength)
    }

    public open fun getCString_maxLength_range_remainingRange(bytes: Pointer<Char>, maxLength: Int, aRange: Any, leftoverRange: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "getCString:maxLength:range:remainingRange:", bytes, maxLength, aRange, leftoverRange)
    }

    public open fun writeToFile_atomically(path: NSString, useAuxiliaryFile: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:atomically:", path, useAuxiliaryFile) as Boolean

    public open fun writeToURL_atomically(url: NSURL, atomically: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeToURL:atomically:", url, atomically) as Boolean

    public open fun initWithContentsOfFile(path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfFile:", path) as ObjCObject

    public open fun initWithContentsOfURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:", url) as ObjCObject

    public open fun initWithCStringNoCopy_length_freeWhenDone(bytes: Pointer<Char>, length: Int, freeBuffer: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCStringNoCopy:length:freeWhenDone:", bytes, length, freeBuffer) as ObjCObject

    public open fun initWithCString_length(bytes: Pointer<Char>, length: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCString:length:", bytes, length) as ObjCObject

    public open fun initWithCString(bytes: Pointer<Char>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCString:", bytes) as ObjCObject

    public open fun getCharacters(buffer: Pointer<Short>): Unit {
        Native.objc_msgSend("void", this, "getCharacters:", buffer)
    }

    trait metaclass : IObjCObject {
        public open fun stringWithContentsOfFile(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithContentsOfFile:", path) as ObjCObject

        public open fun stringWithContentsOfURL(url: NSURL): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithContentsOfURL:", url) as ObjCObject

        public open fun stringWithCString_length(bytes: Pointer<Char>, length: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithCString:length:", bytes, length) as ObjCObject

        public open fun stringWithCString(bytes: Pointer<Char>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "stringWithCString:", bytes) as ObjCObject
    }
}
