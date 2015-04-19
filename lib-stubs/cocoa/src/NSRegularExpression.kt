// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSRegularExpression.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSRegularExpression(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSRegularExpression_NSMatching, NSRegularExpression_NSReplacement {
    public open fun initWithPattern_options_error(pattern: NSString, options: Any, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPattern:options:error:", pattern, options, error) as ObjCObject

    public open fun pattern(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pattern") as NSString

    public open fun options(): Any =
        Native.objc_msgSend("class objc.Any", this, "options")

    public open fun numberOfCaptureGroups(): Int =
        Native.objc_msgSend("int", this, "numberOfCaptureGroups") as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSRegularExpression_NSMatching.metaclass, NSRegularExpression_NSReplacement.metaclass {
        public open fun regularExpressionWithPattern_options_error(pattern: NSString, options: Any, error: Pointer<NSError>): NSRegularExpression =
            Native.objc_msgSend("class objc.NSRegularExpression", this, "regularExpressionWithPattern:options:error:", pattern, options, error) as NSRegularExpression

        public open fun escapedPatternForString(string: NSString): NSString =
            Native.objc_msgSend("class objc.NSString", this, "escapedPatternForString:", string) as NSString

    }

    companion object : NSObject(Native.objc_getClass("NSRegularExpression")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSDataDetector(pointer: Long) : NSRegularExpression(pointer) {
    public open fun initWithTypes_error(checkingTypes: Long, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTypes:error:", checkingTypes, error) as ObjCObject

    public open fun checkingTypes(): Long =
        Native.objc_msgSend("long", this, "checkingTypes") as Long

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSRegularExpression.metaclass {
        public open fun dataDetectorWithTypes_error(checkingTypes: Long, error: Pointer<NSError>): NSDataDetector =
            Native.objc_msgSend("class objc.NSDataDetector", this, "dataDetectorWithTypes:error:", checkingTypes, error) as NSDataDetector

    }

    companion object : NSObject(Native.objc_getClass("NSDataDetector")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSRegularExpression_NSMatching : IObjCObject {
    public open fun enumerateMatchesInString_options_range_usingBlock(string: NSString, options: Any, range: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateMatchesInString:options:range:usingBlock:", string, options, range, block)
    }

    public open fun matchesInString_options_range(string: NSString, options: Any, range: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "matchesInString:options:range:", string, options, range) as NSArray

    public open fun numberOfMatchesInString_options_range(string: NSString, options: Any, range: Any): Int =
        Native.objc_msgSend("int", this, "numberOfMatchesInString:options:range:", string, options, range) as Int

    public open fun firstMatchInString_options_range(string: NSString, options: Any, range: Any): NSTextCheckingResult =
        Native.objc_msgSend("class objc.NSTextCheckingResult", this, "firstMatchInString:options:range:", string, options, range) as NSTextCheckingResult

    public open fun rangeOfFirstMatchInString_options_range(string: NSString, options: Any, range: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfFirstMatchInString:options:range:", string, options, range)

    trait metaclass : IObjCObject
}

trait NSRegularExpression_NSReplacement : IObjCObject {
    public open fun stringByReplacingMatchesInString_options_range_withTemplate(string: NSString, options: Any, range: Any, templ: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByReplacingMatchesInString:options:range:withTemplate:", string, options, range, templ) as NSString

    public open fun replaceMatchesInString_options_range_withTemplate(string: NSMutableString, options: Any, range: Any, templ: NSString): Int =
        Native.objc_msgSend("int", this, "replaceMatchesInString:options:range:withTemplate:", string, options, range, templ) as Int

    public open fun replacementStringForResult_inString_offset_template(result: NSTextCheckingResult, string: NSString, offset: Int, templ: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "replacementStringForResult:inString:offset:template:", result, string, offset, templ) as NSString

    trait metaclass : IObjCObject {
        public open fun escapedTemplateForString(string: NSString): NSString =
            Native.objc_msgSend("class objc.NSString", this, "escapedTemplateForString:", string) as NSString
    }
}
