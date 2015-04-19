// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTitlebarAccessoryViewController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTitlebarAccessoryViewController(pointer: Long) : NSViewController(pointer) {
    public open fun layoutAttribute(): Any =
        Native.objc_msgSend("class objc.Any", this, "layoutAttribute")

    public open fun setLayoutAttribute(layoutAttribute: Any): Unit {
        Native.objc_msgSend("void", this, "setLayoutAttribute:", layoutAttribute)
    }

    public open fun fullScreenMinHeight(): Double =
        Native.objc_msgSend("double", this, "fullScreenMinHeight") as Double

    public open fun setFullScreenMinHeight(fullScreenMinHeight: Double): Unit {
        Native.objc_msgSend("void", this, "setFullScreenMinHeight:", fullScreenMinHeight)
    }

    override fun viewWillAppear(): Unit {
        Native.objc_msgSend("void", this, "viewWillAppear")
    }

    override fun viewDidAppear(): Unit {
        Native.objc_msgSend("void", this, "viewDidAppear")
    }

    override fun viewDidDisappear(): Unit {
        Native.objc_msgSend("void", this, "viewDidDisappear")
    }

    override fun commitEditing(): Boolean =
        Native.objc_msgSend("boolean", this, "commitEditing") as Boolean

    override fun commitEditingWithDelegate_didCommitSelector_contextInfo(delegate: ObjCObject, didCommitSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "commitEditingWithDelegate:didCommitSelector:contextInfo:", delegate, didCommitSelector, contextInfo)
    }

    override fun discardEditing(): Unit {
        Native.objc_msgSend("void", this, "discardEditing")
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSViewController.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTitlebarAccessoryViewController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
