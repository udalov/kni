// generated from "/System/Library/Frameworks/CoreData.framework/Headers/NSPropertyDescription.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPropertyDescription(pointer: Long) : NSObject(pointer), NSCoding, NSCopying {
    public open fun entity(): NSEntityDescription =
        Native.objc_msgSend("class objc.NSEntityDescription", this, "entity") as NSEntityDescription

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    public open fun isOptional(): Boolean =
        Native.objc_msgSend("boolean", this, "isOptional") as Boolean

    public open fun setOptional(optional: Boolean): Unit {
        Native.objc_msgSend("void", this, "setOptional:", optional)
    }

    public open fun isTransient(): Boolean =
        Native.objc_msgSend("boolean", this, "isTransient") as Boolean

    public open fun setTransient(transient: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTransient:", transient)
    }

    public open fun validationPredicates(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "validationPredicates") as NSArray

    public open fun validationWarnings(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "validationWarnings") as NSArray

    public open fun setValidationPredicates_withValidationWarnings(validationPredicates: NSArray, validationWarnings: NSArray): Unit {
        Native.objc_msgSend("void", this, "setValidationPredicates:withValidationWarnings:", validationPredicates, validationWarnings)
    }

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    public open fun setUserInfo(userInfo: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setUserInfo:", userInfo)
    }

    public open fun isIndexed(): Boolean =
        Native.objc_msgSend("boolean", this, "isIndexed") as Boolean

    public open fun setIndexed(indexed: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIndexed:", indexed)
    }

    public open fun versionHash(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "versionHash") as NSData

    public open fun versionHashModifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "versionHashModifier") as NSString

    public open fun setVersionHashModifier(versionHashModifier: NSString): Unit {
        Native.objc_msgSend("void", this, "setVersionHashModifier:", versionHashModifier)
    }

    public open fun isIndexedBySpotlight(): Boolean =
        Native.objc_msgSend("boolean", this, "isIndexedBySpotlight") as Boolean

    public open fun setIndexedBySpotlight(indexedBySpotlight: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIndexedBySpotlight:", indexedBySpotlight)
    }

    public open fun isStoredInExternalRecord(): Boolean =
        Native.objc_msgSend("boolean", this, "isStoredInExternalRecord") as Boolean

    public open fun setStoredInExternalRecord(storedInExternalRecord: Boolean): Unit {
        Native.objc_msgSend("void", this, "setStoredInExternalRecord:", storedInExternalRecord)
    }

    public open fun renamingIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "renamingIdentifier") as NSString

    public open fun setRenamingIdentifier(renamingIdentifier: NSString): Unit {
        Native.objc_msgSend("void", this, "setRenamingIdentifier:", renamingIdentifier)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSCopying.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPropertyDescription")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
