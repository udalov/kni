// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSUserDefaults.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSUserDefaults(pointer: Long) : NSObject(pointer) {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithSuiteName(suitename: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithSuiteName:", suitename) as ObjCObject

    public open fun initWithUser(username: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithUser:", username) as ObjCObject

    public open fun objectForKey(defaultName: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForKey:", defaultName) as ObjCObject

    public open fun setObject_forKey(value: ObjCObject, defaultName: NSString): Unit {
        Native.objc_msgSend("void", this, "setObject:forKey:", value, defaultName)
    }

    public open fun removeObjectForKey(defaultName: NSString): Unit {
        Native.objc_msgSend("void", this, "removeObjectForKey:", defaultName)
    }

    public open fun stringForKey(defaultName: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringForKey:", defaultName) as NSString

    public open fun arrayForKey(defaultName: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "arrayForKey:", defaultName) as NSArray

    public open fun dictionaryForKey(defaultName: NSString): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "dictionaryForKey:", defaultName) as NSDictionary

    public open fun dataForKey(defaultName: NSString): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataForKey:", defaultName) as NSData

    public open fun stringArrayForKey(defaultName: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "stringArrayForKey:", defaultName) as NSArray

    public open fun integerForKey(defaultName: NSString): Int =
        Native.objc_msgSend("int", this, "integerForKey:", defaultName) as Int

    public open fun floatForKey(defaultName: NSString): Float =
        Native.objc_msgSend("float", this, "floatForKey:", defaultName) as Float

    public open fun doubleForKey(defaultName: NSString): Double =
        Native.objc_msgSend("double", this, "doubleForKey:", defaultName) as Double

    public open fun boolForKey(defaultName: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "boolForKey:", defaultName) as Boolean

    public open fun URLForKey(defaultName: NSString): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URLForKey:", defaultName) as NSURL

    public open fun setInteger_forKey(value: Int, defaultName: NSString): Unit {
        Native.objc_msgSend("void", this, "setInteger:forKey:", value, defaultName)
    }

    public open fun setFloat_forKey(value: Float, defaultName: NSString): Unit {
        Native.objc_msgSend("void", this, "setFloat:forKey:", value, defaultName)
    }

    public open fun setDouble_forKey(value: Double, defaultName: NSString): Unit {
        Native.objc_msgSend("void", this, "setDouble:forKey:", value, defaultName)
    }

    public open fun setBool_forKey(value: Boolean, defaultName: NSString): Unit {
        Native.objc_msgSend("void", this, "setBool:forKey:", value, defaultName)
    }

    public open fun setURL_forKey(url: NSURL, defaultName: NSString): Unit {
        Native.objc_msgSend("void", this, "setURL:forKey:", url, defaultName)
    }

    public open fun registerDefaults(registrationDictionary: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "registerDefaults:", registrationDictionary)
    }

    public open fun addSuiteNamed(suiteName: NSString): Unit {
        Native.objc_msgSend("void", this, "addSuiteNamed:", suiteName)
    }

    public open fun removeSuiteNamed(suiteName: NSString): Unit {
        Native.objc_msgSend("void", this, "removeSuiteNamed:", suiteName)
    }

    public open fun dictionaryRepresentation(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "dictionaryRepresentation") as NSDictionary

    public open fun volatileDomainNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "volatileDomainNames") as NSArray

    public open fun volatileDomainForName(domainName: NSString): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "volatileDomainForName:", domainName) as NSDictionary

    public open fun setVolatileDomain_forName(domain: NSDictionary, domainName: NSString): Unit {
        Native.objc_msgSend("void", this, "setVolatileDomain:forName:", domain, domainName)
    }

    public open fun removeVolatileDomainForName(domainName: NSString): Unit {
        Native.objc_msgSend("void", this, "removeVolatileDomainForName:", domainName)
    }

    public open fun persistentDomainNames(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "persistentDomainNames") as NSArray

    public open fun persistentDomainForName(domainName: NSString): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "persistentDomainForName:", domainName) as NSDictionary

    public open fun setPersistentDomain_forName(domain: NSDictionary, domainName: NSString): Unit {
        Native.objc_msgSend("void", this, "setPersistentDomain:forName:", domain, domainName)
    }

    public open fun removePersistentDomainForName(domainName: NSString): Unit {
        Native.objc_msgSend("void", this, "removePersistentDomainForName:", domainName)
    }

    public open fun synchronize(): Boolean =
        Native.objc_msgSend("boolean", this, "synchronize") as Boolean

    public open fun objectIsForcedForKey(key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "objectIsForcedForKey:", key) as Boolean

    public open fun objectIsForcedForKey_inDomain(key: NSString, domain: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "objectIsForcedForKey:inDomain:", key, domain) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun standardUserDefaults(): NSUserDefaults =
            Native.objc_msgSend("class objc.NSUserDefaults", this, "standardUserDefaults") as NSUserDefaults

        public open fun resetStandardUserDefaults(): Unit {
            Native.objc_msgSend("void", this, "resetStandardUserDefaults")
        }

    }

    companion object : NSObject(Native.objc_getClass("NSUserDefaults")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
