// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSText.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTextDelegate {
    trait metaclass
}

public open class NSText(pointer: Long) : NSView(pointer), NSChangeSpelling, NSIgnoreMisspelledWords {
    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun string(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "string") as NSString

    public open fun setString(string: NSString): Unit {
        Native.objc_msgSend("void", this, "setString:", string)
    }

    public open fun replaceCharactersInRange_withString(range: Any, aString: NSString): Unit {
        Native.objc_msgSend("void", this, "replaceCharactersInRange:withString:", range, aString)
    }

    public open fun replaceCharactersInRange_withRTF(range: Any, rtfData: NSData): Unit {
        Native.objc_msgSend("void", this, "replaceCharactersInRange:withRTF:", range, rtfData)
    }

    public open fun replaceCharactersInRange_withRTFD(range: Any, rtfdData: NSData): Unit {
        Native.objc_msgSend("void", this, "replaceCharactersInRange:withRTFD:", range, rtfdData)
    }

    public open fun RTFFromRange(range: Any): NSData =
        Native.objc_msgSend("class objc.NSData", this, "RTFFromRange:", range) as NSData

    public open fun RTFDFromRange(range: Any): NSData =
        Native.objc_msgSend("class objc.NSData", this, "RTFDFromRange:", range) as NSData

    public open fun writeRTFDToFile_atomically(path: NSString, flag: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "writeRTFDToFile:atomically:", path, flag) as Boolean

    public open fun readRTFDFromFile(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "readRTFDFromFile:", path) as Boolean

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    public open fun setEditable(editable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEditable:", editable)
    }

    public open fun isSelectable(): Boolean =
        Native.objc_msgSend("boolean", this, "isSelectable") as Boolean

    public open fun setSelectable(selectable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectable:", selectable)
    }

    public open fun isRichText(): Boolean =
        Native.objc_msgSend("boolean", this, "isRichText") as Boolean

    public open fun setRichText(richText: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRichText:", richText)
    }

    public open fun importsGraphics(): Boolean =
        Native.objc_msgSend("boolean", this, "importsGraphics") as Boolean

    public open fun setImportsGraphics(importsGraphics: Boolean): Unit {
        Native.objc_msgSend("void", this, "setImportsGraphics:", importsGraphics)
    }

    public open fun isFieldEditor(): Boolean =
        Native.objc_msgSend("boolean", this, "isFieldEditor") as Boolean

    public open fun setFieldEditor(fieldEditor: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFieldEditor:", fieldEditor)
    }

    public open fun usesFontPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "usesFontPanel") as Boolean

    public open fun setUsesFontPanel(usesFontPanel: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesFontPanel:", usesFontPanel)
    }

    public open fun drawsBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsBackground") as Boolean

    public open fun setDrawsBackground(drawsBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsBackground:", drawsBackground)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun isRulerVisible(): Boolean =
        Native.objc_msgSend("boolean", this, "isRulerVisible") as Boolean

    public open fun selectedRange(): Any =
        Native.objc_msgSend("class objc.Any", this, "selectedRange")

    public open fun setSelectedRange(selectedRange: Any): Unit {
        Native.objc_msgSend("void", this, "setSelectedRange:", selectedRange)
    }

    public open fun scrollRangeToVisible(range: Any): Unit {
        Native.objc_msgSend("void", this, "scrollRangeToVisible:", range)
    }

    public open fun font(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "font") as NSFont

    public open fun setFont(font: NSFont): Unit {
        Native.objc_msgSend("void", this, "setFont:", font)
    }

    public open fun textColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "textColor") as NSColor

    public open fun setTextColor(textColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setTextColor:", textColor)
    }

    public open fun alignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "alignment")

    public open fun setAlignment(alignment: Any): Unit {
        Native.objc_msgSend("void", this, "setAlignment:", alignment)
    }

    public open fun baseWritingDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "baseWritingDirection")

    public open fun setBaseWritingDirection(baseWritingDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setBaseWritingDirection:", baseWritingDirection)
    }

    public open fun setTextColor_range(color: NSColor, range: Any): Unit {
        Native.objc_msgSend("void", this, "setTextColor:range:", color, range)
    }

    public open fun setFont_range(font: NSFont, range: Any): Unit {
        Native.objc_msgSend("void", this, "setFont:range:", font, range)
    }

    public open fun maxSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "maxSize")

    public open fun setMaxSize(maxSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMaxSize:", maxSize)
    }

    public open fun minSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "minSize")

    public open fun setMinSize(minSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMinSize:", minSize)
    }

    public open fun isHorizontallyResizable(): Boolean =
        Native.objc_msgSend("boolean", this, "isHorizontallyResizable") as Boolean

    public open fun setHorizontallyResizable(horizontallyResizable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHorizontallyResizable:", horizontallyResizable)
    }

    public open fun isVerticallyResizable(): Boolean =
        Native.objc_msgSend("boolean", this, "isVerticallyResizable") as Boolean

    public open fun setVerticallyResizable(verticallyResizable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setVerticallyResizable:", verticallyResizable)
    }

    public open fun sizeToFit(): Unit {
        Native.objc_msgSend("void", this, "sizeToFit")
    }

    public open fun copy(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "copy:", sender)
    }

    public open fun copyFont(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "copyFont:", sender)
    }

    public open fun copyRuler(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "copyRuler:", sender)
    }

    public open fun cut(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "cut:", sender)
    }

    public open fun delete(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "delete:", sender)
    }

    public open fun paste(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "paste:", sender)
    }

    public open fun pasteFont(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "pasteFont:", sender)
    }

    public open fun pasteRuler(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "pasteRuler:", sender)
    }

    override fun selectAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectAll:", sender)
    }

    override fun changeFont(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "changeFont:", sender)
    }

    public open fun alignLeft(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "alignLeft:", sender)
    }

    public open fun alignRight(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "alignRight:", sender)
    }

    public open fun alignCenter(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "alignCenter:", sender)
    }

    public open fun subscript(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "subscript:", sender)
    }

    public open fun superscript(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "superscript:", sender)
    }

    public open fun underline(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "underline:", sender)
    }

    public open fun unscript(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "unscript:", sender)
    }

    public open fun showGuessPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "showGuessPanel:", sender)
    }

    public open fun checkSpelling(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "checkSpelling:", sender)
    }

    public open fun toggleRuler(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleRuler:", sender)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass, NSChangeSpelling.metaclass, NSIgnoreMisspelledWords.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSText")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
