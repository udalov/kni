// generated from "/System/Library/Frameworks/QuartzCore.framework/Headers/CAOpenGLLayer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class CAOpenGLLayer(pointer: Long) : CALayer(pointer) {
    public open fun isAsynchronous(): Boolean =
        Native.objc_msgSend("boolean", this, "isAsynchronous") as Boolean

    public open fun setAsynchronous(asynchronous: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAsynchronous:", asynchronous)
    }

    public open fun canDrawInCGLContext_pixelFormat_forLayerTime_displayTime(ctx: Pointer<Any>, pf: Pointer<Any>, t: Double, ts: Pointer<Any>): Boolean =
        Native.objc_msgSend("boolean", this, "canDrawInCGLContext:pixelFormat:forLayerTime:displayTime:", ctx, pf, t, ts) as Boolean

    public open fun drawInCGLContext_pixelFormat_forLayerTime_displayTime(ctx: Pointer<Any>, pf: Pointer<Any>, t: Double, ts: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "drawInCGLContext:pixelFormat:forLayerTime:displayTime:", ctx, pf, t, ts)
    }

    public open fun copyCGLPixelFormatForDisplayMask(mask: Int): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "copyCGLPixelFormatForDisplayMask:", mask) as Pointer<Any>

    public open fun releaseCGLPixelFormat(pf: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "releaseCGLPixelFormat:", pf)
    }

    public open fun copyCGLContextForPixelFormat(pf: Pointer<Any>): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "copyCGLContextForPixelFormat:", pf) as Pointer<Any>

    public open fun releaseCGLContext(ctx: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "releaseCGLContext:", ctx)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : CALayer.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("CAOpenGLLayer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
