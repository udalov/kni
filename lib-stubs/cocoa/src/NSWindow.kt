// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSWindow.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSWindowDelegate {
    trait metaclass
}

public open class NSWindow(pointer: Long) : NSResponder(pointer), NSAnimatablePropertyContainer, NSUserInterfaceValidations, NSUserInterfaceItemIdentification, NSAppearanceCustomization, NSAccessibilityElementProtocol, NSAccessibility, NSWindow_NSKeyboardUI, NSWindow_NSToolbarSupport, NSWindow_NSDrag, NSWindow_NSCarbonExtensions, NSWindow_NSDeprecated, NSWindow_NSConstraintBasedLayoutCoreMethods, NSWindow_NSConstraintBasedLayoutAnchoring, NSWindow_NSConstraintBasedLayoutDebugging, NSWindow_Drawers, NSWindow_NSScripting, NSWindow_NSUserInterfaceRestoration {
    public open fun frameRectForContentRect(contentRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "frameRectForContentRect:", contentRect)

    public open fun contentRectForFrameRect(frameRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "contentRectForFrameRect:", frameRect)

    public open fun initWithContentRect_styleMask_backing_defer(contentRect: Any, aStyle: Int, bufferingType: Any, flag: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentRect:styleMask:backing:defer:", contentRect, aStyle, bufferingType, flag) as ObjCObject

    public open fun initWithContentRect_styleMask_backing_defer_screen(contentRect: Any, aStyle: Int, bufferingType: Any, flag: Boolean, screen: NSScreen): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithContentRect:styleMask:backing:defer:screen:", contentRect, aStyle, bufferingType, flag, screen) as ObjCObject

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun titleVisibility(): Any =
        Native.objc_msgSend("class objc.Any", this, "titleVisibility")

    public open fun setTitleVisibility(titleVisibility: Any): Unit {
        Native.objc_msgSend("void", this, "setTitleVisibility:", titleVisibility)
    }

    public open fun titlebarAppearsTransparent(): Boolean =
        Native.objc_msgSend("boolean", this, "titlebarAppearsTransparent") as Boolean

    public open fun setTitlebarAppearsTransparent(titlebarAppearsTransparent: Boolean): Unit {
        Native.objc_msgSend("void", this, "setTitlebarAppearsTransparent:", titlebarAppearsTransparent)
    }

    public open fun contentLayoutRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentLayoutRect")

    public open fun contentLayoutGuide(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "contentLayoutGuide") as ObjCObject

    public open fun titlebarAccessoryViewControllers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "titlebarAccessoryViewControllers") as NSArray

    public open fun setTitlebarAccessoryViewControllers(titlebarAccessoryViewControllers: NSArray): Unit {
        Native.objc_msgSend("void", this, "setTitlebarAccessoryViewControllers:", titlebarAccessoryViewControllers)
    }

    public open fun addTitlebarAccessoryViewController(childViewController: NSTitlebarAccessoryViewController): Unit {
        Native.objc_msgSend("void", this, "addTitlebarAccessoryViewController:", childViewController)
    }

    public open fun insertTitlebarAccessoryViewController_atIndex(childViewController: NSTitlebarAccessoryViewController, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertTitlebarAccessoryViewController:atIndex:", childViewController, index)
    }

