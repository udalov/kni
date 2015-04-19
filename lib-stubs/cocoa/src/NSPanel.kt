// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPanel.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPanel(pointer: Long) : NSWindow(pointer) {
    override fun isFloatingPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "isFloatingPanel") as Boolean

    public open fun setFloatingPanel(floatingPanel: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFloatingPanel:", floatingPanel)
    }

    public open fun becomesKeyOnlyIfNeeded(): Boolean =
        Native.objc_msgSend("boolean", this, "becomesKeyOnlyIfNeeded") as Boolean

    public open fun setBecomesKeyOnlyIfNeeded(becomesKeyOnlyIfNeeded: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBecomesKeyOnlyIfNeeded:", becomesKeyOnlyIfNeeded)
    }

    override fun worksWhenModal(): Boolean =
        Native.objc_msgSend("boolean", this, "worksWhenModal") as Boolean

    public open fun setWorksWhenModal(worksWhenModal: Boolean): Unit {
        Native.objc_msgSend("void", this, "setWorksWhenModal:", worksWhenModal)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

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

    trait metaclass : NSWindow.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPanel")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
