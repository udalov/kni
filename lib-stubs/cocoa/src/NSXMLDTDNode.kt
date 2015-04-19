// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSXMLDTDNode.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSXMLDTDNode(pointer: Long) : NSXMLNode(pointer) {
    public open fun initWithXMLString(string: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithXMLString:", string) as ObjCObject

    override fun initWithKind_options(kind: Any, options: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKind:options:", kind, options) as ObjCObject

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun DTDKind(): Any =
        Native.objc_msgSend("class objc.Any", this, "DTDKind")

    public open fun setDTDKind(DTDKind: Any): Unit {
        Native.objc_msgSend("void", this, "setDTDKind:", DTDKind)
    }

    public open fun isExternal(): Boolean =
        Native.objc_msgSend("boolean", this, "isExternal") as Boolean

    public open fun publicID(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "publicID") as NSString

    public open fun setPublicID(publicID: NSString): Unit {
        Native.objc_msgSend("void", this, "setPublicID:", publicID)
    }

    public open fun systemID(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "systemID") as NSString

    public open fun setSystemID(systemID: NSString): Unit {
        Native.objc_msgSend("void", this, "setSystemID:", systemID)
    }

    public open fun notationName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "notationName") as NSString

    public open fun setNotationName(notationName: NSString): Unit {
        Native.objc_msgSend("void", this, "setNotationName:", notationName)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSXMLNode.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSXMLDTDNode")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
