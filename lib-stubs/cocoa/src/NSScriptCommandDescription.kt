// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptCommandDescription.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScriptCommandDescription(pointer: Long) : NSObject(pointer), NSCoding {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithSuiteName_commandName_dictionary(suiteName: NSString, commandName: NSString, commandDeclaration: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSuiteName:commandName:dictionary:", suiteName, commandName, commandDeclaration) as ObjCObject

    public open fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun suiteName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "suiteName") as NSString

    public open fun commandName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "commandName") as NSString

    public open fun appleEventClassCode(): Int =
        Native.objc_msgSend("int", this, "appleEventClassCode") as Int

    public open fun appleEventCode(): Int =
        Native.objc_msgSend("int", this, "appleEventCode") as Int

    public open fun commandClassName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "commandClassName") as NSString

    public open fun returnType(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "returnType") as NSString

    public open fun appleEventCodeForReturnType(): Int =
        Native.objc_msgSend("int", this, "appleEventCodeForReturnType") as Int

    public open fun argumentNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "argumentNames") as NSArray

    public open fun typeForArgumentWithName(argumentName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "typeForArgumentWithName:", argumentName) as NSString

    public open fun appleEventCodeForArgumentWithName(argumentName: NSString): Int =
        Native.objc_msgSend("int", this, "appleEventCodeForArgumentWithName:", argumentName) as Int

    public open fun isOptionalArgumentWithName(argumentName: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isOptionalArgumentWithName:", argumentName) as Boolean

    public open fun createCommandInstance(): NSScriptCommand =
        Native.objc_msgSend("class objc.NSScriptCommand", this, "createCommandInstance") as NSScriptCommand

    public open fun createCommandInstanceWithZone(zone: Pointer<Any>): NSScriptCommand =
        Native.objc_msgSend("class objc.NSScriptCommand", this, "createCommandInstanceWithZone:", zone) as NSScriptCommand

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSScriptCommandDescription")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
