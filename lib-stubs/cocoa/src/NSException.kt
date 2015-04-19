// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSException.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSException(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSException_NSExceptionRaisingConveniences {
    public open fun initWithName_reason_userInfo(aName: NSString, aReason: NSString, aUserInfo: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithName:reason:userInfo:", aName, aReason, aUserInfo) as ObjCObject

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun reason(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "reason") as NSString

    public open fun userInfo(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userInfo") as NSDictionary

    public open fun callStackReturnAddresses(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "callStackReturnAddresses") as NSArray

    public open fun callStackSymbols(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "callStackSymbols") as NSArray

    public open fun raise(): Unit {
        Native.objc_msgSend("void", this, "raise")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSException_NSExceptionRaisingConveniences.metaclass {
        public open fun exceptionWithName_reason_userInfo(name: NSString, reason: NSString, userInfo: NSDictionary): NSException =
            Native.objc_msgSend("class objc.NSException", this, "exceptionWithName:reason:userInfo:", name, reason, userInfo) as NSException

    }

    companion object : NSObject(Native.objc_getClass("NSException")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSAssertionHandler(pointer: Long) : NSObject(pointer) {
    public open fun handleFailureInMethod_object_file_lineNumber_description(selector: ObjCSelector, `object`: ObjCObject, fileName: NSString, line: Int, format: NSString): Unit {
        Native.objc_msgSend("void", this, "handleFailureInMethod:object:file:lineNumber:description:", selector, `object`, fileName, line, format)
    }

    public open fun handleFailureInFunction_file_lineNumber_description(functionName: NSString, fileName: NSString, line: Int, format: NSString): Unit {
        Native.objc_msgSend("void", this, "handleFailureInFunction:file:lineNumber:description:", functionName, fileName, line, format)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun currentHandler(): NSAssertionHandler =
            Native.objc_msgSend("class objc.NSAssertionHandler", this, "currentHandler") as NSAssertionHandler

    }

    companion object : NSObject(Native.objc_getClass("NSAssertionHandler")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSException_NSExceptionRaisingConveniences : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun raise_format(name: NSString, format: NSString): Unit {
            Native.objc_msgSend("void", this, "raise:format:", name, format)
        }

        public open fun raise_format_arguments(name: NSString, format: NSString, argList: Any): Unit {
            Native.objc_msgSend("void", this, "raise:format:arguments:", name, format, argList)
        }
    }
}
