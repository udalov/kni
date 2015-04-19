// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSScreen.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScreen(pointer: Long) : NSObject(pointer), NSScreen_NSDeprecated {
    public open fun depth(): Int =
        Native.objc_msgSend("int", this, "depth") as Int

    public open fun frame(): Any =
        Native.objc_msgSend("class objc.Any", this, "frame")

    public open fun visibleFrame(): Any =
        Native.objc_msgSend("class objc.Any", this, "visibleFrame")

    public open fun deviceDescription(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "deviceDescription") as NSDictionary

    public open fun colorSpace(): NSColorSpace =
        Native.objc_msgSend("class objc.NSColorSpace", this, "colorSpace") as NSColorSpace

    public open fun supportedWindowDepths(): Pointer<Int> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "supportedWindowDepths") as Pointer<Int>

    public open fun convertRectToBacking(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectToBacking:", aRect)

    public open fun convertRectFromBacking(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectFromBacking:", aRect)

    public open fun backingAlignedRect_options(aRect: Any, options: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "backingAlignedRect:options:", aRect, options)

    public open fun backingScaleFactor(): Double =
        Native.objc_msgSend("double", this, "backingScaleFactor") as Double

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSScreen_NSDeprecated.metaclass {
        public open fun screens(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "screens") as NSArray

        public open fun mainScreen(): NSScreen =
            Native.objc_msgSend("class objc.NSScreen", this, "mainScreen") as NSScreen

        public open fun deepestScreen(): NSScreen =
            Native.objc_msgSend("class objc.NSScreen", this, "deepestScreen") as NSScreen

        public open fun screensHaveSeparateSpaces(): Boolean =
            Native.objc_msgSend("boolean", this, "screensHaveSeparateSpaces") as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSScreen")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSScreen_NSDeprecated : IObjCObject {
    public open fun userSpaceScaleFactor(): Double =
        Native.objc_msgSend("double", this, "userSpaceScaleFactor") as Double

    trait metaclass : IObjCObject
}
