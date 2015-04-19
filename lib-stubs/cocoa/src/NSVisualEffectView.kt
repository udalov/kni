// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSVisualEffectView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSVisualEffectView(pointer: Long) : NSView(pointer) {
    public open fun material(): Any =
        Native.objc_msgSend("class objc.Any", this, "material")

    public open fun setMaterial(material: Any): Unit {
        Native.objc_msgSend("void", this, "setMaterial:", material)
    }

    public open fun interiorBackgroundStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "interiorBackgroundStyle")

    public open fun blendingMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "blendingMode")

    public open fun setBlendingMode(blendingMode: Any): Unit {
        Native.objc_msgSend("void", this, "setBlendingMode:", blendingMode)
    }

    public open fun state(): Any =
        Native.objc_msgSend("class objc.Any", this, "state")

    public open fun setState(state: Any): Unit {
        Native.objc_msgSend("void", this, "setState:", state)
    }

    public open fun maskImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "maskImage") as NSImage

    public open fun setMaskImage(maskImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setMaskImage:", maskImage)
    }

    override fun viewDidMoveToWindow(): Unit {
        Native.objc_msgSend("void", this, "viewDidMoveToWindow")
    }

    override fun viewWillMoveToWindow(newWindow: NSWindow): Unit {
        Native.objc_msgSend("void", this, "viewWillMoveToWindow:", newWindow)
    }

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

    companion object : NSObject(Native.objc_getClass("NSVisualEffectView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
