// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPathComponentCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPathComponentCell(pointer: Long) : NSTextFieldCell(pointer) {
    override fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    override fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
    }

    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun setURL(URL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setURL:", URL)
    }

    override fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    override fun setTag(tag: Int): Unit {
        Native.objc_msgSend("void", this, "setTag:", tag)
    }

    override fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    override fun setUpFieldEditorAttributes(textObj: NSText): NSText =
        Native.objc_msgSend("class objc.NSText", this, "setUpFieldEditorAttributes:", textObj) as NSText

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    override fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    trait metaclass : NSTextFieldCell.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPathComponentCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
