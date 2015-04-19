// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSPointerArray.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPointerArray(pointer: Long) : NSObject(pointer), NSFastEnumeration, NSCopying, NSCoding, NSPointerArray_NSPointerArrayConveniences {
    public open fun initWithOptions(options: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithOptions:", options) as ObjCObject

    public open fun initWithPointerFunctions(functions: NSPointerFunctions): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPointerFunctions:", functions) as ObjCObject

    public open fun pointerFunctions(): NSPointerFunctions =
        Native.objc_msgSend("class objc.NSPointerFunctions", this, "pointerFunctions") as NSPointerFunctions

    public open fun pointerAtIndex(index: Int): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "pointerAtIndex:", index) as Pointer<*>

    public open fun addPointer(pointer: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addPointer:", pointer)
    }

    public open fun removePointerAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removePointerAtIndex:", index)
    }

    public open fun insertPointer_atIndex(item: Pointer<*>, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertPointer:atIndex:", item, index)
    }

    public open fun replacePointerAtIndex_withPointer(index: Int, item: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "replacePointerAtIndex:withPointer:", index, item)
    }

    public open fun compact(): Unit {
        Native.objc_msgSend("void", this, "compact")
    }

    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    public open fun setCount(count: Int): Unit {
        Native.objc_msgSend("void", this, "setCount:", count)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSFastEnumeration.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSPointerArray_NSPointerArrayConveniences.metaclass {
        public open fun pointerArrayWithOptions(options: Int): NSPointerArray =
            Native.objc_msgSend("class objc.NSPointerArray", this, "pointerArrayWithOptions:", options) as NSPointerArray

        public open fun pointerArrayWithPointerFunctions(functions: NSPointerFunctions): NSPointerArray =
            Native.objc_msgSend("class objc.NSPointerArray", this, "pointerArrayWithPointerFunctions:", functions) as NSPointerArray

    }

    companion object : NSObject(Native.objc_getClass("NSPointerArray")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSPointerArray_NSPointerArrayConveniences : IObjCObject {
    public open fun allObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allObjects") as NSArray

    trait metaclass : IObjCObject {
        public open fun pointerArrayWithStrongObjects(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "pointerArrayWithStrongObjects") as ObjCObject

        public open fun pointerArrayWithWeakObjects(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "pointerArrayWithWeakObjects") as ObjCObject

        public open fun strongObjectsPointerArray(): NSPointerArray =
            Native.objc_msgSend("class objc.NSPointerArray", this, "strongObjectsPointerArray") as NSPointerArray

        public open fun weakObjectsPointerArray(): NSPointerArray =
            Native.objc_msgSend("class objc.NSPointerArray", this, "weakObjectsPointerArray") as NSPointerArray
    }
}
