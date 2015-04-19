// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSGeometry.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSValue_NSValueGeometryExtensions : IObjCObject {
    public open fun pointValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "pointValue")

    public open fun sizeValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "sizeValue")

    public open fun rectValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "rectValue")

    public open fun edgeInsetsValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "edgeInsetsValue")

    trait metaclass : IObjCObject {
        public open fun valueWithPoint(point: Any): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "valueWithPoint:", point) as NSValue

        public open fun valueWithSize(size: Any): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "valueWithSize:", size) as NSValue

        public open fun valueWithRect(rect: Any): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "valueWithRect:", rect) as NSValue

        public open fun valueWithEdgeInsets(insets: Any): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "valueWithEdgeInsets:", insets) as NSValue
    }
}

trait NSCoder_NSGeometryCoding : IObjCObject {
    public open fun encodePoint(point: Any): Unit {
        Native.objc_msgSend("void", this, "encodePoint:", point)
    }

    public open fun decodePoint(): Any =
        Native.objc_msgSend("class objc.Any", this, "decodePoint")

    public open fun encodeSize(size: Any): Unit {
        Native.objc_msgSend("void", this, "encodeSize:", size)
    }

    public open fun decodeSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "decodeSize")

    public open fun encodeRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "encodeRect:", rect)
    }

    public open fun decodeRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "decodeRect")

    trait metaclass : IObjCObject
}

trait NSCoder_NSGeometryKeyedCoding : IObjCObject {
    public open fun encodePoint_forKey(point: Any, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodePoint:forKey:", point, key)
    }

    public open fun encodeSize_forKey(size: Any, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeSize:forKey:", size, key)
    }

    public open fun encodeRect_forKey(rect: Any, key: NSString): Unit {
        Native.objc_msgSend("void", this, "encodeRect:forKey:", rect, key)
    }

    public open fun decodePointForKey(key: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "decodePointForKey:", key)

    public open fun decodeSizeForKey(key: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "decodeSizeForKey:", key)

    public open fun decodeRectForKey(key: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "decodeRectForKey:", key)

    trait metaclass : IObjCObject
}
