// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSExpression.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSExpression(pointer: Long) : NSObject(pointer), NSSecureCoding, NSCopying {
    public open fun initWithExpressionType(type: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithExpressionType:", type) as ObjCObject

    public open fun expressionType(): Any =
        Native.objc_msgSend("class objc.Any", this, "expressionType")

    public open fun constantValue(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "constantValue") as ObjCObject

    public open fun keyPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "keyPath") as NSString

    public open fun function(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "function") as NSString

    public open fun variable(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "variable") as NSString

    public open fun operand(): NSExpression =
        Native.objc_msgSend("class objc.NSExpression", this, "operand") as NSExpression

    public open fun arguments(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "arguments") as NSArray

    public open fun collection(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "collection") as ObjCObject

    public open fun predicate(): NSPredicate =
        Native.objc_msgSend("class objc.NSPredicate", this, "predicate") as NSPredicate

    public open fun leftExpression(): NSExpression =
        Native.objc_msgSend("class objc.NSExpression", this, "leftExpression") as NSExpression

    public open fun rightExpression(): NSExpression =
        Native.objc_msgSend("class objc.NSExpression", this, "rightExpression") as NSExpression

    public open fun expressionBlock(): Any =
        Native.objc_msgSend("class objc.Any", this, "expressionBlock")

    public open fun expressionValueWithObject_context(`object`: ObjCObject, context: NSMutableDictionary): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "expressionValueWithObject:context:", `object`, context) as ObjCObject

    public open fun allowEvaluation(): Unit {
        Native.objc_msgSend("void", this, "allowEvaluation")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSCopying.metaclass {
        public open fun expressionWithFormat_argumentArray(expressionFormat: NSString, arguments: NSArray): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionWithFormat:argumentArray:", expressionFormat, arguments) as NSExpression

        public open fun expressionWithFormat(expressionFormat: NSString): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionWithFormat:", expressionFormat) as NSExpression

        public open fun expressionWithFormat_arguments(expressionFormat: NSString, argList: Any): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionWithFormat:arguments:", expressionFormat, argList) as NSExpression

        public open fun expressionForConstantValue(obj: ObjCObject): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForConstantValue:", obj) as NSExpression

        public open fun expressionForEvaluatedObject(): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForEvaluatedObject") as NSExpression

        public open fun expressionForVariable(string: NSString): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForVariable:", string) as NSExpression

        public open fun expressionForKeyPath(keyPath: NSString): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForKeyPath:", keyPath) as NSExpression

        public open fun expressionForFunction_arguments(name: NSString, parameters: NSArray): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForFunction:arguments:", name, parameters) as NSExpression

        public open fun expressionForAggregate(subexpressions: NSArray): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForAggregate:", subexpressions) as NSExpression

        public open fun expressionForUnionSet_with(left: NSExpression, right: NSExpression): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForUnionSet:with:", left, right) as NSExpression

        public open fun expressionForIntersectSet_with(left: NSExpression, right: NSExpression): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForIntersectSet:with:", left, right) as NSExpression

        public open fun expressionForMinusSet_with(left: NSExpression, right: NSExpression): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForMinusSet:with:", left, right) as NSExpression

        public open fun expressionForSubquery_usingIteratorVariable_predicate(expression: NSExpression, variable: NSString, predicate: ObjCObject): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForSubquery:usingIteratorVariable:predicate:", expression, variable, predicate) as NSExpression

        public open fun expressionForFunction_selectorName_arguments(target: NSExpression, name: NSString, parameters: NSArray): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForFunction:selectorName:arguments:", target, name, parameters) as NSExpression

        public open fun expressionForAnyKey(): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForAnyKey") as NSExpression

        public open fun expressionForBlock_arguments(block: Any, arguments: NSArray): NSExpression =
            Native.objc_msgSend("class objc.NSExpression", this, "expressionForBlock:arguments:", block, arguments) as NSExpression

    }

    companion object : NSObject(Native.objc_getClass("NSExpression")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
