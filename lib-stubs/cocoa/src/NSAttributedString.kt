// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSAttributedString.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSAttributedString(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSSecureCoding, NSAttributedString_NSExtendedAttributedString, NSAttributedString_NSAttributedStringKitAdditions, NSAttributedString_NSAttributedStringPasteboardAdditions, NSAttributedString_NSDeprecatedKitAdditions, NSAttributedString_NSAttributedStringAttachmentConveniences, NSAttributedString_NSStringDrawing, NSAttributedString_NSExtendedStringDrawing {
    public open fun string(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "string") as NSString

    public open fun attributesAtIndex_effectiveRange(location: Int, range: Pointer<Any>): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "attributesAtIndex:effectiveRange:", location, range) as NSDictionary

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSSecureCoding.metaclass, NSAttributedString_NSExtendedAttributedString.metaclass, NSAttributedString_NSAttributedStringKitAdditions.metaclass, NSAttributedString_NSAttributedStringPasteboardAdditions.metaclass, NSAttributedString_NSDeprecatedKitAdditions.metaclass, NSAttributedString_NSAttributedStringAttachmentConveniences.metaclass, NSAttributedString_NSStringDrawing.metaclass, NSAttributedString_NSExtendedStringDrawing.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSAttributedString")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableAttributedString(pointer: Long) : NSAttributedString(pointer), NSMutableAttributedString_NSExtendedMutableAttributedString, NSMutableAttributedString_NSMutableAttributedStringKitAdditions, NSMutableAttributedString_NSMutableAttributedStringAttachmentConveniences {
    public open fun replaceCharactersInRange_withString(range: Any, str: NSString): Unit {
        Native.objc_msgSend("void", this, "replaceCharactersInRange:withString:", range, str)
    }

    public open fun setAttributes_range(attrs: NSDictionary, range: Any): Unit {
        Native.objc_msgSend("void", this, "setAttributes:range:", attrs, range)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSAttributedString.metaclass, NSMutableAttributedString_NSExtendedMutableAttributedString.metaclass, NSMutableAttributedString_NSMutableAttributedStringKitAdditions.metaclass, NSMutableAttributedString_NSMutableAttributedStringAttachmentConveniences.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMutableAttributedString")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSAttributedString_NSExtendedAttributedString : IObjCObject {
    public open fun length(): Int =
        Native.objc_msgSend("int", this, "length") as Int

    public open fun attribute_atIndex_effectiveRange(attrName: NSString, location: Int, range: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "attribute:atIndex:effectiveRange:", attrName, location, range) as ObjCObject

    public open fun attributedSubstringFromRange(range: Any): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedSubstringFromRange:", range) as NSAttributedString

    public open fun attributesAtIndex_longestEffectiveRange_inRange(location: Int, range: Pointer<Any>, rangeLimit: Any): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "attributesAtIndex:longestEffectiveRange:inRange:", location, range, rangeLimit) as NSDictionary

    public open fun attribute_atIndex_longestEffectiveRange_inRange(attrName: NSString, location: Int, range: Pointer<Any>, rangeLimit: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "attribute:atIndex:longestEffectiveRange:inRange:", attrName, location, range, rangeLimit) as ObjCObject

    public open fun isEqualToAttributedString(other: NSAttributedString): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToAttributedString:", other) as Boolean

    public open fun initWithString(str: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:", str) as ObjCObject

    public open fun initWithString_attributes(str: NSString, attrs: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithString:attributes:", str, attrs) as ObjCObject

    public open fun initWithAttributedString(attrStr: NSAttributedString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithAttributedString:", attrStr) as ObjCObject

    public open fun enumerateAttributesInRange_options_usingBlock(enumerationRange: Any, opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateAttributesInRange:options:usingBlock:", enumerationRange, opts, block)
    }

    public open fun enumerateAttribute_inRange_options_usingBlock(attrName: NSString, enumerationRange: Any, opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateAttribute:inRange:options:usingBlock:", attrName, enumerationRange, opts, block)
    }

    trait metaclass : IObjCObject
}

trait NSMutableAttributedString_NSExtendedMutableAttributedString : IObjCObject {
    public open fun mutableString(): NSMutableString =
        Native.objc_msgSend("class objc.NSMutableString", this, "mutableString") as NSMutableString

    public open fun addAttribute_value_range(name: NSString, value: ObjCObject, range: Any): Unit {
        Native.objc_msgSend("void", this, "addAttribute:value:range:", name, value, range)
    }

    public open fun addAttributes_range(attrs: NSDictionary, range: Any): Unit {
        Native.objc_msgSend("void", this, "addAttributes:range:", attrs, range)
    }

    public open fun removeAttribute_range(name: NSString, range: Any): Unit {
        Native.objc_msgSend("void", this, "removeAttribute:range:", name, range)
    }

    public open fun replaceCharactersInRange_withAttributedString(range: Any, attrString: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "replaceCharactersInRange:withAttributedString:", range, attrString)
    }

    public open fun insertAttributedString_atIndex(attrString: NSAttributedString, loc: Int): Unit {
        Native.objc_msgSend("void", this, "insertAttributedString:atIndex:", attrString, loc)
    }

    public open fun appendAttributedString(attrString: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "appendAttributedString:", attrString)
    }

    public open fun deleteCharactersInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "deleteCharactersInRange:", range)
    }

    public open fun setAttributedString(attrString: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedString:", attrString)
    }

    public open fun beginEditing(): Unit {
        Native.objc_msgSend("void", this, "beginEditing")
    }

    public open fun endEditing(): Unit {
        Native.objc_msgSend("void", this, "endEditing")
    }

    trait metaclass : IObjCObject
}

