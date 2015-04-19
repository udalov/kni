// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTokenFieldCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTokenFieldCellDelegate {
    trait metaclass
}

public open class NSTokenFieldCell(pointer: Long) : NSTextFieldCell(pointer) {
    public open fun tokenStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "tokenStyle")

    public open fun setTokenStyle(tokenStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setTokenStyle:", tokenStyle)
    }

    public open fun completionDelay(): Double =
        Native.objc_msgSend("double", this, "completionDelay") as Double

    public open fun setCompletionDelay(completionDelay: Double): Unit {
        Native.objc_msgSend("void", this, "setCompletionDelay:", completionDelay)
    }

    public open fun tokenizingCharacterSet(): NSCharacterSet =
        Native.objc_msgSend("class objc.NSCharacterSet", this, "tokenizingCharacterSet") as NSCharacterSet

    public open fun setTokenizingCharacterSet(tokenizingCharacterSet: NSCharacterSet): Unit {
        Native.objc_msgSend("void", this, "setTokenizingCharacterSet:", tokenizingCharacterSet)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
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
        public open fun defaultCompletionDelay(): Double =
            Native.objc_msgSend("double", this, "defaultCompletionDelay") as Double

        public open fun defaultTokenizingCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "defaultTokenizingCharacterSet") as NSCharacterSet

    }

    companion object : NSObject(Native.objc_getClass("NSTokenFieldCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
