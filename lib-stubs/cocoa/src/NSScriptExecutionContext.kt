// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptExecutionContext.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScriptExecutionContext(pointer: Long) : NSObject(pointer) {
    public open fun topLevelObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "topLevelObject") as ObjCObject

    public open fun setTopLevelObject(topLevelObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTopLevelObject:", topLevelObject)
    }

    public open fun objectBeingTested(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectBeingTested") as ObjCObject

    public open fun setObjectBeingTested(objectBeingTested: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setObjectBeingTested:", objectBeingTested)
    }

    public open fun rangeContainerObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "rangeContainerObject") as ObjCObject

    public open fun setRangeContainerObject(rangeContainerObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setRangeContainerObject:", rangeContainerObject)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun sharedScriptExecutionContext(): NSScriptExecutionContext =
            Native.objc_msgSend("class objc.NSScriptExecutionContext", this, "sharedScriptExecutionContext") as NSScriptExecutionContext

    }

    companion object : NSObject(Native.objc_getClass("NSScriptExecutionContext")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
