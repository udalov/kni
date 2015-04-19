// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSValueTransformer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSValueTransformer(pointer: Long) : NSObject(pointer) {
    public open fun transformedValue(value: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "transformedValue:", value) as ObjCObject

    public open fun reverseTransformedValue(value: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "reverseTransformedValue:", value) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun setValueTransformer_forName(transformer: NSValueTransformer, name: NSString): Unit {
            Native.objc_msgSend("void", this, "setValueTransformer:forName:", transformer, name)
        }

        public open fun valueTransformerForName(name: NSString): NSValueTransformer =
            Native.objc_msgSend("class objc.NSValueTransformer", this, "valueTransformerForName:", name) as NSValueTransformer

        public open fun valueTransformerNames(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "valueTransformerNames") as NSArray

        public open fun transformedValueClass(): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "transformedValueClass") as ObjCClass

        public open fun allowsReverseTransformation(): Boolean =
            Native.objc_msgSend("boolean", this, "allowsReverseTransformation") as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSValueTransformer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
