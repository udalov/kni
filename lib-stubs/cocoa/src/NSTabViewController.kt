// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTabViewController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTabViewController(pointer: Long) : NSViewController(pointer), NSTabViewDelegate, NSToolbarDelegate {
    public open fun tabStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "tabStyle")

    public open fun setTabStyle(tabStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setTabStyle:", tabStyle)
    }

    public open fun tabView(): NSTabView =
        Native.objc_msgSend("class objc.NSTabView", this, "tabView") as NSTabView

    public open fun setTabView(tabView: NSTabView): Unit {
        Native.objc_msgSend("void", this, "setTabView:", tabView)
    }

    public open fun transitionOptions(): Any =
        Native.objc_msgSend("class objc.Any", this, "transitionOptions")

    public open fun setTransitionOptions(transitionOptions: Any): Unit {
        Native.objc_msgSend("void", this, "setTransitionOptions:", transitionOptions)
    }

    public open fun canPropagateSelectedChildViewControllerTitle(): Boolean =
        Native.objc_msgSend("boolean", this, "canPropagateSelectedChildViewControllerTitle") as Boolean

    public open fun setCanPropagateSelectedChildViewControllerTitle(canPropagateSelectedChildViewControllerTitle: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanPropagateSelectedChildViewControllerTitle:", canPropagateSelectedChildViewControllerTitle)
    }

    public open fun tabViewItems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "tabViewItems") as NSArray

    public open fun setTabViewItems(tabViewItems: NSArray): Unit {
        Native.objc_msgSend("void", this, "setTabViewItems:", tabViewItems)
    }

    public open fun selectedTabViewItemIndex(): Int =
        Native.objc_msgSend("int", this, "selectedTabViewItemIndex") as Int

    public open fun setSelectedTabViewItemIndex(selectedTabViewItemIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setSelectedTabViewItemIndex:", selectedTabViewItemIndex)
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

    public open fun tabViewItemForViewController(viewController: NSViewController): NSTabViewItem =
        Native.objc_msgSend("class objc.NSTabViewItem", this, "tabViewItemForViewController:", viewController) as NSTabViewItem

    override fun viewDidLoad(): Unit {
        Native.objc_msgSend("void", this, "viewDidLoad")
    }

    public open fun tabView_willSelectTabViewItem(tabView: NSTabView, tabViewItem: NSTabViewItem): Unit {
        Native.objc_msgSend("void", this, "tabView:willSelectTabViewItem:", tabView, tabViewItem)
    }

    public open fun tabView_didSelectTabViewItem(tabView: NSTabView, tabViewItem: NSTabViewItem): Unit {
        Native.objc_msgSend("void", this, "tabView:didSelectTabViewItem:", tabView, tabViewItem)
    }

    public open fun tabView_shouldSelectTabViewItem(tabView: NSTabView, tabViewItem: NSTabViewItem): Boolean =
        Native.objc_msgSend("boolean", this, "tabView:shouldSelectTabViewItem:", tabView, tabViewItem) as Boolean

    public open fun toolbar_itemForItemIdentifier_willBeInsertedIntoToolbar(toolbar: NSToolbar, itemIdentifier: NSString, flag: Boolean): NSToolbarItem =
        Native.objc_msgSend("class objc.NSToolbarItem", this, "toolbar:itemForItemIdentifier:willBeInsertedIntoToolbar:", toolbar, itemIdentifier, flag) as NSToolbarItem

    public open fun toolbarDefaultItemIdentifiers(toolbar: NSToolbar): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "toolbarDefaultItemIdentifiers:", toolbar) as NSArray

    public open fun toolbarAllowedItemIdentifiers(toolbar: NSToolbar): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "toolbarAllowedItemIdentifiers:", toolbar) as NSArray

    public open fun toolbarSelectableItemIdentifiers(toolbar: NSToolbar): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "toolbarSelectableItemIdentifiers:", toolbar) as NSArray

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

    trait metaclass : NSViewController.metaclass, NSTabViewDelegate.metaclass, NSToolbarDelegate.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTabViewController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
