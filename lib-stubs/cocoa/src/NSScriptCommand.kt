// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptCommand.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScriptCommand(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun initWithCommandDescription(commandDef: NSScriptCommandDescription): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCommandDescription:", commandDef) as ObjCObject

    public open fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun commandDescription(): NSScriptCommandDescription =
        Native.objc_msgSend("class objc.NSScriptCommandDescription", this, "commandDescription") as NSScriptCommandDescription

    public open fun directParameter(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "directParameter") as ObjCObject

    public open fun setDirectParameter(directParameter: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setDirectParameter:", directParameter)
    }

    public open fun receiversSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "receiversSpecifier") as NSScriptObjectSpecifier

    public open fun setReceiversSpecifier(receiversSpecifier: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setReceiversSpecifier:", receiversSpecifier)
    }

    public open fun evaluatedReceivers(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "evaluatedReceivers") as ObjCObject

    public open fun arguments(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "arguments") as NSDictionary

    public open fun setArguments(arguments: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setArguments:", arguments)
    }

    public open fun evaluatedArguments(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "evaluatedArguments") as NSDictionary

    public open fun isWellFormed(): Boolean =
        Native.objc_msgSend("boolean", this, "isWellFormed") as Boolean

    public open fun performDefaultImplementation(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "performDefaultImplementation") as ObjCObject

    public open fun executeCommand(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "executeCommand") as ObjCObject

    public open fun scriptErrorNumber(): Int =
        Native.objc_msgSend("int", this, "scriptErrorNumber") as Int

    public open fun setScriptErrorNumber(scriptErrorNumber: Int): Unit {
        Native.objc_msgSend("void", this, "setScriptErrorNumber:", scriptErrorNumber)
    }

    public open fun scriptErrorOffendingObjectDescriptor(): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "scriptErrorOffendingObjectDescriptor") as NSAppleEventDescriptor

    public open fun setScriptErrorOffendingObjectDescriptor(scriptErrorOffendingObjectDescriptor: NSAppleEventDescriptor): Unit {
        Native.objc_msgSend("void", this, "setScriptErrorOffendingObjectDescriptor:", scriptErrorOffendingObjectDescriptor)
    }

    public open fun scriptErrorExpectedTypeDescriptor(): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "scriptErrorExpectedTypeDescriptor") as NSAppleEventDescriptor

    public open fun setScriptErrorExpectedTypeDescriptor(scriptErrorExpectedTypeDescriptor: NSAppleEventDescriptor): Unit {
        Native.objc_msgSend("void", this, "setScriptErrorExpectedTypeDescriptor:", scriptErrorExpectedTypeDescriptor)
    }

    public open fun scriptErrorString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "scriptErrorString") as NSString

    public open fun setScriptErrorString(scriptErrorString: NSString): Unit {
        Native.objc_msgSend("void", this, "setScriptErrorString:", scriptErrorString)
    }

    public open fun appleEvent(): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "appleEvent") as NSAppleEventDescriptor

    public open fun suspendExecution(): Unit {
        Native.objc_msgSend("void", this, "suspendExecution")
    }

    public open fun resumeExecutionWithResult(result: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "resumeExecutionWithResult:", result)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
        public open fun currentCommand(): NSScriptCommand =
            Native.objc_msgSend("class objc.NSScriptCommand", this, "currentCommand") as NSScriptCommand

    }

    companion object : NSObject(Native.objc_getClass("NSScriptCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
