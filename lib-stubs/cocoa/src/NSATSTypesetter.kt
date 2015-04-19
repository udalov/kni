// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSATSTypesetter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSATSTypesetter(pointer: Long) : NSTypesetter(pointer), NSATSTypesetter_NSPantherCompatibility, NSATSTypesetter_NSPrimitiveInterface, NSATSTypesetter_NSLayoutPhaseInterface, NSATSTypesetter_NSGlyphStorageInterface {
    override fun attributedString(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedString") as NSAttributedString

    override fun bidiProcessingEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "bidiProcessingEnabled") as Boolean

    override fun boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex(glyphIndex: Int, textContainer: NSTextContainer, proposedRect: Any, glyphPosition: Any, charIndex: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:", glyphIndex, textContainer, proposedRect, glyphPosition, charIndex)

    override fun characterRangeForGlyphRange_actualGlyphRange(glyphRange: Any, actualGlyphRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "characterRangeForGlyphRange:actualGlyphRange:", glyphRange, actualGlyphRange)

    override fun currentTextContainer(): NSTextContainer =
        Native.objc_msgSend("class objc.NSTextContainer", this, "currentTextContainer") as NSTextContainer

    override fun deleteGlyphsInRange(glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "deleteGlyphsInRange:", glyphRange)
    }

    override fun getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin(lineFragmentRect: Pointer<Any>, lineFragmentUsedRect: Pointer<Any>, paragraphSeparatorGlyphRange: Any, lineOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "getLineFragmentRect:usedRect:forParagraphSeparatorGlyphRange:atProposedOrigin:", lineFragmentRect, lineFragmentUsedRect, paragraphSeparatorGlyphRange, lineOrigin)
    }

    override fun glyphRangeForCharacterRange_actualCharacterRange(charRange: Any, actualCharRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "glyphRangeForCharacterRange:actualCharacterRange:", charRange, actualCharRange)

    override fun hyphenCharacterForGlyphAtIndex(glyphIndex: Int): Int =
        Native.objc_msgSend("int", this, "hyphenCharacterForGlyphAtIndex:", glyphIndex) as Int

    override fun hyphenationFactor(): Float =
        Native.objc_msgSend("float", this, "hyphenationFactor") as Float

    override fun hyphenationFactorForGlyphAtIndex(glyphIndex: Int): Float =
        Native.objc_msgSend("float", this, "hyphenationFactorForGlyphAtIndex:", glyphIndex) as Float

    override fun insertGlyph_atGlyphIndex_characterIndex(glyph: Int, glyphIndex: Int, characterIndex: Int): Unit {
        Native.objc_msgSend("void", this, "insertGlyph:atGlyphIndex:characterIndex:", glyph, glyphIndex, characterIndex)
    }

    override fun layoutManager(): NSLayoutManager =
        Native.objc_msgSend("class objc.NSLayoutManager", this, "layoutManager") as NSLayoutManager

    override fun layoutParagraphAtPoint(lineFragmentOrigin: Pointer<Any>): Int =
        Native.objc_msgSend("int", this, "layoutParagraphAtPoint:", lineFragmentOrigin) as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun lineFragmentPadding(): Double =
        Native.objc_msgSend("double", this, "lineFragmentPadding") as Double

    override fun lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Int, rect: Any): Double =
        Native.objc_msgSend("double", this, "lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:", glyphIndex, rect) as Double

    override fun paragraphGlyphRange(): Any =
        Native.objc_msgSend("class objc.Any", this, "paragraphGlyphRange")

    override fun paragraphSeparatorGlyphRange(): Any =
        Native.objc_msgSend("class objc.Any", this, "paragraphSeparatorGlyphRange")

    override fun paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Int, rect: Any): Double =
        Native.objc_msgSend("double", this, "paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:", glyphIndex, rect) as Double

    override fun paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Int, rect: Any): Double =
        Native.objc_msgSend("double", this, "paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:", glyphIndex, rect) as Double

    override fun setAttachmentSize_forGlyphRange(attachmentSize: Any, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setAttachmentSize:forGlyphRange:", attachmentSize, glyphRange)
    }

    override fun setAttributedString(attributedString: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedString:", attributedString)
    }

    override fun setBidiLevels_forGlyphRange(levels: Pointer<Byte>, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setBidiLevels:forGlyphRange:", levels, glyphRange)
    }

    override fun setBidiProcessingEnabled(bidiProcessingEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBidiProcessingEnabled:", bidiProcessingEnabled)
    }

    override fun setDrawsOutsideLineFragment_forGlyphRange(flag: Boolean, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setDrawsOutsideLineFragment:forGlyphRange:", flag, glyphRange)
    }

    override fun setHardInvalidation_forGlyphRange(flag: Boolean, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setHardInvalidation:forGlyphRange:", flag, glyphRange)
    }

    override fun setHyphenationFactor(hyphenationFactor: Float): Unit {
        Native.objc_msgSend("void", this, "setHyphenationFactor:", hyphenationFactor)
    }

    override fun setLineFragmentPadding(lineFragmentPadding: Double): Unit {
        Native.objc_msgSend("void", this, "setLineFragmentPadding:", lineFragmentPadding)
    }

    override fun setLineFragmentRect_forGlyphRange_usedRect_baselineOffset(fragmentRect: Any, glyphRange: Any, usedRect: Any, baselineOffset: Double): Unit {
        Native.objc_msgSend("void", this, "setLineFragmentRect:forGlyphRange:usedRect:baselineOffset:", fragmentRect, glyphRange, usedRect, baselineOffset)
    }

    override fun setLocation_withAdvancements_forStartOfGlyphRange(location: Any, advancements: Pointer<Double>, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setLocation:withAdvancements:forStartOfGlyphRange:", location, advancements, glyphRange)
    }

    override fun setNotShownAttribute_forGlyphRange(flag: Boolean, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setNotShownAttribute:forGlyphRange:", flag, glyphRange)
    }

    override fun setParagraphGlyphRange_separatorGlyphRange(paragraphRange: Any, paragraphSeparatorRange: Any): Unit {
        Native.objc_msgSend("void", this, "setParagraphGlyphRange:separatorGlyphRange:", paragraphRange, paragraphSeparatorRange)
    }

    override fun setTypesetterBehavior(typesetterBehavior: Any): Unit {
        Native.objc_msgSend("void", this, "setTypesetterBehavior:", typesetterBehavior)
    }

    override fun setUsesFontLeading(usesFontLeading: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesFontLeading:", usesFontLeading)
    }

    override fun shouldBreakLineByHyphenatingBeforeCharacterAtIndex(charIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "shouldBreakLineByHyphenatingBeforeCharacterAtIndex:", charIndex) as Boolean

    override fun shouldBreakLineByWordBeforeCharacterAtIndex(charIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "shouldBreakLineByWordBeforeCharacterAtIndex:", charIndex) as Boolean

    override fun substituteFontForFont(originalFont: NSFont): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "substituteFontForFont:", originalFont) as NSFont

    override fun substituteGlyphsInRange_withGlyphs(glyphRange: Any, glyphs: Pointer<Int>): Unit {
        Native.objc_msgSend("void", this, "substituteGlyphsInRange:withGlyphs:", glyphRange, glyphs)
    }

    override fun textTabForGlyphLocation_writingDirection_maxLocation(glyphLocation: Double, direction: Any, maxLocation: Double): NSTextTab =
        Native.objc_msgSend("class objc.NSTextTab", this, "textTabForGlyphLocation:writingDirection:maxLocation:", glyphLocation, direction, maxLocation) as NSTextTab

    override fun typesetterBehavior(): Any =
        Native.objc_msgSend("class objc.Any", this, "typesetterBehavior")

    override fun usesFontLeading(): Boolean =
        Native.objc_msgSend("boolean", this, "usesFontLeading") as Boolean

    override fun willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset(lineRect: Pointer<Any>, glyphRange: Any, usedRect: Pointer<Any>, baselineOffset: Pointer<Double>): Unit {
        Native.objc_msgSend("void", this, "willSetLineFragmentRect:forGlyphRange:usedRect:baselineOffset:", lineRect, glyphRange, usedRect, baselineOffset)
    }

    trait metaclass : NSTypesetter.metaclass, NSATSTypesetter_NSPantherCompatibility.metaclass, NSATSTypesetter_NSPrimitiveInterface.metaclass, NSATSTypesetter_NSLayoutPhaseInterface.metaclass, NSATSTypesetter_NSGlyphStorageInterface.metaclass {
        public open fun sharedTypesetter(): NSATSTypesetter =
            Native.objc_msgSend("class objc.NSATSTypesetter", this, "sharedTypesetter") as NSATSTypesetter

    }

    companion object : NSObject(Native.objc_getClass("NSATSTypesetter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSATSTypesetter_NSPantherCompatibility : IObjCObject {
    public open fun lineFragmentRectForProposedRect_remainingRect(proposedRect: Any, remainingRect: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "lineFragmentRectForProposedRect:remainingRect:", proposedRect, remainingRect)

    trait metaclass : IObjCObject
}

trait NSATSTypesetter_NSPrimitiveInterface : IObjCObject {
    public open fun usesFontLeading(): Boolean =
        Native.objc_msgSend("boolean", this, "usesFontLeading") as Boolean

    public open fun setUsesFontLeading(usesFontLeading: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesFontLeading:", usesFontLeading)
    }

    public open fun typesetterBehavior(): Any =
        Native.objc_msgSend("class objc.Any", this, "typesetterBehavior")

    public open fun setTypesetterBehavior(typesetterBehavior: Any): Unit {
        Native.objc_msgSend("void", this, "setTypesetterBehavior:", typesetterBehavior)
    }

    public open fun hyphenationFactor(): Float =
        Native.objc_msgSend("float", this, "hyphenationFactor") as Float

    public open fun setHyphenationFactor(hyphenationFactor: Float): Unit {
        Native.objc_msgSend("void", this, "setHyphenationFactor:", hyphenationFactor)
    }

    public open fun lineFragmentPadding(): Double =
        Native.objc_msgSend("double", this, "lineFragmentPadding") as Double

    public open fun setLineFragmentPadding(lineFragmentPadding: Double): Unit {
        Native.objc_msgSend("void", this, "setLineFragmentPadding:", lineFragmentPadding)
    }

    public open fun substituteFontForFont(originalFont: NSFont): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "substituteFontForFont:", originalFont) as NSFont

    public open fun textTabForGlyphLocation_writingDirection_maxLocation(glyphLocation: Double, direction: Any, maxLocation: Double): NSTextTab =
        Native.objc_msgSend("class objc.NSTextTab", this, "textTabForGlyphLocation:writingDirection:maxLocation:", glyphLocation, direction, maxLocation) as NSTextTab

    public open fun bidiProcessingEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "bidiProcessingEnabled") as Boolean

    public open fun setBidiProcessingEnabled(bidiProcessingEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBidiProcessingEnabled:", bidiProcessingEnabled)
    }

    public open fun attributedString(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedString") as NSAttributedString

    public open fun setAttributedString(attributedString: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedString:", attributedString)
    }

    public open fun setParagraphGlyphRange_separatorGlyphRange(paragraphRange: Any, paragraphSeparatorRange: Any): Unit {
        Native.objc_msgSend("void", this, "setParagraphGlyphRange:separatorGlyphRange:", paragraphRange, paragraphSeparatorRange)
    }

    public open fun paragraphGlyphRange(): Any =
        Native.objc_msgSend("class objc.Any", this, "paragraphGlyphRange")

    public open fun paragraphSeparatorGlyphRange(): Any =
        Native.objc_msgSend("class objc.Any", this, "paragraphSeparatorGlyphRange")

    public open fun layoutParagraphAtPoint(lineFragmentOrigin: Pointer<Any>): Int =
        Native.objc_msgSend("int", this, "layoutParagraphAtPoint:", lineFragmentOrigin) as Int

    public open fun lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Int, rect: Any): Double =
        Native.objc_msgSend("double", this, "lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:", glyphIndex, rect) as Double

    public open fun paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Int, rect: Any): Double =
        Native.objc_msgSend("double", this, "paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:", glyphIndex, rect) as Double

    public open fun paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Int, rect: Any): Double =
        Native.objc_msgSend("double", this, "paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:", glyphIndex, rect) as Double

    public open fun layoutManager(): NSLayoutManager =
        Native.objc_msgSend("class objc.NSLayoutManager", this, "layoutManager") as NSLayoutManager

    public open fun currentTextContainer(): NSTextContainer =
        Native.objc_msgSend("class objc.NSTextContainer", this, "currentTextContainer") as NSTextContainer

    public open fun setHardInvalidation_forGlyphRange(flag: Boolean, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setHardInvalidation:forGlyphRange:", flag, glyphRange)
    }

    public open fun getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin(lineFragmentRect: Pointer<Any>, lineFragmentUsedRect: Pointer<Any>, paragraphSeparatorGlyphRange: Any, lineOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "getLineFragmentRect:usedRect:forParagraphSeparatorGlyphRange:atProposedOrigin:", lineFragmentRect, lineFragmentUsedRect, paragraphSeparatorGlyphRange, lineOrigin)
    }

    trait metaclass : IObjCObject
}

