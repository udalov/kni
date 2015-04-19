// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPopUpButtonCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPopUpButtonCell(pointer: Long) : NSMenuItemCell(pointer) {
    public open fun initTextCell_pullsDown(stringValue: NSString, pullDown: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initTextCell:pullsDown:", stringValue, pullDown) as ObjCObject

    override fun menu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menu") as NSMenu

    override fun setMenu(menu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setMenu:", menu)
    }

    public open fun pullsDown(): Boolean =
        Native.objc_msgSend("boolean", this, "pullsDown") as Boolean

    public open fun setPullsDown(pullsDown: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPullsDown:", pullsDown)
    }

    public open fun autoenablesItems(): Boolean =
        Native.objc_msgSend("boolean", this, "autoenablesItems") as Boolean

    public open fun setAutoenablesItems(autoenablesItems: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutoenablesItems:", autoenablesItems)
    }

    public open fun preferredEdge(): Int =
        Native.objc_msgSend("int", this, "preferredEdge") as Int

    public open fun setPreferredEdge(preferredEdge: Int): Unit {
        Native.objc_msgSend("void", this, "setPreferredEdge:", preferredEdge)
    }

    public open fun usesItemFromMenu(): Boolean =
        Native.objc_msgSend("boolean", this, "usesItemFromMenu") as Boolean

    public open fun setUsesItemFromMenu(usesItemFromMenu: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesItemFromMenu:", usesItemFromMenu)
    }

    public open fun altersStateOfSelectedItem(): Boolean =
        Native.objc_msgSend("boolean", this, "altersStateOfSelectedItem") as Boolean

    public open fun setAltersStateOfSelectedItem(altersStateOfSelectedItem: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAltersStateOfSelectedItem:", altersStateOfSelectedItem)
    }

    public open fun addItemWithTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "addItemWithTitle:", title)
    }

    public open fun addItemsWithTitles(itemTitles: NSArray): Unit {
        Native.objc_msgSend("void", this, "addItemsWithTitles:", itemTitles)
    }

    public open fun insertItemWithTitle_atIndex(title: NSString, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertItemWithTitle:atIndex:", title, index)
    }

    public open fun removeItemWithTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "removeItemWithTitle:", title)
    }

    public open fun removeItemAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeItemAtIndex:", index)
    }

    public open fun removeAllItems(): Unit {
        Native.objc_msgSend("void", this, "removeAllItems")
    }

    public open fun itemArray(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "itemArray") as NSArray

    public open fun numberOfItems(): Int =
        Native.objc_msgSend("int", this, "numberOfItems") as Int

    public open fun indexOfItem(item: NSMenuItem): Int =
        Native.objc_msgSend("int", this, "indexOfItem:", item) as Int

    public open fun indexOfItemWithTitle(title: NSString): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithTitle:", title) as Int

    public open fun indexOfItemWithTag(tag: Int): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithTag:", tag) as Int

    public open fun indexOfItemWithRepresentedObject(obj: ObjCObject): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithRepresentedObject:", obj) as Int

    public open fun indexOfItemWithTarget_andAction(target: ObjCObject, actionSelector: ObjCSelector): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithTarget:andAction:", target, actionSelector) as Int

    public open fun itemAtIndex(index: Int): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "itemAtIndex:", index) as NSMenuItem

    public open fun itemWithTitle(title: NSString): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "itemWithTitle:", title) as NSMenuItem

    public open fun lastItem(): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "lastItem") as NSMenuItem

    public open fun selectItem(item: NSMenuItem): Unit {
        Native.objc_msgSend("void", this, "selectItem:", item)
    }

    public open fun selectItemAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "selectItemAtIndex:", index)
    }

    public open fun selectItemWithTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "selectItemWithTitle:", title)
    }

    public open fun selectItemWithTag(tag: Int): Boolean =
        Native.objc_msgSend("boolean", this, "selectItemWithTag:", tag) as Boolean

    override fun setTitle(aString: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", aString)
    }

    public open fun selectedItem(): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "selectedItem") as NSMenuItem

    public open fun indexOfSelectedItem(): Int =
        Native.objc_msgSend("int", this, "indexOfSelectedItem") as Int

    public open fun synchronizeTitleAndSelectedItem(): Unit {
        Native.objc_msgSend("void", this, "synchronizeTitleAndSelectedItem")
    }

    public open fun itemTitleAtIndex(index: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "itemTitleAtIndex:", index) as NSString

    public open fun itemTitles(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "itemTitles") as NSArray

    public open fun titleOfSelectedItem(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "titleOfSelectedItem") as NSString

    public open fun attachPopUpWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "attachPopUpWithFrame:inView:", cellFrame, controlView)
    }

    public open fun dismissPopUp(): Unit {
        Native.objc_msgSend("void", this, "dismissPopUp")
    }

    public open fun performClickWithFrame_inView(frame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "performClickWithFrame:inView:", frame, controlView)
    }

    public open fun arrowPosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "arrowPosition")

    public open fun setArrowPosition(arrowPosition: Any): Unit {
        Native.objc_msgSend("void", this, "setArrowPosition:", arrowPosition)
    }

    override fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    override fun getPeriodicDelay_interval(delay: Pointer<Float>, interval: Pointer<Float>): Unit {
        Native.objc_msgSend("void", this, "getPeriodicDelay:interval:", delay, interval)
    }

    override fun isOpaque(): Boolean =
        Native.objc_msgSend("boolean", this, "isOpaque") as Boolean

    override fun keyEquivalent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "keyEquivalent") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performClick(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performClick:", sender)
    }

    override fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    override fun setTag(tag: Int): Unit {
        Native.objc_msgSend("void", this, "setTag:", tag)
    }

    override fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    override fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    override fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    override fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    override fun titleRectForBounds(theRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "titleRectForBounds:", theRect)

    trait metaclass : NSMenuItemCell.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPopUpButtonCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
