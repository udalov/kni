// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTableView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTableViewDelegate {
    trait metaclass
}

trait NSTableViewDataSource {
    trait metaclass
}

public open class NSTableView(pointer: Long) : NSControl(pointer), NSUserInterfaceValidations, NSTextViewDelegate, NSDraggingSource, NSAccessibilityTable, NSTableView_NSDeprecated {
    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun setDataSource(aSource: Any): Unit {
        Native.objc_msgSend("void", this, "setDataSource:", aSource)
    }

    public open fun dataSource(): Any =
        Native.objc_msgSend("class objc.Any", this, "dataSource")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun headerView(): NSTableHeaderView =
        Native.objc_msgSend("class objc.NSTableHeaderView", this, "headerView") as NSTableHeaderView

    public open fun setHeaderView(headerView: NSTableHeaderView): Unit {
        Native.objc_msgSend("void", this, "setHeaderView:", headerView)
    }

    public open fun cornerView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "cornerView") as NSView

    public open fun setCornerView(cornerView: NSView): Unit {
        Native.objc_msgSend("void", this, "setCornerView:", cornerView)
    }

    public open fun allowsColumnReordering(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsColumnReordering") as Boolean

    public open fun setAllowsColumnReordering(allowsColumnReordering: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsColumnReordering:", allowsColumnReordering)
    }

    public open fun allowsColumnResizing(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsColumnResizing") as Boolean

    public open fun setAllowsColumnResizing(allowsColumnResizing: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsColumnResizing:", allowsColumnResizing)
    }

    public open fun columnAutoresizingStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "columnAutoresizingStyle")

    public open fun setColumnAutoresizingStyle(columnAutoresizingStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setColumnAutoresizingStyle:", columnAutoresizingStyle)
    }

    public open fun gridStyleMask(): Any =
        Native.objc_msgSend("class objc.Any", this, "gridStyleMask")

    public open fun setGridStyleMask(gridStyleMask: Any): Unit {
        Native.objc_msgSend("void", this, "setGridStyleMask:", gridStyleMask)
    }

    public open fun intercellSpacing(): Any =
        Native.objc_msgSend("class objc.Any", this, "intercellSpacing")

    public open fun setIntercellSpacing(intercellSpacing: Any): Unit {
        Native.objc_msgSend("void", this, "setIntercellSpacing:", intercellSpacing)
    }

    public open fun usesAlternatingRowBackgroundColors(): Boolean =
        Native.objc_msgSend("boolean", this, "usesAlternatingRowBackgroundColors") as Boolean

    public open fun setUsesAlternatingRowBackgroundColors(usesAlternatingRowBackgroundColors: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesAlternatingRowBackgroundColors:", usesAlternatingRowBackgroundColors)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun gridColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "gridColor") as NSColor

    public open fun setGridColor(gridColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setGridColor:", gridColor)
    }

    public open fun rowSizeStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "rowSizeStyle")

    public open fun setRowSizeStyle(rowSizeStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setRowSizeStyle:", rowSizeStyle)
    }

    public open fun effectiveRowSizeStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "effectiveRowSizeStyle")

    public open fun rowHeight(): Double =
        Native.objc_msgSend("double", this, "rowHeight") as Double

    public open fun setRowHeight(rowHeight: Double): Unit {
        Native.objc_msgSend("void", this, "setRowHeight:", rowHeight)
    }

    public open fun noteHeightOfRowsWithIndexesChanged(indexSet: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "noteHeightOfRowsWithIndexesChanged:", indexSet)
    }

    public open fun tableColumns(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "tableColumns") as NSArray

    public open fun numberOfColumns(): Int =
        Native.objc_msgSend("int", this, "numberOfColumns") as Int

    public open fun numberOfRows(): Int =
        Native.objc_msgSend("int", this, "numberOfRows") as Int

    public open fun addTableColumn(tableColumn: NSTableColumn): Unit {
        Native.objc_msgSend("void", this, "addTableColumn:", tableColumn)
    }

    public open fun removeTableColumn(tableColumn: NSTableColumn): Unit {
        Native.objc_msgSend("void", this, "removeTableColumn:", tableColumn)
    }

    public open fun moveColumn_toColumn(oldIndex: Int, newIndex: Int): Unit {
        Native.objc_msgSend("void", this, "moveColumn:toColumn:", oldIndex, newIndex)
    }

    public open fun columnWithIdentifier(identifier: NSString): Int =
        Native.objc_msgSend("int", this, "columnWithIdentifier:", identifier) as Int

    public open fun tableColumnWithIdentifier(identifier: NSString): NSTableColumn =
        Native.objc_msgSend("class objc.NSTableColumn", this, "tableColumnWithIdentifier:", identifier) as NSTableColumn

    public open fun tile(): Unit {
        Native.objc_msgSend("void", this, "tile")
    }

    override fun sizeToFit(): Unit {
        Native.objc_msgSend("void", this, "sizeToFit")
    }

    public open fun sizeLastColumnToFit(): Unit {
        Native.objc_msgSend("void", this, "sizeLastColumnToFit")
    }

    public open fun scrollRowToVisible(row: Int): Unit {
        Native.objc_msgSend("void", this, "scrollRowToVisible:", row)
    }

    public open fun scrollColumnToVisible(column: Int): Unit {
        Native.objc_msgSend("void", this, "scrollColumnToVisible:", column)
    }

    public open fun reloadData(): Unit {
        Native.objc_msgSend("void", this, "reloadData")
    }

    public open fun noteNumberOfRowsChanged(): Unit {
        Native.objc_msgSend("void", this, "noteNumberOfRowsChanged")
    }

    public open fun reloadDataForRowIndexes_columnIndexes(rowIndexes: NSIndexSet, columnIndexes: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "reloadDataForRowIndexes:columnIndexes:", rowIndexes, columnIndexes)
    }

    public open fun editedColumn(): Int =
        Native.objc_msgSend("int", this, "editedColumn") as Int

    public open fun editedRow(): Int =
        Native.objc_msgSend("int", this, "editedRow") as Int

    public open fun clickedColumn(): Int =
        Native.objc_msgSend("int", this, "clickedColumn") as Int

    public open fun clickedRow(): Int =
        Native.objc_msgSend("int", this, "clickedRow") as Int

    public open fun doubleAction(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "doubleAction") as ObjCSelector

    public open fun setDoubleAction(doubleAction: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setDoubleAction:", doubleAction)
    }

    public open fun sortDescriptors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortDescriptors") as NSArray

    public open fun setSortDescriptors(sortDescriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSortDescriptors:", sortDescriptors)
    }

    public open fun setIndicatorImage_inTableColumn(anImage: NSImage, tableColumn: NSTableColumn): Unit {
        Native.objc_msgSend("void", this, "setIndicatorImage:inTableColumn:", anImage, tableColumn)
    }

    public open fun indicatorImageInTableColumn(tableColumn: NSTableColumn): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "indicatorImageInTableColumn:", tableColumn) as NSImage

    public open fun highlightedTableColumn(): NSTableColumn =
        Native.objc_msgSend("class objc.NSTableColumn", this, "highlightedTableColumn") as NSTableColumn

    public open fun setHighlightedTableColumn(highlightedTableColumn: NSTableColumn): Unit {
        Native.objc_msgSend("void", this, "setHighlightedTableColumn:", highlightedTableColumn)
    }

    public open fun verticalMotionCanBeginDrag(): Boolean =
        Native.objc_msgSend("boolean", this, "verticalMotionCanBeginDrag") as Boolean

    public open fun setVerticalMotionCanBeginDrag(verticalMotionCanBeginDrag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setVerticalMotionCanBeginDrag:", verticalMotionCanBeginDrag)
    }

    public open fun canDragRowsWithIndexes_atPoint(rowIndexes: NSIndexSet, mouseDownPoint: Any): Boolean =
        Native.objc_msgSend("boolean", this, "canDragRowsWithIndexes:atPoint:", rowIndexes, mouseDownPoint) as Boolean

    public open fun dragImageForRowsWithIndexes_tableColumns_event_offset(dragRows: NSIndexSet, tableColumns: NSArray, dragEvent: NSEvent, dragImageOffset: Pointer<Any>): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "dragImageForRowsWithIndexes:tableColumns:event:offset:", dragRows, tableColumns, dragEvent, dragImageOffset) as NSImage

    public open fun setDraggingSourceOperationMask_forLocal(mask: Any, isLocal: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDraggingSourceOperationMask:forLocal:", mask, isLocal)
    }

    public open fun setDropRow_dropOperation(row: Int, dropOperation: Any): Unit {
        Native.objc_msgSend("void", this, "setDropRow:dropOperation:", row, dropOperation)
    }

    public open fun allowsMultipleSelection(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsMultipleSelection") as Boolean

    public open fun setAllowsMultipleSelection(allowsMultipleSelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsMultipleSelection:", allowsMultipleSelection)
    }

    public open fun allowsEmptySelection(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsEmptySelection") as Boolean

    public open fun setAllowsEmptySelection(allowsEmptySelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsEmptySelection:", allowsEmptySelection)
    }

    public open fun allowsColumnSelection(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsColumnSelection") as Boolean

    public open fun setAllowsColumnSelection(allowsColumnSelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsColumnSelection:", allowsColumnSelection)
    }

    override fun selectAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectAll:", sender)
    }

    public open fun deselectAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deselectAll:", sender)
    }

    public open fun selectColumnIndexes_byExtendingSelection(indexes: NSIndexSet, extend: Boolean): Unit {
        Native.objc_msgSend("void", this, "selectColumnIndexes:byExtendingSelection:", indexes, extend)
    }

    public open fun selectRowIndexes_byExtendingSelection(indexes: NSIndexSet, extend: Boolean): Unit {
        Native.objc_msgSend("void", this, "selectRowIndexes:byExtendingSelection:", indexes, extend)
    }

    public open fun selectedColumnIndexes(): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "selectedColumnIndexes") as NSIndexSet

    public open fun selectedRowIndexes(): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "selectedRowIndexes") as NSIndexSet

    public open fun deselectColumn(column: Int): Unit {
        Native.objc_msgSend("void", this, "deselectColumn:", column)
    }

    public open fun deselectRow(row: Int): Unit {
        Native.objc_msgSend("void", this, "deselectRow:", row)
    }

    public open fun selectedColumn(): Int =
        Native.objc_msgSend("int", this, "selectedColumn") as Int

    public open fun selectedRow(): Int =
        Native.objc_msgSend("int", this, "selectedRow") as Int

    public open fun isColumnSelected(column: Int): Boolean =
        Native.objc_msgSend("boolean", this, "isColumnSelected:", column) as Boolean

    public open fun isRowSelected(row: Int): Boolean =
        Native.objc_msgSend("boolean", this, "isRowSelected:", row) as Boolean

    public open fun numberOfSelectedColumns(): Int =
        Native.objc_msgSend("int", this, "numberOfSelectedColumns") as Int

    public open fun numberOfSelectedRows(): Int =
        Native.objc_msgSend("int", this, "numberOfSelectedRows") as Int

    public open fun allowsTypeSelect(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsTypeSelect") as Boolean

    public open fun setAllowsTypeSelect(allowsTypeSelect: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsTypeSelect:", allowsTypeSelect)
    }

    public open fun selectionHighlightStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "selectionHighlightStyle")

    public open fun setSelectionHighlightStyle(selectionHighlightStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setSelectionHighlightStyle:", selectionHighlightStyle)
    }

    public open fun draggingDestinationFeedbackStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "draggingDestinationFeedbackStyle")

    public open fun setDraggingDestinationFeedbackStyle(draggingDestinationFeedbackStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setDraggingDestinationFeedbackStyle:", draggingDestinationFeedbackStyle)
    }

    public open fun rectOfColumn(column: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rectOfColumn:", column)

    public open fun rectOfRow(row: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rectOfRow:", row)

    public open fun columnIndexesInRect(rect: Any): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "columnIndexesInRect:", rect) as NSIndexSet

    public open fun rowsInRect(rect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rowsInRect:", rect)

    public open fun columnAtPoint(point: Any): Int =
        Native.objc_msgSend("int", this, "columnAtPoint:", point) as Int

    public open fun rowAtPoint(point: Any): Int =
        Native.objc_msgSend("int", this, "rowAtPoint:", point) as Int

    public open fun frameOfCellAtColumn_row(column: Int, row: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "frameOfCellAtColumn:row:", column, row)

    public open fun autosaveName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "autosaveName") as NSString

    public open fun setAutosaveName(autosaveName: NSString): Unit {
        Native.objc_msgSend("void", this, "setAutosaveName:", autosaveName)
    }

    public open fun autosaveTableColumns(): Boolean =
        Native.objc_msgSend("boolean", this, "autosaveTableColumns") as Boolean

    public open fun setAutosaveTableColumns(autosaveTableColumns: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutosaveTableColumns:", autosaveTableColumns)
    }

    public open fun editColumn_row_withEvent_select(column: Int, row: Int, theEvent: NSEvent, select: Boolean): Unit {
        Native.objc_msgSend("void", this, "editColumn:row:withEvent:select:", column, row, theEvent, select)
    }

    public open fun drawRow_clipRect(row: Int, clipRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawRow:clipRect:", row, clipRect)
    }

    public open fun highlightSelectionInClipRect(clipRect: Any): Unit {
        Native.objc_msgSend("void", this, "highlightSelectionInClipRect:", clipRect)
    }

    public open fun drawGridInClipRect(clipRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawGridInClipRect:", clipRect)
    }

    public open fun drawBackgroundInClipRect(clipRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawBackgroundInClipRect:", clipRect)
    }

    public open fun viewAtColumn_row_makeIfNecessary(column: Int, row: Int, makeIfNecessary: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "viewAtColumn:row:makeIfNecessary:", column, row, makeIfNecessary) as ObjCObject

    public open fun rowViewAtRow_makeIfNecessary(row: Int, makeIfNecessary: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "rowViewAtRow:makeIfNecessary:", row, makeIfNecessary) as ObjCObject

    public open fun rowForView(view: NSView): Int =
        Native.objc_msgSend("int", this, "rowForView:", view) as Int

    public open fun columnForView(view: NSView): Int =
        Native.objc_msgSend("int", this, "columnForView:", view) as Int

    public open fun makeViewWithIdentifier_owner(identifier: NSString, owner: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "makeViewWithIdentifier:owner:", identifier, owner) as ObjCObject

    public open fun enumerateAvailableRowViewsUsingBlock(handler: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateAvailableRowViewsUsingBlock:", handler)
    }

    public open fun floatsGroupRows(): Boolean =
        Native.objc_msgSend("boolean", this, "floatsGroupRows") as Boolean

    public open fun setFloatsGroupRows(floatsGroupRows: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFloatsGroupRows:", floatsGroupRows)
    }

    public open fun beginUpdates(): Unit {
        Native.objc_msgSend("void", this, "beginUpdates")
    }

    public open fun endUpdates(): Unit {
        Native.objc_msgSend("void", this, "endUpdates")
    }

    public open fun insertRowsAtIndexes_withAnimation(indexes: NSIndexSet, animationOptions: Any): Unit {
        Native.objc_msgSend("void", this, "insertRowsAtIndexes:withAnimation:", indexes, animationOptions)
    }

    public open fun removeRowsAtIndexes_withAnimation(indexes: NSIndexSet, animationOptions: Any): Unit {
        Native.objc_msgSend("void", this, "removeRowsAtIndexes:withAnimation:", indexes, animationOptions)
    }

    public open fun moveRowAtIndex_toIndex(oldIndex: Int, newIndex: Int): Unit {
        Native.objc_msgSend("void", this, "moveRowAtIndex:toIndex:", oldIndex, newIndex)
    }

    public open fun registerNib_forIdentifier(nib: NSNib, identifier: NSString): Unit {
        Native.objc_msgSend("void", this, "registerNib:forIdentifier:", nib, identifier)
    }

    public open fun registeredNibsByIdentifier(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "registeredNibsByIdentifier") as NSDictionary

    public open fun didAddRowView_forRow(rowView: NSTableRowView, row: Int): Unit {
        Native.objc_msgSend("void", this, "didAddRowView:forRow:", rowView, row)
    }

    public open fun didRemoveRowView_forRow(rowView: NSTableRowView, row: Int): Unit {
        Native.objc_msgSend("void", this, "didRemoveRowView:forRow:", rowView, row)
    }

    public open fun usesStaticContents(): Boolean =
        Native.objc_msgSend("boolean", this, "usesStaticContents") as Boolean

    public open fun setUsesStaticContents(usesStaticContents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesStaticContents:", usesStaticContents)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

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

    trait metaclass : NSControl.metaclass, NSUserInterfaceValidations.metaclass, NSTextViewDelegate.metaclass, NSDraggingSource.metaclass, NSAccessibilityTable.metaclass, NSTableView_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTableView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSTableViewDataSourceDeprecated : IObjCObject {
    public open fun tableView_writeRows_toPasteboard(tableView: NSTableView, rows: NSArray, pboard: NSPasteboard): Boolean =
        Native.objc_msgSend("boolean", this, "tableView:writeRows:toPasteboard:", tableView, rows, pboard) as Boolean

    trait metaclass : IObjCObject
}

trait NSTableView_NSDeprecated : IObjCObject {
    public open fun setDrawsGrid(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsGrid:", flag)
    }

    public open fun drawsGrid(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsGrid") as Boolean

    public open fun selectColumn_byExtendingSelection(column: Int, extend: Boolean): Unit {
        Native.objc_msgSend("void", this, "selectColumn:byExtendingSelection:", column, extend)
    }

    public open fun selectRow_byExtendingSelection(row: Int, extend: Boolean): Unit {
        Native.objc_msgSend("void", this, "selectRow:byExtendingSelection:", row, extend)
    }

    public open fun selectedColumnEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "selectedColumnEnumerator") as NSEnumerator

    public open fun selectedRowEnumerator(): NSEnumerator =
        Native.objc_msgSend("class objc.NSEnumerator", this, "selectedRowEnumerator") as NSEnumerator

    public open fun dragImageForRows_event_dragImageOffset(dragRows: NSArray, dragEvent: NSEvent, dragImageOffset: Pointer<Any>): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "dragImageForRows:event:dragImageOffset:", dragRows, dragEvent, dragImageOffset) as NSImage

    public open fun setAutoresizesAllColumnsToFit(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutoresizesAllColumnsToFit:", flag)
    }

    public open fun autoresizesAllColumnsToFit(): Boolean =
        Native.objc_msgSend("boolean", this, "autoresizesAllColumnsToFit") as Boolean

    public open fun columnsInRect(rect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "columnsInRect:", rect)

    public open fun preparedCellAtColumn_row(column: Int, row: Int): NSCell =
        Native.objc_msgSend("class objc.NSCell", this, "preparedCellAtColumn:row:", column, row) as NSCell

    public open fun textShouldBeginEditing(textObject: NSText): Boolean =
        Native.objc_msgSend("boolean", this, "textShouldBeginEditing:", textObject) as Boolean

    public open fun textShouldEndEditing(textObject: NSText): Boolean =
        Native.objc_msgSend("boolean", this, "textShouldEndEditing:", textObject) as Boolean

    public open fun textDidBeginEditing(notification: NSNotification): Unit {
        Native.objc_msgSend("void", this, "textDidBeginEditing:", notification)
    }

    public open fun textDidEndEditing(notification: NSNotification): Unit {
        Native.objc_msgSend("void", this, "textDidEndEditing:", notification)
    }

    public open fun textDidChange(notification: NSNotification): Unit {
        Native.objc_msgSend("void", this, "textDidChange:", notification)
    }

    public open fun shouldFocusCell_atColumn_row(cell: NSCell, column: Int, row: Int): Boolean =
        Native.objc_msgSend("boolean", this, "shouldFocusCell:atColumn:row:", cell, column, row) as Boolean

    public open fun focusedColumn(): Int =
        Native.objc_msgSend("int", this, "focusedColumn") as Int

    public open fun setFocusedColumn(focusedColumn: Int): Unit {
        Native.objc_msgSend("void", this, "setFocusedColumn:", focusedColumn)
    }

    public open fun performClickOnCellAtColumn_row(column: Int, row: Int): Unit {
        Native.objc_msgSend("void", this, "performClickOnCellAtColumn:row:", column, row)
    }

    trait metaclass : IObjCObject
}
