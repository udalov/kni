// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSFontPanel.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFontPanel(pointer: Long) : NSPanel(pointer) {
    public open fun accessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "accessoryView") as NSView

    public open fun setAccessoryView(accessoryView: NSView): Unit {
        Native.objc_msgSend("void", this, "setAccessoryView:", accessoryView)
    }

    public open fun setPanelFont_isMultiple(fontObj: NSFont, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPanelFont:isMultiple:", fontObj, flag)
    }

    public open fun panelConvertFont(fontObj: NSFont): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "panelConvertFont:", fontObj) as NSFont

    override fun worksWhenModal(): Boolean =
        Native.objc_msgSend("boolean", this, "worksWhenModal") as Boolean

    override fun setWorksWhenModal(worksWhenModal: Boolean): Unit {
        Native.objc_msgSend("void", this, "setWorksWhenModal:", worksWhenModal)
    }

    public open fun isEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabled") as Boolean

    public open fun setEnabled(enabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEnabled:", enabled)
    }

    public open fun reloadDefaultFontFamilies(): Unit {
        Native.objc_msgSend("void", this, "reloadDefaultFontFamilies")
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

    trait metaclass : NSPanel.metaclass {
        public open fun sharedFontPanel(): NSFontPanel =
            Native.objc_msgSend("class objc.NSFontPanel", this, "sharedFontPanel") as NSFontPanel

        public open fun sharedFontPanelExists(): Boolean =
            Native.objc_msgSend("boolean", this, "sharedFontPanelExists") as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSFontPanel")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSFontPanelValidationAdditions : IObjCObject {
    public open fun validModesForFontPanel(fontPanel: NSFontPanel): Int =
        Native.objc_msgSend("int", this, "validModesForFontPanel:", fontPanel) as Int

    trait metaclass : IObjCObject
}
