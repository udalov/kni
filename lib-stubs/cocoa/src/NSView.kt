// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSView(pointer: Long) : NSResponder(pointer), NSAnimatablePropertyContainer, NSUserInterfaceItemIdentification, NSDraggingDestination, NSAppearanceCustomization, NSAccessibilityElementProtocol, NSAccessibility, NSView_NSKeyboardUI, NSView_NSPrinting, NSView_NSDrag, NSView_NSFullScreenMode, NSView_NSDefinition, NSView_NSFindIndicator, NSView_NSGestureRecognizer, NSView_NSDeprecated, NSView_NSClipViewSuperview, NSView_NSViewEnclosingMenuItem, NSView_NSConstraintBasedLayoutInstallingConstraints, NSView_NSConstraintBasedLayoutCoreMethods, NSView_NSConstraintBasedCompatibility, NSView_NSConstraintBasedLayoutLayering, NSView_NSConstraintBasedLayoutFittingSize, NSView_NSConstraintBasedLayoutDebugging, NSView_NSRulerMarkerClientViewDelegation, NSView_NSOpenGLSurfaceResolution {
    public open fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun window(): NSWindow =
        Native.objc_msgSend("class objc.NSWindow", this, "window") as NSWindow

    public open fun superview(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "superview") as NSView

    public open fun subviews(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "subviews") as NSArray

    public open fun setSubviews(newSubviews: NSArray): Unit {
        Native.objc_msgSend("void", this, "setSubviews:", newSubviews)
    }

    public open fun isDescendantOf(aView: NSView): Boolean =
        Native.objc_msgSend("boolean", this, "isDescendantOf:", aView) as Boolean

    public open fun ancestorSharedWithView(aView: NSView): NSView =
        Native.objc_msgSend("class objc.NSView", this, "ancestorSharedWithView:", aView) as NSView

    public open fun opaqueAncestor(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "opaqueAncestor") as NSView

    public open fun isHidden(): Boolean =
        Native.objc_msgSend("boolean", this, "isHidden") as Boolean

    public open fun setHidden(hidden: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHidden:", hidden)
    }

    public open fun isHiddenOrHasHiddenAncestor(): Boolean =
        Native.objc_msgSend("boolean", this, "isHiddenOrHasHiddenAncestor") as Boolean

    public open fun getRectsBeingDrawn_count(rects: Pointer<Pointer<Any>>, count: Pointer<Int>): Unit {
        Native.objc_msgSend("void", this, "getRectsBeingDrawn:count:", rects, count)
    }

    public open fun needsToDrawRect(aRect: Any): Boolean =
        Native.objc_msgSend("boolean", this, "needsToDrawRect:", aRect) as Boolean

    public open fun wantsDefaultClipping(): Boolean =
        Native.objc_msgSend("boolean", this, "wantsDefaultClipping") as Boolean

    public open fun viewDidHide(): Unit {
        Native.objc_msgSend("void", this, "viewDidHide")
    }

    public open fun viewDidUnhide(): Unit {
        Native.objc_msgSend("void", this, "viewDidUnhide")
    }

    public open fun addSubview(aView: NSView): Unit {
        Native.objc_msgSend("void", this, "addSubview:", aView)
    }

    public open fun addSubview_positioned_relativeTo(aView: NSView, place: Any, otherView: NSView): Unit {
        Native.objc_msgSend("void", this, "addSubview:positioned:relativeTo:", aView, place, otherView)
    }

    public open fun sortSubviewsUsingFunction_context(compare: (Any, Any, Pointer<*>) -> Any, context: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "sortSubviewsUsingFunction:context:", compare, context)
    }

    public open fun viewWillMoveToWindow(newWindow: NSWindow): Unit {
        Native.objc_msgSend("void", this, "viewWillMoveToWindow:", newWindow)
    }

    public open fun viewDidMoveToWindow(): Unit {
        Native.objc_msgSend("void", this, "viewDidMoveToWindow")
    }

    public open fun viewWillMoveToSuperview(newSuperview: NSView): Unit {
        Native.objc_msgSend("void", this, "viewWillMoveToSuperview:", newSuperview)
    }

    public open fun viewDidMoveToSuperview(): Unit {
        Native.objc_msgSend("void", this, "viewDidMoveToSuperview")
    }

    public open fun didAddSubview(subview: NSView): Unit {
        Native.objc_msgSend("void", this, "didAddSubview:", subview)
    }

    public open fun willRemoveSubview(subview: NSView): Unit {
        Native.objc_msgSend("void", this, "willRemoveSubview:", subview)
    }

    public open fun removeFromSuperview(): Unit {
        Native.objc_msgSend("void", this, "removeFromSuperview")
    }

    public open fun replaceSubview_with(oldView: NSView, newView: NSView): Unit {
        Native.objc_msgSend("void", this, "replaceSubview:with:", oldView, newView)
    }

    public open fun removeFromSuperviewWithoutNeedingDisplay(): Unit {
        Native.objc_msgSend("void", this, "removeFromSuperviewWithoutNeedingDisplay")
    }

    public open fun viewDidChangeBackingProperties(): Unit {
        Native.objc_msgSend("void", this, "viewDidChangeBackingProperties")
    }

    public open fun postsFrameChangedNotifications(): Boolean =
        Native.objc_msgSend("boolean", this, "postsFrameChangedNotifications") as Boolean

    public open fun setPostsFrameChangedNotifications(postsFrameChangedNotifications: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPostsFrameChangedNotifications:", postsFrameChangedNotifications)
    }

    public open fun resizeSubviewsWithOldSize(oldSize: Any): Unit {
        Native.objc_msgSend("void", this, "resizeSubviewsWithOldSize:", oldSize)
    }

    public open fun resizeWithOldSuperviewSize(oldSize: Any): Unit {
        Native.objc_msgSend("void", this, "resizeWithOldSuperviewSize:", oldSize)
    }

    public open fun autoresizesSubviews(): Boolean =
        Native.objc_msgSend("boolean", this, "autoresizesSubviews") as Boolean

    public open fun setAutoresizesSubviews(autoresizesSubviews: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutoresizesSubviews:", autoresizesSubviews)
    }

    public open fun autoresizingMask(): Any =
        Native.objc_msgSend("class objc.Any", this, "autoresizingMask")

    public open fun setAutoresizingMask(autoresizingMask: Any): Unit {
        Native.objc_msgSend("void", this, "setAutoresizingMask:", autoresizingMask)
    }

    public open fun setFrameOrigin(newOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "setFrameOrigin:", newOrigin)
    }

    public open fun setFrameSize(newSize: Any): Unit {
        Native.objc_msgSend("void", this, "setFrameSize:", newSize)
    }

    public open fun frame(): Any =
        Native.objc_msgSend("class objc.Any", this, "frame")

    public open fun setFrame(frame: Any): Unit {
        Native.objc_msgSend("void", this, "setFrame:", frame)
    }

    public open fun frameRotation(): Double =
        Native.objc_msgSend("double", this, "frameRotation") as Double

    public open fun setFrameRotation(frameRotation: Double): Unit {
        Native.objc_msgSend("void", this, "setFrameRotation:", frameRotation)
    }

    public open fun frameCenterRotation(): Double =
        Native.objc_msgSend("double", this, "frameCenterRotation") as Double

    public open fun setFrameCenterRotation(frameCenterRotation: Double): Unit {
        Native.objc_msgSend("void", this, "setFrameCenterRotation:", frameCenterRotation)
    }

    public open fun setBoundsOrigin(newOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "setBoundsOrigin:", newOrigin)
    }

    public open fun setBoundsSize(newSize: Any): Unit {
        Native.objc_msgSend("void", this, "setBoundsSize:", newSize)
    }

    public open fun boundsRotation(): Double =
        Native.objc_msgSend("double", this, "boundsRotation") as Double

    public open fun setBoundsRotation(boundsRotation: Double): Unit {
        Native.objc_msgSend("void", this, "setBoundsRotation:", boundsRotation)
    }

    public open fun translateOriginToPoint(translation: Any): Unit {
        Native.objc_msgSend("void", this, "translateOriginToPoint:", translation)
    }

    public open fun scaleUnitSquareToSize(newUnitSize: Any): Unit {
        Native.objc_msgSend("void", this, "scaleUnitSquareToSize:", newUnitSize)
    }

    public open fun rotateByAngle(angle: Double): Unit {
        Native.objc_msgSend("void", this, "rotateByAngle:", angle)
    }

    public open fun bounds(): Any =
        Native.objc_msgSend("class objc.Any", this, "bounds")

    public open fun setBounds(bounds: Any): Unit {
        Native.objc_msgSend("void", this, "setBounds:", bounds)
    }

    public open fun isFlipped(): Boolean =
        Native.objc_msgSend("boolean", this, "isFlipped") as Boolean

    public open fun isRotatedFromBase(): Boolean =
        Native.objc_msgSend("boolean", this, "isRotatedFromBase") as Boolean

    public open fun isRotatedOrScaledFromBase(): Boolean =
        Native.objc_msgSend("boolean", this, "isRotatedOrScaledFromBase") as Boolean

    public open fun isOpaque(): Boolean =
        Native.objc_msgSend("boolean", this, "isOpaque") as Boolean

    public open fun convertPoint_fromView(aPoint: Any, aView: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPoint:fromView:", aPoint, aView)

    public open fun convertPoint_toView(aPoint: Any, aView: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPoint:toView:", aPoint, aView)

    public open fun convertSize_fromView(aSize: Any, aView: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "convertSize:fromView:", aSize, aView)

    public open fun convertSize_toView(aSize: Any, aView: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "convertSize:toView:", aSize, aView)

    public open fun convertRect_fromView(aRect: Any, aView: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRect:fromView:", aRect, aView)

    public open fun convertRect_toView(aRect: Any, aView: NSView): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRect:toView:", aRect, aView)

    public open fun backingAlignedRect_options(aRect: Any, options: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "backingAlignedRect:options:", aRect, options)

    public open fun centerScanRect(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "centerScanRect:", aRect)

    public open fun convertPointToBacking(aPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPointToBacking:", aPoint)

    public open fun convertPointFromBacking(aPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPointFromBacking:", aPoint)

    public open fun convertSizeToBacking(aSize: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertSizeToBacking:", aSize)

    public open fun convertSizeFromBacking(aSize: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertSizeFromBacking:", aSize)

    public open fun convertRectToBacking(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectToBacking:", aRect)

    public open fun convertRectFromBacking(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectFromBacking:", aRect)

    public open fun convertPointToLayer(aPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPointToLayer:", aPoint)

    public open fun convertPointFromLayer(aPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPointFromLayer:", aPoint)

    public open fun convertSizeToLayer(aSize: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertSizeToLayer:", aSize)

    public open fun convertSizeFromLayer(aSize: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertSizeFromLayer:", aSize)

    public open fun convertRectToLayer(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectToLayer:", aRect)

    public open fun convertRectFromLayer(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectFromLayer:", aRect)

    public open fun convertPointToBase(aPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPointToBase:", aPoint)

    public open fun convertPointFromBase(aPoint: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertPointFromBase:", aPoint)

    public open fun convertSizeToBase(aSize: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertSizeToBase:", aSize)

    public open fun convertSizeFromBase(aSize: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertSizeFromBase:", aSize)

    public open fun convertRectToBase(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectToBase:", aRect)

    public open fun convertRectFromBase(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "convertRectFromBase:", aRect)

    public open fun canDrawConcurrently(): Boolean =
        Native.objc_msgSend("boolean", this, "canDrawConcurrently") as Boolean

    public open fun setCanDrawConcurrently(canDrawConcurrently: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanDrawConcurrently:", canDrawConcurrently)
    }

    public open fun canDraw(): Boolean =
        Native.objc_msgSend("boolean", this, "canDraw") as Boolean

    public open fun setNeedsDisplayInRect(invalidRect: Any): Unit {
        Native.objc_msgSend("void", this, "setNeedsDisplayInRect:", invalidRect)
    }

    public open fun needsDisplay(): Boolean =
        Native.objc_msgSend("boolean", this, "needsDisplay") as Boolean

    public open fun setNeedsDisplay(needsDisplay: Boolean): Unit {
        Native.objc_msgSend("void", this, "setNeedsDisplay:", needsDisplay)
    }

    public open fun lockFocus(): Unit {
        Native.objc_msgSend("void", this, "lockFocus")
    }

    public open fun unlockFocus(): Unit {
        Native.objc_msgSend("void", this, "unlockFocus")
    }

    public open fun lockFocusIfCanDraw(): Boolean =
        Native.objc_msgSend("boolean", this, "lockFocusIfCanDraw") as Boolean

    public open fun lockFocusIfCanDrawInContext(context: NSGraphicsContext): Boolean =
        Native.objc_msgSend("boolean", this, "lockFocusIfCanDrawInContext:", context) as Boolean

    public open fun visibleRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "visibleRect")

    public open fun display(): Unit {
        Native.objc_msgSend("void", this, "display")
    }

    public open fun displayIfNeeded(): Unit {
        Native.objc_msgSend("void", this, "displayIfNeeded")
    }

    public open fun displayIfNeededIgnoringOpacity(): Unit {
        Native.objc_msgSend("void", this, "displayIfNeededIgnoringOpacity")
    }

    public open fun displayRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "displayRect:", rect)
    }

    public open fun displayIfNeededInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "displayIfNeededInRect:", rect)
    }

    public open fun displayRectIgnoringOpacity(rect: Any): Unit {
        Native.objc_msgSend("void", this, "displayRectIgnoringOpacity:", rect)
    }

    public open fun displayIfNeededInRectIgnoringOpacity(rect: Any): Unit {
        Native.objc_msgSend("void", this, "displayIfNeededInRectIgnoringOpacity:", rect)
    }

    public open fun drawRect(dirtyRect: Any): Unit {
        Native.objc_msgSend("void", this, "drawRect:", dirtyRect)
    }

    public open fun displayRectIgnoringOpacity_inContext(aRect: Any, context: NSGraphicsContext): Unit {
        Native.objc_msgSend("void", this, "displayRectIgnoringOpacity:inContext:", aRect, context)
    }

    public open fun bitmapImageRepForCachingDisplayInRect(rect: Any): NSBitmapImageRep =
        Native.objc_msgSend("class objc.NSBitmapImageRep", this, "bitmapImageRepForCachingDisplayInRect:", rect) as NSBitmapImageRep

    public open fun cacheDisplayInRect_toBitmapImageRep(rect: Any, bitmapImageRep: NSBitmapImageRep): Unit {
        Native.objc_msgSend("void", this, "cacheDisplayInRect:toBitmapImageRep:", rect, bitmapImageRep)
    }

    public open fun viewWillDraw(): Unit {
        Native.objc_msgSend("void", this, "viewWillDraw")
    }

    public open fun scrollPoint(aPoint: Any): Unit {
        Native.objc_msgSend("void", this, "scrollPoint:", aPoint)
    }

    public open fun scrollRectToVisible(aRect: Any): Boolean =
        Native.objc_msgSend("boolean", this, "scrollRectToVisible:", aRect) as Boolean

    public open fun autoscroll(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "autoscroll:", theEvent) as Boolean

    public open fun adjustScroll(newVisible: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "adjustScroll:", newVisible)

    public open fun scrollRect_by(aRect: Any, delta: Any): Unit {
        Native.objc_msgSend("void", this, "scrollRect:by:", aRect, delta)
    }

    public open fun translateRectsNeedingDisplayInRect_by(clipRect: Any, delta: Any): Unit {
        Native.objc_msgSend("void", this, "translateRectsNeedingDisplayInRect:by:", clipRect, delta)
    }

    public open fun hitTest(aPoint: Any): NSView =
        Native.objc_msgSend("class objc.NSView", this, "hitTest:", aPoint) as NSView

    public open fun mouse_inRect(aPoint: Any, aRect: Any): Boolean =
        Native.objc_msgSend("boolean", this, "mouse:inRect:", aPoint, aRect) as Boolean

    public open fun viewWithTag(aTag: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "viewWithTag:", aTag) as ObjCObject

    public open fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    public open fun acceptsFirstMouse(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsFirstMouse:", theEvent) as Boolean

    public open fun shouldDelayWindowOrderingForEvent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "shouldDelayWindowOrderingForEvent:", theEvent) as Boolean

    public open fun needsPanelToBecomeKey(): Boolean =
        Native.objc_msgSend("boolean", this, "needsPanelToBecomeKey") as Boolean

    public open fun mouseDownCanMoveWindow(): Boolean =
        Native.objc_msgSend("boolean", this, "mouseDownCanMoveWindow") as Boolean

    public open fun acceptsTouchEvents(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsTouchEvents") as Boolean

    public open fun setAcceptsTouchEvents(acceptsTouchEvents: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAcceptsTouchEvents:", acceptsTouchEvents)
    }

    public open fun wantsRestingTouches(): Boolean =
        Native.objc_msgSend("boolean", this, "wantsRestingTouches") as Boolean

    public open fun setWantsRestingTouches(wantsRestingTouches: Boolean): Unit {
        Native.objc_msgSend("void", this, "setWantsRestingTouches:", wantsRestingTouches)
    }

    public open fun addCursorRect_cursor(aRect: Any, anObj: NSCursor): Unit {
        Native.objc_msgSend("void", this, "addCursorRect:cursor:", aRect, anObj)
    }

    public open fun removeCursorRect_cursor(aRect: Any, anObj: NSCursor): Unit {
        Native.objc_msgSend("void", this, "removeCursorRect:cursor:", aRect, anObj)
    }

    public open fun discardCursorRects(): Unit {
        Native.objc_msgSend("void", this, "discardCursorRects")
    }

    public open fun resetCursorRects(): Unit {
        Native.objc_msgSend("void", this, "resetCursorRects")
    }

    public open fun addTrackingRect_owner_userData_assumeInside(aRect: Any, anObject: ObjCObject, data: Pointer<*>, flag: Boolean): Int =
        Native.objc_msgSend("int", this, "addTrackingRect:owner:userData:assumeInside:", aRect, anObject, data, flag) as Int

    public open fun removeTrackingRect(tag: Int): Unit {
        Native.objc_msgSend("void", this, "removeTrackingRect:", tag)
    }

    public open fun makeBackingLayer(): CALayer =
        Native.objc_msgSend("class objc.CALayer", this, "makeBackingLayer") as CALayer

    public open fun layerContentsRedrawPolicy(): Any =
        Native.objc_msgSend("class objc.Any", this, "layerContentsRedrawPolicy")

    public open fun setLayerContentsRedrawPolicy(layerContentsRedrawPolicy: Any): Unit {
        Native.objc_msgSend("void", this, "setLayerContentsRedrawPolicy:", layerContentsRedrawPolicy)
    }

    public open fun layerContentsPlacement(): Any =
        Native.objc_msgSend("class objc.Any", this, "layerContentsPlacement")

    public open fun setLayerContentsPlacement(layerContentsPlacement: Any): Unit {
        Native.objc_msgSend("void", this, "setLayerContentsPlacement:", layerContentsPlacement)
    }

    public open fun wantsLayer(): Boolean =
        Native.objc_msgSend("boolean", this, "wantsLayer") as Boolean

    public open fun setWantsLayer(wantsLayer: Boolean): Unit {
        Native.objc_msgSend("void", this, "setWantsLayer:", wantsLayer)
    }

    public open fun layer(): CALayer =
        Native.objc_msgSend("class objc.CALayer", this, "layer") as CALayer

    public open fun setLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "setLayer:", layer)
    }

    public open fun wantsUpdateLayer(): Boolean =
        Native.objc_msgSend("boolean", this, "wantsUpdateLayer") as Boolean

    public open fun updateLayer(): Unit {
        Native.objc_msgSend("void", this, "updateLayer")
    }

    public open fun canDrawSubviewsIntoLayer(): Boolean =
        Native.objc_msgSend("boolean", this, "canDrawSubviewsIntoLayer") as Boolean

    public open fun setCanDrawSubviewsIntoLayer(canDrawSubviewsIntoLayer: Boolean): Unit {
        Native.objc_msgSend("void", this, "setCanDrawSubviewsIntoLayer:", canDrawSubviewsIntoLayer)
    }

    public open fun alphaValue(): Double =
        Native.objc_msgSend("double", this, "alphaValue") as Double

    public open fun setAlphaValue(alphaValue: Double): Unit {
        Native.objc_msgSend("void", this, "setAlphaValue:", alphaValue)
    }

    public open fun layerUsesCoreImageFilters(): Boolean =
        Native.objc_msgSend("boolean", this, "layerUsesCoreImageFilters") as Boolean

    public open fun setLayerUsesCoreImageFilters(layerUsesCoreImageFilters: Boolean): Unit {
        Native.objc_msgSend("void", this, "setLayerUsesCoreImageFilters:", layerUsesCoreImageFilters)
    }

    public open fun backgroundFilters(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "backgroundFilters") as NSArray

    public open fun setBackgroundFilters(backgroundFilters: NSArray): Unit {
        Native.objc_msgSend("void", this, "setBackgroundFilters:", backgroundFilters)
    }

    public open fun compositingFilter(): CIFilter =
        Native.objc_msgSend("class objc.CIFilter", this, "compositingFilter") as CIFilter

    public open fun setCompositingFilter(compositingFilter: CIFilter): Unit {
        Native.objc_msgSend("void", this, "setCompositingFilter:", compositingFilter)
    }

    public open fun contentFilters(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "contentFilters") as NSArray

    public open fun setContentFilters(contentFilters: NSArray): Unit {
        Native.objc_msgSend("void", this, "setContentFilters:", contentFilters)
    }

    public open fun shadow(): NSShadow =
        Native.objc_msgSend("class objc.NSShadow", this, "shadow") as NSShadow

    public open fun setShadow(shadow: NSShadow): Unit {
        Native.objc_msgSend("void", this, "setShadow:", shadow)
    }

    public open fun addTrackingArea(trackingArea: NSTrackingArea): Unit {
        Native.objc_msgSend("void", this, "addTrackingArea:", trackingArea)
    }

    public open fun removeTrackingArea(trackingArea: NSTrackingArea): Unit {
        Native.objc_msgSend("void", this, "removeTrackingArea:", trackingArea)
    }

    public open fun trackingAreas(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "trackingAreas") as NSArray

    public open fun updateTrackingAreas(): Unit {
        Native.objc_msgSend("void", this, "updateTrackingAreas")
    }

    public open fun postsBoundsChangedNotifications(): Boolean =
        Native.objc_msgSend("boolean", this, "postsBoundsChangedNotifications") as Boolean

    public open fun setPostsBoundsChangedNotifications(postsBoundsChangedNotifications: Boolean): Unit {
        Native.objc_msgSend("void", this, "setPostsBoundsChangedNotifications:", postsBoundsChangedNotifications)
    }

    public open fun enclosingScrollView(): NSScrollView =
        Native.objc_msgSend("class objc.NSScrollView", this, "enclosingScrollView") as NSScrollView

    public open fun menuForEvent(event: NSEvent): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menuForEvent:", event) as NSMenu

    public open fun toolTip(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "toolTip") as NSString

    public open fun setToolTip(toolTip: NSString): Unit {
        Native.objc_msgSend("void", this, "setToolTip:", toolTip)
    }

    public open fun addToolTipRect_owner_userData(aRect: Any, anObject: ObjCObject, data: Pointer<*>): Int =
        Native.objc_msgSend("int", this, "addToolTipRect:owner:userData:", aRect, anObject, data) as Int

    public open fun removeToolTip(tag: Int): Unit {
        Native.objc_msgSend("void", this, "removeToolTip:", tag)
    }

    public open fun removeAllToolTips(): Unit {
        Native.objc_msgSend("void", this, "removeAllToolTips")
    }

    public open fun viewWillStartLiveResize(): Unit {
        Native.objc_msgSend("void", this, "viewWillStartLiveResize")
    }

    public open fun viewDidEndLiveResize(): Unit {
        Native.objc_msgSend("void", this, "viewDidEndLiveResize")
    }

    public open fun inLiveResize(): Boolean =
        Native.objc_msgSend("boolean", this, "inLiveResize") as Boolean

    public open fun preservesContentDuringLiveResize(): Boolean =
        Native.objc_msgSend("boolean", this, "preservesContentDuringLiveResize") as Boolean

    public open fun rectPreservedDuringLiveResize(): Any =
        Native.objc_msgSend("class objc.Any", this, "rectPreservedDuringLiveResize")

    public open fun getRectsExposedDuringLiveResize_count(exposedRects: Any, count: Pointer<Int>): Unit {
        Native.objc_msgSend("void", this, "getRectsExposedDuringLiveResize:count:", exposedRects, count)
    }

    public open fun inputContext(): NSTextInputContext =
        Native.objc_msgSend("class objc.NSTextInputContext", this, "inputContext") as NSTextInputContext

    public open fun rectForSmartMagnificationAtPoint_inRect(location: Any, visibleRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "rectForSmartMagnificationAtPoint:inRect:", location, visibleRect)

    public open fun userInterfaceLayoutDirection(): Any =
        Native.objc_msgSend("class objc.Any", this, "userInterfaceLayoutDirection")

    public open fun setUserInterfaceLayoutDirection(userInterfaceLayoutDirection: Any): Unit {
        Native.objc_msgSend("void", this, "setUserInterfaceLayoutDirection:", userInterfaceLayoutDirection)
    }

    public open fun prepareForReuse(): Unit {
        Native.objc_msgSend("void", this, "prepareForReuse")
    }

    public open fun prepareContentInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "prepareContentInRect:", rect)
    }

    public open fun preparedContentRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "preparedContentRect")

    public open fun setPreparedContentRect(preparedContentRect: Any): Unit {
        Native.objc_msgSend("void", this, "setPreparedContentRect:", preparedContentRect)
    }

    public open fun allowsVibrancy(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsVibrancy") as Boolean

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSResponder.metaclass, NSAnimatablePropertyContainer.metaclass, NSUserInterfaceItemIdentification.metaclass, NSDraggingDestination.metaclass, NSAppearanceCustomization.metaclass, NSAccessibilityElementProtocol.metaclass, NSAccessibility.metaclass, NSView_NSKeyboardUI.metaclass, NSView_NSPrinting.metaclass, NSView_NSDrag.metaclass, NSView_NSFullScreenMode.metaclass, NSView_NSDefinition.metaclass, NSView_NSFindIndicator.metaclass, NSView_NSGestureRecognizer.metaclass, NSView_NSDeprecated.metaclass, NSView_NSClipViewSuperview.metaclass, NSView_NSViewEnclosingMenuItem.metaclass, NSView_NSConstraintBasedLayoutInstallingConstraints.metaclass, NSView_NSConstraintBasedLayoutCoreMethods.metaclass, NSView_NSConstraintBasedCompatibility.metaclass, NSView_NSConstraintBasedLayoutLayering.metaclass, NSView_NSConstraintBasedLayoutFittingSize.metaclass, NSView_NSConstraintBasedLayoutDebugging.metaclass, NSView_NSRulerMarkerClientViewDelegation.metaclass, NSView_NSOpenGLSurfaceResolution.metaclass {
        public open fun focusView(): NSView =
            Native.objc_msgSend("class objc.NSView", this, "focusView") as NSView

        public open fun defaultMenu(): NSMenu =
            Native.objc_msgSend("class objc.NSMenu", this, "defaultMenu") as NSMenu

        public open fun isCompatibleWithResponsiveScrolling(): Boolean =
            Native.objc_msgSend("boolean", this, "isCompatibleWithResponsiveScrolling") as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSObject_NSLayerDelegateContentsScaleUpdating : IObjCObject {
    public open fun layer_shouldInheritContentsScale_fromWindow(layer: CALayer, newScale: Double, window: NSWindow): Boolean =
        Native.objc_msgSend("boolean", this, "layer:shouldInheritContentsScale:fromWindow:", layer, newScale, window) as Boolean

    trait metaclass : IObjCObject
}

trait NSObject_NSToolTipOwner : IObjCObject {
    public open fun view_stringForToolTip_point_userData(view: NSView, tag: Int, point: Any, data: Pointer<*>): NSString =
        Native.objc_msgSend("class objc.NSString", this, "view:stringForToolTip:point:userData:", view, tag, point, data) as NSString

    trait metaclass : IObjCObject
}

trait NSView_NSKeyboardUI : IObjCObject {
    public open fun nextKeyView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "nextKeyView") as NSView

    public open fun setNextKeyView(nextKeyView: NSView): Unit {
        Native.objc_msgSend("void", this, "setNextKeyView:", nextKeyView)
    }

    public open fun previousKeyView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "previousKeyView") as NSView

    public open fun nextValidKeyView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "nextValidKeyView") as NSView

    public open fun previousValidKeyView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "previousValidKeyView") as NSView

    public open fun canBecomeKeyView(): Boolean =
        Native.objc_msgSend("boolean", this, "canBecomeKeyView") as Boolean

    public open fun setKeyboardFocusRingNeedsDisplayInRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "setKeyboardFocusRingNeedsDisplayInRect:", rect)
    }

    public open fun focusRingType(): Any =
        Native.objc_msgSend("class objc.Any", this, "focusRingType")

    public open fun setFocusRingType(focusRingType: Any): Unit {
        Native.objc_msgSend("void", this, "setFocusRingType:", focusRingType)
    }

    public open fun drawFocusRingMask(): Unit {
        Native.objc_msgSend("void", this, "drawFocusRingMask")
    }

    public open fun focusRingMaskBounds(): Any =
        Native.objc_msgSend("class objc.Any", this, "focusRingMaskBounds")

    public open fun noteFocusRingMaskChanged(): Unit {
        Native.objc_msgSend("void", this, "noteFocusRingMaskChanged")
    }

    trait metaclass : IObjCObject {
        public open fun defaultFocusRingType(): Any =
            Native.objc_msgSend("class objc.Any", this, "defaultFocusRingType")
    }
}

trait NSView_NSPrinting : IObjCObject {
    public open fun writeEPSInsideRect_toPasteboard(rect: Any, pasteboard: NSPasteboard): Unit {
        Native.objc_msgSend("void", this, "writeEPSInsideRect:toPasteboard:", rect, pasteboard)
    }

    public open fun dataWithEPSInsideRect(rect: Any): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataWithEPSInsideRect:", rect) as NSData

    public open fun writePDFInsideRect_toPasteboard(rect: Any, pasteboard: NSPasteboard): Unit {
        Native.objc_msgSend("void", this, "writePDFInsideRect:toPasteboard:", rect, pasteboard)
    }

    public open fun dataWithPDFInsideRect(rect: Any): NSData =
        Native.objc_msgSend("class objc.NSData", this, "dataWithPDFInsideRect:", rect) as NSData

    public open fun print(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "print:", sender)
    }

    public open fun knowsPageRange(range: Pointer<Any>): Boolean =
        Native.objc_msgSend("boolean", this, "knowsPageRange:", range) as Boolean

    public open fun heightAdjustLimit(): Double =
        Native.objc_msgSend("double", this, "heightAdjustLimit") as Double

    public open fun widthAdjustLimit(): Double =
        Native.objc_msgSend("double", this, "widthAdjustLimit") as Double

    public open fun adjustPageWidthNew_left_right_limit(newRight: Pointer<Double>, oldLeft: Double, oldRight: Double, rightLimit: Double): Unit {
        Native.objc_msgSend("void", this, "adjustPageWidthNew:left:right:limit:", newRight, oldLeft, oldRight, rightLimit)
    }

    public open fun adjustPageHeightNew_top_bottom_limit(newBottom: Pointer<Double>, oldTop: Double, oldBottom: Double, bottomLimit: Double): Unit {
        Native.objc_msgSend("void", this, "adjustPageHeightNew:top:bottom:limit:", newBottom, oldTop, oldBottom, bottomLimit)
    }

    public open fun rectForPage(page: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "rectForPage:", page)

    public open fun locationOfPrintRect(aRect: Any): Any =
        Native.objc_msgSend("class objc.Any", this, "locationOfPrintRect:", aRect)

    public open fun drawPageBorderWithSize(borderSize: Any): Unit {
        Native.objc_msgSend("void", this, "drawPageBorderWithSize:", borderSize)
    }

    public open fun pageHeader(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "pageHeader") as NSAttributedString

    public open fun pageFooter(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "pageFooter") as NSAttributedString

    public open fun drawSheetBorderWithSize(borderSize: Any): Unit {
        Native.objc_msgSend("void", this, "drawSheetBorderWithSize:", borderSize)
    }

    public open fun printJobTitle(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "printJobTitle") as NSString

    public open fun beginDocument(): Unit {
        Native.objc_msgSend("void", this, "beginDocument")
    }

    public open fun endDocument(): Unit {
        Native.objc_msgSend("void", this, "endDocument")
    }

    public open fun beginPageInRect_atPlacement(aRect: Any, location: Any): Unit {
        Native.objc_msgSend("void", this, "beginPageInRect:atPlacement:", aRect, location)
    }

    public open fun endPage(): Unit {
        Native.objc_msgSend("void", this, "endPage")
    }

    trait metaclass : IObjCObject
}

trait NSView_NSDrag : IObjCObject {
    public open fun beginDraggingSessionWithItems_event_source(items: NSArray, event: NSEvent, source: Any): NSDraggingSession =
        Native.objc_msgSend("class objc.NSDraggingSession", this, "beginDraggingSessionWithItems:event:source:", items, event, source) as NSDraggingSession

    public open fun dragImage_at_offset_event_pasteboard_source_slideBack(anImage: NSImage, viewLocation: Any, initialOffset: Any, event: NSEvent, pboard: NSPasteboard, sourceObj: ObjCObject, slideFlag: Boolean): Unit {
        Native.objc_msgSend("void", this, "dragImage:at:offset:event:pasteboard:source:slideBack:", anImage, viewLocation, initialOffset, event, pboard, sourceObj, slideFlag)
    }

    public open fun registeredDraggedTypes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "registeredDraggedTypes") as NSArray

    public open fun registerForDraggedTypes(newTypes: NSArray): Unit {
        Native.objc_msgSend("void", this, "registerForDraggedTypes:", newTypes)
    }

    public open fun unregisterDraggedTypes(): Unit {
        Native.objc_msgSend("void", this, "unregisterDraggedTypes")
    }

    public open fun dragFile_fromRect_slideBack_event(filename: NSString, rect: Any, aFlag: Boolean, event: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "dragFile:fromRect:slideBack:event:", filename, rect, aFlag, event) as Boolean

    public open fun dragPromisedFilesOfTypes_fromRect_source_slideBack_event(typeArray: NSArray, rect: Any, sourceObject: ObjCObject, aFlag: Boolean, event: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "dragPromisedFilesOfTypes:fromRect:source:slideBack:event:", typeArray, rect, sourceObject, aFlag, event) as Boolean

    trait metaclass : IObjCObject
}

trait NSView_NSFullScreenMode : IObjCObject {
    public open fun enterFullScreenMode_withOptions(screen: NSScreen, options: NSDictionary): Boolean =
        Native.objc_msgSend("boolean", this, "enterFullScreenMode:withOptions:", screen, options) as Boolean

    public open fun exitFullScreenModeWithOptions(options: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "exitFullScreenModeWithOptions:", options)
    }

    public open fun isInFullScreenMode(): Boolean =
        Native.objc_msgSend("boolean", this, "isInFullScreenMode") as Boolean

    trait metaclass : IObjCObject
}

trait NSView_NSDefinition : IObjCObject {
    public open fun showDefinitionForAttributedString_atPoint(attrString: NSAttributedString, textBaselineOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "showDefinitionForAttributedString:atPoint:", attrString, textBaselineOrigin)
    }

    public open fun showDefinitionForAttributedString_range_options_baselineOriginProvider(attrString: NSAttributedString, targetRange: Any, options: NSDictionary, originProvider: Any): Unit {
        Native.objc_msgSend("void", this, "showDefinitionForAttributedString:range:options:baselineOriginProvider:", attrString, targetRange, options, originProvider)
    }

    trait metaclass : IObjCObject
}

trait NSView_NSFindIndicator : IObjCObject {
    public open fun isDrawingFindIndicator(): Boolean =
        Native.objc_msgSend("boolean", this, "isDrawingFindIndicator") as Boolean

    trait metaclass : IObjCObject
}

trait NSView_NSGestureRecognizer : IObjCObject {
    public open fun gestureRecognizers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "gestureRecognizers") as NSArray

    public open fun setGestureRecognizers(gestureRecognizers: NSArray): Unit {
        Native.objc_msgSend("void", this, "setGestureRecognizers:", gestureRecognizers)
    }

    public open fun addGestureRecognizer(gestureRecognizer: NSGestureRecognizer): Unit {
        Native.objc_msgSend("void", this, "addGestureRecognizer:", gestureRecognizer)
    }

    public open fun removeGestureRecognizer(gestureRecognizer: NSGestureRecognizer): Unit {
        Native.objc_msgSend("void", this, "removeGestureRecognizer:", gestureRecognizer)
    }

    trait metaclass : IObjCObject
}

trait NSView_NSDeprecated : IObjCObject {
    public open fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    public open fun shouldDrawColor(): Boolean =
        Native.objc_msgSend("boolean", this, "shouldDrawColor") as Boolean

    public open fun gState(): Int =
        Native.objc_msgSend("int", this, "gState") as Int

    public open fun allocateGState(): Unit {
        Native.objc_msgSend("void", this, "allocateGState")
    }

    public open fun releaseGState(): Unit {
        Native.objc_msgSend("void", this, "releaseGState")
    }

    public open fun setUpGState(): Unit {
        Native.objc_msgSend("void", this, "setUpGState")
    }

    public open fun renewGState(): Unit {
        Native.objc_msgSend("void", this, "renewGState")
    }

    trait metaclass : IObjCObject
}
