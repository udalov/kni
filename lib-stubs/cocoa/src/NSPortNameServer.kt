// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSPortNameServer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPortNameServer(pointer: Long) : NSObject(pointer) {
    public open fun portForName(name: NSString): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "portForName:", name) as NSPort

    public open fun portForName_host(name: NSString, host: NSString): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "portForName:host:", name, host) as NSPort

    public open fun registerPort_name(port: NSPort, name: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "registerPort:name:", port, name) as Boolean

    public open fun removePortForName(name: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "removePortForName:", name) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun systemDefaultPortNameServer(): NSPortNameServer =
            Native.objc_msgSend("class objc.NSPortNameServer", this, "systemDefaultPortNameServer") as NSPortNameServer

    }

    companion object : NSObject(Native.objc_getClass("NSPortNameServer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMachBootstrapServer(pointer: Long) : NSPortNameServer(pointer) {
    override fun portForName(name: NSString): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "portForName:", name) as NSPort

    override fun portForName_host(name: NSString, host: NSString): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "portForName:host:", name, host) as NSPort

    override fun registerPort_name(port: NSPort, name: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "registerPort:name:", port, name) as Boolean

    public open fun servicePortWithName(name: NSString): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "servicePortWithName:", name) as NSPort

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSPortNameServer.metaclass {
        public open fun sharedInstance(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sharedInstance") as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSMachBootstrapServer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMessagePortNameServer(pointer: Long) : NSPortNameServer(pointer) {
    override fun portForName(name: NSString): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "portForName:", name) as NSPort

    override fun portForName_host(name: NSString, host: NSString): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "portForName:host:", name, host) as NSPort

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSPortNameServer.metaclass {
        public open fun sharedInstance(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sharedInstance") as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSMessagePortNameServer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSSocketPortNameServer(pointer: Long) : NSPortNameServer(pointer) {
    override fun portForName(name: NSString): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "portForName:", name) as NSPort

    override fun portForName_host(name: NSString, host: NSString): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "portForName:host:", name, host) as NSPort

    override fun registerPort_name(port: NSPort, name: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "registerPort:name:", port, name) as Boolean

    override fun removePortForName(name: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "removePortForName:", name) as Boolean

    public open fun portForName_host_nameServerPortNumber(name: NSString, host: NSString, portNumber: Short): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "portForName:host:nameServerPortNumber:", name, host, portNumber) as NSPort

    public open fun registerPort_name_nameServerPortNumber(port: NSPort, name: NSString, portNumber: Short): Boolean =
        Native.objc_msgSend("boolean", this, "registerPort:name:nameServerPortNumber:", port, name, portNumber) as Boolean

    public open fun defaultNameServerPortNumber(): Short =
        Native.objc_msgSend("short", this, "defaultNameServerPortNumber") as Short

    public open fun setDefaultNameServerPortNumber(defaultNameServerPortNumber: Short): Unit {
        Native.objc_msgSend("void", this, "setDefaultNameServerPortNumber:", defaultNameServerPortNumber)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSPortNameServer.metaclass {
        public open fun sharedInstance(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "sharedInstance") as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSSocketPortNameServer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
