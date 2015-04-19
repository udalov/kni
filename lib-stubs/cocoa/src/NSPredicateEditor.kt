// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPredicateEditor.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPredicateEditor(pointer: Long) : NSRuleEditor(pointer) {
    public open fun rowTemplates(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "rowTemplates") as NSArray

    public open fun setRowTemplates(rowTemplates: NSArray): Unit {
        Native.objc_msgSend("void", this, "setRowTemplates:", rowTemplates)
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

    trait metaclass : NSRuleEditor.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPredicateEditor")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
