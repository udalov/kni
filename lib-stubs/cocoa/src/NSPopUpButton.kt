// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPopUpButton.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPopUpButton(pointer: Long) : NSButton(pointer) {
    public open fun initWithFrame_pullsDown(buttonFrame: Any, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:pullsDown:", buttonFrame, flag) as ObjCObject

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

    override fun selectedTag(): Int =
        Native.objc_msgSend("int", this, "selectedTag") as Int

    public open fun synchronizeTitleAndSelectedItem(): Unit {
        Native.objc_msgSend("void", this, "synchronizeTitleAndSelectedItem")
    }

    public open fun itemTitleAtIndex(index: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "itemTitleAtIndex:", index) as NSString

    public open fun itemTitles(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "itemTitles") as NSArray

    public open fun titleOfSelectedItem(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "titleOfSelectedItem") as NSString

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

    trait metaclass : NSButton.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPopUpButton")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
