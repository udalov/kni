// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSInputServer.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSInputServiceProvider {
    trait metaclass
}

trait NSInputServerMouseTracker {
    trait metaclass
}

public open class NSInputServer(pointer: Long) : NSObject(pointer), NSInputServiceProvider, NSInputServerMouseTracker {
    public open fun initWithDelegate_name(aDelegate: ObjCObject, name: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDelegate:name:", aDelegate, name) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSInputServiceProvider.metaclass, NSInputServerMouseTracker.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSInputServer")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
