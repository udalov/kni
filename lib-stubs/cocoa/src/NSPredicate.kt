// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSPredicate.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPredicate(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying {
    public open fun predicateFormat(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "predicateFormat") as NSString

    public open fun predicateWithSubstitutionVariables(variables: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "predicateWithSubstitutionVariables:", variables) as ObjCObject

    public open fun evaluateWithObject(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "evaluateWithObject:", `object`) as Boolean

    public open fun evaluateWithObject_substitutionVariables(`object`: ObjCObject, bindings: NSDictionary): Boolean =
        Native.objc_msgSend("boolean", this, "evaluateWithObject:substitutionVariables:", `object`, bindings) as Boolean

    public open fun allowEvaluation(): Unit {
        Native.objc_msgSend("void", this, "allowEvaluation")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass {
        public open fun predicateWithFormat_argumentArray(predicateFormat: NSString, arguments: NSArray): NSPredicate =
            Native.objc_msgSend("class objc.NSPredicate", this, "predicateWithFormat:argumentArray:", predicateFormat, arguments) as NSPredicate

        public open fun predicateWithFormat(predicateFormat: NSString): NSPredicate =
            Native.objc_msgSend("class objc.NSPredicate", this, "predicateWithFormat:", predicateFormat) as NSPredicate

        public open fun predicateWithFormat_arguments(predicateFormat: NSString, argList: Any): NSPredicate =
            Native.objc_msgSend("class objc.NSPredicate", this, "predicateWithFormat:arguments:", predicateFormat, argList) as NSPredicate

        public open fun predicateFromMetadataQueryString(queryString: NSString): NSPredicate =
            Native.objc_msgSend("class objc.NSPredicate", this, "predicateFromMetadataQueryString:", queryString) as NSPredicate

        public open fun predicateWithValue(value: Boolean): NSPredicate =
            Native.objc_msgSend("class objc.NSPredicate", this, "predicateWithValue:", value) as NSPredicate

        public open fun predicateWithBlock(block: Any): NSPredicate =
            Native.objc_msgSend("class objc.NSPredicate", this, "predicateWithBlock:", block) as NSPredicate

    }

    companion object : NSObject(Native.objc_getClass("NSPredicate")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSArray_NSPredicateSupport : IObjCObject {
    public open fun filteredArrayUsingPredicate(predicate: NSPredicate): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "filteredArrayUsingPredicate:", predicate) as NSArray

    trait metaclass : IObjCObject
}

trait NSMutableArray_NSPredicateSupport : IObjCObject {
    public open fun filterUsingPredicate(predicate: NSPredicate): Unit {
        Native.objc_msgSend("void", this, "filterUsingPredicate:", predicate)
    }

    trait metaclass : IObjCObject
}

trait NSSet_NSPredicateSupport : IObjCObject {
    public open fun filteredSetUsingPredicate(predicate: NSPredicate): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "filteredSetUsingPredicate:", predicate) as NSSet

    trait metaclass : IObjCObject
}

trait NSMutableSet_NSPredicateSupport : IObjCObject {
    public open fun filterUsingPredicate(predicate: NSPredicate): Unit {
        Native.objc_msgSend("void", this, "filterUsingPredicate:", predicate)
    }

    trait metaclass : IObjCObject
}

trait NSOrderedSet_NSPredicateSupport : IObjCObject {
    public open fun filteredOrderedSetUsingPredicate(p: NSPredicate): NSOrderedSet =
        Native.objc_msgSend("class objc.NSOrderedSet", this, "filteredOrderedSetUsingPredicate:", p) as NSOrderedSet

    trait metaclass : IObjCObject
}

trait NSMutableOrderedSet_NSPredicateSupport : IObjCObject {
    public open fun filterUsingPredicate(p: NSPredicate): Unit {
        Native.objc_msgSend("void", this, "filterUsingPredicate:", p)
    }

    trait metaclass : IObjCObject
}
