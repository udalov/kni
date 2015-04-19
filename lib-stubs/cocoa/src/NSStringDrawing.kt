// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSStringDrawing.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSString_NSStringDrawing : IObjCObject {
    public open fun sizeWithAttributes(attrs: NSDictionary): Any =
        Native.objc_msgSend("class objc.Any", this, "sizeWithAttributes:", attrs)

    public open fun drawAtPoint_withAttributes(point: Any, attrs: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "drawAtPoint:withAttributes:", point, attrs)
    }

    public open fun drawInRect_withAttributes(rect: Any, attrs: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "drawInRect:withAttributes:", rect, attrs)
    }

    trait metaclass : IObjCObject
}

trait NSAttributedString_NSStringDrawing : IObjCObject {
    public open fun size(): Any =
        Native.objc_msgSend("class objc.Any", this, "size")

    public open fun drawAtPoint(point: Any): Unit {
        Native.objc_msgSend("void", this, "drawAtPoint:", point)
    }

    public open fun drawInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "drawInRect:", rect)
    }

    trait metaclass : IObjCObject
}

trait NSString_NSExtendedStringDrawing : IObjCObject {
    public open fun drawWithRect_options_attributes(rect: Any, options: Any, attributes: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "drawWithRect:options:attributes:", rect, options, attributes)
    }

    public open fun boundingRectWithSize_options_attributes(size: Any, options: Any, attributes: NSDictionary): Any =
        Native.objc_msgSend("class objc.Any", this, "boundingRectWithSize:options:attributes:", size, options, attributes)

    trait metaclass : IObjCObject
}

trait NSAttributedString_NSExtendedStringDrawing : IObjCObject {
    public open fun drawWithRect_options(rect: Any, options: Any): Unit {
        Native.objc_msgSend("void", this, "drawWithRect:options:", rect, options)
    }

    public open fun boundingRectWithSize_options(size: Any, options: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "boundingRectWithSize:options:", size, options)

    trait metaclass : IObjCObject
}
