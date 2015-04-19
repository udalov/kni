// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSXMLDTD.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSXMLDTD(pointer: Long) : NSXMLNode(pointer) {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithKind_options(kind: Any, options: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKind:options:", kind, options) as ObjCObject

    public open fun initWithContentsOfURL_options_error(url: NSURL, mask: Int, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:options:error:", url, mask, error) as ObjCObject

    public open fun initWithData_options_error(data: NSData, mask: Int, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:options:error:", data, mask, error) as ObjCObject

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

    public open fun insertChild_atIndex(child: NSXMLNode, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertChild:atIndex:", child, index)
    }

    public open fun insertChildren_atIndex(children: NSArray, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertChildren:atIndex:", children, index)
    }

    public open fun removeChildAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeChildAtIndex:", index)
    }

    public open fun setChildren(children: NSArray): Unit {
        Native.objc_msgSend("void", this, "setChildren:", children)
    }

    public open fun addChild(child: NSXMLNode): Unit {
        Native.objc_msgSend("void", this, "addChild:", child)
    }

    public open fun replaceChildAtIndex_withNode(index: Int, node: NSXMLNode): Unit {
        Native.objc_msgSend("void", this, "replaceChildAtIndex:withNode:", index, node)
    }

    public open fun entityDeclarationForName(name: NSString): NSXMLDTDNode =
        Native.objc_msgSend("class objc.NSXMLDTDNode", this, "entityDeclarationForName:", name) as NSXMLDTDNode

    public open fun notationDeclarationForName(name: NSString): NSXMLDTDNode =
        Native.objc_msgSend("class objc.NSXMLDTDNode", this, "notationDeclarationForName:", name) as NSXMLDTDNode

    public open fun elementDeclarationForName(name: NSString): NSXMLDTDNode =
        Native.objc_msgSend("class objc.NSXMLDTDNode", this, "elementDeclarationForName:", name) as NSXMLDTDNode

    public open fun attributeDeclarationForName_elementName(name: NSString, elementName: NSString): NSXMLDTDNode =
        Native.objc_msgSend("class objc.NSXMLDTDNode", this, "attributeDeclarationForName:elementName:", name, elementName) as NSXMLDTDNode

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSXMLNode.metaclass {
        public open fun predefinedEntityDeclarationForName(name: NSString): NSXMLDTDNode =
            Native.objc_msgSend("class objc.NSXMLDTDNode", this, "predefinedEntityDeclarationForName:", name) as NSXMLDTDNode

    }

    companion object : NSObject(Native.objc_getClass("NSXMLDTD")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
