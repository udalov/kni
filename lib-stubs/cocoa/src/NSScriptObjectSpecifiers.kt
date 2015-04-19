// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptObjectSpecifiers.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScriptObjectSpecifier(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun initWithContainerSpecifier_key(container: NSScriptObjectSpecifier, property: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContainerSpecifier:key:", container, property) as ObjCObject

    public open fun initWithContainerClassDescription_containerSpecifier_key(classDesc: NSScriptClassDescription, container: NSScriptObjectSpecifier, property: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContainerClassDescription:containerSpecifier:key:", classDesc, container, property) as ObjCObject

    public open fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun childSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "childSpecifier") as NSScriptObjectSpecifier

    public open fun setChildSpecifier(childSpecifier: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setChildSpecifier:", childSpecifier)
    }

    public open fun containerSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "containerSpecifier") as NSScriptObjectSpecifier

    public open fun setContainerSpecifier(containerSpecifier: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setContainerSpecifier:", containerSpecifier)
    }

    public open fun containerIsObjectBeingTested(): Boolean =
        Native.objc_msgSend("boolean", this, "containerIsObjectBeingTested") as Boolean

    public open fun setContainerIsObjectBeingTested(containerIsObjectBeingTested: Boolean): Unit {
        Native.objc_msgSend("void", this, "setContainerIsObjectBeingTested:", containerIsObjectBeingTested)
    }

    public open fun containerIsRangeContainerObject(): Boolean =
        Native.objc_msgSend("boolean", this, "containerIsRangeContainerObject") as Boolean

    public open fun setContainerIsRangeContainerObject(containerIsRangeContainerObject: Boolean): Unit {
        Native.objc_msgSend("void", this, "setContainerIsRangeContainerObject:", containerIsRangeContainerObject)
    }

    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    public open fun containerClassDescription(): NSScriptClassDescription =
        Native.objc_msgSend("class objc.NSScriptClassDescription", this, "containerClassDescription") as NSScriptClassDescription

    public open fun setContainerClassDescription(containerClassDescription: NSScriptClassDescription): Unit {
        Native.objc_msgSend("void", this, "setContainerClassDescription:", containerClassDescription)
    }

    public open fun keyClassDescription(): NSScriptClassDescription =
        Native.objc_msgSend("class objc.NSScriptClassDescription", this, "keyClassDescription") as NSScriptClassDescription

    public open fun indicesOfObjectsByEvaluatingWithContainer_count(container: ObjCObject, count: Pointer<Int>): Pointer<Int> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "indicesOfObjectsByEvaluatingWithContainer:count:", container, count) as Pointer<Int>

    public open fun objectsByEvaluatingWithContainers(containers: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectsByEvaluatingWithContainers:", containers) as ObjCObject

    public open fun objectsByEvaluatingSpecifier(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectsByEvaluatingSpecifier") as ObjCObject

    public open fun evaluationErrorNumber(): Int =
        Native.objc_msgSend("int", this, "evaluationErrorNumber") as Int

    public open fun setEvaluationErrorNumber(evaluationErrorNumber: Int): Unit {
        Native.objc_msgSend("void", this, "setEvaluationErrorNumber:", evaluationErrorNumber)
    }

    public open fun evaluationErrorSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "evaluationErrorSpecifier") as NSScriptObjectSpecifier

    public open fun descriptor(): NSAppleEventDescriptor =
        Native.objc_msgSend("class objc.NSAppleEventDescriptor", this, "descriptor") as NSAppleEventDescriptor

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
        public open fun objectSpecifierWithDescriptor(descriptor: NSAppleEventDescriptor): NSScriptObjectSpecifier =
            Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "objectSpecifierWithDescriptor:", descriptor) as NSScriptObjectSpecifier

    }

    companion object : NSObject(Native.objc_getClass("NSScriptObjectSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSIndexSpecifier(pointer: Long) : NSScriptObjectSpecifier(pointer) {
    public open fun initWithContainerClassDescription_containerSpecifier_key_index(classDesc: NSScriptClassDescription, container: NSScriptObjectSpecifier, property: NSString, index: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContainerClassDescription:containerSpecifier:key:index:", classDesc, container, property, index) as ObjCObject

    public open fun index(): Int =
        Native.objc_msgSend("int", this, "index") as Int

    public open fun setIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "setIndex:", index)
    }

    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    trait metaclass : NSScriptObjectSpecifier.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSIndexSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSMiddleSpecifier(pointer: Long) : NSScriptObjectSpecifier(pointer) {
    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    trait metaclass : NSScriptObjectSpecifier.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSMiddleSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSNameSpecifier(pointer: Long) : NSScriptObjectSpecifier(pointer) {
    override fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun initWithContainerClassDescription_containerSpecifier_key_name(classDesc: NSScriptClassDescription, container: NSScriptObjectSpecifier, property: NSString, name: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContainerClassDescription:containerSpecifier:key:name:", classDesc, container, property, name) as ObjCObject

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    trait metaclass : NSScriptObjectSpecifier.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSNameSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSPositionalSpecifier(pointer: Long) : NSObject(pointer) {
    public open fun initWithPosition_objectSpecifier(position: Any, specifier: NSScriptObjectSpecifier): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithPosition:objectSpecifier:", position, specifier) as ObjCObject

    public open fun position(): Any =
        Native.objc_msgSend("class objc.Any", this, "position")

    override fun objectSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "objectSpecifier") as NSScriptObjectSpecifier

    public open fun setInsertionClassDescription(classDescription: NSScriptClassDescription): Unit {
        Native.objc_msgSend("void", this, "setInsertionClassDescription:", classDescription)
    }

    public open fun evaluate(): Unit {
        Native.objc_msgSend("void", this, "evaluate")
    }

    public open fun insertionContainer(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "insertionContainer") as ObjCObject

    public open fun insertionKey(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "insertionKey") as NSString

    public open fun insertionIndex(): Int =
        Native.objc_msgSend("int", this, "insertionIndex") as Int

    public open fun insertionReplaces(): Boolean =
        Native.objc_msgSend("boolean", this, "insertionReplaces") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPositionalSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSPropertySpecifier(pointer: Long) : NSScriptObjectSpecifier(pointer) {
    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    trait metaclass : NSScriptObjectSpecifier.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSPropertySpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSRandomSpecifier(pointer: Long) : NSScriptObjectSpecifier(pointer) {
    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    trait metaclass : NSScriptObjectSpecifier.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSRandomSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSRangeSpecifier(pointer: Long) : NSScriptObjectSpecifier(pointer) {
    override fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier(classDesc: NSScriptClassDescription, container: NSScriptObjectSpecifier, property: NSString, startSpec: NSScriptObjectSpecifier, endSpec: NSScriptObjectSpecifier): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContainerClassDescription:containerSpecifier:key:startSpecifier:endSpecifier:", classDesc, container, property, startSpec, endSpec) as ObjCObject

    public open fun startSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "startSpecifier") as NSScriptObjectSpecifier

    public open fun setStartSpecifier(startSpecifier: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setStartSpecifier:", startSpecifier)
    }

    public open fun endSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "endSpecifier") as NSScriptObjectSpecifier

    public open fun setEndSpecifier(endSpecifier: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setEndSpecifier:", endSpecifier)
    }

    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    trait metaclass : NSScriptObjectSpecifier.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSRangeSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSRelativeSpecifier(pointer: Long) : NSScriptObjectSpecifier(pointer) {
    override fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier(classDesc: NSScriptClassDescription, container: NSScriptObjectSpecifier, property: NSString, relPos: Any, baseSpecifier: NSScriptObjectSpecifier): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContainerClassDescription:containerSpecifier:key:relativePosition:baseSpecifier:", classDesc, container, property, relPos, baseSpecifier) as ObjCObject

    public open fun relativePosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "relativePosition")

    public open fun setRelativePosition(relativePosition: Any): Unit {
        Native.objc_msgSend("void", this, "setRelativePosition:", relativePosition)
    }

    public open fun baseSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "baseSpecifier") as NSScriptObjectSpecifier

    public open fun setBaseSpecifier(baseSpecifier: NSScriptObjectSpecifier): Unit {
        Native.objc_msgSend("void", this, "setBaseSpecifier:", baseSpecifier)
    }

    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    trait metaclass : NSScriptObjectSpecifier.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSRelativeSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSUniqueIDSpecifier(pointer: Long) : NSScriptObjectSpecifier(pointer) {
    override fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun initWithContainerClassDescription_containerSpecifier_key_uniqueID(classDesc: NSScriptClassDescription, container: NSScriptObjectSpecifier, property: NSString, uniqueID: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContainerClassDescription:containerSpecifier:key:uniqueID:", classDesc, container, property, uniqueID) as ObjCObject

    public open fun uniqueID(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "uniqueID") as ObjCObject

    public open fun setUniqueID(uniqueID: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setUniqueID:", uniqueID)
    }

    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    trait metaclass : NSScriptObjectSpecifier.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSUniqueIDSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSWhoseSpecifier(pointer: Long) : NSScriptObjectSpecifier(pointer) {
    override fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun initWithContainerClassDescription_containerSpecifier_key_test(classDesc: NSScriptClassDescription, container: NSScriptObjectSpecifier, property: NSString, test: NSScriptWhoseTest): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContainerClassDescription:containerSpecifier:key:test:", classDesc, container, property, test) as ObjCObject

    public open fun test(): NSScriptWhoseTest =
        Native.objc_msgSend("class objc.NSScriptWhoseTest", this, "test") as NSScriptWhoseTest

    public open fun setTest(test: NSScriptWhoseTest): Unit {
        Native.objc_msgSend("void", this, "setTest:", test)
    }

    public open fun startSubelementIdentifier(): Any =
        Native.objc_msgSend("class objc.Any", this, "startSubelementIdentifier")

    public open fun setStartSubelementIdentifier(startSubelementIdentifier: Any): Unit {
        Native.objc_msgSend("void", this, "setStartSubelementIdentifier:", startSubelementIdentifier)
    }

    public open fun startSubelementIndex(): Int =
        Native.objc_msgSend("int", this, "startSubelementIndex") as Int

    public open fun setStartSubelementIndex(startSubelementIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setStartSubelementIndex:", startSubelementIndex)
    }

    public open fun endSubelementIdentifier(): Any =
        Native.objc_msgSend("class objc.Any", this, "endSubelementIdentifier")

    public open fun setEndSubelementIdentifier(endSubelementIdentifier: Any): Unit {
        Native.objc_msgSend("void", this, "setEndSubelementIdentifier:", endSubelementIdentifier)
    }

    public open fun endSubelementIndex(): Int =
        Native.objc_msgSend("int", this, "endSubelementIndex") as Int

    public open fun setEndSubelementIndex(endSubelementIndex: Int): Unit {
        Native.objc_msgSend("void", this, "setEndSubelementIndex:", endSubelementIndex)
    }

    override fun key(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "key") as NSString

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun setKey(key: NSString): Unit {
        Native.objc_msgSend("void", this, "setKey:", key)
    }

    trait metaclass : NSScriptObjectSpecifier.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSWhoseSpecifier")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSScriptObjectSpecifiers : IObjCObject {
    public open fun objectSpecifier(): NSScriptObjectSpecifier =
        Native.objc_msgSend("class objc.NSScriptObjectSpecifier", this, "objectSpecifier") as NSScriptObjectSpecifier

    public open fun indicesOfObjectsByEvaluatingObjectSpecifier(specifier: NSScriptObjectSpecifier): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "indicesOfObjectsByEvaluatingObjectSpecifier:", specifier) as NSArray

    trait metaclass : IObjCObject
}
