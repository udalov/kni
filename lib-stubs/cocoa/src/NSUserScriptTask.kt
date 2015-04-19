// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSUserScriptTask.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSUserScriptTask(pointer: Long) : NSObject(pointer) {
    public open fun initWithURL_error(url: NSURL, error: Pointer<NSError>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:error:", url, error) as ObjCObject

    public open fun scriptURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "scriptURL") as NSURL

    public open fun executeWithCompletionHandler(handler: Any): Unit {
        Native.objc_msgSend("void", this, "executeWithCompletionHandler:", handler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSUserScriptTask")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSUserUnixTask(pointer: Long) : NSUserScriptTask(pointer) {
    public open fun standardInput(): NSFileHandle =
        Native.objc_msgSend("class objc.NSFileHandle", this, "standardInput") as NSFileHandle

    public open fun setStandardInput(standardInput: NSFileHandle): Unit {
        Native.objc_msgSend("void", this, "setStandardInput:", standardInput)
    }

    public open fun standardOutput(): NSFileHandle =
        Native.objc_msgSend("class objc.NSFileHandle", this, "standardOutput") as NSFileHandle

    public open fun setStandardOutput(standardOutput: NSFileHandle): Unit {
        Native.objc_msgSend("void", this, "setStandardOutput:", standardOutput)
    }

    public open fun standardError(): NSFileHandle =
        Native.objc_msgSend("class objc.NSFileHandle", this, "standardError") as NSFileHandle

    public open fun setStandardError(standardError: NSFileHandle): Unit {
        Native.objc_msgSend("void", this, "setStandardError:", standardError)
    }

    public open fun executeWithArguments_completionHandler(arguments: NSArray, handler: Any): Unit {
        Native.objc_msgSend("void", this, "executeWithArguments:completionHandler:", arguments, handler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSUserScriptTask.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSUserUnixTask")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSUserAppleScriptTask(pointer: Long) : NSUserScriptTask(pointer) {
    public open fun executeWithAppleEvent_completionHandler(event: NSAppleEventDescriptor, handler: Any): Unit {
        Native.objc_msgSend("void", this, "executeWithAppleEvent:completionHandler:", event, handler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSUserScriptTask.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSUserAppleScriptTask")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSUserAutomatorTask(pointer: Long) : NSUserScriptTask(pointer) {
    public open fun variables(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "variables") as NSDictionary

    public open fun setVariables(variables: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setVariables:", variables)
    }

    public open fun executeWithInput_completionHandler(input: Any, handler: Any): Unit {
        Native.objc_msgSend("void", this, "executeWithInput:completionHandler:", input, handler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSUserScriptTask.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSUserAutomatorTask")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
