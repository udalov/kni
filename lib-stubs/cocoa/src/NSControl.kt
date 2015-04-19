// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSControl.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSControlTextEditingDelegate {
    trait metaclass
}

public open class NSControl(pointer: Long) : NSView(pointer), NSControl_NSKeyboardUI, NSControl_NSControlTextMethods, NSControl_NSControlEditableTextMethods, NSControl_NSDeprecated, NSControl_NSConstraintBasedLayoutLayering {
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

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    public open fun setTag(tag: Int): Unit {
        Native.objc_msgSend("void", this, "setTag:", tag)
    }

    public open fun ignoresMultiClick(): Boolean =
        Native.objc_msgSend("boolean", this, "ignoresMultiClick") as Boolean

    public open fun setIgnoresMultiClick(ignoresMultiClick: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIgnoresMultiClick:", ignoresMultiClick)
    }

    public open fun isContinuous(): Boolean =
        Native.objc_msgSend("boolean", this, "isContinuous") as Boolean

    public open fun setContinuous(continuous: Boolean): Unit {
        Native.objc_msgSend("void", this, "setContinuous:", continuous)
    }

    public open fun isEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabled") as Boolean

    public open fun setEnabled(enabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEnabled:", enabled)
    }

    override fun refusesFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "refusesFirstResponder") as Boolean

    override fun setRefusesFirstResponder(refusesFirstResponder: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", refusesFirstResponder)
    }

    public open fun isHighlighted(): Boolean =
        Native.objc_msgSend("boolean", this, "isHighlighted") as Boolean

    public open fun setHighlighted(highlighted: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHighlighted:", highlighted)
    }

    public open fun controlSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "controlSize")

    public open fun setControlSize(controlSize: Any): Unit {
        Native.objc_msgSend("void", this, "setControlSize:", controlSize)
    }

    public open fun formatter(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "formatter") as ObjCObject

    public open fun setFormatter(formatter: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setFormatter:", formatter)
    }

    public open fun stringValue(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringValue") as NSString

    public open fun setStringValue(stringValue: NSString): Unit {
        Native.objc_msgSend("void", this, "setStringValue:", stringValue)
    }

    public open fun attributedStringValue(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedStringValue") as NSAttributedString

    public open fun setAttributedStringValue(attributedStringValue: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedStringValue:", attributedStringValue)
    }

    public open fun objectValue(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "objectValue") as ObjCObject

    public open fun setObjectValue(objectValue: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setObjectValue:", objectValue)
    }

    public open fun intValue(): Int =
        Native.objc_msgSend("int", this, "intValue") as Int

    public open fun setIntValue(intValue: Int): Unit {
        Native.objc_msgSend("void", this, "setIntValue:", intValue)
    }

    public open fun integerValue(): Int =
        Native.objc_msgSend("int", this, "integerValue") as Int

    public open fun setIntegerValue(integerValue: Int): Unit {
        Native.objc_msgSend("void", this, "setIntegerValue:", integerValue)
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

    public open fun sizeThatFits(size: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "sizeThatFits:", size)

    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun sizeToFit(): Unit {
        Native.objc_msgSend("void", this, "sizeToFit")
    }

    public open fun sendActionOn(mask: Int): Int =
        Native.objc_msgSend("int", this, "sendActionOn:", mask) as Int

    public open fun sendAction_to(theAction: ObjCSelector, theTarget: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "sendAction:to:", theAction, theTarget) as Boolean

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

    public open fun takeIntegerValueFrom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "takeIntegerValueFrom:", sender)
    }

    override fun mouseDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDown:", theEvent)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass, NSControl_NSKeyboardUI.metaclass, NSControl_NSControlTextMethods.metaclass, NSControl_NSControlEditableTextMethods.metaclass, NSControl_NSDeprecated.metaclass, NSControl_NSConstraintBasedLayoutLayering.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSControl")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSControl_NSKeyboardUI : IObjCObject {
    public open fun performClick(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performClick:", sender)
    }

    public open fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    public open fun refusesFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "refusesFirstResponder") as Boolean

    trait metaclass : IObjCObject
}

trait NSControl_NSControlTextMethods : IObjCObject {
    public open fun alignment(): Any =
        Native.objc_msgSend("class objc.Any", this, "alignment")

    public open fun setAlignment(alignment: Any): Unit {
        Native.objc_msgSend("void", this, "setAlignment:", alignment)
    }

    public open fun font(): NSFont =
        Native.objc_msgSend("class objc.NSFont", this, "font") as NSFont

    public open fun setFont(font: NSFont): Unit {
        Native.objc_msgSend("void", this, "setFont:", font)
    }

