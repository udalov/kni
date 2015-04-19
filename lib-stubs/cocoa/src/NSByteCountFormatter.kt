// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSByteCountFormatter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSByteCountFormatter(pointer: Long) : NSFormatter(pointer) {
    public open fun stringFromByteCount(byteCount: Long): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromByteCount:", byteCount) as NSString

    public open fun allowedUnits(): Any =
        Native.objc_msgSend("class objc.Any", this, "allowedUnits")

    public open fun setAllowedUnits(allowedUnits: Any): Unit {
        Native.objc_msgSend("void", this, "setAllowedUnits:", allowedUnits)
    }

    public open fun countStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "countStyle")

    public open fun setCountStyle(countStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setCountStyle:", countStyle)
    }

    public open fun allowsNonnumericFormatting(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsNonnumericFormatting") as Boolean

    public open fun setAllowsNonnumericFormatting(allowsNonnumericFormatting: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsNonnumericFormatting:", allowsNonnumericFormatting)
    }

    public open fun includesUnit(): Boolean =
        Native.objc_msgSend("boolean", this, "includesUnit") as Boolean

    public open fun setIncludesUnit(includesUnit: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncludesUnit:", includesUnit)
    }

    public open fun includesCount(): Boolean =
        Native.objc_msgSend("boolean", this, "includesCount") as Boolean

    public open fun setIncludesCount(includesCount: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncludesCount:", includesCount)
    }

    public open fun includesActualByteCount(): Boolean =
        Native.objc_msgSend("boolean", this, "includesActualByteCount") as Boolean

    public open fun setIncludesActualByteCount(includesActualByteCount: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncludesActualByteCount:", includesActualByteCount)
    }

    public open fun isAdaptive(): Boolean =
        Native.objc_msgSend("boolean", this, "isAdaptive") as Boolean

    public open fun setAdaptive(adaptive: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAdaptive:", adaptive)
    }

    public open fun zeroPadsFractionDigits(): Boolean =
        Native.objc_msgSend("boolean", this, "zeroPadsFractionDigits") as Boolean

    public open fun setZeroPadsFractionDigits(zeroPadsFractionDigits: Boolean): Unit {
        Native.objc_msgSend("void", this, "setZeroPadsFractionDigits:", zeroPadsFractionDigits)
    }

    public open fun formattingContext(): Any =
        Native.objc_msgSend("class objc.Any", this, "formattingContext")

    public open fun setFormattingContext(formattingContext: Any): Unit {
        Native.objc_msgSend("void", this, "setFormattingContext:", formattingContext)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSFormatter.metaclass {
        public open fun stringFromByteCount_countStyle(byteCount: Long, countStyle: Any): NSString =
            Native.objc_msgSend("class objc.NSString", this, "stringFromByteCount:countStyle:", byteCount, countStyle) as NSString

    }

    companion object : NSObject(Native.objc_getClass("NSByteCountFormatter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
