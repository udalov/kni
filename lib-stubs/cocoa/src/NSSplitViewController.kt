// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSplitViewController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSSplitViewController(pointer: Long) : NSViewController(pointer), NSSplitViewDelegate {
    public open fun splitView(): NSSplitView =
        Native.objc_msgSend("class objc.NSSplitView", this, "splitView") as NSSplitView

    public open fun setSplitView(splitView: NSSplitView): Unit {
        Native.objc_msgSend("void", this, "setSplitView:", splitView)
    }

    public open fun splitViewItems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "splitViewItems") as NSArray

    public open fun setSplitViewItems(splitViewItems: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSplitViewItems:", splitViewItems)
    }

    public open fun addSplitViewItem(splitViewItem: NSSplitViewItem): Unit {
        Native.objc_msgSend("void", this, "addSplitViewItem:", splitViewItem)
    }

    public open fun insertSplitViewItem_atIndex(splitViewItem: NSSplitViewItem, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertSplitViewItem:atIndex:", splitViewItem, index)
    }

    public open fun removeSplitViewItem(splitViewItem: NSSplitViewItem): Unit {
        Native.objc_msgSend("void", this, "removeSplitViewItem:", splitViewItem)
    }

    public open fun splitViewItemForViewController(viewController: NSViewController): NSSplitViewItem =
        Native.objc_msgSend("class objc.NSSplitViewItem", this, "splitViewItemForViewController:", viewController) as NSSplitViewItem

    override fun viewDidLoad(): Unit {
        Native.objc_msgSend("void", this, "viewDidLoad")
    }

    public open fun splitView_canCollapseSubview(splitView: NSSplitView, subview: NSView): Boolean =
        Native.objc_msgSend("boolean", this, "splitView:canCollapseSubview:", splitView, subview) as Boolean

    public open fun splitView_shouldCollapseSubview_forDoubleClickOnDividerAtIndex(splitView: NSSplitView, subview: NSView, dividerIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "splitView:shouldCollapseSubview:forDoubleClickOnDividerAtIndex:", splitView, subview, dividerIndex) as Boolean

    public open fun splitView_shouldHideDividerAtIndex(splitView: NSSplitView, dividerIndex: Int): Boolean =
        Native.objc_msgSend("boolean", this, "splitView:shouldHideDividerAtIndex:", splitView, dividerIndex) as Boolean

    public open fun splitView_effectiveRect_forDrawnRect_ofDividerAtIndex(splitView: NSSplitView, proposedEffectiveRect: Any, drawnRect: Any, dividerIndex: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "splitView:effectiveRect:forDrawnRect:ofDividerAtIndex:", splitView, proposedEffectiveRect, drawnRect, dividerIndex)

    public open fun splitView_additionalEffectiveRectOfDividerAtIndex(splitView: NSSplitView, dividerIndex: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "splitView:additionalEffectiveRectOfDividerAtIndex:", splitView, dividerIndex)

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

    trait metaclass : NSViewController.metaclass, NSSplitViewDelegate.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSplitViewController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSSplitViewItem(pointer: Long) : NSObject(pointer), NSAnimatablePropertyContainer, NSCoding {
    public open fun viewController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "viewController") as NSViewController

    public open fun setViewController(viewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "setViewController:", viewController)
    }

    public open fun isCollapsed(): Boolean =
        Native.objc_msgSend("boolean", this, "isCollapsed") as Boolean

    public open fun setCollapsed(collapsed: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCollapsed:", collapsed)
    }

    public open fun canCollapse(): Boolean =
        Native.objc_msgSend("boolean", this, "canCollapse") as Boolean

    public open fun setCanCollapse(canCollapse: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanCollapse:", canCollapse)
    }

    public open fun holdingPriority(): Float =
        Native.objc_msgSend("float", this, "holdingPriority") as Float

    public open fun setHoldingPriority(holdingPriority: Float): Unit {
        Native.objc_msgSend("void", this, "setHoldingPriority:", holdingPriority)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSAnimatablePropertyContainer.metaclass, NSCoding.metaclass {
        public open fun splitViewItemWithViewController(viewController: NSViewController): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "splitViewItemWithViewController:", viewController) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSSplitViewItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
