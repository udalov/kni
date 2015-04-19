// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTableHeaderView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTableHeaderView(pointer: Long) : NSView(pointer) {
    public open fun tableView(): NSTableView =
        Native.objc_msgSend("class objc.NSTableView", this, "tableView") as NSTableView

    public open fun setTableView(tableView: NSTableView): Unit {
        Native.objc_msgSend("void", this, "setTableView:", tableView)
    }

    public open fun draggedColumn(): Int =
        Native.objc_msgSend("int", this, "draggedColumn") as Int

    public open fun draggedDistance(): Double =
        Native.objc_msgSend("double", this, "draggedDistance") as Double

    public open fun resizedColumn(): Int =
        Native.objc_msgSend("int", this, "resizedColumn") as Int

    public open fun headerRectOfColumn(column: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "headerRectOfColumn:", column)

    public open fun columnAtPoint(point: Any): Int =
        Native.objc_msgSend("int", this, "columnAtPoint:", point) as Int

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTableHeaderView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
