// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSInputManager.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTextInput {
    trait metaclass
}

public open class NSInputManager(pointer: Long) : NSObject(pointer), NSTextInput {
    public open fun initWithName_host(inputServerName: NSString, hostName: NSString): NSInputManager =
        Native.objc_msgSend("class objc.NSInputManager", this, "initWithName:host:", inputServerName, hostName) as NSInputManager

    public open fun localizedInputManagerName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedInputManagerName") as NSString

    public open fun markedTextAbandoned(cli: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "markedTextAbandoned:", cli)
    }

    public open fun markedTextSelectionChanged_client(newSel: Any, cli: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "markedTextSelectionChanged:client:", newSel, cli)
    }

    public open fun wantsToInterpretAllKeystrokes(): Boolean =
        Native.objc_msgSend("boolean", this, "wantsToInterpretAllKeystrokes") as Boolean

    public open fun language(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "language") as NSString

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun server(): NSInputServer =
        Native.objc_msgSend("class objc.NSInputServer", this, "server") as NSInputServer

    public open fun wantsToHandleMouseEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "wantsToHandleMouseEvents") as Boolean

    public open fun handleMouseEvent(theMouseEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "handleMouseEvent:", theMouseEvent) as Boolean

    public open fun wantsToDelayTextChangeNotifications(): Boolean =
        Native.objc_msgSend("boolean", this, "wantsToDelayTextChangeNotifications") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSTextInput.metaclass {
        public open fun currentInputManager(): NSInputManager =
            Native.objc_msgSend("class objc.NSInputManager", this, "currentInputManager") as NSInputManager

        public open fun cycleToNextInputLanguage(sender: ObjCObject): Unit {
            Native.objc_msgSend("void", this, "cycleToNextInputLanguage:", sender)
        }

        public open fun cycleToNextInputServerInLanguage(sender: ObjCObject): Unit {
            Native.objc_msgSend("void", this, "cycleToNextInputServerInLanguage:", sender)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSInputManager")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
