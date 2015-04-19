// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSXMLParser.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSXMLParserDelegate {
    trait metaclass
}

public open class NSXMLParser(pointer: Long) : NSObject(pointer), NSXMLParser_NSXMLParserLocatorAdditions {
    public open fun initWithContentsOfURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:", url) as ObjCObject

    public open fun initWithData(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", data) as ObjCObject

    public open fun initWithStream(stream: NSInputStream): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithStream:", stream) as ObjCObject

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun shouldProcessNamespaces(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldProcessNamespaces") as Boolean

    public open fun setShouldProcessNamespaces(shouldProcessNamespaces: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShouldProcessNamespaces:", shouldProcessNamespaces)
    }

    public open fun shouldReportNamespacePrefixes(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldReportNamespacePrefixes") as Boolean

    public open fun setShouldReportNamespacePrefixes(shouldReportNamespacePrefixes: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShouldReportNamespacePrefixes:", shouldReportNamespacePrefixes)
    }

    public open fun externalEntityResolvingPolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "externalEntityResolvingPolicy")

    public open fun setExternalEntityResolvingPolicy(externalEntityResolvingPolicy: Any): Unit {
        Native.objc_msgSend("void", this, "setExternalEntityResolvingPolicy:", externalEntityResolvingPolicy)
    }

    public open fun allowedExternalEntityURLs(): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "allowedExternalEntityURLs") as NSSet

    public open fun setAllowedExternalEntityURLs(allowedExternalEntityURLs: NSSet): Unit {
        Native.objc_msgSend("void", this, "setAllowedExternalEntityURLs:", allowedExternalEntityURLs)
    }

    public open fun parse(): Boolean =
        Native.objc_msgSend("boolean", this, "parse") as Boolean

    public open fun abortParsing(): Unit {
        Native.objc_msgSend("void", this, "abortParsing")
    }

    public open fun parserError(): NSError =
        Native.objc_msgSend("class objc.NSError", this, "parserError") as NSError

    public open fun shouldResolveExternalEntities(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldResolveExternalEntities") as Boolean

    public open fun setShouldResolveExternalEntities(shouldResolveExternalEntities: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShouldResolveExternalEntities:", shouldResolveExternalEntities)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSXMLParser_NSXMLParserLocatorAdditions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSXMLParser")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSXMLParser_NSXMLParserLocatorAdditions : IObjCObject {
    public open fun publicID(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "publicID") as NSString

    public open fun systemID(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "systemID") as NSString

    public open fun lineNumber(): Int =
        Native.objc_msgSend("int", this, "lineNumber") as Int

    public open fun columnNumber(): Int =
        Native.objc_msgSend("int", this, "columnNumber") as Int

    trait metaclass : IObjCObject
}
