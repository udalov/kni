// generated from "/System/Library/Frameworks/QuartzCore.framework/Headers/../Frameworks/CoreImage.framework/Headers/CIImage.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class CIImage(pointer: Long) : NSObject(pointer), NSCoding, NSCopying, CIImage_AutoAdjustment, CIImage_NSAppKitAdditions {
    public open fun initWithCGImage(image: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGImage:", image) as ObjCObject

    public open fun initWithCGImage_options(image: Pointer<Any>, d: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGImage:options:", image, d) as ObjCObject

    public open fun initWithCGLayer(layer: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGLayer:", layer) as ObjCObject

    public open fun initWithCGLayer_options(layer: Pointer<Any>, d: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGLayer:options:", layer, d) as ObjCObject

    public open fun initWithData(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", data) as ObjCObject

    public open fun initWithData_options(data: NSData, d: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:options:", data, d) as ObjCObject

    public open fun initWithBitmapData_bytesPerRow_size_format_colorSpace(d: NSData, bpr: Int, size: Any, f: Int, c: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBitmapData:bytesPerRow:size:format:colorSpace:", d, bpr, size, f, c) as ObjCObject

    public open fun initWithTexture_size_flipped_colorSpace(name: Int, size: Any, flag: Boolean, cs: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTexture:size:flipped:colorSpace:", name, size, flag, cs) as ObjCObject

    public open fun initWithTexture_size_flipped_options(name: Int, size: Any, flag: Boolean, options: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTexture:size:flipped:options:", name, size, flag, options) as ObjCObject

    public open fun initWithContentsOfURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:", url) as ObjCObject

    public open fun initWithContentsOfURL_options(url: NSURL, d: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:options:", url, d) as ObjCObject

    public open fun initWithIOSurface(surface: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIOSurface:", surface) as ObjCObject

    public open fun initWithIOSurface_options(surface: Pointer<Any>, d: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIOSurface:options:", surface, d) as ObjCObject

    public open fun initWithIOSurface_plane_format_options(surface: Pointer<Any>, plane: Int, format: Int, d: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIOSurface:plane:format:options:", surface, plane, format, d) as ObjCObject

    public open fun initWithCVImageBuffer(imageBuffer: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCVImageBuffer:", imageBuffer) as ObjCObject

    public open fun initWithCVImageBuffer_options(imageBuffer: Pointer<Any>, dict: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCVImageBuffer:options:", imageBuffer, dict) as ObjCObject

    public open fun initWithCVPixelBuffer(buffer: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCVPixelBuffer:", buffer) as ObjCObject

    public open fun initWithCVPixelBuffer_options(buffer: Pointer<Any>, dict: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCVPixelBuffer:options:", buffer, dict) as ObjCObject

    public open fun initWithColor(color: CIColor): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithColor:", color) as ObjCObject

    public open fun imageByApplyingTransform(matrix: Any): CIImage =
        Native.objc_msgSend("class objc.CIImage", this, "imageByApplyingTransform:", matrix) as CIImage

    public open fun imageByApplyingOrientation(orientation: Int): CIImage =
        Native.objc_msgSend("class objc.CIImage", this, "imageByApplyingOrientation:", orientation) as CIImage

    public open fun imageTransformForOrientation(orientation: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "imageTransformForOrientation:", orientation)

    public open fun imageByCompositingOverImage(dest: CIImage): CIImage =
        Native.objc_msgSend("class objc.CIImage", this, "imageByCompositingOverImage:", dest) as CIImage

    public open fun imageByCroppingToRect(r: Any): CIImage =
        Native.objc_msgSend("class objc.CIImage", this, "imageByCroppingToRect:", r) as CIImage

    public open fun imageByClampingToExtent(): CIImage =
        Native.objc_msgSend("class objc.CIImage", this, "imageByClampingToExtent") as CIImage

    public open fun extent(): Any =
        Native.objc_msgSend("class objc.Any", this, "extent")

    public open fun imageByApplyingFilter_withInputParameters(filterName: NSString, params: NSDictionary): CIImage =
        Native.objc_msgSend("class objc.CIImage", this, "imageByApplyingFilter:withInputParameters:", filterName, params) as CIImage

    public open fun properties(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "properties") as NSDictionary

    public open fun definition(): CIFilterShape =
        Native.objc_msgSend("class objc.CIFilterShape", this, "definition") as CIFilterShape

    public open fun url(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "url") as NSURL

    public open fun colorSpace(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "colorSpace") as Pointer<Any>

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSCopying.metaclass, CIImage_AutoAdjustment.metaclass, CIImage_NSAppKitAdditions.metaclass {
        public open fun imageWithCGImage(image: Pointer<Any>): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithCGImage:", image) as CIImage

        public open fun imageWithCGImage_options(image: Pointer<Any>, d: NSDictionary): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithCGImage:options:", image, d) as CIImage

        public open fun imageWithCGLayer(layer: Pointer<Any>): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithCGLayer:", layer) as CIImage

        public open fun imageWithCGLayer_options(layer: Pointer<Any>, d: NSDictionary): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithCGLayer:options:", layer, d) as CIImage

        public open fun imageWithBitmapData_bytesPerRow_size_format_colorSpace(d: NSData, bpr: Int, size: Any, f: Int, cs: Pointer<Any>): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithBitmapData:bytesPerRow:size:format:colorSpace:", d, bpr, size, f, cs) as CIImage

        public open fun imageWithTexture_size_flipped_colorSpace(name: Int, size: Any, flag: Boolean, cs: Pointer<Any>): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithTexture:size:flipped:colorSpace:", name, size, flag, cs) as CIImage

        public open fun imageWithTexture_size_flipped_options(name: Int, size: Any, flag: Boolean, options: NSDictionary): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithTexture:size:flipped:options:", name, size, flag, options) as CIImage

        public open fun imageWithContentsOfURL(url: NSURL): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithContentsOfURL:", url) as CIImage

        public open fun imageWithContentsOfURL_options(url: NSURL, d: NSDictionary): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithContentsOfURL:options:", url, d) as CIImage

        public open fun imageWithData(data: NSData): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithData:", data) as CIImage

        public open fun imageWithData_options(data: NSData, d: NSDictionary): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithData:options:", data, d) as CIImage

        public open fun imageWithCVImageBuffer(imageBuffer: Pointer<Any>): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithCVImageBuffer:", imageBuffer) as CIImage

        public open fun imageWithCVImageBuffer_options(imageBuffer: Pointer<Any>, dict: NSDictionary): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithCVImageBuffer:options:", imageBuffer, dict) as CIImage

        public open fun imageWithCVPixelBuffer(buffer: Pointer<Any>): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithCVPixelBuffer:", buffer) as CIImage

        public open fun imageWithCVPixelBuffer_options(buffer: Pointer<Any>, dict: NSDictionary): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithCVPixelBuffer:options:", buffer, dict) as CIImage

        public open fun imageWithIOSurface(surface: Pointer<Any>): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithIOSurface:", surface) as CIImage

        public open fun imageWithIOSurface_options(surface: Pointer<Any>, d: NSDictionary): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithIOSurface:options:", surface, d) as CIImage

        public open fun imageWithColor(color: CIColor): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "imageWithColor:", color) as CIImage

        public open fun emptyImage(): CIImage =
            Native.objc_msgSend("class objc.CIImage", this, "emptyImage") as CIImage

    }

    companion object : NSObject(Native.objc_getClass("CIImage")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait CIImage_AutoAdjustment : IObjCObject {
    public open fun autoAdjustmentFilters(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "autoAdjustmentFilters") as NSArray

    public open fun autoAdjustmentFiltersWithOptions(dict: NSDictionary): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "autoAdjustmentFiltersWithOptions:", dict) as NSArray

    trait metaclass : IObjCObject
}
