// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSFontCollection.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFontCollection(pointer: Long) : NSObject(pointer), NSCopying, NSMutableCopying, NSCoding {
    public open fun queryDescriptors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "queryDescriptors") as NSArray

    public open fun exclusionDescriptors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "exclusionDescriptors") as NSArray

    public open fun matchingDescriptors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "matchingDescriptors") as NSArray

    public open fun matchingDescriptorsWithOptions(options: NSDictionary): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "matchingDescriptorsWithOptions:", options) as NSArray

    public open fun matchingDescriptorsForFamily(family: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "matchingDescriptorsForFamily:", family) as NSArray

    public open fun matchingDescriptorsForFamily_options(family: NSString, options: NSDictionary): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "matchingDescriptorsForFamily:options:", family, options) as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSMutableCopying.metaclass, NSCoding.metaclass {
        public open fun fontCollectionWithDescriptors(queryDescriptors: NSArray): NSFontCollection =
            Native.objc_msgSend("class objc.NSFontCollection", this, "fontCollectionWithDescriptors:", queryDescriptors) as NSFontCollection

        public open fun fontCollectionWithAllAvailableDescriptors(): NSFontCollection =
            Native.objc_msgSend("class objc.NSFontCollection", this, "fontCollectionWithAllAvailableDescriptors") as NSFontCollection

        public open fun fontCollectionWithLocale(locale: NSLocale): NSFontCollection =
            Native.objc_msgSend("class objc.NSFontCollection", this, "fontCollectionWithLocale:", locale) as NSFontCollection

        public open fun showFontCollection_withName_visibility_error(collection: NSFontCollection, name: NSString, visibility: Any, error: Pointer<NSError>): Boolean =
            Native.objc_msgSend("boolean", this, "showFontCollection:withName:visibility:error:", collection, name, visibility, error) as Boolean

        public open fun hideFontCollectionWithName_visibility_error(name: NSString, visibility: Any, error: Pointer<NSError>): Boolean =
            Native.objc_msgSend("boolean", this, "hideFontCollectionWithName:visibility:error:", name, visibility, error) as Boolean

        public open fun renameFontCollectionWithName_visibility_toName_error(name: NSString, visibility: Any, name_2: NSString, error: Pointer<NSError>): Boolean =
            Native.objc_msgSend("boolean", this, "renameFontCollectionWithName:visibility:toName:error:", name, visibility, name, error) as Boolean

        public open fun allFontCollectionNames(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "allFontCollectionNames") as NSArray

        public open fun fontCollectionWithName(name: NSString): NSFontCollection =
            Native.objc_msgSend("class objc.NSFontCollection", this, "fontCollectionWithName:", name) as NSFontCollection

        public open fun fontCollectionWithName_visibility(name: NSString, visibility: Any): NSFontCollection =
            Native.objc_msgSend("class objc.NSFontCollection", this, "fontCollectionWithName:visibility:", name, visibility) as NSFontCollection

    }

    companion object : NSObject(Native.objc_getClass("NSFontCollection")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMutableFontCollection(pointer: Long) : NSFontCollection(pointer) {
    override fun queryDescriptors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "queryDescriptors") as NSArray

    public open fun setQueryDescriptors(queryDescriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "setQueryDescriptors:", queryDescriptors)
    }

    override fun exclusionDescriptors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "exclusionDescriptors") as NSArray

    public open fun setExclusionDescriptors(exclusionDescriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "setExclusionDescriptors:", exclusionDescriptors)
    }

    public open fun addQueryForDescriptors(descriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "addQueryForDescriptors:", descriptors)
    }

    public open fun removeQueryForDescriptors(descriptors: NSArray): Unit {
        Native.objc_msgSend("void", this, "removeQueryForDescriptors:", descriptors)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSFontCollection.metaclass {
        override fun fontCollectionWithDescriptors(queryDescriptors: NSArray): NSMutableFontCollection =
            Native.objc_msgSend("class objc.NSMutableFontCollection", this, "fontCollectionWithDescriptors:", queryDescriptors) as NSMutableFontCollection

        override fun fontCollectionWithAllAvailableDescriptors(): NSMutableFontCollection =
            Native.objc_msgSend("class objc.NSMutableFontCollection", this, "fontCollectionWithAllAvailableDescriptors") as NSMutableFontCollection

        override fun fontCollectionWithLocale(locale: NSLocale): NSMutableFontCollection =
            Native.objc_msgSend("class objc.NSMutableFontCollection", this, "fontCollectionWithLocale:", locale) as NSMutableFontCollection

        override fun fontCollectionWithName(name: NSString): NSMutableFontCollection =
            Native.objc_msgSend("class objc.NSMutableFontCollection", this, "fontCollectionWithName:", name) as NSMutableFontCollection

        override fun fontCollectionWithName_visibility(name: NSString, visibility: Any): NSMutableFontCollection =
            Native.objc_msgSend("class objc.NSMutableFontCollection", this, "fontCollectionWithName:visibility:", name, visibility) as NSMutableFontCollection

    }

    companion object : NSObject(Native.objc_getClass("NSMutableFontCollection")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
