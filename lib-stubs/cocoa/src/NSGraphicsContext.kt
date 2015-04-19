// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSGraphicsContext.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSGraphicsContext(pointer: Long) : NSObject(pointer), NSGraphicsContext_NSGraphicsContext_RenderingOptions, NSGraphicsContext_NSQuartzCoreAdditions, NSGraphicsContext_NSGraphicsContextDeprecated {
    public open fun attributes(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "attributes") as NSDictionary

    public open fun isDrawingToScreen(): Boolean =
        Native.objc_msgSend("boolean", this, "isDrawingToScreen") as Boolean

    public open fun saveGraphicsState(): Unit {
        Native.objc_msgSend("void", this, "saveGraphicsState")
    }

    public open fun restoreGraphicsState(): Unit {
        Native.objc_msgSend("void", this, "restoreGraphicsState")
    }

    public open fun flushGraphics(): Unit {
        Native.objc_msgSend("void", this, "flushGraphics")
    }

    public open fun CGContext(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGContext") as Pointer<Any>

    public open fun isFlipped(): Boolean =
        Native.objc_msgSend("boolean", this, "isFlipped") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSGraphicsContext_NSGraphicsContext_RenderingOptions.metaclass, NSGraphicsContext_NSQuartzCoreAdditions.metaclass, NSGraphicsContext_NSGraphicsContextDeprecated.metaclass {
        public open fun graphicsContextWithAttributes(attributes: NSDictionary): NSGraphicsContext =
            Native.objc_msgSend("class objc.NSGraphicsContext", this, "graphicsContextWithAttributes:", attributes) as NSGraphicsContext

        public open fun graphicsContextWithWindow(window: NSWindow): NSGraphicsContext =
            Native.objc_msgSend("class objc.NSGraphicsContext", this, "graphicsContextWithWindow:", window) as NSGraphicsContext

        public open fun graphicsContextWithBitmapImageRep(bitmapRep: NSBitmapImageRep): NSGraphicsContext =
            Native.objc_msgSend("class objc.NSGraphicsContext", this, "graphicsContextWithBitmapImageRep:", bitmapRep) as NSGraphicsContext

        public open fun graphicsContextWithCGContext_flipped(graphicsPort: Pointer<Any>, initialFlippedState: Boolean): NSGraphicsContext =
            Native.objc_msgSend("class objc.NSGraphicsContext", this, "graphicsContextWithCGContext:flipped:", graphicsPort, initialFlippedState) as NSGraphicsContext

        public open fun currentContext(): NSGraphicsContext =
            Native.objc_msgSend("class objc.NSGraphicsContext", this, "currentContext") as NSGraphicsContext

        public open fun setCurrentContext(context: NSGraphicsContext): Unit {
            Native.objc_msgSend("void", this, "setCurrentContext:", context)
        }

        public open fun currentContextDrawingToScreen(): Boolean =
            Native.objc_msgSend("boolean", this, "currentContextDrawingToScreen") as Boolean

        public open fun saveGraphicsState(): Unit {
            Native.objc_msgSend("void", this, "saveGraphicsState")
        }

        public open fun restoreGraphicsState(): Unit {
            Native.objc_msgSend("void", this, "restoreGraphicsState")
        }

    }

    companion object : NSObject(Native.objc_getClass("NSGraphicsContext")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSGraphicsContext_NSGraphicsContext_RenderingOptions : IObjCObject {
    public open fun shouldAntialias(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldAntialias") as Boolean

    public open fun setShouldAntialias(shouldAntialias: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShouldAntialias:", shouldAntialias)
    }

    public open fun imageInterpolation(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageInterpolation")

    public open fun setImageInterpolation(imageInterpolation: Any): Unit {
        Native.objc_msgSend("void", this, "setImageInterpolation:", imageInterpolation)
    }

    public open fun patternPhase(): Any =
        Native.objc_msgSend("class objc.Any", this, "patternPhase")

    public open fun setPatternPhase(patternPhase: Any): Unit {
        Native.objc_msgSend("void", this, "setPatternPhase:", patternPhase)
    }

    public open fun compositingOperation(): Any =
        Native.objc_msgSend("class objc.Any", this, "compositingOperation")

    public open fun setCompositingOperation(compositingOperation: Any): Unit {
        Native.objc_msgSend("void", this, "setCompositingOperation:", compositingOperation)
    }

    public open fun colorRenderingIntent(): Any =
        Native.objc_msgSend("class objc.Any", this, "colorRenderingIntent")

    public open fun setColorRenderingIntent(colorRenderingIntent: Any): Unit {
        Native.objc_msgSend("void", this, "setColorRenderingIntent:", colorRenderingIntent)
    }

    trait metaclass : IObjCObject
}

trait NSGraphicsContext_NSQuartzCoreAdditions : IObjCObject {
    public open fun CIContext(): CIContext =
        Native.objc_msgSend("class objc.CIContext", this, "CIContext") as CIContext

    trait metaclass : IObjCObject
}

trait NSGraphicsContext_NSGraphicsContextDeprecated : IObjCObject {
    public open fun focusStack(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "focusStack") as ObjCObject

    public open fun setFocusStack(stack: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setFocusStack:", stack)
    }

    public open fun graphicsPort(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "graphicsPort") as Pointer<*>

    trait metaclass : IObjCObject {
        public open fun setGraphicsState(gState: Int): Unit {
            Native.objc_msgSend("void", this, "setGraphicsState:", gState)
        }

        public open fun graphicsContextWithGraphicsPort_flipped(graphicsPort: Pointer<*>, initialFlippedState: Boolean): NSGraphicsContext =
            Native.objc_msgSend("class objc.NSGraphicsContext", this, "graphicsContextWithGraphicsPort:flipped:", graphicsPort, initialFlippedState) as NSGraphicsContext
    }
}
