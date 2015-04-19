// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSInvocation.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSInvocation(pointer: Long) : NSObject(pointer) {
    public open fun methodSignature(): NSMethodSignature =
        Native.objc_msgSend("class objc.NSMethodSignature", this, "methodSignature") as NSMethodSignature

    public open fun retainArguments(): Unit {
        Native.objc_msgSend("void", this, "retainArguments")
    }

    public open fun argumentsRetained(): Boolean =
        Native.objc_msgSend("boolean", this, "argumentsRetained") as Boolean

    public open fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    public open fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    public open fun selector(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "selector") as ObjCSelector

    public open fun setSelector(selector: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setSelector:", selector)
    }

    public open fun getReturnValue(retLoc: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "getReturnValue:", retLoc)
    }

    public open fun setReturnValue(retLoc: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "setReturnValue:", retLoc)
    }

    public open fun getArgument_atIndex(argumentLocation: Pointer<*>, idx: Int): Unit {
        Native.objc_msgSend("void", this, "getArgument:atIndex:", argumentLocation, idx)
    }

    public open fun setArgument_atIndex(argumentLocation: Pointer<*>, idx: Int): Unit {
        Native.objc_msgSend("void", this, "setArgument:atIndex:", argumentLocation, idx)
    }

    public open fun invoke(): Unit {
        Native.objc_msgSend("void", this, "invoke")
    }

    public open fun invokeWithTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "invokeWithTarget:", target)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun invocationWithMethodSignature(sig: NSMethodSignature): NSInvocation =
            Native.objc_msgSend("class objc.NSInvocation", this, "invocationWithMethodSignature:", sig) as NSInvocation

    }

    companion object : NSObject(Native.objc_getClass("NSInvocation")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
