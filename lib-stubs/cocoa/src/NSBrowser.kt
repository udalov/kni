// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSBrowser.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSBrowserDelegate {
    trait metaclass
}

public open class NSBrowser(pointer: Long) : NSControl(pointer), NSBrowser_NSDeprecated {
    public open fun loadColumnZero(): Unit {
        Native.objc_msgSend("void", this, "loadColumnZero")
    }

    public open fun isLoaded(): Boolean =
        Native.objc_msgSend("boolean", this, "isLoaded") as Boolean

    public open fun doubleAction(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "doubleAction") as ObjCSelector

    public open fun setDoubleAction(doubleAction: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setDoubleAction:", doubleAction)
    }

    public open fun setCellClass(factoryId: ObjCClass): Unit {
        Native.objc_msgSend("void", this, "setCellClass:", factoryId)
    }

    public open fun cellPrototype(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "cellPrototype") as ObjCObject

    public open fun setCellPrototype(cellPrototype: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setCellPrototype:", cellPrototype)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun reusesColumns(): Boolean =
        Native.objc_msgSend("boolean", this, "reusesColumns") as Boolean

    public open fun setReusesColumns(reusesColumns: Boolean): Unit {
        Native.objc_msgSend("void", this, "setReusesColumns:", reusesColumns)
    }

    public open fun hasHorizontalScroller(): Boolean =
        Native.objc_msgSend("boolean", this, "hasHorizontalScroller") as Boolean

    public open fun setHasHorizontalScroller(hasHorizontalScroller: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasHorizontalScroller:", hasHorizontalScroller)
    }

    public open fun autohidesScroller(): Boolean =
        Native.objc_msgSend("boolean", this, "autohidesScroller") as Boolean

    public open fun setAutohidesScroller(autohidesScroller: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutohidesScroller:", autohidesScroller)
    }

    public open fun separatesColumns(): Boolean =
        Native.objc_msgSend("boolean", this, "separatesColumns") as Boolean

    public open fun setSeparatesColumns(separatesColumns: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSeparatesColumns:", separatesColumns)
    }

    public open fun isTitled(): Boolean =
        Native.objc_msgSend("boolean", this, "isTitled") as Boolean

    public open fun setTitled(titled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTitled:", titled)
    }

    public open fun minColumnWidth(): Double =
        Native.objc_msgSend("double", this, "minColumnWidth") as Double

    public open fun setMinColumnWidth(minColumnWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setMinColumnWidth:", minColumnWidth)
    }

    public open fun maxVisibleColumns(): Int =
        Native.objc_msgSend("int", this, "maxVisibleColumns") as Int

    public open fun setMaxVisibleColumns(maxVisibleColumns: Int): Unit {
        Native.objc_msgSend("void", this, "setMaxVisibleColumns:", maxVisibleColumns)
    }

    public open fun allowsMultipleSelection(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsMultipleSelection") as Boolean

    public open fun setAllowsMultipleSelection(allowsMultipleSelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsMultipleSelection:", allowsMultipleSelection)
    }

    public open fun allowsBranchSelection(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsBranchSelection") as Boolean

    public open fun setAllowsBranchSelection(allowsBranchSelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsBranchSelection:", allowsBranchSelection)
    }

    public open fun allowsEmptySelection(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsEmptySelection") as Boolean

    public open fun setAllowsEmptySelection(allowsEmptySelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsEmptySelection:", allowsEmptySelection)
    }

    public open fun takesTitleFromPreviousColumn(): Boolean =
        Native.objc_msgSend("boolean", this, "takesTitleFromPreviousColumn") as Boolean

    public open fun setTakesTitleFromPreviousColumn(takesTitleFromPreviousColumn: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTakesTitleFromPreviousColumn:", takesTitleFromPreviousColumn)
    }

    public open fun sendsActionOnArrowKeys(): Boolean =
        Native.objc_msgSend("boolean", this, "sendsActionOnArrowKeys") as Boolean

    public open fun setSendsActionOnArrowKeys(sendsActionOnArrowKeys: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSendsActionOnArrowKeys:", sendsActionOnArrowKeys)
    }

    public open fun itemAtIndexPath(indexPath: NSIndexPath): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "itemAtIndexPath:", indexPath) as ObjCObject

    public open fun itemAtRow_inColumn(row: Int, column: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "itemAtRow:inColumn:", row, column) as ObjCObject

    public open fun indexPathForColumn(column: Int): NSIndexPath =
        Native.objc_msgSend("class objc.NSIndexPath", this, "indexPathForColumn:", column) as NSIndexPath

    public open fun isLeafItem(item: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "isLeafItem:", item) as Boolean

    public open fun reloadDataForRowIndexes_inColumn(rowIndexes: NSIndexSet, column: Int): Unit {
        Native.objc_msgSend("void", this, "reloadDataForRowIndexes:inColumn:", rowIndexes, column)
    }

    public open fun parentForItemsInColumn(column: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "parentForItemsInColumn:", column) as ObjCObject

    public open fun scrollRowToVisible_inColumn(row: Int, column: Int): Unit {
        Native.objc_msgSend("void", this, "scrollRowToVisible:inColumn:", row, column)
    }

    public open fun setTitle_ofColumn(aString: NSString, column: Int): Unit {
        Native.objc_msgSend("void", this, "setTitle:ofColumn:", aString, column)
    }

    public open fun titleOfColumn(column: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "titleOfColumn:", column) as NSString

    public open fun pathSeparator(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathSeparator") as NSString

    public open fun setPathSeparator(pathSeparator: NSString): Unit {
        Native.objc_msgSend("void", this, "setPathSeparator:", pathSeparator)
    }

    public open fun setPath(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setPath:", path) as Boolean

    public open fun path(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "path") as NSString

    public open fun pathToColumn(column: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathToColumn:", column) as NSString

    public open fun clickedColumn(): Int =
        Native.objc_msgSend("int", this, "clickedColumn") as Int

    public open fun clickedRow(): Int =
        Native.objc_msgSend("int", this, "clickedRow") as Int

    public open fun selectedColumn(): Int =
        Native.objc_msgSend("int", this, "selectedColumn") as Int

    override fun selectedCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "selectedCell") as ObjCObject

    public open fun selectedCellInColumn(column: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "selectedCellInColumn:", column) as ObjCObject

    public open fun selectedCells(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectedCells") as NSArray

    public open fun selectRow_inColumn(row: Int, column: Int): Unit {
        Native.objc_msgSend("void", this, "selectRow:inColumn:", row, column)
    }

    public open fun selectedRowInColumn(column: Int): Int =
        Native.objc_msgSend("int", this, "selectedRowInColumn:", column) as Int

    public open fun selectionIndexPath(): NSIndexPath =
        Native.objc_msgSend("class objc.NSIndexPath", this, "selectionIndexPath") as NSIndexPath

    public open fun setSelectionIndexPath(selectionIndexPath: NSIndexPath): Unit {
        Native.objc_msgSend("void", this, "setSelectionIndexPath:", selectionIndexPath)
    }

    public open fun selectionIndexPaths(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectionIndexPaths") as NSArray

    public open fun setSelectionIndexPaths(selectionIndexPaths: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSelectionIndexPaths:", selectionIndexPaths)
    }

    public open fun selectRowIndexes_inColumn(indexes: NSIndexSet, column: Int): Unit {
        Native.objc_msgSend("void", this, "selectRowIndexes:inColumn:", indexes, column)
    }

    public open fun selectedRowIndexesInColumn(column: Int): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "selectedRowIndexesInColumn:", column) as NSIndexSet

    public open fun reloadColumn(column: Int): Unit {
        Native.objc_msgSend("void", this, "reloadColumn:", column)
    }

    public open fun validateVisibleColumns(): Unit {
        Native.objc_msgSend("void", this, "validateVisibleColumns")
    }

    public open fun scrollColumnsRightBy(shiftAmount: Int): Unit {
        Native.objc_msgSend("void", this, "scrollColumnsRightBy:", shiftAmount)
    }

    public open fun scrollColumnsLeftBy(shiftAmount: Int): Unit {
        Native.objc_msgSend("void", this, "scrollColumnsLeftBy:", shiftAmount)
    }

    public open fun scrollColumnToVisible(column: Int): Unit {
        Native.objc_msgSend("void", this, "scrollColumnToVisible:", column)
    }

    public open fun lastColumn(): Int =
        Native.objc_msgSend("int", this, "lastColumn") as Int

    public open fun setLastColumn(lastColumn: Int): Unit {
        Native.objc_msgSend("void", this, "setLastColumn:", lastColumn)
    }

    public open fun addColumn(): Unit {
        Native.objc_msgSend("void", this, "addColumn")
    }

    public open fun numberOfVisibleColumns(): Int =
        Native.objc_msgSend("int", this, "numberOfVisibleColumns") as Int

    public open fun firstVisibleColumn(): Int =
        Native.objc_msgSend("int", this, "firstVisibleColumn") as Int

    public open fun lastVisibleColumn(): Int =
        Native.objc_msgSend("int", this, "lastVisibleColumn") as Int

    public open fun loadedCellAtRow_column(row: Int, col: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "loadedCellAtRow:column:", row, col) as ObjCObject

    override fun selectAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectAll:", sender)
    }

    public open fun tile(): Unit {
        Native.objc_msgSend("void", this, "tile")
    }

    public open fun doClick(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "doClick:", sender)
    }

    public open fun doDoubleClick(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "doDoubleClick:", sender)
    }

    public open fun sendAction(): Boolean =
        Native.objc_msgSend("boolean", this, "sendAction") as Boolean

    public open fun titleFrameOfColumn(column: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "titleFrameOfColumn:", column)

    public open fun drawTitleOfColumn_inRect(column: Int, aRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawTitleOfColumn:inRect:", column, aRect)
    }

    public open fun titleHeight(): Double =
        Native.objc_msgSend("double", this, "titleHeight") as Double

    public open fun frameOfColumn(column: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "frameOfColumn:", column)

    public open fun frameOfInsideOfColumn(column: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "frameOfInsideOfColumn:", column)

    public open fun frameOfRow_inColumn(row: Int, column: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "frameOfRow:inColumn:", row, column)

    public open fun getRow_column_forPoint(row: Pointer<Int>, column: Pointer<Int>, point: Any): Boolean =
        Native.objc_msgSend("boolean", this, "getRow:column:forPoint:", row, column, point) as Boolean

    public open fun columnWidthForColumnContentWidth(columnContentWidth: Double): Double =
        Native.objc_msgSend("double", this, "columnWidthForColumnContentWidth:", columnContentWidth) as Double

    public open fun columnContentWidthForColumnWidth(columnWidth: Double): Double =
        Native.objc_msgSend("double", this, "columnContentWidthForColumnWidth:", columnWidth) as Double

    public open fun columnResizingType(): Any =
        Native.objc_msgSend("class objc.Any", this, "columnResizingType")

    public open fun setColumnResizingType(columnResizingType: Any): Unit {
        Native.objc_msgSend("void", this, "setColumnResizingType:", columnResizingType)
    }

    public open fun prefersAllColumnUserResizing(): Boolean =
        Native.objc_msgSend("boolean", this, "prefersAllColumnUserResizing") as Boolean

    public open fun setPrefersAllColumnUserResizing(prefersAllColumnUserResizing: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPrefersAllColumnUserResizing:", prefersAllColumnUserResizing)
    }

    public open fun setWidth_ofColumn(columnWidth: Double, columnIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setWidth:ofColumn:", columnWidth, columnIndex)
    }

    public open fun widthOfColumn(column: Int): Double =
        Native.objc_msgSend("double", this, "widthOfColumn:", column) as Double

    public open fun rowHeight(): Double =
        Native.objc_msgSend("double", this, "rowHeight") as Double

    public open fun setRowHeight(rowHeight: Double): Unit {
        Native.objc_msgSend("void", this, "setRowHeight:", rowHeight)
    }

    public open fun noteHeightOfRowsWithIndexesChanged_inColumn(indexSet: NSIndexSet, columnIndex: Int): Unit {
        Native.objc_msgSend("void", this, "noteHeightOfRowsWithIndexesChanged:inColumn:", indexSet, columnIndex)
    }

    public open fun setDefaultColumnWidth(columnWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setDefaultColumnWidth:", columnWidth)
    }

    public open fun defaultColumnWidth(): Double =
        Native.objc_msgSend("double", this, "defaultColumnWidth") as Double

    public open fun columnsAutosaveName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "columnsAutosaveName") as NSString

    public open fun setColumnsAutosaveName(columnsAutosaveName: NSString): Unit {
        Native.objc_msgSend("void", this, "setColumnsAutosaveName:", columnsAutosaveName)
    }

    public open fun canDragRowsWithIndexes_inColumn_withEvent(rowIndexes: NSIndexSet, column: Int, event: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "canDragRowsWithIndexes:inColumn:withEvent:", rowIndexes, column, event) as Boolean

    public open fun draggingImageForRowsWithIndexes_inColumn_withEvent_offset(rowIndexes: NSIndexSet, column: Int, event: NSEvent, dragImageOffset: Pointer<Any>): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "draggingImageForRowsWithIndexes:inColumn:withEvent:offset:", rowIndexes, column, event, dragImageOffset) as NSImage

    public open fun setDraggingSourceOperationMask_forLocal(mask: Any, isLocal: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDraggingSourceOperationMask:forLocal:", mask, isLocal)
    }

    public open fun allowsTypeSelect(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsTypeSelect") as Boolean

    public open fun setAllowsTypeSelect(allowsTypeSelect: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsTypeSelect:", allowsTypeSelect)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun editItemAtIndexPath_withEvent_select(indexPath: NSIndexPath, theEvent: NSEvent, select: Boolean): Unit {
        Native.objc_msgSend("void", this, "editItemAtIndexPath:withEvent:select:", indexPath, theEvent, select)
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

    override fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    trait metaclass : NSControl.metaclass, NSBrowser_NSDeprecated.metaclass {
        override fun cellClass(): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "cellClass") as ObjCClass

        public open fun removeSavedColumnsWithAutosaveName(name: NSString): Unit {
            Native.objc_msgSend("void", this, "removeSavedColumnsWithAutosaveName:", name)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSBrowser")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSBrowser_NSDeprecated : IObjCObject {
    public open fun setAcceptsArrowKeys(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAcceptsArrowKeys:", flag)
    }

    public open fun acceptsArrowKeys(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsArrowKeys") as Boolean

    public open fun displayColumn(column: Int): Unit {
        Native.objc_msgSend("void", this, "displayColumn:", column)
    }

    public open fun displayAllColumns(): Unit {
        Native.objc_msgSend("void", this, "displayAllColumns")
    }

    public open fun scrollViaScroller(sender: NSScroller): Unit {
        Native.objc_msgSend("void", this, "scrollViaScroller:", sender)
    }

    public open fun updateScroller(): Unit {
        Native.objc_msgSend("void", this, "updateScroller")
    }

    public open fun setMatrixClass(factoryId: ObjCClass): Unit {
        Native.objc_msgSend("void", this, "setMatrixClass:", factoryId)
    }

    public open fun matrixClass(): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "matrixClass") as ObjCClass

    public open fun columnOfMatrix(matrix: NSMatrix): Int =
        Native.objc_msgSend("int", this, "columnOfMatrix:", matrix) as Int

    public open fun matrixInColumn(column: Int): NSMatrix =
        Native.objc_msgSend("class objc.NSMatrix", this, "matrixInColumn:", column) as NSMatrix

    trait metaclass : IObjCObject
}
