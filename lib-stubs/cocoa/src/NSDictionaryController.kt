// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDictionaryController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDictionaryController(pointer: Long) : NSArrayController(pointer) {
    override fun newObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "newObject") as ObjCObject

    public open fun initialKey(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "initialKey") as NSString

    public open fun setInitialKey(initialKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setInitialKey:", initialKey)
    }

    public open fun initialValue(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initialValue") as ObjCObject

    public open fun setInitialValue(initialValue: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setInitialValue:", initialValue)
    }

    public open fun includedKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "includedKeys") as NSArray

    public open fun setIncludedKeys(includedKeys: NSArray): Unit {
        Native.objc_msgSend("void", this, "setIncludedKeys:", includedKeys)
    }

    public open fun excludedKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "excludedKeys") as NSArray

    public open fun setExcludedKeys(excludedKeys: NSArray): Unit {
        Native.objc_msgSend("void", this, "setExcludedKeys:", excludedKeys)
    }

    public open fun localizedKeyDictionary(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "localizedKeyDictionary") as NSDictionary

    public open fun setLocalizedKeyDictionary(localizedKeyDictionary: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setLocalizedKeyDictionary:", localizedKeyDictionary)
    }

    public open fun localizedKeyTable(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedKeyTable") as NSString

    public open fun setLocalizedKeyTable(localizedKeyTable: NSString): Unit {
        Native.objc_msgSend("void", this, "setLocalizedKeyTable:", localizedKeyTable)
    }

    override fun add(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "add:", sender)
    }

    override fun addObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addObject:", `object`)
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

    override fun remove(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "remove:", sender)
    }

    override fun removeObject(`object`: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeObject:", `object`)
    }

    override fun selectedObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectedObjects") as NSArray

    trait metaclass : NSArrayController.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDictionaryController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSDictionaryControllerKeyValuePair : IObjCObject {
    public open fun setLocalizedKey(localizedKey: NSString): Unit {
        Native.objc_msgSend("void", this, "setLocalizedKey:", localizedKey)
    }

    public open fun localizedKey(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedKey") as NSString

    public open fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    public open fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    public open fun setValue(value: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setValue:", value)
    }

    public open fun value(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "value") as ObjCObject

    public open fun isExplicitlyIncluded(): Boolean =
        Native.objc_msgSend("boolean", this, "isExplicitlyIncluded") as Boolean

    trait metaclass : IObjCObject
}
