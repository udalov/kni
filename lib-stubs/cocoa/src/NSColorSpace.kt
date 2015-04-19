// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSColorSpace.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSColorSpace(pointer: Long) : NSObject(pointer), NSSecureCoding {
    public open fun initWithICCProfileData(iccData: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithICCProfileData:", iccData) as ObjCObject

    public open fun ICCProfileData(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "ICCProfileData") as NSData

    public open fun initWithColorSyncProfile(prof: Pointer<*>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithColorSyncProfile:", prof) as ObjCObject

    public open fun colorSyncProfile(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "colorSyncProfile") as Pointer<*>

    public open fun initWithCGColorSpace(cgColorSpace: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGColorSpace:", cgColorSpace) as ObjCObject

    public open fun CGColorSpace(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGColorSpace") as Pointer<Any>

    public open fun numberOfColorComponents(): Int =
        Native.objc_msgSend("int", this, "numberOfColorComponents") as Int

    public open fun colorSpaceModel(): Any =
        Native.objc_msgSend("class objc.Any", this, "colorSpaceModel")

    public open fun localizedName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedName") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass {
        public open fun genericRGBColorSpace(): NSColorSpace =
            Native.objc_msgSend("class objc.NSColorSpace", this, "genericRGBColorSpace") as NSColorSpace

        public open fun genericGrayColorSpace(): NSColorSpace =
            Native.objc_msgSend("class objc.NSColorSpace", this, "genericGrayColorSpace") as NSColorSpace

        public open fun genericCMYKColorSpace(): NSColorSpace =
            Native.objc_msgSend("class objc.NSColorSpace", this, "genericCMYKColorSpace") as NSColorSpace

        public open fun deviceRGBColorSpace(): NSColorSpace =
            Native.objc_msgSend("class objc.NSColorSpace", this, "deviceRGBColorSpace") as NSColorSpace

        public open fun deviceGrayColorSpace(): NSColorSpace =
            Native.objc_msgSend("class objc.NSColorSpace", this, "deviceGrayColorSpace") as NSColorSpace

        public open fun deviceCMYKColorSpace(): NSColorSpace =
            Native.objc_msgSend("class objc.NSColorSpace", this, "deviceCMYKColorSpace") as NSColorSpace

        public open fun sRGBColorSpace(): NSColorSpace =
            Native.objc_msgSend("class objc.NSColorSpace", this, "sRGBColorSpace") as NSColorSpace

        public open fun genericGamma22GrayColorSpace(): NSColorSpace =
            Native.objc_msgSend("class objc.NSColorSpace", this, "genericGamma22GrayColorSpace") as NSColorSpace

        public open fun adobeRGB1998ColorSpace(): NSColorSpace =
            Native.objc_msgSend("class objc.NSColorSpace", this, "adobeRGB1998ColorSpace") as NSColorSpace

        public open fun availableColorSpacesWithModel(model: Any): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "availableColorSpacesWithModel:", model) as NSArray

    }

    companion object : NSObject(Native.objc_getClass("NSColorSpace")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
