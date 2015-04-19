// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSInterfaceStyle.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSResponder_NSInterfaceStyle : IObjCObject {
    public open fun interfaceStyle(): Int =
        Native.objc_msgSend("int", this, "interfaceStyle") as Int

    public open fun setInterfaceStyle(interfaceStyle: Int): Unit {
        Native.objc_msgSend("void", this, "setInterfaceStyle:", interfaceStyle)
    }

    trait metaclass : IObjCObject
}
