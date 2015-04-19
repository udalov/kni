// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTreeController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTreeController(pointer: Long) : NSObjectController(pointer) {
    public open fun rearrangeObjects(): Unit {
        Native.objc_msgSend("void", this, "rearrangeObjects")
    }

    public open fun arrangedObjects(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "arrangedObjects") as ObjCObject

    public open fun childrenKeyPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "childrenKeyPath") as NSString

    public open fun setChildrenKeyPath(childrenKeyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setChildrenKeyPath:", childrenKeyPath)
    }

    public open fun countKeyPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "countKeyPath") as NSString

    public open fun setCountKeyPath(countKeyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setCountKeyPath:", countKeyPath)
    }

    public open fun leafKeyPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "leafKeyPath") as NSString

    public open fun setLeafKeyPath(leafKeyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setLeafKeyPath:", leafKeyPath)
    }

    public open fun sortDescriptors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortDescriptors") as NSArray

    public open fun setSortDescriptors(sortDescriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSortDescriptors:", sortDescriptors)
    }

    override fun content(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "content") as ObjCObject

    override fun setContent(content: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setContent:", content)
    }

    override fun add(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "add:", sender)
    }

    override fun remove(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "remove:", sender)
    }

    public open fun addChild(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addChild:", sender)
    }

    public open fun insert(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insert:", sender)
    }

    public open fun insertChild(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertChild:", sender)
    }

    public open fun canInsert(): Boolean =
        Native.objc_msgSend("boolean", this, "canInsert") as Boolean

    public open fun canInsertChild(): Boolean =
        Native.objc_msgSend("boolean", this, "canInsertChild") as Boolean

    public open fun canAddChild(): Boolean =
        Native.objc_msgSend("boolean", this, "canAddChild") as Boolean

    public open fun insertObject_atArrangedObjectIndexPath(`object`: ObjCObject, indexPath: NSIndexPath): Unit {
        Native.objc_msgSend("void", this, "insertObject:atArrangedObjectIndexPath:", `object`, indexPath)
    }

    public open fun insertObjects_atArrangedObjectIndexPaths(objects: NSArray, indexPaths: NSArray): Unit {
        Native.objc_msgSend("void", this, "insertObjects:atArrangedObjectIndexPaths:", objects, indexPaths)
    }

    public open fun removeObjectAtArrangedObjectIndexPath(indexPath: NSIndexPath): Unit {
        Native.objc_msgSend("void", this, "removeObjectAtArrangedObjectIndexPath:", indexPath)
    }

    public open fun removeObjectsAtArrangedObjectIndexPaths(indexPaths: NSArray): Unit {
        Native.objc_msgSend("void", this, "removeObjectsAtArrangedObjectIndexPaths:", indexPaths)
    }

    public open fun avoidsEmptySelection(): Boolean =
        Native.objc_msgSend("boolean", this, "avoidsEmptySelection") as Boolean

    public open fun setAvoidsEmptySelection(avoidsEmptySelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAvoidsEmptySelection:", avoidsEmptySelection)
    }

    public open fun preservesSelection(): Boolean =
        Native.objc_msgSend("boolean", this, "preservesSelection") as Boolean

    public open fun setPreservesSelection(preservesSelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPreservesSelection:", preservesSelection)
    }

    public open fun selectsInsertedObjects(): Boolean =
        Native.objc_msgSend("boolean", this, "selectsInsertedObjects") as Boolean

    public open fun setSelectsInsertedObjects(selectsInsertedObjects: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectsInsertedObjects:", selectsInsertedObjects)
    }

    public open fun alwaysUsesMultipleValuesMarker(): Boolean =
        Native.objc_msgSend("boolean", this, "alwaysUsesMultipleValuesMarker") as Boolean

    public open fun setAlwaysUsesMultipleValuesMarker(alwaysUsesMultipleValuesMarker: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAlwaysUsesMultipleValuesMarker:", alwaysUsesMultipleValuesMarker)
    }

    override fun selectedObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectedObjects") as NSArray

    public open fun setSelectionIndexPaths(indexPaths: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "setSelectionIndexPaths:", indexPaths) as Boolean

    public open fun selectionIndexPaths(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectionIndexPaths") as NSArray

    public open fun setSelectionIndexPath(indexPath: NSIndexPath): Boolean =
        Native.objc_msgSend("boolean", this, "setSelectionIndexPath:", indexPath) as Boolean

    public open fun selectionIndexPath(): NSIndexPath =
        Native.objc_msgSend("class objc.NSIndexPath", this, "selectionIndexPath") as NSIndexPath

    public open fun addSelectionIndexPaths(indexPaths: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "addSelectionIndexPaths:", indexPaths) as Boolean

    public open fun removeSelectionIndexPaths(indexPaths: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "removeSelectionIndexPaths:", indexPaths) as Boolean

    public open fun selectedNodes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectedNodes") as NSArray

    public open fun moveNode_toIndexPath(node: NSTreeNode, indexPath: NSIndexPath): Unit {
        Native.objc_msgSend("void", this, "moveNode:toIndexPath:", node, indexPath)
    }

    public open fun moveNodes_toIndexPath(nodes: NSArray, startingIndexPath: NSIndexPath): Unit {
        Native.objc_msgSend("void", this, "moveNodes:toIndexPath:", nodes, startingIndexPath)
    }

    public open fun childrenKeyPathForNode(node: NSTreeNode): NSString =
        Native.objc_msgSend("class objc.NSString", this, "childrenKeyPathForNode:", node) as NSString

    public open fun countKeyPathForNode(node: NSTreeNode): NSString =
        Native.objc_msgSend("class objc.NSString", this, "countKeyPathForNode:", node) as NSString

    public open fun leafKeyPathForNode(node: NSTreeNode): NSString =
        Native.objc_msgSend("class objc.NSString", this, "leafKeyPathForNode:", node) as NSString

    override fun commitEditing(): Boolean =
        Native.objc_msgSend("boolean", this, "commitEditing") as Boolean

    override fun commitEditingWithDelegate_didCommitSelector_contextInfo(delegate: ObjCObject, didCommitSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "commitEditingWithDelegate:didCommitSelector:contextInfo:", delegate, didCommitSelector, contextInfo)
    }

    override fun discardEditing(): Unit {
        Native.objc_msgSend("void", this, "discardEditing")
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun objectDidBeginEditing(editor: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "objectDidBeginEditing:", editor)
    }

    override fun objectDidEndEditing(editor: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "objectDidEndEditing:", editor)
    }

    trait metaclass : NSObjectController.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTreeController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
