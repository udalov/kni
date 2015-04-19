// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSColorPanel.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSColorPanel(pointer: Long) : NSPanel(pointer) {
    public open fun accessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "accessoryView") as NSView

    public open fun setAccessoryView(accessoryView: NSView): Unit {
        Native.objc_msgSend("void", this, "setAccessoryView:", accessoryView)
    }

    public open fun isContinuous(): Boolean =
        Native.objc_msgSend("boolean", this, "isContinuous") as Boolean

    public open fun setContinuous(continuous: Boolean): Unit {
        Native.objc_msgSend("void", this, "setContinuous:", continuous)
    }

    public open fun showsAlpha(): Boolean =
        Native.objc_msgSend("boolean", this, "showsAlpha") as Boolean

    public open fun setShowsAlpha(showsAlpha: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsAlpha:", showsAlpha)
    }

    public open fun mode(): Any =
        Native.objc_msgSend("class objc.Any", this, "mode")

    public open fun setMode(mode: Any): Unit {
        Native.objc_msgSend("void", this, "setMode:", mode)
    }

    public open fun color(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "color") as NSColor

    public open fun setColor(color: NSColor): Unit {
        Native.objc_msgSend("void", this, "setColor:", color)
    }

    public open fun alpha(): Double =
        Native.objc_msgSend("double", this, "alpha") as Double

    public open fun setAction(aSelector: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", aSelector)
    }

    public open fun setTarget(anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", anObject)
    }

    public open fun attachColorList(colorList: NSColorList): Unit {
        Native.objc_msgSend("void", this, "attachColorList:", colorList)
    }

    public open fun detachColorList(colorList: NSColorList): Unit {
        Native.objc_msgSend("void", this, "detachColorList:", colorList)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun isFloatingPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "isFloatingPanel") as Boolean

    override fun keyDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "keyDown:", theEvent)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun tryToPerform_with(anAction: ObjCSelector, anObject: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "tryToPerform:with:", anAction, anObject) as Boolean

    override fun validRequestorForSendType_returnType(sendType: NSString, returnType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "validRequestorForSendType:returnType:", sendType, returnType) as ObjCObject

    override fun worksWhenModal(): Boolean =
        Native.objc_msgSend("boolean", this, "worksWhenModal") as Boolean

    trait metaclass : NSPanel.metaclass {
        public open fun sharedColorPanel(): NSColorPanel =
            Native.objc_msgSend("class objc.NSColorPanel", this, "sharedColorPanel") as NSColorPanel

        public open fun sharedColorPanelExists(): Boolean =
            Native.objc_msgSend("boolean", this, "sharedColorPanelExists") as Boolean

        public open fun dragColor_withEvent_fromView(color: NSColor, theEvent: NSEvent, sourceView: NSView): Boolean =
            Native.objc_msgSend("boolean", this, "dragColor:withEvent:fromView:", color, theEvent, sourceView) as Boolean

        public open fun setPickerMask(mask: Any): Unit {
            Native.objc_msgSend("void", this, "setPickerMask:", mask)
        }

        public open fun setPickerMode(mode: Any): Unit {
            Native.objc_msgSend("void", this, "setPickerMode:", mode)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSColorPanel")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSApplication_NSColorPanel : IObjCObject {
    public open fun orderFrontColorPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontColorPanel:", sender)
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSColorPanelResponderMethod : IObjCObject {
    public open fun changeColor(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "changeColor:", sender)
    }

    trait metaclass : IObjCObject
}
