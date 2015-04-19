// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSLinguisticTagger.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSLinguisticTagger(pointer: Long) : NSObject(pointer) {
    public open fun initWithTagSchemes_options(tagSchemes: NSArray, opts: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTagSchemes:options:", tagSchemes, opts) as ObjCObject

    public open fun tagSchemes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "tagSchemes") as NSArray

    public open fun string(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "string") as NSString

    public open fun setString(string: NSString): Unit {
        Native.objc_msgSend("void", this, "setString:", string)
    }

    public open fun setOrthography_range(orthography: NSOrthography, range: Any): Unit {
        Native.objc_msgSend("void", this, "setOrthography:range:", orthography, range)
    }

    public open fun orthographyAtIndex_effectiveRange(charIndex: Int, effectiveRange: Pointer<Any>): NSOrthography =
        Native.objc_msgSend("class objc.NSOrthography", this, "orthographyAtIndex:effectiveRange:", charIndex, effectiveRange) as NSOrthography

    public open fun stringEditedInRange_changeInLength(newRange: Any, delta: Int): Unit {
        Native.objc_msgSend("void", this, "stringEditedInRange:changeInLength:", newRange, delta)
    }

    public open fun enumerateTagsInRange_scheme_options_usingBlock(range: Any, tagScheme: NSString, opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateTagsInRange:scheme:options:usingBlock:", range, tagScheme, opts, block)
    }

    public open fun sentenceRangeForRange(range: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "sentenceRangeForRange:", range)

    public open fun tagAtIndex_scheme_tokenRange_sentenceRange(charIndex: Int, tagScheme: NSString, tokenRange: Pointer<Any>, sentenceRange: Pointer<Any>): NSString =
        Native.objc_msgSend("class objc.NSString", this, "tagAtIndex:scheme:tokenRange:sentenceRange:", charIndex, tagScheme, tokenRange, sentenceRange) as NSString

    public open fun tagsInRange_scheme_options_tokenRanges(range: Any, tagScheme: NSString, opts: Any, tokenRanges: Pointer<NSArray>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "tagsInRange:scheme:options:tokenRanges:", range, tagScheme, opts, tokenRanges) as NSArray

    public open fun possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores(charIndex: Int, tagScheme: NSString, tokenRange: Pointer<Any>, sentenceRange: Pointer<Any>, scores: Pointer<NSArray>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:", charIndex, tagScheme, tokenRange, sentenceRange, scores) as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun availableTagSchemesForLanguage(language: NSString): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "availableTagSchemesForLanguage:", language) as NSArray

    }

    companion object : NSObject(Native.objc_getClass("NSLinguisticTagger")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSString_NSLinguisticAnalysis : IObjCObject {
    public open fun linguisticTagsInRange_scheme_options_orthography_tokenRanges(range: Any, tagScheme: NSString, opts: Any, orthography: NSOrthography, tokenRanges: Pointer<NSArray>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "linguisticTagsInRange:scheme:options:orthography:tokenRanges:", range, tagScheme, opts, orthography, tokenRanges) as NSArray

    public open fun enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock(range: Any, tagScheme: NSString, opts: Any, orthography: NSOrthography, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:", range, tagScheme, opts, orthography, block)
    }

    trait metaclass : IObjCObject
}