    public open fun lineBreakMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "lineBreakMode")

    public open fun setLineBreakMode(lineBreakMode: Any): Unit {
        Native.objc_msgSend("void", this, "setLineBreakMode:", lineBreakMode)
    }

    public open fun usesSingleLineMode(): Boolean =
        Native.objc_msgSend("boolean", this, "usesSingleLineMode") as Boolean

    public open fun setUsesSingleLineMode(usesSingleLineMode: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesSingleLineMode:", usesSingleLineMode)
    }

    public open fun baseWritingDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "baseWritingDirection")

    public open fun setBaseWritingDirection(baseWritingDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setBaseWritingDirection:", baseWritingDirection)
    }

    public open fun allowsExpansionToolTips(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsExpansionToolTips") as Boolean

    public open fun setAllowsExpansionToolTips(allowsExpansionToolTips: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsExpansionToolTips:", allowsExpansionToolTips)
    }

    public open fun expansionFrameWithFrame(contentFrame: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "expansionFrameWithFrame:", contentFrame)

    public open fun drawWithExpansionFrame_inView(contentFrame: Any, view: NSView): Unit {
        Native.objc_msgSend("void", this, "drawWithExpansionFrame:inView:", contentFrame, view)
    }

    trait metaclass : IObjCObject
}

trait NSControl_NSControlEditableTextMethods : IObjCObject {
    public open fun currentEditor(): NSText =
        Native.objc_msgSend("class objc.NSText", this, "currentEditor") as NSText

    public open fun abortEditing(): Boolean =
        Native.objc_msgSend("boolean", this, "abortEditing") as Boolean

    public open fun validateEditing(): Unit {
        Native.objc_msgSend("void", this, "validateEditing")
    }

    public open fun editWithFrame_editor_delegate_event(aRect: Any, textObj: NSText, anObject: ObjCObject, theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "editWithFrame:editor:delegate:event:", aRect, textObj, anObject, theEvent)
    }

    public open fun selectWithFrame_editor_delegate_start_length(aRect: Any, textObj: NSText, anObject: ObjCObject, selStart: Int, selLength: Int): Unit {
        Native.objc_msgSend("void", this, "selectWithFrame:editor:delegate:start:length:", aRect, textObj, anObject, selStart, selLength)
    }

    public open fun endEditing(textObj: NSText): Unit {
        Native.objc_msgSend("void", this, "endEditing:", textObj)
    }

    trait metaclass : IObjCObject
}

trait NSObject_NSControlSubclassNotifications : IObjCObject {
    public open fun controlTextDidBeginEditing(obj: NSNotification): Unit {
        Native.objc_msgSend("void", this, "controlTextDidBeginEditing:", obj)
    }

    public open fun controlTextDidEndEditing(obj: NSNotification): Unit {
        Native.objc_msgSend("void", this, "controlTextDidEndEditing:", obj)
    }

    public open fun controlTextDidChange(obj: NSNotification): Unit {
        Native.objc_msgSend("void", this, "controlTextDidChange:", obj)
    }

    trait metaclass : IObjCObject
}

trait NSControl_NSDeprecated : IObjCObject {
    public open fun setFloatingPointFormat_left_right(autoRange: Boolean, leftDigits: Int, rightDigits: Int): Unit {
        Native.objc_msgSend("void", this, "setFloatingPointFormat:left:right:", autoRange, leftDigits, rightDigits)
    }

    public open fun cell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "cell") as ObjCObject

    public open fun setCell(aCell: NSCell): Unit {
        Native.objc_msgSend("void", this, "setCell:", aCell)
    }

    public open fun selectedCell(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "selectedCell") as ObjCObject

    public open fun selectedTag(): Int =
        Native.objc_msgSend("int", this, "selectedTag") as Int

    public open fun setNeedsDisplay(): Unit {
        Native.objc_msgSend("void", this, "setNeedsDisplay")
    }

    public open fun calcSize(): Unit {
        Native.objc_msgSend("void", this, "calcSize")
    }

    public open fun updateCell(aCell: NSCell): Unit {
        Native.objc_msgSend("void", this, "updateCell:", aCell)
    }

    public open fun updateCellInside(aCell: NSCell): Unit {
        Native.objc_msgSend("void", this, "updateCellInside:", aCell)
    }

    public open fun drawCellInside(aCell: NSCell): Unit {
        Native.objc_msgSend("void", this, "drawCellInside:", aCell)
    }

    public open fun drawCell(aCell: NSCell): Unit {
        Native.objc_msgSend("void", this, "drawCell:", aCell)
    }

    public open fun selectCell(aCell: NSCell): Unit {
        Native.objc_msgSend("void", this, "selectCell:", aCell)
    }

    trait metaclass : IObjCObject {
        public open fun setCellClass(factoryId: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "setCellClass:", factoryId)
        }

        public open fun cellClass(): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "cellClass") as ObjCClass
    }
}
