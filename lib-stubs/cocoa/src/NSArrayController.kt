// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSArrayController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSArrayController(pointer: Long) : NSObjectController(pointer) {
    public open fun rearrangeObjects(): Unit {
        Native.objc_msgSend("void", this, "rearrangeObjects")
    }

    public open fun automaticallyRearrangesObjects(): Boolean =
        Native.objc_msgSend("boolean", this, "automaticallyRearrangesObjects") as Boolean

    public open fun setAutomaticallyRearrangesObjects(automaticallyRearrangesObjects: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticallyRearrangesObjects:", automaticallyRearrangesObjects)
    }

    public open fun automaticRearrangementKeyPaths(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "automaticRearrangementKeyPaths") as NSArray

    public open fun didChangeArrangementCriteria(): Unit {
        Native.objc_msgSend("void", this, "didChangeArrangementCriteria")
    }

    public open fun sortDescriptors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortDescriptors") as NSArray

    public open fun setSortDescriptors(sortDescriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSortDescriptors:", sortDescriptors)
    }

    public open fun filterPredicate(): NSPredicate =
        Native.objc_msgSend("class objc.NSPredicate", this, "filterPredicate") as NSPredicate

    public open fun setFilterPredicate(filterPredicate: NSPredicate): Unit {
        Native.objc_msgSend("void", this, "setFilterPredicate:", filterPredicate)
    }

    public open fun clearsFilterPredicateOnInsertion(): Boolean =
        Native.objc_msgSend("boolean", this, "clearsFilterPredicateOnInsertion") as Boolean

    public open fun setClearsFilterPredicateOnInsertion(clearsFilterPredicateOnInsertion: Boolean): Unit {
        Native.objc_msgSend("void", this, "setClearsFilterPredicateOnInsertion:", clearsFilterPredicateOnInsertion)
    }

    public open fun arrangeObjects(objects: NSArray): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "arrangeObjects:", objects) as NSArray

    public open fun arrangedObjects(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "arrangedObjects") as ObjCObject

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

    public open fun setSelectionIndexes(indexes: NSIndexSet): Boolean =
        Native.objc_msgSend("boolean", this, "setSelectionIndexes:", indexes) as Boolean

    public open fun selectionIndexes(): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "selectionIndexes") as NSIndexSet

    public open fun setSelectionIndex(index: Int): Boolean =
        Native.objc_msgSend("boolean", this, "setSelectionIndex:", index) as Boolean

    public open fun selectionIndex(): Int =
        Native.objc_msgSend("int", this, "selectionIndex") as Int

    public open fun addSelectionIndexes(indexes: NSIndexSet): Boolean =
        Native.objc_msgSend("boolean", this, "addSelectionIndexes:", indexes) as Boolean

    public open fun removeSelectionIndexes(indexes: NSIndexSet): Boolean =
        Native.objc_msgSend("boolean", this, "removeSelectionIndexes:", indexes) as Boolean

    public open fun setSelectedObjects(objects: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "setSelectedObjects:", objects) as Boolean

    override fun selectedObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectedObjects") as NSArray

    public open fun addSelectedObjects(objects: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "addSelectedObjects:", objects) as Boolean

    public open fun removeSelectedObjects(objects: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "removeSelectedObjects:", objects) as Boolean

    override fun add(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "add:", sender)
    }

    override fun remove(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "remove:", sender)
    }

    public open fun insert(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insert:", sender)
    }

    public open fun canInsert(): Boolean =
        Native.objc_msgSend("boolean", this, "canInsert") as Boolean

    public open fun selectNext(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectNext:", sender)
    }

    public open fun selectPrevious(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectPrevious:", sender)
    }

    public open fun canSelectNext(): Boolean =
        Native.objc_msgSend("boolean", this, "canSelectNext") as Boolean

    public open fun canSelectPrevious(): Boolean =
        Native.objc_msgSend("boolean", this, "canSelectPrevious") as Boolean

    override fun addObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObject:", `object`)
    }

    public open fun addObjects(objects: NSArray): Unit {
        Native.objc_msgSend("void", this, "addObjects:", objects)
    }

    public open fun insertObject_atArrangedObjectIndex(`object`: ObjCObject, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertObject:atArrangedObjectIndex:", `object`, index)
    }

    public open fun insertObjects_atArrangedObjectIndexes(objects: NSArray, indexes: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "insertObjects:atArrangedObjectIndexes:", objects, indexes)
    }

    public open fun removeObjectAtArrangedObjectIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeObjectAtArrangedObjectIndex:", index)
    }

    public open fun removeObjectsAtArrangedObjectIndexes(indexes: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "removeObjectsAtArrangedObjectIndexes:", indexes)
    }

    override fun removeObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObject:", `object`)
    }

    public open fun removeObjects(objects: NSArray): Unit {
        Native.objc_msgSend("void", this, "removeObjects:", objects)
    }

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

    companion object : NSObject(Native.objc_getClass("NSArrayController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
