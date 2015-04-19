// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSOpenGLView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSOpenGLView(pointer: Long) : NSView(pointer) {
    public open fun initWithFrame_pixelFormat(frameRect: Any, format: NSOpenGLPixelFormat): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:pixelFormat:", frameRect, format) as ObjCObject

    public open fun openGLContext(): NSOpenGLContext =
        Native.objc_msgSend("class objc.NSOpenGLContext", this, "openGLContext") as NSOpenGLContext

    public open fun setOpenGLContext(openGLContext: NSOpenGLContext): Unit {
        Native.objc_msgSend("void", this, "setOpenGLContext:", openGLContext)
    }

    public open fun clearGLContext(): Unit {
        Native.objc_msgSend("void", this, "clearGLContext")
    }

    public open fun update(): Unit {
        Native.objc_msgSend("void", this, "update")
    }

    public open fun reshape(): Unit {
        Native.objc_msgSend("void", this, "reshape")
    }

    public open fun pixelFormat(): NSOpenGLPixelFormat =
        Native.objc_msgSend("class objc.NSOpenGLPixelFormat", this, "pixelFormat") as NSOpenGLPixelFormat

    public open fun setPixelFormat(pixelFormat: NSOpenGLPixelFormat): Unit {
        Native.objc_msgSend("void", this, "setPixelFormat:", pixelFormat)
    }

    public open fun prepareOpenGL(): Unit {
        Native.objc_msgSend("void", this, "prepareOpenGL")
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass {
        public open fun defaultPixelFormat(): NSOpenGLPixelFormat =
            Native.objc_msgSend("class objc.NSOpenGLPixelFormat", this, "defaultPixelFormat") as NSOpenGLPixelFormat

    }

    companion object : NSObject(Native.objc_getClass("NSOpenGLView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSView_NSOpenGLSurfaceResolution : IObjCObject {
    public open fun wantsBestResolutionOpenGLSurface(): Boolean =
        Native.objc_msgSend("boolean", this, "wantsBestResolutionOpenGLSurface") as Boolean

    public open fun setWantsBestResolutionOpenGLSurface(wantsBestResolutionOpenGLSurface: Boolean): Unit {
        Native.objc_msgSend("void", this, "setWantsBestResolutionOpenGLSurface:", wantsBestResolutionOpenGLSurface)
    }

    trait metaclass : IObjCObject
}
