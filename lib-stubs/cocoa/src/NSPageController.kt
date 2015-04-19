// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPageController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSPageControllerDelegate {
    trait metaclass
}

public open class NSPageController(pointer: Long) : NSViewController(pointer), NSAnimatablePropertyContainer, NSCoding {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun selectedViewController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "selectedViewController") as NSViewController

    public open fun transitionStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "transitionStyle")

    public open fun setTransitionStyle(transitionStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setTransitionStyle:", transitionStyle)
    }

    public open fun arrangedObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "arrangedObjects") as NSArray

    public open fun setArrangedObjects(arrangedObjects: NSArray): Unit {
        Native.objc_msgSend("void", this, "setArrangedObjects:", arrangedObjects)
    }

    public open fun selectedIndex(): Int =
        Native.objc_msgSend("int", this, "selectedIndex") as Int

    public open fun setSelectedIndex(selectedIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setSelectedIndex:", selectedIndex)
    }

    public open fun navigateForwardToObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "navigateForwardToObject:", `object`)
    }

    public open fun completeTransition(): Unit {
        Native.objc_msgSend("void", this, "completeTransition")
    }

    public open fun navigateBack(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "navigateBack:", sender)
    }

    public open fun navigateForward(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "navigateForward:", sender)
    }

    public open fun takeSelectedIndexFrom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeSelectedIndexFrom:", sender)
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

    trait metaclass : NSViewController.metaclass, NSAnimatablePropertyContainer.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPageController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