    public open fun removeTitlebarAccessoryViewControllerAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeTitlebarAccessoryViewControllerAtIndex:", index)
    }

    public open fun representedURL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "representedURL") as NSURL

    public open fun setRepresentedURL(representedURL: NSURL): Unit {
        Native.objc_msgSend("void", this, "setRepresentedURL:", representedURL)
    }

    public open fun representedFilename(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "representedFilename") as NSString

    public open fun setRepresentedFilename(representedFilename: NSString): Unit {
        Native.objc_msgSend("void", this, "setRepresentedFilename:", representedFilename)
    }

    public open fun setTitleWithRepresentedFilename(filename: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithRepresentedFilename:", filename)
    }

    public open fun isExcludedFromWindowsMenu(): Boolean =
        Native.objc_msgSend("boolean", this, "isExcludedFromWindowsMenu") as Boolean

    public open fun setExcludedFromWindowsMenu(excludedFromWindowsMenu: Boolean): Unit {
        Native.objc_msgSend("void", this, "setExcludedFromWindowsMenu:", excludedFromWindowsMenu)
    }

    public open fun contentView(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "contentView") as ObjCObject

    public open fun setContentView(contentView: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setContentView:", contentView)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun windowNumber(): Int =
        Native.objc_msgSend("int", this, "windowNumber") as Int

    public open fun styleMask(): Int =
        Native.objc_msgSend("int", this, "styleMask") as Int

    public open fun setStyleMask(styleMask: Int): Unit {
        Native.objc_msgSend("void", this, "setStyleMask:", styleMask)
    }

    public open fun fieldEditor_forObject(createFlag: Boolean, anObject: ObjCObject): NSText =
        Native.objc_msgSend("class objc.NSText", this, "fieldEditor:forObject:", createFlag, anObject) as NSText

    public open fun endEditingFor(anObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "endEditingFor:", anObject)
    }

    public open fun constrainFrameRect_toScreen(frameRect: Any, screen: NSScreen): Any =
        Native.objc_msgSend("class objc.Any", this, "constrainFrameRect:toScreen:", frameRect, screen)

    public open fun setFrame_display(frameRect: Any, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFrame:display:", frameRect, flag)
    }

    public open fun setContentSize(aSize: Any): Unit {
        Native.objc_msgSend("void", this, "setContentSize:", aSize)
    }

    public open fun setFrameOrigin(aPoint: Any): Unit {
        Native.objc_msgSend("void", this, "setFrameOrigin:", aPoint)
    }

    public open fun setFrameTopLeftPoint(aPoint: Any): Unit {
        Native.objc_msgSend("void", this, "setFrameTopLeftPoint:", aPoint)
    }

    public open fun cascadeTopLeftFromPoint(topLeftPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "cascadeTopLeftFromPoint:", topLeftPoint)

    public open fun frame(): Any =
        Native.objc_msgSend("class objc.Any", this, "frame")

    public open fun animationResizeTime(newFrame: Any): Double =
        Native.objc_msgSend("double", this, "animationResizeTime:", newFrame) as Double

    public open fun setFrame_display_animate(frameRect: Any, displayFlag: Boolean, animateFlag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFrame:display:animate:", frameRect, displayFlag, animateFlag)
    }

    public open fun inLiveResize(): Boolean =
        Native.objc_msgSend("boolean", this, "inLiveResize") as Boolean

    public open fun showsResizeIndicator(): Boolean =
        Native.objc_msgSend("boolean", this, "showsResizeIndicator") as Boolean

    public open fun setShowsResizeIndicator(showsResizeIndicator: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsResizeIndicator:", showsResizeIndicator)
    }

    public open fun resizeIncrements(): Any =
        Native.objc_msgSend("class objc.Any", this, "resizeIncrements")

    public open fun setResizeIncrements(resizeIncrements: Any): Unit {
        Native.objc_msgSend("void", this, "setResizeIncrements:", resizeIncrements)
    }

    public open fun aspectRatio(): Any =
        Native.objc_msgSend("class objc.Any", this, "aspectRatio")

    public open fun setAspectRatio(aspectRatio: Any): Unit {
        Native.objc_msgSend("void", this, "setAspectRatio:", aspectRatio)
    }

    public open fun contentResizeIncrements(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentResizeIncrements")

    public open fun setContentResizeIncrements(contentResizeIncrements: Any): Unit {
        Native.objc_msgSend("void", this, "setContentResizeIncrements:", contentResizeIncrements)
    }

    public open fun contentAspectRatio(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentAspectRatio")

    public open fun setContentAspectRatio(contentAspectRatio: Any): Unit {
        Native.objc_msgSend("void", this, "setContentAspectRatio:", contentAspectRatio)
    }

    public open fun disableFlushWindow(): Unit {
        Native.objc_msgSend("void", this, "disableFlushWindow")
    }

    public open fun enableFlushWindow(): Unit {
        Native.objc_msgSend("void", this, "enableFlushWindow")
    }

    public open fun isFlushWindowDisabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isFlushWindowDisabled") as Boolean

    public open fun flushWindow(): Unit {
        Native.objc_msgSend("void", this, "flushWindow")
    }

    public open fun flushWindowIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "flushWindowIfNeeded")
    }

    public open fun viewsNeedDisplay(): Boolean =
        Native.objc_msgSend("boolean", this, "viewsNeedDisplay") as Boolean

    public open fun setViewsNeedDisplay(viewsNeedDisplay: Boolean): Unit {
        Native.objc_msgSend("void", this, "setViewsNeedDisplay:", viewsNeedDisplay)
    }

    public open fun displayIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "displayIfNeeded")
    }

    public open fun display(): Unit {
        Native.objc_msgSend("void", this, "display")
    }

    public open fun isAutodisplay(): Boolean =
        Native.objc_msgSend("boolean", this, "isAutodisplay") as Boolean

    public open fun setAutodisplay(autodisplay: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutodisplay:", autodisplay)
    }

    public open fun preservesContentDuringLiveResize(): Boolean =
        Native.objc_msgSend("boolean", this, "preservesContentDuringLiveResize") as Boolean

    public open fun setPreservesContentDuringLiveResize(preservesContentDuringLiveResize: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPreservesContentDuringLiveResize:", preservesContentDuringLiveResize)
    }

    public open fun update(): Unit {
        Native.objc_msgSend("void", this, "update")
    }

    public open fun makeFirstResponder(aResponder: NSResponder): Boolean =
        Native.objc_msgSend("boolean", this, "makeFirstResponder:", aResponder) as Boolean

    public open fun firstResponder(): NSResponder =
        Native.objc_msgSend("class objc.NSResponder", this, "firstResponder") as NSResponder

    public open fun resizeFlags(): Int =
        Native.objc_msgSend("int", this, "resizeFlags") as Int

    override fun keyDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "keyDown:", theEvent)
    }

    public open fun close(): Unit {
        Native.objc_msgSend("void", this, "close")
    }

    public open fun isReleasedWhenClosed(): Boolean =
        Native.objc_msgSend("boolean", this, "isReleasedWhenClosed") as Boolean

    public open fun setReleasedWhenClosed(releasedWhenClosed: Boolean): Unit {
        Native.objc_msgSend("void", this, "setReleasedWhenClosed:", releasedWhenClosed)
    }

    public open fun miniaturize(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "miniaturize:", sender)
    }

    public open fun deminiaturize(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "deminiaturize:", sender)
    }

    public open fun isZoomed(): Boolean =
        Native.objc_msgSend("boolean", this, "isZoomed") as Boolean

    public open fun zoom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "zoom:", sender)
    }

    public open fun isMiniaturized(): Boolean =
        Native.objc_msgSend("boolean", this, "isMiniaturized") as Boolean

    override fun tryToPerform_with(anAction: ObjCSelector, anObject: ObjCObject): Boolean =
        Native.objc_msgSend("boolean", this, "tryToPerform:with:", anAction, anObject) as Boolean

    override fun validRequestorForSendType_returnType(sendType: NSString, returnType: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "validRequestorForSendType:returnType:", sendType, returnType) as ObjCObject

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun setContentBorderThickness_forEdge(thickness: Double, edge: Int): Unit {
        Native.objc_msgSend("void", this, "setContentBorderThickness:forEdge:", thickness, edge)
    }

    public open fun contentBorderThicknessForEdge(edge: Int): Double =
        Native.objc_msgSend("double", this, "contentBorderThicknessForEdge:", edge) as Double

    public open fun setAutorecalculatesContentBorderThickness_forEdge(flag: Boolean, edge: Int): Unit {
        Native.objc_msgSend("void", this, "setAutorecalculatesContentBorderThickness:forEdge:", flag, edge)
    }

    public open fun autorecalculatesContentBorderThicknessForEdge(edge: Int): Boolean =
        Native.objc_msgSend("boolean", this, "autorecalculatesContentBorderThicknessForEdge:", edge) as Boolean

    public open fun isMovable(): Boolean =
        Native.objc_msgSend("boolean", this, "isMovable") as Boolean

    public open fun setMovable(movable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setMovable:", movable)
    }

    public open fun isMovableByWindowBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "isMovableByWindowBackground") as Boolean

    public open fun setMovableByWindowBackground(movableByWindowBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setMovableByWindowBackground:", movableByWindowBackground)
    }

    public open fun hidesOnDeactivate(): Boolean =
        Native.objc_msgSend("boolean", this, "hidesOnDeactivate") as Boolean

    public open fun setHidesOnDeactivate(hidesOnDeactivate: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHidesOnDeactivate:", hidesOnDeactivate)
    }

    public open fun canHide(): Boolean =
        Native.objc_msgSend("boolean", this, "canHide") as Boolean

    public open fun setCanHide(canHide: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanHide:", canHide)
    }

    public open fun center(): Unit {
        Native.objc_msgSend("void", this, "center")
    }

    public open fun makeKeyAndOrderFront(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "makeKeyAndOrderFront:", sender)
    }

    public open fun orderFront(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderFront:", sender)
    }

    public open fun orderBack(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderBack:", sender)
    }

    public open fun orderOut(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "orderOut:", sender)
    }

    public open fun orderWindow_relativeTo(place: Any, otherWin: Int): Unit {
        Native.objc_msgSend("void", this, "orderWindow:relativeTo:", place, otherWin)
    }

    public open fun orderFrontRegardless(): Unit {
        Native.objc_msgSend("void", this, "orderFrontRegardless")
    }

    public open fun miniwindowImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "miniwindowImage") as NSImage

    public open fun setMiniwindowImage(miniwindowImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setMiniwindowImage:", miniwindowImage)
    }

    public open fun miniwindowTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "miniwindowTitle") as NSString

    public open fun setMiniwindowTitle(miniwindowTitle: NSString): Unit {
        Native.objc_msgSend("void", this, "setMiniwindowTitle:", miniwindowTitle)
    }

    public open fun dockTile(): NSDockTile =
        Native.objc_msgSend("class objc.NSDockTile", this, "dockTile") as NSDockTile

    public open fun isDocumentEdited(): Boolean =
        Native.objc_msgSend("boolean", this, "isDocumentEdited") as Boolean

    public open fun setDocumentEdited(documentEdited: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDocumentEdited:", documentEdited)
    }

    public open fun isVisible(): Boolean =
        Native.objc_msgSend("boolean", this, "isVisible") as Boolean

    public open fun isKeyWindow(): Boolean =
        Native.objc_msgSend("boolean", this, "isKeyWindow") as Boolean

    public open fun isMainWindow(): Boolean =
        Native.objc_msgSend("boolean", this, "isMainWindow") as Boolean

    public open fun canBecomeKeyWindow(): Boolean =
        Native.objc_msgSend("boolean", this, "canBecomeKeyWindow") as Boolean

    public open fun canBecomeMainWindow(): Boolean =
        Native.objc_msgSend("boolean", this, "canBecomeMainWindow") as Boolean

    public open fun makeKeyWindow(): Unit {
        Native.objc_msgSend("void", this, "makeKeyWindow")
    }

    public open fun makeMainWindow(): Unit {
        Native.objc_msgSend("void", this, "makeMainWindow")
    }

    public open fun becomeKeyWindow(): Unit {
        Native.objc_msgSend("void", this, "becomeKeyWindow")
    }

    public open fun resignKeyWindow(): Unit {
        Native.objc_msgSend("void", this, "resignKeyWindow")
    }

    public open fun becomeMainWindow(): Unit {
        Native.objc_msgSend("void", this, "becomeMainWindow")
    }

    public open fun resignMainWindow(): Unit {
        Native.objc_msgSend("void", this, "resignMainWindow")
    }

    public open fun worksWhenModal(): Boolean =
        Native.objc_msgSend("boolean", this, "worksWhenModal") as Boolean

    public open fun preventsApplicationTerminationWhenModal(): Boolean =
        Native.objc_msgSend("boolean", this, "preventsApplicationTerminationWhenModal") as Boolean

    public open fun setPreventsApplicationTerminationWhenModal(preventsApplicationTerminationWhenModal: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPreventsApplicationTerminationWhenModal:", preventsApplicationTerminationWhenModal)
    }

    public open fun convertRectToScreen(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectToScreen:", aRect)

    public open fun convertRectFromScreen(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectFromScreen:", aRect)

    public open fun convertRectToBacking(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectToBacking:", aRect)

    public open fun convertRectFromBacking(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectFromBacking:", aRect)

    public open fun backingAlignedRect_options(aRect: Any, options: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "backingAlignedRect:options:", aRect, options)

    public open fun backingScaleFactor(): Double =
        Native.objc_msgSend("double", this, "backingScaleFactor") as Double

    public open fun performClose(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performClose:", sender)
    }

    public open fun performMiniaturize(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performMiniaturize:", sender)
    }

    public open fun performZoom(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "performZoom:", sender)
    }

    public open fun isOneShot(): Boolean =
        Native.objc_msgSend("boolean", this, "isOneShot") as Boolean

    public open fun setOneShot(oneShot: Boolean): Unit {
        Native.objc_msgSend("void", this, "setOneShot:", oneShot)
    }

    public open fun dataWithEPSInsideRect(rect: Any): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataWithEPSInsideRect:", rect) as NSData

    public open fun dataWithPDFInsideRect(rect: Any): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataWithPDFInsideRect:", rect) as NSData

    public open fun print(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "print:", sender)
    }

    public open fun disableCursorRects(): Unit {
        Native.objc_msgSend("void", this, "disableCursorRects")
    }

    public open fun enableCursorRects(): Unit {
        Native.objc_msgSend("void", this, "enableCursorRects")
    }

    public open fun discardCursorRects(): Unit {
        Native.objc_msgSend("void", this, "discardCursorRects")
    }

    public open fun areCursorRectsEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "areCursorRectsEnabled") as Boolean

    public open fun invalidateCursorRectsForView(aView: NSView): Unit {
        Native.objc_msgSend("void", this, "invalidateCursorRectsForView:", aView)
    }

    public open fun resetCursorRects(): Unit {
        Native.objc_msgSend("void", this, "resetCursorRects")
    }

    public open fun allowsToolTipsWhenApplicationIsInactive(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsToolTipsWhenApplicationIsInactive") as Boolean

    public open fun setAllowsToolTipsWhenApplicationIsInactive(allowsToolTipsWhenApplicationIsInactive: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsToolTipsWhenApplicationIsInactive:", allowsToolTipsWhenApplicationIsInactive)
    }

    public open fun backingType(): Any =
        Native.objc_msgSend("class objc.Any", this, "backingType")

    public open fun setBackingType(backingType: Any): Unit {
        Native.objc_msgSend("void", this, "setBackingType:", backingType)
    }

    public open fun level(): Int =
        Native.objc_msgSend("int", this, "level") as Int

    public open fun setLevel(level: Int): Unit {
        Native.objc_msgSend("void", this, "setLevel:", level)
    }

    public open fun depthLimit(): Int =
        Native.objc_msgSend("int", this, "depthLimit") as Int

    public open fun setDepthLimit(depthLimit: Int): Unit {
        Native.objc_msgSend("void", this, "setDepthLimit:", depthLimit)
    }

    public open fun setDynamicDepthLimit(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDynamicDepthLimit:", flag)
    }

    public open fun hasDynamicDepthLimit(): Boolean =
        Native.objc_msgSend("boolean", this, "hasDynamicDepthLimit") as Boolean

    public open fun screen(): NSScreen =
        Native.objc_msgSend("class objc.NSScreen", this, "screen") as NSScreen

    public open fun deepestScreen(): NSScreen =
        Native.objc_msgSend("class objc.NSScreen", this, "deepestScreen") as NSScreen

    public open fun hasShadow(): Boolean =
        Native.objc_msgSend("boolean", this, "hasShadow") as Boolean

    public open fun setHasShadow(hasShadow: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasShadow:", hasShadow)
    }

    public open fun invalidateShadow(): Unit {
        Native.objc_msgSend("void", this, "invalidateShadow")
    }

    public open fun alphaValue(): Double =
        Native.objc_msgSend("double", this, "alphaValue") as Double

    public open fun setAlphaValue(alphaValue: Double): Unit {
        Native.objc_msgSend("void", this, "setAlphaValue:", alphaValue)
    }

    public open fun isOpaque(): Boolean =
        Native.objc_msgSend("boolean", this, "isOpaque") as Boolean

    public open fun setOpaque(opaque: Boolean): Unit {
        Native.objc_msgSend("void", this, "setOpaque:", opaque)
    }

    public open fun sharingType(): Any =
        Native.objc_msgSend("class objc.Any", this, "sharingType")

    public open fun setSharingType(sharingType: Any): Unit {
        Native.objc_msgSend("void", this, "setSharingType:", sharingType)
    }

    public open fun preferredBackingLocation(): Any =
        Native.objc_msgSend("class objc.Any", this, "preferredBackingLocation")

    public open fun setPreferredBackingLocation(preferredBackingLocation: Any): Unit {
        Native.objc_msgSend("void", this, "setPreferredBackingLocation:", preferredBackingLocation)
    }

    public open fun backingLocation(): Any =
        Native.objc_msgSend("class objc.Any", this, "backingLocation")

    public open fun allowsConcurrentViewDrawing(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsConcurrentViewDrawing") as Boolean

    public open fun setAllowsConcurrentViewDrawing(allowsConcurrentViewDrawing: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsConcurrentViewDrawing:", allowsConcurrentViewDrawing)
    }

    public open fun displaysWhenScreenProfileChanges(): Boolean =
        Native.objc_msgSend("boolean", this, "displaysWhenScreenProfileChanges") as Boolean

    public open fun setDisplaysWhenScreenProfileChanges(displaysWhenScreenProfileChanges: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDisplaysWhenScreenProfileChanges:", displaysWhenScreenProfileChanges)
    }

    public open fun disableScreenUpdatesUntilFlush(): Unit {
        Native.objc_msgSend("void", this, "disableScreenUpdatesUntilFlush")
    }

    public open fun canBecomeVisibleWithoutLogin(): Boolean =
        Native.objc_msgSend("boolean", this, "canBecomeVisibleWithoutLogin") as Boolean

    public open fun setCanBecomeVisibleWithoutLogin(canBecomeVisibleWithoutLogin: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanBecomeVisibleWithoutLogin:", canBecomeVisibleWithoutLogin)
    }

    public open fun collectionBehavior(): Any =
        Native.objc_msgSend("class objc.Any", this, "collectionBehavior")

    public open fun setCollectionBehavior(collectionBehavior: Any): Unit {
        Native.objc_msgSend("void", this, "setCollectionBehavior:", collectionBehavior)
    }

    public open fun animationBehavior(): Any =
        Native.objc_msgSend("class objc.Any", this, "animationBehavior")

    public open fun setAnimationBehavior(animationBehavior: Any): Unit {
        Native.objc_msgSend("void", this, "setAnimationBehavior:", animationBehavior)
    }

    public open fun isOnActiveSpace(): Boolean =
        Native.objc_msgSend("boolean", this, "isOnActiveSpace") as Boolean

    public open fun toggleFullScreen(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleFullScreen:", sender)
    }

    public open fun stringWithSavedFrame(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringWithSavedFrame") as NSString

    public open fun setFrameFromString(string: NSString): Unit {
        Native.objc_msgSend("void", this, "setFrameFromString:", string)
    }

    public open fun saveFrameUsingName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "saveFrameUsingName:", name)
    }

    public open fun setFrameUsingName_force(name: NSString, force: Boolean): Boolean =
        Native.objc_msgSend("boolean", this, "setFrameUsingName:force:", name, force) as Boolean

    public open fun setFrameUsingName(name: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setFrameUsingName:", name) as Boolean

    public open fun setFrameAutosaveName(name: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setFrameAutosaveName:", name) as Boolean

    public open fun frameAutosaveName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "frameAutosaveName") as NSString

    public open fun cacheImageInRect(aRect: Any): Unit {
        Native.objc_msgSend("void", this, "cacheImageInRect:", aRect)
    }

    public open fun restoreCachedImage(): Unit {
        Native.objc_msgSend("void", this, "restoreCachedImage")
    }

    public open fun discardCachedImage(): Unit {
        Native.objc_msgSend("void", this, "discardCachedImage")
    }

    public open fun minSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "minSize")

    public open fun setMinSize(minSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMinSize:", minSize)
    }

    public open fun maxSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "maxSize")

    public open fun setMaxSize(maxSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMaxSize:", maxSize)
    }

    public open fun contentMinSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentMinSize")

    public open fun setContentMinSize(contentMinSize: Any): Unit {
        Native.objc_msgSend("void", this, "setContentMinSize:", contentMinSize)
    }

    public open fun contentMaxSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentMaxSize")

    public open fun setContentMaxSize(contentMaxSize: Any): Unit {
        Native.objc_msgSend("void", this, "setContentMaxSize:", contentMaxSize)
    }

    public open fun trackEventsMatchingMask_timeout_mode_handler(mask: Any, timeout: Double, mode: NSString, trackingHandler: Any): Unit {
        Native.objc_msgSend("void", this, "trackEventsMatchingMask:timeout:mode:handler:", mask, timeout, mode, trackingHandler)
    }

    public open fun nextEventMatchingMask(mask: Int): NSEvent =
        Native.objc_msgSend("class objc.NSEvent", this, "nextEventMatchingMask:", mask) as NSEvent

    public open fun nextEventMatchingMask_untilDate_inMode_dequeue(mask: Int, expiration: NSDate, mode: NSString, deqFlag: Boolean): NSEvent =
        Native.objc_msgSend("class objc.NSEvent", this, "nextEventMatchingMask:untilDate:inMode:dequeue:", mask, expiration, mode, deqFlag) as NSEvent

    public open fun discardEventsMatchingMask_beforeEvent(mask: Int, lastEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "discardEventsMatchingMask:beforeEvent:", mask, lastEvent)
    }

    public open fun postEvent_atStart(event: NSEvent, flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "postEvent:atStart:", event, flag)
    }

    public open fun currentEvent(): NSEvent =
        Native.objc_msgSend("class objc.NSEvent", this, "currentEvent") as NSEvent

    public open fun acceptsMouseMovedEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsMouseMovedEvents") as Boolean

    public open fun setAcceptsMouseMovedEvents(acceptsMouseMovedEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAcceptsMouseMovedEvents:", acceptsMouseMovedEvents)
    }

    public open fun ignoresMouseEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "ignoresMouseEvents") as Boolean

    public open fun setIgnoresMouseEvents(ignoresMouseEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIgnoresMouseEvents:", ignoresMouseEvents)
    }

    public open fun deviceDescription(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "deviceDescription") as NSDictionary

    public open fun sendEvent(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "sendEvent:", theEvent)
    }

    public open fun mouseLocationOutsideOfEventStream(): Any =
        Native.objc_msgSend("class objc.Any", this, "mouseLocationOutsideOfEventStream")

    public open fun windowController(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "windowController") as ObjCObject

    public open fun setWindowController(windowController: NSWindowController): Unit {
        Native.objc_msgSend("void", this, "setWindowController:", windowController)
    }

    public open fun beginSheet_completionHandler(sheetWindow: NSWindow, handler: Any): Unit {
        Native.objc_msgSend("void", this, "beginSheet:completionHandler:", sheetWindow, handler)
    }

    public open fun beginCriticalSheet_completionHandler(sheetWindow: NSWindow, handler: Any): Unit {
        Native.objc_msgSend("void", this, "beginCriticalSheet:completionHandler:", sheetWindow, handler)
    }

    public open fun endSheet(sheetWindow: NSWindow): Unit {
        Native.objc_msgSend("void", this, "endSheet:", sheetWindow)
    }

    public open fun endSheet_returnCode(sheetWindow: NSWindow, returnCode: Int): Unit {
        Native.objc_msgSend("void", this, "endSheet:returnCode:", sheetWindow, returnCode)
    }

    public open fun sheets(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "sheets") as NSArray

    public open fun attachedSheet(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "attachedSheet") as NSWindow

    public open fun isSheet(): Boolean =
        Native.objc_msgSend("boolean", this, "isSheet") as Boolean

    public open fun sheetParent(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "sheetParent") as NSWindow

    public open fun standardWindowButton(b: Any): NSButton =
        Native.objc_msgSend("class objc.NSButton", this, "standardWindowButton:", b) as NSButton

    public open fun addChildWindow_ordered(childWin: NSWindow, place: Any): Unit {
        Native.objc_msgSend("void", this, "addChildWindow:ordered:", childWin, place)
    }

    public open fun removeChildWindow(childWin: NSWindow): Unit {
        Native.objc_msgSend("void", this, "removeChildWindow:", childWin)
    }

    public open fun childWindows(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "childWindows") as NSArray

    public open fun parentWindow(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "parentWindow") as NSWindow

    public open fun setParentWindow(parentWindow: NSWindow): Unit {
        Native.objc_msgSend("void", this, "setParentWindow:", parentWindow)
    }

    public open fun graphicsContext(): NSGraphicsContext =
        Native.objc_msgSend("class objc.NSGraphicsContext", this, "graphicsContext") as NSGraphicsContext

    public open fun colorSpace(): NSColorSpace =
        Native.objc_msgSend("class objc.NSColorSpace", this, "colorSpace") as NSColorSpace

    public open fun setColorSpace(colorSpace: NSColorSpace): Unit {
        Native.objc_msgSend("void", this, "setColorSpace:", colorSpace)
    }

    public open fun occlusionState(): Any =
        Native.objc_msgSend("class objc.Any", this, "occlusionState")

    public open fun contentViewController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "contentViewController") as NSViewController

    public open fun setContentViewController(contentViewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "setContentViewController:", contentViewController)
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSResponder.metaclass, NSAnimatablePropertyContainer.metaclass, NSUserInterfaceValidations.metaclass, NSUserInterfaceItemIdentification.metaclass, NSAppearanceCustomization.metaclass, NSAccessibilityElementProtocol.metaclass, NSAccessibility.metaclass, NSWindow_NSKeyboardUI.metaclass, NSWindow_NSToolbarSupport.metaclass, NSWindow_NSDrag.metaclass, NSWindow_NSCarbonExtensions.metaclass, NSWindow_NSDeprecated.metaclass, NSWindow_NSConstraintBasedLayoutCoreMethods.metaclass, NSWindow_NSConstraintBasedLayoutAnchoring.metaclass, NSWindow_NSConstraintBasedLayoutDebugging.metaclass, NSWindow_Drawers.metaclass, NSWindow_NSScripting.metaclass, NSWindow_NSUserInterfaceRestoration.metaclass {
        public open fun frameRectForContentRect_styleMask(cRect: Any, aStyle: Int): Any =
            Native.objc_msgSend("class objc.Any", this, "frameRectForContentRect:styleMask:", cRect, aStyle)

        public open fun contentRectForFrameRect_styleMask(fRect: Any, aStyle: Int): Any =
            Native.objc_msgSend("class objc.Any", this, "contentRectForFrameRect:styleMask:", fRect, aStyle)

        public open fun minFrameWidthWithTitle_styleMask(aTitle: NSString, aStyle: Int): Double =
            Native.objc_msgSend("double", this, "minFrameWidthWithTitle:styleMask:", aTitle, aStyle) as Double

        public open fun defaultDepthLimit(): Int =
            Native.objc_msgSend("int", this, "defaultDepthLimit") as Int

        public open fun removeFrameUsingName(name: NSString): Unit {
            Native.objc_msgSend("void", this, "removeFrameUsingName:", name)
        }

        public open fun menuChanged(menu: NSMenu): Unit {
            Native.objc_msgSend("void", this, "menuChanged:", menu)
        }

        public open fun standardWindowButton_forStyleMask(b: Any, styleMask: Int): NSButton =
            Native.objc_msgSend("class objc.NSButton", this, "standardWindowButton:forStyleMask:", b, styleMask) as NSButton

        public open fun windowNumbersWithOptions(options: Int): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "windowNumbersWithOptions:", options) as NSArray

        public open fun windowNumberAtPoint_belowWindowWithWindowNumber(point: Any, windowNumber: Int): Int =
            Native.objc_msgSend("int", this, "windowNumberAtPoint:belowWindowWithWindowNumber:", point, windowNumber) as Int

        public open fun windowWithContentViewController(contentViewController: NSViewController): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "windowWithContentViewController:", contentViewController) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSWindow")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSWindow_NSKeyboardUI : IObjCObject {
    public open fun initialFirstResponder(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "initialFirstResponder") as NSView

    public open fun setInitialFirstResponder(initialFirstResponder: NSView): Unit {
        Native.objc_msgSend("void", this, "setInitialFirstResponder:", initialFirstResponder)
    }

    public open fun selectNextKeyView(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectNextKeyView:", sender)
    }

    public open fun selectPreviousKeyView(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "selectPreviousKeyView:", sender)
    }

    public open fun selectKeyViewFollowingView(aView: NSView): Unit {
        Native.objc_msgSend("void", this, "selectKeyViewFollowingView:", aView)
    }

    public open fun selectKeyViewPrecedingView(aView: NSView): Unit {
        Native.objc_msgSend("void", this, "selectKeyViewPrecedingView:", aView)
    }

    public open fun keyViewSelectionDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "keyViewSelectionDirection")

    public open fun setDefaultButtonCell(defButt: NSButtonCell): Unit {
        Native.objc_msgSend("void", this, "setDefaultButtonCell:", defButt)
    }

    public open fun defaultButtonCell(): NSButtonCell =
        Native.objc_msgSend("class objc.NSButtonCell", this, "defaultButtonCell") as NSButtonCell

    public open fun disableKeyEquivalentForDefaultButtonCell(): Unit {
        Native.objc_msgSend("void", this, "disableKeyEquivalentForDefaultButtonCell")
    }

    public open fun enableKeyEquivalentForDefaultButtonCell(): Unit {
        Native.objc_msgSend("void", this, "enableKeyEquivalentForDefaultButtonCell")
    }

    public open fun autorecalculatesKeyViewLoop(): Boolean =
        Native.objc_msgSend("boolean", this, "autorecalculatesKeyViewLoop") as Boolean

    public open fun setAutorecalculatesKeyViewLoop(autorecalculatesKeyViewLoop: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutorecalculatesKeyViewLoop:", autorecalculatesKeyViewLoop)
    }

    public open fun recalculateKeyViewLoop(): Unit {
        Native.objc_msgSend("void", this, "recalculateKeyViewLoop")
    }

    trait metaclass : IObjCObject
}

