// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSRuleEditor.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSRuleEditorDelegate {
    trait metaclass
}

public open class NSRuleEditor(pointer: Long) : NSControl(pointer) {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun formattingStringsFilename(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "formattingStringsFilename") as NSString

    public open fun setFormattingStringsFilename(formattingStringsFilename: NSString): Unit {
        Native.objc_msgSend("void", this, "setFormattingStringsFilename:", formattingStringsFilename)
    }

    public open fun formattingDictionary(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "formattingDictionary") as NSDictionary

    public open fun setFormattingDictionary(formattingDictionary: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setFormattingDictionary:", formattingDictionary)
    }

    public open fun reloadCriteria(): Unit {
        Native.objc_msgSend("void", this, "reloadCriteria")
    }

    public open fun nestingMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "nestingMode")

    public open fun setNestingMode(nestingMode: Any): Unit {
        Native.objc_msgSend("void", this, "setNestingMode:", nestingMode)
    }

    public open fun rowHeight(): Double =
        Native.objc_msgSend("double", this, "rowHeight") as Double

    public open fun setRowHeight(rowHeight: Double): Unit {
        Native.objc_msgSend("void", this, "setRowHeight:", rowHeight)
    }

    public open fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    public open fun setEditable(editable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEditable:", editable)
    }

    public open fun canRemoveAllRows(): Boolean =
        Native.objc_msgSend("boolean", this, "canRemoveAllRows") as Boolean

    public open fun setCanRemoveAllRows(canRemoveAllRows: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanRemoveAllRows:", canRemoveAllRows)
    }

    public open fun predicate(): NSPredicate =
        Native.objc_msgSend("class objc.NSPredicate", this, "predicate") as NSPredicate

    public open fun reloadPredicate(): Unit {
        Native.objc_msgSend("void", this, "reloadPredicate")
    }

    public open fun predicateForRow(row: Int): NSPredicate =
        Native.objc_msgSend("class objc.NSPredicate", this, "predicateForRow:", row) as NSPredicate

    public open fun numberOfRows(): Int =
        Native.objc_msgSend("int", this, "numberOfRows") as Int

    public open fun subrowIndexesForRow(rowIndex: Int): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "subrowIndexesForRow:", rowIndex) as NSIndexSet

    public open fun criteriaForRow(row: Int): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "criteriaForRow:", row) as NSArray

    public open fun displayValuesForRow(row: Int): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "displayValuesForRow:", row) as NSArray

    public open fun rowForDisplayValue(displayValue: ObjCObject): Int =
        Native.objc_msgSend("int", this, "rowForDisplayValue:", displayValue) as Int

    public open fun rowTypeForRow(rowIndex: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rowTypeForRow:", rowIndex)

    public open fun parentRowForRow(rowIndex: Int): Int =
        Native.objc_msgSend("int", this, "parentRowForRow:", rowIndex) as Int

    public open fun addRow(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addRow:", sender)
    }

    public open fun insertRowAtIndex_withType_asSubrowOfRow_animate(rowIndex: Int, rowType: Any, parentRow: Int, shouldAnimate: Boolean): Unit {
        Native.objc_msgSend("void", this, "insertRowAtIndex:withType:asSubrowOfRow:animate:", rowIndex, rowType, parentRow, shouldAnimate)
    }

    public open fun setCriteria_andDisplayValues_forRowAtIndex(criteria: NSArray, values: NSArray, rowIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setCriteria:andDisplayValues:forRowAtIndex:", criteria, values, rowIndex)
    }

    public open fun removeRowAtIndex(rowIndex: Int): Unit {
        Native.objc_msgSend("void", this, "removeRowAtIndex:", rowIndex)
    }

    public open fun removeRowsAtIndexes_includeSubrows(rowIndexes: NSIndexSet, includeSubrows: Boolean): Unit {
        Native.objc_msgSend("void", this, "removeRowsAtIndexes:includeSubrows:", rowIndexes, includeSubrows)
    }

    public open fun selectedRowIndexes(): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "selectedRowIndexes") as NSIndexSet

    public open fun selectRowIndexes_byExtendingSelection(indexes: NSIndexSet, extend: Boolean): Unit {
        Native.objc_msgSend("void", this, "selectRowIndexes:byExtendingSelection:", indexes, extend)
    }

    public open fun rowClass(): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "rowClass") as ObjCClass

    public open fun setRowClass(rowClass: ObjCClass): Unit {
        Native.objc_msgSend("void", this, "setRowClass:", rowClass)
    }

    public open fun rowTypeKeyPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "rowTypeKeyPath") as NSString

    public open fun setRowTypeKeyPath(rowTypeKeyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setRowTypeKeyPath:", rowTypeKeyPath)
    }

    public open fun subrowsKeyPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "subrowsKeyPath") as NSString

    public open fun setSubrowsKeyPath(subrowsKeyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setSubrowsKeyPath:", subrowsKeyPath)
    }

    public open fun criteriaKeyPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "criteriaKeyPath") as NSString

    public open fun setCriteriaKeyPath(criteriaKeyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setCriteriaKeyPath:", criteriaKeyPath)
    }

    public open fun displayValuesKeyPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "displayValuesKeyPath") as NSString

    public open fun setDisplayValuesKeyPath(displayValuesKeyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setDisplayValuesKeyPath:", displayValuesKeyPath)
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

    trait metaclass : NSControl.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSRuleEditor")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
