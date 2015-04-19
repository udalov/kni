// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSXPCConnection.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSXPCProxyCreating {
    trait metaclass
}

trait NSXPCListenerDelegate {
    trait metaclass
}

public open class NSXPCConnection(pointer: Long) : NSObject(pointer), NSXPCProxyCreating {
    public open fun initWithServiceName(serviceName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithServiceName:", serviceName) as ObjCObject

    public open fun serviceName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "serviceName") as NSString

    public open fun initWithMachServiceName_options(name: NSString, options: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithMachServiceName:options:", name, options) as ObjCObject

    public open fun initWithListenerEndpoint(endpoint: NSXPCListenerEndpoint): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithListenerEndpoint:", endpoint) as ObjCObject

    public open fun endpoint(): NSXPCListenerEndpoint =
        Native.objc_msgSend("class objc.NSXPCListenerEndpoint", this, "endpoint") as NSXPCListenerEndpoint

    public open fun exportedInterface(): NSXPCInterface =
        Native.objc_msgSend("class objc.NSXPCInterface", this, "exportedInterface") as NSXPCInterface

    public open fun setExportedInterface(exportedInterface: NSXPCInterface): Unit {
        Native.objc_msgSend("void", this, "setExportedInterface:", exportedInterface)
    }

    public open fun exportedObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "exportedObject") as ObjCObject

    public open fun setExportedObject(exportedObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setExportedObject:", exportedObject)
    }

    public open fun remoteObjectInterface(): NSXPCInterface =
        Native.objc_msgSend("class objc.NSXPCInterface", this, "remoteObjectInterface") as NSXPCInterface

    public open fun setRemoteObjectInterface(remoteObjectInterface: NSXPCInterface): Unit {
        Native.objc_msgSend("void", this, "setRemoteObjectInterface:", remoteObjectInterface)
    }

    public open fun remoteObjectProxy(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "remoteObjectProxy") as ObjCObject

    public open fun remoteObjectProxyWithErrorHandler(handler: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "remoteObjectProxyWithErrorHandler:", handler) as ObjCObject

    public open fun interruptionHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "interruptionHandler")

    public open fun setInterruptionHandler(interruptionHandler: Any): Unit {
        Native.objc_msgSend("void", this, "setInterruptionHandler:", interruptionHandler)
    }

    public open fun invalidationHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "invalidationHandler")

    public open fun setInvalidationHandler(invalidationHandler: Any): Unit {
        Native.objc_msgSend("void", this, "setInvalidationHandler:", invalidationHandler)
    }

    public open fun resume(): Unit {
        Native.objc_msgSend("void", this, "resume")
    }

    public open fun suspend(): Unit {
        Native.objc_msgSend("void", this, "suspend")
    }

    public open fun invalidate(): Unit {
        Native.objc_msgSend("void", this, "invalidate")
    }

    public open fun auditSessionIdentifier(): Int =
        Native.objc_msgSend("int", this, "auditSessionIdentifier") as Int

    public open fun processIdentifier(): Int =
        Native.objc_msgSend("int", this, "processIdentifier") as Int

    public open fun effectiveUserIdentifier(): Int =
        Native.objc_msgSend("int", this, "effectiveUserIdentifier") as Int

    public open fun effectiveGroupIdentifier(): Int =
        Native.objc_msgSend("int", this, "effectiveGroupIdentifier") as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSXPCProxyCreating.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSXPCConnection")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSXPCListener(pointer: Long) : NSObject(pointer) {
    public open fun initWithMachServiceName(name: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithMachServiceName:", name) as ObjCObject

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun endpoint(): NSXPCListenerEndpoint =
        Native.objc_msgSend("class objc.NSXPCListenerEndpoint", this, "endpoint") as NSXPCListenerEndpoint

    public open fun resume(): Unit {
        Native.objc_msgSend("void", this, "resume")
    }

    public open fun suspend(): Unit {
        Native.objc_msgSend("void", this, "suspend")
    }

    public open fun invalidate(): Unit {
        Native.objc_msgSend("void", this, "invalidate")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun serviceListener(): NSXPCListener =
            Native.objc_msgSend("class objc.NSXPCListener", this, "serviceListener") as NSXPCListener

        public open fun anonymousListener(): NSXPCListener =
            Native.objc_msgSend("class objc.NSXPCListener", this, "anonymousListener") as NSXPCListener

    }

    companion object : NSObject(Native.objc_getClass("NSXPCListener")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSXPCInterface(pointer: Long) : NSObject(pointer) {
    public open fun protocol(): Any? =
        Native.objc_msgSend("class objc.Any?", this, "protocol") as Any?

    public open fun setProtocol(protocol: Any?): Unit {
        Native.objc_msgSend("void", this, "setProtocol:", protocol)
    }

    public open fun setClasses_forSelector_argumentIndex_ofReply(classes: NSSet, sel: ObjCSelector, arg: Int, ofReply: Boolean): Unit {
        Native.objc_msgSend("void", this, "setClasses:forSelector:argumentIndex:ofReply:", classes, sel, arg, ofReply)
    }

    public open fun classesForSelector_argumentIndex_ofReply(sel: ObjCSelector, arg: Int, ofReply: Boolean): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "classesForSelector:argumentIndex:ofReply:", sel, arg, ofReply) as NSSet

    public open fun setInterface_forSelector_argumentIndex_ofReply(ifc: NSXPCInterface, sel: ObjCSelector, arg: Int, ofReply: Boolean): Unit {
        Native.objc_msgSend("void", this, "setInterface:forSelector:argumentIndex:ofReply:", ifc, sel, arg, ofReply)
    }

    public open fun interfaceForSelector_argumentIndex_ofReply(sel: ObjCSelector, arg: Int, ofReply: Boolean): NSXPCInterface =
        Native.objc_msgSend("class objc.NSXPCInterface", this, "interfaceForSelector:argumentIndex:ofReply:", sel, arg, ofReply) as NSXPCInterface

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun interfaceWithProtocol(protocol: Any?): NSXPCInterface =
            Native.objc_msgSend("class objc.NSXPCInterface", this, "interfaceWithProtocol:", protocol) as NSXPCInterface

    }

    companion object : NSObject(Native.objc_getClass("NSXPCInterface")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSXPCListenerEndpoint(pointer: Long) : NSObject(pointer), NSSecureCoding {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSXPCListenerEndpoint")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
