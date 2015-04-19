// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSEvent.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSEvent(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun type(): Any =
        Native.objc_msgSend("class objc.Any", this, "type")

    public open fun modifierFlags(): Any =
        Native.objc_msgSend("class objc.Any", this, "modifierFlags")

    public open fun timestamp(): Double =
        Native.objc_msgSend("double", this, "timestamp") as Double

    public open fun window(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "window") as NSWindow

    public open fun windowNumber(): Int =
        Native.objc_msgSend("int", this, "windowNumber") as Int

    public open fun context(): NSGraphicsContext =
        Native.objc_msgSend("class objc.NSGraphicsContext", this, "context") as NSGraphicsContext

    public open fun clickCount(): Int =
        Native.objc_msgSend("int", this, "clickCount") as Int

    public open fun buttonNumber(): Int =
        Native.objc_msgSend("int", this, "buttonNumber") as Int

    public open fun eventNumber(): Int =
        Native.objc_msgSend("int", this, "eventNumber") as Int

    public open fun pressure(): Float =
        Native.objc_msgSend("float", this, "pressure") as Float

    public open fun locationInWindow(): Any =
        Native.objc_msgSend("class objc.Any", this, "locationInWindow")

    public open fun deltaX(): Double =
        Native.objc_msgSend("double", this, "deltaX") as Double

    public open fun deltaY(): Double =
        Native.objc_msgSend("double", this, "deltaY") as Double

    public open fun deltaZ(): Double =
        Native.objc_msgSend("double", this, "deltaZ") as Double

    public open fun hasPreciseScrollingDeltas(): Boolean =
        Native.objc_msgSend("boolean", this, "hasPreciseScrollingDeltas") as Boolean

    public open fun scrollingDeltaX(): Double =
        Native.objc_msgSend("double", this, "scrollingDeltaX") as Double

    public open fun scrollingDeltaY(): Double =
        Native.objc_msgSend("double", this, "scrollingDeltaY") as Double

    public open fun momentumPhase(): Any =
        Native.objc_msgSend("class objc.Any", this, "momentumPhase")

    public open fun isDirectionInvertedFromDevice(): Boolean =
        Native.objc_msgSend("boolean", this, "isDirectionInvertedFromDevice") as Boolean

    public open fun characters(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "characters") as NSString

    public open fun charactersIgnoringModifiers(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "charactersIgnoringModifiers") as NSString

    public open fun isARepeat(): Boolean =
        Native.objc_msgSend("boolean", this, "isARepeat") as Boolean

    public open fun keyCode(): Short =
        Native.objc_msgSend("short", this, "keyCode") as Short

    public open fun trackingNumber(): Int =
        Native.objc_msgSend("int", this, "trackingNumber") as Int

    public open fun userData(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "userData") as Pointer<*>

    public open fun trackingArea(): NSTrackingArea =
        Native.objc_msgSend("class objc.NSTrackingArea", this, "trackingArea") as NSTrackingArea

    public open fun subtype(): Any =
        Native.objc_msgSend("class objc.Any", this, "subtype")

    public open fun data1(): Int =
        Native.objc_msgSend("int", this, "data1") as Int

    public open fun data2(): Int =
        Native.objc_msgSend("int", this, "data2") as Int

    public open fun eventRef(): Pointer<Unit> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "eventRef") as Pointer<Unit>

    public open fun CGEvent(): Pointer<Any> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "CGEvent") as Pointer<Any>

    public open fun magnification(): Double =
        Native.objc_msgSend("double", this, "magnification") as Double

    public open fun deviceID(): Int =
        Native.objc_msgSend("int", this, "deviceID") as Int

    public open fun rotation(): Float =
        Native.objc_msgSend("float", this, "rotation") as Float

    public open fun absoluteX(): Int =
        Native.objc_msgSend("int", this, "absoluteX") as Int

    public open fun absoluteY(): Int =
        Native.objc_msgSend("int", this, "absoluteY") as Int

    public open fun absoluteZ(): Int =
        Native.objc_msgSend("int", this, "absoluteZ") as Int

    public open fun buttonMask(): Any =
        Native.objc_msgSend("class objc.Any", this, "buttonMask")

    public open fun tilt(): Any =
        Native.objc_msgSend("class objc.Any", this, "tilt")

    public open fun tangentialPressure(): Float =
        Native.objc_msgSend("float", this, "tangentialPressure") as Float

    public open fun vendorDefined(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "vendorDefined") as ObjCObject

    public open fun vendorID(): Int =
        Native.objc_msgSend("int", this, "vendorID") as Int

    public open fun tabletID(): Int =
        Native.objc_msgSend("int", this, "tabletID") as Int

    public open fun pointingDeviceID(): Int =
        Native.objc_msgSend("int", this, "pointingDeviceID") as Int

    public open fun systemTabletID(): Int =
        Native.objc_msgSend("int", this, "systemTabletID") as Int

    public open fun vendorPointingDeviceType(): Int =
        Native.objc_msgSend("int", this, "vendorPointingDeviceType") as Int

    public open fun pointingDeviceSerialNumber(): Int =
        Native.objc_msgSend("int", this, "pointingDeviceSerialNumber") as Int

    public open fun uniqueID(): Long =
        Native.objc_msgSend("long", this, "uniqueID") as Long

    public open fun capabilityMask(): Int =
        Native.objc_msgSend("int", this, "capabilityMask") as Int

    public open fun pointingDeviceType(): Any =
        Native.objc_msgSend("class objc.Any", this, "pointingDeviceType")

    public open fun isEnteringProximity(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnteringProximity") as Boolean

    public open fun touchesMatchingPhase_inView(phase: Any, view: NSView): NSSet =
        Native.objc_msgSend("class objc.NSSet", this, "touchesMatchingPhase:inView:", phase, view) as NSSet

    public open fun phase(): Any =
        Native.objc_msgSend("class objc.Any", this, "phase")

    public open fun stage(): Int =
        Native.objc_msgSend("int", this, "stage") as Int

    public open fun stageTransition(): Double =
        Native.objc_msgSend("double", this, "stageTransition") as Double

    public open fun associatedEventsMask(): Any =
        Native.objc_msgSend("class objc.Any", this, "associatedEventsMask")

    public open fun trackSwipeEventWithOptions_dampenAmountThresholdMin_max_usingHandler(options: Any, minDampenThreshold: Double, maxDampenThreshold: Double, trackingHandler: Any): Unit {
        Native.objc_msgSend("void", this, "trackSwipeEventWithOptions:dampenAmountThresholdMin:max:usingHandler:", options, minDampenThreshold, maxDampenThreshold, trackingHandler)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
        public open fun eventWithEventRef(eventRef: Pointer<Unit>): NSEvent =
            Native.objc_msgSend("class objc.NSEvent", this, "eventWithEventRef:", eventRef) as NSEvent

        public open fun eventWithCGEvent(cgEvent: Pointer<Any>): NSEvent =
            Native.objc_msgSend("class objc.NSEvent", this, "eventWithCGEvent:", cgEvent) as NSEvent

        public open fun setMouseCoalescingEnabled(flag: Boolean): Unit {
            Native.objc_msgSend("void", this, "setMouseCoalescingEnabled:", flag)
        }

        public open fun isMouseCoalescingEnabled(): Boolean =
            Native.objc_msgSend("boolean", this, "isMouseCoalescingEnabled") as Boolean

        public open fun isSwipeTrackingFromScrollEventsEnabled(): Boolean =
            Native.objc_msgSend("boolean", this, "isSwipeTrackingFromScrollEventsEnabled") as Boolean

        public open fun startPeriodicEventsAfterDelay_withPeriod(delay: Double, period: Double): Unit {
            Native.objc_msgSend("void", this, "startPeriodicEventsAfterDelay:withPeriod:", delay, period)
        }

        public open fun stopPeriodicEvents(): Unit {
            Native.objc_msgSend("void", this, "stopPeriodicEvents")
        }

        public open fun mouseEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_clickCount_pressure(type: Any, location: Any, flags: Any, time: Double, wNum: Int, context: NSGraphicsContext, eNum: Int, cNum: Int, pressure: Float): NSEvent =
            Native.objc_msgSend("class objc.NSEvent", this, "mouseEventWithType:location:modifierFlags:timestamp:windowNumber:context:eventNumber:clickCount:pressure:", type, location, flags, time, wNum, context, eNum, cNum, pressure) as NSEvent

        public open fun keyEventWithType_location_modifierFlags_timestamp_windowNumber_context_characters_charactersIgnoringModifiers_isARepeat_keyCode(type: Any, location: Any, flags: Any, time: Double, wNum: Int, context: NSGraphicsContext, keys: NSString, ukeys: NSString, flag: Boolean, code: Short): NSEvent =
            Native.objc_msgSend("class objc.NSEvent", this, "keyEventWithType:location:modifierFlags:timestamp:windowNumber:context:characters:charactersIgnoringModifiers:isARepeat:keyCode:", type, location, flags, time, wNum, context, keys, ukeys, flag, code) as NSEvent

        public open fun enterExitEventWithType_location_modifierFlags_timestamp_windowNumber_context_eventNumber_trackingNumber_userData(type: Any, location: Any, flags: Any, time: Double, wNum: Int, context: NSGraphicsContext, eNum: Int, tNum: Int, data: Pointer<*>): NSEvent =
            Native.objc_msgSend("class objc.NSEvent", this, "enterExitEventWithType:location:modifierFlags:timestamp:windowNumber:context:eventNumber:trackingNumber:userData:", type, location, flags, time, wNum, context, eNum, tNum, data) as NSEvent

        public open fun otherEventWithType_location_modifierFlags_timestamp_windowNumber_context_subtype_data1_data2(type: Any, location: Any, flags: Any, time: Double, wNum: Int, context: NSGraphicsContext, subtype: Short, d1: Int, d2: Int): NSEvent =
            Native.objc_msgSend("class objc.NSEvent", this, "otherEventWithType:location:modifierFlags:timestamp:windowNumber:context:subtype:data1:data2:", type, location, flags, time, wNum, context, subtype, d1, d2) as NSEvent

        public open fun mouseLocation(): Any =
            Native.objc_msgSend("class objc.Any", this, "mouseLocation")

        public open fun modifierFlags(): Any =
            Native.objc_msgSend("class objc.Any", this, "modifierFlags")

        public open fun pressedMouseButtons(): Int =
            Native.objc_msgSend("int", this, "pressedMouseButtons") as Int

        public open fun doubleClickInterval(): Double =
            Native.objc_msgSend("double", this, "doubleClickInterval") as Double

        public open fun keyRepeatDelay(): Double =
            Native.objc_msgSend("double", this, "keyRepeatDelay") as Double

        public open fun keyRepeatInterval(): Double =
            Native.objc_msgSend("double", this, "keyRepeatInterval") as Double

        public open fun addGlobalMonitorForEventsMatchingMask_handler(mask: Any, block: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "addGlobalMonitorForEventsMatchingMask:handler:", mask, block) as ObjCObject

        public open fun addLocalMonitorForEventsMatchingMask_handler(mask: Any, block: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "addLocalMonitorForEventsMatchingMask:handler:", mask, block) as ObjCObject

        public open fun removeMonitor(eventMonitor: ObjCObject): Unit {
            Native.objc_msgSend("void", this, "removeMonitor:", eventMonitor)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSEvent")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
