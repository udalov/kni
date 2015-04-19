// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSMatrix.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSMatrixDelegate {
    trait metaclass
}

public open class NSMatrix(pointer: Long) : NSControl(pointer), NSUserInterfaceValidations, NSMatrix_NSKeyboardUI {
    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    public open fun initWithFrame_mode_prototype_numberOfRows_numberOfColumns(frameRect: Any, aMode: Any, aCell: NSCell, rowsHigh: Int, colsWide: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:mode:prototype:numberOfRows:numberOfColumns:", frameRect, aMode, aCell, rowsHigh, colsWide) as ObjCObject

    public open fun initWithFrame_mode_cellClass_numberOfRows_numberOfColumns(frameRect: Any, aMode: Any, factoryId: ObjCClass, rowsHigh: Int, colsWide: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:mode:cellClass:numberOfRows:numberOfColumns:", frameRect, aMode, factoryId, rowsHigh, colsWide) as ObjCObject

    public open fun cellClass(): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "cellClass") as ObjCClass

    public open fun setCellClass(cellClass: ObjCClass): Unit {
        Native.objc_msgSend("void", this, "setCellClass:", cellClass)
    }

    public open fun prototype(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "prototype") as ObjCObject

    public open fun setPrototype(prototype: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setPrototype:", prototype)
    }

    public open fun makeCellAtRow_column(row: Int, col: Int): NSCell =
        Native.objc_msgSend("class objc.NSCell", this, "makeCellAtRow:column:", row, col) as NSCell

    public open fun mode(): Any =
        Native.objc_msgSend("class objc.Any", this, "mode")

    public open fun setMode(mode: Any): Unit {
        Native.objc_msgSend("void", this, "setMode:", mode)
    }

    public open fun allowsEmptySelection(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsEmptySelection") as Boolean

    public open fun setAllowsEmptySelection(allowsEmptySelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsEmptySelection:", allowsEmptySelection)
    }

    public open fun sendAction_to_forAllCells(aSelector: ObjCSelector, anObject: ObjCObject, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "sendAction:to:forAllCells:", aSelector, anObject, flag)
    }

    public open fun cells(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "cells") as NSArray

    public open fun sortUsingSelector(comparator: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "sortUsingSelector:", comparator)
    }

