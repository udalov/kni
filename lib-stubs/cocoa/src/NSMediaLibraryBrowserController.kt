// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSMediaLibraryBrowserController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSMediaLibraryBrowserController(pointer: Long) : NSObject(pointer) {
    public open fun isVisible(): Boolean =
        Native.objc_msgSend("boolean", this, "isVisible") as Boolean

    public open fun setVisible(visible: Boolean): Unit {
        Native.objc_msgSend("void", this, "setVisible:", visible)
    }

    public open fun frame(): Any =
        Native.objc_msgSend("class objc.Any", this, "frame")

    public open fun setFrame(frame: Any): Unit {
        Native.objc_msgSend("void", this, "setFrame:", frame)
    }

    public open fun mediaLibraries(): Any =
        Native.objc_msgSend("class objc.Any", this, "mediaLibraries")

    public open fun setMediaLibraries(mediaLibraries: Any): Unit {
        Native.objc_msgSend("void", this, "setMediaLibraries:", mediaLibraries)
    }

    public open fun togglePanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "togglePanel:", sender)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun sharedMediaLibraryBrowserController(): NSMediaLibraryBrowserController =
            Native.objc_msgSend("class objc.NSMediaLibraryBrowserController", this, "sharedMediaLibraryBrowserController") as NSMediaLibraryBrowserController

    }

    companion object : NSObject(Native.objc_getClass("NSMediaLibraryBrowserController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
