// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSImageView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSImageView(pointer: Long) : NSControl(pointer), NSAccessibilityImage {
    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
    }

    public open fun imageAlignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageAlignment")

    public open fun setImageAlignment(imageAlignment: Any): Unit {
        Native.objc_msgSend("void", this, "setImageAlignment:", imageAlignment)
    }

    public open fun imageScaling(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageScaling")

    public open fun setImageScaling(imageScaling: Any): Unit {
        Native.objc_msgSend("void", this, "setImageScaling:", imageScaling)
    }

    public open fun imageFrameStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageFrameStyle")

    public open fun setImageFrameStyle(imageFrameStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setImageFrameStyle:", imageFrameStyle)
    }

    public open fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    public open fun setEditable(editable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEditable:", editable)
    }

    public open fun animates(): Boolean =
        Native.objc_msgSend("boolean", this, "animates") as Boolean

    public open fun setAnimates(animates: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAnimates:", animates)
    }

    public open fun allowsCutCopyPaste(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsCutCopyPaste") as Boolean

    public open fun setAllowsCutCopyPaste(allowsCutCopyPaste: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsCutCopyPaste:", allowsCutCopyPaste)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun mouseDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDown:", theEvent)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    override fun refusesFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "refusesFirstResponder") as Boolean

    override fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    trait metaclass : NSControl.metaclass, NSAccessibilityImage.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSImageView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
