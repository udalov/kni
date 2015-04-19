// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTableCellView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTableCellView(pointer: Long) : NSView(pointer) {
    public open fun objectValue(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectValue") as ObjCObject

    public open fun setObjectValue(objectValue: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setObjectValue:", objectValue)
    }

    public open fun textField(): NSTextField =
        Native.objc_msgSend("class objc.NSTextField", this, "textField") as NSTextField

    public open fun setTextField(textField: NSTextField): Unit {
        Native.objc_msgSend("void", this, "setTextField:", textField)
    }

    public open fun imageView(): NSImageView =
        Native.objc_msgSend("class objc.NSImageView", this, "imageView") as NSImageView

    public open fun setImageView(imageView: NSImageView): Unit {
        Native.objc_msgSend("void", this, "setImageView:", imageView)
    }

    public open fun backgroundStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "backgroundStyle")

    public open fun setBackgroundStyle(backgroundStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setBackgroundStyle:", backgroundStyle)
    }

    public open fun rowSizeStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "rowSizeStyle")

    public open fun setRowSizeStyle(rowSizeStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setRowSizeStyle:", rowSizeStyle)
    }

    public open fun draggingImageComponents(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "draggingImageComponents") as NSArray

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTableCellView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
