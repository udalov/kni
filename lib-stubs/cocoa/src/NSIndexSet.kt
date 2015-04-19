// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSIndexSet.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSIndexSet(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSSecureCoding {
    public open fun initWithIndexesInRange(range: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIndexesInRange:", range) as ObjCObject

    public open fun initWithIndexSet(indexSet: NSIndexSet): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIndexSet:", indexSet) as ObjCObject

    public open fun initWithIndex(value: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIndex:", value) as ObjCObject

    public open fun isEqualToIndexSet(indexSet: NSIndexSet): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualToIndexSet:", indexSet) as Boolean

    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    public open fun firstIndex(): Int =
        Native.objc_msgSend("int", this, "firstIndex") as Int

    public open fun lastIndex(): Int =
        Native.objc_msgSend("int", this, "lastIndex") as Int

    public open fun indexGreaterThanIndex(value: Int): Int =
        Native.objc_msgSend("int", this, "indexGreaterThanIndex:", value) as Int

    public open fun indexLessThanIndex(value: Int): Int =
        Native.objc_msgSend("int", this, "indexLessThanIndex:", value) as Int

    public open fun indexGreaterThanOrEqualToIndex(value: Int): Int =
        Native.objc_msgSend("int", this, "indexGreaterThanOrEqualToIndex:", value) as Int

    public open fun indexLessThanOrEqualToIndex(value: Int): Int =
        Native.objc_msgSend("int", this, "indexLessThanOrEqualToIndex:", value) as Int

    public open fun getIndexes_maxCount_inIndexRange(indexBuffer: Pointer<Int>, bufferSize: Int, range: Pointer<Any>): Int =
        Native.objc_msgSend("int", this, "getIndexes:maxCount:inIndexRange:", indexBuffer, bufferSize, range) as Int

    public open fun countOfIndexesInRange(range: Any): Int =
        Native.objc_msgSend("int", this, "countOfIndexesInRange:", range) as Int

    public open fun containsIndex(value: Int): Boolean =
        Native.objc_msgSend("boolean", this, "containsIndex:", value) as Boolean

    public open fun containsIndexesInRange(range: Any): Boolean =
        Native.objc_msgSend("boolean", this, "containsIndexesInRange:", range) as Boolean

    public open fun containsIndexes(indexSet: NSIndexSet): Boolean =
        Native.objc_msgSend("boolean", this, "containsIndexes:", indexSet) as Boolean

    public open fun intersectsIndexesInRange(range: Any): Boolean =
        Native.objc_msgSend("boolean", this, "intersectsIndexesInRange:", range) as Boolean

    public open fun enumerateIndexesUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateIndexesUsingBlock:", block)
    }

    public open fun enumerateIndexesWithOptions_usingBlock(opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateIndexesWithOptions:usingBlock:", opts, block)
    }

    public open fun enumerateIndexesInRange_options_usingBlock(range: Any, opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateIndexesInRange:options:usingBlock:", range, opts, block)
    }

    public open fun indexPassingTest(predicate: Any): Int =
        Native.objc_msgSend("int", this, "indexPassingTest:", predicate) as Int

    public open fun indexWithOptions_passingTest(opts: Any, predicate: Any): Int =
        Native.objc_msgSend("int", this, "indexWithOptions:passingTest:", opts, predicate) as Int

    public open fun indexInRange_options_passingTest(range: Any, opts: Any, predicate: Any): Int =
        Native.objc_msgSend("int", this, "indexInRange:options:passingTest:", range, opts, predicate) as Int

    public open fun indexesPassingTest(predicate: Any): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "indexesPassingTest:", predicate) as NSIndexSet

    public open fun indexesWithOptions_passingTest(opts: Any, predicate: Any): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "indexesWithOptions:passingTest:", opts, predicate) as NSIndexSet

    public open fun indexesInRange_options_passingTest(range: Any, opts: Any, predicate: Any): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "indexesInRange:options:passingTest:", range, opts, predicate) as NSIndexSet

    public open fun enumerateRangesUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateRangesUsingBlock:", block)
    }

    public open fun enumerateRangesWithOptions_usingBlock(opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateRangesWithOptions:usingBlock:", opts, block)
    }

    public open fun enumerateRangesInRange_options_usingBlock(range: Any, opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateRangesInRange:options:usingBlock:", range, opts, block)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSSecureCoding.metaclass {
        public open fun indexSet(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "indexSet") as ObjCObject

        public open fun indexSetWithIndex(value: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "indexSetWithIndex:", value) as ObjCObject

        public open fun indexSetWithIndexesInRange(range: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "indexSetWithIndexesInRange:", range) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSIndexSet")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableIndexSet(pointer: Long) : NSIndexSet(pointer) {
    public open fun addIndexes(indexSet: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "addIndexes:", indexSet)
    }

    public open fun removeIndexes(indexSet: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "removeIndexes:", indexSet)
    }

    public open fun removeAllIndexes(): Unit {
        Native.objc_msgSend("void", this, "removeAllIndexes")
    }

    public open fun addIndex(value: Int): Unit {
        Native.objc_msgSend("void", this, "addIndex:", value)
    }

    public open fun removeIndex(value: Int): Unit {
        Native.objc_msgSend("void", this, "removeIndex:", value)
    }

    public open fun addIndexesInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "addIndexesInRange:", range)
    }

    public open fun removeIndexesInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "removeIndexesInRange:", range)
    }

    public open fun shiftIndexesStartingAtIndex_by(index: Int, delta: Int): Unit {
        Native.objc_msgSend("void", this, "shiftIndexesStartingAtIndex:by:", index, delta)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSIndexSet.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMutableIndexSet")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