trait NSWindow_NSToolbarSupport : IObjCObject {
    public open fun toolbar(): NSToolbar =
        Native.objc_msgSend("class objc.NSToolbar", this, "toolbar") as NSToolbar

    public open fun setToolbar(toolbar: NSToolbar): Unit {
        Native.objc_msgSend("void", this, "setToolbar:", toolbar)
    }

    public open fun toggleToolbarShown(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "toggleToolbarShown:", sender)
    }

    public open fun runToolbarCustomizationPalette(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "runToolbarCustomizationPalette:", sender)
    }

    public open fun showsToolbarButton(): Boolean =
        Native.objc_msgSend("boolean", this, "showsToolbarButton") as Boolean

    public open fun setShowsToolbarButton(showsToolbarButton: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsToolbarButton:", showsToolbarButton)
    }

    trait metaclass : IObjCObject
}

trait NSWindow_NSDrag : IObjCObject {
    public open fun dragImage_at_offset_event_pasteboard_source_slideBack(anImage: NSImage, baseLocation: Any, initialOffset: Any, event: NSEvent, pboard: NSPasteboard, sourceObj: ObjCObject, slideFlag: Boolean): Unit {
        Native.objc_msgSend("void", this, "dragImage:at:offset:event:pasteboard:source:slideBack:", anImage, baseLocation, initialOffset, event, pboard, sourceObj, slideFlag)
    }

