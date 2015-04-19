// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSRange.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSValue_NSValueRangeExtensions : IObjCObject {
    public open fun rangeValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeValue")

    trait metaclass : IObjCObject {
        public open fun valueWithRange(range: Any): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "valueWithRange:", range) as NSValue
    }
}
