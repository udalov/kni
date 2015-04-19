// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTableColumn.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTableColumn(pointer: Long) : NSObject(pointer), NSCoding, NSUserInterfaceItemIdentification, NSTableColumn_NSDeprecated {
    public open fun initWithIdentifier(identifier: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIdentifier:", identifier) as ObjCObject

    public open fun identifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "identifier") as NSString

    public open fun setIdentifier(identifier: NSString): Unit {
        Native.objc_msgSend("void", this, "setIdentifier:", identifier)
    }

    public open fun tableView(): NSTableView =
        Native.objc_msgSend("class objc.NSTableView", this, "tableView") as NSTableView

    public open fun setTableView(tableView: NSTableView): Unit {
        Native.objc_msgSend("void", this, "setTableView:", tableView)
    }

    public open fun width(): Double =
        Native.objc_msgSend("double", this, "width") as Double

    public open fun setWidth(width: Double): Unit {
        Native.objc_msgSend("void", this, "setWidth:", width)
    }

    public open fun minWidth(): Double =
        Native.objc_msgSend("double", this, "minWidth") as Double

    public open fun setMinWidth(minWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setMinWidth:", minWidth)
    }

    public open fun maxWidth(): Double =
        Native.objc_msgSend("double", this, "maxWidth") as Double

    public open fun setMaxWidth(maxWidth: Double): Unit {
        Native.objc_msgSend("void", this, "setMaxWidth:", maxWidth)
    }

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun headerCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "headerCell") as ObjCObject

    public open fun setHeaderCell(headerCell: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setHeaderCell:", headerCell)
    }

    public open fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    public open fun setEditable(editable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEditable:", editable)
    }

    public open fun sizeToFit(): Unit {
        Native.objc_msgSend("void", this, "sizeToFit")
    }

    public open fun sortDescriptorPrototype(): NSSortDescriptor =
        Native.objc_msgSend("class objc.NSSortDescriptor", this, "sortDescriptorPrototype") as NSSortDescriptor

    public open fun setSortDescriptorPrototype(sortDescriptorPrototype: NSSortDescriptor): Unit {
        Native.objc_msgSend("void", this, "setSortDescriptorPrototype:", sortDescriptorPrototype)
    }

    public open fun resizingMask(): Any =
        Native.objc_msgSend("class objc.Any", this, "resizingMask")

    public open fun setResizingMask(resizingMask: Any): Unit {
        Native.objc_msgSend("void", this, "setResizingMask:", resizingMask)
    }

    public open fun headerToolTip(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "headerToolTip") as NSString

    public open fun setHeaderToolTip(headerToolTip: NSString): Unit {
        Native.objc_msgSend("void", this, "setHeaderToolTip:", headerToolTip)
    }

    public open fun isHidden(): Boolean =
        Native.objc_msgSend("boolean", this, "isHidden") as Boolean

    public open fun setHidden(hidden: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHidden:", hidden)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSUserInterfaceItemIdentification.metaclass, NSTableColumn_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTableColumn")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSTableColumn_NSDeprecated : IObjCObject {
    public open fun setResizable(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setResizable:", flag)
    }

    public open fun isResizable(): Boolean =
        Native.objc_msgSend("boolean", this, "isResizable") as Boolean

    public open fun dataCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataCell") as ObjCObject

    public open fun setDataCell(dataCell: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setDataCell:", dataCell)
    }

    public open fun dataCellForRow(row: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "dataCellForRow:", row) as ObjCObject

    trait metaclass : IObjCObject
}
