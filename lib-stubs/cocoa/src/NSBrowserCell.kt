// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSBrowserCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSBrowserCell(pointer: Long) : NSCell(pointer) {
    public open fun highlightColorInView(controlView: NSView): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "highlightColorInView:", controlView) as NSColor

    public open fun isLeaf(): Boolean =
        Native.objc_msgSend("boolean", this, "isLeaf") as Boolean

    public open fun setLeaf(leaf: Boolean): Unit {
        Native.objc_msgSend("void", this, "setLeaf:", leaf)
    }

    public open fun isLoaded(): Boolean =
        Native.objc_msgSend("boolean", this, "isLoaded") as Boolean

    public open fun setLoaded(loaded: Boolean): Unit {
        Native.objc_msgSend("void", this, "setLoaded:", loaded)
    }

    public open fun reset(): Unit {
        Native.objc_msgSend("void", this, "reset")
    }

    public open fun set(): Unit {
        Native.objc_msgSend("void", this, "set")
    }

    override fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    override fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
    }

    public open fun alternateImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "alternateImage") as NSImage

    public open fun setAlternateImage(alternateImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setAlternateImage:", alternateImage)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSCell.metaclass {
        public open fun branchImage(): NSImage =
            Native.objc_msgSend("class objc.NSImage", this, "branchImage") as NSImage

        public open fun highlightedBranchImage(): NSImage =
            Native.objc_msgSend("class objc.NSImage", this, "highlightedBranchImage") as NSImage

    }

    companion object : NSObject(Native.objc_getClass("NSBrowserCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
