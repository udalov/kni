// generated from "/System/Library/Frameworks/QuartzCore.framework/Headers/CATransform3D.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSValue_CATransform3DAdditions : IObjCObject {
    public open fun CATransform3DValue(): Any =
        Native.objc_msgSend("class objc.Any", this, "CATransform3DValue")

    trait metaclass : IObjCObject {
        public open fun valueWithCATransform3D(t: Any): NSValue =
            Native.objc_msgSend("class objc.NSValue", this, "valueWithCATransform3D:", t) as NSValue
    }
}
