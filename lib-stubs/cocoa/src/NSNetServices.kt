// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSNetServices.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSNetServiceDelegate {
    trait metaclass
}

trait NSNetServiceBrowserDelegate {
    trait metaclass
}

public open class NSNetService(pointer: Long) : NSObject(pointer), NSNetService_NSDeprecated {
    public open fun initWithDomain_type_name_port(domain: NSString, type: NSString, name: NSString, port: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDomain:type:name:port:", domain, type, name, port) as ObjCObject

    public open fun initWithDomain_type_name(domain: NSString, type: NSString, name: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDomain:type:name:", domain, type, name) as ObjCObject

    public open fun scheduleInRunLoop_forMode(aRunLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "scheduleInRunLoop:forMode:", aRunLoop, mode)
    }

    public open fun removeFromRunLoop_forMode(aRunLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "removeFromRunLoop:forMode:", aRunLoop, mode)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun includesPeerToPeer(): Boolean =
        Native.objc_msgSend("boolean", this, "includesPeerToPeer") as Boolean

    public open fun setIncludesPeerToPeer(includesPeerToPeer: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncludesPeerToPeer:", includesPeerToPeer)
    }

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun type(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "type") as NSString

    public open fun domain(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "domain") as NSString

    public open fun hostName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "hostName") as NSString

    public open fun addresses(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "addresses") as NSArray

    public open fun port(): Int =
        Native.objc_msgSend("int", this, "port") as Int

    public open fun publish(): Unit {
        Native.objc_msgSend("void", this, "publish")
    }

    public open fun publishWithOptions(options: Any): Unit {
        Native.objc_msgSend("void", this, "publishWithOptions:", options)
    }

    public open fun resolve(): Unit {
        Native.objc_msgSend("void", this, "resolve")
    }

    public open fun stop(): Unit {
        Native.objc_msgSend("void", this, "stop")
    }

    public open fun resolveWithTimeout(timeout: Double): Unit {
        Native.objc_msgSend("void", this, "resolveWithTimeout:", timeout)
    }

    public open fun getInputStream_outputStream(inputStream: Pointer<NSInputStream>, outputStream: Pointer<NSOutputStream>): Boolean =
        Native.objc_msgSend("boolean", this, "getInputStream:outputStream:", inputStream, outputStream) as Boolean

    public open fun setTXTRecordData(recordData: NSData): Boolean =
        Native.objc_msgSend("boolean", this, "setTXTRecordData:", recordData) as Boolean

    public open fun TXTRecordData(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "TXTRecordData") as NSData

    public open fun startMonitoring(): Unit {
        Native.objc_msgSend("void", this, "startMonitoring")
    }

    public open fun stopMonitoring(): Unit {
        Native.objc_msgSend("void", this, "stopMonitoring")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSNetService_NSDeprecated.metaclass {
        public open fun dictionaryFromTXTRecordData(txtData: NSData): NSDictionary =
            Native.objc_msgSend("class objc.NSDictionary", this, "dictionaryFromTXTRecordData:", txtData) as NSDictionary

        public open fun dataFromTXTRecordDictionary(txtDictionary: NSDictionary): NSData =
            Native.objc_msgSend("class objc.NSData", this, "dataFromTXTRecordDictionary:", txtDictionary) as NSData

    }

    companion object : NSObject(Native.objc_getClass("NSNetService")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSNetServiceBrowser(pointer: Long) : NSObject(pointer), NSNetServiceBrowser_NSDeprecated {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun includesPeerToPeer(): Boolean =
        Native.objc_msgSend("boolean", this, "includesPeerToPeer") as Boolean

    public open fun setIncludesPeerToPeer(includesPeerToPeer: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncludesPeerToPeer:", includesPeerToPeer)
    }

    public open fun scheduleInRunLoop_forMode(aRunLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "scheduleInRunLoop:forMode:", aRunLoop, mode)
    }

    public open fun removeFromRunLoop_forMode(aRunLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "removeFromRunLoop:forMode:", aRunLoop, mode)
    }

    public open fun searchForBrowsableDomains(): Unit {
        Native.objc_msgSend("void", this, "searchForBrowsableDomains")
    }

    public open fun searchForRegistrationDomains(): Unit {
        Native.objc_msgSend("void", this, "searchForRegistrationDomains")
    }

    public open fun searchForServicesOfType_inDomain(type: NSString, domainString: NSString): Unit {
        Native.objc_msgSend("void", this, "searchForServicesOfType:inDomain:", type, domainString)
    }

    public open fun stop(): Unit {
        Native.objc_msgSend("void", this, "stop")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSNetServiceBrowser_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSNetServiceBrowser")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSNetService_NSDeprecated : IObjCObject {
    public open fun protocolSpecificInformation(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "protocolSpecificInformation") as NSString

    public open fun setProtocolSpecificInformation(specificInformation: NSString): Unit {
        Native.objc_msgSend("void", this, "setProtocolSpecificInformation:", specificInformation)
    }

    trait metaclass : IObjCObject
}

trait NSNetServiceBrowser_NSDeprecated : IObjCObject {
    public open fun searchForAllDomains(): Unit {
        Native.objc_msgSend("void", this, "searchForAllDomains")
    }

    trait metaclass : IObjCObject
}
