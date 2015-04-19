// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSGlyphGenerator.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSGlyphStorage {
    trait metaclass
}

public open class NSGlyphGenerator(pointer: Long) : NSObject(pointer) {
    public open fun generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex(glyphStorage: Any, nChars: Int, glyphIndex: Pointer<Int>, charIndex: Pointer<Int>): Unit {
        Native.objc_msgSend("void", this, "generateGlyphsForGlyphStorage:desiredNumberOfCharacters:glyphIndex:characterIndex:", glyphStorage, nChars, glyphIndex, charIndex)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun sharedGlyphGenerator(): NSGlyphGenerator =
            Native.objc_msgSend("class objc.NSGlyphGenerator", this, "sharedGlyphGenerator") as NSGlyphGenerator

    }

    companion object : NSObject(Native.objc_getClass("NSGlyphGenerator")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
