// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSIndexPath.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSIndexPath(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    public open fun initWithIndexes_length(indexes: Any, length: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIndexes:length:", indexes, length) as ObjCObject

    public open fun initWithIndex(index: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIndex:", index) as ObjCObject

    public open fun indexPathByAddingIndex(index: Int): NSIndexPath =
        Native.objc_msgSend("class objc.NSIndexPath", this, "indexPathByAddingIndex:", index) as NSIndexPath

    public open fun indexPathByRemovingLastIndex(): NSIndexPath =
        Native.objc_msgSend("class objc.NSIndexPath", this, "indexPathByRemovingLastIndex") as NSIndexPath

    public open fun indexAtPosition(position: Int): Int =
        Native.objc_msgSend("int", this, "indexAtPosition:", position) as Int

    public open fun length(): Int =
        Native.objc_msgSend("int", this, "length") as Int

    public open fun getIndexes(indexes: Pointer<Int>): Unit {
        Native.objc_msgSend("void", this, "getIndexes:", indexes)
    }

    public open fun compare(otherObject: NSIndexPath): Any =
        Native.objc_msgSend("class objc.Any", this, "compare:", otherObject)

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
        public open fun indexPathWithIndex(index: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "indexPathWithIndex:", index) as ObjCObject

        public open fun indexPathWithIndexes_length(indexes: Any, length: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "indexPathWithIndexes:length:", indexes, length) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSIndexPath")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
