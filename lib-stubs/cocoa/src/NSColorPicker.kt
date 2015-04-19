// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSColorPicker.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSColorPicker(pointer: Long) : NSObject(pointer), NSColorPickingDefault {
    public open fun initWithPickerMask_colorPanel(mask: Int, owningColorPanel: NSColorPanel): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPickerMask:colorPanel:", mask, owningColorPanel) as ObjCObject

    public open fun colorPanel(): NSColorPanel =
        Native.objc_msgSend("class objc.NSColorPanel", this, "colorPanel") as NSColorPanel

    public open fun provideNewButtonImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "provideNewButtonImage") as NSImage

    public open fun insertNewButtonImage_in(newButtonImage: NSImage, buttonCell: NSButtonCell): Unit {
        Native.objc_msgSend("void", this, "insertNewButtonImage:in:", newButtonImage, buttonCell)
    }

    public open fun viewSizeChanged(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "viewSizeChanged:", sender)
    }

    public open fun attachColorList(colorList: NSColorList): Unit {
        Native.objc_msgSend("void", this, "attachColorList:", colorList)
    }

    public open fun detachColorList(colorList: NSColorList): Unit {
        Native.objc_msgSend("void", this, "detachColorList:", colorList)
    }

    public open fun setMode(mode: Any): Unit {
        Native.objc_msgSend("void", this, "setMode:", mode)
    }

    public open fun buttonToolTip(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "buttonToolTip") as NSString

    public open fun minContentSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "minContentSize")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSColorPickingDefault.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSColorPicker")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
