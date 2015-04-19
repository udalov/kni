// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTokenField.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTokenFieldDelegate {
    trait metaclass
}

public open class NSTokenField(pointer: Long) : NSTextField(pointer) {
    override fun setDelegate(anObject: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", anObject)
    }

    override fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

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

    override fun acceptsFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsFirstResponder") as Boolean

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

    trait metaclass : NSTextField.metaclass {
        public open fun defaultCompletionDelay(): Double =
            Native.objc_msgSend("double", this, "defaultCompletionDelay") as Double

        public open fun defaultTokenizingCharacterSet(): NSCharacterSet =
            Native.objc_msgSend("class objc.NSCharacterSet", this, "defaultTokenizingCharacterSet") as NSCharacterSet

    }

    companion object : NSObject(Native.objc_getClass("NSTokenField")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