trait NSATSTypesetter_NSLayoutPhaseInterface : IObjCObject {
    public open fun willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset(lineRect: Pointer<Any>, glyphRange: Any, usedRect: Pointer<Any>, baselineOffset: Pointer<Double>): Unit {
        Native.objc_msgSend("void", this, "willSetLineFragmentRect:forGlyphRange:usedRect:baselineOffset:", lineRect, glyphRange, usedRect, baselineOffset)
    }

    public open fun shouldBreakLineByWordBeforeCharacterAtIndex(charIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "shouldBreakLineByWordBeforeCharacterAtIndex:", charIndex) as Boolean

    public open fun shouldBreakLineByHyphenatingBeforeCharacterAtIndex(charIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "shouldBreakLineByHyphenatingBeforeCharacterAtIndex:", charIndex) as Boolean

    public open fun hyphenationFactorForGlyphAtIndex(glyphIndex: Int): Float =
        Native.objc_msgSend("float", this, "hyphenationFactorForGlyphAtIndex:", glyphIndex) as Float

    public open fun hyphenCharacterForGlyphAtIndex(glyphIndex: Int): Int =
        Native.objc_msgSend("int", this, "hyphenCharacterForGlyphAtIndex:", glyphIndex) as Int

    public open fun boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex(glyphIndex: Int, textContainer: NSTextContainer, proposedRect: Any, glyphPosition: Any, charIndex: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:", glyphIndex, textContainer, proposedRect, glyphPosition, charIndex)

    trait metaclass : IObjCObject
}

trait NSATSTypesetter_NSGlyphStorageInterface : IObjCObject {
    public open fun characterRangeForGlyphRange_actualGlyphRange(glyphRange: Any, actualGlyphRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "characterRangeForGlyphRange:actualGlyphRange:", glyphRange, actualGlyphRange)

