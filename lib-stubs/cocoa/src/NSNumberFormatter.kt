// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSNumberFormatter.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSNumberFormatter(pointer: Long) : NSFormatter(pointer), NSNumberFormatter_NSNumberFormatterCompatibility {
    public open fun formattingContext(): Any =
        Native.objc_msgSend("class objc.Any", this, "formattingContext")

    public open fun setFormattingContext(formattingContext: Any): Unit {
        Native.objc_msgSend("void", this, "setFormattingContext:", formattingContext)
    }

    public open fun getObjectValue_forString_range_error(obj: Pointer<ObjCObject>, string: NSString, rangep: Pointer<Any>, error: Pointer<NSError>): Boolean =
        Native.objc_msgSend("boolean", this, "getObjectValue:forString:range:error:", obj, string, rangep, error) as Boolean

    public open fun stringFromNumber(number: NSNumber): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringFromNumber:", number) as NSString

    public open fun numberFromString(string: NSString): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "numberFromString:", string) as NSNumber

    public open fun numberStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "numberStyle")

    public open fun setNumberStyle(numberStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setNumberStyle:", numberStyle)
    }

    public open fun locale(): NSLocale =
        Native.objc_msgSend("class objc.NSLocale", this, "locale") as NSLocale

    public open fun setLocale(locale: NSLocale): Unit {
        Native.objc_msgSend("void", this, "setLocale:", locale)
    }

    public open fun generatesDecimalNumbers(): Boolean =
        Native.objc_msgSend("boolean", this, "generatesDecimalNumbers") as Boolean

    public open fun setGeneratesDecimalNumbers(generatesDecimalNumbers: Boolean): Unit {
        Native.objc_msgSend("void", this, "setGeneratesDecimalNumbers:", generatesDecimalNumbers)
    }

    public open fun formatterBehavior(): Any =
        Native.objc_msgSend("class objc.Any", this, "formatterBehavior")

    public open fun setFormatterBehavior(formatterBehavior: Any): Unit {
        Native.objc_msgSend("void", this, "setFormatterBehavior:", formatterBehavior)
    }

    public open fun negativeFormat(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "negativeFormat") as NSString

    public open fun setNegativeFormat(negativeFormat: NSString): Unit {
        Native.objc_msgSend("void", this, "setNegativeFormat:", negativeFormat)
    }

    public open fun textAttributesForNegativeValues(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "textAttributesForNegativeValues") as NSDictionary

    public open fun setTextAttributesForNegativeValues(textAttributesForNegativeValues: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setTextAttributesForNegativeValues:", textAttributesForNegativeValues)
    }

    public open fun positiveFormat(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "positiveFormat") as NSString

    public open fun setPositiveFormat(positiveFormat: NSString): Unit {
        Native.objc_msgSend("void", this, "setPositiveFormat:", positiveFormat)
    }

    public open fun textAttributesForPositiveValues(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "textAttributesForPositiveValues") as NSDictionary

    public open fun setTextAttributesForPositiveValues(textAttributesForPositiveValues: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setTextAttributesForPositiveValues:", textAttributesForPositiveValues)
    }

    public open fun allowsFloats(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsFloats") as Boolean

    public open fun setAllowsFloats(allowsFloats: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsFloats:", allowsFloats)
    }

    public open fun decimalSeparator(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "decimalSeparator") as NSString

    public open fun setDecimalSeparator(decimalSeparator: NSString): Unit {
        Native.objc_msgSend("void", this, "setDecimalSeparator:", decimalSeparator)
    }

    public open fun alwaysShowsDecimalSeparator(): Boolean =
        Native.objc_msgSend("boolean", this, "alwaysShowsDecimalSeparator") as Boolean

    public open fun setAlwaysShowsDecimalSeparator(alwaysShowsDecimalSeparator: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAlwaysShowsDecimalSeparator:", alwaysShowsDecimalSeparator)
    }

    public open fun currencyDecimalSeparator(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "currencyDecimalSeparator") as NSString

    public open fun setCurrencyDecimalSeparator(currencyDecimalSeparator: NSString): Unit {
        Native.objc_msgSend("void", this, "setCurrencyDecimalSeparator:", currencyDecimalSeparator)
    }

    public open fun usesGroupingSeparator(): Boolean =
        Native.objc_msgSend("boolean", this, "usesGroupingSeparator") as Boolean

    public open fun setUsesGroupingSeparator(usesGroupingSeparator: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesGroupingSeparator:", usesGroupingSeparator)
    }

    public open fun groupingSeparator(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "groupingSeparator") as NSString

    public open fun setGroupingSeparator(groupingSeparator: NSString): Unit {
        Native.objc_msgSend("void", this, "setGroupingSeparator:", groupingSeparator)
    }

    public open fun zeroSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "zeroSymbol") as NSString

    public open fun setZeroSymbol(zeroSymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setZeroSymbol:", zeroSymbol)
    }

    public open fun textAttributesForZero(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "textAttributesForZero") as NSDictionary

    public open fun setTextAttributesForZero(textAttributesForZero: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setTextAttributesForZero:", textAttributesForZero)
    }

    public open fun nilSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "nilSymbol") as NSString

    public open fun setNilSymbol(nilSymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setNilSymbol:", nilSymbol)
    }

    public open fun textAttributesForNil(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "textAttributesForNil") as NSDictionary

    public open fun setTextAttributesForNil(textAttributesForNil: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setTextAttributesForNil:", textAttributesForNil)
    }

    public open fun notANumberSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "notANumberSymbol") as NSString

    public open fun setNotANumberSymbol(notANumberSymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setNotANumberSymbol:", notANumberSymbol)
    }

    public open fun textAttributesForNotANumber(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "textAttributesForNotANumber") as NSDictionary

    public open fun setTextAttributesForNotANumber(textAttributesForNotANumber: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setTextAttributesForNotANumber:", textAttributesForNotANumber)
    }

    public open fun positiveInfinitySymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "positiveInfinitySymbol") as NSString

    public open fun setPositiveInfinitySymbol(positiveInfinitySymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setPositiveInfinitySymbol:", positiveInfinitySymbol)
    }

    public open fun textAttributesForPositiveInfinity(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "textAttributesForPositiveInfinity") as NSDictionary

    public open fun setTextAttributesForPositiveInfinity(textAttributesForPositiveInfinity: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setTextAttributesForPositiveInfinity:", textAttributesForPositiveInfinity)
    }

    public open fun negativeInfinitySymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "negativeInfinitySymbol") as NSString

    public open fun setNegativeInfinitySymbol(negativeInfinitySymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setNegativeInfinitySymbol:", negativeInfinitySymbol)
    }

    public open fun textAttributesForNegativeInfinity(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "textAttributesForNegativeInfinity") as NSDictionary

    public open fun setTextAttributesForNegativeInfinity(textAttributesForNegativeInfinity: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setTextAttributesForNegativeInfinity:", textAttributesForNegativeInfinity)
    }

    public open fun positivePrefix(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "positivePrefix") as NSString

    public open fun setPositivePrefix(positivePrefix: NSString): Unit {
        Native.objc_msgSend("void", this, "setPositivePrefix:", positivePrefix)
    }

    public open fun positiveSuffix(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "positiveSuffix") as NSString

    public open fun setPositiveSuffix(positiveSuffix: NSString): Unit {
        Native.objc_msgSend("void", this, "setPositiveSuffix:", positiveSuffix)
    }

    public open fun negativePrefix(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "negativePrefix") as NSString

    public open fun setNegativePrefix(negativePrefix: NSString): Unit {
        Native.objc_msgSend("void", this, "setNegativePrefix:", negativePrefix)
    }

    public open fun negativeSuffix(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "negativeSuffix") as NSString

    public open fun setNegativeSuffix(negativeSuffix: NSString): Unit {
        Native.objc_msgSend("void", this, "setNegativeSuffix:", negativeSuffix)
    }

    public open fun currencyCode(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "currencyCode") as NSString

    public open fun setCurrencyCode(currencyCode: NSString): Unit {
        Native.objc_msgSend("void", this, "setCurrencyCode:", currencyCode)
    }

    public open fun currencySymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "currencySymbol") as NSString

    public open fun setCurrencySymbol(currencySymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setCurrencySymbol:", currencySymbol)
    }

    public open fun internationalCurrencySymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "internationalCurrencySymbol") as NSString

    public open fun setInternationalCurrencySymbol(internationalCurrencySymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setInternationalCurrencySymbol:", internationalCurrencySymbol)
    }

    public open fun percentSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "percentSymbol") as NSString

    public open fun setPercentSymbol(percentSymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setPercentSymbol:", percentSymbol)
    }

    public open fun perMillSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "perMillSymbol") as NSString

    public open fun setPerMillSymbol(perMillSymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setPerMillSymbol:", perMillSymbol)
    }

    public open fun minusSign(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "minusSign") as NSString

    public open fun setMinusSign(minusSign: NSString): Unit {
        Native.objc_msgSend("void", this, "setMinusSign:", minusSign)
    }

    public open fun plusSign(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "plusSign") as NSString

    public open fun setPlusSign(plusSign: NSString): Unit {
        Native.objc_msgSend("void", this, "setPlusSign:", plusSign)
    }

    public open fun exponentSymbol(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "exponentSymbol") as NSString

    public open fun setExponentSymbol(exponentSymbol: NSString): Unit {
        Native.objc_msgSend("void", this, "setExponentSymbol:", exponentSymbol)
    }

    public open fun groupingSize(): Int =
        Native.objc_msgSend("int", this, "groupingSize") as Int

    public open fun setGroupingSize(groupingSize: Int): Unit {
        Native.objc_msgSend("void", this, "setGroupingSize:", groupingSize)
    }

    public open fun secondaryGroupingSize(): Int =
        Native.objc_msgSend("int", this, "secondaryGroupingSize") as Int

    public open fun setSecondaryGroupingSize(secondaryGroupingSize: Int): Unit {
        Native.objc_msgSend("void", this, "setSecondaryGroupingSize:", secondaryGroupingSize)
    }

    public open fun multiplier(): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "multiplier") as NSNumber

    public open fun setMultiplier(multiplier: NSNumber): Unit {
        Native.objc_msgSend("void", this, "setMultiplier:", multiplier)
    }

    public open fun formatWidth(): Int =
        Native.objc_msgSend("int", this, "formatWidth") as Int

    public open fun setFormatWidth(formatWidth: Int): Unit {
        Native.objc_msgSend("void", this, "setFormatWidth:", formatWidth)
    }

    public open fun paddingCharacter(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "paddingCharacter") as NSString

    public open fun setPaddingCharacter(paddingCharacter: NSString): Unit {
        Native.objc_msgSend("void", this, "setPaddingCharacter:", paddingCharacter)
    }

    public open fun paddingPosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "paddingPosition")

    public open fun setPaddingPosition(paddingPosition: Any): Unit {
        Native.objc_msgSend("void", this, "setPaddingPosition:", paddingPosition)
    }

    public open fun roundingMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "roundingMode")

    public open fun setRoundingMode(roundingMode: Any): Unit {
        Native.objc_msgSend("void", this, "setRoundingMode:", roundingMode)
    }

    public open fun roundingIncrement(): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "roundingIncrement") as NSNumber

    public open fun setRoundingIncrement(roundingIncrement: NSNumber): Unit {
        Native.objc_msgSend("void", this, "setRoundingIncrement:", roundingIncrement)
    }

    public open fun minimumIntegerDigits(): Int =
        Native.objc_msgSend("int", this, "minimumIntegerDigits") as Int

    public open fun setMinimumIntegerDigits(minimumIntegerDigits: Int): Unit {
        Native.objc_msgSend("void", this, "setMinimumIntegerDigits:", minimumIntegerDigits)
    }

    public open fun maximumIntegerDigits(): Int =
        Native.objc_msgSend("int", this, "maximumIntegerDigits") as Int

    public open fun setMaximumIntegerDigits(maximumIntegerDigits: Int): Unit {
        Native.objc_msgSend("void", this, "setMaximumIntegerDigits:", maximumIntegerDigits)
    }

    public open fun minimumFractionDigits(): Int =
        Native.objc_msgSend("int", this, "minimumFractionDigits") as Int

    public open fun setMinimumFractionDigits(minimumFractionDigits: Int): Unit {
        Native.objc_msgSend("void", this, "setMinimumFractionDigits:", minimumFractionDigits)
    }

    public open fun maximumFractionDigits(): Int =
        Native.objc_msgSend("int", this, "maximumFractionDigits") as Int

    public open fun setMaximumFractionDigits(maximumFractionDigits: Int): Unit {
        Native.objc_msgSend("void", this, "setMaximumFractionDigits:", maximumFractionDigits)
    }

    public open fun minimum(): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "minimum") as NSNumber

    public open fun setMinimum(minimum: NSNumber): Unit {
        Native.objc_msgSend("void", this, "setMinimum:", minimum)
    }

    public open fun maximum(): NSNumber =
        Native.objc_msgSend("class objc.NSNumber", this, "maximum") as NSNumber

    public open fun setMaximum(maximum: NSNumber): Unit {
        Native.objc_msgSend("void", this, "setMaximum:", maximum)
    }

    public open fun currencyGroupingSeparator(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "currencyGroupingSeparator") as NSString

    public open fun setCurrencyGroupingSeparator(currencyGroupingSeparator: NSString): Unit {
        Native.objc_msgSend("void", this, "setCurrencyGroupingSeparator:", currencyGroupingSeparator)
    }

    public open fun isLenient(): Boolean =
        Native.objc_msgSend("boolean", this, "isLenient") as Boolean

    public open fun setLenient(lenient: Boolean): Unit {
        Native.objc_msgSend("void", this, "setLenient:", lenient)
    }

    public open fun usesSignificantDigits(): Boolean =
        Native.objc_msgSend("boolean", this, "usesSignificantDigits") as Boolean

    public open fun setUsesSignificantDigits(usesSignificantDigits: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesSignificantDigits:", usesSignificantDigits)
    }

    public open fun minimumSignificantDigits(): Int =
        Native.objc_msgSend("int", this, "minimumSignificantDigits") as Int

    public open fun setMinimumSignificantDigits(minimumSignificantDigits: Int): Unit {
        Native.objc_msgSend("void", this, "setMinimumSignificantDigits:", minimumSignificantDigits)
    }

    public open fun maximumSignificantDigits(): Int =
        Native.objc_msgSend("int", this, "maximumSignificantDigits") as Int

    public open fun setMaximumSignificantDigits(maximumSignificantDigits: Int): Unit {
        Native.objc_msgSend("void", this, "setMaximumSignificantDigits:", maximumSignificantDigits)
    }

    public open fun isPartialStringValidationEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isPartialStringValidationEnabled") as Boolean

    public open fun setPartialStringValidationEnabled(partialStringValidationEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPartialStringValidationEnabled:", partialStringValidationEnabled)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSFormatter.metaclass, NSNumberFormatter_NSNumberFormatterCompatibility.metaclass {
        public open fun localizedStringFromNumber_numberStyle(num: NSNumber, nstyle: Any): NSString =
            Native.objc_msgSend("class objc.NSString", this, "localizedStringFromNumber:numberStyle:", num, nstyle) as NSString

        public open fun defaultFormatterBehavior(): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultFormatterBehavior")

        public open fun setDefaultFormatterBehavior(behavior: Any): Unit {
            Native.objc_msgSend("void", this, "setDefaultFormatterBehavior:", behavior)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSNumberFormatter")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSNumberFormatter_NSNumberFormatterCompatibility : IObjCObject {
    public open fun hasThousandSeparators(): Boolean =
        Native.objc_msgSend("boolean", this, "hasThousandSeparators") as Boolean

    public open fun setHasThousandSeparators(hasThousandSeparators: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasThousandSeparators:", hasThousandSeparators)
    }

    public open fun thousandSeparator(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "thousandSeparator") as NSString

    public open fun setThousandSeparator(thousandSeparator: NSString): Unit {
        Native.objc_msgSend("void", this, "setThousandSeparator:", thousandSeparator)
    }

    public open fun localizesFormat(): Boolean =
        Native.objc_msgSend("boolean", this, "localizesFormat") as Boolean

    public open fun setLocalizesFormat(localizesFormat: Boolean): Unit {
        Native.objc_msgSend("void", this, "setLocalizesFormat:", localizesFormat)
    }

    public open fun format(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "format") as NSString

    public open fun setFormat(format: NSString): Unit {
        Native.objc_msgSend("void", this, "setFormat:", format)
    }

    public open fun attributedStringForZero(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedStringForZero") as NSAttributedString

    public open fun setAttributedStringForZero(attributedStringForZero: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedStringForZero:", attributedStringForZero)
    }

    public open fun attributedStringForNil(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedStringForNil") as NSAttributedString

    public open fun setAttributedStringForNil(attributedStringForNil: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedStringForNil:", attributedStringForNil)
    }

    public open fun attributedStringForNotANumber(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedStringForNotANumber") as NSAttributedString

    public open fun setAttributedStringForNotANumber(attributedStringForNotANumber: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedStringForNotANumber:", attributedStringForNotANumber)
    }

    public open fun roundingBehavior(): NSDecimalNumberHandler =
        Native.objc_msgSend("class objc.NSDecimalNumberHandler", this, "roundingBehavior") as NSDecimalNumberHandler

    public open fun setRoundingBehavior(roundingBehavior: NSDecimalNumberHandler): Unit {
        Native.objc_msgSend("void", this, "setRoundingBehavior:", roundingBehavior)
    }

    trait metaclass : IObjCObject
}