trait NSAttributedString_NSAttributedStringKitAdditions : IObjCObject {
    public open fun fontAttributesInRange(range: Any): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "fontAttributesInRange:", range) as NSDictionary

    public open fun rulerAttributesInRange(range: Any): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "rulerAttributesInRange:", range) as NSDictionary

    public open fun containsAttachments(): Boolean =
        Native.objc_msgSend("boolean", this, "containsAttachments") as Boolean

    public open fun lineBreakBeforeIndex_withinRange(location: Int, aRange: Any): Int =
        Native.objc_msgSend("int", this, "lineBreakBeforeIndex:withinRange:", location, aRange) as Int

    public open fun lineBreakByHyphenatingBeforeIndex_withinRange(location: Int, aRange: Any): Int =
        Native.objc_msgSend("int", this, "lineBreakByHyphenatingBeforeIndex:withinRange:", location, aRange) as Int

    public open fun doubleClickAtIndex(location: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "doubleClickAtIndex:", location)

    public open fun nextWordFromIndex_forward(location: Int, isForward: Boolean): Int =
        Native.objc_msgSend("int", this, "nextWordFromIndex:forward:", location, isForward) as Int

    public open fun URLAtIndex_effectiveRange(location: Int, effectiveRange: Pointer<Any>): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLAtIndex:effectiveRange:", location, effectiveRange) as NSURL

    public open fun rangeOfTextBlock_atIndex(block: NSTextBlock, location: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfTextBlock:atIndex:", block, location)

    public open fun rangeOfTextTable_atIndex(table: NSTextTable, location: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfTextTable:atIndex:", table, location)

    public open fun rangeOfTextList_atIndex(list: NSTextList, location: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfTextList:atIndex:", list, location)

    public open fun itemNumberInTextList_atIndex(list: NSTextList, location: Int): Int =
        Native.objc_msgSend("int", this, "itemNumberInTextList:atIndex:", list, location) as Int

    public open fun initWithURL_options_documentAttributes_error(url: NSURL, options: NSDictionary, dict: Pointer<NSDictionary>, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:options:documentAttributes:error:", url, options, dict, error) as ObjCObject

    public open fun initWithData_options_documentAttributes_error(data: NSData, options: NSDictionary, dict: Pointer<NSDictionary>, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:options:documentAttributes:error:", data, options, dict, error) as ObjCObject

    public open fun initWithPath_documentAttributes(path: NSString, dict: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPath:documentAttributes:", path, dict) as ObjCObject

    public open fun initWithURL_documentAttributes(url: NSURL, dict: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:documentAttributes:", url, dict) as ObjCObject

    public open fun initWithRTF_documentAttributes(data: NSData, dict: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRTF:documentAttributes:", data, dict) as ObjCObject

    public open fun initWithRTFD_documentAttributes(data: NSData, dict: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRTFD:documentAttributes:", data, dict) as ObjCObject

    public open fun initWithHTML_documentAttributes(data: NSData, dict: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithHTML:documentAttributes:", data, dict) as ObjCObject

    public open fun initWithHTML_baseURL_documentAttributes(data: NSData, base: NSURL, dict: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithHTML:baseURL:documentAttributes:", data, base, dict) as ObjCObject

    public open fun initWithDocFormat_documentAttributes(data: NSData, dict: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDocFormat:documentAttributes:", data, dict) as ObjCObject

    public open fun initWithHTML_options_documentAttributes(data: NSData, options: NSDictionary, dict: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithHTML:options:documentAttributes:", data, options, dict) as ObjCObject

    public open fun initWithRTFDFileWrapper_documentAttributes(wrapper: NSFileWrapper, dict: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRTFDFileWrapper:documentAttributes:", wrapper, dict) as ObjCObject

    public open fun dataFromRange_documentAttributes_error(range: Any, dict: NSDictionary, error: Pointer<NSError>): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataFromRange:documentAttributes:error:", range, dict, error) as NSData

    public open fun fileWrapperFromRange_documentAttributes_error(range: Any, dict: NSDictionary, error: Pointer<NSError>): NSFileWrapper =
        Native.objc_msgSend("class objc.NSFileWrapper", this, "fileWrapperFromRange:documentAttributes:error:", range, dict, error) as NSFileWrapper

    public open fun RTFFromRange_documentAttributes(range: Any, dict: NSDictionary): NSData =
        Native.objc_msgSend("class objc.NSData", this, "RTFFromRange:documentAttributes:", range, dict) as NSData

    public open fun RTFDFromRange_documentAttributes(range: Any, dict: NSDictionary): NSData =
        Native.objc_msgSend("class objc.NSData", this, "RTFDFromRange:documentAttributes:", range, dict) as NSData

    public open fun RTFDFileWrapperFromRange_documentAttributes(range: Any, dict: NSDictionary): NSFileWrapper =
        Native.objc_msgSend("class objc.NSFileWrapper", this, "RTFDFileWrapperFromRange:documentAttributes:", range, dict) as NSFileWrapper

    public open fun docFormatFromRange_documentAttributes(range: Any, dict: NSDictionary): NSData =
        Native.objc_msgSend("class objc.NSData", this, "docFormatFromRange:documentAttributes:", range, dict) as NSData

    trait metaclass : IObjCObject
}

trait NSAttributedString_NSAttributedStringPasteboardAdditions : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun textTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "textTypes") as NSArray

        public open fun textUnfilteredTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "textUnfilteredTypes") as NSArray
    }
}

trait NSAttributedString_NSDeprecatedKitAdditions : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun textFileTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "textFileTypes") as NSArray

        public open fun textPasteboardTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "textPasteboardTypes") as NSArray

        public open fun textUnfilteredFileTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "textUnfilteredFileTypes") as NSArray

        public open fun textUnfilteredPasteboardTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "textUnfilteredPasteboardTypes") as NSArray
    }
}

trait NSMutableAttributedString_NSMutableAttributedStringKitAdditions : IObjCObject {
    public open fun readFromURL_options_documentAttributes_error(url: NSURL, opts: NSDictionary, dict: Pointer<NSDictionary>, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "readFromURL:options:documentAttributes:error:", url, opts, dict, error) as Boolean

    public open fun readFromData_options_documentAttributes_error(data: NSData, opts: NSDictionary, dict: Pointer<NSDictionary>, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "readFromData:options:documentAttributes:error:", data, opts, dict, error) as Boolean

    public open fun readFromURL_options_documentAttributes(url: NSURL, options: NSDictionary, dict: Pointer<NSDictionary>): Boolean =
        Native.objc_msgSend("boolean", this, "readFromURL:options:documentAttributes:", url, options, dict) as Boolean

    public open fun readFromData_options_documentAttributes(data: NSData, options: NSDictionary, dict: Pointer<NSDictionary>): Boolean =
        Native.objc_msgSend("boolean", this, "readFromData:options:documentAttributes:", data, options, dict) as Boolean

    public open fun superscriptRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "superscriptRange:", range)
    }

    public open fun subscriptRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "subscriptRange:", range)
    }

    public open fun unscriptRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "unscriptRange:", range)
    }

    public open fun applyFontTraits_range(traitMask: Any, range: Any): Unit {
        Native.objc_msgSend("void", this, "applyFontTraits:range:", traitMask, range)
    }

    public open fun setAlignment_range(alignment: Any, range: Any): Unit {
        Native.objc_msgSend("void", this, "setAlignment:range:", alignment, range)
    }

    public open fun setBaseWritingDirection_range(writingDirection: Any, range: Any): Unit {
        Native.objc_msgSend("void", this, "setBaseWritingDirection:range:", writingDirection, range)
    }

    public open fun fixAttributesInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "fixAttributesInRange:", range)
    }

    public open fun fixFontAttributeInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "fixFontAttributeInRange:", range)
    }

    public open fun fixParagraphStyleAttributeInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "fixParagraphStyleAttributeInRange:", range)
    }

    public open fun fixAttachmentAttributeInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "fixAttachmentAttributeInRange:", range)
    }

    trait metaclass : IObjCObject
}
