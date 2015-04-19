// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTypesetter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTypesetter(pointer: Long) : NSObject(pointer), NSTypesetter_NSLayoutPhaseInterface, NSTypesetter_NSGlyphStorageInterface {
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

    public open fun paragraphCharacterRange(): Any =
        Native.objc_msgSend("class objc.Any", this, "paragraphCharacterRange")

    public open fun paragraphSeparatorCharacterRange(): Any =
        Native.objc_msgSend("class objc.Any", this, "paragraphSeparatorCharacterRange")

    public open fun layoutParagraphAtPoint(lineFragmentOrigin: Pointer<Any>): Int =
        Native.objc_msgSend("int", this, "layoutParagraphAtPoint:", lineFragmentOrigin) as Int

    public open fun beginParagraph(): Unit {
        Native.objc_msgSend("void", this, "beginParagraph")
    }

    public open fun endParagraph(): Unit {
        Native.objc_msgSend("void", this, "endParagraph")
    }

    public open fun beginLineWithGlyphAtIndex(glyphIndex: Int): Unit {
        Native.objc_msgSend("void", this, "beginLineWithGlyphAtIndex:", glyphIndex)
    }

    public open fun endLineWithGlyphRange(lineGlyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "endLineWithGlyphRange:", lineGlyphRange)
    }

    public open fun lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Int, rect: Any): Double =
        Native.objc_msgSend("double", this, "lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:", glyphIndex, rect) as Double

    public open fun paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Int, rect: Any): Double =
        Native.objc_msgSend("double", this, "paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:", glyphIndex, rect) as Double

    public open fun paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(glyphIndex: Int, rect: Any): Double =
        Native.objc_msgSend("double", this, "paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:", glyphIndex, rect) as Double

    public open fun getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin(lineFragmentRect: Pointer<Any>, lineFragmentUsedRect: Pointer<Any>, paragraphSeparatorGlyphRange: Any, lineOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "getLineFragmentRect:usedRect:forParagraphSeparatorGlyphRange:atProposedOrigin:", lineFragmentRect, lineFragmentUsedRect, paragraphSeparatorGlyphRange, lineOrigin)
    }

    public open fun attributesForExtraLineFragment(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "attributesForExtraLineFragment") as NSDictionary

    public open fun actionForControlCharacterAtIndex(charIndex: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "actionForControlCharacterAtIndex:", charIndex)

    public open fun layoutManager(): NSLayoutManager =
        Native.objc_msgSend("class objc.NSLayoutManager", this, "layoutManager") as NSLayoutManager

    public open fun textContainers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "textContainers") as NSArray

    public open fun currentTextContainer(): NSTextContainer =
        Native.objc_msgSend("class objc.NSTextContainer", this, "currentTextContainer") as NSTextContainer

    public open fun currentParagraphStyle(): NSParagraphStyle =
        Native.objc_msgSend("class objc.NSParagraphStyle", this, "currentParagraphStyle") as NSParagraphStyle

    public open fun setHardInvalidation_forGlyphRange(flag: Boolean, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setHardInvalidation:forGlyphRange:", flag, glyphRange)
    }

    public open fun layoutGlyphsInLayoutManager_startingAtGlyphIndex_maxNumberOfLineFragments_nextGlyphIndex(layoutManager: NSLayoutManager, startGlyphIndex: Int, maxNumLines: Int, nextGlyph: Pointer<Int>): Unit {
        Native.objc_msgSend("void", this, "layoutGlyphsInLayoutManager:startingAtGlyphIndex:maxNumberOfLineFragments:nextGlyphIndex:", layoutManager, startGlyphIndex, maxNumLines, nextGlyph)
    }

    public open fun layoutCharactersInRange_forLayoutManager_maximumNumberOfLineFragments(characterRange: Any, layoutManager: NSLayoutManager, maxNumLines: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "layoutCharactersInRange:forLayoutManager:maximumNumberOfLineFragments:", characterRange, layoutManager, maxNumLines)

    public open fun baselineOffsetInLayoutManager_glyphIndex(layoutMgr: NSLayoutManager, glyphIndex: Int): Double =
        Native.objc_msgSend("double", this, "baselineOffsetInLayoutManager:glyphIndex:", layoutMgr, glyphIndex) as Double

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSTypesetter_NSLayoutPhaseInterface.metaclass, NSTypesetter_NSGlyphStorageInterface.metaclass {
        public open fun printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count(layoutMgr: NSLayoutManager, nominallySpacedGlyphsRange: Any, packedGlyphs: Pointer<Byte>, packedGlyphsCount: Int): Any =
            Native.objc_msgSend("class objc.Any", this, "printingAdjustmentInLayoutManager:forNominallySpacedGlyphRange:packedGlyphs:count:", layoutMgr, nominallySpacedGlyphsRange, packedGlyphs, packedGlyphsCount)

        public open fun sharedSystemTypesetter(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sharedSystemTypesetter") as ObjCObject

        public open fun sharedSystemTypesetterForBehavior(theBehavior: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sharedSystemTypesetterForBehavior:", theBehavior) as ObjCObject

        public open fun defaultTypesetterBehavior(): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultTypesetterBehavior")

    }

    companion object : NSObject(Native.objc_getClass("NSTypesetter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSTypesetter_NSLayoutPhaseInterface : IObjCObject {
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

trait NSTypesetter_NSGlyphStorageInterface : IObjCObject {
    public open fun characterRangeForGlyphRange_actualGlyphRange(glyphRange: Any, actualGlyphRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "characterRangeForGlyphRange:actualGlyphRange:", glyphRange, actualGlyphRange)

    public open fun glyphRangeForCharacterRange_actualCharacterRange(charRange: Any, actualCharRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "glyphRangeForCharacterRange:actualCharacterRange:", charRange, actualCharRange)

    public open fun getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels(glyphsRange: Any, glyphBuffer: Pointer<Int>, charIndexBuffer: Pointer<Int>, inscribeBuffer: Pointer<Any>, elasticBuffer: Pointer<Boolean>, bidiLevelBuffer: Pointer<Byte>): Int =
        Native.objc_msgSend("int", this, "getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:bidiLevels:", glyphsRange, glyphBuffer, charIndexBuffer, inscribeBuffer, elasticBuffer, bidiLevelBuffer) as Int

    public open fun getLineFragmentRect_usedRect_remainingRect_forStartingGlyphAtIndex_proposedRect_lineSpacing_paragraphSpacingBefore_paragraphSpacingAfter(lineFragmentRect: Pointer<Any>, lineFragmentUsedRect: Pointer<Any>, remainingRect: Pointer<Any>, startingGlyphIndex: Int, proposedRect: Any, lineSpacing: Double, paragraphSpacingBefore: Double, paragraphSpacingAfter: Double): Unit {
        Native.objc_msgSend("void", this, "getLineFragmentRect:usedRect:remainingRect:forStartingGlyphAtIndex:proposedRect:lineSpacing:paragraphSpacingBefore:paragraphSpacingAfter:", lineFragmentRect, lineFragmentUsedRect, remainingRect, startingGlyphIndex, proposedRect, lineSpacing, paragraphSpacingBefore, paragraphSpacingAfter)
    }

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
