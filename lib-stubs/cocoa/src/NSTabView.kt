// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTabView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTabViewDelegate {
    trait metaclass
}

public open class NSTabView(pointer: Long) : NSView(pointer) {
    public open fun selectTabViewItem(tabViewItem: NSTabViewItem): Unit {
        Native.objc_msgSend("void", this, "selectTabViewItem:", tabViewItem)
    }

    public open fun selectTabViewItemAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "selectTabViewItemAtIndex:", index)
    }

    public open fun selectTabViewItemWithIdentifier(identifier: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectTabViewItemWithIdentifier:", identifier)
    }

    public open fun takeSelectedTabViewItemFromSender(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeSelectedTabViewItemFromSender:", sender)
    }

    public open fun selectFirstTabViewItem(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectFirstTabViewItem:", sender)
    }

    public open fun selectLastTabViewItem(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectLastTabViewItem:", sender)
    }

    public open fun selectNextTabViewItem(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectNextTabViewItem:", sender)
    }

    public open fun selectPreviousTabViewItem(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectPreviousTabViewItem:", sender)
    }

    public open fun selectedTabViewItem(): NSTabViewItem =
        Native.objc_msgSend("class objc.NSTabViewItem", this, "selectedTabViewItem") as NSTabViewItem

    public open fun font(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "font") as NSFont

    public open fun setFont(font: NSFont): Unit {
        Native.objc_msgSend("void", this, "setFont:", font)
    }

    public open fun tabViewType(): Any =
        Native.objc_msgSend("class objc.Any", this, "tabViewType")

    public open fun setTabViewType(tabViewType: Any): Unit {
        Native.objc_msgSend("void", this, "setTabViewType:", tabViewType)
    }

    public open fun tabViewItems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "tabViewItems") as NSArray

    public open fun allowsTruncatedLabels(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsTruncatedLabels") as Boolean

    public open fun setAllowsTruncatedLabels(allowsTruncatedLabels: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsTruncatedLabels:", allowsTruncatedLabels)
    }

    public open fun minimumSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "minimumSize")

    public open fun drawsBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsBackground") as Boolean

    public open fun setDrawsBackground(drawsBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsBackground:", drawsBackground)
    }

    public open fun controlTint(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlTint")

    public open fun setControlTint(controlTint: Any): Unit {
        Native.objc_msgSend("void", this, "setControlTint:", controlTint)
    }

    public open fun controlSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlSize")

    public open fun setControlSize(controlSize: Any): Unit {
        Native.objc_msgSend("void", this, "setControlSize:", controlSize)
    }

    public open fun addTabViewItem(tabViewItem: NSTabViewItem): Unit {
        Native.objc_msgSend("void", this, "addTabViewItem:", tabViewItem)
    }

    public open fun insertTabViewItem_atIndex(tabViewItem: NSTabViewItem, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertTabViewItem:atIndex:", tabViewItem, index)
    }

    public open fun removeTabViewItem(tabViewItem: NSTabViewItem): Unit {
        Native.objc_msgSend("void", this, "removeTabViewItem:", tabViewItem)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun tabViewItemAtPoint(point: Any): NSTabViewItem =
        Native.objc_msgSend("class objc.NSTabViewItem", this, "tabViewItemAtPoint:", point) as NSTabViewItem

    public open fun contentRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentRect")

    public open fun numberOfTabViewItems(): Int =
        Native.objc_msgSend("int", this, "numberOfTabViewItems") as Int

    public open fun indexOfTabViewItem(tabViewItem: NSTabViewItem): Int =
        Native.objc_msgSend("int", this, "indexOfTabViewItem:", tabViewItem) as Int

    public open fun tabViewItemAtIndex(index: Int): NSTabViewItem =
        Native.objc_msgSend("class objc.NSTabViewItem", this, "tabViewItemAtIndex:", index) as NSTabViewItem

    public open fun indexOfTabViewItemWithIdentifier(identifier: ObjCObject): Int =
        Native.objc_msgSend("int", this, "indexOfTabViewItemWithIdentifier:", identifier) as Int

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTabView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
