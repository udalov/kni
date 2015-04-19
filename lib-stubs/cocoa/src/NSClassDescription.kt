// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSClassDescription.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSClassDescription(pointer: Long) : NSObject(pointer) {
    override fun attributeKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "attributeKeys") as NSArray

    override fun toOneRelationshipKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "toOneRelationshipKeys") as NSArray

    override fun toManyRelationshipKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "toManyRelationshipKeys") as NSArray

    override fun inverseForRelationshipKey(relationshipKey: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "inverseForRelationshipKey:", relationshipKey) as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun registerClassDescription_forClass(description: NSClassDescription, aClass: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "registerClassDescription:forClass:", description, aClass)
        }

        public open fun invalidateClassDescriptionCache(): Unit {
            Native.objc_msgSend("void", this, "invalidateClassDescriptionCache")
        }

        public open fun classDescriptionForClass(aClass: ObjCClass): NSClassDescription =
            Native.objc_msgSend("class objc.NSClassDescription", this, "classDescriptionForClass:", aClass) as NSClassDescription

    }

    companion object : NSObject(Native.objc_getClass("NSClassDescription")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSClassDescriptionPrimitives : IObjCObject {
    public open fun classDescription(): NSClassDescription =
        Native.objc_msgSend("class objc.NSClassDescription", this, "classDescription") as NSClassDescription

    public open fun attributeKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "attributeKeys") as NSArray

    public open fun toOneRelationshipKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "toOneRelationshipKeys") as NSArray

    public open fun toManyRelationshipKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "toManyRelationshipKeys") as NSArray

    public open fun inverseForRelationshipKey(relationshipKey: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "inverseForRelationshipKey:", relationshipKey) as NSString

    trait metaclass : IObjCObject
}
