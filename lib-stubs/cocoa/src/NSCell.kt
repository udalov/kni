// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSCell.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSCell(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSUserInterfaceItemIdentification, NSAccessibilityElementProtocol, NSAccessibility, NSCell_NSKeyboardUI, NSCell_NSCellAttributedStringMethods, NSCell_NSCellMixedState, NSCell_NSCellHitTest, NSCell_NSCellExpansion, NSCell_NSCellBackgroundStyle, NSCell_NSDeprecated {
    public open fun initTextCell(aString: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initTextCell:", aString) as ObjCObject

    public open fun initImageCell(image: NSImage): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initImageCell:", image) as ObjCObject

    public open fun controlView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "controlView") as NSView

    public open fun setControlView(controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "setControlView:", controlView)
    }

    public open fun type(): Any =
        Native.objc_msgSend("class objc.Any", this, "type")

    public open fun setType(type: Any): Unit {
        Native.objc_msgSend("void", this, "setType:", type)
    }

    public open fun state(): Int =
        Native.objc_msgSend("int", this, "state") as Int

    public open fun setState(state: Int): Unit {
        Native.objc_msgSend("void", this, "setState:", state)
    }

    public open fun target(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "target") as ObjCObject

    public open fun setTarget(target: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setTarget:", target)
    }

    public open fun action(): ObjCSelector =
        Native.objc_msgSend("class kni.objc.ObjCSelector", this, "action") as ObjCSelector

    public open fun setAction(action: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "setAction:", action)
    }

    public open fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    public open fun setTag(tag: Int): Unit {
        Native.objc_msgSend("void", this, "setTag:", tag)
    }

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun isOpaque(): Boolean =
        Native.objc_msgSend("boolean", this, "isOpaque") as Boolean

    public open fun isEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabled") as Boolean

    public open fun setEnabled(enabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEnabled:", enabled)
    }

    public open fun sendActionOn(mask: Int): Int =
        Native.objc_msgSend("int", this, "sendActionOn:", mask) as Int

    public open fun isContinuous(): Boolean =
        Native.objc_msgSend("boolean", this, "isContinuous") as Boolean

    public open fun setContinuous(continuous: Boolean): Unit {
        Native.objc_msgSend("void", this, "setContinuous:", continuous)
    }

    public open fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    public open fun setEditable(editable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEditable:", editable)
    }

    public open fun isSelectable(): Boolean =
        Native.objc_msgSend("boolean", this, "isSelectable") as Boolean

    public open fun setSelectable(selectable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectable:", selectable)
    }

    public open fun isBordered(): Boolean =
        Native.objc_msgSend("boolean", this, "isBordered") as Boolean

    public open fun setBordered(bordered: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBordered:", bordered)
    }

    public open fun isBezeled(): Boolean =
        Native.objc_msgSend("boolean", this, "isBezeled") as Boolean

    public open fun setBezeled(bezeled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setBezeled:", bezeled)
    }

    public open fun isScrollable(): Boolean =
        Native.objc_msgSend("boolean", this, "isScrollable") as Boolean

    public open fun setScrollable(scrollable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setScrollable:", scrollable)
    }

    public open fun isHighlighted(): Boolean =
        Native.objc_msgSend("boolean", this, "isHighlighted") as Boolean

    public open fun setHighlighted(highlighted: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHighlighted:", highlighted)
    }

    public open fun alignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "alignment")

    public open fun setAlignment(alignment: Any): Unit {
        Native.objc_msgSend("void", this, "setAlignment:", alignment)
    }

    public open fun wraps(): Boolean =
        Native.objc_msgSend("boolean", this, "wraps") as Boolean

    public open fun setWraps(wraps: Boolean): Unit {
        Native.objc_msgSend("void", this, "setWraps:", wraps)
    }

    public open fun font(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "font") as NSFont

    public open fun setFont(font: NSFont): Unit {
        Native.objc_msgSend("void", this, "setFont:", font)
    }

    public open fun keyEquivalent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "keyEquivalent") as NSString

    public open fun formatter(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "formatter") as ObjCObject

    public open fun setFormatter(formatter: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setFormatter:", formatter)
    }

    public open fun objectValue(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectValue") as ObjCObject

    public open fun setObjectValue(objectValue: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setObjectValue:", objectValue)
    }

    public open fun hasValidObjectValue(): Boolean =
        Native.objc_msgSend("boolean", this, "hasValidObjectValue") as Boolean

    public open fun stringValue(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringValue") as NSString

    public open fun setStringValue(stringValue: NSString): Unit {
        Native.objc_msgSend("void", this, "setStringValue:", stringValue)
    }

    public open fun compare(otherCell: ObjCObject): Any =
        Native.objc_msgSend("class objc.Any", this, "compare:", otherCell)

    public open fun intValue(): Int =
        Native.objc_msgSend("int", this, "intValue") as Int

    public open fun setIntValue(intValue: Int): Unit {
        Native.objc_msgSend("void", this, "setIntValue:", intValue)
    }

    public open fun floatValue(): Float =
        Native.objc_msgSend("float", this, "floatValue") as Float

    public open fun setFloatValue(floatValue: Float): Unit {
        Native.objc_msgSend("void", this, "setFloatValue:", floatValue)
    }

    public open fun doubleValue(): Double =
        Native.objc_msgSend("double", this, "doubleValue") as Double

    public open fun setDoubleValue(doubleValue: Double): Unit {
        Native.objc_msgSend("void", this, "setDoubleValue:", doubleValue)
    }

    public open fun takeIntValueFrom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeIntValueFrom:", sender)
    }

    public open fun takeFloatValueFrom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeFloatValueFrom:", sender)
    }

    public open fun takeDoubleValueFrom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeDoubleValueFrom:", sender)
    }

    public open fun takeStringValueFrom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeStringValueFrom:", sender)
    }

    public open fun takeObjectValueFrom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeObjectValueFrom:", sender)
    }

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
    }

    public open fun controlTint(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlTint")

    public open fun setControlTint(controlTint: Any): Unit {
        Native.objc_msgSend("void", this, "setControlTint:", controlTint)
    }

    public open fun controlSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlSize")

    public open fun setControlSize(controlSize: Any): Unit {
        Native.objc_msgSend("void", this, "setControlSize:", controlSize)
    }

    public open fun representedObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "representedObject") as ObjCObject

    public open fun setRepresentedObject(representedObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setRepresentedObject:", representedObject)
    }

    public open fun cellAttribute(aParameter: Any): Int =
        Native.objc_msgSend("int", this, "cellAttribute:", aParameter) as Int

    public open fun setCellAttribute_to(aParameter: Any, value: Int): Unit {
        Native.objc_msgSend("void", this, "setCellAttribute:to:", aParameter, value)
    }

    public open fun imageRectForBounds(theRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "imageRectForBounds:", theRect)

    public open fun titleRectForBounds(theRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "titleRectForBounds:", theRect)

    public open fun drawingRectForBounds(theRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "drawingRectForBounds:", theRect)

    public open fun cellSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "cellSize")

    public open fun cellSizeForBounds(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "cellSizeForBounds:", aRect)

    public open fun highlightColorWithFrame_inView(cellFrame: Any, controlView: NSView): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "highlightColorWithFrame:inView:", cellFrame, controlView) as NSColor

    public open fun calcDrawInfo(aRect: Any): Unit {
        Native.objc_msgSend("void", this, "calcDrawInfo:", aRect)
    }

    public open fun setUpFieldEditorAttributes(textObj: NSText): NSText =
        Native.objc_msgSend("class objc.NSText", this, "setUpFieldEditorAttributes:", textObj) as NSText

    public open fun drawInteriorWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawInteriorWithFrame:inView:", cellFrame, controlView)
    }

    public open fun drawWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawWithFrame:inView:", cellFrame, controlView)
    }

    public open fun highlight_withFrame_inView(flag: Boolean, cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "highlight:withFrame:inView:", flag, cellFrame, controlView)
    }

    public open fun mouseDownFlags(): Int =
        Native.objc_msgSend("int", this, "mouseDownFlags") as Int

    public open fun getPeriodicDelay_interval(delay: Pointer<Float>, interval: Pointer<Float>): Unit {
        Native.objc_msgSend("void", this, "getPeriodicDelay:interval:", delay, interval)
    }

    public open fun startTrackingAt_inView(startPoint: Any, controlView: NSView): Boolean =
        Native.objc_msgSend("boolean", this, "startTrackingAt:inView:", startPoint, controlView) as Boolean

    public open fun continueTracking_at_inView(lastPoint: Any, currentPoint: Any, controlView: NSView): Boolean =
        Native.objc_msgSend("boolean", this, "continueTracking:at:inView:", lastPoint, currentPoint, controlView) as Boolean

    public open fun stopTracking_at_inView_mouseIsUp(lastPoint: Any, stopPoint: Any, controlView: NSView, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "stopTracking:at:inView:mouseIsUp:", lastPoint, stopPoint, controlView, flag)
    }

    public open fun trackMouse_inRect_ofView_untilMouseUp(theEvent: NSEvent, cellFrame: Any, controlView: NSView, flag: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "trackMouse:inRect:ofView:untilMouseUp:", theEvent, cellFrame, controlView, flag) as Boolean

    public open fun editWithFrame_inView_editor_delegate_event(aRect: Any, controlView: NSView, textObj: NSText, anObject: ObjCObject, theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "editWithFrame:inView:editor:delegate:event:", aRect, controlView, textObj, anObject, theEvent)
    }

    public open fun selectWithFrame_inView_editor_delegate_start_length(aRect: Any, controlView: NSView, textObj: NSText, anObject: ObjCObject, selStart: Int, selLength: Int): Unit {
        Native.objc_msgSend("void", this, "selectWithFrame:inView:editor:delegate:start:length:", aRect, controlView, textObj, anObject, selStart, selLength)
    }

    public open fun endEditing(textObj: NSText): Unit {
        Native.objc_msgSend("void", this, "endEditing:", textObj)
    }

    public open fun resetCursorRect_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "resetCursorRect:inView:", cellFrame, controlView)
    }

    public open fun menu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menu") as NSMenu

    public open fun setMenu(menu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setMenu:", menu)
    }

    public open fun menuForEvent_inRect_ofView(event: NSEvent, cellFrame: Any, view: NSView): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menuForEvent:inRect:ofView:", event, cellFrame, view) as NSMenu

    public open fun sendsActionOnEndEditing(): Boolean =
        Native.objc_msgSend("boolean", this, "sendsActionOnEndEditing") as Boolean

    public open fun setSendsActionOnEndEditing(sendsActionOnEndEditing: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSendsActionOnEndEditing:", sendsActionOnEndEditing)
    }

    public open fun baseWritingDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "baseWritingDirection")

    public open fun setBaseWritingDirection(baseWritingDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setBaseWritingDirection:", baseWritingDirection)
    }

    public open fun lineBreakMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "lineBreakMode")

    public open fun setLineBreakMode(lineBreakMode: Any): Unit {
        Native.objc_msgSend("void", this, "setLineBreakMode:", lineBreakMode)
    }

    public open fun allowsUndo(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsUndo") as Boolean

    public open fun setAllowsUndo(allowsUndo: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsUndo:", allowsUndo)
    }

    public open fun integerValue(): Int =
        Native.objc_msgSend("int", this, "integerValue") as Int

    public open fun setIntegerValue(integerValue: Int): Unit {
        Native.objc_msgSend("void", this, "setIntegerValue:", integerValue)
    }

    public open fun takeIntegerValueFrom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeIntegerValueFrom:", sender)
    }

    public open fun truncatesLastVisibleLine(): Boolean =
        Native.objc_msgSend("boolean", this, "truncatesLastVisibleLine") as Boolean

    public open fun setTruncatesLastVisibleLine(truncatesLastVisibleLine: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTruncatesLastVisibleLine:", truncatesLastVisibleLine)
    }

    public open fun userInterfaceLayoutDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "userInterfaceLayoutDirection")

    public open fun setUserInterfaceLayoutDirection(userInterfaceLayoutDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setUserInterfaceLayoutDirection:", userInterfaceLayoutDirection)
    }

    public open fun fieldEditorForView(aControlView: NSView): NSTextView =
        Native.objc_msgSend("class objc.NSTextView", this, "fieldEditorForView:", aControlView) as NSTextView

    public open fun usesSingleLineMode(): Boolean =
        Native.objc_msgSend("boolean", this, "usesSingleLineMode") as Boolean

    public open fun setUsesSingleLineMode(usesSingleLineMode: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesSingleLineMode:", usesSingleLineMode)
    }

    public open fun draggingImageComponentsWithFrame_inView(frame: Any, view: NSView): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "draggingImageComponentsWithFrame:inView:", frame, view) as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSUserInterfaceItemIdentification.metaclass, NSAccessibilityElementProtocol.metaclass, NSAccessibility.metaclass, NSCell_NSKeyboardUI.metaclass, NSCell_NSCellAttributedStringMethods.metaclass, NSCell_NSCellMixedState.metaclass, NSCell_NSCellHitTest.metaclass, NSCell_NSCellExpansion.metaclass, NSCell_NSCellBackgroundStyle.metaclass, NSCell_NSDeprecated.metaclass {
        public open fun prefersTrackingUntilMouseUp(): Boolean =
            Native.objc_msgSend("boolean", this, "prefersTrackingUntilMouseUp") as Boolean

        public open fun defaultMenu(): NSMenu =
            Native.objc_msgSend("class objc.NSMenu", this, "defaultMenu") as NSMenu

    }

    companion object : NSObject(Native.objc_getClass("NSCell")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSCell_NSKeyboardUI : IObjCObject {
    public open fun refusesFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "refusesFirstResponder") as Boolean

    public open fun setRefusesFirstResponder(refusesFirstResponder: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", refusesFirstResponder)
    }

    public open fun acceptsFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsFirstResponder") as Boolean

    public open fun showsFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "showsFirstResponder") as Boolean

    public open fun setShowsFirstResponder(showsFirstResponder: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsFirstResponder:", showsFirstResponder)
    }

    public open fun performClick(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performClick:", sender)
    }

    public open fun focusRingType(): Any =
        Native.objc_msgSend("class objc.Any", this, "focusRingType")

    public open fun setFocusRingType(focusRingType: Any): Unit {
        Native.objc_msgSend("void", this, "setFocusRingType:", focusRingType)
    }

    public open fun drawFocusRingMaskWithFrame_inView(cellFrame: Any, controlView: NSView): Unit {
        Native.objc_msgSend("void", this, "drawFocusRingMaskWithFrame:inView:", cellFrame, controlView)
    }

    public open fun focusRingMaskBoundsForFrame_inView(cellFrame: Any, controlView: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "focusRingMaskBoundsForFrame:inView:", cellFrame, controlView)

    public open fun wantsNotificationForMarkedText(): Boolean =
        Native.objc_msgSend("boolean", this, "wantsNotificationForMarkedText") as Boolean

    trait metaclass : IObjCObject {
        public open fun defaultFocusRingType(): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultFocusRingType")
    }
}

