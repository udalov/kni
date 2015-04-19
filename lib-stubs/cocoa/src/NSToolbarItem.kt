// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSToolbarItem.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSToolbarItem(pointer: Long) : NSObject(pointer), NSCopying, NSValidatedUserInterfaceItem {
    public open fun initWithItemIdentifier(itemIdentifier: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithItemIdentifier:", itemIdentifier) as ObjCObject

    public open fun itemIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "itemIdentifier") as NSString

    public open fun toolbar(): NSToolbar =
        Native.objc_msgSend("class objc.NSToolbar", this, "toolbar") as NSToolbar

    public open fun label(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "label") as NSString

    public open fun setLabel(label: NSString): Unit {
        Native.objc_msgSend("void", this, "setLabel:", label)
    }

    public open fun paletteLabel(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "paletteLabel") as NSString

    public open fun setPaletteLabel(paletteLabel: NSString): Unit {
        Native.objc_msgSend("void", this, "setPaletteLabel:", paletteLabel)
    }

    public open fun toolTip(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "toolTip") as NSString

    public open fun setToolTip(toolTip: NSString): Unit {
        Native.objc_msgSend("void", this, "setToolTip:", toolTip)
    }

    public open fun menuFormRepresentation(): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "menuFormRepresentation") as NSMenuItem

    public open fun setMenuFormRepresentation(menuFormRepresentation: NSMenuItem): Unit {
        Native.objc_msgSend("void", this, "setMenuFormRepresentation:", menuFormRepresentation)
    }

    public open fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    public open fun setTag(tag: Int): Unit {
        Native.objc_msgSend("void", this, "setTag:", tag)
    }

    public open fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    public open fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    public open fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    public open fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    public open fun isEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabled") as Boolean

    public open fun setEnabled(enabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEnabled:", enabled)
    }

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
    }

    public open fun view(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "view") as NSView

    public open fun setView(view: NSView): Unit {
        Native.objc_msgSend("void", this, "setView:", view)
    }

    public open fun minSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "minSize")

    public open fun setMinSize(minSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMinSize:", minSize)
    }

    public open fun maxSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "maxSize")

    public open fun setMaxSize(maxSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMaxSize:", maxSize)
    }

    public open fun visibilityPriority(): Int =
        Native.objc_msgSend("int", this, "visibilityPriority") as Int

    public open fun setVisibilityPriority(visibilityPriority: Int): Unit {
        Native.objc_msgSend("void", this, "setVisibilityPriority:", visibilityPriority)
    }

    public open fun validate(): Unit {
        Native.objc_msgSend("void", this, "validate")
    }

    public open fun autovalidates(): Boolean =
        Native.objc_msgSend("boolean", this, "autovalidates") as Boolean

    public open fun setAutovalidates(autovalidates: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutovalidates:", autovalidates)
    }

    public open fun allowsDuplicatesInToolbar(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsDuplicatesInToolbar") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSValidatedUserInterfaceItem.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSToolbarItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSToolbarItemValidation : IObjCObject {
    public open fun validateToolbarItem(theItem: NSToolbarItem): Boolean =
        Native.objc_msgSend("boolean", this, "validateToolbarItem:", theItem) as Boolean

    trait metaclass : IObjCObject
}