    public open fun sortUsingFunction_context(compare: (Any, Any, Pointer<*>) -> Int, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "sortUsingFunction:context:", compare, context)
    }

    override fun selectedCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "selectedCell") as ObjCObject

    public open fun selectedCells(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectedCells") as NSArray

    public open fun selectedRow(): Int =
        Native.objc_msgSend("int", this, "selectedRow") as Int

    public open fun selectedColumn(): Int =
        Native.objc_msgSend("int", this, "selectedColumn") as Int

    public open fun isSelectionByRect(): Boolean =
        Native.objc_msgSend("boolean", this, "isSelectionByRect") as Boolean

    public open fun setSelectionByRect(selectionByRect: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectionByRect:", selectionByRect)
    }

    public open fun setSelectionFrom_to_anchor_highlight(startPos: Int, endPos: Int, anchorPos: Int, lit: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectionFrom:to:anchor:highlight:", startPos, endPos, anchorPos, lit)
    }

    public open fun deselectSelectedCell(): Unit {
        Native.objc_msgSend("void", this, "deselectSelectedCell")
    }

    public open fun deselectAllCells(): Unit {
        Native.objc_msgSend("void", this, "deselectAllCells")
    }

    public open fun selectCellAtRow_column(row: Int, col: Int): Unit {
        Native.objc_msgSend("void", this, "selectCellAtRow:column:", row, col)
    }

    override fun selectAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectAll:", sender)
    }

    public open fun selectCellWithTag(anInt: Int): Boolean =
        Native.objc_msgSend("boolean", this, "selectCellWithTag:", anInt) as Boolean

    public open fun cellSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "cellSize")

    public open fun setCellSize(cellSize: Any): Unit {
        Native.objc_msgSend("void", this, "setCellSize:", cellSize)
    }

    public open fun intercellSpacing(): Any =
        Native.objc_msgSend("class objc.Any", this, "intercellSpacing")

    public open fun setIntercellSpacing(intercellSpacing: Any): Unit {
        Native.objc_msgSend("void", this, "setIntercellSpacing:", intercellSpacing)
    }

    public open fun setScrollable(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setScrollable:", flag)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun cellBackgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "cellBackgroundColor") as NSColor

    public open fun setCellBackgroundColor(cellBackgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setCellBackgroundColor:", cellBackgroundColor)
    }

    public open fun drawsCellBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsCellBackground") as Boolean

    public open fun setDrawsCellBackground(drawsCellBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsCellBackground:", drawsCellBackground)
    }

    public open fun drawsBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsBackground") as Boolean

    public open fun setDrawsBackground(drawsBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsBackground:", drawsBackground)
    }

    public open fun setState_atRow_column(value: Int, row: Int, col: Int): Unit {
        Native.objc_msgSend("void", this, "setState:atRow:column:", value, row, col)
    }

    public open fun getNumberOfRows_columns(rowCount: Pointer<Int>, colCount: Pointer<Int>): Unit {
        Native.objc_msgSend("void", this, "getNumberOfRows:columns:", rowCount, colCount)
    }

    public open fun numberOfRows(): Int =
        Native.objc_msgSend("int", this, "numberOfRows") as Int

    public open fun numberOfColumns(): Int =
        Native.objc_msgSend("int", this, "numberOfColumns") as Int

    public open fun cellAtRow_column(row: Int, col: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "cellAtRow:column:", row, col) as ObjCObject

    public open fun cellFrameAtRow_column(row: Int, col: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "cellFrameAtRow:column:", row, col)

    public open fun getRow_column_ofCell(row: Pointer<Int>, col: Pointer<Int>, aCell: NSCell): Boolean =
        Native.objc_msgSend("boolean", this, "getRow:column:ofCell:", row, col, aCell) as Boolean

    public open fun getRow_column_forPoint(row: Pointer<Int>, col: Pointer<Int>, aPoint: Any): Boolean =
        Native.objc_msgSend("boolean", this, "getRow:column:forPoint:", row, col, aPoint) as Boolean

    public open fun renewRows_columns(newRows: Int, newCols: Int): Unit {
        Native.objc_msgSend("void", this, "renewRows:columns:", newRows, newCols)
    }

    public open fun putCell_atRow_column(newCell: NSCell, row: Int, col: Int): Unit {
        Native.objc_msgSend("void", this, "putCell:atRow:column:", newCell, row, col)
    }

    public open fun addRow(): Unit {
        Native.objc_msgSend("void", this, "addRow")
    }

    public open fun addRowWithCells(newCells: NSArray): Unit {
        Native.objc_msgSend("void", this, "addRowWithCells:", newCells)
    }

    public open fun insertRow(row: Int): Unit {
        Native.objc_msgSend("void", this, "insertRow:", row)
    }

    public open fun insertRow_withCells(row: Int, newCells: NSArray): Unit {
        Native.objc_msgSend("void", this, "insertRow:withCells:", row, newCells)
    }

    public open fun removeRow(row: Int): Unit {
        Native.objc_msgSend("void", this, "removeRow:", row)
    }

    public open fun addColumn(): Unit {
        Native.objc_msgSend("void", this, "addColumn")
    }

    public open fun addColumnWithCells(newCells: NSArray): Unit {
        Native.objc_msgSend("void", this, "addColumnWithCells:", newCells)
    }

    public open fun insertColumn(column: Int): Unit {
        Native.objc_msgSend("void", this, "insertColumn:", column)
    }

    public open fun insertColumn_withCells(column: Int, newCells: NSArray): Unit {
        Native.objc_msgSend("void", this, "insertColumn:withCells:", column, newCells)
    }

    public open fun removeColumn(col: Int): Unit {
        Native.objc_msgSend("void", this, "removeColumn:", col)
    }

    public open fun cellWithTag(anInt: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "cellWithTag:", anInt) as ObjCObject

    public open fun doubleAction(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "doubleAction") as ObjCSelector

    public open fun setDoubleAction(doubleAction: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setDoubleAction:", doubleAction)
    }

    public open fun autosizesCells(): Boolean =
        Native.objc_msgSend("boolean", this, "autosizesCells") as Boolean

    public open fun setAutosizesCells(autosizesCells: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutosizesCells:", autosizesCells)
    }

    public open fun sizeToCells(): Unit {
        Native.objc_msgSend("void", this, "sizeToCells")
    }

    public open fun setValidateSize(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setValidateSize:", flag)
    }

    public open fun drawCellAtRow_column(row: Int, col: Int): Unit {
        Native.objc_msgSend("void", this, "drawCellAtRow:column:", row, col)
    }

    public open fun highlightCell_atRow_column(flag: Boolean, row: Int, col: Int): Unit {
        Native.objc_msgSend("void", this, "highlightCell:atRow:column:", flag, row, col)
    }

    public open fun isAutoscroll(): Boolean =
        Native.objc_msgSend("boolean", this, "isAutoscroll") as Boolean

    public open fun setAutoscroll(autoscroll: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutoscroll:", autoscroll)
    }

    public open fun scrollCellToVisibleAtRow_column(row: Int, col: Int): Unit {
        Native.objc_msgSend("void", this, "scrollCellToVisibleAtRow:column:", row, col)
    }

    public open fun mouseDownFlags(): Int =
        Native.objc_msgSend("int", this, "mouseDownFlags") as Int

    override fun mouseDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDown:", theEvent)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    public open fun sendAction(): Boolean =
        Native.objc_msgSend("boolean", this, "sendAction") as Boolean

    public open fun sendDoubleAction(): Unit {
        Native.objc_msgSend("void", this, "sendDoubleAction")
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

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

    public open fun selectText(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectText:", sender)
    }

    public open fun selectTextAtRow_column(row: Int, col: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "selectTextAtRow:column:", row, col) as ObjCObject

    override fun acceptsFirstMouse(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsFirstMouse:", theEvent) as Boolean

    override fun resetCursorRects(): Unit {
        Native.objc_msgSend("void", this, "resetCursorRects")
    }

    public open fun setToolTip_forCell(toolTipString: NSString, cell: NSCell): Unit {
        Native.objc_msgSend("void", this, "setToolTip:forCell:", toolTipString, cell)
    }

    public open fun toolTipForCell(cell: NSCell): NSString =
        Native.objc_msgSend("class objc.NSString", this, "toolTipForCell:", cell) as NSString

    public open fun autorecalculatesCellSize(): Boolean =
        Native.objc_msgSend("boolean", this, "autorecalculatesCellSize") as Boolean

    public open fun setAutorecalculatesCellSize(autorecalculatesCellSize: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutorecalculatesCellSize:", autorecalculatesCellSize)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    override fun refusesFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "refusesFirstResponder") as Boolean

    override fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    trait metaclass : NSControl.metaclass, NSUserInterfaceValidations.metaclass, NSMatrix_NSKeyboardUI.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMatrix")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSMatrix_NSKeyboardUI : IObjCObject {
    public open fun tabKeyTraversesCells(): Boolean =
        Native.objc_msgSend("boolean", this, "tabKeyTraversesCells") as Boolean

    public open fun setTabKeyTraversesCells(tabKeyTraversesCells: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTabKeyTraversesCells:", tabKeyTraversesCells)
    }

    public open fun keyCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "keyCell") as ObjCObject

    public open fun setKeyCell(keyCell: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setKeyCell:", keyCell)
    }

    trait metaclass : IObjCObject
}
