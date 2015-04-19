// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSPasteboard.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSPasteboardWriting {
    trait metaclass
}

trait NSPasteboardReading {
    trait metaclass
}

public open class NSPasteboard(pointer: Long) : NSObject(pointer), NSPasteboard_FilterServices, NSPasteboard_NSFileContents {
    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun changeCount(): Int =
        Native.objc_msgSend("int", this, "changeCount") as Int

    public open fun releaseGlobally(): Unit {
        Native.objc_msgSend("void", this, "releaseGlobally")
    }

    public open fun clearContents(): Int =
        Native.objc_msgSend("int", this, "clearContents") as Int

    public open fun writeObjects(objects: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "writeObjects:", objects) as Boolean

    public open fun readObjectsForClasses_options(classArray: NSArray, options: NSDictionary): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "readObjectsForClasses:options:", classArray, options) as NSArray

    public open fun pasteboardItems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "pasteboardItems") as NSArray

    public open fun indexOfPasteboardItem(pasteboardItem: NSPasteboardItem): Int =
        Native.objc_msgSend("int", this, "indexOfPasteboardItem:", pasteboardItem) as Int

    public open fun canReadItemWithDataConformingToTypes(types: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "canReadItemWithDataConformingToTypes:", types) as Boolean

    public open fun canReadObjectForClasses_options(classArray: NSArray, options: NSDictionary): Boolean =
        Native.objc_msgSend("boolean", this, "canReadObjectForClasses:options:", classArray, options) as Boolean

    public open fun declareTypes_owner(newTypes: NSArray, newOwner: ObjCObject): Int =
        Native.objc_msgSend("int", this, "declareTypes:owner:", newTypes, newOwner) as Int

    public open fun addTypes_owner(newTypes: NSArray, newOwner: ObjCObject): Int =
        Native.objc_msgSend("int", this, "addTypes:owner:", newTypes, newOwner) as Int

    public open fun types(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "types") as NSArray

    public open fun availableTypeFromArray(types: NSArray): NSString =
        Native.objc_msgSend("class objc.NSString", this, "availableTypeFromArray:", types) as NSString

    public open fun setData_forType(data: NSData, dataType: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setData:forType:", data, dataType) as Boolean

    public open fun setPropertyList_forType(plist: ObjCObject, dataType: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setPropertyList:forType:", plist, dataType) as Boolean

    public open fun setString_forType(string: NSString, dataType: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setString:forType:", string, dataType) as Boolean

    public open fun dataForType(dataType: NSString): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataForType:", dataType) as NSData

    public open fun propertyListForType(dataType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyListForType:", dataType) as ObjCObject

    public open fun stringForType(dataType: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringForType:", dataType) as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSPasteboard_FilterServices.metaclass, NSPasteboard_NSFileContents.metaclass {
        public open fun generalPasteboard(): NSPasteboard =
            Native.objc_msgSend("class objc.NSPasteboard", this, "generalPasteboard") as NSPasteboard

        public open fun pasteboardWithName(name: NSString): NSPasteboard =
            Native.objc_msgSend("class objc.NSPasteboard", this, "pasteboardWithName:", name) as NSPasteboard

        public open fun pasteboardWithUniqueName(): NSPasteboard =
            Native.objc_msgSend("class objc.NSPasteboard", this, "pasteboardWithUniqueName") as NSPasteboard

    }

    companion object : NSObject(Native.objc_getClass("NSPasteboard")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSPasteboard_FilterServices : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun typesFilterableTo(type: NSString): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "typesFilterableTo:", type) as NSArray

        public open fun pasteboardByFilteringFile(filename: NSString): NSPasteboard =
            Native.objc_msgSend("class objc.NSPasteboard", this, "pasteboardByFilteringFile:", filename) as NSPasteboard

        public open fun pasteboardByFilteringData_ofType(data: NSData, type: NSString): NSPasteboard =
            Native.objc_msgSend("class objc.NSPasteboard", this, "pasteboardByFilteringData:ofType:", data, type) as NSPasteboard

        public open fun pasteboardByFilteringTypesInPasteboard(pboard: NSPasteboard): NSPasteboard =
            Native.objc_msgSend("class objc.NSPasteboard", this, "pasteboardByFilteringTypesInPasteboard:", pboard) as NSPasteboard
    }
}

trait NSObject_NSPasteboardOwner : IObjCObject {
    public open fun pasteboard_provideDataForType(sender: NSPasteboard, type: NSString): Unit {
        Native.objc_msgSend("void", this, "pasteboard:provideDataForType:", sender, type)
    }

    public open fun pasteboardChangedOwner(sender: NSPasteboard): Unit {
        Native.objc_msgSend("void", this, "pasteboardChangedOwner:", sender)
    }

    trait metaclass : IObjCObject
}

trait NSURL_NSPasteboardSupport : IObjCObject {
    public open fun writeToPasteboard(pasteBoard: NSPasteboard): Unit {
        Native.objc_msgSend("void", this, "writeToPasteboard:", pasteBoard)
    }

    trait metaclass : IObjCObject {
        public open fun URLFromPasteboard(pasteBoard: NSPasteboard): NSURL =
            Native.objc_msgSend("class objc.NSURL", this, "URLFromPasteboard:", pasteBoard) as NSURL
    }
}

trait NSString_NSPasteboardSupport : IObjCObject {
    trait metaclass : IObjCObject
}

trait NSPasteboard_NSFileContents : IObjCObject {
    public open fun writeFileContents(filename: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "writeFileContents:", filename) as Boolean

    public open fun readFileContentsType_toFile(type: NSString, filename: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "readFileContentsType:toFile:", type, filename) as NSString

    public open fun writeFileWrapper(wrapper: NSFileWrapper): Boolean =
        Native.objc_msgSend("boolean", this, "writeFileWrapper:", wrapper) as Boolean

    public open fun readFileWrapper(): NSFileWrapper =
        Native.objc_msgSend("class objc.NSFileWrapper", this, "readFileWrapper") as NSFileWrapper

    trait metaclass : IObjCObject
}
