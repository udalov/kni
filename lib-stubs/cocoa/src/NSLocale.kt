// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSLocale.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSLocale(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding, NSLocale_NSExtendedLocale, NSLocale_NSLocaleCreation, NSLocale_NSLocaleGeneralInfo {
    public open fun objectForKey(key: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectForKey:", key) as ObjCObject

    public open fun displayNameForKey_value(key: ObjCObject, value: ObjCObject): NSString =
        Native.objc_msgSend("class objc.NSString", this, "displayNameForKey:value:", key, value) as NSString

    public open fun initWithLocaleIdentifier(string: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithLocaleIdentifier:", string) as ObjCObject

    public open fun initWithCoder(aDecoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", aDecoder) as ObjCObject

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass, NSLocale_NSExtendedLocale.metaclass, NSLocale_NSLocaleCreation.metaclass, NSLocale_NSLocaleGeneralInfo.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSLocale")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSLocale_NSExtendedLocale : IObjCObject {
    public open fun localeIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localeIdentifier") as NSString

    trait metaclass : IObjCObject
}

trait NSLocale_NSLocaleCreation : IObjCObject {
    public open fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    trait metaclass : IObjCObject {
        public open fun autoupdatingCurrentLocale(): NSLocale =
            Native.objc_msgSend("class objc.NSLocale", this, "autoupdatingCurrentLocale") as NSLocale

        public open fun currentLocale(): NSLocale =
            Native.objc_msgSend("class objc.NSLocale", this, "currentLocale") as NSLocale

        public open fun systemLocale(): NSLocale =
            Native.objc_msgSend("class objc.NSLocale", this, "systemLocale") as NSLocale

        public open fun localeWithLocaleIdentifier(ident: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "localeWithLocaleIdentifier:", ident) as ObjCObject
    }
}

trait NSLocale_NSLocaleGeneralInfo : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun availableLocaleIdentifiers(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "availableLocaleIdentifiers") as NSArray

        public open fun ISOLanguageCodes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "ISOLanguageCodes") as NSArray

        public open fun ISOCountryCodes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "ISOCountryCodes") as NSArray

        public open fun ISOCurrencyCodes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "ISOCurrencyCodes") as NSArray

        public open fun commonISOCurrencyCodes(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "commonISOCurrencyCodes") as NSArray

        public open fun preferredLanguages(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "preferredLanguages") as NSArray

        public open fun componentsFromLocaleIdentifier(string: NSString): NSDictionary =
            Native.objc_msgSend("class objc.NSDictionary", this, "componentsFromLocaleIdentifier:", string) as NSDictionary

        public open fun localeIdentifierFromComponents(dict: NSDictionary): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localeIdentifierFromComponents:", dict) as NSString

        public open fun canonicalLocaleIdentifierFromString(string: NSString): NSString =
            Native.objc_msgSend("class objc.NSString", this, "canonicalLocaleIdentifierFromString:", string) as NSString

        public open fun canonicalLanguageIdentifierFromString(string: NSString): NSString =
            Native.objc_msgSend("class objc.NSString", this, "canonicalLanguageIdentifierFromString:", string) as NSString

        public open fun localeIdentifierFromWindowsLocaleCode(lcid: Int): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localeIdentifierFromWindowsLocaleCode:", lcid) as NSString

        public open fun windowsLocaleCodeFromLocaleIdentifier(localeIdentifier: NSString): Int =
            Native.objc_msgSend("int", this, "windowsLocaleCodeFromLocaleIdentifier:", localeIdentifier) as Int

        public open fun characterDirectionForLanguage(isoLangCode: NSString): Any =
            Native.objc_msgSend("class objc.Any", this, "characterDirectionForLanguage:", isoLangCode)

        public open fun lineDirectionForLanguage(isoLangCode: NSString): Any =
            Native.objc_msgSend("class objc.Any", this, "lineDirectionForLanguage:", isoLangCode)
    }
}
