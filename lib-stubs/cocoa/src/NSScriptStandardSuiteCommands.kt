// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptStandardSuiteCommands.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCloneCommand(pointer: Long) : NSScriptCommand(pointer) {
    override fun setReceiversSpecifier(receiversRef: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setReceiversSpecifier:", receiversRef)
    }

    public open fun keySpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "keySpecifier") as NSScriptObjectSpecifier

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCloneCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSCloseCommand(pointer: Long) : NSScriptCommand(pointer) {
    public open fun saveOptions(): Any =
        Native.objc_msgSend("class objc.Any", this, "saveOptions")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCloseCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSCountCommand(pointer: Long) : NSScriptCommand(pointer) {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCountCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSCreateCommand(pointer: Long) : NSScriptCommand(pointer) {
    public open fun createClassDescription(): NSScriptClassDescription =
        Native.objc_msgSend("class objc.NSScriptClassDescription", this, "createClassDescription") as NSScriptClassDescription

    public open fun resolvedKeyDictionary(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "resolvedKeyDictionary") as NSDictionary

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCreateCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSDeleteCommand(pointer: Long) : NSScriptCommand(pointer) {
    override fun setReceiversSpecifier(receiversRef: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setReceiversSpecifier:", receiversRef)
    }

    public open fun keySpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "keySpecifier") as NSScriptObjectSpecifier

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDeleteCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSExistsCommand(pointer: Long) : NSScriptCommand(pointer) {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSExistsCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSGetCommand(pointer: Long) : NSScriptCommand(pointer) {
    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSGetCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMoveCommand(pointer: Long) : NSScriptCommand(pointer) {
    override fun setReceiversSpecifier(receiversRef: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setReceiversSpecifier:", receiversRef)
    }

    public open fun keySpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "keySpecifier") as NSScriptObjectSpecifier

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMoveCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSQuitCommand(pointer: Long) : NSScriptCommand(pointer) {
    public open fun saveOptions(): Any =
        Native.objc_msgSend("class objc.Any", this, "saveOptions")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSQuitCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSSetCommand(pointer: Long) : NSScriptCommand(pointer) {
    override fun setReceiversSpecifier(receiversRef: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setReceiversSpecifier:", receiversRef)
    }

    public open fun keySpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "keySpecifier") as NSScriptObjectSpecifier

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptCommand.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSetCommand")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
