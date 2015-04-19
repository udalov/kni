// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPasteboardItem.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSPasteboardItemDataProvider {
    trait metaclass
}

public open class NSPasteboardItem(pointer: Long) : NSObject(pointer), NSPasteboardWriting, NSPasteboardReading {
    public open fun types(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "types") as NSArray

    public open fun availableTypeFromArray(types: NSArray): NSString =
        Native.objc_msgSend("class objc.NSString", this, "availableTypeFromArray:", types) as NSString

    public open fun setDataProvider_forTypes(dataProvider: Any, types: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "setDataProvider:forTypes:", dataProvider, types) as Boolean

    public open fun setData_forType(data: NSData, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setData:forType:", data, type) as Boolean

    public open fun setString_forType(string: NSString, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setString:forType:", string, type) as Boolean

    public open fun setPropertyList_forType(propertyList: ObjCObject, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setPropertyList:forType:", propertyList, type) as Boolean

    public open fun dataForType(type: NSString): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataForType:", type) as NSData

    public open fun stringForType(type: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringForType:", type) as NSString

    public open fun propertyListForType(type: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyListForType:", type) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSPasteboardWriting.metaclass, NSPasteboardReading.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPasteboardItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
