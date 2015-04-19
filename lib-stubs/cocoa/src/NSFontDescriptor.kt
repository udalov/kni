// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSFontDescriptor.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFontDescriptor(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding {
    public open fun postscriptName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "postscriptName") as NSString

    public open fun pointSize(): Double =
        Native.objc_msgSend("double", this, "pointSize") as Double

    public open fun matrix(): NSAffineTransform =
        Native.objc_msgSend("class objc.NSAffineTransform", this, "matrix") as NSAffineTransform

    public open fun symbolicTraits(): Int =
        Native.objc_msgSend("int", this, "symbolicTraits") as Int

    public open fun objectForKey(anAttribute: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForKey:", anAttribute) as ObjCObject

    public open fun fontAttributes(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "fontAttributes") as NSDictionary

    public open fun initWithFontAttributes(attributes: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFontAttributes:", attributes) as ObjCObject

    public open fun matchingFontDescriptorsWithMandatoryKeys(mandatoryKeys: NSSet): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "matchingFontDescriptorsWithMandatoryKeys:", mandatoryKeys) as NSArray

    public open fun matchingFontDescriptorWithMandatoryKeys(mandatoryKeys: NSSet): NSFontDescriptor =
        Native.objc_msgSend("class objc.NSFontDescriptor", this, "matchingFontDescriptorWithMandatoryKeys:", mandatoryKeys) as NSFontDescriptor

    public open fun fontDescriptorByAddingAttributes(attributes: NSDictionary): NSFontDescriptor =
        Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptorByAddingAttributes:", attributes) as NSFontDescriptor

    public open fun fontDescriptorWithSymbolicTraits(symbolicTraits: Int): NSFontDescriptor =
        Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptorWithSymbolicTraits:", symbolicTraits) as NSFontDescriptor

    public open fun fontDescriptorWithSize(newPointSize: Double): NSFontDescriptor =
        Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptorWithSize:", newPointSize) as NSFontDescriptor

    public open fun fontDescriptorWithMatrix(matrix: NSAffineTransform): NSFontDescriptor =
        Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptorWithMatrix:", matrix) as NSFontDescriptor

    public open fun fontDescriptorWithFace(newFace: NSString): NSFontDescriptor =
        Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptorWithFace:", newFace) as NSFontDescriptor

    public open fun fontDescriptorWithFamily(newFamily: NSString): NSFontDescriptor =
        Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptorWithFamily:", newFamily) as NSFontDescriptor

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass {
        public open fun fontDescriptorWithFontAttributes(attributes: NSDictionary): NSFontDescriptor =
            Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptorWithFontAttributes:", attributes) as NSFontDescriptor

        public open fun fontDescriptorWithName_size(fontName: NSString, size: Double): NSFontDescriptor =
            Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptorWithName:size:", fontName, size) as NSFontDescriptor

        public open fun fontDescriptorWithName_matrix(fontName: NSString, matrix: NSAffineTransform): NSFontDescriptor =
            Native.objc_msgSend("class objc.NSFontDescriptor", this, "fontDescriptorWithName:matrix:", fontName, matrix) as NSFontDescriptor

    }

    companion object : NSObject(Native.objc_getClass("NSFontDescriptor")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
