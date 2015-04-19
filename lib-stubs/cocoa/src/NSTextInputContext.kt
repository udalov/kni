// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextInputContext.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTextInputContext(pointer: Long) : NSObject(pointer) {
    public open fun initWithClient(theClient: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithClient:", theClient) as ObjCObject

    public open fun client(): Any =
        Native.objc_msgSend("class objc.Any", this, "client")

    public open fun acceptsGlyphInfo(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsGlyphInfo") as Boolean

    public open fun setAcceptsGlyphInfo(acceptsGlyphInfo: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAcceptsGlyphInfo:", acceptsGlyphInfo)
    }

    public open fun allowedInputSourceLocales(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allowedInputSourceLocales") as NSArray

    public open fun setAllowedInputSourceLocales(allowedInputSourceLocales: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAllowedInputSourceLocales:", allowedInputSourceLocales)
    }

    public open fun activate(): Unit {
        Native.objc_msgSend("void", this, "activate")
    }

    public open fun deactivate(): Unit {
        Native.objc_msgSend("void", this, "deactivate")
    }

    public open fun handleEvent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "handleEvent:", theEvent) as Boolean

    public open fun discardMarkedText(): Unit {
        Native.objc_msgSend("void", this, "discardMarkedText")
    }

    public open fun invalidateCharacterCoordinates(): Unit {
        Native.objc_msgSend("void", this, "invalidateCharacterCoordinates")
    }

    public open fun keyboardInputSources(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "keyboardInputSources") as NSArray

    public open fun selectedKeyboardInputSource(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "selectedKeyboardInputSource") as NSString

    public open fun setSelectedKeyboardInputSource(selectedKeyboardInputSource: NSString): Unit {
        Native.objc_msgSend("void", this, "setSelectedKeyboardInputSource:", selectedKeyboardInputSource)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun currentInputContext(): NSTextInputContext =
            Native.objc_msgSend("class objc.NSTextInputContext", this, "currentInputContext") as NSTextInputContext

        public open fun localizedNameForInputSource(inputSourceIdentifier: NSString): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localizedNameForInputSource:", inputSourceIdentifier) as NSString

    }

    companion object : NSObject(Native.objc_getClass("NSTextInputContext")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
