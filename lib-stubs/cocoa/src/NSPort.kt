// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSPort.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSPortDelegate {
    trait metaclass
}

trait NSMachPortDelegate {
    trait metaclass
}

public open class NSPort(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun invalidate(): Unit {
        Native.objc_msgSend("void", this, "invalidate")
    }

    public open fun isValid(): Boolean =
        Native.objc_msgSend("boolean", this, "isValid") as Boolean

    public open fun setDelegate(anObject: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", anObject)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun scheduleInRunLoop_forMode(runLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "scheduleInRunLoop:forMode:", runLoop, mode)
    }

    public open fun removeFromRunLoop_forMode(runLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "removeFromRunLoop:forMode:", runLoop, mode)
    }

    public open fun reservedSpaceLength(): Int =
        Native.objc_msgSend("int", this, "reservedSpaceLength") as Int

    public open fun sendBeforeDate_components_from_reserved(limitDate: NSDate, components: NSMutableArray, receivePort: NSPort, headerSpaceReserved: Int): Boolean =
        Native.objc_msgSend("boolean", this, "sendBeforeDate:components:from:reserved:", limitDate, components, receivePort, headerSpaceReserved) as Boolean

    public open fun sendBeforeDate_msgid_components_from_reserved(limitDate: NSDate, msgID: Int, components: NSMutableArray, receivePort: NSPort, headerSpaceReserved: Int): Boolean =
        Native.objc_msgSend("boolean", this, "sendBeforeDate:msgid:components:from:reserved:", limitDate, msgID, components, receivePort, headerSpaceReserved) as Boolean

    public open fun addConnection_toRunLoop_forMode(conn: NSConnection, runLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "addConnection:toRunLoop:forMode:", conn, runLoop, mode)
    }

    public open fun removeConnection_fromRunLoop_forMode(conn: NSConnection, runLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "removeConnection:fromRunLoop:forMode:", conn, runLoop, mode)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
        public open fun port(): NSPort =
            Native.objc_msgSend("class objc.NSPort", this, "port") as NSPort

    }

    companion object : NSObject(Native.objc_getClass("NSPort")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMachPort(pointer: Long) : NSPort(pointer) {
    public open fun initWithMachPort(machPort: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithMachPort:", machPort) as ObjCObject

    override fun setDelegate(anObject: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", anObject)
    }

    override fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun initWithMachPort_options(machPort: Int, f: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithMachPort:options:", machPort, f) as ObjCObject

    public open fun machPort(): Int =
        Native.objc_msgSend("int", this, "machPort") as Int

    override fun scheduleInRunLoop_forMode(runLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "scheduleInRunLoop:forMode:", runLoop, mode)
    }

    override fun removeFromRunLoop_forMode(runLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "removeFromRunLoop:forMode:", runLoop, mode)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSPort.metaclass {
        public open fun portWithMachPort(machPort: Int): NSPort =
            Native.objc_msgSend("class objc.NSPort", this, "portWithMachPort:", machPort) as NSPort

        public open fun portWithMachPort_options(machPort: Int, f: Int): NSPort =
            Native.objc_msgSend("class objc.NSPort", this, "portWithMachPort:options:", machPort, f) as NSPort

    }

    companion object : NSObject(Native.objc_getClass("NSMachPort")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMessagePort(pointer: Long) : NSPort(pointer) {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSPort.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMessagePort")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSSocketPort(pointer: Long) : NSPort(pointer) {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithTCPPort(port: Short): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTCPPort:", port) as ObjCObject

    public open fun initWithProtocolFamily_socketType_protocol_address(family: Int, type: Int, protocol: Int, address: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithProtocolFamily:socketType:protocol:address:", family, type, protocol, address) as ObjCObject

    public open fun initWithProtocolFamily_socketType_protocol_socket(family: Int, type: Int, protocol: Int, sock: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithProtocolFamily:socketType:protocol:socket:", family, type, protocol, sock) as ObjCObject

    public open fun initRemoteWithTCPPort_host(port: Short, hostName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initRemoteWithTCPPort:host:", port, hostName) as ObjCObject

    public open fun initRemoteWithProtocolFamily_socketType_protocol_address(family: Int, type: Int, protocol: Int, address: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initRemoteWithProtocolFamily:socketType:protocol:address:", family, type, protocol, address) as ObjCObject

    public open fun protocolFamily(): Int =
        Native.objc_msgSend("int", this, "protocolFamily") as Int

    public open fun socketType(): Int =
        Native.objc_msgSend("int", this, "socketType") as Int

    public open fun protocol(): Int =
        Native.objc_msgSend("int", this, "protocol") as Int

    public open fun address(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "address") as NSData

    public open fun socket(): Int =
        Native.objc_msgSend("int", this, "socket") as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSPort.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSocketPort")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
