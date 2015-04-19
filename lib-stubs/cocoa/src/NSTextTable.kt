// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextTable.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTextBlock(pointer: Long) : NSObject(pointer), NSCoding, NSCopying {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun setValue_type_forDimension(`val`: Double, type: Any, dimension: Any): Unit {
        Native.objc_msgSend("void", this, "setValue:type:forDimension:", `val`, type, dimension)
    }

    public open fun valueForDimension(dimension: Any): Double =
        Native.objc_msgSend("double", this, "valueForDimension:", dimension) as Double

    public open fun valueTypeForDimension(dimension: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "valueTypeForDimension:", dimension)

    public open fun setContentWidth_type(`val`: Double, type: Any): Unit {
        Native.objc_msgSend("void", this, "setContentWidth:type:", `val`, type)
    }

    public open fun contentWidth(): Double =
        Native.objc_msgSend("double", this, "contentWidth") as Double

    public open fun contentWidthValueType(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentWidthValueType")

    public open fun setWidth_type_forLayer_edge(`val`: Double, type: Any, layer: Any, edge: Int): Unit {
        Native.objc_msgSend("void", this, "setWidth:type:forLayer:edge:", `val`, type, layer, edge)
    }

    public open fun setWidth_type_forLayer(`val`: Double, type: Any, layer: Any): Unit {
        Native.objc_msgSend("void", this, "setWidth:type:forLayer:", `val`, type, layer)
    }

    public open fun widthForLayer_edge(layer: Any, edge: Int): Double =
        Native.objc_msgSend("double", this, "widthForLayer:edge:", layer, edge) as Double

    public open fun widthValueTypeForLayer_edge(layer: Any, edge: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "widthValueTypeForLayer:edge:", layer, edge)

    public open fun verticalAlignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "verticalAlignment")

    public open fun setVerticalAlignment(verticalAlignment: Any): Unit {
        Native.objc_msgSend("void", this, "setVerticalAlignment:", verticalAlignment)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun setBorderColor_forEdge(color: NSColor, edge: Int): Unit {
        Native.objc_msgSend("void", this, "setBorderColor:forEdge:", color, edge)
    }

    public open fun setBorderColor(color: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBorderColor:", color)
    }

    public open fun borderColorForEdge(edge: Int): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "borderColorForEdge:", edge) as NSColor

    public open fun rectForLayoutAtPoint_inRect_textContainer_characterRange(startingPoint: Any, rect: Any, textContainer: NSTextContainer, charRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rectForLayoutAtPoint:inRect:textContainer:characterRange:", startingPoint, rect, textContainer, charRange)

    public open fun boundsRectForContentRect_inRect_textContainer_characterRange(contentRect: Any, rect: Any, textContainer: NSTextContainer, charRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "boundsRectForContentRect:inRect:textContainer:characterRange:", contentRect, rect, textContainer, charRange)

    public open fun drawBackgroundWithFrame_inView_characterRange_layoutManager(frameRect: Any, controlView: NSView, charRange: Any, layoutManager: NSLayoutManager): Unit {
        Native.objc_msgSend("void", this, "drawBackgroundWithFrame:inView:characterRange:layoutManager:", frameRect, controlView, charRange, layoutManager)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSCopying.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextBlock")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSTextTableBlock(pointer: Long) : NSTextBlock(pointer) {
    public open fun initWithTable_startingRow_rowSpan_startingColumn_columnSpan(table: NSTextTable, row: Int, rowSpan: Int, col: Int, colSpan: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTable:startingRow:rowSpan:startingColumn:columnSpan:", table, row, rowSpan, col, colSpan) as ObjCObject

    public open fun table(): NSTextTable =
        Native.objc_msgSend("class objc.NSTextTable", this, "table") as NSTextTable

    public open fun startingRow(): Int =
        Native.objc_msgSend("int", this, "startingRow") as Int

    public open fun rowSpan(): Int =
        Native.objc_msgSend("int", this, "rowSpan") as Int

    public open fun startingColumn(): Int =
        Native.objc_msgSend("int", this, "startingColumn") as Int

    public open fun columnSpan(): Int =
        Native.objc_msgSend("int", this, "columnSpan") as Int

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSTextBlock.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextTableBlock")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSTextTable(pointer: Long) : NSTextBlock(pointer) {
    public open fun numberOfColumns(): Int =
        Native.objc_msgSend("int", this, "numberOfColumns") as Int

    public open fun setNumberOfColumns(numberOfColumns: Int): Unit {
        Native.objc_msgSend("void", this, "setNumberOfColumns:", numberOfColumns)
    }

    public open fun layoutAlgorithm(): Any =
        Native.objc_msgSend("class objc.Any", this, "layoutAlgorithm")

    public open fun setLayoutAlgorithm(layoutAlgorithm: Any): Unit {
        Native.objc_msgSend("void", this, "setLayoutAlgorithm:", layoutAlgorithm)
    }

    public open fun collapsesBorders(): Boolean =
        Native.objc_msgSend("boolean", this, "collapsesBorders") as Boolean

    public open fun setCollapsesBorders(collapsesBorders: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCollapsesBorders:", collapsesBorders)
    }

    public open fun hidesEmptyCells(): Boolean =
        Native.objc_msgSend("boolean", this, "hidesEmptyCells") as Boolean

    public open fun setHidesEmptyCells(hidesEmptyCells: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHidesEmptyCells:", hidesEmptyCells)
    }

    public open fun rectForBlock_layoutAtPoint_inRect_textContainer_characterRange(block: NSTextTableBlock, startingPoint: Any, rect: Any, textContainer: NSTextContainer, charRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rectForBlock:layoutAtPoint:inRect:textContainer:characterRange:", block, startingPoint, rect, textContainer, charRange)

    public open fun boundsRectForBlock_contentRect_inRect_textContainer_characterRange(block: NSTextTableBlock, contentRect: Any, rect: Any, textContainer: NSTextContainer, charRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "boundsRectForBlock:contentRect:inRect:textContainer:characterRange:", block, contentRect, rect, textContainer, charRange)

    public open fun drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager(block: NSTextTableBlock, frameRect: Any, controlView: NSView, charRange: Any, layoutManager: NSLayoutManager): Unit {
        Native.objc_msgSend("void", this, "drawBackgroundForBlock:withFrame:inView:characterRange:layoutManager:", block, frameRect, controlView, charRange, layoutManager)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSTextBlock.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextTable")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
