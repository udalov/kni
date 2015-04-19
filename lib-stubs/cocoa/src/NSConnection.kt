// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSConnection.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSConnectionDelegate {
    trait metaclass
}

public open class NSConnection(pointer: Long) : NSObject(pointer) {
    public open fun statistics(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "statistics") as NSDictionary

    public open fun requestTimeout(): Double =
        Native.objc_msgSend("double", this, "requestTimeout") as Double

    public open fun setRequestTimeout(requestTimeout: Double): Unit {
        Native.objc_msgSend("void", this, "setRequestTimeout:", requestTimeout)
    }

    public open fun replyTimeout(): Double =
        Native.objc_msgSend("double", this, "replyTimeout") as Double

    public open fun setReplyTimeout(replyTimeout: Double): Unit {
        Native.objc_msgSend("void", this, "setReplyTimeout:", replyTimeout)
    }

    public open fun rootObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "rootObject") as ObjCObject

    public open fun setRootObject(rootObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setRootObject:", rootObject)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun independentConversationQueueing(): Boolean =
        Native.objc_msgSend("boolean", this, "independentConversationQueueing") as Boolean

    public open fun setIndependentConversationQueueing(independentConversationQueueing: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIndependentConversationQueueing:", independentConversationQueueing)
    }

    public open fun isValid(): Boolean =
        Native.objc_msgSend("boolean", this, "isValid") as Boolean

    public open fun rootProxy(): NSDistantObject =
        Native.objc_msgSend("class objc.NSDistantObject", this, "rootProxy") as NSDistantObject

    public open fun invalidate(): Unit {
        Native.objc_msgSend("void", this, "invalidate")
    }

    public open fun addRequestMode(rmode: NSString): Unit {
        Native.objc_msgSend("void", this, "addRequestMode:", rmode)
    }

    public open fun removeRequestMode(rmode: NSString): Unit {
        Native.objc_msgSend("void", this, "removeRequestMode:", rmode)
    }

    public open fun requestModes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "requestModes") as NSArray

    public open fun registerName(name: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "registerName:", name) as Boolean

    public open fun registerName_withNameServer(name: NSString, server: NSPortNameServer): Boolean =
        Native.objc_msgSend("boolean", this, "registerName:withNameServer:", name, server) as Boolean

    public open fun initWithReceivePort_sendPort(receivePort: NSPort, sendPort: NSPort): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithReceivePort:sendPort:", receivePort, sendPort) as ObjCObject

    public open fun sendPort(): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "sendPort") as NSPort

    public open fun receivePort(): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "receivePort") as NSPort

    public open fun enableMultipleThreads(): Unit {
        Native.objc_msgSend("void", this, "enableMultipleThreads")
    }

    public open fun multipleThreadsEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "multipleThreadsEnabled") as Boolean

    public open fun addRunLoop(runloop: NSRunLoop): Unit {
        Native.objc_msgSend("void", this, "addRunLoop:", runloop)
    }

    public open fun removeRunLoop(runloop: NSRunLoop): Unit {
        Native.objc_msgSend("void", this, "removeRunLoop:", runloop)
    }

    public open fun runInNewThread(): Unit {
        Native.objc_msgSend("void", this, "runInNewThread")
    }

    public open fun remoteObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "remoteObjects") as NSArray

    public open fun localObjects(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "localObjects") as NSArray

    public open fun dispatchWithComponents(components: NSArray): Unit {
        Native.objc_msgSend("void", this, "dispatchWithComponents:", components)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun allConnections(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "allConnections") as NSArray

        public open fun defaultConnection(): NSConnection =
            Native.objc_msgSend("class objc.NSConnection", this, "defaultConnection") as NSConnection

        public open fun connectionWithRegisteredName_host(name: NSString, hostName: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "connectionWithRegisteredName:host:", name, hostName) as ObjCObject

        public open fun connectionWithRegisteredName_host_usingNameServer(name: NSString, hostName: NSString, server: NSPortNameServer): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "connectionWithRegisteredName:host:usingNameServer:", name, hostName, server) as ObjCObject

        public open fun rootProxyForConnectionWithRegisteredName_host(name: NSString, hostName: NSString): NSDistantObject =
            Native.objc_msgSend("class objc.NSDistantObject", this, "rootProxyForConnectionWithRegisteredName:host:", name, hostName) as NSDistantObject

        public open fun rootProxyForConnectionWithRegisteredName_host_usingNameServer(name: NSString, hostName: NSString, server: NSPortNameServer): NSDistantObject =
            Native.objc_msgSend("class objc.NSDistantObject", this, "rootProxyForConnectionWithRegisteredName:host:usingNameServer:", name, hostName, server) as NSDistantObject

        public open fun serviceConnectionWithName_rootObject_usingNameServer(name: NSString, root: ObjCObject, server: NSPortNameServer): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "serviceConnectionWithName:rootObject:usingNameServer:", name, root, server) as ObjCObject

        public open fun serviceConnectionWithName_rootObject(name: NSString, root: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "serviceConnectionWithName:rootObject:", name, root) as ObjCObject

        public open fun connectionWithReceivePort_sendPort(receivePort: NSPort, sendPort: NSPort): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "connectionWithReceivePort:sendPort:", receivePort, sendPort) as ObjCObject

        public open fun currentConversation(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "currentConversation") as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSConnection")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSDistantObjectRequest(pointer: Long) : NSObject(pointer) {
    public open fun invocation(): NSInvocation =
        Native.objc_msgSend("class objc.NSInvocation", this, "invocation") as NSInvocation

    public open fun connection(): NSConnection =
        Native.objc_msgSend("class objc.NSConnection", this, "connection") as NSConnection

    public open fun conversation(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "conversation") as ObjCObject

    public open fun replyWithException(exception: NSException): Unit {
        Native.objc_msgSend("void", this, "replyWithException:", exception)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDistantObjectRequest")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
