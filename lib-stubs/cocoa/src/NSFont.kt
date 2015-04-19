// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSFont.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFont(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    public open fun fontName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "fontName") as NSString

    public open fun pointSize(): Double =
        Native.objc_msgSend("double", this, "pointSize") as Double

    public open fun matrix(): Pointer<Double> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "matrix") as Pointer<Double>

    public open fun familyName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "familyName") as NSString

    public open fun displayName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "displayName") as NSString

    public open fun fontDescriptor(): NSFontDescriptor =
        Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptor") as NSFontDescriptor

    public open fun textTransform(): NSAffineTransform =
        Native.objc_msgSend("class objc.NSAffineTransform", this, "textTransform") as NSAffineTransform

    public open fun numberOfGlyphs(): Int =
        Native.objc_msgSend("int", this, "numberOfGlyphs") as Int

    public open fun mostCompatibleStringEncoding(): Int =
        Native.objc_msgSend("int", this, "mostCompatibleStringEncoding") as Int

    public open fun glyphWithName(aName: NSString): Int =
        Native.objc_msgSend("int", this, "glyphWithName:", aName) as Int

    public open fun coveredCharacterSet(): NSCharacterSet =
        Native.objc_msgSend("class objc.NSCharacterSet", this, "coveredCharacterSet") as NSCharacterSet

    public open fun boundingRectForFont(): Any =
        Native.objc_msgSend("class objc.Any", this, "boundingRectForFont")

    public open fun maximumAdvancement(): Any =
        Native.objc_msgSend("class objc.Any", this, "maximumAdvancement")

    public open fun ascender(): Double =
        Native.objc_msgSend("double", this, "ascender") as Double

    public open fun descender(): Double =
        Native.objc_msgSend("double", this, "descender") as Double

    public open fun leading(): Double =
        Native.objc_msgSend("double", this, "leading") as Double

    public open fun underlinePosition(): Double =
        Native.objc_msgSend("double", this, "underlinePosition") as Double

    public open fun underlineThickness(): Double =
        Native.objc_msgSend("double", this, "underlineThickness") as Double

    public open fun italicAngle(): Double =
        Native.objc_msgSend("double", this, "italicAngle") as Double

    public open fun capHeight(): Double =
        Native.objc_msgSend("double", this, "capHeight") as Double

    public open fun xHeight(): Double =
        Native.objc_msgSend("double", this, "xHeight") as Double

    public open fun isFixedPitch(): Boolean =
        Native.objc_msgSend("boolean", this, "isFixedPitch") as Boolean

    public open fun boundingRectForGlyph(aGlyph: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "boundingRectForGlyph:", aGlyph)

    public open fun advancementForGlyph(ag: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "advancementForGlyph:", ag)

    public open fun getBoundingRects_forGlyphs_count(bounds: Pointer<Any>, glyphs: Pointer<Int>, glyphCount: Int): Unit {
        Native.objc_msgSend("void", this, "getBoundingRects:forGlyphs:count:", bounds, glyphs, glyphCount)
    }

    public open fun getAdvancements_forGlyphs_count(advancements: Pointer<Any>, glyphs: Pointer<Int>, glyphCount: Int): Unit {
        Native.objc_msgSend("void", this, "getAdvancements:forGlyphs:count:", advancements, glyphs, glyphCount)
    }

    public open fun getAdvancements_forPackedGlyphs_length(advancements: Pointer<Any>, packedGlyphs: Pointer<Unit>, length: Int): Unit {
        Native.objc_msgSend("void", this, "getAdvancements:forPackedGlyphs:length:", advancements, packedGlyphs, length)
    }

    public open fun set(): Unit {
        Native.objc_msgSend("void", this, "set")
    }

    public open fun setInContext(graphicsContext: NSGraphicsContext): Unit {
        Native.objc_msgSend("void", this, "setInContext:", graphicsContext)
    }

    public open fun printerFont(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "printerFont") as NSFont

    public open fun screenFont(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "screenFont") as NSFont

    public open fun screenFontWithRenderingMode(renderingMode: Any): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "screenFontWithRenderingMode:", renderingMode) as NSFont

    public open fun renderingMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "renderingMode")

    public open fun verticalFont(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "verticalFont") as NSFont

    public open fun isVertical(): Boolean =
        Native.objc_msgSend("boolean", this, "isVertical") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
        public open fun fontWithName_size(fontName: NSString, fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "fontWithName:size:", fontName, fontSize) as NSFont

        public open fun fontWithName_matrix(fontName: NSString, fontMatrix: Pointer<Double>): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "fontWithName:matrix:", fontName, fontMatrix) as NSFont

        public open fun fontWithDescriptor_size(fontDescriptor: NSFontDescriptor, fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "fontWithDescriptor:size:", fontDescriptor, fontSize) as NSFont

        public open fun fontWithDescriptor_textTransform(fontDescriptor: NSFontDescriptor, textTransform: NSAffineTransform): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "fontWithDescriptor:textTransform:", fontDescriptor, textTransform) as NSFont

        public open fun userFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "userFontOfSize:", fontSize) as NSFont

        public open fun userFixedPitchFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "userFixedPitchFontOfSize:", fontSize) as NSFont

        public open fun setUserFont(aFont: NSFont): Unit {
            Native.objc_msgSend("void", this, "setUserFont:", aFont)
        }

        public open fun setUserFixedPitchFont(aFont: NSFont): Unit {
            Native.objc_msgSend("void", this, "setUserFixedPitchFont:", aFont)
        }

        public open fun systemFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "systemFontOfSize:", fontSize) as NSFont

        public open fun boldSystemFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "boldSystemFontOfSize:", fontSize) as NSFont

        public open fun labelFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "labelFontOfSize:", fontSize) as NSFont

        public open fun titleBarFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "titleBarFontOfSize:", fontSize) as NSFont

        public open fun menuFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "menuFontOfSize:", fontSize) as NSFont

        public open fun menuBarFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "menuBarFontOfSize:", fontSize) as NSFont

        public open fun messageFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "messageFontOfSize:", fontSize) as NSFont

        public open fun paletteFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "paletteFontOfSize:", fontSize) as NSFont

        public open fun toolTipsFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "toolTipsFontOfSize:", fontSize) as NSFont

        public open fun controlContentFontOfSize(fontSize: Double): NSFont =
            Native.objc_msgSend("class objc.NSFont", this, "controlContentFontOfSize:", fontSize) as NSFont

        public open fun systemFontSize(): Double =
            Native.objc_msgSend("double", this, "systemFontSize") as Double

        public open fun smallSystemFontSize(): Double =
            Native.objc_msgSend("double", this, "smallSystemFontSize") as Double

        public open fun labelFontSize(): Double =
            Native.objc_msgSend("double", this, "labelFontSize") as Double

        public open fun systemFontSizeForControlSize(controlSize: Any): Double =
            Native.objc_msgSend("double", this, "systemFontSizeForControlSize:", controlSize) as Double

    }

    companion object : NSObject(Native.objc_getClass("NSFont")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
