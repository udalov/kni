// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSImageRep.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSImageRep(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun draw(): Boolean =
        Native.objc_msgSend("boolean", this, "draw") as Boolean

    public open fun drawAtPoint(point: Any): Boolean =
        Native.objc_msgSend("boolean", this, "drawAtPoint:", point) as Boolean

    public open fun drawInRect(rect: Any): Boolean =
        Native.objc_msgSend("boolean", this, "drawInRect:", rect) as Boolean

    public open fun drawInRect_fromRect_operation_fraction_respectFlipped_hints(dstSpacePortionRect: Any, srcSpacePortionRect: Any, op: Any, requestedAlpha: Double, respectContextIsFlipped: Boolean, hints: NSDictionary): Boolean =
        Native.objc_msgSend("boolean", this, "drawInRect:fromRect:operation:fraction:respectFlipped:hints:", dstSpacePortionRect, srcSpacePortionRect, op, requestedAlpha, respectContextIsFlipped, hints) as Boolean

    public open fun size(): Any =
        Native.objc_msgSend("class objc.Any", this, "size")

    public open fun setSize(size: Any): Unit {
        Native.objc_msgSend("void", this, "setSize:", size)
    }

    public open fun hasAlpha(): Boolean =
        Native.objc_msgSend("boolean", this, "hasAlpha") as Boolean

    public open fun setAlpha(alpha: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAlpha:", alpha)
    }

    public open fun isOpaque(): Boolean =
        Native.objc_msgSend("boolean", this, "isOpaque") as Boolean

    public open fun setOpaque(opaque: Boolean): Unit {
        Native.objc_msgSend("void", this, "setOpaque:", opaque)
    }

    public open fun colorSpaceName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "colorSpaceName") as NSString

    public open fun setColorSpaceName(colorSpaceName: NSString): Unit {
        Native.objc_msgSend("void", this, "setColorSpaceName:", colorSpaceName)
    }

    public open fun bitsPerSample(): Int =
        Native.objc_msgSend("int", this, "bitsPerSample") as Int

    public open fun setBitsPerSample(bitsPerSample: Int): Unit {
        Native.objc_msgSend("void", this, "setBitsPerSample:", bitsPerSample)
    }

    public open fun pixelsWide(): Int =
        Native.objc_msgSend("int", this, "pixelsWide") as Int

    public open fun setPixelsWide(pixelsWide: Int): Unit {
        Native.objc_msgSend("void", this, "setPixelsWide:", pixelsWide)
    }

    public open fun pixelsHigh(): Int =
        Native.objc_msgSend("int", this, "pixelsHigh") as Int

    public open fun setPixelsHigh(pixelsHigh: Int): Unit {
        Native.objc_msgSend("void", this, "setPixelsHigh:", pixelsHigh)
    }

    public open fun CGImageForProposedRect_context_hints(proposedDestRect: Pointer<Any>, context: NSGraphicsContext, hints: NSDictionary): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGImageForProposedRect:context:hints:", proposedDestRect, context, hints) as Pointer<Any>

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
        public open fun registerImageRepClass(imageRepClass: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "registerImageRepClass:", imageRepClass)
        }

        public open fun unregisterImageRepClass(imageRepClass: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "unregisterImageRepClass:", imageRepClass)
        }

        public open fun registeredImageRepClasses(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "registeredImageRepClasses") as NSArray

        public open fun imageRepClassForFileType(type: NSString): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "imageRepClassForFileType:", type) as ObjCClass

        public open fun imageRepClassForPasteboardType(type: NSString): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "imageRepClassForPasteboardType:", type) as ObjCClass

        public open fun imageRepClassForType(type: NSString): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "imageRepClassForType:", type) as ObjCClass

        public open fun imageRepClassForData(data: NSData): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "imageRepClassForData:", data) as ObjCClass

        public open fun canInitWithData(data: NSData): Boolean =
            Native.objc_msgSend("boolean", this, "canInitWithData:", data) as Boolean

        public open fun imageUnfilteredFileTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageUnfilteredFileTypes") as NSArray

        public open fun imageUnfilteredPasteboardTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageUnfilteredPasteboardTypes") as NSArray

        public open fun imageFileTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageFileTypes") as NSArray

        public open fun imagePasteboardTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imagePasteboardTypes") as NSArray

        public open fun imageUnfilteredTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageUnfilteredTypes") as NSArray

        public open fun imageTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageTypes") as NSArray

        public open fun canInitWithPasteboard(pasteboard: NSPasteboard): Boolean =
            Native.objc_msgSend("boolean", this, "canInitWithPasteboard:", pasteboard) as Boolean

        public open fun imageRepsWithContentsOfFile(filename: NSString): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageRepsWithContentsOfFile:", filename) as NSArray

        public open fun imageRepWithContentsOfFile(filename: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "imageRepWithContentsOfFile:", filename) as ObjCObject

        public open fun imageRepsWithContentsOfURL(url: NSURL): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageRepsWithContentsOfURL:", url) as NSArray

        public open fun imageRepWithContentsOfURL(url: NSURL): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "imageRepWithContentsOfURL:", url) as ObjCObject

        public open fun imageRepsWithPasteboard(pasteboard: NSPasteboard): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageRepsWithPasteboard:", pasteboard) as NSArray

        public open fun imageRepWithPasteboard(pasteboard: NSPasteboard): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "imageRepWithPasteboard:", pasteboard) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSImageRep")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
