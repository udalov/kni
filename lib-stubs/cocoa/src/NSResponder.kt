// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSResponder.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSResponder(pointer: Long) : NSObject(pointer), NSCoding, NSResponder_NSStandardKeyBindingMethods, NSResponder_NSUndoSupport, NSResponder_NSControlEditingSupport, NSResponder_NSErrorPresentation, NSResponder_NSTextFinderSupport, NSResponder_NSDeprecated, NSResponder_NSUserActivity, NSResponder_NSInterfaceStyle, NSResponder_NSRestorableState {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun nextResponder(): NSResponder =
        Native.objc_msgSend("class objc.NSResponder", this, "nextResponder") as NSResponder

    public open fun setNextResponder(nextResponder: NSResponder): Unit {
        Native.objc_msgSend("void", this, "setNextResponder:", nextResponder)
    }

    public open fun tryToPerform_with(anAction: ObjCSelector, anObject: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "tryToPerform:with:", anAction, anObject) as Boolean

    public open fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    public open fun validRequestorForSendType_returnType(sendType: NSString, returnType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "validRequestorForSendType:returnType:", sendType, returnType) as ObjCObject

    public open fun mouseDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDown:", theEvent)
    }

    public open fun rightMouseDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rightMouseDown:", theEvent)
    }

    public open fun otherMouseDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "otherMouseDown:", theEvent)
    }

    public open fun mouseUp(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseUp:", theEvent)
    }

    public open fun rightMouseUp(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rightMouseUp:", theEvent)
    }

    public open fun otherMouseUp(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "otherMouseUp:", theEvent)
    }

    public open fun mouseMoved(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseMoved:", theEvent)
    }

    public open fun mouseDragged(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDragged:", theEvent)
    }

    public open fun scrollWheel(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "scrollWheel:", theEvent)
    }

    public open fun rightMouseDragged(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rightMouseDragged:", theEvent)
    }

    public open fun otherMouseDragged(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "otherMouseDragged:", theEvent)
    }

    public open fun mouseEntered(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseEntered:", theEvent)
    }

    public open fun mouseExited(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseExited:", theEvent)
    }

    public open fun keyDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "keyDown:", theEvent)
    }

    public open fun keyUp(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "keyUp:", theEvent)
    }

    public open fun flagsChanged(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "flagsChanged:", theEvent)
    }

    public open fun tabletPoint(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "tabletPoint:", theEvent)
    }

    public open fun tabletProximity(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "tabletProximity:", theEvent)
    }

    public open fun cursorUpdate(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "cursorUpdate:", event)
    }

    public open fun magnifyWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "magnifyWithEvent:", event)
    }

    public open fun rotateWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "rotateWithEvent:", event)
    }

    public open fun swipeWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "swipeWithEvent:", event)
    }

    public open fun beginGestureWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "beginGestureWithEvent:", event)
    }

    public open fun endGestureWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "endGestureWithEvent:", event)
    }

    public open fun smartMagnifyWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "smartMagnifyWithEvent:", event)
    }

    public open fun touchesBeganWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "touchesBeganWithEvent:", event)
    }

    public open fun touchesMovedWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "touchesMovedWithEvent:", event)
    }

    public open fun touchesEndedWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "touchesEndedWithEvent:", event)
    }

    public open fun touchesCancelledWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "touchesCancelledWithEvent:", event)
    }

    public open fun quickLookWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "quickLookWithEvent:", event)
    }

    public open fun pressureChangeWithEvent(event: NSEvent): Unit {
        Native.objc_msgSend("void", this, "pressureChangeWithEvent:", event)
    }

    public open fun noResponderFor(eventSelector: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "noResponderFor:", eventSelector)
    }

    public open fun acceptsFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsFirstResponder") as Boolean

    public open fun becomeFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "becomeFirstResponder") as Boolean

    public open fun resignFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "resignFirstResponder") as Boolean

    public open fun interpretKeyEvents(eventArray: NSArray): Unit {
        Native.objc_msgSend("void", this, "interpretKeyEvents:", eventArray)
    }

    public open fun flushBufferedKeyEvents(): Unit {
        Native.objc_msgSend("void", this, "flushBufferedKeyEvents")
    }

    public open fun menu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menu") as NSMenu

    public open fun setMenu(menu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setMenu:", menu)
    }

    public open fun showContextHelp(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "showContextHelp:", sender)
    }

    public open fun helpRequested(eventPtr: NSEvent): Unit {
        Native.objc_msgSend("void", this, "helpRequested:", eventPtr)
    }

    public open fun shouldBeTreatedAsInkEvent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "shouldBeTreatedAsInkEvent:", theEvent) as Boolean

    public open fun wantsScrollEventsForSwipeTrackingOnAxis(axis: Any): Boolean =
        Native.objc_msgSend("boolean", this, "wantsScrollEventsForSwipeTrackingOnAxis:", axis) as Boolean

    public open fun wantsForwardedScrollEventsForAxis(axis: Any): Boolean =
        Native.objc_msgSend("boolean", this, "wantsForwardedScrollEventsForAxis:", axis) as Boolean

    public open fun supplementalTargetForAction_sender(action: ObjCSelector, sender: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "supplementalTargetForAction:sender:", action, sender) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass, NSResponder_NSStandardKeyBindingMethods.metaclass, NSResponder_NSUndoSupport.metaclass, NSResponder_NSControlEditingSupport.metaclass, NSResponder_NSErrorPresentation.metaclass, NSResponder_NSTextFinderSupport.metaclass, NSResponder_NSDeprecated.metaclass, NSResponder_NSUserActivity.metaclass, NSResponder_NSInterfaceStyle.metaclass, NSResponder_NSRestorableState.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSResponder")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSResponder_NSStandardKeyBindingMethods : IObjCObject {
    public open fun insertText(insertString: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertText:", insertString)
    }

    public open fun doCommandBySelector(aSelector: ObjCSelector): Unit {
        Native.objc_msgSend("void", this, "doCommandBySelector:", aSelector)
    }

    public open fun moveForward(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveForward:", sender)
    }

    public open fun moveRight(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveRight:", sender)
    }

    public open fun moveBackward(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveBackward:", sender)
    }

    public open fun moveLeft(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveLeft:", sender)
    }

    public open fun moveUp(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveUp:", sender)
    }

    public open fun moveDown(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveDown:", sender)
    }

    public open fun moveWordForward(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveWordForward:", sender)
    }

    public open fun moveWordBackward(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveWordBackward:", sender)
    }

    public open fun moveToBeginningOfLine(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToBeginningOfLine:", sender)
    }

    public open fun moveToEndOfLine(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToEndOfLine:", sender)
    }

    public open fun moveToBeginningOfParagraph(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToBeginningOfParagraph:", sender)
    }

    public open fun moveToEndOfParagraph(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToEndOfParagraph:", sender)
    }

    public open fun moveToEndOfDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToEndOfDocument:", sender)
    }

    public open fun moveToBeginningOfDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToBeginningOfDocument:", sender)
    }

    public open fun pageDown(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "pageDown:", sender)
    }

    public open fun pageUp(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "pageUp:", sender)
    }

    public open fun centerSelectionInVisibleArea(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "centerSelectionInVisibleArea:", sender)
    }

    public open fun moveBackwardAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveBackwardAndModifySelection:", sender)
    }

    public open fun moveForwardAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveForwardAndModifySelection:", sender)
    }

    public open fun moveWordForwardAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveWordForwardAndModifySelection:", sender)
    }

    public open fun moveWordBackwardAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveWordBackwardAndModifySelection:", sender)
    }

    public open fun moveUpAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveUpAndModifySelection:", sender)
    }

    public open fun moveDownAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveDownAndModifySelection:", sender)
    }

    public open fun moveToBeginningOfLineAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToBeginningOfLineAndModifySelection:", sender)
    }

    public open fun moveToEndOfLineAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToEndOfLineAndModifySelection:", sender)
    }

    public open fun moveToBeginningOfParagraphAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToBeginningOfParagraphAndModifySelection:", sender)
    }

    public open fun moveToEndOfParagraphAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToEndOfParagraphAndModifySelection:", sender)
    }

    public open fun moveToEndOfDocumentAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToEndOfDocumentAndModifySelection:", sender)
    }

    public open fun moveToBeginningOfDocumentAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToBeginningOfDocumentAndModifySelection:", sender)
    }

    public open fun pageDownAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "pageDownAndModifySelection:", sender)
    }

    public open fun pageUpAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "pageUpAndModifySelection:", sender)
    }

    public open fun moveParagraphForwardAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveParagraphForwardAndModifySelection:", sender)
    }

    public open fun moveParagraphBackwardAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveParagraphBackwardAndModifySelection:", sender)
    }

    public open fun moveWordRight(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveWordRight:", sender)
    }

    public open fun moveWordLeft(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveWordLeft:", sender)
    }

    public open fun moveRightAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveRightAndModifySelection:", sender)
    }

    public open fun moveLeftAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveLeftAndModifySelection:", sender)
    }

    public open fun moveWordRightAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveWordRightAndModifySelection:", sender)
    }

    public open fun moveWordLeftAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveWordLeftAndModifySelection:", sender)
    }

    public open fun moveToLeftEndOfLine(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToLeftEndOfLine:", sender)
    }

    public open fun moveToRightEndOfLine(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToRightEndOfLine:", sender)
    }

    public open fun moveToLeftEndOfLineAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToLeftEndOfLineAndModifySelection:", sender)
    }

    public open fun moveToRightEndOfLineAndModifySelection(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "moveToRightEndOfLineAndModifySelection:", sender)
    }

    public open fun scrollPageUp(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "scrollPageUp:", sender)
    }

    public open fun scrollPageDown(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "scrollPageDown:", sender)
    }

    public open fun scrollLineUp(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "scrollLineUp:", sender)
    }

    public open fun scrollLineDown(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "scrollLineDown:", sender)
    }

    public open fun scrollToBeginningOfDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "scrollToBeginningOfDocument:", sender)
    }

    public open fun scrollToEndOfDocument(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "scrollToEndOfDocument:", sender)
    }

    public open fun transpose(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "transpose:", sender)
    }

    public open fun transposeWords(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "transposeWords:", sender)
    }

    public open fun selectAll(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectAll:", sender)
    }

    public open fun selectParagraph(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectParagraph:", sender)
    }

    public open fun selectLine(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectLine:", sender)
    }

    public open fun selectWord(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectWord:", sender)
    }

    public open fun indent(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "indent:", sender)
    }

    public open fun insertTab(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertTab:", sender)
    }

    public open fun insertBacktab(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertBacktab:", sender)
    }

    public open fun insertNewline(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertNewline:", sender)
    }

    public open fun insertParagraphSeparator(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertParagraphSeparator:", sender)
    }

    public open fun insertNewlineIgnoringFieldEditor(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertNewlineIgnoringFieldEditor:", sender)
    }

    public open fun insertTabIgnoringFieldEditor(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertTabIgnoringFieldEditor:", sender)
    }

    public open fun insertLineBreak(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertLineBreak:", sender)
    }

    public open fun insertContainerBreak(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertContainerBreak:", sender)
    }

    public open fun insertSingleQuoteIgnoringSubstitution(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertSingleQuoteIgnoringSubstitution:", sender)
    }

    public open fun insertDoubleQuoteIgnoringSubstitution(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "insertDoubleQuoteIgnoringSubstitution:", sender)
    }

    public open fun changeCaseOfLetter(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "changeCaseOfLetter:", sender)
    }

    public open fun uppercaseWord(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "uppercaseWord:", sender)
    }

    public open fun lowercaseWord(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "lowercaseWord:", sender)
    }

    public open fun capitalizeWord(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "capitalizeWord:", sender)
    }

    public open fun deleteForward(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteForward:", sender)
    }

    public open fun deleteBackward(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteBackward:", sender)
    }

    public open fun deleteBackwardByDecomposingPreviousCharacter(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteBackwardByDecomposingPreviousCharacter:", sender)
    }

    public open fun deleteWordForward(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteWordForward:", sender)
    }

    public open fun deleteWordBackward(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteWordBackward:", sender)
    }

    public open fun deleteToBeginningOfLine(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteToBeginningOfLine:", sender)
    }

    public open fun deleteToEndOfLine(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteToEndOfLine:", sender)
    }

    public open fun deleteToBeginningOfParagraph(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteToBeginningOfParagraph:", sender)
    }

    public open fun deleteToEndOfParagraph(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteToEndOfParagraph:", sender)
    }

    public open fun yank(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "yank:", sender)
    }

    public open fun complete(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "complete:", sender)
    }

    public open fun setMark(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setMark:", sender)
    }

    public open fun deleteToMark(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deleteToMark:", sender)
    }

    public open fun selectToMark(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectToMark:", sender)
    }

    public open fun swapWithMark(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "swapWithMark:", sender)
    }

    public open fun cancelOperation(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "cancelOperation:", sender)
    }

    public open fun makeBaseWritingDirectionNatural(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "makeBaseWritingDirectionNatural:", sender)
    }

    public open fun makeBaseWritingDirectionLeftToRight(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "makeBaseWritingDirectionLeftToRight:", sender)
    }

    public open fun makeBaseWritingDirectionRightToLeft(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "makeBaseWritingDirectionRightToLeft:", sender)
    }

    public open fun makeTextWritingDirectionNatural(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "makeTextWritingDirectionNatural:", sender)
    }

    public open fun makeTextWritingDirectionLeftToRight(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "makeTextWritingDirectionLeftToRight:", sender)
    }

    public open fun makeTextWritingDirectionRightToLeft(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "makeTextWritingDirectionRightToLeft:", sender)
    }

    public open fun quickLookPreviewItems(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "quickLookPreviewItems:", sender)
    }

    trait metaclass : IObjCObject
}

