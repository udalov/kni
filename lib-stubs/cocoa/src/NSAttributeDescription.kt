// generated from "/System/Library/Frameworks/CoreData.framework/Headers/NSAttributeDescription.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSAttributeDescription(pointer: Long) : NSPropertyDescription(pointer) {
    public open fun attributeType(): Any =
        Native.objc_msgSend("class objc.Any", this, "attributeType")

    public open fun setAttributeType(attributeType: Any): Unit {
        Native.objc_msgSend("void", this, "setAttributeType:", attributeType)
    }

    public open fun attributeValueClassName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "attributeValueClassName") as NSString

    public open fun setAttributeValueClassName(attributeValueClassName: NSString): Unit {
        Native.objc_msgSend("void", this, "setAttributeValueClassName:", attributeValueClassName)
    }

    public open fun defaultValue(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "defaultValue") as ObjCObject

    public open fun setDefaultValue(defaultValue: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setDefaultValue:", defaultValue)
    }

    override fun versionHash(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "versionHash") as NSData

    public open fun valueTransformerName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "valueTransformerName") as NSString

    public open fun setValueTransformerName(valueTransformerName: NSString): Unit {
        Native.objc_msgSend("void", this, "setValueTransformerName:", valueTransformerName)
    }

    public open fun allowsExternalBinaryDataStorage(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsExternalBinaryDataStorage") as Boolean

    public open fun setAllowsExternalBinaryDataStorage(allowsExternalBinaryDataStorage: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsExternalBinaryDataStorage:", allowsExternalBinaryDataStorage)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSPropertyDescription.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSAttributeDescription")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
