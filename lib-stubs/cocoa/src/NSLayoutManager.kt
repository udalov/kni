// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSLayoutManager.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTextLayoutOrientationProvider {
    trait metaclass
}

trait NSLayoutManagerDelegate {
    trait metaclass
}

public open class NSLayoutManager(pointer: Long) : NSObject(pointer), NSCoding, NSGlyphStorage, NSLayoutManager_NSTextViewSupport {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun textStorage(): NSTextStorage =
        Native.objc_msgSend("class objc.NSTextStorage", this, "textStorage") as NSTextStorage

    public open fun setTextStorage(textStorage: NSTextStorage): Unit {
        Native.objc_msgSend("void", this, "setTextStorage:", textStorage)
    }

    public open fun attributedString(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedString") as NSAttributedString

    public open fun replaceTextStorage(newTextStorage: NSTextStorage): Unit {
        Native.objc_msgSend("void", this, "replaceTextStorage:", newTextStorage)
    }

    public open fun glyphGenerator(): NSGlyphGenerator =
        Native.objc_msgSend("class objc.NSGlyphGenerator", this, "glyphGenerator") as NSGlyphGenerator

    public open fun setGlyphGenerator(glyphGenerator: NSGlyphGenerator): Unit {
        Native.objc_msgSend("void", this, "setGlyphGenerator:", glyphGenerator)
    }

    public open fun typesetter(): NSTypesetter =
        Native.objc_msgSend("class objc.NSTypesetter", this, "typesetter") as NSTypesetter

    public open fun setTypesetter(typesetter: NSTypesetter): Unit {
        Native.objc_msgSend("void", this, "setTypesetter:", typesetter)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun textContainers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "textContainers") as NSArray

    public open fun addTextContainer(container: NSTextContainer): Unit {
        Native.objc_msgSend("void", this, "addTextContainer:", container)
    }

    public open fun insertTextContainer_atIndex(container: NSTextContainer, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertTextContainer:atIndex:", container, index)
    }

    public open fun removeTextContainerAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeTextContainerAtIndex:", index)
    }

    public open fun textContainerChangedGeometry(container: NSTextContainer): Unit {
        Native.objc_msgSend("void", this, "textContainerChangedGeometry:", container)
    }

    public open fun textContainerChangedTextView(container: NSTextContainer): Unit {
        Native.objc_msgSend("void", this, "textContainerChangedTextView:", container)
    }

