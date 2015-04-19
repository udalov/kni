// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTextViewDelegate {
    trait metaclass
}

public open class NSTextView(pointer: Long) : NSText(pointer), NSUserInterfaceValidations, NSTextInputClient, NSTextLayoutOrientationProvider, NSDraggingSource, NSTextInput, NSAccessibilityNavigableStaticText, NSTextView_NSCompletion, NSTextView_NSPasteboard, NSTextView_NSDragging, NSTextView_NSSharing, NSTextView_NSTextChecking, NSTextView_NSQuickLookPreview, NSTextView_NSTextView_SharingService, NSTextView_NSDeprecated {
    public open fun initWithFrame_textContainer(frameRect: Any, container: NSTextContainer): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:textContainer:", frameRect, container) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    public open fun textContainer(): NSTextContainer =
        Native.objc_msgSend("class objc.NSTextContainer", this, "textContainer") as NSTextContainer

    public open fun setTextContainer(textContainer: NSTextContainer): Unit {
        Native.objc_msgSend("void", this, "setTextContainer:", textContainer)
    }

    public open fun replaceTextContainer(newContainer: NSTextContainer): Unit {
        Native.objc_msgSend("void", this, "replaceTextContainer:", newContainer)
    }

    public open fun textContainerInset(): Any =
        Native.objc_msgSend("class objc.Any", this, "textContainerInset")

    public open fun setTextContainerInset(textContainerInset: Any): Unit {
        Native.objc_msgSend("void", this, "setTextContainerInset:", textContainerInset)
    }

    public open fun textContainerOrigin(): Any =
        Native.objc_msgSend("class objc.Any", this, "textContainerOrigin")

    public open fun invalidateTextContainerOrigin(): Unit {
        Native.objc_msgSend("void", this, "invalidateTextContainerOrigin")
    }

    public open fun layoutManager(): NSLayoutManager =
        Native.objc_msgSend("class objc.NSLayoutManager", this, "layoutManager") as NSLayoutManager

    public open fun textStorage(): NSTextStorage =
        Native.objc_msgSend("class objc.NSTextStorage", this, "textStorage") as NSTextStorage

    override fun insertText(insertString: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertText:", insertString)
    }

    public open fun setConstrainedFrameSize(desiredSize: Any): Unit {
        Native.objc_msgSend("void", this, "setConstrainedFrameSize:", desiredSize)
    }

    public open fun setAlignment_range(alignment: Any, range: Any): Unit {
        Native.objc_msgSend("void", this, "setAlignment:range:", alignment, range)
    }

    public open fun setBaseWritingDirection_range(writingDirection: Any, range: Any): Unit {
        Native.objc_msgSend("void", this, "setBaseWritingDirection:range:", writingDirection, range)
    }

