// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSNibLoading.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSBundle_NSNibLoading : IObjCObject {
    public open fun loadNibNamed_owner_topLevelObjects(nibName: NSString, owner: ObjCObject, topLevelObjects: Pointer<NSArray>): Boolean =
        Native.objc_msgSend("boolean", this, "loadNibNamed:owner:topLevelObjects:", nibName, owner, topLevelObjects) as Boolean

    trait metaclass : IObjCObject
}

trait NSObject_NSNibAwaking : IObjCObject {
    public open fun awakeFromNib(): Unit {
        Native.objc_msgSend("void", this, "awakeFromNib")
    }

    public open fun prepareForInterfaceBuilder(): Unit {
        Native.objc_msgSend("void", this, "prepareForInterfaceBuilder")
    }

    trait metaclass : IObjCObject
}

trait NSBundle_NSNibLoadingDeprecated : IObjCObject {
    public open fun loadNibFile_externalNameTable_withZone(fileName: NSString, context: NSDictionary, zone: Pointer<Any>): Boolean =
        Native.objc_msgSend("boolean", this, "loadNibFile:externalNameTable:withZone:", fileName, context, zone) as Boolean

    trait metaclass : IObjCObject {
        public open fun loadNibFile_externalNameTable_withZone(fileName: NSString, context: NSDictionary, zone: Pointer<Any>): Boolean =
            Native.objc_msgSend("boolean", this, "loadNibFile:externalNameTable:withZone:", fileName, context, zone) as Boolean

        public open fun loadNibNamed_owner(nibName: NSString, owner: ObjCObject): Boolean =
            Native.objc_msgSend("boolean", this, "loadNibNamed:owner:", nibName, owner) as Boolean
    }
}
