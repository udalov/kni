// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSObjectController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSObjectController(pointer: Long) : NSController(pointer), NSObjectController_NSManagedController {
    public open fun initWithContent(content: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContent:", content) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun content(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "content") as ObjCObject

    public open fun setContent(content: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setContent:", content)
    }

    public open fun selection(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "selection") as ObjCObject

    public open fun selectedObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectedObjects") as NSArray

    public open fun automaticallyPreparesContent(): Boolean =
        Native.objc_msgSend("boolean", this, "automaticallyPreparesContent") as Boolean

    public open fun setAutomaticallyPreparesContent(automaticallyPreparesContent: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticallyPreparesContent:", automaticallyPreparesContent)
    }

    public open fun prepareContent(): Unit {
        Native.objc_msgSend("void", this, "prepareContent")
    }

    public open fun objectClass(): ObjCClass =
        Native.objc_msgSend("interface kni.objc.ObjCClass", this, "objectClass") as ObjCClass

    public open fun setObjectClass(objectClass: ObjCClass): Unit {
        Native.objc_msgSend("void", this, "setObjectClass:", objectClass)
    }

    public open fun newObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "newObject") as ObjCObject

    public open fun addObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObject:", `object`)
    }

    public open fun removeObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObject:", `object`)
    }

    public open fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    public open fun setEditable(editable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEditable:", editable)
    }

    public open fun add(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "add:", sender)
    }

    public open fun canAdd(): Boolean =
        Native.objc_msgSend("boolean", this, "canAdd") as Boolean

    public open fun remove(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "remove:", sender)
    }

    public open fun canRemove(): Boolean =
        Native.objc_msgSend("boolean", this, "canRemove") as Boolean

    public open fun validateUserInterfaceItem(item: Any): Boolean =
        Native.objc_msgSend("boolean", this, "validateUserInterfaceItem:", item) as Boolean

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

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun objectDidBeginEditing(editor: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "objectDidBeginEditing:", editor)
    }

    override fun objectDidEndEditing(editor: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "objectDidEndEditing:", editor)
    }

    trait metaclass : NSController.metaclass, NSObjectController_NSManagedController.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSObjectController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObjectController_NSManagedController : IObjCObject {
    public open fun managedObjectContext(): NSManagedObjectContext =
        Native.objc_msgSend("class objc.NSManagedObjectContext", this, "managedObjectContext") as NSManagedObjectContext

    public open fun setManagedObjectContext(managedObjectContext: NSManagedObjectContext): Unit {
        Native.objc_msgSend("void", this, "setManagedObjectContext:", managedObjectContext)
    }

    public open fun entityName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "entityName") as NSString

    public open fun setEntityName(entityName: NSString): Unit {
        Native.objc_msgSend("void", this, "setEntityName:", entityName)
    }

    public open fun fetchPredicate(): NSPredicate =
        Native.objc_msgSend("class objc.NSPredicate", this, "fetchPredicate") as NSPredicate

    public open fun setFetchPredicate(fetchPredicate: NSPredicate): Unit {
        Native.objc_msgSend("void", this, "setFetchPredicate:", fetchPredicate)
    }

    public open fun fetchWithRequest_merge_error(fetchRequest: NSFetchRequest, merge: Boolean, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "fetchWithRequest:merge:error:", fetchRequest, merge, error) as Boolean

    public open fun fetch(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "fetch:", sender)
    }

    public open fun usesLazyFetching(): Boolean =
        Native.objc_msgSend("boolean", this, "usesLazyFetching") as Boolean

    public open fun setUsesLazyFetching(usesLazyFetching: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesLazyFetching:", usesLazyFetching)
    }

    public open fun defaultFetchRequest(): NSFetchRequest =
        Native.objc_msgSend("class objc.NSFetchRequest", this, "defaultFetchRequest") as NSFetchRequest

    trait metaclass : IObjCObject
}
