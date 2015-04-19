// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSTask.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTask(pointer: Long) : NSObject(pointer), NSTask_NSTaskConveniences {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun launchPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "launchPath") as NSString

    public open fun setLaunchPath(launchPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setLaunchPath:", launchPath)
    }

    public open fun arguments(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "arguments") as NSArray

    public open fun setArguments(arguments: NSArray): Unit {
        Native.objc_msgSend("void", this, "setArguments:", arguments)
    }

    public open fun environment(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "environment") as NSDictionary

    public open fun setEnvironment(environment: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setEnvironment:", environment)
    }

    public open fun currentDirectoryPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "currentDirectoryPath") as NSString

    public open fun setCurrentDirectoryPath(currentDirectoryPath: NSString): Unit {
        Native.objc_msgSend("void", this, "setCurrentDirectoryPath:", currentDirectoryPath)
    }

    public open fun standardInput(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "standardInput") as ObjCObject

    public open fun setStandardInput(standardInput: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setStandardInput:", standardInput)
    }

    public open fun standardOutput(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "standardOutput") as ObjCObject

    public open fun setStandardOutput(standardOutput: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setStandardOutput:", standardOutput)
    }

    public open fun standardError(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "standardError") as ObjCObject

    public open fun setStandardError(standardError: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setStandardError:", standardError)
    }

    public open fun launch(): Unit {
        Native.objc_msgSend("void", this, "launch")
    }

    public open fun interrupt(): Unit {
        Native.objc_msgSend("void", this, "interrupt")
    }

    public open fun terminate(): Unit {
        Native.objc_msgSend("void", this, "terminate")
    }

    public open fun suspend(): Boolean =
        Native.objc_msgSend("boolean", this, "suspend") as Boolean

    public open fun resume(): Boolean =
        Native.objc_msgSend("boolean", this, "resume") as Boolean

    public open fun processIdentifier(): Int =
        Native.objc_msgSend("int", this, "processIdentifier") as Int

    public open fun isRunning(): Boolean =
        Native.objc_msgSend("boolean", this, "isRunning") as Boolean

    public open fun terminationStatus(): Int =
        Native.objc_msgSend("int", this, "terminationStatus") as Int

    public open fun terminationReason(): Any =
        Native.objc_msgSend("class objc.Any", this, "terminationReason")

    public open fun terminationHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "terminationHandler")

    public open fun setTerminationHandler(terminationHandler: Any): Unit {
        Native.objc_msgSend("void", this, "setTerminationHandler:", terminationHandler)
    }

    public open fun qualityOfService(): Any =
        Native.objc_msgSend("class objc.Any", this, "qualityOfService")

    public open fun setQualityOfService(qualityOfService: Any): Unit {
        Native.objc_msgSend("void", this, "setQualityOfService:", qualityOfService)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSTask_NSTaskConveniences.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTask")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSTask_NSTaskConveniences : IObjCObject {
    public open fun waitUntilExit(): Unit {
        Native.objc_msgSend("void", this, "waitUntilExit")
    }

    trait metaclass : IObjCObject {
        public open fun launchedTaskWithLaunchPath_arguments(path: NSString, arguments: NSArray): NSTask =
            Native.objc_msgSend("class objc.NSTask", this, "launchedTaskWithLaunchPath:arguments:", path, arguments) as NSTask
    }
}
