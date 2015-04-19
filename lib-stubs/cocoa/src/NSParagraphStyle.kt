// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSParagraphStyle.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTextTab(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun initWithTextAlignment_location_options(alignment: Any, loc: Double, options: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTextAlignment:location:options:", alignment, loc, options) as ObjCObject

    public open fun alignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "alignment")

    public open fun options(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "options") as NSDictionary

    public open fun initWithType_location(type: Any, loc: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithType:location:", type, loc) as ObjCObject

    public open fun location(): Double =
        Native.objc_msgSend("double", this, "location") as Double

    public open fun tabStopType(): Any =
        Native.objc_msgSend("class objc.Any", this, "tabStopType")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextTab")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSParagraphStyle(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSSecureCoding {
    public open fun lineSpacing(): Double =
        Native.objc_msgSend("double", this, "lineSpacing") as Double

    public open fun paragraphSpacing(): Double =
        Native.objc_msgSend("double", this, "paragraphSpacing") as Double

    public open fun alignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "alignment")

    public open fun headIndent(): Double =
        Native.objc_msgSend("double", this, "headIndent") as Double

    public open fun tailIndent(): Double =
        Native.objc_msgSend("double", this, "tailIndent") as Double

    public open fun firstLineHeadIndent(): Double =
        Native.objc_msgSend("double", this, "firstLineHeadIndent") as Double

    public open fun tabStops(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "tabStops") as NSArray

    public open fun minimumLineHeight(): Double =
        Native.objc_msgSend("double", this, "minimumLineHeight") as Double

    public open fun maximumLineHeight(): Double =
        Native.objc_msgSend("double", this, "maximumLineHeight") as Double

    public open fun lineBreakMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "lineBreakMode")

    public open fun baseWritingDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "baseWritingDirection")

    public open fun lineHeightMultiple(): Double =
        Native.objc_msgSend("double", this, "lineHeightMultiple") as Double

    public open fun paragraphSpacingBefore(): Double =
        Native.objc_msgSend("double", this, "paragraphSpacingBefore") as Double

    public open fun defaultTabInterval(): Double =
        Native.objc_msgSend("double", this, "defaultTabInterval") as Double

    public open fun textBlocks(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "textBlocks") as NSArray

    public open fun textLists(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "textLists") as NSArray

    public open fun hyphenationFactor(): Float =
        Native.objc_msgSend("float", this, "hyphenationFactor") as Float

    public open fun tighteningFactorForTruncation(): Float =
        Native.objc_msgSend("float", this, "tighteningFactorForTruncation") as Float

    public open fun headerLevel(): Int =
        Native.objc_msgSend("int", this, "headerLevel") as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSSecureCoding.metaclass {
        public open fun defaultParagraphStyle(): NSParagraphStyle =
            Native.objc_msgSend("class objc.NSParagraphStyle", this, "defaultParagraphStyle") as NSParagraphStyle

        public open fun defaultWritingDirectionForLanguage(languageName: NSString): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultWritingDirectionForLanguage:", languageName)

    }

    companion object : NSObject(Native.objc_getClass("NSParagraphStyle")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableParagraphStyle(pointer: Long) : NSParagraphStyle(pointer) {
    override fun lineSpacing(): Double =
        Native.objc_msgSend("double", this, "lineSpacing") as Double

    public open fun setLineSpacing(lineSpacing: Double): Unit {
        Native.objc_msgSend("void", this, "setLineSpacing:", lineSpacing)
    }

    override fun paragraphSpacing(): Double =
        Native.objc_msgSend("double", this, "paragraphSpacing") as Double

    public open fun setParagraphSpacing(paragraphSpacing: Double): Unit {
        Native.objc_msgSend("void", this, "setParagraphSpacing:", paragraphSpacing)
    }

    override fun alignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "alignment")

    public open fun setAlignment(alignment: Any): Unit {
        Native.objc_msgSend("void", this, "setAlignment:", alignment)
    }

    override fun headIndent(): Double =
        Native.objc_msgSend("double", this, "headIndent") as Double

    public open fun setHeadIndent(headIndent: Double): Unit {
        Native.objc_msgSend("void", this, "setHeadIndent:", headIndent)
    }

    override fun tailIndent(): Double =
        Native.objc_msgSend("double", this, "tailIndent") as Double

    public open fun setTailIndent(tailIndent: Double): Unit {
        Native.objc_msgSend("void", this, "setTailIndent:", tailIndent)
    }

    override fun firstLineHeadIndent(): Double =
        Native.objc_msgSend("double", this, "firstLineHeadIndent") as Double

    public open fun setFirstLineHeadIndent(firstLineHeadIndent: Double): Unit {
        Native.objc_msgSend("void", this, "setFirstLineHeadIndent:", firstLineHeadIndent)
    }

    public open fun addTabStop(anObject: NSTextTab): Unit {
        Native.objc_msgSend("void", this, "addTabStop:", anObject)
    }

    public open fun removeTabStop(anObject: NSTextTab): Unit {
        Native.objc_msgSend("void", this, "removeTabStop:", anObject)
    }

    override fun tabStops(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "tabStops") as NSArray

    public open fun setTabStops(tabStops: NSArray): Unit {
        Native.objc_msgSend("void", this, "setTabStops:", tabStops)
    }

    override fun minimumLineHeight(): Double =
        Native.objc_msgSend("double", this, "minimumLineHeight") as Double

    public open fun setMinimumLineHeight(minimumLineHeight: Double): Unit {
        Native.objc_msgSend("void", this, "setMinimumLineHeight:", minimumLineHeight)
    }

    override fun maximumLineHeight(): Double =
        Native.objc_msgSend("double", this, "maximumLineHeight") as Double

    public open fun setMaximumLineHeight(maximumLineHeight: Double): Unit {
        Native.objc_msgSend("void", this, "setMaximumLineHeight:", maximumLineHeight)
    }

    override fun lineBreakMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "lineBreakMode")

    public open fun setLineBreakMode(lineBreakMode: Any): Unit {
        Native.objc_msgSend("void", this, "setLineBreakMode:", lineBreakMode)
    }

    public open fun setParagraphStyle(obj: NSParagraphStyle): Unit {
        Native.objc_msgSend("void", this, "setParagraphStyle:", obj)
    }

    override fun baseWritingDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "baseWritingDirection")

    public open fun setBaseWritingDirection(baseWritingDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setBaseWritingDirection:", baseWritingDirection)
    }

    override fun lineHeightMultiple(): Double =
        Native.objc_msgSend("double", this, "lineHeightMultiple") as Double

    public open fun setLineHeightMultiple(lineHeightMultiple: Double): Unit {
        Native.objc_msgSend("void", this, "setLineHeightMultiple:", lineHeightMultiple)
    }

    override fun paragraphSpacingBefore(): Double =
        Native.objc_msgSend("double", this, "paragraphSpacingBefore") as Double

    public open fun setParagraphSpacingBefore(paragraphSpacingBefore: Double): Unit {
        Native.objc_msgSend("void", this, "setParagraphSpacingBefore:", paragraphSpacingBefore)
    }

    override fun defaultTabInterval(): Double =
        Native.objc_msgSend("double", this, "defaultTabInterval") as Double

    public open fun setDefaultTabInterval(defaultTabInterval: Double): Unit {
        Native.objc_msgSend("void", this, "setDefaultTabInterval:", defaultTabInterval)
    }

    override fun textBlocks(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "textBlocks") as NSArray

    public open fun setTextBlocks(textBlocks: NSArray): Unit {
        Native.objc_msgSend("void", this, "setTextBlocks:", textBlocks)
    }

    override fun textLists(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "textLists") as NSArray

    public open fun setTextLists(textLists: NSArray): Unit {
        Native.objc_msgSend("void", this, "setTextLists:", textLists)
    }

    override fun hyphenationFactor(): Float =
        Native.objc_msgSend("float", this, "hyphenationFactor") as Float

    public open fun setHyphenationFactor(hyphenationFactor: Float): Unit {
        Native.objc_msgSend("void", this, "setHyphenationFactor:", hyphenationFactor)
    }

    override fun tighteningFactorForTruncation(): Float =
        Native.objc_msgSend("float", this, "tighteningFactorForTruncation") as Float

    public open fun setTighteningFactorForTruncation(tighteningFactorForTruncation: Float): Unit {
        Native.objc_msgSend("void", this, "setTighteningFactorForTruncation:", tighteningFactorForTruncation)
    }

    override fun headerLevel(): Int =
        Native.objc_msgSend("int", this, "headerLevel") as Int

    public open fun setHeaderLevel(headerLevel: Int): Unit {
        Native.objc_msgSend("void", this, "setHeaderLevel:", headerLevel)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSParagraphStyle.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMutableParagraphStyle")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
