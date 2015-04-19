// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSpeechRecognizer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSSpeechRecognizerDelegate {
    trait metaclass
}

public open class NSSpeechRecognizer(pointer: Long) : NSObject(pointer) {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun startListening(): Unit {
        Native.objc_msgSend("void", this, "startListening")
    }

    public open fun stopListening(): Unit {
        Native.objc_msgSend("void", this, "stopListening")
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun commands(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "commands") as NSArray

    public open fun setCommands(commands: NSArray): Unit {
        Native.objc_msgSend("void", this, "setCommands:", commands)
    }

    public open fun displayedCommandsTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "displayedCommandsTitle") as NSString

    public open fun setDisplayedCommandsTitle(displayedCommandsTitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setDisplayedCommandsTitle:", displayedCommandsTitle)
    }

    public open fun listensInForegroundOnly(): Boolean =
        Native.objc_msgSend("boolean", this, "listensInForegroundOnly") as Boolean

    public open fun setListensInForegroundOnly(listensInForegroundOnly: Boolean): Unit {
        Native.objc_msgSend("void", this, "setListensInForegroundOnly:", listensInForegroundOnly)
    }

    public open fun blocksOtherRecognizers(): Boolean =
        Native.objc_msgSend("boolean", this, "blocksOtherRecognizers") as Boolean

    public open fun setBlocksOtherRecognizers(blocksOtherRecognizers: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBlocksOtherRecognizers:", blocksOtherRecognizers)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSpeechRecognizer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
