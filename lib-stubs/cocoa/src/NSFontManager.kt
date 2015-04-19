// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSFontManager.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFontManager(pointer: Long) : NSObject(pointer), NSFontManager_NSFontManagerMenuActionMethods {
    public open fun isMultiple(): Boolean =
        Native.objc_msgSend("boolean", this, "isMultiple") as Boolean

    public open fun selectedFont(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "selectedFont") as NSFont

    public open fun setSelectedFont_isMultiple(fontObj: NSFont, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectedFont:isMultiple:", fontObj, flag)
    }

    public open fun setFontMenu(newMenu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setFontMenu:", newMenu)
    }

    public open fun fontMenu(create: Boolean): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "fontMenu:", create) as NSMenu

    public open fun fontPanel(create: Boolean): NSFontPanel =
        Native.objc_msgSend("class objc.NSFontPanel", this, "fontPanel:", create) as NSFontPanel

    public open fun fontWithFamily_traits_weight_size(family: NSString, traits: Any, weight: Int, size: Double): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "fontWithFamily:traits:weight:size:", family, traits, weight, size) as NSFont

    public open fun traitsOfFont(fontObj: NSFont): Any =
        Native.objc_msgSend("class objc.Any", this, "traitsOfFont:", fontObj)

    public open fun weightOfFont(fontObj: NSFont): Int =
        Native.objc_msgSend("int", this, "weightOfFont:", fontObj) as Int

    public open fun availableFonts(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "availableFonts") as NSArray

    public open fun availableFontFamilies(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "availableFontFamilies") as NSArray

    public open fun availableMembersOfFontFamily(fam: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "availableMembersOfFontFamily:", fam) as NSArray

    public open fun convertFont(fontObj: NSFont): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "convertFont:", fontObj) as NSFont

    public open fun convertFont_toSize(fontObj: NSFont, size: Double): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "convertFont:toSize:", fontObj, size) as NSFont

    public open fun convertFont_toFace(fontObj: NSFont, typeface: NSString): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "convertFont:toFace:", fontObj, typeface) as NSFont

    public open fun convertFont_toFamily(fontObj: NSFont, family: NSString): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "convertFont:toFamily:", fontObj, family) as NSFont

    public open fun convertFont_toHaveTrait(fontObj: NSFont, `trait`: Any): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "convertFont:toHaveTrait:", fontObj, `trait`) as NSFont

    public open fun convertFont_toNotHaveTrait(fontObj: NSFont, `trait`: Any): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "convertFont:toNotHaveTrait:", fontObj, `trait`) as NSFont

    public open fun convertWeight_ofFont(upFlag: Boolean, fontObj: NSFont): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "convertWeight:ofFont:", upFlag, fontObj) as NSFont

    public open fun isEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabled") as Boolean

    public open fun setEnabled(enabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEnabled:", enabled)
    }

    public open fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    public open fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    public open fun sendAction(): Boolean =
        Native.objc_msgSend("boolean", this, "sendAction") as Boolean

    public open fun delegate(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "delegate") as ObjCObject

    public open fun setDelegate(delegate: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun localizedNameForFamily_face(family: NSString, faceKey: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedNameForFamily:face:", family, faceKey) as NSString

    public open fun setSelectedAttributes_isMultiple(attributes: NSDictionary, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectedAttributes:isMultiple:", attributes, flag)
    }

    public open fun convertAttributes(attributes: NSDictionary): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "convertAttributes:", attributes) as NSDictionary

    public open fun availableFontNamesMatchingFontDescriptor(descriptor: NSFontDescriptor): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "availableFontNamesMatchingFontDescriptor:", descriptor) as NSArray

    public open fun collectionNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "collectionNames") as NSArray

    public open fun fontDescriptorsInCollection(collectionNames: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "fontDescriptorsInCollection:", collectionNames) as NSArray

    public open fun addCollection_options(collectionName: NSString, collectionOptions: Any): Boolean =
        Native.objc_msgSend("boolean", this, "addCollection:options:", collectionName, collectionOptions) as Boolean

    public open fun removeCollection(collectionName: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "removeCollection:", collectionName) as Boolean

    public open fun addFontDescriptors_toCollection(descriptors: NSArray, collectionName: NSString): Unit {
        Native.objc_msgSend("void", this, "addFontDescriptors:toCollection:", descriptors, collectionName)
    }

    public open fun removeFontDescriptor_fromCollection(descriptor: NSFontDescriptor, collection: NSString): Unit {
        Native.objc_msgSend("void", this, "removeFontDescriptor:fromCollection:", descriptor, collection)
    }

    public open fun currentFontAction(): Any =
        Native.objc_msgSend("class objc.Any", this, "currentFontAction")

    public open fun convertFontTraits(traits: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertFontTraits:", traits)

    public open fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    public open fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSFontManager_NSFontManagerMenuActionMethods.metaclass {
        public open fun setFontPanelFactory(factoryId: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "setFontPanelFactory:", factoryId)
        }

        public open fun setFontManagerFactory(factoryId: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "setFontManagerFactory:", factoryId)
        }

        public open fun sharedFontManager(): NSFontManager =
            Native.objc_msgSend("class objc.NSFontManager", this, "sharedFontManager") as NSFontManager

    }

    companion object : NSObject(Native.objc_getClass("NSFontManager")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSFontManager_NSFontManagerMenuActionMethods : IObjCObject {
    public open fun fontNamed_hasTraits(fName: NSString, someTraits: Any): Boolean =
        Native.objc_msgSend("boolean", this, "fontNamed:hasTraits:", fName, someTraits) as Boolean

    public open fun availableFontNamesWithTraits(someTraits: Any): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "availableFontNamesWithTraits:", someTraits) as NSArray

    public open fun addFontTrait(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "addFontTrait:", sender)
    }

    public open fun removeFontTrait(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "removeFontTrait:", sender)
    }

    public open fun modifyFontViaPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "modifyFontViaPanel:", sender)
    }

    public open fun modifyFont(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "modifyFont:", sender)
    }

    public open fun orderFrontFontPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontFontPanel:", sender)
    }

    public open fun orderFrontStylesPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontStylesPanel:", sender)
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSFontManagerDelegate : IObjCObject {
    public open fun fontManager_willIncludeFont(sender: ObjCObject, fontName: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "fontManager:willIncludeFont:", sender, fontName) as Boolean

    trait metaclass : IObjCObject
}

trait NSObject_NSFontManagerResponderMethod : IObjCObject {
    public open fun changeFont(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "changeFont:", sender)
    }

    trait metaclass : IObjCObject
}