    public open fun turnOffKerning(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "turnOffKerning:", sender)
    }

    public open fun tightenKerning(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "tightenKerning:", sender)
    }

    public open fun loosenKerning(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "loosenKerning:", sender)
    }

    public open fun useStandardKerning(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "useStandardKerning:", sender)
    }

    public open fun turnOffLigatures(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "turnOffLigatures:", sender)
    }

    public open fun useStandardLigatures(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "useStandardLigatures:", sender)
    }

    public open fun useAllLigatures(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "useAllLigatures:", sender)
    }

    public open fun raiseBaseline(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "raiseBaseline:", sender)
    }

    public open fun lowerBaseline(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "lowerBaseline:", sender)
    }

    public open fun toggleTraditionalCharacterShape(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleTraditionalCharacterShape:", sender)
    }

    public open fun outline(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "outline:", sender)
    }

    public open fun performFindPanelAction(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performFindPanelAction:", sender)
    }

    public open fun alignJustified(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "alignJustified:", sender)
    }

    override fun changeColor(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "changeColor:", sender)
    }

    public open fun changeAttributes(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "changeAttributes:", sender)
    }

    public open fun changeDocumentBackgroundColor(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "changeDocumentBackgroundColor:", sender)
    }

    public open fun orderFrontSpacingPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontSpacingPanel:", sender)
    }

    public open fun orderFrontLinkPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontLinkPanel:", sender)
    }

    public open fun orderFrontListPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontListPanel:", sender)
    }

    public open fun orderFrontTablePanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontTablePanel:", sender)
    }

    override fun rulerView_didMoveMarker(ruler: NSRulerView, marker: NSRulerMarker): Unit {
        Native.objc_msgSend("void", this, "rulerView:didMoveMarker:", ruler, marker)
    }

    override fun rulerView_didRemoveMarker(ruler: NSRulerView, marker: NSRulerMarker): Unit {
        Native.objc_msgSend("void", this, "rulerView:didRemoveMarker:", ruler, marker)
    }

    override fun rulerView_didAddMarker(ruler: NSRulerView, marker: NSRulerMarker): Unit {
        Native.objc_msgSend("void", this, "rulerView:didAddMarker:", ruler, marker)
    }

    override fun rulerView_shouldMoveMarker(ruler: NSRulerView, marker: NSRulerMarker): Boolean =
        Native.objc_msgSend("boolean", this, "rulerView:shouldMoveMarker:", ruler, marker) as Boolean

    override fun rulerView_shouldAddMarker(ruler: NSRulerView, marker: NSRulerMarker): Boolean =
        Native.objc_msgSend("boolean", this, "rulerView:shouldAddMarker:", ruler, marker) as Boolean

    override fun rulerView_willMoveMarker_toLocation(ruler: NSRulerView, marker: NSRulerMarker, location: Double): Double =
        Native.objc_msgSend("double", this, "rulerView:willMoveMarker:toLocation:", ruler, marker, location) as Double

    override fun rulerView_shouldRemoveMarker(ruler: NSRulerView, marker: NSRulerMarker): Boolean =
        Native.objc_msgSend("boolean", this, "rulerView:shouldRemoveMarker:", ruler, marker) as Boolean

    override fun rulerView_willAddMarker_atLocation(ruler: NSRulerView, marker: NSRulerMarker, location: Double): Double =
        Native.objc_msgSend("double", this, "rulerView:willAddMarker:atLocation:", ruler, marker, location) as Double

    override fun rulerView_handleMouseDown(ruler: NSRulerView, event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rulerView:handleMouseDown:", ruler, event)
    }

    public open fun setNeedsDisplayInRect_avoidAdditionalLayout(rect: Any, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setNeedsDisplayInRect:avoidAdditionalLayout:", rect, flag)
    }

    public open fun shouldDrawInsertionPoint(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldDrawInsertionPoint") as Boolean

    public open fun drawInsertionPointInRect_color_turnedOn(rect: Any, color: NSColor, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "drawInsertionPointInRect:color:turnedOn:", rect, color, flag)
    }

    public open fun drawViewBackgroundInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "drawViewBackgroundInRect:", rect)
    }

    public open fun updateRuler(): Unit {
        Native.objc_msgSend("void", this, "updateRuler")
    }

    public open fun updateFontPanel(): Unit {
        Native.objc_msgSend("void", this, "updateFontPanel")
    }

    public open fun updateDragTypeRegistration(): Unit {
        Native.objc_msgSend("void", this, "updateDragTypeRegistration")
    }

    public open fun selectionRangeForProposedRange_granularity(proposedCharRange: Any, granularity: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "selectionRangeForProposedRange:granularity:", proposedCharRange, granularity)

    public open fun clickedOnLink_atIndex(link: ObjCObject, charIndex: Int): Unit {
        Native.objc_msgSend("void", this, "clickedOnLink:atIndex:", link, charIndex)
    }

    public open fun startSpeaking(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "startSpeaking:", sender)
    }

    public open fun stopSpeaking(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "stopSpeaking:", sender)
    }

    public open fun setLayoutOrientation(theOrientation: Any): Unit {
        Native.objc_msgSend("void", this, "setLayoutOrientation:", theOrientation)
    }

    public open fun changeLayoutOrientation(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "changeLayoutOrientation:", sender)
    }

    public open fun characterIndexForInsertionAtPoint(point: Any): Int =
        Native.objc_msgSend("int", this, "characterIndexForInsertionAtPoint:", point) as Int

    override fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    override fun changeFont(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "changeFont:", sender)
    }

    override fun complete(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "complete:", sender)
    }

    override fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    override fun drawsBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsBackground") as Boolean

    override fun importsGraphics(): Boolean =
        Native.objc_msgSend("boolean", this, "importsGraphics") as Boolean

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun isEditable(): Boolean =
        Native.objc_msgSend("boolean", this, "isEditable") as Boolean

    override fun isFieldEditor(): Boolean =
        Native.objc_msgSend("boolean", this, "isFieldEditor") as Boolean

    override fun isRichText(): Boolean =
        Native.objc_msgSend("boolean", this, "isRichText") as Boolean

    override fun isRulerVisible(): Boolean =
        Native.objc_msgSend("boolean", this, "isRulerVisible") as Boolean

    override fun isSelectable(): Boolean =
        Native.objc_msgSend("boolean", this, "isSelectable") as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    override fun selectAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectAll:", sender)
    }

    override fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    override fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    override fun setDrawsBackground(drawsBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsBackground:", drawsBackground)
    }

    override fun setEditable(editable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEditable:", editable)
    }

    override fun setFieldEditor(fieldEditor: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFieldEditor:", fieldEditor)
    }

    override fun setImportsGraphics(importsGraphics: Boolean): Unit {
        Native.objc_msgSend("void", this, "setImportsGraphics:", importsGraphics)
    }

    override fun setRichText(richText: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRichText:", richText)
    }

    override fun setSelectable(selectable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectable:", selectable)
    }

    override fun setSelectedRange(charRange: Any): Unit {
        Native.objc_msgSend("void", this, "setSelectedRange:", charRange)
    }

    override fun setUsesFontPanel(usesFontPanel: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesFontPanel:", usesFontPanel)
    }

    override fun usesFontPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "usesFontPanel") as Boolean

    override fun validRequestorForSendType_returnType(sendType: NSString, returnType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "validRequestorForSendType:returnType:", sendType, returnType) as ObjCObject

    trait metaclass : NSText.metaclass, NSUserInterfaceValidations.metaclass, NSTextInputClient.metaclass, NSTextLayoutOrientationProvider.metaclass, NSDraggingSource.metaclass, NSTextInput.metaclass, NSAccessibilityNavigableStaticText.metaclass, NSTextView_NSCompletion.metaclass, NSTextView_NSPasteboard.metaclass, NSTextView_NSDragging.metaclass, NSTextView_NSSharing.metaclass, NSTextView_NSTextChecking.metaclass, NSTextView_NSQuickLookPreview.metaclass, NSTextView_NSTextView_SharingService.metaclass, NSTextView_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSTextView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSTextView_NSCompletion : IObjCObject {
    public open fun complete(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "complete:", sender)
    }

    public open fun rangeForUserCompletion(): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeForUserCompletion")

    public open fun completionsForPartialWordRange_indexOfSelectedItem(charRange: Any, index: Pointer<Int>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "completionsForPartialWordRange:indexOfSelectedItem:", charRange, index) as NSArray

    public open fun insertCompletion_forPartialWordRange_movement_isFinal(word: NSString, charRange: Any, movement: Int, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "insertCompletion:forPartialWordRange:movement:isFinal:", word, charRange, movement, flag)
    }

    trait metaclass : IObjCObject
}

