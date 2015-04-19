// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDockTile.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSDockTilePlugIn {
    trait metaclass
}

public open class NSDockTile(pointer: Long) : NSObject(pointer) {
    public open fun size(): Any =
        Native.objc_msgSend("class objc.Any", this, "size")

    public open fun contentView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "contentView") as NSView

    public open fun setContentView(contentView: NSView): Unit {
        Native.objc_msgSend("void", this, "setContentView:", contentView)
    }

    public open fun display(): Unit {
        Native.objc_msgSend("void", this, "display")
    }

    public open fun showsApplicationBadge(): Boolean =
        Native.objc_msgSend("boolean", this, "showsApplicationBadge") as Boolean

    public open fun setShowsApplicationBadge(showsApplicationBadge: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsApplicationBadge:", showsApplicationBadge)
    }

    public open fun badgeLabel(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "badgeLabel") as NSString

    public open fun setBadgeLabel(badgeLabel: NSString): Unit {
        Native.objc_msgSend("void", this, "setBadgeLabel:", badgeLabel)
    }

    public open fun owner(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "owner") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDockTile")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
