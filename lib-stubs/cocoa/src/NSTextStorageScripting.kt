// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextStorageScripting.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTextStorage_Scripting : IObjCObject {
    public open fun attributeRuns(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "attributeRuns") as NSArray

    public open fun setAttributeRuns(attributeRuns: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAttributeRuns:", attributeRuns)
    }

    public open fun paragraphs(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "paragraphs") as NSArray

    public open fun setParagraphs(paragraphs: NSArray): Unit {
        Native.objc_msgSend("void", this, "setParagraphs:", paragraphs)
    }

    public open fun words(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "words") as NSArray

    public open fun setWords(words: NSArray): Unit {
        Native.objc_msgSend("void", this, "setWords:", words)
    }

    public open fun characters(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "characters") as NSArray

    public open fun setCharacters(characters: NSArray): Unit {
        Native.objc_msgSend("void", this, "setCharacters:", characters)
    }

    public open fun font(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "font") as NSFont

    public open fun setFont(font: NSFont): Unit {
        Native.objc_msgSend("void", this, "setFont:", font)
    }

    public open fun foregroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "foregroundColor") as NSColor

    public open fun setForegroundColor(foregroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setForegroundColor:", foregroundColor)
    }

    trait metaclass : IObjCObject
}