trait NSTextView_NSPasteboard : IObjCObject {
    public open fun writablePasteboardTypes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "writablePasteboardTypes") as NSArray

    public open fun writeSelectionToPasteboard_type(pboard: NSPasteboard, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "writeSelectionToPasteboard:type:", pboard, type) as Boolean

    public open fun writeSelectionToPasteboard_types(pboard: NSPasteboard, types: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "writeSelectionToPasteboard:types:", pboard, types) as Boolean

    public open fun readablePasteboardTypes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "readablePasteboardTypes") as NSArray

    public open fun preferredPasteboardTypeFromArray_restrictedToTypesFromArray(availableTypes: NSArray, allowedTypes: NSArray): NSString =
        Native.objc_msgSend("class objc.NSString", this, "preferredPasteboardTypeFromArray:restrictedToTypesFromArray:", availableTypes, allowedTypes) as NSString

    public open fun readSelectionFromPasteboard_type(pboard: NSPasteboard, type: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "readSelectionFromPasteboard:type:", pboard, type) as Boolean

    public open fun readSelectionFromPasteboard(pboard: NSPasteboard): Boolean =
        Native.objc_msgSend("boolean", this, "readSelectionFromPasteboard:", pboard) as Boolean

    public open fun validRequestorForSendType_returnType(sendType: NSString, returnType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "validRequestorForSendType:returnType:", sendType, returnType) as ObjCObject

    public open fun pasteAsPlainText(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "pasteAsPlainText:", sender)
    }

    public open fun pasteAsRichText(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "pasteAsRichText:", sender)
    }

    trait metaclass : IObjCObject {
        public open fun registerForServices(): Unit {
            Native.objc_msgSend("void", this, "registerForServices")
        }
    }
}

