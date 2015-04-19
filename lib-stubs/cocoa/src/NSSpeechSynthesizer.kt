// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSpeechSynthesizer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSSpeechSynthesizerDelegate {
    trait metaclass
}

public open class NSSpeechSynthesizer(pointer: Long) : NSObject(pointer) {
    public open fun initWithVoice(voice: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithVoice:", voice) as ObjCObject

    public open fun startSpeakingString(string: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "startSpeakingString:", string) as Boolean

    public open fun startSpeakingString_toURL(string: NSString, url: NSURL): Boolean =
        Native.objc_msgSend("boolean", this, "startSpeakingString:toURL:", string, url) as Boolean

    public open fun isSpeaking(): Boolean =
        Native.objc_msgSend("boolean", this, "isSpeaking") as Boolean

    public open fun stopSpeaking(): Unit {
        Native.objc_msgSend("void", this, "stopSpeaking")
    }

    public open fun stopSpeakingAtBoundary(boundary: Any): Unit {
        Native.objc_msgSend("void", this, "stopSpeakingAtBoundary:", boundary)
    }

    public open fun pauseSpeakingAtBoundary(boundary: Any): Unit {
        Native.objc_msgSend("void", this, "pauseSpeakingAtBoundary:", boundary)
    }

    public open fun continueSpeaking(): Unit {
        Native.objc_msgSend("void", this, "continueSpeaking")
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun voice(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "voice") as NSString

    public open fun setVoice(voice: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setVoice:", voice) as Boolean

    public open fun rate(): Float =
        Native.objc_msgSend("float", this, "rate") as Float

    public open fun setRate(rate: Float): Unit {
        Native.objc_msgSend("void", this, "setRate:", rate)
    }

    public open fun volume(): Float =
        Native.objc_msgSend("float", this, "volume") as Float

    public open fun setVolume(volume: Float): Unit {
        Native.objc_msgSend("void", this, "setVolume:", volume)
    }

    public open fun usesFeedbackWindow(): Boolean =
        Native.objc_msgSend("boolean", this, "usesFeedbackWindow") as Boolean

    public open fun setUsesFeedbackWindow(usesFeedbackWindow: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesFeedbackWindow:", usesFeedbackWindow)
    }

    public open fun addSpeechDictionary(speechDictionary: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "addSpeechDictionary:", speechDictionary)
    }

    public open fun phonemesFromText(text: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "phonemesFromText:", text) as NSString

    public open fun objectForProperty_error(property: NSString, outError: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForProperty:error:", property, outError) as ObjCObject

    public open fun setObject_forProperty_error(`object`: ObjCObject, property: NSString, outError: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "setObject:forProperty:error:", `object`, property, outError) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun isAnyApplicationSpeaking(): Boolean =
            Native.objc_msgSend("boolean", this, "isAnyApplicationSpeaking") as Boolean

        public open fun defaultVoice(): NSString =
            Native.objc_msgSend("class objc.NSString", this, "defaultVoice") as NSString

        public open fun availableVoices(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "availableVoices") as NSArray

        public open fun attributesForVoice(voice: NSString): NSDictionary =
            Native.objc_msgSend("class objc.NSDictionary", this, "attributesForVoice:", voice) as NSDictionary

    }

    companion object : NSObject(Native.objc_getClass("NSSpeechSynthesizer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
