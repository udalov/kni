// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSTextCheckingResult.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTextCheckingResult(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSTextCheckingResult_NSTextCheckingResultOptional, NSTextCheckingResult_NSTextCheckingResultCreation {
    public open fun resultType(): Any =
        Native.objc_msgSend("class objc.Any", this, "resultType")

    public open fun range(): Any =
        Native.objc_msgSend("class objc.Any", this, "range")

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSTextCheckingResult_NSTextCheckingResultOptional.metaclass, NSTextCheckingResult_NSTextCheckingResultCreation.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextCheckingResult")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSTextCheckingResult_NSTextCheckingResultOptional : IObjCObject {
    public open fun orthography(): NSOrthography =
        Native.objc_msgSend("class objc.NSOrthography", this, "orthography") as NSOrthography

    public open fun grammarDetails(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "grammarDetails") as NSArray

    public open fun date(): NSDate =
        Native.objc_msgSend("class objc.NSDate", this, "date") as NSDate

    public open fun timeZone(): NSTimeZone =
        Native.objc_msgSend("class objc.NSTimeZone", this, "timeZone") as NSTimeZone

    public open fun duration(): Double =
        Native.objc_msgSend("double", this, "duration") as Double

    public open fun components(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "components") as NSDictionary

    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    public open fun replacementString(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "replacementString") as NSString

    public open fun alternativeStrings(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "alternativeStrings") as NSArray

    public open fun regularExpression(): NSRegularExpression =
        Native.objc_msgSend("class objc.NSRegularExpression", this, "regularExpression") as NSRegularExpression

    public open fun phoneNumber(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "phoneNumber") as NSString

    public open fun addressComponents(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "addressComponents") as NSDictionary

    public open fun numberOfRanges(): Int =
        Native.objc_msgSend("int", this, "numberOfRanges") as Int

    public open fun rangeAtIndex(idx: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeAtIndex:", idx)

    public open fun resultByAdjustingRangesWithOffset(offset: Int): NSTextCheckingResult =
        Native.objc_msgSend("class objc.NSTextCheckingResult", this, "resultByAdjustingRangesWithOffset:", offset) as NSTextCheckingResult

    trait metaclass : IObjCObject
}

trait NSTextCheckingResult_NSTextCheckingResultCreation : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun orthographyCheckingResultWithRange_orthography(range: Any, orthography: NSOrthography): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "orthographyCheckingResultWithRange:orthography:", range, orthography) as NSTextCheckingResult

        public open fun spellCheckingResultWithRange(range: Any): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "spellCheckingResultWithRange:", range) as NSTextCheckingResult

        public open fun grammarCheckingResultWithRange_details(range: Any, details: NSArray): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "grammarCheckingResultWithRange:details:", range, details) as NSTextCheckingResult

        public open fun dateCheckingResultWithRange_date(range: Any, date: NSDate): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "dateCheckingResultWithRange:date:", range, date) as NSTextCheckingResult

        public open fun dateCheckingResultWithRange_date_timeZone_duration(range: Any, date: NSDate, timeZone: NSTimeZone, duration: Double): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "dateCheckingResultWithRange:date:timeZone:duration:", range, date, timeZone, duration) as NSTextCheckingResult

        public open fun addressCheckingResultWithRange_components(range: Any, components: NSDictionary): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "addressCheckingResultWithRange:components:", range, components) as NSTextCheckingResult

        public open fun linkCheckingResultWithRange_URL(range: Any, url: NSURL): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "linkCheckingResultWithRange:URL:", range, url) as NSTextCheckingResult

        public open fun quoteCheckingResultWithRange_replacementString(range: Any, replacementString: NSString): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "quoteCheckingResultWithRange:replacementString:", range, replacementString) as NSTextCheckingResult

        public open fun dashCheckingResultWithRange_replacementString(range: Any, replacementString: NSString): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "dashCheckingResultWithRange:replacementString:", range, replacementString) as NSTextCheckingResult

        public open fun replacementCheckingResultWithRange_replacementString(range: Any, replacementString: NSString): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "replacementCheckingResultWithRange:replacementString:", range, replacementString) as NSTextCheckingResult

        public open fun correctionCheckingResultWithRange_replacementString(range: Any, replacementString: NSString): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "correctionCheckingResultWithRange:replacementString:", range, replacementString) as NSTextCheckingResult

        public open fun correctionCheckingResultWithRange_replacementString_alternativeStrings(range: Any, replacementString: NSString, alternativeStrings: NSArray): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "correctionCheckingResultWithRange:replacementString:alternativeStrings:", range, replacementString, alternativeStrings) as NSTextCheckingResult

        public open fun regularExpressionCheckingResultWithRanges_count_regularExpression(ranges: Pointer<Any>, count: Int, regularExpression: NSRegularExpression): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "regularExpressionCheckingResultWithRanges:count:regularExpression:", ranges, count, regularExpression) as NSTextCheckingResult

        public open fun phoneNumberCheckingResultWithRange_phoneNumber(range: Any, phoneNumber: NSString): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "phoneNumberCheckingResultWithRange:phoneNumber:", range, phoneNumber) as NSTextCheckingResult

        public open fun transitInformationCheckingResultWithRange_components(range: Any, components: NSDictionary): NSTextCheckingResult =
            Native.objc_msgSend("class objc.NSTextCheckingResult", this, "transitInformationCheckingResultWithRange:components:", range, components) as NSTextCheckingResult
    }
}
