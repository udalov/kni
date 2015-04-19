// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSAppleEventManager.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSAppleEventManager(pointer: Long) : NSObject(pointer) {
    public open fun setEventHandler_andSelector_forEventClass_andEventID(handler: ObjCObject, handleEventSelector: ObjCSelector, eventClass: Int, eventID: Int): Unit {
        Native.objc_msgSend("void", this, "setEventHandler:andSelector:forEventClass:andEventID:", handler, handleEventSelector, eventClass, eventID)
    }

    public open fun removeEventHandlerForEventClass_andEventID(eventClass: Int, eventID: Int): Unit {
        Native.objc_msgSend("void", this, "removeEventHandlerForEventClass:andEventID:", eventClass, eventID)
    }

    public open fun dispatchRawAppleEvent_withRawReply_handlerRefCon(theAppleEvent: Pointer<Any>, theReply: Pointer<Any>, handlerRefCon: Pointer<*>): Short =
        Native.objc_msgSend("short", this, "dispatchRawAppleEvent:withRawReply:handlerRefCon:", theAppleEvent, theReply, handlerRefCon) as Short

    public open fun currentAppleEvent(): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "currentAppleEvent") as NSAppleEventDescriptor

    public open fun currentReplyAppleEvent(): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "currentReplyAppleEvent") as NSAppleEventDescriptor

    public open fun suspendCurrentAppleEvent(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "suspendCurrentAppleEvent") as Pointer<Any>

    public open fun appleEventForSuspensionID(suspensionID: Pointer<Any>): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "appleEventForSuspensionID:", suspensionID) as NSAppleEventDescriptor

    public open fun replyAppleEventForSuspensionID(suspensionID: Pointer<Any>): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "replyAppleEventForSuspensionID:", suspensionID) as NSAppleEventDescriptor

    public open fun setCurrentAppleEventAndReplyEventWithSuspensionID(suspensionID: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "setCurrentAppleEventAndReplyEventWithSuspensionID:", suspensionID)
    }

    public open fun resumeWithSuspensionID(suspensionID: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "resumeWithSuspensionID:", suspensionID)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun sharedAppleEventManager(): NSAppleEventManager =
            Native.objc_msgSend("class objc.NSAppleEventManager", this, "sharedAppleEventManager") as NSAppleEventManager

    }

    companion object : NSObject(Native.objc_getClass("NSAppleEventManager")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
