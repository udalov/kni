// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSKeyValueObserving.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSObject_NSKeyValueObserving : IObjCObject {
    public open fun observeValueForKeyPath_ofObject_change_context(keyPath: NSString, `object`: ObjCObject, change: NSDictionary, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "observeValueForKeyPath:ofObject:change:context:", keyPath, `object`, change, context)
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSKeyValueObserverRegistration : IObjCObject {
    public open fun addObserver_forKeyPath_options_context(observer: NSObject, keyPath: NSString, options: Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addObserver:forKeyPath:options:context:", observer, keyPath, options, context)
    }

    public open fun removeObserver_forKeyPath_context(observer: NSObject, keyPath: NSString, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:context:", observer, keyPath, context)
    }

    public open fun removeObserver_forKeyPath(observer: NSObject, keyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:", observer, keyPath)
    }

    trait metaclass : IObjCObject
}

trait NSArray_NSKeyValueObserverRegistration : IObjCObject {
    public open fun addObserver_toObjectsAtIndexes_forKeyPath_options_context(observer: NSObject, indexes: NSIndexSet, keyPath: NSString, options: Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addObserver:toObjectsAtIndexes:forKeyPath:options:context:", observer, indexes, keyPath, options, context)
    }

    public open fun removeObserver_fromObjectsAtIndexes_forKeyPath_context(observer: NSObject, indexes: NSIndexSet, keyPath: NSString, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "removeObserver:fromObjectsAtIndexes:forKeyPath:context:", observer, indexes, keyPath, context)
    }

    public open fun removeObserver_fromObjectsAtIndexes_forKeyPath(observer: NSObject, indexes: NSIndexSet, keyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObserver:fromObjectsAtIndexes:forKeyPath:", observer, indexes, keyPath)
    }

    public open fun addObserver_forKeyPath_options_context(observer: NSObject, keyPath: NSString, options: Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addObserver:forKeyPath:options:context:", observer, keyPath, options, context)
    }

    public open fun removeObserver_forKeyPath_context(observer: NSObject, keyPath: NSString, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:context:", observer, keyPath, context)
    }

    public open fun removeObserver_forKeyPath(observer: NSObject, keyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:", observer, keyPath)
    }

    trait metaclass : IObjCObject
}

trait NSOrderedSet_NSKeyValueObserverRegistration : IObjCObject {
    public open fun addObserver_forKeyPath_options_context(observer: NSObject, keyPath: NSString, options: Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addObserver:forKeyPath:options:context:", observer, keyPath, options, context)
    }

    public open fun removeObserver_forKeyPath_context(observer: NSObject, keyPath: NSString, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:context:", observer, keyPath, context)
    }

    public open fun removeObserver_forKeyPath(observer: NSObject, keyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:", observer, keyPath)
    }

    trait metaclass : IObjCObject
}

trait NSSet_NSKeyValueObserverRegistration : IObjCObject {
    public open fun addObserver_forKeyPath_options_context(observer: NSObject, keyPath: NSString, options: Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "addObserver:forKeyPath:options:context:", observer, keyPath, options, context)
    }

    public open fun removeObserver_forKeyPath_context(observer: NSObject, keyPath: NSString, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:context:", observer, keyPath, context)
    }

    public open fun removeObserver_forKeyPath(observer: NSObject, keyPath: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObserver:forKeyPath:", observer, keyPath)
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSKeyValueObserverNotification : IObjCObject {
    public open fun willChangeValueForKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "willChangeValueForKey:", key)
    }

    public open fun didChangeValueForKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "didChangeValueForKey:", key)
    }

    public open fun willChange_valuesAtIndexes_forKey(changeKind: Any, indexes: NSIndexSet, key: NSString): Unit {
        Native.objc_msgSend("void", this, "willChange:valuesAtIndexes:forKey:", changeKind, indexes, key)
    }

    public open fun didChange_valuesAtIndexes_forKey(changeKind: Any, indexes: NSIndexSet, key: NSString): Unit {
        Native.objc_msgSend("void", this, "didChange:valuesAtIndexes:forKey:", changeKind, indexes, key)
    }

    public open fun willChangeValueForKey_withSetMutation_usingObjects(key: NSString, mutationKind: Any, objects: NSSet): Unit {
        Native.objc_msgSend("void", this, "willChangeValueForKey:withSetMutation:usingObjects:", key, mutationKind, objects)
    }

    public open fun didChangeValueForKey_withSetMutation_usingObjects(key: NSString, mutationKind: Any, objects: NSSet): Unit {
        Native.objc_msgSend("void", this, "didChangeValueForKey:withSetMutation:usingObjects:", key, mutationKind, objects)
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSKeyValueObservingCustomization : IObjCObject {
    public open fun observationInfo(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "observationInfo") as Pointer<*>

    public open fun setObservationInfo(observationInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "setObservationInfo:", observationInfo)
    }

    trait metaclass : IObjCObject {
        public open fun keyPathsForValuesAffectingValueForKey(key: NSString): NSSet =
            Native.objc_msgSend("class objc.NSSet", this, "keyPathsForValuesAffectingValueForKey:", key) as NSSet

        public open fun automaticallyNotifiesObserversForKey(key: NSString): Boolean =
            Native.objc_msgSend("boolean", this, "automaticallyNotifiesObserversForKey:", key) as Boolean
    }
}

trait NSObject_NSDeprecatedKeyValueObservingCustomization : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun setKeys_triggerChangeNotificationsForDependentKey(keys: NSArray, dependentKey: NSString): Unit {
            Native.objc_msgSend("void", this, "setKeys:triggerChangeNotificationsForDependentKey:", keys, dependentKey)
        }
    }
}
