// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSXMLDocument.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSXMLDocument(pointer: Long) : NSXMLNode(pointer) {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithXMLString_options_error(string: NSString, mask: Int, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithXMLString:options:error:", string, mask, error) as ObjCObject

    public open fun initWithContentsOfURL_options_error(url: NSURL, mask: Int, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:options:error:", url, mask, error) as ObjCObject

    public open fun initWithData_options_error(data: NSData, mask: Int, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:options:error:", data, mask, error) as ObjCObject

    public open fun initWithRootElement(element: NSXMLElement): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRootElement:", element) as ObjCObject

    public open fun characterEncoding(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "characterEncoding") as NSString

    public open fun setCharacterEncoding(characterEncoding: NSString): Unit {
        Native.objc_msgSend("void", this, "setCharacterEncoding:", characterEncoding)
    }

    public open fun version(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "version") as NSString

    public open fun setVersion(version: NSString): Unit {
        Native.objc_msgSend("void", this, "setVersion:", version)
    }

    public open fun isStandalone(): Boolean =
        Native.objc_msgSend("boolean", this, "isStandalone") as Boolean

    public open fun setStandalone(standalone: Boolean): Unit {
        Native.objc_msgSend("void", this, "setStandalone:", standalone)
    }

    public open fun documentContentKind(): Any =
        Native.objc_msgSend("class objc.Any", this, "documentContentKind")

    public open fun setDocumentContentKind(documentContentKind: Any): Unit {
        Native.objc_msgSend("void", this, "setDocumentContentKind:", documentContentKind)
    }

    public open fun MIMEType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "MIMEType") as NSString

    public open fun setMIMEType(MIMEType: NSString): Unit {
        Native.objc_msgSend("void", this, "setMIMEType:", MIMEType)
    }

    public open fun DTD(): NSXMLDTD =
        Native.objc_msgSend("class objc.NSXMLDTD", this, "DTD") as NSXMLDTD

    public open fun setDTD(DTD: NSXMLDTD): Unit {
        Native.objc_msgSend("void", this, "setDTD:", DTD)
    }

    public open fun setRootElement(root: NSXMLElement): Unit {
        Native.objc_msgSend("void", this, "setRootElement:", root)
    }

    public open fun rootElement(): NSXMLElement =
        Native.objc_msgSend("class objc.NSXMLElement", this, "rootElement") as NSXMLElement

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

    public open fun XMLData(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "XMLData") as NSData

    public open fun XMLDataWithOptions(options: Int): NSData =
        Native.objc_msgSend("class objc.NSData", this, "XMLDataWithOptions:", options) as NSData

    public open fun objectByApplyingXSLT_arguments_error(xslt: NSData, arguments: NSDictionary, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectByApplyingXSLT:arguments:error:", xslt, arguments, error) as ObjCObject

    public open fun objectByApplyingXSLTString_arguments_error(xslt: NSString, arguments: NSDictionary, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectByApplyingXSLTString:arguments:error:", xslt, arguments, error) as ObjCObject

    public open fun objectByApplyingXSLTAtURL_arguments_error(xsltURL: NSURL, argument: NSDictionary, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectByApplyingXSLTAtURL:arguments:error:", xsltURL, argument, error) as ObjCObject

    public open fun validateAndReturnError(error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "validateAndReturnError:", error) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSXMLNode.metaclass {
        public open fun replacementClassForClass(cls: ObjCClass): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "replacementClassForClass:", cls) as ObjCClass

    }

    companion object : NSObject(Native.objc_getClass("NSXMLDocument")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
