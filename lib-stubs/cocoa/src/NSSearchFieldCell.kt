// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSearchFieldCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSSearchFieldCell(pointer: Long) : NSTextFieldCell(pointer) {
    public open fun searchButtonCell(): NSButtonCell =
        Native.objc_msgSend("class objc.NSButtonCell", this, "searchButtonCell") as NSButtonCell

    public open fun setSearchButtonCell(searchButtonCell: NSButtonCell): Unit {
        Native.objc_msgSend("void", this, "setSearchButtonCell:", searchButtonCell)
    }

    public open fun cancelButtonCell(): NSButtonCell =
        Native.objc_msgSend("class objc.NSButtonCell", this, "cancelButtonCell") as NSButtonCell

    public open fun setCancelButtonCell(cancelButtonCell: NSButtonCell): Unit {
        Native.objc_msgSend("void", this, "setCancelButtonCell:", cancelButtonCell)
    }

    public open fun resetSearchButtonCell(): Unit {
        Native.objc_msgSend("void", this, "resetSearchButtonCell")
    }

    public open fun resetCancelButtonCell(): Unit {
        Native.objc_msgSend("void", this, "resetCancelButtonCell")
    }

    public open fun searchTextRectForBounds(rect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "searchTextRectForBounds:", rect)

    public open fun searchButtonRectForBounds(rect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "searchButtonRectForBounds:", rect)

    public open fun cancelButtonRectForBounds(rect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "cancelButtonRectForBounds:", rect)

    public open fun searchMenuTemplate(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "searchMenuTemplate") as NSMenu

    public open fun setSearchMenuTemplate(searchMenuTemplate: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setSearchMenuTemplate:", searchMenuTemplate)
    }

    public open fun sendsWholeSearchString(): Boolean =
        Native.objc_msgSend("boolean", this, "sendsWholeSearchString") as Boolean

    public open fun setSendsWholeSearchString(sendsWholeSearchString: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSendsWholeSearchString:", sendsWholeSearchString)
    }

    public open fun maximumRecents(): Int =
        Native.objc_msgSend("int", this, "maximumRecents") as Int

    public open fun setMaximumRecents(maximumRecents: Int): Unit {
        Native.objc_msgSend("void", this, "setMaximumRecents:", maximumRecents)
    }

    public open fun recentSearches(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "recentSearches") as NSArray

    public open fun setRecentSearches(recentSearches: NSArray): Unit {
        Native.objc_msgSend("void", this, "setRecentSearches:", recentSearches)
    }

    public open fun recentsAutosaveName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "recentsAutosaveName") as NSString

    public open fun setRecentsAutosaveName(recentsAutosaveName: NSString): Unit {
        Native.objc_msgSend("void", this, "setRecentsAutosaveName:", recentsAutosaveName)
    }

    public open fun sendsSearchStringImmediately(): Boolean =
        Native.objc_msgSend("boolean", this, "sendsSearchStringImmediately") as Boolean

    public open fun setSendsSearchStringImmediately(sendsSearchStringImmediately: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSendsSearchStringImmediately:", sendsSearchStringImmediately)
    }

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

    companion object : NSObject(Native.objc_getClass("NSSearchFieldCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
