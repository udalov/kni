// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSAppleScript.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSAppleScript(pointer: Long) : NSObject(pointer), NSCopying, NSAppleScript_NSExtensions {
    public open fun initWithContentsOfURL_error(url: NSURL, errorInfo: Pointer<NSDictionary>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentsOfURL:error:", url, errorInfo) as ObjCObject

    public open fun initWithSource(source: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSource:", source) as ObjCObject

    public open fun source(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "source") as NSString

    public open fun isCompiled(): Boolean =
        Native.objc_msgSend("boolean", this, "isCompiled") as Boolean

    public open fun compileAndReturnError(errorInfo: Pointer<NSDictionary>): Boolean =
        Native.objc_msgSend("boolean", this, "compileAndReturnError:", errorInfo) as Boolean

    public open fun executeAndReturnError(errorInfo: Pointer<NSDictionary>): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "executeAndReturnError:", errorInfo) as NSAppleEventDescriptor

    public open fun executeAppleEvent_error(event: NSAppleEventDescriptor, errorInfo: Pointer<NSDictionary>): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "executeAppleEvent:error:", event, errorInfo) as NSAppleEventDescriptor

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSAppleScript_NSExtensions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSAppleScript")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
