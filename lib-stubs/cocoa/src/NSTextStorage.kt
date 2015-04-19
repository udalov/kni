// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextStorage.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTextStorageDelegate {
    trait metaclass
}

public open class NSTextStorage(pointer: Long) : NSMutableAttributedString(pointer), NSTextStorage_Scripting {
    public open fun addLayoutManager(obj: NSLayoutManager): Unit {
        Native.objc_msgSend("void", this, "addLayoutManager:", obj)
    }

    public open fun removeLayoutManager(obj: NSLayoutManager): Unit {
        Native.objc_msgSend("void", this, "removeLayoutManager:", obj)
    }

    public open fun layoutManagers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "layoutManagers") as NSArray

    public open fun edited_range_changeInLength(editedMask: Int, range: Any, delta: Int): Unit {
        Native.objc_msgSend("void", this, "edited:range:changeInLength:", editedMask, range, delta)
    }

    public open fun processEditing(): Unit {
        Native.objc_msgSend("void", this, "processEditing")
    }

    public open fun invalidateAttributesInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "invalidateAttributesInRange:", range)
    }

    public open fun ensureAttributesAreFixedInRange(range: Any): Unit {
        Native.objc_msgSend("void", this, "ensureAttributesAreFixedInRange:", range)
    }

    public open fun fixesAttributesLazily(): Boolean =
        Native.objc_msgSend("boolean", this, "fixesAttributesLazily") as Boolean

    public open fun editedMask(): Int =
        Native.objc_msgSend("int", this, "editedMask") as Int

    public open fun editedRange(): Any =
        Native.objc_msgSend("class objc.Any", this, "editedRange")

    public open fun changeInLength(): Int =
        Native.objc_msgSend("int", this, "changeInLength") as Int

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSMutableAttributedString.metaclass, NSTextStorage_Scripting.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextStorage")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
