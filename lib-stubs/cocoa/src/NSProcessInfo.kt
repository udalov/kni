// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSProcessInfo.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSProcessInfo(pointer: Long) : NSObject(pointer) {
    public open fun environment(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "environment") as NSDictionary

    public open fun arguments(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "arguments") as NSArray

    public open fun hostName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "hostName") as NSString

    public open fun processName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "processName") as NSString

    public open fun setProcessName(processName: NSString): Unit {
        Native.objc_msgSend("void", this, "setProcessName:", processName)
    }

    public open fun processIdentifier(): Int =
        Native.objc_msgSend("int", this, "processIdentifier") as Int

    public open fun globallyUniqueString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "globallyUniqueString") as NSString

    public open fun operatingSystem(): Int =
        Native.objc_msgSend("int", this, "operatingSystem") as Int

    public open fun operatingSystemName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "operatingSystemName") as NSString

    public open fun operatingSystemVersionString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "operatingSystemVersionString") as NSString

    public open fun operatingSystemVersion(): Any =
        Native.objc_msgSend("class objc.Any", this, "operatingSystemVersion")

    public open fun processorCount(): Int =
        Native.objc_msgSend("int", this, "processorCount") as Int

    public open fun activeProcessorCount(): Int =
        Native.objc_msgSend("int", this, "activeProcessorCount") as Int

    public open fun physicalMemory(): Long =
        Native.objc_msgSend("long", this, "physicalMemory") as Long

    public open fun isOperatingSystemAtLeastVersion(version: Any): Boolean =
        Native.objc_msgSend("boolean", this, "isOperatingSystemAtLeastVersion:", version) as Boolean

    public open fun systemUptime(): Double =
        Native.objc_msgSend("double", this, "systemUptime") as Double

    public open fun disableSuddenTermination(): Unit {
        Native.objc_msgSend("void", this, "disableSuddenTermination")
    }

    public open fun enableSuddenTermination(): Unit {
        Native.objc_msgSend("void", this, "enableSuddenTermination")
    }

    public open fun disableAutomaticTermination(reason: NSString): Unit {
        Native.objc_msgSend("void", this, "disableAutomaticTermination:", reason)
    }

    public open fun enableAutomaticTermination(reason: NSString): Unit {
        Native.objc_msgSend("void", this, "enableAutomaticTermination:", reason)
    }

    public open fun automaticTerminationSupportEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "automaticTerminationSupportEnabled") as Boolean

    public open fun setAutomaticTerminationSupportEnabled(automaticTerminationSupportEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticTerminationSupportEnabled:", automaticTerminationSupportEnabled)
    }

    public open fun thermalState(): Any =
        Native.objc_msgSend("class objc.Any", this, "thermalState")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun processInfo(): NSProcessInfo =
            Native.objc_msgSend("class objc.NSProcessInfo", this, "processInfo") as NSProcessInfo

    }

    companion object : NSObject(Native.objc_getClass("NSProcessInfo")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
