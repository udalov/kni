// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSRunningApplication.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSRunningApplication(pointer: Long) : NSObject(pointer) {
    public open fun isTerminated(): Boolean =
        Native.objc_msgSend("boolean", this, "isTerminated") as Boolean

    public open fun isFinishedLaunching(): Boolean =
        Native.objc_msgSend("boolean", this, "isFinishedLaunching") as Boolean

    public open fun isHidden(): Boolean =
        Native.objc_msgSend("boolean", this, "isHidden") as Boolean

    public open fun isActive(): Boolean =
        Native.objc_msgSend("boolean", this, "isActive") as Boolean

    public open fun ownsMenuBar(): Boolean =
        Native.objc_msgSend("boolean", this, "ownsMenuBar") as Boolean

    public open fun activationPolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "activationPolicy")

    public open fun localizedName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedName") as NSString

    public open fun bundleIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "bundleIdentifier") as NSString

    public open fun bundleURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "bundleURL") as NSURL

    public open fun executableURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "executableURL") as NSURL

    public open fun processIdentifier(): Int =
        Native.objc_msgSend("int", this, "processIdentifier") as Int

    public open fun launchDate(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "launchDate") as NSDate

    public open fun icon(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "icon") as NSImage

    public open fun executableArchitecture(): Int =
        Native.objc_msgSend("int", this, "executableArchitecture") as Int

    public open fun hide(): Boolean =
        Native.objc_msgSend("boolean", this, "hide") as Boolean

    public open fun unhide(): Boolean =
        Native.objc_msgSend("boolean", this, "unhide") as Boolean

    public open fun activateWithOptions(options: Any): Boolean =
        Native.objc_msgSend("boolean", this, "activateWithOptions:", options) as Boolean

    public open fun terminate(): Boolean =
        Native.objc_msgSend("boolean", this, "terminate") as Boolean

    public open fun forceTerminate(): Boolean =
        Native.objc_msgSend("boolean", this, "forceTerminate") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun runningApplicationsWithBundleIdentifier(bundleIdentifier: NSString): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "runningApplicationsWithBundleIdentifier:", bundleIdentifier) as NSArray

        public open fun runningApplicationWithProcessIdentifier(pid: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "runningApplicationWithProcessIdentifier:", pid) as ObjCObject

        public open fun currentApplication(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "currentApplication") as ObjCObject

        public open fun terminateAutomaticallyTerminableApplications(): Unit {
            Native.objc_msgSend("void", this, "terminateAutomaticallyTerminableApplications")
        }

    }

    companion object : NSObject(Native.objc_getClass("NSRunningApplication")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSWorkspace_NSWorkspaceRunningApplications : IObjCObject {
    public open fun runningApplications(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "runningApplications") as NSArray

    trait metaclass : IObjCObject
}
