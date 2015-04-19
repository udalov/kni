// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSBitmapImageRep.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSBitmapImageRep(pointer: Long) : NSImageRep(pointer), NSSecureCoding, NSBitmapImageRep_NSBitmapImageFileTypeExtensions {
    public open fun initWithFocusedViewRect(rect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFocusedViewRect:", rect) as ObjCObject

    public open fun initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bytesPerRow_bitsPerPixel(planes: Pointer<Pointer<Byte>>, width: Int, height: Int, bps: Int, spp: Int, alpha: Boolean, isPlanar: Boolean, colorSpaceName: NSString, rBytes: Int, pBits: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bytesPerRow:bitsPerPixel:", planes, width, height, bps, spp, alpha, isPlanar, colorSpaceName, rBytes, pBits) as ObjCObject

    public open fun initWithBitmapDataPlanes_pixelsWide_pixelsHigh_bitsPerSample_samplesPerPixel_hasAlpha_isPlanar_colorSpaceName_bitmapFormat_bytesPerRow_bitsPerPixel(planes: Pointer<Pointer<Byte>>, width: Int, height: Int, bps: Int, spp: Int, alpha: Boolean, isPlanar: Boolean, colorSpaceName: NSString, bitmapFormat: Any, rBytes: Int, pBits: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bitmapFormat:bytesPerRow:bitsPerPixel:", planes, width, height, bps, spp, alpha, isPlanar, colorSpaceName, bitmapFormat, rBytes, pBits) as ObjCObject

    public open fun initWithCGImage(cgImage: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGImage:", cgImage) as ObjCObject

    public open fun initWithCIImage(ciImage: CIImage): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCIImage:", ciImage) as ObjCObject

    public open fun initWithData(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", data) as ObjCObject

    public open fun bitmapData(): Pointer<Byte> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "bitmapData") as Pointer<Byte>

    public open fun getBitmapDataPlanes(data: Pointer<Pointer<Byte>>): Unit {
        Native.objc_msgSend("void", this, "getBitmapDataPlanes:", data)
    }

    public open fun isPlanar(): Boolean =
        Native.objc_msgSend("boolean", this, "isPlanar") as Boolean

    public open fun samplesPerPixel(): Int =
        Native.objc_msgSend("int", this, "samplesPerPixel") as Int

    public open fun bitsPerPixel(): Int =
        Native.objc_msgSend("int", this, "bitsPerPixel") as Int

    public open fun bytesPerRow(): Int =
        Native.objc_msgSend("int", this, "bytesPerRow") as Int

    public open fun bytesPerPlane(): Int =
        Native.objc_msgSend("int", this, "bytesPerPlane") as Int

    public open fun numberOfPlanes(): Int =
        Native.objc_msgSend("int", this, "numberOfPlanes") as Int

    public open fun bitmapFormat(): Any =
        Native.objc_msgSend("class objc.Any", this, "bitmapFormat")

    public open fun getCompression_factor(compression: Pointer<Any>, factor: Pointer<Float>): Unit {
        Native.objc_msgSend("void", this, "getCompression:factor:", compression, factor)
    }

    public open fun setCompression_factor(compression: Any, factor: Float): Unit {
        Native.objc_msgSend("void", this, "setCompression:factor:", compression, factor)
    }

    public open fun TIFFRepresentation(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "TIFFRepresentation") as NSData

    public open fun TIFFRepresentationUsingCompression_factor(comp: Any, factor: Float): NSData =
        Native.objc_msgSend("class objc.NSData", this, "TIFFRepresentationUsingCompression:factor:", comp, factor) as NSData

    public open fun canBeCompressedUsing(compression: Any): Boolean =
        Native.objc_msgSend("boolean", this, "canBeCompressedUsing:", compression) as Boolean

    public open fun colorizeByMappingGray_toColor_blackMapping_whiteMapping(midPoint: Double, midPointColor: NSColor, shadowColor: NSColor, lightColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "colorizeByMappingGray:toColor:blackMapping:whiteMapping:", midPoint, midPointColor, shadowColor, lightColor)
    }

    public open fun initForIncrementalLoad(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initForIncrementalLoad") as ObjCObject

    public open fun incrementalLoadFromData_complete(data: NSData, complete: Boolean): Int =
        Native.objc_msgSend("int", this, "incrementalLoadFromData:complete:", data, complete) as Int

    public open fun setColor_atX_y(color: NSColor, x: Int, y: Int): Unit {
        Native.objc_msgSend("void", this, "setColor:atX:y:", color, x, y)
    }

    public open fun colorAtX_y(x: Int, y: Int): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "colorAtX:y:", x, y) as NSColor

    public open fun getPixel_atX_y(p: Any, x: Int, y: Int): Unit {
        Native.objc_msgSend("void", this, "getPixel:atX:y:", p, x, y)
    }

    public open fun setPixel_atX_y(p: Any, x: Int, y: Int): Unit {
        Native.objc_msgSend("void", this, "setPixel:atX:y:", p, x, y)
    }

    public open fun CGImage(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGImage") as Pointer<Any>

    public open fun colorSpace(): NSColorSpace =
        Native.objc_msgSend("class objc.NSColorSpace", this, "colorSpace") as NSColorSpace

    public open fun bitmapImageRepByConvertingToColorSpace_renderingIntent(targetSpace: NSColorSpace, renderingIntent: Any): NSBitmapImageRep =
        Native.objc_msgSend("class objc.NSBitmapImageRep", this, "bitmapImageRepByConvertingToColorSpace:renderingIntent:", targetSpace, renderingIntent) as NSBitmapImageRep

    public open fun bitmapImageRepByRetaggingWithColorSpace(newSpace: NSColorSpace): NSBitmapImageRep =
        Native.objc_msgSend("class objc.NSBitmapImageRep", this, "bitmapImageRepByRetaggingWithColorSpace:", newSpace) as NSBitmapImageRep

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSImageRep.metaclass, NSSecureCoding.metaclass, NSBitmapImageRep_NSBitmapImageFileTypeExtensions.metaclass {
        public open fun imageRepsWithData(data: NSData): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageRepsWithData:", data) as NSArray

        public open fun imageRepWithData(data: NSData): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "imageRepWithData:", data) as ObjCObject

        public open fun TIFFRepresentationOfImageRepsInArray(array: NSArray): NSData =
            Native.objc_msgSend("class objc.NSData", this, "TIFFRepresentationOfImageRepsInArray:", array) as NSData

        public open fun TIFFRepresentationOfImageRepsInArray_usingCompression_factor(array: NSArray, comp: Any, factor: Float): NSData =
            Native.objc_msgSend("class objc.NSData", this, "TIFFRepresentationOfImageRepsInArray:usingCompression:factor:", array, comp, factor) as NSData

        public open fun getTIFFCompressionTypes_count(list: Pointer<Pointer<Any>>, numTypes: Pointer<Int>): Unit {
            Native.objc_msgSend("void", this, "getTIFFCompressionTypes:count:", list, numTypes)
        }

        public open fun localizedNameForTIFFCompressionType(compression: Any): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localizedNameForTIFFCompressionType:", compression) as NSString

    }

    companion object : NSObject(Native.objc_getClass("NSBitmapImageRep")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSBitmapImageRep_NSBitmapImageFileTypeExtensions : IObjCObject {
    public open fun representationUsingType_properties(storageType: Any, properties: NSDictionary): NSData =
        Native.objc_msgSend("class objc.NSData", this, "representationUsingType:properties:", storageType, properties) as NSData

    public open fun setProperty_withValue(property: NSString, value: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setProperty:withValue:", property, value)
    }

    public open fun valueForProperty(property: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueForProperty:", property) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun representationOfImageRepsInArray_usingType_properties(imageReps: NSArray, storageType: Any, properties: NSDictionary): NSData =
            Native.objc_msgSend("class objc.NSData", this, "representationOfImageRepsInArray:usingType:properties:", imageReps, storageType, properties) as NSData
    }
}
