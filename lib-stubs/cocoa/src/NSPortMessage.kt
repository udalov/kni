// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSPortMessage.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSPortMessage(pointer: Long) : NSObject(pointer) {
    public open fun initWithSendPort_receivePort_components(sendPort: NSPort, replyPort: NSPort, components: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSendPort:receivePort:components:", sendPort, replyPort, components) as ObjCObject

    public open fun components(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "components") as NSArray

    public open fun receivePort(): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "receivePort") as NSPort

    public open fun sendPort(): NSPort =
        Native.objc_msgSend("class objc.NSPort", this, "sendPort") as NSPort

    public open fun sendBeforeDate(date: NSDate): Boolean =
        Native.objc_msgSend("boolean", this, "sendBeforeDate:", date) as Boolean

    public open fun msgid(): Int =
        Native.objc_msgSend("int", this, "msgid") as Int

    public open fun setMsgid(msgid: Int): Unit {
        Native.objc_msgSend("void", this, "setMsgid:", msgid)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPortMessage")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
