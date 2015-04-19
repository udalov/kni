// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptClassDescription.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScriptClassDescription(pointer: Long) : NSClassDescription(pointer), NSScriptClassDescription_NSDeprecated {
    public open fun initWithSuiteName_className_dictionary(suiteName: NSString, className: NSString, classDeclaration: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSuiteName:className:dictionary:", suiteName, className, classDeclaration) as ObjCObject

    public open fun suiteName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "suiteName") as NSString

    override fun className(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "className") as NSString

    public open fun implementationClassName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "implementationClassName") as NSString

    public open fun superclassDescription(): NSScriptClassDescription =
        Native.objc_msgSend("class objc.NSScriptClassDescription", this, "superclassDescription") as NSScriptClassDescription

    public open fun appleEventCode(): Int =
        Native.objc_msgSend("int", this, "appleEventCode") as Int

    public open fun matchesAppleEventCode(appleEventCode: Int): Boolean =
        Native.objc_msgSend("boolean", this, "matchesAppleEventCode:", appleEventCode) as Boolean

    public open fun supportsCommand(commandDescription: NSScriptCommandDescription): Boolean =
        Native.objc_msgSend("boolean", this, "supportsCommand:", commandDescription) as Boolean

    public open fun selectorForCommand(commandDescription: NSScriptCommandDescription): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "selectorForCommand:", commandDescription) as ObjCSelector

    public open fun typeForKey(key: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "typeForKey:", key) as NSString

    public open fun classDescriptionForKey(key: NSString): NSScriptClassDescription =
        Native.objc_msgSend("class objc.NSScriptClassDescription", this, "classDescriptionForKey:", key) as NSScriptClassDescription

    public open fun appleEventCodeForKey(key: NSString): Int =
        Native.objc_msgSend("int", this, "appleEventCodeForKey:", key) as Int

    public open fun keyWithAppleEventCode(appleEventCode: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "keyWithAppleEventCode:", appleEventCode) as NSString

    public open fun defaultSubcontainerAttributeKey(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "defaultSubcontainerAttributeKey") as NSString

    public open fun isLocationRequiredToCreateForKey(toManyRelationshipKey: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isLocationRequiredToCreateForKey:", toManyRelationshipKey) as Boolean

    public open fun hasPropertyForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "hasPropertyForKey:", key) as Boolean

    public open fun hasOrderedToManyRelationshipForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "hasOrderedToManyRelationshipForKey:", key) as Boolean

    public open fun hasReadablePropertyForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "hasReadablePropertyForKey:", key) as Boolean

    public open fun hasWritablePropertyForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "hasWritablePropertyForKey:", key) as Boolean

    override fun attributeKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "attributeKeys") as NSArray

    override fun inverseForRelationshipKey(relationshipKey: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "inverseForRelationshipKey:", relationshipKey) as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun toManyRelationshipKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "toManyRelationshipKeys") as NSArray

    override fun toOneRelationshipKeys(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "toOneRelationshipKeys") as NSArray

    trait metaclass : NSClassDescription.metaclass, NSScriptClassDescription_NSDeprecated.metaclass {
        override fun classDescriptionForClass(aClass: ObjCClass): NSScriptClassDescription =
            Native.objc_msgSend("class objc.NSScriptClassDescription", this, "classDescriptionForClass:", aClass) as NSScriptClassDescription

    }

    companion object : NSObject(Native.objc_getClass("NSScriptClassDescription")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSScriptClassDescription_NSDeprecated : IObjCObject {
    public open fun isReadOnlyKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isReadOnlyKey:", key) as Boolean

    trait metaclass : IObjCObject
}

trait NSObject_NSScriptClassDescription : IObjCObject {
    public open fun classCode(): Int =
        Native.objc_msgSend("int", this, "classCode") as Int

    public open fun className(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "className") as NSString

    trait metaclass : IObjCObject
}