trait NSTextView_NSDragging : IObjCObject {
    public open fun dragSelectionWithEvent_offset_slideBack(event: NSEvent, mouseOffset: Any, slideBack: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "dragSelectionWithEvent:offset:slideBack:", event, mouseOffset, slideBack) as Boolean

    public open fun dragImageForSelectionWithEvent_origin(event: NSEvent, origin: Pointer<Any>): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "dragImageForSelectionWithEvent:origin:", event, origin) as NSImage

    public open fun acceptableDragTypes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "acceptableDragTypes") as NSArray

    public open fun dragOperationForDraggingInfo_type(dragInfo: Any, type: NSString): Any =
        Native.objc_msgSend("class objc.Any", this, "dragOperationForDraggingInfo:type:", dragInfo, type)

    public open fun cleanUpAfterDragOperation(): Unit {
        Native.objc_msgSend("void", this, "cleanUpAfterDragOperation")
    }

    trait metaclass : IObjCObject
}

trait NSTextView_NSSharing : IObjCObject {
    public open fun selectedRanges(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "selectedRanges") as NSArray

    public open fun setSelectedRanges(selectedRanges: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSelectedRanges:", selectedRanges)
    }

    public open fun setSelectedRanges_affinity_stillSelecting(ranges: NSArray, affinity: Any, stillSelectingFlag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectedRanges:affinity:stillSelecting:", ranges, affinity, stillSelectingFlag)
    }

    public open fun setSelectedRange_affinity_stillSelecting(charRange: Any, affinity: Any, stillSelectingFlag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectedRange:affinity:stillSelecting:", charRange, affinity, stillSelectingFlag)
    }

    public open fun selectionAffinity(): Any =
        Native.objc_msgSend("class objc.Any", this, "selectionAffinity")

    public open fun selectionGranularity(): Any =
        Native.objc_msgSend("class objc.Any", this, "selectionGranularity")

    public open fun setSelectionGranularity(selectionGranularity: Any): Unit {
        Native.objc_msgSend("void", this, "setSelectionGranularity:", selectionGranularity)
    }

    public open fun selectedTextAttributes(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "selectedTextAttributes") as NSDictionary

    public open fun setSelectedTextAttributes(selectedTextAttributes: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setSelectedTextAttributes:", selectedTextAttributes)
    }

