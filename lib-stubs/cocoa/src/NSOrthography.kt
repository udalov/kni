// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSOrthography.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSOrthography(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSOrthography_NSOrthographyExtended, NSOrthography_NSOrthographyCreation {
    public open fun dominantScript(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "dominantScript") as NSString

    public open fun languageMap(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "languageMap") as NSDictionary

    public open fun initWithDominantScript_languageMap(script: NSString, map: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDominantScript:languageMap:", script, map) as ObjCObject

    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSOrthography_NSOrthographyExtended.metaclass, NSOrthography_NSOrthographyCreation.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSOrthography")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSOrthography_NSOrthographyExtended : IObjCObject {
    public open fun languagesForScript(script: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "languagesForScript:", script) as NSArray

    public open fun dominantLanguageForScript(script: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "dominantLanguageForScript:", script) as NSString

    public open fun dominantLanguage(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "dominantLanguage") as NSString

    public open fun allScripts(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allScripts") as NSArray

    public open fun allLanguages(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allLanguages") as NSArray

    trait metaclass : IObjCObject
}

trait NSOrthography_NSOrthographyCreation : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun orthographyWithDominantScript_languageMap(script: NSString, map: NSDictionary): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "orthographyWithDominantScript:languageMap:", script, map) as ObjCObject
    }
}
