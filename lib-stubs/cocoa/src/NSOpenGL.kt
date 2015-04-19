// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSOpenGL.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSOpenGLPixelFormat(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun initWithAttributes(attribs: Pointer<Int>): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithAttributes:", attribs) as ObjCObject

    public open fun initWithData(attribs: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", attribs) as ObjCObject

    public open fun initWithCGLPixelFormatObj(format: Pointer<Any>): NSOpenGLPixelFormat =
        Native.objc_msgSend("class objc.NSOpenGLPixelFormat", this, "initWithCGLPixelFormatObj:", format) as NSOpenGLPixelFormat

    public open fun attributes(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "attributes") as NSData

    public open fun setAttributes(attribs: NSData): Unit {
        Native.objc_msgSend("void", this, "setAttributes:", attribs)
    }

    public open fun getValues_forAttribute_forVirtualScreen(vals: Pointer<Int>, attrib: Int, screen: Int): Unit {
        Native.objc_msgSend("void", this, "getValues:forAttribute:forVirtualScreen:", vals, attrib, screen)
    }

    public open fun numberOfVirtualScreens(): Int =
        Native.objc_msgSend("int", this, "numberOfVirtualScreens") as Int

    public open fun CGLPixelFormatObj(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGLPixelFormatObj") as Pointer<Any>

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSOpenGLPixelFormat")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSOpenGLPixelBuffer(pointer: Long) : NSObject(pointer) {
    public open fun initWithTextureTarget_textureInternalFormat_textureMaxMipMapLevel_pixelsWide_pixelsHigh(target: Int, format: Int, maxLevel: Int, pixelsWide: Int, pixelsHigh: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTextureTarget:textureInternalFormat:textureMaxMipMapLevel:pixelsWide:pixelsHigh:", target, format, maxLevel, pixelsWide, pixelsHigh) as ObjCObject

    public open fun initWithCGLPBufferObj(pbuffer: Pointer<Any>): NSOpenGLPixelBuffer =
        Native.objc_msgSend("class objc.NSOpenGLPixelBuffer", this, "initWithCGLPBufferObj:", pbuffer) as NSOpenGLPixelBuffer

    public open fun CGLPBufferObj(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGLPBufferObj") as Pointer<Any>

    public open fun pixelsWide(): Int =
        Native.objc_msgSend("int", this, "pixelsWide") as Int

    public open fun pixelsHigh(): Int =
        Native.objc_msgSend("int", this, "pixelsHigh") as Int

    public open fun textureTarget(): Int =
        Native.objc_msgSend("int", this, "textureTarget") as Int

    public open fun textureInternalFormat(): Int =
        Native.objc_msgSend("int", this, "textureInternalFormat") as Int

    public open fun textureMaxMipMapLevel(): Int =
        Native.objc_msgSend("int", this, "textureMaxMipMapLevel") as Int

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSOpenGLPixelBuffer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSOpenGLContext(pointer: Long) : NSObject(pointer), NSLocking, NSOpenGLContext_NSOpenGLPixelBufer {
    public open fun initWithFormat_shareContext(format: NSOpenGLPixelFormat, share: NSOpenGLContext): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFormat:shareContext:", format, share) as ObjCObject

    public open fun initWithCGLContextObj(context: Pointer<Any>): NSOpenGLContext =
        Native.objc_msgSend("class objc.NSOpenGLContext", this, "initWithCGLContextObj:", context) as NSOpenGLContext

    public open fun pixelFormat(): NSOpenGLPixelFormat =
        Native.objc_msgSend("class objc.NSOpenGLPixelFormat", this, "pixelFormat") as NSOpenGLPixelFormat

    public open fun view(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "view") as NSView

    public open fun setView(view: NSView): Unit {
        Native.objc_msgSend("void", this, "setView:", view)
    }

    public open fun setFullScreen(): Unit {
        Native.objc_msgSend("void", this, "setFullScreen")
    }

    public open fun setOffScreen_width_height_rowbytes(baseaddr: Pointer<*>, width: Int, height: Int, rowbytes: Int): Unit {
        Native.objc_msgSend("void", this, "setOffScreen:width:height:rowbytes:", baseaddr, width, height, rowbytes)
    }

    public open fun clearDrawable(): Unit {
        Native.objc_msgSend("void", this, "clearDrawable")
    }

    public open fun update(): Unit {
        Native.objc_msgSend("void", this, "update")
    }

    public open fun flushBuffer(): Unit {
        Native.objc_msgSend("void", this, "flushBuffer")
    }

    public open fun makeCurrentContext(): Unit {
        Native.objc_msgSend("void", this, "makeCurrentContext")
    }

    public open fun copyAttributesFromContext_withMask(context: NSOpenGLContext, mask: Int): Unit {
        Native.objc_msgSend("void", this, "copyAttributesFromContext:withMask:", context, mask)
    }

    public open fun setValues_forParameter(vals: Pointer<Int>, param: Any): Unit {
        Native.objc_msgSend("void", this, "setValues:forParameter:", vals, param)
    }

    public open fun getValues_forParameter(vals: Pointer<Int>, param: Any): Unit {
        Native.objc_msgSend("void", this, "getValues:forParameter:", vals, param)
    }

    public open fun currentVirtualScreen(): Int =
        Native.objc_msgSend("int", this, "currentVirtualScreen") as Int

    public open fun setCurrentVirtualScreen(currentVirtualScreen: Int): Unit {
        Native.objc_msgSend("void", this, "setCurrentVirtualScreen:", currentVirtualScreen)
    }

    public open fun createTexture_fromView_internalFormat(target: Int, view: NSView, format: Int): Unit {
        Native.objc_msgSend("void", this, "createTexture:fromView:internalFormat:", target, view, format)
    }

    public open fun CGLContextObj(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGLContextObj") as Pointer<Any>

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSLocking.metaclass, NSOpenGLContext_NSOpenGLPixelBufer.metaclass {
        public open fun clearCurrentContext(): Unit {
            Native.objc_msgSend("void", this, "clearCurrentContext")
        }

        public open fun currentContext(): NSOpenGLContext =
            Native.objc_msgSend("class objc.NSOpenGLContext", this, "currentContext") as NSOpenGLContext

    }

    companion object : NSObject(Native.objc_getClass("NSOpenGLContext")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSOpenGLContext_NSOpenGLPixelBufer : IObjCObject {
    public open fun setPixelBuffer_cubeMapFace_mipMapLevel_currentVirtualScreen(pixelBuffer: NSOpenGLPixelBuffer, face: Int, level: Int, screen: Int): Unit {
        Native.objc_msgSend("void", this, "setPixelBuffer:cubeMapFace:mipMapLevel:currentVirtualScreen:", pixelBuffer, face, level, screen)
    }

    public open fun pixelBuffer(): NSOpenGLPixelBuffer =
        Native.objc_msgSend("class objc.NSOpenGLPixelBuffer", this, "pixelBuffer") as NSOpenGLPixelBuffer

    public open fun pixelBufferCubeMapFace(): Int =
        Native.objc_msgSend("int", this, "pixelBufferCubeMapFace") as Int

    public open fun pixelBufferMipMapLevel(): Int =
        Native.objc_msgSend("int", this, "pixelBufferMipMapLevel") as Int

    public open fun setTextureImageToPixelBuffer_colorBuffer(pixelBuffer: NSOpenGLPixelBuffer, source: Int): Unit {
        Native.objc_msgSend("void", this, "setTextureImageToPixelBuffer:colorBuffer:", pixelBuffer, source)
    }

    trait metaclass : IObjCObject
}
