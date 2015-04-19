// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSMenu.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSMenuDelegate {
    trait metaclass
}

public open class NSMenu(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSMenu_NSSubmenuAction, NSMenu_NSMenuPropertiesToUpdate, NSMenu_NSDeprecated {
    public open fun initWithTitle(aTitle: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTitle:", aTitle) as ObjCObject

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun popUpMenuPositioningItem_atLocation_inView(item: NSMenuItem, location: Any, view: NSView): Boolean =
        Native.objc_msgSend("boolean", this, "popUpMenuPositioningItem:atLocation:inView:", item, location, view) as Boolean

    public open fun supermenu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "supermenu") as NSMenu

    public open fun setSupermenu(supermenu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setSupermenu:", supermenu)
    }

    public open fun insertItem_atIndex(newItem: NSMenuItem, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertItem:atIndex:", newItem, index)
    }

    public open fun addItem(newItem: NSMenuItem): Unit {
        Native.objc_msgSend("void", this, "addItem:", newItem)
    }

    public open fun insertItemWithTitle_action_keyEquivalent_atIndex(aString: NSString, aSelector: ObjCSelector, charCode: NSString, index: Int): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "insertItemWithTitle:action:keyEquivalent:atIndex:", aString, aSelector, charCode, index) as NSMenuItem

    public open fun addItemWithTitle_action_keyEquivalent(aString: NSString, aSelector: ObjCSelector, charCode: NSString): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "addItemWithTitle:action:keyEquivalent:", aString, aSelector, charCode) as NSMenuItem

    public open fun removeItemAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeItemAtIndex:", index)
    }

    public open fun removeItem(item: NSMenuItem): Unit {
        Native.objc_msgSend("void", this, "removeItem:", item)
    }

    public open fun setSubmenu_forItem(aMenu: NSMenu, anItem: NSMenuItem): Unit {
        Native.objc_msgSend("void", this, "setSubmenu:forItem:", aMenu, anItem)
    }

    public open fun removeAllItems(): Unit {
        Native.objc_msgSend("void", this, "removeAllItems")
    }

    public open fun itemArray(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "itemArray") as NSArray

    public open fun numberOfItems(): Int =
        Native.objc_msgSend("int", this, "numberOfItems") as Int

    public open fun itemAtIndex(index: Int): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "itemAtIndex:", index) as NSMenuItem

    public open fun indexOfItem(index: NSMenuItem): Int =
        Native.objc_msgSend("int", this, "indexOfItem:", index) as Int

    public open fun indexOfItemWithTitle(aTitle: NSString): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithTitle:", aTitle) as Int

    public open fun indexOfItemWithTag(aTag: Int): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithTag:", aTag) as Int

    public open fun indexOfItemWithRepresentedObject(`object`: ObjCObject): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithRepresentedObject:", `object`) as Int

    public open fun indexOfItemWithSubmenu(submenu: NSMenu): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithSubmenu:", submenu) as Int

    public open fun indexOfItemWithTarget_andAction(target: ObjCObject, actionSelector: ObjCSelector): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithTarget:andAction:", target, actionSelector) as Int

    public open fun itemWithTitle(aTitle: NSString): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "itemWithTitle:", aTitle) as NSMenuItem

    public open fun itemWithTag(tag: Int): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "itemWithTag:", tag) as NSMenuItem

    public open fun autoenablesItems(): Boolean =
        Native.objc_msgSend("boolean", this, "autoenablesItems") as Boolean

    public open fun setAutoenablesItems(autoenablesItems: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutoenablesItems:", autoenablesItems)
    }

    public open fun update(): Unit {
        Native.objc_msgSend("void", this, "update")
    }

    public open fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    public open fun itemChanged(item: NSMenuItem): Unit {
        Native.objc_msgSend("void", this, "itemChanged:", item)
    }

    public open fun performActionForItemAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "performActionForItemAtIndex:", index)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun menuBarHeight(): Double =
        Native.objc_msgSend("double", this, "menuBarHeight") as Double

    public open fun cancelTracking(): Unit {
        Native.objc_msgSend("void", this, "cancelTracking")
    }

    public open fun cancelTrackingWithoutAnimation(): Unit {
        Native.objc_msgSend("void", this, "cancelTrackingWithoutAnimation")
    }

    public open fun highlightedItem(): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "highlightedItem") as NSMenuItem

    public open fun minimumWidth(): Double =
        Native.objc_msgSend("double", this, "minimumWidth") as Double

    public open fun setMinimumWidth(minimumWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setMinimumWidth:", minimumWidth)
    }

    public open fun size(): Any =
        Native.objc_msgSend("class objc.Any", this, "size")

    public open fun font(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "font") as NSFont

    public open fun setFont(font: NSFont): Unit {
        Native.objc_msgSend("void", this, "setFont:", font)
    }

    public open fun allowsContextMenuPlugIns(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsContextMenuPlugIns") as Boolean

    public open fun setAllowsContextMenuPlugIns(allowsContextMenuPlugIns: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsContextMenuPlugIns:", allowsContextMenuPlugIns)
    }

    public open fun showsStateColumn(): Boolean =
        Native.objc_msgSend("boolean", this, "showsStateColumn") as Boolean

    public open fun setShowsStateColumn(showsStateColumn: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsStateColumn:", showsStateColumn)
    }

    public open fun menuChangedMessagesEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "menuChangedMessagesEnabled") as Boolean

    public open fun setMenuChangedMessagesEnabled(menuChangedMessagesEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setMenuChangedMessagesEnabled:", menuChangedMessagesEnabled)
    }

    public open fun helpRequested(eventPtr: NSEvent): Unit {
        Native.objc_msgSend("void", this, "helpRequested:", eventPtr)
    }

    public open fun isTornOff(): Boolean =
        Native.objc_msgSend("boolean", this, "isTornOff") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSMenu_NSSubmenuAction.metaclass, NSMenu_NSMenuPropertiesToUpdate.metaclass, NSMenu_NSDeprecated.metaclass {
        public open fun popUpContextMenu_withEvent_forView(menu: NSMenu, event: NSEvent, view: NSView): Unit {
            Native.objc_msgSend("void", this, "popUpContextMenu:withEvent:forView:", menu, event, view)
        }

        public open fun popUpContextMenu_withEvent_forView_withFont(menu: NSMenu, event: NSEvent, view: NSView, font: NSFont): Unit {
            Native.objc_msgSend("void", this, "popUpContextMenu:withEvent:forView:withFont:", menu, event, view, font)
        }

        public open fun setMenuBarVisible(visible: Boolean): Unit {
            Native.objc_msgSend("void", this, "setMenuBarVisible:", visible)
        }

        public open fun menuBarVisible(): Boolean =
            Native.objc_msgSend("boolean", this, "menuBarVisible") as Boolean

        public open fun menuZone(): Pointer<Any> =
            Native.objc_msgSend("class kni.objc.Pointer", this, "menuZone") as Pointer<Any>

    }

    companion object : NSObject(Native.objc_getClass("NSMenu")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSMenu_NSSubmenuAction : IObjCObject {
    public open fun submenuAction(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "submenuAction:", sender)
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSMenuValidation : IObjCObject {
    public open fun validateMenuItem(menuItem: NSMenuItem): Boolean =
        Native.objc_msgSend("boolean", this, "validateMenuItem:", menuItem) as Boolean

    trait metaclass : IObjCObject
}

trait NSMenu_NSMenuPropertiesToUpdate : IObjCObject {
    public open fun propertiesToUpdate(): Any =
        Native.objc_msgSend("class objc.Any", this, "propertiesToUpdate")

    trait metaclass : IObjCObject
}

trait NSMenu_NSDeprecated : IObjCObject {
    public open fun setMenuRepresentation(menuRep: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setMenuRepresentation:", menuRep)
    }

    public open fun menuRepresentation(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "menuRepresentation") as ObjCObject

    public open fun setContextMenuRepresentation(menuRep: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setContextMenuRepresentation:", menuRep)
    }

    public open fun contextMenuRepresentation(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "contextMenuRepresentation") as ObjCObject

    public open fun setTearOffMenuRepresentation(menuRep: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTearOffMenuRepresentation:", menuRep)
    }

    public open fun tearOffMenuRepresentation(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "tearOffMenuRepresentation") as ObjCObject

    public open fun attachedMenu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "attachedMenu") as NSMenu

    public open fun isAttached(): Boolean =
        Native.objc_msgSend("boolean", this, "isAttached") as Boolean

    public open fun sizeToFit(): Unit {
        Native.objc_msgSend("void", this, "sizeToFit")
    }

    public open fun locationForSubmenu(aSubmenu: NSMenu): Any =
        Native.objc_msgSend("class objc.Any", this, "locationForSubmenu:", aSubmenu)

    trait metaclass : IObjCObject {
        public open fun setMenuZone(aZone: Pointer<Any>): Unit {
            Native.objc_msgSend("void", this, "setMenuZone:", aZone)
        }
    }
}
