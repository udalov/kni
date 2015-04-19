// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSColorWell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSColorWell(pointer: Long) : NSControl(pointer) {
    public open fun deactivate(): Unit {
        Native.objc_msgSend("void", this, "deactivate")
    }

    public open fun activate(exclusive: Boolean): Unit {
        Native.objc_msgSend("void", this, "activate:", exclusive)
    }

    public open fun isActive(): Boolean =
        Native.objc_msgSend("boolean", this, "isActive") as Boolean

    public open fun drawWellInside(insideRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawWellInside:", insideRect)
    }

    public open fun isBordered(): Boolean =
        Native.objc_msgSend("boolean", this, "isBordered") as Boolean

    public open fun setBordered(bordered: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBordered:", bordered)
    }

    public open fun takeColorFrom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeColorFrom:", sender)
    }

    public open fun color(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "color") as NSColor

    public open fun setColor(color: NSColor): Unit {
        Native.objc_msgSend("void", this, "setColor:", color)
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

    trait metaclass : NSControl.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSColorWell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
