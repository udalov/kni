// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSPointerFunctions.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPointerFunctions(pointer: Long) : NSObject(pointer), NSCopying {
    public open fun initWithOptions(options: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithOptions:", options) as ObjCObject

    public open fun hashFunction(): (Pointer<Unit>, (Pointer<Unit>) -> Int) -> Int =
        Native.objc_msgSend("class kotlin.Function2", this, "hashFunction") as (Pointer<Unit>, (Pointer<Unit>) -> Int) -> Int

    public open fun setHashFunction(hashFunction: (Pointer<Unit>, (Pointer<Unit>) -> Int) -> Int): Unit {
        Native.objc_msgSend("void", this, "setHashFunction:", hashFunction)
    }

    public open fun isEqualFunction(): (Pointer<Unit>, Pointer<Unit>, (Pointer<Unit>) -> Int) -> Boolean =
        Native.objc_msgSend("class kotlin.Function3", this, "isEqualFunction") as (Pointer<Unit>, Pointer<Unit>, (Pointer<Unit>) -> Int) -> Boolean

    public open fun setIsEqualFunction(isEqualFunction: (Pointer<Unit>, Pointer<Unit>, (Pointer<Unit>) -> Int) -> Boolean): Unit {
        Native.objc_msgSend("void", this, "setIsEqualFunction:", isEqualFunction)
    }

    public open fun sizeFunction(): (Pointer<Unit>) -> Int =
        Native.objc_msgSend("class kotlin.Function1", this, "sizeFunction") as (Pointer<Unit>) -> Int

    public open fun setSizeFunction(sizeFunction: (Pointer<Unit>) -> Int): Unit {
        Native.objc_msgSend("void", this, "setSizeFunction:", sizeFunction)
    }

    public open fun descriptionFunction(): (Pointer<Unit>) -> NSString =
        Native.objc_msgSend("class kotlin.Function1", this, "descriptionFunction") as (Pointer<Unit>) -> NSString

    public open fun setDescriptionFunction(descriptionFunction: (Pointer<Unit>) -> NSString): Unit {
        Native.objc_msgSend("void", this, "setDescriptionFunction:", descriptionFunction)
    }

    public open fun relinquishFunction(): (Pointer<Unit>, (Pointer<Unit>) -> Int) -> Unit =
        Native.objc_msgSend("class kotlin.Function2", this, "relinquishFunction") as (Pointer<Unit>, (Pointer<Unit>) -> Int) -> Unit

    public open fun setRelinquishFunction(relinquishFunction: (Pointer<Unit>, (Pointer<Unit>) -> Int) -> Unit): Unit {
        Native.objc_msgSend("void", this, "setRelinquishFunction:", relinquishFunction)
    }

    public open fun acquireFunction(): (Pointer<Unit>, (Pointer<Unit>) -> Int, Boolean) -> Pointer<*> =
        Native.objc_msgSend("class kotlin.Function3", this, "acquireFunction") as (Pointer<Unit>, (Pointer<Unit>) -> Int, Boolean) -> Pointer<*>

    public open fun setAcquireFunction(acquireFunction: (Pointer<Unit>, (Pointer<Unit>) -> Int, Boolean) -> Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "setAcquireFunction:", acquireFunction)
    }

    public open fun usesStrongWriteBarrier(): Boolean =
        Native.objc_msgSend("boolean", this, "usesStrongWriteBarrier") as Boolean

    public open fun setUsesStrongWriteBarrier(usesStrongWriteBarrier: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesStrongWriteBarrier:", usesStrongWriteBarrier)
    }

    public open fun usesWeakReadAndWriteBarriers(): Boolean =
        Native.objc_msgSend("boolean", this, "usesWeakReadAndWriteBarriers") as Boolean

    public open fun setUsesWeakReadAndWriteBarriers(usesWeakReadAndWriteBarriers: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesWeakReadAndWriteBarriers:", usesWeakReadAndWriteBarriers)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass {
        public open fun pointerFunctionsWithOptions(options: Int): NSPointerFunctions =
            Native.objc_msgSend("class objc.NSPointerFunctions", this, "pointerFunctionsWithOptions:", options) as NSPointerFunctions

    }

    companion object : NSObject(Native.objc_getClass("NSPointerFunctions")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
