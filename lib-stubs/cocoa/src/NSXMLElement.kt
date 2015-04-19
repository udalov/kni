// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSXMLElement.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSXMLElement(pointer: Long) : NSXMLNode(pointer), NSXMLElement_NSDeprecated {
    public open fun initWithName(name: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:", name) as ObjCObject

    public open fun initWithName_URI(name: NSString, URI: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:URI:", name, URI) as ObjCObject

    public open fun initWithName_stringValue(name: NSString, string: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:stringValue:", name, string) as ObjCObject

    public open fun initWithXMLString_error(string: NSString, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithXMLString:error:", string, error) as ObjCObject

    override fun initWithKind_options(kind: Any, options: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKind:options:", kind, options) as ObjCObject

    public open fun elementsForName(name: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "elementsForName:", name) as NSArray

    public open fun elementsForLocalName_URI(localName: NSString, URI: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "elementsForLocalName:URI:", localName, URI) as NSArray

    public open fun addAttribute(attribute: NSXMLNode): Unit {
        Native.objc_msgSend("void", this, "addAttribute:", attribute)
    }

    public open fun removeAttributeForName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "removeAttributeForName:", name)
    }

    public open fun attributes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "attributes") as NSArray

    public open fun setAttributes(attributes: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAttributes:", attributes)
    }

    public open fun setAttributesWithDictionary(attributes: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setAttributesWithDictionary:", attributes)
    }

    public open fun attributeForName(name: NSString): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "attributeForName:", name) as NSXMLNode

    public open fun attributeForLocalName_URI(localName: NSString, URI: NSString): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "attributeForLocalName:URI:", localName, URI) as NSXMLNode

    public open fun addNamespace(aNamespace: NSXMLNode): Unit {
        Native.objc_msgSend("void", this, "addNamespace:", aNamespace)
    }

    public open fun removeNamespaceForPrefix(name: NSString): Unit {
        Native.objc_msgSend("void", this, "removeNamespaceForPrefix:", name)
    }

    public open fun namespaces(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "namespaces") as NSArray

    public open fun setNamespaces(namespaces: NSArray): Unit {
        Native.objc_msgSend("void", this, "setNamespaces:", namespaces)
    }

    public open fun namespaceForPrefix(name: NSString): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "namespaceForPrefix:", name) as NSXMLNode

    public open fun resolveNamespaceForName(name: NSString): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "resolveNamespaceForName:", name) as NSXMLNode

    public open fun resolvePrefixForNamespaceURI(namespaceURI: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "resolvePrefixForNamespaceURI:", namespaceURI) as NSString

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

    public open fun normalizeAdjacentTextNodesPreservingCDATA(preserve: Boolean): Unit {
        Native.objc_msgSend("void", this, "normalizeAdjacentTextNodesPreservingCDATA:", preserve)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSXMLNode.metaclass, NSXMLElement_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSXMLElement")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSXMLElement_NSDeprecated : IObjCObject {
    public open fun setAttributesAsDictionary(attributes: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setAttributesAsDictionary:", attributes)
    }

    trait metaclass : IObjCObject
}