    public open fun insertionPointColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "insertionPointColor") as NSColor

    public open fun setInsertionPointColor(insertionPointColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setInsertionPointColor:", insertionPointColor)
    }

    public open fun updateInsertionPointStateAndRestartTimer(restartFlag: Boolean): Unit {
        Native.objc_msgSend("void", this, "updateInsertionPointStateAndRestartTimer:", restartFlag)
    }

    public open fun markedTextAttributes(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "markedTextAttributes") as NSDictionary

    public open fun setMarkedTextAttributes(markedTextAttributes: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setMarkedTextAttributes:", markedTextAttributes)
    }

    public open fun linkTextAttributes(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "linkTextAttributes") as NSDictionary

    public open fun setLinkTextAttributes(linkTextAttributes: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setLinkTextAttributes:", linkTextAttributes)
    }

    public open fun displaysLinkToolTips(): Boolean =
        Native.objc_msgSend("boolean", this, "displaysLinkToolTips") as Boolean

    public open fun setDisplaysLinkToolTips(displaysLinkToolTips: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDisplaysLinkToolTips:", displaysLinkToolTips)
    }

    public open fun acceptsGlyphInfo(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsGlyphInfo") as Boolean

    public open fun setAcceptsGlyphInfo(acceptsGlyphInfo: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAcceptsGlyphInfo:", acceptsGlyphInfo)
    }

    public open fun usesRuler(): Boolean =
        Native.objc_msgSend("boolean", this, "usesRuler") as Boolean

    public open fun setUsesRuler(usesRuler: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesRuler:", usesRuler)
    }

    public open fun usesInspectorBar(): Boolean =
        Native.objc_msgSend("boolean", this, "usesInspectorBar") as Boolean

    public open fun setUsesInspectorBar(usesInspectorBar: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesInspectorBar:", usesInspectorBar)
    }

    public open fun isContinuousSpellCheckingEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isContinuousSpellCheckingEnabled") as Boolean

    public open fun setContinuousSpellCheckingEnabled(continuousSpellCheckingEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setContinuousSpellCheckingEnabled:", continuousSpellCheckingEnabled)
    }

    public open fun toggleContinuousSpellChecking(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleContinuousSpellChecking:", sender)
    }

    public open fun spellCheckerDocumentTag(): Int =
        Native.objc_msgSend("int", this, "spellCheckerDocumentTag") as Int

    public open fun isGrammarCheckingEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isGrammarCheckingEnabled") as Boolean

    public open fun setGrammarCheckingEnabled(grammarCheckingEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setGrammarCheckingEnabled:", grammarCheckingEnabled)
    }

    public open fun toggleGrammarChecking(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleGrammarChecking:", sender)
    }

    public open fun setSpellingState_range(value: Int, charRange: Any): Unit {
        Native.objc_msgSend("void", this, "setSpellingState:range:", value, charRange)
    }

    public open fun typingAttributes(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "typingAttributes") as NSDictionary

    public open fun setTypingAttributes(typingAttributes: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setTypingAttributes:", typingAttributes)
    }

    public open fun shouldChangeTextInRanges_replacementStrings(affectedRanges: NSArray, replacementStrings: NSArray): Boolean =
        Native.objc_msgSend("boolean", this, "shouldChangeTextInRanges:replacementStrings:", affectedRanges, replacementStrings) as Boolean

    public open fun rangesForUserTextChange(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "rangesForUserTextChange") as NSArray

    public open fun rangesForUserCharacterAttributeChange(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "rangesForUserCharacterAttributeChange") as NSArray

    public open fun rangesForUserParagraphAttributeChange(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "rangesForUserParagraphAttributeChange") as NSArray

    public open fun shouldChangeTextInRange_replacementString(affectedCharRange: Any, replacementString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "shouldChangeTextInRange:replacementString:", affectedCharRange, replacementString) as Boolean

    public open fun didChangeText(): Unit {
        Native.objc_msgSend("void", this, "didChangeText")
    }

    public open fun rangeForUserTextChange(): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeForUserTextChange")

    public open fun rangeForUserCharacterAttributeChange(): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeForUserCharacterAttributeChange")

    public open fun rangeForUserParagraphAttributeChange(): Any =
        Native.objc_msgSend("class objc.Any", this, "rangeForUserParagraphAttributeChange")

    public open fun allowsDocumentBackgroundColorChange(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsDocumentBackgroundColorChange") as Boolean

    public open fun setAllowsDocumentBackgroundColorChange(allowsDocumentBackgroundColorChange: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsDocumentBackgroundColorChange:", allowsDocumentBackgroundColorChange)
    }

    public open fun defaultParagraphStyle(): NSParagraphStyle =
        Native.objc_msgSend("class objc.NSParagraphStyle", this, "defaultParagraphStyle") as NSParagraphStyle

    public open fun setDefaultParagraphStyle(defaultParagraphStyle: NSParagraphStyle): Unit {
        Native.objc_msgSend("void", this, "setDefaultParagraphStyle:", defaultParagraphStyle)
    }

    public open fun allowsUndo(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsUndo") as Boolean

    public open fun setAllowsUndo(allowsUndo: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsUndo:", allowsUndo)
    }

    public open fun breakUndoCoalescing(): Unit {
        Native.objc_msgSend("void", this, "breakUndoCoalescing")
    }

    public open fun isCoalescingUndo(): Boolean =
        Native.objc_msgSend("boolean", this, "isCoalescingUndo") as Boolean

    public open fun allowsImageEditing(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsImageEditing") as Boolean

    public open fun setAllowsImageEditing(allowsImageEditing: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsImageEditing:", allowsImageEditing)
    }

    public open fun showFindIndicatorForRange(charRange: Any): Unit {
        Native.objc_msgSend("void", this, "showFindIndicatorForRange:", charRange)
    }

    public open fun usesRolloverButtonForSelection(): Boolean =
        Native.objc_msgSend("boolean", this, "usesRolloverButtonForSelection") as Boolean

    public open fun setUsesRolloverButtonForSelection(usesRolloverButtonForSelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesRolloverButtonForSelection:", usesRolloverButtonForSelection)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
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

    public open fun isRichText(): Boolean =
        Native.objc_msgSend("boolean", this, "isRichText") as Boolean

    public open fun setRichText(richText: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRichText:", richText)
    }

    public open fun importsGraphics(): Boolean =
        Native.objc_msgSend("boolean", this, "importsGraphics") as Boolean

    public open fun setImportsGraphics(importsGraphics: Boolean): Unit {
        Native.objc_msgSend("void", this, "setImportsGraphics:", importsGraphics)
    }

    public open fun drawsBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsBackground") as Boolean

    public open fun setDrawsBackground(drawsBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsBackground:", drawsBackground)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun isFieldEditor(): Boolean =
        Native.objc_msgSend("boolean", this, "isFieldEditor") as Boolean

    public open fun setFieldEditor(fieldEditor: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFieldEditor:", fieldEditor)
    }

    public open fun usesFontPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "usesFontPanel") as Boolean

    public open fun setUsesFontPanel(usesFontPanel: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesFontPanel:", usesFontPanel)
    }

    public open fun isRulerVisible(): Boolean =
        Native.objc_msgSend("boolean", this, "isRulerVisible") as Boolean

    public open fun setRulerVisible(rulerVisible: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRulerVisible:", rulerVisible)
    }

    public open fun setSelectedRange(charRange: Any): Unit {
        Native.objc_msgSend("void", this, "setSelectedRange:", charRange)
    }

    public open fun allowedInputSourceLocales(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "allowedInputSourceLocales") as NSArray

    public open fun setAllowedInputSourceLocales(allowedInputSourceLocales: NSArray): Unit {
        Native.objc_msgSend("void", this, "setAllowedInputSourceLocales:", allowedInputSourceLocales)
    }

    trait metaclass : IObjCObject
}

trait NSTextView_NSTextChecking : IObjCObject {
    public open fun smartInsertDeleteEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "smartInsertDeleteEnabled") as Boolean

    public open fun setSmartInsertDeleteEnabled(smartInsertDeleteEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSmartInsertDeleteEnabled:", smartInsertDeleteEnabled)
    }

    public open fun smartDeleteRangeForProposedRange(proposedCharRange: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "smartDeleteRangeForProposedRange:", proposedCharRange)

    public open fun toggleSmartInsertDelete(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleSmartInsertDelete:", sender)
    }

    public open fun smartInsertForString_replacingRange_beforeString_afterString(pasteString: NSString, charRangeToReplace: Any, beforeString: Pointer<NSString>, afterString: Pointer<NSString>): Unit {
        Native.objc_msgSend("void", this, "smartInsertForString:replacingRange:beforeString:afterString:", pasteString, charRangeToReplace, beforeString, afterString)
    }

    public open fun smartInsertBeforeStringForString_replacingRange(pasteString: NSString, charRangeToReplace: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "smartInsertBeforeStringForString:replacingRange:", pasteString, charRangeToReplace) as NSString

    public open fun smartInsertAfterStringForString_replacingRange(pasteString: NSString, charRangeToReplace: Any): NSString =
        Native.objc_msgSend("class objc.NSString", this, "smartInsertAfterStringForString:replacingRange:", pasteString, charRangeToReplace) as NSString

    public open fun isAutomaticQuoteSubstitutionEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isAutomaticQuoteSubstitutionEnabled") as Boolean

    public open fun setAutomaticQuoteSubstitutionEnabled(automaticQuoteSubstitutionEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticQuoteSubstitutionEnabled:", automaticQuoteSubstitutionEnabled)
    }

    public open fun toggleAutomaticQuoteSubstitution(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleAutomaticQuoteSubstitution:", sender)
    }

    public open fun isAutomaticLinkDetectionEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isAutomaticLinkDetectionEnabled") as Boolean

    public open fun setAutomaticLinkDetectionEnabled(automaticLinkDetectionEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticLinkDetectionEnabled:", automaticLinkDetectionEnabled)
    }

    public open fun toggleAutomaticLinkDetection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleAutomaticLinkDetection:", sender)
    }

    public open fun isAutomaticDataDetectionEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isAutomaticDataDetectionEnabled") as Boolean

    public open fun setAutomaticDataDetectionEnabled(automaticDataDetectionEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticDataDetectionEnabled:", automaticDataDetectionEnabled)
    }

    public open fun toggleAutomaticDataDetection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleAutomaticDataDetection:", sender)
    }

    public open fun isAutomaticDashSubstitutionEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isAutomaticDashSubstitutionEnabled") as Boolean

    public open fun setAutomaticDashSubstitutionEnabled(automaticDashSubstitutionEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticDashSubstitutionEnabled:", automaticDashSubstitutionEnabled)
    }

    public open fun toggleAutomaticDashSubstitution(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleAutomaticDashSubstitution:", sender)
    }

    public open fun isAutomaticTextReplacementEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isAutomaticTextReplacementEnabled") as Boolean

    public open fun setAutomaticTextReplacementEnabled(automaticTextReplacementEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticTextReplacementEnabled:", automaticTextReplacementEnabled)
    }

    public open fun toggleAutomaticTextReplacement(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleAutomaticTextReplacement:", sender)
    }

    public open fun isAutomaticSpellingCorrectionEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isAutomaticSpellingCorrectionEnabled") as Boolean

    public open fun setAutomaticSpellingCorrectionEnabled(automaticSpellingCorrectionEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticSpellingCorrectionEnabled:", automaticSpellingCorrectionEnabled)
    }

    public open fun toggleAutomaticSpellingCorrection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleAutomaticSpellingCorrection:", sender)
    }

    public open fun enabledTextCheckingTypes(): Long =
        Native.objc_msgSend("long", this, "enabledTextCheckingTypes") as Long

    public open fun setEnabledTextCheckingTypes(enabledTextCheckingTypes: Long): Unit {
        Native.objc_msgSend("void", this, "setEnabledTextCheckingTypes:", enabledTextCheckingTypes)
    }

    public open fun checkTextInRange_types_options(range: Any, checkingTypes: Long, options: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "checkTextInRange:types:options:", range, checkingTypes, options)
    }

    public open fun handleTextCheckingResults_forRange_types_options_orthography_wordCount(results: NSArray, range: Any, checkingTypes: Long, options: NSDictionary, orthography: NSOrthography, wordCount: Int): Unit {
        Native.objc_msgSend("void", this, "handleTextCheckingResults:forRange:types:options:orthography:wordCount:", results, range, checkingTypes, options, orthography, wordCount)
    }

    public open fun orderFrontSubstitutionsPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontSubstitutionsPanel:", sender)
    }

    public open fun checkTextInSelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "checkTextInSelection:", sender)
    }

    public open fun checkTextInDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "checkTextInDocument:", sender)
    }

    public open fun usesFindPanel(): Boolean =
        Native.objc_msgSend("boolean", this, "usesFindPanel") as Boolean

    public open fun setUsesFindPanel(usesFindPanel: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesFindPanel:", usesFindPanel)
    }

    public open fun usesFindBar(): Boolean =
        Native.objc_msgSend("boolean", this, "usesFindBar") as Boolean

    public open fun setUsesFindBar(usesFindBar: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesFindBar:", usesFindBar)
    }

    public open fun isIncrementalSearchingEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isIncrementalSearchingEnabled") as Boolean

    public open fun setIncrementalSearchingEnabled(incrementalSearchingEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncrementalSearchingEnabled:", incrementalSearchingEnabled)
    }

    trait metaclass : IObjCObject
}

trait NSTextView_NSQuickLookPreview : IObjCObject {
    public open fun toggleQuickLookPreviewPanel(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleQuickLookPreviewPanel:", sender)
    }

    public open fun quickLookPreviewableItemsInRanges(ranges: NSArray): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "quickLookPreviewableItemsInRanges:", ranges) as NSArray

    public open fun updateQuickLookPreviewPanel(): Unit {
        Native.objc_msgSend("void", this, "updateQuickLookPreviewPanel")
    }

    trait metaclass : IObjCObject
}

trait NSTextView_NSTextView_SharingService : IObjCObject {
    public open fun orderFrontSharingServicePicker(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFrontSharingServicePicker:", sender)
    }

    trait metaclass : IObjCObject
}

trait NSTextView_NSDeprecated : IObjCObject {
    public open fun toggleBaseWritingDirection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleBaseWritingDirection:", sender)
    }

    trait metaclass : IObjCObject
}
