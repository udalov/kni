// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptCoercionHandler.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScriptCoercionHandler(pointer: Long) : NSObject(pointer) {
    public open fun coerceValue_toClass(value: ObjCObject, toClass: ObjCClass): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "coerceValue:toClass:", value, toClass) as ObjCObject

    public open fun registerCoercer_selector_toConvertFromClass_toClass(coercer: ObjCObject, selector: ObjCSelector, fromClass: ObjCClass, toClass: ObjCClass): Unit {
        Native.objc_msgSend("void", this, "registerCoercer:selector:toConvertFromClass:toClass:", coercer, selector, fromClass, toClass)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun sharedCoercionHandler(): NSScriptCoercionHandler =
            Native.objc_msgSend("class objc.NSScriptCoercionHandler", this, "sharedCoercionHandler") as NSScriptCoercionHandler

    }

    companion object : NSObject(Native.objc_getClass("NSScriptCoercionHandler")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
