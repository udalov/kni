// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSOpenGLLayer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSOpenGLLayer(pointer: Long) : CAOpenGLLayer(pointer) {
    public open fun view(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "view") as NSView

    public open fun setView(view: NSView): Unit {
        Native.objc_msgSend("void", this, "setView:", view)
    }

    public open fun openGLPixelFormat(): NSOpenGLPixelFormat =
        Native.objc_msgSend("class objc.NSOpenGLPixelFormat", this, "openGLPixelFormat") as NSOpenGLPixelFormat

    public open fun setOpenGLPixelFormat(openGLPixelFormat: NSOpenGLPixelFormat): Unit {
        Native.objc_msgSend("void", this, "setOpenGLPixelFormat:", openGLPixelFormat)
    }

    public open fun openGLContext(): NSOpenGLContext =
        Native.objc_msgSend("class objc.NSOpenGLContext", this, "openGLContext") as NSOpenGLContext

    public open fun setOpenGLContext(openGLContext: NSOpenGLContext): Unit {
        Native.objc_msgSend("void", this, "setOpenGLContext:", openGLContext)
    }

    public open fun openGLPixelFormatForDisplayMask(mask: Int): NSOpenGLPixelFormat =
        Native.objc_msgSend("class objc.NSOpenGLPixelFormat", this, "openGLPixelFormatForDisplayMask:", mask) as NSOpenGLPixelFormat

    public open fun openGLContextForPixelFormat(pixelFormat: NSOpenGLPixelFormat): NSOpenGLContext =
        Native.objc_msgSend("class objc.NSOpenGLContext", this, "openGLContextForPixelFormat:", pixelFormat) as NSOpenGLContext

    public open fun canDrawInOpenGLContext_pixelFormat_forLayerTime_displayTime(context: NSOpenGLContext, pixelFormat: NSOpenGLPixelFormat, t: Double, ts: Pointer<Any>): Boolean =
        Native.objc_msgSend("boolean", this, "canDrawInOpenGLContext:pixelFormat:forLayerTime:displayTime:", context, pixelFormat, t, ts) as Boolean

    public open fun drawInOpenGLContext_pixelFormat_forLayerTime_displayTime(context: NSOpenGLContext, pixelFormat: NSOpenGLPixelFormat, t: Double, ts: Pointer<Any>): Unit {
        Native.objc_msgSend("void", this, "drawInOpenGLContext:pixelFormat:forLayerTime:displayTime:", context, pixelFormat, t, ts)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : CAOpenGLLayer.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSOpenGLLayer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
