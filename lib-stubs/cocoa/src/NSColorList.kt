// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSColorList.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSColorList(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun initWithName(name: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:", name) as ObjCObject

    public open fun initWithName_fromFile(name: NSString, path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:fromFile:", name, path) as ObjCObject

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setColor_forKey(color: NSColor, key: NSString): Unit {
        Native.objc_msgSend("void", this, "setColor:forKey:", color, key)
    }

    public open fun insertColor_key_atIndex(color: NSColor, key: NSString, loc: Int): Unit {
        Native.objc_msgSend("void", this, "insertColor:key:atIndex:", color, key, loc)
    }

    public open fun removeColorWithKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "removeColorWithKey:", key)
    }

    public open fun colorWithKey(key: NSString): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "colorWithKey:", key) as NSColor

    public open fun allKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allKeys") as NSArray

    public open fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    public open fun writeToFile(path: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "writeToFile:", path) as Boolean

    public open fun removeFile(): Unit {
        Native.objc_msgSend("void", this, "removeFile")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
        public open fun availableColorLists(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "availableColorLists") as NSArray

        public open fun colorListNamed(name: NSString): NSColorList =
            Native.objc_msgSend("class objc.NSColorList", this, "colorListNamed:", name) as NSColorList

    }

    companion object : NSObject(Native.objc_getClass("NSColorList")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
