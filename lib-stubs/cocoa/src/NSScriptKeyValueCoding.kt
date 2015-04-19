// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptKeyValueCoding.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSObject_NSScriptKeyValueCoding : IObjCObject {
    public open fun valueAtIndex_inPropertyWithKey(index: Int, key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueAtIndex:inPropertyWithKey:", index, key) as ObjCObject

    public open fun valueWithName_inPropertyWithKey(name: NSString, key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueWithName:inPropertyWithKey:", name, key) as ObjCObject

    public open fun valueWithUniqueID_inPropertyWithKey(uniqueID: ObjCObject, key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "valueWithUniqueID:inPropertyWithKey:", uniqueID, key) as ObjCObject

    public open fun insertValue_atIndex_inPropertyWithKey(value: ObjCObject, index: Int, key: NSString): Unit {
        Native.objc_msgSend("void", this, "insertValue:atIndex:inPropertyWithKey:", value, index, key)
    }

    public open fun removeValueAtIndex_fromPropertyWithKey(index: Int, key: NSString): Unit {
        Native.objc_msgSend("void", this, "removeValueAtIndex:fromPropertyWithKey:", index, key)
    }

    public open fun replaceValueAtIndex_inPropertyWithKey_withValue(index: Int, key: NSString, value: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "replaceValueAtIndex:inPropertyWithKey:withValue:", index, key, value)
    }

    public open fun insertValue_inPropertyWithKey(value: ObjCObject, key: NSString): Unit {
        Native.objc_msgSend("void", this, "insertValue:inPropertyWithKey:", value, key)
    }

    public open fun coerceValue_forKey(value: ObjCObject, key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "coerceValue:forKey:", value, key) as ObjCObject

    trait metaclass : IObjCObject
}
