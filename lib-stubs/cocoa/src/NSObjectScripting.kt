// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSObjectScripting.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSObject_NSScripting : IObjCObject {
    public open fun scriptingValueForSpecifier(objectSpecifier: NSScriptObjectSpecifier): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "scriptingValueForSpecifier:", objectSpecifier) as ObjCObject

    public open fun scriptingProperties(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "scriptingProperties") as NSDictionary

    public open fun setScriptingProperties(scriptingProperties: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setScriptingProperties:", scriptingProperties)
    }

    public open fun copyScriptingValue_forKey_withProperties(value: ObjCObject, key: NSString, properties: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "copyScriptingValue:forKey:withProperties:", value, key, properties) as ObjCObject

    public open fun newScriptingObjectOfClass_forValueForKey_withContentsValue_properties(objectClass: ObjCClass, key: NSString, contentsValue: ObjCObject, properties: NSDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "newScriptingObjectOfClass:forValueForKey:withContentsValue:properties:", objectClass, key, contentsValue, properties) as ObjCObject

    trait metaclass : IObjCObject
}
