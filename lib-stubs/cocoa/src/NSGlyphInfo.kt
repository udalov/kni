// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSGlyphInfo.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSGlyphInfo(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    public open fun glyphName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "glyphName") as NSString

    public open fun characterIdentifier(): Int =
        Native.objc_msgSend("int", this, "characterIdentifier") as Int

    public open fun characterCollection(): Any =
        Native.objc_msgSend("class objc.Any", this, "characterCollection")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
        public open fun glyphInfoWithGlyphName_forFont_baseString(glyphName: NSString, font: NSFont, theString: NSString): NSGlyphInfo =
            Native.objc_msgSend("class objc.NSGlyphInfo", this, "glyphInfoWithGlyphName:forFont:baseString:", glyphName, font, theString) as NSGlyphInfo

        public open fun glyphInfoWithGlyph_forFont_baseString(glyph: Int, font: NSFont, theString: NSString): NSGlyphInfo =
            Native.objc_msgSend("class objc.NSGlyphInfo", this, "glyphInfoWithGlyph:forFont:baseString:", glyph, font, theString) as NSGlyphInfo

        public open fun glyphInfoWithCharacterIdentifier_collection_baseString(cid: Int, characterCollection: Any, theString: NSString): NSGlyphInfo =
            Native.objc_msgSend("class objc.NSGlyphInfo", this, "glyphInfoWithCharacterIdentifier:collection:baseString:", cid, characterCollection, theString) as NSGlyphInfo

    }

    companion object : NSObject(Native.objc_getClass("NSGlyphInfo")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