trait NSCell_NSCellAttributedStringMethods : IObjCObject {
    public open fun attributedStringValue(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedStringValue") as NSAttributedString

    public open fun setAttributedStringValue(attributedStringValue: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedStringValue:", attributedStringValue)
    }

    public open fun allowsEditingTextAttributes(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsEditingTextAttributes") as Boolean

    public open fun setAllowsEditingTextAttributes(allowsEditingTextAttributes: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsEditingTextAttributes:", allowsEditingTextAttributes)
    }

    public open fun importsGraphics(): Boolean =
        Native.objc_msgSend("boolean", this, "importsGraphics") as Boolean

    public open fun setImportsGraphics(importsGraphics: Boolean): Unit {
        Native.objc_msgSend("void", this, "setImportsGraphics:", importsGraphics)
    }

    trait metaclass : IObjCObject
}

trait NSCell_NSCellMixedState : IObjCObject {
    public open fun allowsMixedState(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsMixedState") as Boolean

    public open fun setAllowsMixedState(allowsMixedState: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsMixedState:", allowsMixedState)
    }

    public open fun nextState(): Int =
        Native.objc_msgSend("int", this, "nextState") as Int

    public open fun setNextState(): Unit {
        Native.objc_msgSend("void", this, "setNextState")
    }

    trait metaclass : IObjCObject
}

trait NSCell_NSCellHitTest : IObjCObject {
    public open fun hitTestForEvent_inRect_ofView(event: NSEvent, cellFrame: Any, controlView: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "hitTestForEvent:inRect:ofView:", event, cellFrame, controlView)

    trait metaclass : IObjCObject
}

trait NSCell_NSCellExpansion : IObjCObject {
    public open fun expansionFrameWithFrame_inView(cellFrame: Any, view: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "expansionFrameWithFrame:inView:", cellFrame, view)

    public open fun drawWithExpansionFrame_inView(cellFrame: Any, view: NSView): Unit {
        Native.objc_msgSend("void", this, "drawWithExpansionFrame:inView:", cellFrame, view)
    }

    trait metaclass : IObjCObject
}

trait NSCell_NSCellBackgroundStyle : IObjCObject {
    public open fun backgroundStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "backgroundStyle")

    public open fun setBackgroundStyle(backgroundStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setBackgroundStyle:", backgroundStyle)
    }

    public open fun interiorBackgroundStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "interiorBackgroundStyle")

    trait metaclass : IObjCObject
}

trait NSCell_NSDeprecated : IObjCObject {
    public open fun entryType(): Int =
        Native.objc_msgSend("int", this, "entryType") as Int

    public open fun setEntryType(aType: Int): Unit {
        Native.objc_msgSend("void", this, "setEntryType:", aType)
    }

    public open fun isEntryAcceptable(aString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "isEntryAcceptable:", aString) as Boolean

    public open fun setFloatingPointFormat_left_right(autoRange: Boolean, leftDigits: Int, rightDigits: Int): Unit {
        Native.objc_msgSend("void", this, "setFloatingPointFormat:left:right:", autoRange, leftDigits, rightDigits)
    }

    public open fun setMnemonicLocation(location: Int): Unit {
        Native.objc_msgSend("void", this, "setMnemonicLocation:", location)
    }

    public open fun mnemonicLocation(): Int =
        Native.objc_msgSend("int", this, "mnemonicLocation") as Int

    public open fun mnemonic(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "mnemonic") as NSString

    public open fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    trait metaclass : IObjCObject
}
