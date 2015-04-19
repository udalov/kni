// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSMethodSignature.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSMethodSignature(pointer: Long) : NSObject(pointer) {
    public open fun numberOfArguments(): Int =
        Native.objc_msgSend("int", this, "numberOfArguments") as Int

    public open fun getArgumentTypeAtIndex(idx: Int): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "getArgumentTypeAtIndex:", idx) as Pointer<Char>

    public open fun frameLength(): Int =
        Native.objc_msgSend("int", this, "frameLength") as Int

    public open fun isOneway(): Boolean =
        Native.objc_msgSend("boolean", this, "isOneway") as Boolean

    public open fun methodReturnType(): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "methodReturnType") as Pointer<Char>

    public open fun methodReturnLength(): Int =
        Native.objc_msgSend("int", this, "methodReturnLength") as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun signatureWithObjCTypes(types: Pointer<Char>): NSMethodSignature =
            Native.objc_msgSend("class objc.NSMethodSignature", this, "signatureWithObjCTypes:", types) as NSMethodSignature

    }

    companion object : NSObject(Native.objc_getClass("NSMethodSignature")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
