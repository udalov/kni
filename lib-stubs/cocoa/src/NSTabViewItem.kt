// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTabViewItem.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTabViewItem(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun initWithIdentifier(identifier: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIdentifier:", identifier) as ObjCObject

    public open fun identifier(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "identifier") as ObjCObject

    public open fun setIdentifier(identifier: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setIdentifier:", identifier)
    }

    public open fun color(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "color") as NSColor

    public open fun setColor(color: NSColor): Unit {
        Native.objc_msgSend("void", this, "setColor:", color)
    }

    public open fun label(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "label") as NSString

    public open fun setLabel(label: NSString): Unit {
        Native.objc_msgSend("void", this, "setLabel:", label)
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

    public open fun viewController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "viewController") as NSViewController

    public open fun setViewController(viewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "setViewController:", viewController)
    }

    public open fun tabState(): Any =
        Native.objc_msgSend("class objc.Any", this, "tabState")

    public open fun tabView(): NSTabView =
        Native.objc_msgSend("class objc.NSTabView", this, "tabView") as NSTabView

    public open fun initialFirstResponder(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "initialFirstResponder") as NSView

    public open fun setInitialFirstResponder(initialFirstResponder: NSView): Unit {
        Native.objc_msgSend("void", this, "setInitialFirstResponder:", initialFirstResponder)
    }

    public open fun toolTip(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "toolTip") as NSString

    public open fun setToolTip(toolTip: NSString): Unit {
        Native.objc_msgSend("void", this, "setToolTip:", toolTip)
    }

    public open fun drawLabel_inRect(shouldTruncateLabel: Boolean, labelRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawLabel:inRect:", shouldTruncateLabel, labelRect)
    }

    public open fun sizeOfLabel(computeMin: Boolean): Any =
        Native.objc_msgSend("class objc.Any", this, "sizeOfLabel:", computeMin)

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
        public open fun tabViewItemWithViewController(viewController: NSViewController): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "tabViewItemWithViewController:", viewController) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSTabViewItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