    public open fun registerForDraggedTypes(newTypes: NSArray): Unit {
        Native.objc_msgSend("void", this, "registerForDraggedTypes:", newTypes)
    }

    public open fun unregisterDraggedTypes(): Unit {
        Native.objc_msgSend("void", this, "unregisterDraggedTypes")
    }

    trait metaclass : IObjCObject
}

trait NSWindow_NSCarbonExtensions : IObjCObject {
    public open fun initWithWindowRef(windowRef: Pointer<*>): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "initWithWindowRef:", windowRef) as NSWindow

    public open fun windowRef(): Pointer<*> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "windowRef") as Pointer<*>

    trait metaclass : IObjCObject
}

trait NSWindow_NSDeprecated : IObjCObject {
    public open fun gState(): Int =
        Native.objc_msgSend("int", this, "gState") as Int

    public open fun convertBaseToScreen(aPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertBaseToScreen:", aPoint)

    public open fun convertScreenToBase(aPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertScreenToBase:", aPoint)

    public open fun canBeVisibleOnAllSpaces(): Boolean =
        Native.objc_msgSend("boolean", this, "canBeVisibleOnAllSpaces") as Boolean

    public open fun setCanBeVisibleOnAllSpaces(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanBeVisibleOnAllSpaces:", flag)
    }

    public open fun userSpaceScaleFactor(): Double =
        Native.objc_msgSend("double", this, "userSpaceScaleFactor") as Double

    public open fun useOptimizedDrawing(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "useOptimizedDrawing:", flag)
    }

    public open fun canStoreColor(): Boolean =
        Native.objc_msgSend("boolean", this, "canStoreColor") as Boolean

    trait metaclass : IObjCObject
}
