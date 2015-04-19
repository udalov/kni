// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSFormatter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFormatter(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun stringForObjectValue(obj: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringForObjectValue:", obj) as NSString

    public open fun attributedStringForObjectValue_withDefaultAttributes(obj: ObjCObject, attrs: NSDictionary): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedStringForObjectValue:withDefaultAttributes:", obj, attrs) as NSAttributedString

    public open fun editingStringForObjectValue(obj: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "editingStringForObjectValue:", obj) as NSString

    public open fun getObjectValue_forString_errorDescription(obj: Pointer<ObjCObject>, string: NSString, error: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "getObjectValue:forString:errorDescription:", obj, string, error) as Boolean

    public open fun isPartialStringValid_newEditingString_errorDescription(partialString: NSString, newString: Pointer<NSString>, error: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "isPartialStringValid:newEditingString:errorDescription:", partialString, newString, error) as Boolean

    public open fun isPartialStringValid_proposedSelectedRange_originalString_originalSelectedRange_errorDescription(partialStringPtr: Pointer<NSString>, proposedSelRangePtr: Pointer<Any>, origString: NSString, origSelRange: Any, error: Pointer<NSString>): Boolean =
        Native.objc_msgSend("boolean", this, "isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:", partialStringPtr, proposedSelRangePtr, origString, origSelRange, error) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSFormatter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
