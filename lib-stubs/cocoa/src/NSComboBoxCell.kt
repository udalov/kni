// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSComboBoxCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSComboBoxCellDataSource {
    trait metaclass
}

public open class NSComboBoxCell(pointer: Long) : NSTextFieldCell(pointer) {
    public open fun hasVerticalScroller(): Boolean =
        Native.objc_msgSend("boolean", this, "hasVerticalScroller") as Boolean

    public open fun setHasVerticalScroller(hasVerticalScroller: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasVerticalScroller:", hasVerticalScroller)
    }

    public open fun intercellSpacing(): Any =
        Native.objc_msgSend("class objc.Any", this, "intercellSpacing")

    public open fun setIntercellSpacing(intercellSpacing: Any): Unit {
        Native.objc_msgSend("void", this, "setIntercellSpacing:", intercellSpacing)
    }

    public open fun itemHeight(): Double =
        Native.objc_msgSend("double", this, "itemHeight") as Double

    public open fun setItemHeight(itemHeight: Double): Unit {
        Native.objc_msgSend("void", this, "setItemHeight:", itemHeight)
    }

    public open fun numberOfVisibleItems(): Int =
        Native.objc_msgSend("int", this, "numberOfVisibleItems") as Int

    public open fun setNumberOfVisibleItems(numberOfVisibleItems: Int): Unit {
        Native.objc_msgSend("void", this, "setNumberOfVisibleItems:", numberOfVisibleItems)
    }

    public open fun isButtonBordered(): Boolean =
        Native.objc_msgSend("boolean", this, "isButtonBordered") as Boolean

    public open fun setButtonBordered(buttonBordered: Boolean): Unit {
        Native.objc_msgSend("void", this, "setButtonBordered:", buttonBordered)
    }

    public open fun reloadData(): Unit {
        Native.objc_msgSend("void", this, "reloadData")
    }

    public open fun noteNumberOfItemsChanged(): Unit {
        Native.objc_msgSend("void", this, "noteNumberOfItemsChanged")
    }

    public open fun usesDataSource(): Boolean =
        Native.objc_msgSend("boolean", this, "usesDataSource") as Boolean

    public open fun setUsesDataSource(usesDataSource: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesDataSource:", usesDataSource)
    }

    public open fun scrollItemAtIndexToTop(index: Int): Unit {
        Native.objc_msgSend("void", this, "scrollItemAtIndexToTop:", index)
    }

    public open fun scrollItemAtIndexToVisible(index: Int): Unit {
        Native.objc_msgSend("void", this, "scrollItemAtIndexToVisible:", index)
    }

    public open fun selectItemAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "selectItemAtIndex:", index)
    }

    public open fun deselectItemAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "deselectItemAtIndex:", index)
    }

    public open fun indexOfSelectedItem(): Int =
        Native.objc_msgSend("int", this, "indexOfSelectedItem") as Int

    public open fun numberOfItems(): Int =
        Native.objc_msgSend("int", this, "numberOfItems") as Int

    public open fun completes(): Boolean =
        Native.objc_msgSend("boolean", this, "completes") as Boolean

    public open fun setCompletes(completes: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCompletes:", completes)
    }

    public open fun completedString(string: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "completedString:", string) as NSString

    public open fun dataSource(): Any =
        Native.objc_msgSend("class objc.Any", this, "dataSource")

    public open fun setDataSource(dataSource: Any): Unit {
        Native.objc_msgSend("void", this, "setDataSource:", dataSource)
    }

    public open fun addItemWithObjectValue(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addItemWithObjectValue:", `object`)
    }

    public open fun addItemsWithObjectValues(objects: NSArray): Unit {
        Native.objc_msgSend("void", this, "addItemsWithObjectValues:", objects)
    }

    public open fun insertItemWithObjectValue_atIndex(`object`: ObjCObject, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertItemWithObjectValue:atIndex:", `object`, index)
    }

    public open fun removeItemWithObjectValue(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeItemWithObjectValue:", `object`)
    }

    public open fun removeItemAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeItemAtIndex:", index)
    }

    public open fun removeAllItems(): Unit {
        Native.objc_msgSend("void", this, "removeAllItems")
    }

    public open fun selectItemWithObjectValue(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectItemWithObjectValue:", `object`)
    }

    public open fun itemObjectValueAtIndex(index: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "itemObjectValueAtIndex:", index) as ObjCObject

    public open fun objectValueOfSelectedItem(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectValueOfSelectedItem") as ObjCObject

    public open fun indexOfItemWithObjectValue(`object`: ObjCObject): Int =
        Native.objc_msgSend("int", this, "indexOfItemWithObjectValue:", `object`) as Int

    public open fun objectValues(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "objectValues") as NSArray

    override fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    override fun setTag(tag: Int): Unit {
        Native.objc_msgSend("void", this, "setTag:", tag)
    }

    override fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    override fun setUpFieldEditorAttributes(textObj: NSText): NSText =
        Native.objc_msgSend("class objc.NSText", this, "setUpFieldEditorAttributes:", textObj) as NSText

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    override fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    trait metaclass : NSTextFieldCell.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSComboBoxCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
