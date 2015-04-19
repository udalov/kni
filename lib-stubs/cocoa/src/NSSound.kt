// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSound.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSSoundDelegate {
    trait metaclass
}

public open class NSSound(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSPasteboardReading, NSPasteboardWriting, NSSound_NSDeprecated {
    public open fun initWithContentsOfURL_byReference(url: NSURL, byRef: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:byReference:", url, byRef) as ObjCObject

    public open fun initWithContentsOfFile_byReference(path: NSString, byRef: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfFile:byReference:", path, byRef) as ObjCObject

    public open fun initWithData(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", data) as ObjCObject

    public open fun setName(string: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setName:", string) as Boolean

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun initWithPasteboard(pasteboard: NSPasteboard): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPasteboard:", pasteboard) as ObjCObject

    public open fun writeToPasteboard(pasteboard: NSPasteboard): Unit {
        Native.objc_msgSend("void", this, "writeToPasteboard:", pasteboard)
    }

    public open fun play(): Boolean =
        Native.objc_msgSend("boolean", this, "play") as Boolean

    public open fun pause(): Boolean =
        Native.objc_msgSend("boolean", this, "pause") as Boolean

    public open fun resume(): Boolean =
        Native.objc_msgSend("boolean", this, "resume") as Boolean

    public open fun stop(): Boolean =
        Native.objc_msgSend("boolean", this, "stop") as Boolean

    public open fun isPlaying(): Boolean =
        Native.objc_msgSend("boolean", this, "isPlaying") as Boolean

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun duration(): Double =
        Native.objc_msgSend("double", this, "duration") as Double

    public open fun volume(): Float =
        Native.objc_msgSend("float", this, "volume") as Float

    public open fun setVolume(volume: Float): Unit {
        Native.objc_msgSend("void", this, "setVolume:", volume)
    }

    public open fun currentTime(): Double =
        Native.objc_msgSend("double", this, "currentTime") as Double

    public open fun setCurrentTime(currentTime: Double): Unit {
        Native.objc_msgSend("void", this, "setCurrentTime:", currentTime)
    }

    public open fun loops(): Boolean =
        Native.objc_msgSend("boolean", this, "loops") as Boolean

    public open fun setLoops(loops: Boolean): Unit {
        Native.objc_msgSend("void", this, "setLoops:", loops)
    }

    public open fun playbackDeviceIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "playbackDeviceIdentifier") as NSString

    public open fun setPlaybackDeviceIdentifier(playbackDeviceIdentifier: NSString): Unit {
        Native.objc_msgSend("void", this, "setPlaybackDeviceIdentifier:", playbackDeviceIdentifier)
    }

    public open fun setChannelMapping(channelMapping: NSArray): Unit {
        Native.objc_msgSend("void", this, "setChannelMapping:", channelMapping)
    }

    public open fun channelMapping(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "channelMapping") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSPasteboardReading.metaclass, NSPasteboardWriting.metaclass, NSSound_NSDeprecated.metaclass {
        public open fun soundNamed(name: NSString): NSSound =
            Native.objc_msgSend("class objc.NSSound", this, "soundNamed:", name) as NSSound

        public open fun canInitWithPasteboard(pasteboard: NSPasteboard): Boolean =
            Native.objc_msgSend("boolean", this, "canInitWithPasteboard:", pasteboard) as Boolean

        public open fun soundUnfilteredTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "soundUnfilteredTypes") as NSArray

    }

    companion object : NSObject(Native.objc_getClass("NSSound")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSSound_NSDeprecated : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun soundUnfilteredFileTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "soundUnfilteredFileTypes") as NSArray

        public open fun soundUnfilteredPasteboardTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "soundUnfilteredPasteboardTypes") as NSArray
    }
}

trait NSBundle_NSBundleSoundExtensions : IObjCObject {
    public open fun pathForSoundResource(name: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathForSoundResource:", name) as NSString

    trait metaclass : IObjCObject
}
