// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSSpellServer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSSpellServerDelegate {
    trait metaclass
}

public open class NSSpellServer(pointer: Long) : NSObject(pointer) {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun registerLanguage_byVendor(language: NSString, vendor: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "registerLanguage:byVendor:", language, vendor) as Boolean

    public open fun isWordInUserDictionaries_caseSensitive(word: NSString, flag: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "isWordInUserDictionaries:caseSensitive:", word, flag) as Boolean

    public open fun run(): Unit {
        Native.objc_msgSend("void", this, "run")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSpellServer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
