// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSColor.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSColor(pointer: Long) : NSObject(pointer), NSCopying, NSSecureCoding, NSPasteboardReading, NSPasteboardWriting, NSColor_NSQuartzCoreAdditions {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun highlightWithLevel(`val`: Double): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "highlightWithLevel:", `val`) as NSColor

    public open fun shadowWithLevel(`val`: Double): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "shadowWithLevel:", `val`) as NSColor

    public open fun set(): Unit {
        Native.objc_msgSend("void", this, "set")
    }

    public open fun setFill(): Unit {
        Native.objc_msgSend("void", this, "setFill")
    }

    public open fun setStroke(): Unit {
        Native.objc_msgSend("void", this, "setStroke")
    }

    public open fun colorSpaceName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "colorSpaceName") as NSString

    public open fun colorUsingColorSpaceName(colorSpace: NSString): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "colorUsingColorSpaceName:", colorSpace) as NSColor

    public open fun colorUsingColorSpaceName_device(colorSpace: NSString, deviceDescription: NSDictionary): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "colorUsingColorSpaceName:device:", colorSpace, deviceDescription) as NSColor

    public open fun colorUsingColorSpace(space: NSColorSpace): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "colorUsingColorSpace:", space) as NSColor

    public open fun blendedColorWithFraction_ofColor(fraction: Double, color: NSColor): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "blendedColorWithFraction:ofColor:", fraction, color) as NSColor

    public open fun colorWithAlphaComponent(alpha: Double): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "colorWithAlphaComponent:", alpha) as NSColor

    public open fun catalogNameComponent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "catalogNameComponent") as NSString

    public open fun colorNameComponent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "colorNameComponent") as NSString

    public open fun localizedCatalogNameComponent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedCatalogNameComponent") as NSString

    public open fun localizedColorNameComponent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "localizedColorNameComponent") as NSString

    public open fun redComponent(): Double =
        Native.objc_msgSend("double", this, "redComponent") as Double

    public open fun greenComponent(): Double =
        Native.objc_msgSend("double", this, "greenComponent") as Double

    public open fun blueComponent(): Double =
        Native.objc_msgSend("double", this, "blueComponent") as Double

    public open fun getRed_green_blue_alpha(red: Pointer<Double>, green: Pointer<Double>, blue: Pointer<Double>, alpha: Pointer<Double>): Unit {
        Native.objc_msgSend("void", this, "getRed:green:blue:alpha:", red, green, blue, alpha)
    }

    public open fun hueComponent(): Double =
        Native.objc_msgSend("double", this, "hueComponent") as Double

    public open fun saturationComponent(): Double =
        Native.objc_msgSend("double", this, "saturationComponent") as Double

    public open fun brightnessComponent(): Double =
        Native.objc_msgSend("double", this, "brightnessComponent") as Double

    public open fun getHue_saturation_brightness_alpha(hue: Pointer<Double>, saturation: Pointer<Double>, brightness: Pointer<Double>, alpha: Pointer<Double>): Unit {
        Native.objc_msgSend("void", this, "getHue:saturation:brightness:alpha:", hue, saturation, brightness, alpha)
    }

    public open fun whiteComponent(): Double =
        Native.objc_msgSend("double", this, "whiteComponent") as Double

    public open fun getWhite_alpha(white: Pointer<Double>, alpha: Pointer<Double>): Unit {
        Native.objc_msgSend("void", this, "getWhite:alpha:", white, alpha)
    }

    public open fun cyanComponent(): Double =
        Native.objc_msgSend("double", this, "cyanComponent") as Double

    public open fun magentaComponent(): Double =
        Native.objc_msgSend("double", this, "magentaComponent") as Double

    public open fun yellowComponent(): Double =
        Native.objc_msgSend("double", this, "yellowComponent") as Double

    public open fun blackComponent(): Double =
        Native.objc_msgSend("double", this, "blackComponent") as Double

    public open fun getCyan_magenta_yellow_black_alpha(cyan: Pointer<Double>, magenta: Pointer<Double>, yellow: Pointer<Double>, black: Pointer<Double>, alpha: Pointer<Double>): Unit {
        Native.objc_msgSend("void", this, "getCyan:magenta:yellow:black:alpha:", cyan, magenta, yellow, black, alpha)
    }

    public open fun colorSpace(): NSColorSpace =
        Native.objc_msgSend("class objc.NSColorSpace", this, "colorSpace") as NSColorSpace

    public open fun numberOfComponents(): Int =
        Native.objc_msgSend("int", this, "numberOfComponents") as Int

    public open fun getComponents(components: Pointer<Double>): Unit {
        Native.objc_msgSend("void", this, "getComponents:", components)
    }

    public open fun alphaComponent(): Double =
        Native.objc_msgSend("double", this, "alphaComponent") as Double

    public open fun writeToPasteboard(pasteBoard: NSPasteboard): Unit {
        Native.objc_msgSend("void", this, "writeToPasteboard:", pasteBoard)
    }

    public open fun patternImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "patternImage") as NSImage

    public open fun drawSwatchInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "drawSwatchInRect:", rect)
    }

    public open fun CGColor(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGColor") as Pointer<Any>

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSSecureCoding.metaclass, NSPasteboardReading.metaclass, NSPasteboardWriting.metaclass, NSColor_NSQuartzCoreAdditions.metaclass {
        public open fun colorWithCalibratedWhite_alpha(white: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithCalibratedWhite:alpha:", white, alpha) as NSColor

        public open fun colorWithCalibratedHue_saturation_brightness_alpha(hue: Double, saturation: Double, brightness: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithCalibratedHue:saturation:brightness:alpha:", hue, saturation, brightness, alpha) as NSColor

        public open fun colorWithCalibratedRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithCalibratedRed:green:blue:alpha:", red, green, blue, alpha) as NSColor

        public open fun colorWithDeviceWhite_alpha(white: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithDeviceWhite:alpha:", white, alpha) as NSColor

        public open fun colorWithDeviceHue_saturation_brightness_alpha(hue: Double, saturation: Double, brightness: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithDeviceHue:saturation:brightness:alpha:", hue, saturation, brightness, alpha) as NSColor

        public open fun colorWithDeviceRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithDeviceRed:green:blue:alpha:", red, green, blue, alpha) as NSColor

        public open fun colorWithDeviceCyan_magenta_yellow_black_alpha(cyan: Double, magenta: Double, yellow: Double, black: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithDeviceCyan:magenta:yellow:black:alpha:", cyan, magenta, yellow, black, alpha) as NSColor

        public open fun colorWithCatalogName_colorName(listName: NSString, colorName: NSString): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithCatalogName:colorName:", listName, colorName) as NSColor

        public open fun colorWithColorSpace_components_count(space: NSColorSpace, components: Pointer<Double>, numberOfComponents: Int): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithColorSpace:components:count:", space, components, numberOfComponents) as NSColor

        public open fun colorWithGenericGamma22White_alpha(white: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithGenericGamma22White:alpha:", white, alpha) as NSColor

        public open fun colorWithSRGBRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithSRGBRed:green:blue:alpha:", red, green, blue, alpha) as NSColor

        public open fun colorWithWhite_alpha(white: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithWhite:alpha:", white, alpha) as NSColor

        public open fun colorWithRed_green_blue_alpha(red: Double, green: Double, blue: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithRed:green:blue:alpha:", red, green, blue, alpha) as NSColor

        public open fun colorWithHue_saturation_brightness_alpha(hue: Double, saturation: Double, brightness: Double, alpha: Double): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithHue:saturation:brightness:alpha:", hue, saturation, brightness, alpha) as NSColor

        public open fun blackColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "blackColor") as NSColor

        public open fun darkGrayColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "darkGrayColor") as NSColor

        public open fun lightGrayColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "lightGrayColor") as NSColor

        public open fun whiteColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "whiteColor") as NSColor

        public open fun grayColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "grayColor") as NSColor

        public open fun redColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "redColor") as NSColor

        public open fun greenColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "greenColor") as NSColor

        public open fun blueColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "blueColor") as NSColor

        public open fun cyanColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "cyanColor") as NSColor

        public open fun yellowColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "yellowColor") as NSColor

        public open fun magentaColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "magentaColor") as NSColor

        public open fun orangeColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "orangeColor") as NSColor

        public open fun purpleColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "purpleColor") as NSColor

        public open fun brownColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "brownColor") as NSColor

        public open fun clearColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "clearColor") as NSColor

        public open fun controlShadowColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "controlShadowColor") as NSColor

        public open fun controlDarkShadowColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "controlDarkShadowColor") as NSColor

        public open fun controlColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "controlColor") as NSColor

        public open fun controlHighlightColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "controlHighlightColor") as NSColor

        public open fun controlLightHighlightColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "controlLightHighlightColor") as NSColor

        public open fun controlTextColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "controlTextColor") as NSColor

        public open fun controlBackgroundColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "controlBackgroundColor") as NSColor

        public open fun selectedControlColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "selectedControlColor") as NSColor

        public open fun secondarySelectedControlColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "secondarySelectedControlColor") as NSColor

        public open fun selectedControlTextColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "selectedControlTextColor") as NSColor

        public open fun disabledControlTextColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "disabledControlTextColor") as NSColor

        public open fun textColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "textColor") as NSColor

        public open fun textBackgroundColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "textBackgroundColor") as NSColor

        public open fun selectedTextColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "selectedTextColor") as NSColor

        public open fun selectedTextBackgroundColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "selectedTextBackgroundColor") as NSColor

        public open fun gridColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "gridColor") as NSColor

        public open fun keyboardFocusIndicatorColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "keyboardFocusIndicatorColor") as NSColor

        public open fun windowBackgroundColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "windowBackgroundColor") as NSColor

        public open fun underPageBackgroundColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "underPageBackgroundColor") as NSColor

        public open fun labelColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "labelColor") as NSColor

        public open fun secondaryLabelColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "secondaryLabelColor") as NSColor

        public open fun tertiaryLabelColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "tertiaryLabelColor") as NSColor

        public open fun quaternaryLabelColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "quaternaryLabelColor") as NSColor

        public open fun scrollBarColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "scrollBarColor") as NSColor

        public open fun knobColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "knobColor") as NSColor

        public open fun selectedKnobColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "selectedKnobColor") as NSColor

        public open fun windowFrameColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "windowFrameColor") as NSColor

        public open fun windowFrameTextColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "windowFrameTextColor") as NSColor

        public open fun selectedMenuItemColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "selectedMenuItemColor") as NSColor

        public open fun selectedMenuItemTextColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "selectedMenuItemTextColor") as NSColor

        public open fun highlightColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "highlightColor") as NSColor

        public open fun shadowColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "shadowColor") as NSColor

        public open fun headerColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "headerColor") as NSColor

        public open fun headerTextColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "headerTextColor") as NSColor

        public open fun alternateSelectedControlColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "alternateSelectedControlColor") as NSColor

        public open fun alternateSelectedControlTextColor(): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "alternateSelectedControlTextColor") as NSColor

        public open fun controlAlternatingRowBackgroundColors(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "controlAlternatingRowBackgroundColors") as NSArray

        public open fun colorForControlTint(controlTint: Any): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorForControlTint:", controlTint) as NSColor

        public open fun currentControlTint(): Any =
            Native.objc_msgSend("class objc.Any", this, "currentControlTint")

        public open fun colorFromPasteboard(pasteBoard: NSPasteboard): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorFromPasteboard:", pasteBoard) as NSColor

        public open fun colorWithPatternImage(image: NSImage): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithPatternImage:", image) as NSColor

        public open fun colorWithCGColor(cgColor: Pointer<Any>): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithCGColor:", cgColor) as NSColor

        public open fun setIgnoresAlpha(flag: Boolean): Unit {
            Native.objc_msgSend("void", this, "setIgnoresAlpha:", flag)
        }

        public open fun ignoresAlpha(): Boolean =
            Native.objc_msgSend("boolean", this, "ignoresAlpha") as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSColor")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSColor_NSQuartzCoreAdditions : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun colorWithCIColor(color: CIColor): NSColor =
            Native.objc_msgSend("class objc.NSColor", this, "colorWithCIColor:", color) as NSColor
    }
}

trait CIColor_NSAppKitAdditions : IObjCObject {
    public open fun initWithColor(color: NSColor): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithColor:", color) as ObjCObject

    trait metaclass : IObjCObject
}

trait NSCoder_NSAppKitColorExtensions : IObjCObject {
    public open fun decodeNXColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "decodeNXColor") as NSColor

    trait metaclass : IObjCObject
}
