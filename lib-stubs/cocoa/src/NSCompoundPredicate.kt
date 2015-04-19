// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSCompoundPredicate.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCompoundPredicate(pointer: Long) : NSPredicate(pointer) {
    public open fun initWithType_subpredicates(type: Any, subpredicates: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithType:subpredicates:", type, subpredicates) as ObjCObject

    public open fun compoundPredicateType(): Any =
        Native.objc_msgSend("class objc.Any", this, "compoundPredicateType")

    public open fun subpredicates(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "subpredicates") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSPredicate.metaclass {
        public open fun andPredicateWithSubpredicates(subpredicates: NSArray): NSCompoundPredicate =
            Native.objc_msgSend("class objc.NSCompoundPredicate", this, "andPredicateWithSubpredicates:", subpredicates) as NSCompoundPredicate

        public open fun orPredicateWithSubpredicates(subpredicates: NSArray): NSCompoundPredicate =
            Native.objc_msgSend("class objc.NSCompoundPredicate", this, "orPredicateWithSubpredicates:", subpredicates) as NSCompoundPredicate

        public open fun notPredicateWithSubpredicate(predicate: NSPredicate): NSCompoundPredicate =
            Native.objc_msgSend("class objc.NSCompoundPredicate", this, "notPredicateWithSubpredicate:", predicate) as NSCompoundPredicate

    }

    companion object : NSObject(Native.objc_getClass("NSCompoundPredicate")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
