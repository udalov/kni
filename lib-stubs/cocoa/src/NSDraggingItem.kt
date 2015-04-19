// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSDraggingItem.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSDraggingImageComponent(pointer: Long) : NSObject(pointer) {
    public open fun initWithKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithKey:", key) as ObjCObject

    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    public open fun contents(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "contents") as ObjCObject

    public open fun setContents(contents: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setContents:", contents)
    }

    public open fun frame(): Any =
        Native.objc_msgSend("class objc.Any", this, "frame")

    public open fun setFrame(frame: Any): Unit {
        Native.objc_msgSend("void", this, "setFrame:", frame)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun draggingImageComponentWithKey(key: NSString): NSDraggingImageComponent =
            Native.objc_msgSend("class objc.NSDraggingImageComponent", this, "draggingImageComponentWithKey:", key) as NSDraggingImageComponent

    }

    companion object : NSObject(Native.objc_getClass("NSDraggingImageComponent")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSDraggingItem(pointer: Long) : NSObject(pointer) {
    public open fun initWithPasteboardWriter(pasteboardWriter: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPasteboardWriter:", pasteboardWriter) as ObjCObject

    public open fun item(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "item") as ObjCObject

    public open fun draggingFrame(): Any =
        Native.objc_msgSend("class objc.Any", this, "draggingFrame")

    public open fun setDraggingFrame(draggingFrame: Any): Unit {
        Native.objc_msgSend("void", this, "setDraggingFrame:", draggingFrame)
    }

    public open fun imageComponentsProvider(): Any =
        Native.objc_msgSend("class objc.Any", this, "imageComponentsProvider")

    public open fun setImageComponentsProvider(imageComponentsProvider: Any): Unit {
        Native.objc_msgSend("void", this, "setImageComponentsProvider:", imageComponentsProvider)
    }

    public open fun setDraggingFrame_contents(frame: Any, contents: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setDraggingFrame:contents:", frame, contents)
    }

    public open fun imageComponents(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "imageComponents") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSDraggingItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