trait NSResponder_NSUndoSupport : IObjCObject {
    public open fun undoManager(): NSUndoManager =
        Native.objc_msgSend("class objc.NSUndoManager", this, "undoManager") as NSUndoManager

    trait metaclass : IObjCObject
}

trait NSResponder_NSControlEditingSupport : IObjCObject {
    public open fun validateProposedFirstResponder_forEvent(responder: NSResponder, event: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "validateProposedFirstResponder:forEvent:", responder, event) as Boolean

    trait metaclass : IObjCObject
}

trait NSResponder_NSErrorPresentation : IObjCObject {
    public open fun presentError_modalForWindow_delegate_didPresentSelector_contextInfo(error: NSError, window: NSWindow, delegate: ObjCObject, didPresentSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "presentError:modalForWindow:delegate:didPresentSelector:contextInfo:", error, window, delegate, didPresentSelector, contextInfo)
    }

    public open fun presentError(error: NSError): Boolean =
        Native.objc_msgSend("boolean", this, "presentError:", error) as Boolean

    public open fun willPresentError(error: NSError): NSError =
        Native.objc_msgSend("class objc.NSError", this, "willPresentError:", error) as NSError

    trait metaclass : IObjCObject
}

trait NSResponder_NSTextFinderSupport : IObjCObject {
    public open fun performTextFinderAction(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performTextFinderAction:", sender)
    }

    trait metaclass : IObjCObject
}

trait NSResponder_NSDeprecated : IObjCObject {
    public open fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : IObjCObject
}
