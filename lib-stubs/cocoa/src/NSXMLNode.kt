// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSXMLNode.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSXMLNode(pointer: Long) : NSObject(pointer), NSCopying {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithKind(kind: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKind:", kind) as ObjCObject

    public open fun initWithKind_options(kind: Any, options: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKind:options:", kind, options) as ObjCObject

    public open fun kind(): Any =
        Native.objc_msgSend("class objc.Any", this, "kind")

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    public open fun objectValue(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectValue") as ObjCObject

    public open fun setObjectValue(objectValue: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setObjectValue:", objectValue)
    }

    public open fun stringValue(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringValue") as NSString

    public open fun setStringValue(stringValue: NSString): Unit {
        Native.objc_msgSend("void", this, "setStringValue:", stringValue)
    }

    public open fun setStringValue_resolvingEntities(string: NSString, resolve: Boolean): Unit {
        Native.objc_msgSend("void", this, "setStringValue:resolvingEntities:", string, resolve)
    }

    public open fun index(): Int =
        Native.objc_msgSend("int", this, "index") as Int

    public open fun level(): Int =
        Native.objc_msgSend("int", this, "level") as Int

    public open fun rootDocument(): NSXMLDocument =
        Native.objc_msgSend("class objc.NSXMLDocument", this, "rootDocument") as NSXMLDocument

    public open fun parent(): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "parent") as NSXMLNode

    public open fun childCount(): Int =
        Native.objc_msgSend("int", this, "childCount") as Int

    public open fun children(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "children") as NSArray

    public open fun childAtIndex(index: Int): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "childAtIndex:", index) as NSXMLNode

    public open fun previousSibling(): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "previousSibling") as NSXMLNode

    public open fun nextSibling(): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "nextSibling") as NSXMLNode

    public open fun previousNode(): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "previousNode") as NSXMLNode

    public open fun nextNode(): NSXMLNode =
        Native.objc_msgSend("class objc.NSXMLNode", this, "nextNode") as NSXMLNode

    public open fun detach(): Unit {
        Native.objc_msgSend("void", this, "detach")
    }

    public open fun XPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "XPath") as NSString

    public open fun localName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localName") as NSString

    public open fun prefix(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "prefix") as NSString

    public open fun URI(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "URI") as NSString

    public open fun setURI(URI: NSString): Unit {
        Native.objc_msgSend("void", this, "setURI:", URI)
    }

    public open fun description(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "description") as NSString

    public open fun XMLString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "XMLString") as NSString

    public open fun XMLStringWithOptions(options: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "XMLStringWithOptions:", options) as NSString

    public open fun canonicalXMLStringPreservingComments(comments: Boolean): NSString =
        Native.objc_msgSend("class objc.NSString", this, "canonicalXMLStringPreservingComments:", comments) as NSString

    public open fun nodesForXPath_error(xpath: NSString, error: Pointer<NSError>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "nodesForXPath:error:", xpath, error) as NSArray

    public open fun objectsForXQuery_constants_error(xquery: NSString, constants: NSDictionary, error: Pointer<NSError>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "objectsForXQuery:constants:error:", xquery, constants, error) as NSArray

    public open fun objectsForXQuery_error(xquery: NSString, error: Pointer<NSError>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "objectsForXQuery:error:", xquery, error) as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass {
        public open fun document(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "document") as ObjCObject

        public open fun documentWithRootElement(element: NSXMLElement): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "documentWithRootElement:", element) as ObjCObject

        public open fun elementWithName(name: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "elementWithName:", name) as ObjCObject

        public open fun elementWithName_URI(name: NSString, URI: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "elementWithName:URI:", name, URI) as ObjCObject

        public open fun elementWithName_stringValue(name: NSString, string: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "elementWithName:stringValue:", name, string) as ObjCObject

        public open fun elementWithName_children_attributes(name: NSString, children: NSArray, attributes: NSArray): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "elementWithName:children:attributes:", name, children, attributes) as ObjCObject

        public open fun attributeWithName_stringValue(name: NSString, stringValue: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "attributeWithName:stringValue:", name, stringValue) as ObjCObject

        public open fun attributeWithName_URI_stringValue(name: NSString, URI: NSString, stringValue: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "attributeWithName:URI:stringValue:", name, URI, stringValue) as ObjCObject

        public open fun namespaceWithName_stringValue(name: NSString, stringValue: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "namespaceWithName:stringValue:", name, stringValue) as ObjCObject

        public open fun processingInstructionWithName_stringValue(name: NSString, stringValue: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "processingInstructionWithName:stringValue:", name, stringValue) as ObjCObject

        public open fun commentWithStringValue(stringValue: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "commentWithStringValue:", stringValue) as ObjCObject

        public open fun textWithStringValue(stringValue: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "textWithStringValue:", stringValue) as ObjCObject

        public open fun DTDNodeWithXMLString(string: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "DTDNodeWithXMLString:", string) as ObjCObject

        public open fun localNameForName(name: NSString): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localNameForName:", name) as NSString

        public open fun prefixForName(name: NSString): NSString =
            Native.objc_msgSend("class objc.NSString", this, "prefixForName:", name) as NSString

        public open fun predefinedNamespaceForPrefix(name: NSString): NSXMLNode =
            Native.objc_msgSend("class objc.NSXMLNode", this, "predefinedNamespaceForPrefix:", name) as NSXMLNode

    }

    companion object : NSObject(Native.objc_getClass("NSXMLNode")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
