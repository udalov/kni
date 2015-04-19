// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSUserDefaultsController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSUserDefaultsController(pointer: Long) : NSController(pointer) {
    public open fun initWithDefaults_initialValues(defaults: NSUserDefaults, initialValues: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDefaults:initialValues:", defaults, initialValues) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun defaults(): NSUserDefaults =
        Native.objc_msgSend("class objc.NSUserDefaults", this, "defaults") as NSUserDefaults

    public open fun initialValues(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "initialValues") as NSDictionary

    public open fun setInitialValues(initialValues: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setInitialValues:", initialValues)
    }

    public open fun appliesImmediately(): Boolean =
        Native.objc_msgSend("boolean", this, "appliesImmediately") as Boolean

    public open fun setAppliesImmediately(appliesImmediately: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAppliesImmediately:", appliesImmediately)
    }

    public open fun hasUnappliedChanges(): Boolean =
        Native.objc_msgSend("boolean", this, "hasUnappliedChanges") as Boolean

    public open fun values(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "values") as ObjCObject

    public open fun revert(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "revert:", sender)
    }

    public open fun save(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "save:", sender)
    }

    public open fun revertToInitialValues(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "revertToInitialValues:", sender)
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

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun objectDidBeginEditing(editor: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "objectDidBeginEditing:", editor)
    }

    override fun objectDidEndEditing(editor: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "objectDidEndEditing:", editor)
    }

    trait metaclass : NSController.metaclass {
        public open fun sharedUserDefaultsController(): NSUserDefaultsController =
            Native.objc_msgSend("class objc.NSUserDefaultsController", this, "sharedUserDefaultsController") as NSUserDefaultsController

    }

    companion object : NSObject(Native.objc_getClass("NSUserDefaultsController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
