// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSScriptWhoseTests.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScriptWhoseTest(pointer: Long) : NSObject(pointer), NSCoding {
    public open fun isTrue(): Boolean =
        Native.objc_msgSend("boolean", this, "isTrue") as Boolean

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSScriptWhoseTest")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSLogicalTest(pointer: Long) : NSScriptWhoseTest(pointer) {
    public open fun initAndTestWithTests(subTests: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initAndTestWithTests:", subTests) as ObjCObject

    public open fun initOrTestWithTests(subTests: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initOrTestWithTests:", subTests) as ObjCObject

    public open fun initNotTestWithTest(subTest: NSScriptWhoseTest): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initNotTestWithTest:", subTest) as ObjCObject

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptWhoseTest.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSLogicalTest")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSSpecifierTest(pointer: Long) : NSScriptWhoseTest(pointer) {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(inCoder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", inCoder) as ObjCObject

    public open fun initWithObjectSpecifier_comparisonOperator_testObject(obj1: NSScriptObjectSpecifier, compOp: Any, obj2: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithObjectSpecifier:comparisonOperator:testObject:", obj1, compOp, obj2) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSScriptWhoseTest.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSpecifierTest")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSComparisonMethods : IObjCObject {
    public open fun isEqualTo(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "isEqualTo:", `object`) as Boolean

    public open fun isLessThanOrEqualTo(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "isLessThanOrEqualTo:", `object`) as Boolean

    public open fun isLessThan(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "isLessThan:", `object`) as Boolean

    public open fun isGreaterThanOrEqualTo(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "isGreaterThanOrEqualTo:", `object`) as Boolean

    public open fun isGreaterThan(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "isGreaterThan:", `object`) as Boolean

    public open fun isNotEqualTo(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "isNotEqualTo:", `object`) as Boolean

    public open fun doesContain(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "doesContain:", `object`) as Boolean

    public open fun isLike(`object`: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isLike:", `object`) as Boolean

    public open fun isCaseInsensitiveLike(`object`: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isCaseInsensitiveLike:", `object`) as Boolean

    trait metaclass : IObjCObject
}

trait NSObject_NSScriptingComparisonMethods : IObjCObject {
    public open fun scriptingIsEqualTo(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "scriptingIsEqualTo:", `object`) as Boolean

    public open fun scriptingIsLessThanOrEqualTo(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "scriptingIsLessThanOrEqualTo:", `object`) as Boolean

    public open fun scriptingIsLessThan(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "scriptingIsLessThan:", `object`) as Boolean

    public open fun scriptingIsGreaterThanOrEqualTo(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "scriptingIsGreaterThanOrEqualTo:", `object`) as Boolean

    public open fun scriptingIsGreaterThan(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "scriptingIsGreaterThan:", `object`) as Boolean

    public open fun scriptingBeginsWith(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "scriptingBeginsWith:", `object`) as Boolean

    public open fun scriptingEndsWith(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "scriptingEndsWith:", `object`) as Boolean

    public open fun scriptingContains(`object`: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "scriptingContains:", `object`) as Boolean

    trait metaclass : IObjCObject
}
