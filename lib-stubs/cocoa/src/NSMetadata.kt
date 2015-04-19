// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSMetadata.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSMetadataQueryDelegate {
    trait metaclass
}

public open class NSMetadataQuery(pointer: Long) : NSObject(pointer) {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun predicate(): NSPredicate =
        Native.objc_msgSend("class objc.NSPredicate", this, "predicate") as NSPredicate

    public open fun setPredicate(predicate: NSPredicate): Unit {
        Native.objc_msgSend("void", this, "setPredicate:", predicate)
    }

    public open fun sortDescriptors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sortDescriptors") as NSArray

    public open fun setSortDescriptors(sortDescriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSortDescriptors:", sortDescriptors)
    }

    public open fun valueListAttributes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "valueListAttributes") as NSArray

    public open fun setValueListAttributes(valueListAttributes: NSArray): Unit {
        Native.objc_msgSend("void", this, "setValueListAttributes:", valueListAttributes)
    }

    public open fun groupingAttributes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "groupingAttributes") as NSArray

    public open fun setGroupingAttributes(groupingAttributes: NSArray): Unit {
        Native.objc_msgSend("void", this, "setGroupingAttributes:", groupingAttributes)
    }

    public open fun notificationBatchingInterval(): Double =
        Native.objc_msgSend("double", this, "notificationBatchingInterval") as Double

    public open fun setNotificationBatchingInterval(notificationBatchingInterval: Double): Unit {
        Native.objc_msgSend("void", this, "setNotificationBatchingInterval:", notificationBatchingInterval)
    }

    public open fun searchScopes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "searchScopes") as NSArray

    public open fun setSearchScopes(searchScopes: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSearchScopes:", searchScopes)
    }

    public open fun searchItems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "searchItems") as NSArray

    public open fun setSearchItems(searchItems: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSearchItems:", searchItems)
    }

    public open fun operationQueue(): NSOperationQueue =
        Native.objc_msgSend("class objc.NSOperationQueue", this, "operationQueue") as NSOperationQueue

    public open fun setOperationQueue(operationQueue: NSOperationQueue): Unit {
        Native.objc_msgSend("void", this, "setOperationQueue:", operationQueue)
    }

    public open fun startQuery(): Boolean =
        Native.objc_msgSend("boolean", this, "startQuery") as Boolean

    public open fun stopQuery(): Unit {
        Native.objc_msgSend("void", this, "stopQuery")
    }

    public open fun isStarted(): Boolean =
        Native.objc_msgSend("boolean", this, "isStarted") as Boolean

    public open fun isGathering(): Boolean =
        Native.objc_msgSend("boolean", this, "isGathering") as Boolean

    public open fun isStopped(): Boolean =
        Native.objc_msgSend("boolean", this, "isStopped") as Boolean

    public open fun disableUpdates(): Unit {
        Native.objc_msgSend("void", this, "disableUpdates")
    }

    public open fun enableUpdates(): Unit {
        Native.objc_msgSend("void", this, "enableUpdates")
    }

    public open fun resultCount(): Int =
        Native.objc_msgSend("int", this, "resultCount") as Int

    public open fun resultAtIndex(idx: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "resultAtIndex:", idx) as ObjCObject

    public open fun enumerateResultsUsingBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateResultsUsingBlock:", block)
    }

    public open fun enumerateResultsWithOptions_usingBlock(opts: Any, block: Any): Unit {
        Native.objc_msgSend("void", this, "enumerateResultsWithOptions:usingBlock:", opts, block)
    }

    public open fun results(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "results") as NSArray

    public open fun indexOfResult(result: ObjCObject): Int =
        Native.objc_msgSend("int", this, "indexOfResult:", result) as Int

    public open fun valueLists(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "valueLists") as NSDictionary

    public open fun groupedResults(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "groupedResults") as NSArray

    public open fun valueOfAttribute_forResultAtIndex(attrName: NSString, idx: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueOfAttribute:forResultAtIndex:", attrName, idx) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMetadataQuery")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMetadataItem(pointer: Long) : NSObject(pointer) {
    public open fun initWithURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:", url) as ObjCObject

    public open fun valueForAttribute(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForAttribute:", key) as ObjCObject

    public open fun valuesForAttributes(keys: NSArray): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "valuesForAttributes:", keys) as NSDictionary

    public open fun attributes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "attributes") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMetadataItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMetadataQueryAttributeValueTuple(pointer: Long) : NSObject(pointer) {
    public open fun attribute(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "attribute") as NSString

    override fun value(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "value") as ObjCObject

    public open fun count(): Int =
        Native.objc_msgSend("int", this, "count") as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMetadataQueryAttributeValueTuple")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMetadataQueryResultGroup(pointer: Long) : NSObject(pointer) {
    public open fun attribute(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "attribute") as NSString

    override fun value(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "value") as ObjCObject

    public open fun subgroups(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "subgroups") as NSArray

    public open fun resultCount(): Int =
        Native.objc_msgSend("int", this, "resultCount") as Int

    public open fun resultAtIndex(idx: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "resultAtIndex:", idx) as ObjCObject

    public open fun results(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "results") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMetadataQueryResultGroup")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
