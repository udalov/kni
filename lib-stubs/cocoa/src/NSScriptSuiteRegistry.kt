// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptSuiteRegistry.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScriptSuiteRegistry(pointer: Long) : NSObject(pointer) {
    public open fun loadSuitesFromBundle(bundle: NSBundle): Unit {
        Native.objc_msgSend("void", this, "loadSuitesFromBundle:", bundle)
    }

    public open fun loadSuiteWithDictionary_fromBundle(suiteDeclaration: NSDictionary, bundle: NSBundle): Unit {
        Native.objc_msgSend("void", this, "loadSuiteWithDictionary:fromBundle:", suiteDeclaration, bundle)
    }

    public open fun registerClassDescription(classDescription: NSScriptClassDescription): Unit {
        Native.objc_msgSend("void", this, "registerClassDescription:", classDescription)
    }

    public open fun registerCommandDescription(commandDescription: NSScriptCommandDescription): Unit {
        Native.objc_msgSend("void", this, "registerCommandDescription:", commandDescription)
    }

    public open fun suiteNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "suiteNames") as NSArray

    public open fun appleEventCodeForSuite(suiteName: NSString): Int =
        Native.objc_msgSend("int", this, "appleEventCodeForSuite:", suiteName) as Int

    public open fun bundleForSuite(suiteName: NSString): NSBundle =
        Native.objc_msgSend("class objc.NSBundle", this, "bundleForSuite:", suiteName) as NSBundle

    public open fun classDescriptionsInSuite(suiteName: NSString): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "classDescriptionsInSuite:", suiteName) as NSDictionary

    public open fun commandDescriptionsInSuite(suiteName: NSString): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "commandDescriptionsInSuite:", suiteName) as NSDictionary

    public open fun suiteForAppleEventCode(appleEventCode: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "suiteForAppleEventCode:", appleEventCode) as NSString

    public open fun classDescriptionWithAppleEventCode(appleEventCode: Int): NSScriptClassDescription =
        Native.objc_msgSend("class objc.NSScriptClassDescription", this, "classDescriptionWithAppleEventCode:", appleEventCode) as NSScriptClassDescription

    public open fun commandDescriptionWithAppleEventClass_andAppleEventCode(appleEventClassCode: Int, appleEventIDCode: Int): NSScriptCommandDescription =
        Native.objc_msgSend("class objc.NSScriptCommandDescription", this, "commandDescriptionWithAppleEventClass:andAppleEventCode:", appleEventClassCode, appleEventIDCode) as NSScriptCommandDescription

    public open fun aeteResource(languageName: NSString): NSData =
        Native.objc_msgSend("class objc.NSData", this, "aeteResource:", languageName) as NSData

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun sharedScriptSuiteRegistry(): NSScriptSuiteRegistry =
            Native.objc_msgSend("class objc.NSScriptSuiteRegistry", this, "sharedScriptSuiteRegistry") as NSScriptSuiteRegistry

        public open fun setSharedScriptSuiteRegistry(registry: NSScriptSuiteRegistry): Unit {
            Native.objc_msgSend("void", this, "setSharedScriptSuiteRegistry:", registry)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSScriptSuiteRegistry")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