    public open fun backgroundLayoutEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "backgroundLayoutEnabled") as Boolean

    public open fun setBackgroundLayoutEnabled(backgroundLayoutEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBackgroundLayoutEnabled:", backgroundLayoutEnabled)
    }

    public open fun usesScreenFonts(): Boolean =
        Native.objc_msgSend("boolean", this, "usesScreenFonts") as Boolean

    public open fun setUsesScreenFonts(usesScreenFonts: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesScreenFonts:", usesScreenFonts)
    }

    public open fun showsInvisibleCharacters(): Boolean =
        Native.objc_msgSend("boolean", this, "showsInvisibleCharacters") as Boolean

    public open fun setShowsInvisibleCharacters(showsInvisibleCharacters: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsInvisibleCharacters:", showsInvisibleCharacters)
    }

    public open fun showsControlCharacters(): Boolean =
        Native.objc_msgSend("boolean", this, "showsControlCharacters") as Boolean

    public open fun setShowsControlCharacters(showsControlCharacters: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsControlCharacters:", showsControlCharacters)
    }

    public open fun hyphenationFactor(): Float =
        Native.objc_msgSend("float", this, "hyphenationFactor") as Float

    public open fun setHyphenationFactor(hyphenationFactor: Float): Unit {
        Native.objc_msgSend("void", this, "setHyphenationFactor:", hyphenationFactor)
    }

    public open fun defaultAttachmentScaling(): Any =
        Native.objc_msgSend("class objc.Any", this, "defaultAttachmentScaling")

    public open fun setDefaultAttachmentScaling(defaultAttachmentScaling: Any): Unit {
        Native.objc_msgSend("void", this, "setDefaultAttachmentScaling:", defaultAttachmentScaling)
    }

    public open fun typesetterBehavior(): Any =
        Native.objc_msgSend("class objc.Any", this, "typesetterBehavior")

    public open fun setTypesetterBehavior(typesetterBehavior: Any): Unit {
        Native.objc_msgSend("void", this, "setTypesetterBehavior:", typesetterBehavior)
    }

    public open fun layoutOptions(): Int =
        Native.objc_msgSend("int", this, "layoutOptions") as Int

    public open fun allowsNonContiguousLayout(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsNonContiguousLayout") as Boolean

    public open fun setAllowsNonContiguousLayout(allowsNonContiguousLayout: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsNonContiguousLayout:", allowsNonContiguousLayout)
    }

    public open fun hasNonContiguousLayout(): Boolean =
        Native.objc_msgSend("boolean", this, "hasNonContiguousLayout") as Boolean

    public open fun invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange(charRange: Any, delta: Int, actualCharRange: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:", charRange, delta, actualCharRange)
    }

    public open fun invalidateLayoutForCharacterRange_actualCharacterRange(charRange: Any, actualCharRange: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "invalidateLayoutForCharacterRange:actualCharacterRange:", charRange, actualCharRange)
    }

    public open fun invalidateLayoutForCharacterRange_isSoft_actualCharacterRange(charRange: Any, flag: Boolean, actualCharRange: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "invalidateLayoutForCharacterRange:isSoft:actualCharacterRange:", charRange, flag, actualCharRange)
    }

    public open fun invalidateDisplayForCharacterRange(charRange: Any): Unit {
        Native.objc_msgSend("void", this, "invalidateDisplayForCharacterRange:", charRange)
    }

    public open fun invalidateDisplayForGlyphRange(glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "invalidateDisplayForGlyphRange:", glyphRange)
    }

    public open fun textStorage_edited_range_changeInLength_invalidatedRange(str: NSTextStorage, editedMask: Any, newCharRange: Any, delta: Int, invalidatedCharRange: Any): Unit {
        Native.objc_msgSend("void", this, "textStorage:edited:range:changeInLength:invalidatedRange:", str, editedMask, newCharRange, delta, invalidatedCharRange)
    }

    public open fun ensureGlyphsForCharacterRange(charRange: Any): Unit {
        Native.objc_msgSend("void", this, "ensureGlyphsForCharacterRange:", charRange)
    }

    public open fun ensureGlyphsForGlyphRange(glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "ensureGlyphsForGlyphRange:", glyphRange)
    }

    public open fun ensureLayoutForCharacterRange(charRange: Any): Unit {
        Native.objc_msgSend("void", this, "ensureLayoutForCharacterRange:", charRange)
    }

    public open fun ensureLayoutForGlyphRange(glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "ensureLayoutForGlyphRange:", glyphRange)
    }

    public open fun ensureLayoutForTextContainer(container: NSTextContainer): Unit {
        Native.objc_msgSend("void", this, "ensureLayoutForTextContainer:", container)
    }

    public open fun ensureLayoutForBoundingRect_inTextContainer(bounds: Any, container: NSTextContainer): Unit {
        Native.objc_msgSend("void", this, "ensureLayoutForBoundingRect:inTextContainer:", bounds, container)
    }

    public open fun insertGlyphs_length_forStartingGlyphAtIndex_characterIndex(glyphs: Pointer<Int>, length: Int, glyphIndex: Int, charIndex: Int): Unit {
        Native.objc_msgSend("void", this, "insertGlyphs:length:forStartingGlyphAtIndex:characterIndex:", glyphs, length, glyphIndex, charIndex)
    }

    public open fun insertGlyph_atGlyphIndex_characterIndex(glyph: Int, glyphIndex: Int, charIndex: Int): Unit {
        Native.objc_msgSend("void", this, "insertGlyph:atGlyphIndex:characterIndex:", glyph, glyphIndex, charIndex)
    }

    public open fun replaceGlyphAtIndex_withGlyph(glyphIndex: Int, newGlyph: Int): Unit {
        Native.objc_msgSend("void", this, "replaceGlyphAtIndex:withGlyph:", glyphIndex, newGlyph)
    }

    public open fun deleteGlyphsInRange(glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "deleteGlyphsInRange:", glyphRange)
    }

    public open fun setCharacterIndex_forGlyphAtIndex(charIndex: Int, glyphIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setCharacterIndex:forGlyphAtIndex:", charIndex, glyphIndex)
    }

    public open fun setIntAttribute_value_forGlyphAtIndex(attributeTag: Int, `val`: Int, glyphIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setIntAttribute:value:forGlyphAtIndex:", attributeTag, `val`, glyphIndex)
    }

    public open fun invalidateGlyphsOnLayoutInvalidationForGlyphRange(glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "invalidateGlyphsOnLayoutInvalidationForGlyphRange:", glyphRange)
    }

    public open fun numberOfGlyphs(): Int =
        Native.objc_msgSend("int", this, "numberOfGlyphs") as Int

    public open fun glyphAtIndex_isValidIndex(glyphIndex: Int, isValidIndex: Pointer<Boolean>): Int =
        Native.objc_msgSend("int", this, "glyphAtIndex:isValidIndex:", glyphIndex, isValidIndex) as Int

    public open fun glyphAtIndex(glyphIndex: Int): Int =
        Native.objc_msgSend("int", this, "glyphAtIndex:", glyphIndex) as Int

    public open fun isValidGlyphIndex(glyphIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "isValidGlyphIndex:", glyphIndex) as Boolean

    public open fun characterIndexForGlyphAtIndex(glyphIndex: Int): Int =
        Native.objc_msgSend("int", this, "characterIndexForGlyphAtIndex:", glyphIndex) as Int

    public open fun glyphIndexForCharacterAtIndex(charIndex: Int): Int =
        Native.objc_msgSend("int", this, "glyphIndexForCharacterAtIndex:", charIndex) as Int

    public open fun intAttribute_forGlyphAtIndex(attributeTag: Int, glyphIndex: Int): Int =
        Native.objc_msgSend("int", this, "intAttribute:forGlyphAtIndex:", attributeTag, glyphIndex) as Int

    public open fun getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits(glyphRange: Any, glyphBuffer: Pointer<Int>, charIndexBuffer: Pointer<Int>, inscribeBuffer: Pointer<Any>, elasticBuffer: Pointer<Boolean>): Int =
        Native.objc_msgSend("int", this, "getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:", glyphRange, glyphBuffer, charIndexBuffer, inscribeBuffer, elasticBuffer) as Int

    public open fun getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels(glyphRange: Any, glyphBuffer: Pointer<Int>, charIndexBuffer: Pointer<Int>, inscribeBuffer: Pointer<Any>, elasticBuffer: Pointer<Boolean>, bidiLevelBuffer: Pointer<Byte>): Int =
        Native.objc_msgSend("int", this, "getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:bidiLevels:", glyphRange, glyphBuffer, charIndexBuffer, inscribeBuffer, elasticBuffer, bidiLevelBuffer) as Int

    public open fun getGlyphs_range(glyphArray: Pointer<Int>, glyphRange: Any): Int =
        Native.objc_msgSend("int", this, "getGlyphs:range:", glyphArray, glyphRange) as Int

    public open fun setTextContainer_forGlyphRange(container: NSTextContainer, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setTextContainer:forGlyphRange:", container, glyphRange)
    }

    public open fun setLineFragmentRect_forGlyphRange_usedRect(fragmentRect: Any, glyphRange: Any, usedRect: Any): Unit {
        Native.objc_msgSend("void", this, "setLineFragmentRect:forGlyphRange:usedRect:", fragmentRect, glyphRange, usedRect)
    }

    public open fun setExtraLineFragmentRect_usedRect_textContainer(fragmentRect: Any, usedRect: Any, container: NSTextContainer): Unit {
        Native.objc_msgSend("void", this, "setExtraLineFragmentRect:usedRect:textContainer:", fragmentRect, usedRect, container)
    }

    public open fun setLocation_forStartOfGlyphRange(location: Any, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setLocation:forStartOfGlyphRange:", location, glyphRange)
    }

    public open fun setLocations_startingGlyphIndexes_count_forGlyphRange(locations: Pointer<Any>, glyphIndexes: Pointer<Int>, count: Int, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setLocations:startingGlyphIndexes:count:forGlyphRange:", locations, glyphIndexes, count, glyphRange)
    }

    public open fun setNotShownAttribute_forGlyphAtIndex(flag: Boolean, glyphIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setNotShownAttribute:forGlyphAtIndex:", flag, glyphIndex)
    }

    public open fun setDrawsOutsideLineFragment_forGlyphAtIndex(flag: Boolean, glyphIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setDrawsOutsideLineFragment:forGlyphAtIndex:", flag, glyphIndex)
    }

    public open fun setAttachmentSize_forGlyphRange(attachmentSize: Any, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setAttachmentSize:forGlyphRange:", attachmentSize, glyphRange)
    }

    public open fun getFirstUnlaidCharacterIndex_glyphIndex(charIndex: Pointer<Int>, glyphIndex: Pointer<Int>): Unit {
        Native.objc_msgSend("void", this, "getFirstUnlaidCharacterIndex:glyphIndex:", charIndex, glyphIndex)
    }

    public open fun firstUnlaidCharacterIndex(): Int =
        Native.objc_msgSend("int", this, "firstUnlaidCharacterIndex") as Int

    public open fun firstUnlaidGlyphIndex(): Int =
        Native.objc_msgSend("int", this, "firstUnlaidGlyphIndex") as Int

    public open fun textContainerForGlyphAtIndex_effectiveRange(glyphIndex: Int, effectiveGlyphRange: Pointer<Any>): NSTextContainer =
        Native.objc_msgSend("class objc.NSTextContainer", this, "textContainerForGlyphAtIndex:effectiveRange:", glyphIndex, effectiveGlyphRange) as NSTextContainer

    public open fun usedRectForTextContainer(container: NSTextContainer): Any =
        Native.objc_msgSend("class objc.Any", this, "usedRectForTextContainer:", container)

    public open fun lineFragmentRectForGlyphAtIndex_effectiveRange(glyphIndex: Int, effectiveGlyphRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "lineFragmentRectForGlyphAtIndex:effectiveRange:", glyphIndex, effectiveGlyphRange)

    public open fun lineFragmentUsedRectForGlyphAtIndex_effectiveRange(glyphIndex: Int, effectiveGlyphRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "lineFragmentUsedRectForGlyphAtIndex:effectiveRange:", glyphIndex, effectiveGlyphRange)

    public open fun lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout(glyphIndex: Int, effectiveGlyphRange: Pointer<Any>, flag: Boolean): Any =
        Native.objc_msgSend("class objc.Any", this, "lineFragmentRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:", glyphIndex, effectiveGlyphRange, flag)

    public open fun lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout(glyphIndex: Int, effectiveGlyphRange: Pointer<Any>, flag: Boolean): Any =
        Native.objc_msgSend("class objc.Any", this, "lineFragmentUsedRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:", glyphIndex, effectiveGlyphRange, flag)

    public open fun textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout(glyphIndex: Int, effectiveGlyphRange: Pointer<Any>, flag: Boolean): NSTextContainer =
        Native.objc_msgSend("class objc.NSTextContainer", this, "textContainerForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:", glyphIndex, effectiveGlyphRange, flag) as NSTextContainer

    public open fun extraLineFragmentRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "extraLineFragmentRect")

    public open fun extraLineFragmentUsedRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "extraLineFragmentUsedRect")

    public open fun extraLineFragmentTextContainer(): NSTextContainer =
        Native.objc_msgSend("class objc.NSTextContainer", this, "extraLineFragmentTextContainer") as NSTextContainer

    public open fun locationForGlyphAtIndex(glyphIndex: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "locationForGlyphAtIndex:", glyphIndex)

    public open fun notShownAttributeForGlyphAtIndex(glyphIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "notShownAttributeForGlyphAtIndex:", glyphIndex) as Boolean

    public open fun drawsOutsideLineFragmentForGlyphAtIndex(glyphIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "drawsOutsideLineFragmentForGlyphAtIndex:", glyphIndex) as Boolean

    public open fun attachmentSizeForGlyphAtIndex(glyphIndex: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "attachmentSizeForGlyphAtIndex:", glyphIndex)

    public open fun setLayoutRect_forTextBlock_glyphRange(rect: Any, block: NSTextBlock, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setLayoutRect:forTextBlock:glyphRange:", rect, block, glyphRange)
    }

    public open fun setBoundsRect_forTextBlock_glyphRange(rect: Any, block: NSTextBlock, glyphRange: Any): Unit {
        Native.objc_msgSend("void", this, "setBoundsRect:forTextBlock:glyphRange:", rect, block, glyphRange)
    }

    public open fun layoutRectForTextBlock_glyphRange(block: NSTextBlock, glyphRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "layoutRectForTextBlock:glyphRange:", block, glyphRange)

    public open fun boundsRectForTextBlock_glyphRange(block: NSTextBlock, glyphRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "boundsRectForTextBlock:glyphRange:", block, glyphRange)

    public open fun layoutRectForTextBlock_atIndex_effectiveRange(block: NSTextBlock, glyphIndex: Int, effectiveGlyphRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "layoutRectForTextBlock:atIndex:effectiveRange:", block, glyphIndex, effectiveGlyphRange)

    public open fun boundsRectForTextBlock_atIndex_effectiveRange(block: NSTextBlock, glyphIndex: Int, effectiveGlyphRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "boundsRectForTextBlock:atIndex:effectiveRange:", block, glyphIndex, effectiveGlyphRange)

    public open fun glyphRangeForCharacterRange_actualCharacterRange(charRange: Any, actualCharRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "glyphRangeForCharacterRange:actualCharacterRange:", charRange, actualCharRange)

    public open fun characterRangeForGlyphRange_actualGlyphRange(glyphRange: Any, actualGlyphRange: Pointer<Any>): Any =
        Native.objc_msgSend("class objc.Any", this, "characterRangeForGlyphRange:actualGlyphRange:", glyphRange, actualGlyphRange)

    public open fun glyphRangeForTextContainer(container: NSTextContainer): Any =
        Native.objc_msgSend("class objc.Any", this, "glyphRangeForTextContainer:", container)

    public open fun rangeOfNominallySpacedGlyphsContainingIndex(glyphIndex: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeOfNominallySpacedGlyphsContainingIndex:", glyphIndex)

    public open fun rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount(charRange: Any, selCharRange: Any, container: NSTextContainer, rectCount: Pointer<Int>): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "rectArrayForCharacterRange:withinSelectedCharacterRange:inTextContainer:rectCount:", charRange, selCharRange, container, rectCount) as Pointer<Any>

    public open fun rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount(glyphRange: Any, selGlyphRange: Any, container: NSTextContainer, rectCount: Pointer<Int>): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "rectArrayForGlyphRange:withinSelectedGlyphRange:inTextContainer:rectCount:", glyphRange, selGlyphRange, container, rectCount) as Pointer<Any>

    public open fun boundingRectForGlyphRange_inTextContainer(glyphRange: Any, container: NSTextContainer): Any =
        Native.objc_msgSend("class objc.Any", this, "boundingRectForGlyphRange:inTextContainer:", glyphRange, container)

    public open fun glyphRangeForBoundingRect_inTextContainer(bounds: Any, container: NSTextContainer): Any =
        Native.objc_msgSend("class objc.Any", this, "glyphRangeForBoundingRect:inTextContainer:", bounds, container)

    public open fun glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer(bounds: Any, container: NSTextContainer): Any =
        Native.objc_msgSend("class objc.Any", this, "glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:", bounds, container)

    public open fun glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph(point: Any, container: NSTextContainer, partialFraction: Pointer<Double>): Int =
        Native.objc_msgSend("int", this, "glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:", point, container, partialFraction) as Int

    public open fun glyphIndexForPoint_inTextContainer(point: Any, container: NSTextContainer): Int =
        Native.objc_msgSend("int", this, "glyphIndexForPoint:inTextContainer:", point, container) as Int

    public open fun fractionOfDistanceThroughGlyphForPoint_inTextContainer(point: Any, container: NSTextContainer): Double =
        Native.objc_msgSend("double", this, "fractionOfDistanceThroughGlyphForPoint:inTextContainer:", point, container) as Double

    public open fun characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints(point: Any, container: NSTextContainer, partialFraction: Pointer<Double>): Int =
        Native.objc_msgSend("int", this, "characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:", point, container, partialFraction) as Int

    public open fun getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes(charIndex: Int, aFlag: Boolean, dFlag: Boolean, positions: Pointer<Double>, charIndexes: Pointer<Int>): Int =
        Native.objc_msgSend("int", this, "getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:", charIndex, aFlag, dFlag, positions, charIndexes) as Int

    public open fun temporaryAttributesAtCharacterIndex_effectiveRange(charIndex: Int, effectiveCharRange: Pointer<Any>): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "temporaryAttributesAtCharacterIndex:effectiveRange:", charIndex, effectiveCharRange) as NSDictionary

    public open fun setTemporaryAttributes_forCharacterRange(attrs: NSDictionary, charRange: Any): Unit {
        Native.objc_msgSend("void", this, "setTemporaryAttributes:forCharacterRange:", attrs, charRange)
    }

    public open fun addTemporaryAttributes_forCharacterRange(attrs: NSDictionary, charRange: Any): Unit {
        Native.objc_msgSend("void", this, "addTemporaryAttributes:forCharacterRange:", attrs, charRange)
    }

    public open fun removeTemporaryAttribute_forCharacterRange(attrName: NSString, charRange: Any): Unit {
        Native.objc_msgSend("void", this, "removeTemporaryAttribute:forCharacterRange:", attrName, charRange)
    }

    public open fun temporaryAttribute_atCharacterIndex_effectiveRange(attrName: NSString, location: Int, range: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "temporaryAttribute:atCharacterIndex:effectiveRange:", attrName, location, range) as ObjCObject

    public open fun temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange(attrName: NSString, location: Int, range: Pointer<Any>, rangeLimit: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "temporaryAttribute:atCharacterIndex:longestEffectiveRange:inRange:", attrName, location, range, rangeLimit) as ObjCObject

    public open fun temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange(location: Int, range: Pointer<Any>, rangeLimit: Any): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "temporaryAttributesAtCharacterIndex:longestEffectiveRange:inRange:", location, range, rangeLimit) as NSDictionary

    public open fun addTemporaryAttribute_value_forCharacterRange(attrName: NSString, value: ObjCObject, charRange: Any): Unit {
        Native.objc_msgSend("void", this, "addTemporaryAttribute:value:forCharacterRange:", attrName, value, charRange)
    }

    public open fun substituteFontForFont(originalFont: NSFont): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "substituteFontForFont:", originalFont) as NSFont

    public open fun defaultLineHeightForFont(theFont: NSFont): Double =
        Native.objc_msgSend("double", this, "defaultLineHeightForFont:", theFont) as Double

    public open fun defaultBaselineOffsetForFont(theFont: NSFont): Double =
        Native.objc_msgSend("double", this, "defaultBaselineOffsetForFont:", theFont) as Double

    public open fun usesFontLeading(): Boolean =
        Native.objc_msgSend("boolean", this, "usesFontLeading") as Boolean

    public open fun setUsesFontLeading(usesFontLeading: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesFontLeading:", usesFontLeading)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSGlyphStorage.metaclass, NSLayoutManager_NSTextViewSupport.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSLayoutManager")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSLayoutManager_NSTextViewSupport : IObjCObject {
    public open fun rulerMarkersForTextView_paragraphStyle_ruler(view: NSTextView, style: NSParagraphStyle, ruler: NSRulerView): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "rulerMarkersForTextView:paragraphStyle:ruler:", view, style, ruler) as NSArray

    public open fun rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled(view: NSTextView, style: NSParagraphStyle, ruler: NSRulerView, isEnabled: Boolean): NSView =
        Native.objc_msgSend("class objc.NSView", this, "rulerAccessoryViewForTextView:paragraphStyle:ruler:enabled:", view, style, ruler, isEnabled) as NSView

    public open fun layoutManagerOwnsFirstResponderInWindow(window: NSWindow): Boolean =
        Native.objc_msgSend("boolean", this, "layoutManagerOwnsFirstResponderInWindow:", window) as Boolean

    public open fun firstTextView(): NSTextView =
        Native.objc_msgSend("class objc.NSTextView", this, "firstTextView") as NSTextView

    public open fun textViewForBeginningOfSelection(): NSTextView =
        Native.objc_msgSend("class objc.NSTextView", this, "textViewForBeginningOfSelection") as NSTextView

    public open fun drawBackgroundForGlyphRange_atPoint(glyphsToShow: Any, origin: Any): Unit {
        Native.objc_msgSend("void", this, "drawBackgroundForGlyphRange:atPoint:", glyphsToShow, origin)
    }

    public open fun drawGlyphsForGlyphRange_atPoint(glyphsToShow: Any, origin: Any): Unit {
        Native.objc_msgSend("void", this, "drawGlyphsForGlyphRange:atPoint:", glyphsToShow, origin)
    }

    public open fun showCGGlyphs_positions_count_font_matrix_attributes_inContext(glyphs: Pointer<Short>, positions: Pointer<Any>, glyphCount: Int, font: NSFont, textMatrix: NSAffineTransform, attributes: NSDictionary, graphicsContext: NSGraphicsContext): Unit {
        Native.objc_msgSend("void", this, "showCGGlyphs:positions:count:font:matrix:attributes:inContext:", glyphs, positions, glyphCount, font, textMatrix, attributes, graphicsContext)
    }

    public open fun showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment(glyphs: Pointer<Char>, glyphLen: Int, glyphRange: Any, point: Any, font: NSFont, color: NSColor, printingAdjustment: Any): Unit {
        Native.objc_msgSend("void", this, "showPackedGlyphs:length:glyphRange:atPoint:font:color:printingAdjustment:", glyphs, glyphLen, glyphRange, point, font, color, printingAdjustment)
    }

    public open fun showAttachmentCell_inRect_characterIndex(cell: NSCell, rect: Any, attachmentIndex: Int): Unit {
        Native.objc_msgSend("void", this, "showAttachmentCell:inRect:characterIndex:", cell, rect, attachmentIndex)
    }

    public open fun fillBackgroundRectArray_count_forCharacterRange_color(rectArray: Pointer<Any>, rectCount: Int, charRange: Any, color: NSColor): Unit {
        Native.objc_msgSend("void", this, "fillBackgroundRectArray:count:forCharacterRange:color:", rectArray, rectCount, charRange, color)
    }

    public open fun drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(glyphRange: Any, underlineVal: Int, baselineOffset: Double, lineRect: Any, lineGlyphRange: Any, containerOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:", glyphRange, underlineVal, baselineOffset, lineRect, lineGlyphRange, containerOrigin)
    }

    public open fun underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(glyphRange: Any, underlineVal: Int, lineRect: Any, lineGlyphRange: Any, containerOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:", glyphRange, underlineVal, lineRect, lineGlyphRange, containerOrigin)
    }

    public open fun drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(glyphRange: Any, strikethroughVal: Int, baselineOffset: Double, lineRect: Any, lineGlyphRange: Any, containerOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:", glyphRange, strikethroughVal, baselineOffset, lineRect, lineGlyphRange, containerOrigin)
    }

    public open fun strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(glyphRange: Any, strikethroughVal: Int, lineRect: Any, lineGlyphRange: Any, containerOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:", glyphRange, strikethroughVal, lineRect, lineGlyphRange, containerOrigin)
    }

    trait metaclass : IObjCObject
}
