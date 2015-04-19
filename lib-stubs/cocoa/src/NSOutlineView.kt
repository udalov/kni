// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSOutlineView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSOutlineViewDataSource {
    trait metaclass
}

trait NSOutlineViewDelegate {
    trait metaclass
}

public open class NSOutlineView(pointer: Long) : NSTableView(pointer), NSAccessibilityOutline {
    override fun setDelegate(anObject: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", anObject)
    }

    override fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    override fun setDataSource(aSource: Any): Unit {
        Native.objc_msgSend("void", this, "setDataSource:", aSource)
    }

    override fun dataSource(): Any =
        Native.objc_msgSend("class objc.Any", this, "dataSource")

    public open fun outlineTableColumn(): NSTableColumn =
        Native.objc_msgSend("class objc.NSTableColumn", this, "outlineTableColumn") as NSTableColumn

    public open fun setOutlineTableColumn(outlineTableColumn: NSTableColumn): Unit {
        Native.objc_msgSend("void", this, "setOutlineTableColumn:", outlineTableColumn)
    }

    public open fun isExpandable(item: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "isExpandable:", item) as Boolean

    public open fun numberOfChildrenOfItem(item: ObjCObject): Int =
        Native.objc_msgSend("int", this, "numberOfChildrenOfItem:", item) as Int

    public open fun child_ofItem(index: Int, item: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "child:ofItem:", index, item) as ObjCObject

    public open fun expandItem_expandChildren(item: ObjCObject, expandChildren: Boolean): Unit {
        Native.objc_msgSend("void", this, "expandItem:expandChildren:", item, expandChildren)
    }

    public open fun expandItem(item: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "expandItem:", item)
    }

    public open fun collapseItem_collapseChildren(item: ObjCObject, collapseChildren: Boolean): Unit {
        Native.objc_msgSend("void", this, "collapseItem:collapseChildren:", item, collapseChildren)
    }

    public open fun collapseItem(item: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "collapseItem:", item)
    }

    public open fun reloadItem_reloadChildren(item: ObjCObject, reloadChildren: Boolean): Unit {
        Native.objc_msgSend("void", this, "reloadItem:reloadChildren:", item, reloadChildren)
    }

    public open fun reloadItem(item: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "reloadItem:", item)
    }

    public open fun parentForItem(item: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "parentForItem:", item) as ObjCObject

    public open fun itemAtRow(row: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "itemAtRow:", row) as ObjCObject

    public open fun rowForItem(item: ObjCObject): Int =
        Native.objc_msgSend("int", this, "rowForItem:", item) as Int

    public open fun levelForItem(item: ObjCObject): Int =
        Native.objc_msgSend("int", this, "levelForItem:", item) as Int

    public open fun levelForRow(row: Int): Int =
        Native.objc_msgSend("int", this, "levelForRow:", row) as Int

    public open fun isItemExpanded(item: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "isItemExpanded:", item) as Boolean

    public open fun indentationPerLevel(): Double =
        Native.objc_msgSend("double", this, "indentationPerLevel") as Double

    public open fun setIndentationPerLevel(indentationPerLevel: Double): Unit {
        Native.objc_msgSend("void", this, "setIndentationPerLevel:", indentationPerLevel)
    }

    public open fun indentationMarkerFollowsCell(): Boolean =
        Native.objc_msgSend("boolean", this, "indentationMarkerFollowsCell") as Boolean

    public open fun setIndentationMarkerFollowsCell(indentationMarkerFollowsCell: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIndentationMarkerFollowsCell:", indentationMarkerFollowsCell)
    }

    public open fun autoresizesOutlineColumn(): Boolean =
        Native.objc_msgSend("boolean", this, "autoresizesOutlineColumn") as Boolean

    public open fun setAutoresizesOutlineColumn(autoresizesOutlineColumn: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutoresizesOutlineColumn:", autoresizesOutlineColumn)
    }

    public open fun frameOfOutlineCellAtRow(row: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "frameOfOutlineCellAtRow:", row)

    public open fun setDropItem_dropChildIndex(item: ObjCObject, index: Int): Unit {
        Native.objc_msgSend("void", this, "setDropItem:dropChildIndex:", item, index)
    }

    public open fun shouldCollapseAutoExpandedItemsForDeposited(deposited: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "shouldCollapseAutoExpandedItemsForDeposited:", deposited) as Boolean

    public open fun autosaveExpandedItems(): Boolean =
        Native.objc_msgSend("boolean", this, "autosaveExpandedItems") as Boolean

    public open fun setAutosaveExpandedItems(autosaveExpandedItems: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutosaveExpandedItems:", autosaveExpandedItems)
    }

    public open fun insertItemsAtIndexes_inParent_withAnimation(indexes: NSIndexSet, parent: ObjCObject, animationOptions: Any): Unit {
        Native.objc_msgSend("void", this, "insertItemsAtIndexes:inParent:withAnimation:", indexes, parent, animationOptions)
    }

    public open fun removeItemsAtIndexes_inParent_withAnimation(indexes: NSIndexSet, parent: ObjCObject, animationOptions: Any): Unit {
        Native.objc_msgSend("void", this, "removeItemsAtIndexes:inParent:withAnimation:", indexes, parent, animationOptions)
    }

    public open fun moveItemAtIndex_inParent_toIndex_inParent(fromIndex: Int, oldParent: ObjCObject, toIndex: Int, newParent: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveItemAtIndex:inParent:toIndex:inParent:", fromIndex, oldParent, toIndex, newParent)
    }

    override fun insertRowsAtIndexes_withAnimation(indexes: NSIndexSet, animationOptions: Any): Unit {
        Native.objc_msgSend("void", this, "insertRowsAtIndexes:withAnimation:", indexes, animationOptions)
    }

    override fun removeRowsAtIndexes_withAnimation(indexes: NSIndexSet, animationOptions: Any): Unit {
        Native.objc_msgSend("void", this, "removeRowsAtIndexes:withAnimation:", indexes, animationOptions)
    }

    override fun moveRowAtIndex_toIndex(oldIndex: Int, newIndex: Int): Unit {
        Native.objc_msgSend("void", this, "moveRowAtIndex:toIndex:", oldIndex, newIndex)
    }

    override fun userInterfaceLayoutDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "userInterfaceLayoutDirection")

    override fun setUserInterfaceLayoutDirection(userInterfaceLayoutDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setUserInterfaceLayoutDirection:", userInterfaceLayoutDirection)
    }

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

    override fun selectAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectAll:", sender)
    }

    override fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    override fun sizeToFit(): Unit {
        Native.objc_msgSend("void", this, "sizeToFit")
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    trait metaclass : NSTableView.metaclass, NSAccessibilityOutline.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSOutlineView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
