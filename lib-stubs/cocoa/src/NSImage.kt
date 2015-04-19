// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSImage.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSImageDelegate {
    trait metaclass
}

public open class NSImage(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSSecureCoding, NSPasteboardReading, NSPasteboardWriting, NSImage_NSDeprecated {
    public open fun initWithSize(aSize: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSize:", aSize) as ObjCObject

    public open fun initWithData(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", data) as ObjCObject

    public open fun initWithContentsOfFile(fileName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfFile:", fileName) as ObjCObject

    public open fun initWithContentsOfURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:", url) as ObjCObject

    public open fun initByReferencingFile(fileName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initByReferencingFile:", fileName) as ObjCObject

    public open fun initByReferencingURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initByReferencingURL:", url) as ObjCObject

    public open fun initWithIconRef(iconRef: Pointer<Any>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIconRef:", iconRef) as ObjCObject

    public open fun initWithPasteboard(pasteboard: NSPasteboard): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPasteboard:", pasteboard) as ObjCObject

    public open fun initWithDataIgnoringOrientation(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDataIgnoringOrientation:", data) as ObjCObject

    public open fun size(): Any =
        Native.objc_msgSend("class objc.Any", this, "size")

    public open fun setSize(size: Any): Unit {
        Native.objc_msgSend("void", this, "setSize:", size)
    }

    public open fun setName(string: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setName:", string) as Boolean

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun usesEPSOnResolutionMismatch(): Boolean =
        Native.objc_msgSend("boolean", this, "usesEPSOnResolutionMismatch") as Boolean

    public open fun setUsesEPSOnResolutionMismatch(usesEPSOnResolutionMismatch: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesEPSOnResolutionMismatch:", usesEPSOnResolutionMismatch)
    }

    public open fun prefersColorMatch(): Boolean =
        Native.objc_msgSend("boolean", this, "prefersColorMatch") as Boolean

    public open fun setPrefersColorMatch(prefersColorMatch: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPrefersColorMatch:", prefersColorMatch)
    }

    public open fun matchesOnMultipleResolution(): Boolean =
        Native.objc_msgSend("boolean", this, "matchesOnMultipleResolution") as Boolean

    public open fun setMatchesOnMultipleResolution(matchesOnMultipleResolution: Boolean): Unit {
        Native.objc_msgSend("void", this, "setMatchesOnMultipleResolution:", matchesOnMultipleResolution)
    }

    public open fun matchesOnlyOnBestFittingAxis(): Boolean =
        Native.objc_msgSend("boolean", this, "matchesOnlyOnBestFittingAxis") as Boolean

    public open fun setMatchesOnlyOnBestFittingAxis(matchesOnlyOnBestFittingAxis: Boolean): Unit {
        Native.objc_msgSend("void", this, "setMatchesOnlyOnBestFittingAxis:", matchesOnlyOnBestFittingAxis)
    }

    public open fun drawAtPoint_fromRect_operation_fraction(point: Any, fromRect: Any, op: Any, delta: Double): Unit {
        Native.objc_msgSend("void", this, "drawAtPoint:fromRect:operation:fraction:", point, fromRect, op, delta)
    }

    public open fun drawInRect_fromRect_operation_fraction(rect: Any, fromRect: Any, op: Any, delta: Double): Unit {
        Native.objc_msgSend("void", this, "drawInRect:fromRect:operation:fraction:", rect, fromRect, op, delta)
    }

    public open fun drawInRect_fromRect_operation_fraction_respectFlipped_hints(dstSpacePortionRect: Any, srcSpacePortionRect: Any, op: Any, requestedAlpha: Double, respectContextIsFlipped: Boolean, hints: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "drawInRect:fromRect:operation:fraction:respectFlipped:hints:", dstSpacePortionRect, srcSpacePortionRect, op, requestedAlpha, respectContextIsFlipped, hints)
    }

    public open fun drawRepresentation_inRect(imageRep: NSImageRep, rect: Any): Boolean =
        Native.objc_msgSend("boolean", this, "drawRepresentation:inRect:", imageRep, rect) as Boolean

    public open fun drawInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "drawInRect:", rect)
    }

    public open fun recache(): Unit {
        Native.objc_msgSend("void", this, "recache")
    }

    public open fun TIFFRepresentation(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "TIFFRepresentation") as NSData

    public open fun TIFFRepresentationUsingCompression_factor(comp: Any, aFloat: Float): NSData =
        Native.objc_msgSend("class objc.NSData", this, "TIFFRepresentationUsingCompression:factor:", comp, aFloat) as NSData

    public open fun representations(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "representations") as NSArray

    public open fun addRepresentations(imageReps: NSArray): Unit {
        Native.objc_msgSend("void", this, "addRepresentations:", imageReps)
    }

    public open fun addRepresentation(imageRep: NSImageRep): Unit {
        Native.objc_msgSend("void", this, "addRepresentation:", imageRep)
    }

    public open fun removeRepresentation(imageRep: NSImageRep): Unit {
        Native.objc_msgSend("void", this, "removeRepresentation:", imageRep)
    }

    public open fun isValid(): Boolean =
        Native.objc_msgSend("boolean", this, "isValid") as Boolean

    public open fun lockFocus(): Unit {
        Native.objc_msgSend("void", this, "lockFocus")
    }

    public open fun lockFocusFlipped(flipped: Boolean): Unit {
        Native.objc_msgSend("void", this, "lockFocusFlipped:", flipped)
    }

    public open fun unlockFocus(): Unit {
        Native.objc_msgSend("void", this, "unlockFocus")
    }

    public open fun bestRepresentationForDevice(deviceDescription: NSDictionary): NSImageRep =
        Native.objc_msgSend("class objc.NSImageRep", this, "bestRepresentationForDevice:", deviceDescription) as NSImageRep

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun cancelIncrementalLoad(): Unit {
        Native.objc_msgSend("void", this, "cancelIncrementalLoad")
    }

    public open fun cacheMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "cacheMode")

    public open fun setCacheMode(cacheMode: Any): Unit {
        Native.objc_msgSend("void", this, "setCacheMode:", cacheMode)
    }

    public open fun alignmentRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "alignmentRect")

    public open fun setAlignmentRect(alignmentRect: Any): Unit {
        Native.objc_msgSend("void", this, "setAlignmentRect:", alignmentRect)
    }

    public open fun isTemplate(): Boolean =
        Native.objc_msgSend("boolean", this, "isTemplate") as Boolean

    public open fun setTemplate(isTemplate: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTemplate:", isTemplate)
    }

    public open fun accessibilityDescription(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "accessibilityDescription") as NSString

    public open fun setAccessibilityDescription(accessibilityDescription: NSString): Unit {
        Native.objc_msgSend("void", this, "setAccessibilityDescription:", accessibilityDescription)
    }

    public open fun initWithCGImage_size(cgImage: Pointer<Any>, size: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCGImage:size:", cgImage, size) as ObjCObject

    public open fun CGImageForProposedRect_context_hints(proposedDestRect: Pointer<Any>, referenceContext: NSGraphicsContext, hints: NSDictionary): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGImageForProposedRect:context:hints:", proposedDestRect, referenceContext, hints) as Pointer<Any>

    public open fun bestRepresentationForRect_context_hints(rect: Any, referenceContext: NSGraphicsContext, hints: NSDictionary): NSImageRep =
        Native.objc_msgSend("class objc.NSImageRep", this, "bestRepresentationForRect:context:hints:", rect, referenceContext, hints) as NSImageRep

    public open fun hitTestRect_withImageDestinationRect_context_hints_flipped(testRectDestSpace: Any, imageRectDestSpace: Any, context: NSGraphicsContext, hints: NSDictionary, flipped: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "hitTestRect:withImageDestinationRect:context:hints:flipped:", testRectDestSpace, imageRectDestSpace, context, hints, flipped) as Boolean

    public open fun recommendedLayerContentsScale(preferredContentsScale: Double): Double =
        Native.objc_msgSend("double", this, "recommendedLayerContentsScale:", preferredContentsScale) as Double

    public open fun layerContentsForContentsScale(layerContentsScale: Double): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "layerContentsForContentsScale:", layerContentsScale) as ObjCObject

    public open fun capInsets(): Any =
        Native.objc_msgSend("class objc.Any", this, "capInsets")

    public open fun setCapInsets(capInsets: Any): Unit {
        Native.objc_msgSend("void", this, "setCapInsets:", capInsets)
    }

    public open fun resizingMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "resizingMode")

    public open fun setResizingMode(resizingMode: Any): Unit {
        Native.objc_msgSend("void", this, "setResizingMode:", resizingMode)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSSecureCoding.metaclass, NSPasteboardReading.metaclass, NSPasteboardWriting.metaclass, NSImage_NSDeprecated.metaclass {
        public open fun imageNamed(name: NSString): NSImage =
            Native.objc_msgSend("class objc.NSImage", this, "imageNamed:", name) as NSImage

        public open fun imageWithSize_flipped_drawingHandler(size: Any, drawingHandlerShouldBeCalledWithFlippedContext: Boolean, drawingHandler: Any): NSImage =
            Native.objc_msgSend("class objc.NSImage", this, "imageWithSize:flipped:drawingHandler:", size, drawingHandlerShouldBeCalledWithFlippedContext, drawingHandler) as NSImage

        public open fun imageUnfilteredFileTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageUnfilteredFileTypes") as NSArray

        public open fun imageUnfilteredPasteboardTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageUnfilteredPasteboardTypes") as NSArray

        public open fun imageFileTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageFileTypes") as NSArray

        public open fun imagePasteboardTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imagePasteboardTypes") as NSArray

        public open fun imageTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageTypes") as NSArray

        public open fun imageUnfilteredTypes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "imageUnfilteredTypes") as NSArray

        public open fun canInitWithPasteboard(pasteboard: NSPasteboard): Boolean =
            Native.objc_msgSend("boolean", this, "canInitWithPasteboard:", pasteboard) as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSImage")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSBundle_NSBundleImageExtension : IObjCObject {
    public open fun imageForResource(name: NSString): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "imageForResource:", name) as NSImage

    public open fun pathForImageResource(name: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathForImageResource:", name) as NSString

    public open fun URLForImageResource(name: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForImageResource:", name) as NSURL

    trait metaclass : IObjCObject
}

trait NSImage_NSDeprecated : IObjCObject {
    public open fun setFlipped(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFlipped:", flag)
    }

    public open fun isFlipped(): Boolean =
        Native.objc_msgSend("boolean", this, "isFlipped") as Boolean

    public open fun dissolveToPoint_fraction(point: Any, aFloat: Double): Unit {
        Native.objc_msgSend("void", this, "dissolveToPoint:fraction:", point, aFloat)
    }

    public open fun dissolveToPoint_fromRect_fraction(point: Any, rect: Any, aFloat: Double): Unit {
        Native.objc_msgSend("void", this, "dissolveToPoint:fromRect:fraction:", point, rect, aFloat)
    }

    public open fun compositeToPoint_operation(point: Any, op: Any): Unit {
        Native.objc_msgSend("void", this, "compositeToPoint:operation:", point, op)
    }

    public open fun compositeToPoint_fromRect_operation(point: Any, rect: Any, op: Any): Unit {
        Native.objc_msgSend("void", this, "compositeToPoint:fromRect:operation:", point, rect, op)
    }

    public open fun compositeToPoint_operation_fraction(point: Any, op: Any, delta: Double): Unit {
        Native.objc_msgSend("void", this, "compositeToPoint:operation:fraction:", point, op, delta)
    }

    public open fun compositeToPoint_fromRect_operation_fraction(point: Any, rect: Any, op: Any, delta: Double): Unit {
        Native.objc_msgSend("void", this, "compositeToPoint:fromRect:operation:fraction:", point, rect, op, delta)
    }

    public open fun lockFocusOnRepresentation(imageRepresentation: NSImageRep): Unit {
        Native.objc_msgSend("void", this, "lockFocusOnRepresentation:", imageRepresentation)
    }

    public open fun setScalesWhenResized(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setScalesWhenResized:", flag)
    }

    public open fun scalesWhenResized(): Boolean =
        Native.objc_msgSend("boolean", this, "scalesWhenResized") as Boolean

    public open fun setDataRetained(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDataRetained:", flag)
    }

    public open fun isDataRetained(): Boolean =
        Native.objc_msgSend("boolean", this, "isDataRetained") as Boolean

    public open fun setCachedSeparately(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCachedSeparately:", flag)
    }

    public open fun isCachedSeparately(): Boolean =
        Native.objc_msgSend("boolean", this, "isCachedSeparately") as Boolean

    public open fun setCacheDepthMatchesImageDepth(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCacheDepthMatchesImageDepth:", flag)
    }

    public open fun cacheDepthMatchesImageDepth(): Boolean =
        Native.objc_msgSend("boolean", this, "cacheDepthMatchesImageDepth") as Boolean

    trait metaclass : IObjCObject
}