    public open fun glyphRangeForCharacterRange_actualCharacterRange(charRange: Any, actualCharRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "glyphRangeForCharacterRange:actualCharacterRange:", charRange, actualCharRange)

    public open fun getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits(glyphsRange: Any, glyphBuffer: Pointer<Int>, charIndexBuffer: Pointer<Int>, inscribeBuffer: Pointer<Any>, elasticBuffer: Pointer<Boolean>): Int =
        Native.objc_msgSend("int", this, "getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:", glyphsRange, glyphBuffer, charIndexBuffer, inscribeBuffer, elasticBuffer) as Int

    public open fun setLineFragmentRect_forGlyphRange_usedRect_baselineOffset(fragmentRect: Any, glyphRange: Any, usedRect: Any, baselineOffset: Double): Unit {
        Native.objc_msgSend("void", this, "setLineFragmentRect:forGlyphRange:usedRect:baselineOffset:", fragmentRect, glyphRange, usedRect, baselineOffset)
    }

    public open fun substituteGlyphsInRange_withGlyphs(glyphRange: Any, glyphs: Pointer<Int>): Unit {
        Native.objc_msgSend("void", this, "substituteGlyphsInRange:withGlyphs:", glyphRange, glyphs)
    }

    public open fun insertGlyph_atGlyphIndex_characterIndex(glyph: Int, glyphIndex: Int, characterIndex: Int): Unit {
        Native.objc_msgSend("void", this, "insertGlyph:atGlyphIndex:characterIndex:", glyph, glyphIndex, characterIndex)
    }

    public open fun deleteGlyphsInRange(glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "deleteGlyphsInRange:", glyphRange)
    }

    public open fun setNotShownAttribute_forGlyphRange(flag: Boolean, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setNotShownAttribute:forGlyphRange:", flag, glyphRange)
    }

    public open fun setDrawsOutsideLineFragment_forGlyphRange(flag: Boolean, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setDrawsOutsideLineFragment:forGlyphRange:", flag, glyphRange)
    }

    public open fun setLocation_withAdvancements_forStartOfGlyphRange(location: Any, advancements: Pointer<Double>, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setLocation:withAdvancements:forStartOfGlyphRange:", location, advancements, glyphRange)
    }

    public open fun setAttachmentSize_forGlyphRange(attachmentSize: Any, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setAttachmentSize:forGlyphRange:", attachmentSize, glyphRange)
    }

    public open fun setBidiLevels_forGlyphRange(levels: Pointer<Byte>, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setBidiLevels:forGlyphRange:", levels, glyphRange)
    }

    trait metaclass : IObjCObject
}
