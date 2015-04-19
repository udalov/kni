// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSRulerView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSRulerView(pointer: Long) : NSView(pointer) {
    public open fun initWithScrollView_orientation(scrollView: NSScrollView, orientation: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithScrollView:orientation:", scrollView, orientation) as ObjCObject

    public open fun scrollView(): NSScrollView =
        Native.objc_msgSend("class objc.NSScrollView", this, "scrollView") as NSScrollView

    public open fun setScrollView(scrollView: NSScrollView): Unit {
        Native.objc_msgSend("void", this, "setScrollView:", scrollView)
    }

    public open fun orientation(): Any =
        Native.objc_msgSend("class objc.Any", this, "orientation")

    public open fun setOrientation(orientation: Any): Unit {
        Native.objc_msgSend("void", this, "setOrientation:", orientation)
    }

    public open fun baselineLocation(): Double =
        Native.objc_msgSend("double", this, "baselineLocation") as Double

    public open fun requiredThickness(): Double =
        Native.objc_msgSend("double", this, "requiredThickness") as Double

    public open fun ruleThickness(): Double =
        Native.objc_msgSend("double", this, "ruleThickness") as Double

    public open fun setRuleThickness(ruleThickness: Double): Unit {
        Native.objc_msgSend("void", this, "setRuleThickness:", ruleThickness)
    }

    public open fun reservedThicknessForMarkers(): Double =
        Native.objc_msgSend("double", this, "reservedThicknessForMarkers") as Double

    public open fun setReservedThicknessForMarkers(reservedThicknessForMarkers: Double): Unit {
        Native.objc_msgSend("void", this, "setReservedThicknessForMarkers:", reservedThicknessForMarkers)
    }

    public open fun reservedThicknessForAccessoryView(): Double =
        Native.objc_msgSend("double", this, "reservedThicknessForAccessoryView") as Double

    public open fun setReservedThicknessForAccessoryView(reservedThicknessForAccessoryView: Double): Unit {
        Native.objc_msgSend("void", this, "setReservedThicknessForAccessoryView:", reservedThicknessForAccessoryView)
    }

    public open fun measurementUnits(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "measurementUnits") as NSString

    public open fun setMeasurementUnits(measurementUnits: NSString): Unit {
        Native.objc_msgSend("void", this, "setMeasurementUnits:", measurementUnits)
    }

    public open fun originOffset(): Double =
        Native.objc_msgSend("double", this, "originOffset") as Double

    public open fun setOriginOffset(originOffset: Double): Unit {
        Native.objc_msgSend("void", this, "setOriginOffset:", originOffset)
    }

    public open fun clientView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "clientView") as NSView

    public open fun setClientView(clientView: NSView): Unit {
        Native.objc_msgSend("void", this, "setClientView:", clientView)
    }

    public open fun addMarker(marker: NSRulerMarker): Unit {
        Native.objc_msgSend("void", this, "addMarker:", marker)
    }

    public open fun removeMarker(marker: NSRulerMarker): Unit {
        Native.objc_msgSend("void", this, "removeMarker:", marker)
    }

    public open fun markers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "markers") as NSArray

    public open fun setMarkers(markers: NSArray): Unit {
        Native.objc_msgSend("void", this, "setMarkers:", markers)
    }

    public open fun trackMarker_withMouseEvent(marker: NSRulerMarker, event: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "trackMarker:withMouseEvent:", marker, event) as Boolean

    public open fun accessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "accessoryView") as NSView

    public open fun setAccessoryView(accessoryView: NSView): Unit {
        Native.objc_msgSend("void", this, "setAccessoryView:", accessoryView)
    }

    public open fun moveRulerlineFromLocation_toLocation(oldLocation: Double, newLocation: Double): Unit {
        Native.objc_msgSend("void", this, "moveRulerlineFromLocation:toLocation:", oldLocation, newLocation)
    }

    public open fun invalidateHashMarks(): Unit {
        Native.objc_msgSend("void", this, "invalidateHashMarks")
    }

    public open fun drawHashMarksAndLabelsInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "drawHashMarksAndLabelsInRect:", rect)
    }

    public open fun drawMarkersInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "drawMarkersInRect:", rect)
    }

    override fun isFlipped(): Boolean =
        Native.objc_msgSend("boolean", this, "isFlipped") as Boolean

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass {
        public open fun registerUnitWithName_abbreviation_unitToPointsConversionFactor_stepUpCycle_stepDownCycle(unitName: NSString, abbreviation: NSString, conversionFactor: Double, stepUpCycle: NSArray, stepDownCycle: NSArray): Unit {
            Native.objc_msgSend("void", this, "registerUnitWithName:abbreviation:unitToPointsConversionFactor:stepUpCycle:stepDownCycle:", unitName, abbreviation, conversionFactor, stepUpCycle, stepDownCycle)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSRulerView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSView_NSRulerMarkerClientViewDelegation : IObjCObject {
    public open fun rulerView_shouldMoveMarker(ruler: NSRulerView, marker: NSRulerMarker): Boolean =
        Native.objc_msgSend("boolean", this, "rulerView:shouldMoveMarker:", ruler, marker) as Boolean

    public open fun rulerView_willMoveMarker_toLocation(ruler: NSRulerView, marker: NSRulerMarker, location: Double): Double =
        Native.objc_msgSend("double", this, "rulerView:willMoveMarker:toLocation:", ruler, marker, location) as Double

    public open fun rulerView_didMoveMarker(ruler: NSRulerView, marker: NSRulerMarker): Unit {
        Native.objc_msgSend("void", this, "rulerView:didMoveMarker:", ruler, marker)
    }

    public open fun rulerView_shouldRemoveMarker(ruler: NSRulerView, marker: NSRulerMarker): Boolean =
        Native.objc_msgSend("boolean", this, "rulerView:shouldRemoveMarker:", ruler, marker) as Boolean

    public open fun rulerView_didRemoveMarker(ruler: NSRulerView, marker: NSRulerMarker): Unit {
        Native.objc_msgSend("void", this, "rulerView:didRemoveMarker:", ruler, marker)
    }

    public open fun rulerView_shouldAddMarker(ruler: NSRulerView, marker: NSRulerMarker): Boolean =
        Native.objc_msgSend("boolean", this, "rulerView:shouldAddMarker:", ruler, marker) as Boolean

    public open fun rulerView_willAddMarker_atLocation(ruler: NSRulerView, marker: NSRulerMarker, location: Double): Double =
        Native.objc_msgSend("double", this, "rulerView:willAddMarker:atLocation:", ruler, marker, location) as Double

    public open fun rulerView_didAddMarker(ruler: NSRulerView, marker: NSRulerMarker): Unit {
        Native.objc_msgSend("void", this, "rulerView:didAddMarker:", ruler, marker)
    }

    public open fun rulerView_handleMouseDown(ruler: NSRulerView, event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rulerView:handleMouseDown:", ruler, event)
    }

    public open fun rulerView_willSetClientView(ruler: NSRulerView, newClient: NSView): Unit {
        Native.objc_msgSend("void", this, "rulerView:willSetClientView:", ruler, newClient)
    }

    public open fun rulerView_locationForPoint(ruler: NSRulerView, aPoint: Any): Double =
        Native.objc_msgSend("double", this, "rulerView:locationForPoint:", ruler, aPoint) as Double

    public open fun rulerView_pointForLocation(ruler: NSRulerView, aPoint: Double): Any =
        Native.objc_msgSend("class objc.Any", this, "rulerView:pointForLocation:", ruler, aPoint)

    trait metaclass : IObjCObject
}
