// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSScrollView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSScrollView(pointer: Long) : NSView(pointer), NSTextFinderBarContainer, NSScrollView_NSRulerSupport, NSScrollView_NSFindBarSupport {
    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun documentVisibleRect(): Any =
        Native.objc_msgSend("class objc.Any", this, "documentVisibleRect")

    public open fun contentSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentSize")

    public open fun documentView(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "documentView") as ObjCObject

    public open fun setDocumentView(documentView: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setDocumentView:", documentView)
    }

    public open fun contentView(): NSClipView =
        Native.objc_msgSend("class objc.NSClipView", this, "contentView") as NSClipView

    public open fun setContentView(contentView: NSClipView): Unit {
        Native.objc_msgSend("void", this, "setContentView:", contentView)
    }

    public open fun documentCursor(): NSCursor =
        Native.objc_msgSend("class objc.NSCursor", this, "documentCursor") as NSCursor

    public open fun setDocumentCursor(documentCursor: NSCursor): Unit {
        Native.objc_msgSend("void", this, "setDocumentCursor:", documentCursor)
    }

    public open fun borderType(): Any =
        Native.objc_msgSend("class objc.Any", this, "borderType")

    public open fun setBorderType(borderType: Any): Unit {
        Native.objc_msgSend("void", this, "setBorderType:", borderType)
    }

    public open fun backgroundColor(): NSColor =
        Native.objc_msgSend("class objc.NSColor", this, "backgroundColor") as NSColor

    public open fun setBackgroundColor(backgroundColor: NSColor): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColor:", backgroundColor)
    }

    public open fun drawsBackground(): Boolean =
        Native.objc_msgSend("boolean", this, "drawsBackground") as Boolean

    public open fun setDrawsBackground(drawsBackground: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDrawsBackground:", drawsBackground)
    }

    public open fun hasVerticalScroller(): Boolean =
        Native.objc_msgSend("boolean", this, "hasVerticalScroller") as Boolean

    public open fun setHasVerticalScroller(hasVerticalScroller: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasVerticalScroller:", hasVerticalScroller)
    }

    public open fun hasHorizontalScroller(): Boolean =
        Native.objc_msgSend("boolean", this, "hasHorizontalScroller") as Boolean

    public open fun setHasHorizontalScroller(hasHorizontalScroller: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasHorizontalScroller:", hasHorizontalScroller)
    }

    public open fun verticalScroller(): NSScroller =
        Native.objc_msgSend("class objc.NSScroller", this, "verticalScroller") as NSScroller

    public open fun setVerticalScroller(verticalScroller: NSScroller): Unit {
        Native.objc_msgSend("void", this, "setVerticalScroller:", verticalScroller)
    }

    public open fun horizontalScroller(): NSScroller =
        Native.objc_msgSend("class objc.NSScroller", this, "horizontalScroller") as NSScroller

    public open fun setHorizontalScroller(horizontalScroller: NSScroller): Unit {
        Native.objc_msgSend("void", this, "setHorizontalScroller:", horizontalScroller)
    }

    public open fun autohidesScrollers(): Boolean =
        Native.objc_msgSend("boolean", this, "autohidesScrollers") as Boolean

    public open fun setAutohidesScrollers(autohidesScrollers: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutohidesScrollers:", autohidesScrollers)
    }

    public open fun horizontalLineScroll(): Double =
        Native.objc_msgSend("double", this, "horizontalLineScroll") as Double

    public open fun setHorizontalLineScroll(horizontalLineScroll: Double): Unit {
        Native.objc_msgSend("void", this, "setHorizontalLineScroll:", horizontalLineScroll)
    }

    public open fun verticalLineScroll(): Double =
        Native.objc_msgSend("double", this, "verticalLineScroll") as Double

    public open fun setVerticalLineScroll(verticalLineScroll: Double): Unit {
        Native.objc_msgSend("void", this, "setVerticalLineScroll:", verticalLineScroll)
    }

    public open fun lineScroll(): Double =
        Native.objc_msgSend("double", this, "lineScroll") as Double

    public open fun setLineScroll(lineScroll: Double): Unit {
        Native.objc_msgSend("void", this, "setLineScroll:", lineScroll)
    }

    public open fun horizontalPageScroll(): Double =
        Native.objc_msgSend("double", this, "horizontalPageScroll") as Double

    public open fun setHorizontalPageScroll(horizontalPageScroll: Double): Unit {
        Native.objc_msgSend("void", this, "setHorizontalPageScroll:", horizontalPageScroll)
    }

    public open fun verticalPageScroll(): Double =
        Native.objc_msgSend("double", this, "verticalPageScroll") as Double

    public open fun setVerticalPageScroll(verticalPageScroll: Double): Unit {
        Native.objc_msgSend("void", this, "setVerticalPageScroll:", verticalPageScroll)
    }

    public open fun pageScroll(): Double =
        Native.objc_msgSend("double", this, "pageScroll") as Double

    public open fun setPageScroll(pageScroll: Double): Unit {
        Native.objc_msgSend("void", this, "setPageScroll:", pageScroll)
    }

    public open fun scrollsDynamically(): Boolean =
        Native.objc_msgSend("boolean", this, "scrollsDynamically") as Boolean

    public open fun setScrollsDynamically(scrollsDynamically: Boolean): Unit {
        Native.objc_msgSend("void", this, "setScrollsDynamically:", scrollsDynamically)
    }

    public open fun tile(): Unit {
        Native.objc_msgSend("void", this, "tile")
    }

    override fun reflectScrolledClipView(cView: NSClipView): Unit {
        Native.objc_msgSend("void", this, "reflectScrolledClipView:", cView)
    }

    override fun scrollWheel(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "scrollWheel:", theEvent)
    }

    public open fun scrollerStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "scrollerStyle")

    public open fun setScrollerStyle(scrollerStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setScrollerStyle:", scrollerStyle)
    }

    public open fun scrollerKnobStyle(): Any =
        Native.objc_msgSend("class objc.Any", this, "scrollerKnobStyle")

    public open fun setScrollerKnobStyle(scrollerKnobStyle: Any): Unit {
        Native.objc_msgSend("void", this, "setScrollerKnobStyle:", scrollerKnobStyle)
    }

    public open fun flashScrollers(): Unit {
        Native.objc_msgSend("void", this, "flashScrollers")
    }

    public open fun horizontalScrollElasticity(): Any =
        Native.objc_msgSend("class objc.Any", this, "horizontalScrollElasticity")

    public open fun setHorizontalScrollElasticity(horizontalScrollElasticity: Any): Unit {
        Native.objc_msgSend("void", this, "setHorizontalScrollElasticity:", horizontalScrollElasticity)
    }

    public open fun verticalScrollElasticity(): Any =
        Native.objc_msgSend("class objc.Any", this, "verticalScrollElasticity")

    public open fun setVerticalScrollElasticity(verticalScrollElasticity: Any): Unit {
        Native.objc_msgSend("void", this, "setVerticalScrollElasticity:", verticalScrollElasticity)
    }

    public open fun usesPredominantAxisScrolling(): Boolean =
        Native.objc_msgSend("boolean", this, "usesPredominantAxisScrolling") as Boolean

    public open fun setUsesPredominantAxisScrolling(usesPredominantAxisScrolling: Boolean): Unit {
        Native.objc_msgSend("void", this, "setUsesPredominantAxisScrolling:", usesPredominantAxisScrolling)
    }

    public open fun allowsMagnification(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsMagnification") as Boolean

    public open fun setAllowsMagnification(allowsMagnification: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsMagnification:", allowsMagnification)
    }

    public open fun magnification(): Double =
        Native.objc_msgSend("double", this, "magnification") as Double

    public open fun setMagnification(magnification: Double): Unit {
        Native.objc_msgSend("void", this, "setMagnification:", magnification)
    }

    public open fun maxMagnification(): Double =
        Native.objc_msgSend("double", this, "maxMagnification") as Double

    public open fun setMaxMagnification(maxMagnification: Double): Unit {
        Native.objc_msgSend("void", this, "setMaxMagnification:", maxMagnification)
    }

    public open fun minMagnification(): Double =
        Native.objc_msgSend("double", this, "minMagnification") as Double

    public open fun setMinMagnification(minMagnification: Double): Unit {
        Native.objc_msgSend("void", this, "setMinMagnification:", minMagnification)
    }

    public open fun magnifyToFitRect(rect: Any): Unit {
        Native.objc_msgSend("void", this, "magnifyToFitRect:", rect)
    }

    public open fun setMagnification_centeredAtPoint(magnification: Double, point: Any): Unit {
        Native.objc_msgSend("void", this, "setMagnification:centeredAtPoint:", magnification, point)
    }

    public open fun addFloatingSubview_forAxis(view: NSView, axis: Any): Unit {
        Native.objc_msgSend("void", this, "addFloatingSubview:forAxis:", view, axis)
    }

    public open fun automaticallyAdjustsContentInsets(): Boolean =
        Native.objc_msgSend("boolean", this, "automaticallyAdjustsContentInsets") as Boolean

    public open fun setAutomaticallyAdjustsContentInsets(automaticallyAdjustsContentInsets: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticallyAdjustsContentInsets:", automaticallyAdjustsContentInsets)
    }

    public open fun contentInsets(): Any =
        Native.objc_msgSend("class objc.Any", this, "contentInsets")

    public open fun setContentInsets(contentInsets: Any): Unit {
        Native.objc_msgSend("void", this, "setContentInsets:", contentInsets)
    }

    public open fun scrollerInsets(): Any =
        Native.objc_msgSend("class objc.Any", this, "scrollerInsets")

    public open fun setScrollerInsets(scrollerInsets: Any): Unit {
        Native.objc_msgSend("void", this, "setScrollerInsets:", scrollerInsets)
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

    trait metaclass : NSView.metaclass, NSTextFinderBarContainer.metaclass, NSScrollView_NSRulerSupport.metaclass, NSScrollView_NSFindBarSupport.metaclass {
        public open fun frameSizeForContentSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle(cSize: Any, horizontalScrollerClass: ObjCClass, verticalScrollerClass: ObjCClass, aType: Any, controlSize: Any, scrollerStyle: Any): Any =
            Native.objc_msgSend("class objc.Any", this, "frameSizeForContentSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle:", cSize, horizontalScrollerClass, verticalScrollerClass, aType, controlSize, scrollerStyle)

        public open fun contentSizeForFrameSize_horizontalScrollerClass_verticalScrollerClass_borderType_controlSize_scrollerStyle(fSize: Any, horizontalScrollerClass: ObjCClass, verticalScrollerClass: ObjCClass, aType: Any, controlSize: Any, scrollerStyle: Any): Any =
            Native.objc_msgSend("class objc.Any", this, "contentSizeForFrameSize:horizontalScrollerClass:verticalScrollerClass:borderType:controlSize:scrollerStyle:", fSize, horizontalScrollerClass, verticalScrollerClass, aType, controlSize, scrollerStyle)

        public open fun frameSizeForContentSize_hasHorizontalScroller_hasVerticalScroller_borderType(cSize: Any, hFlag: Boolean, vFlag: Boolean, aType: Any): Any =
            Native.objc_msgSend("class objc.Any", this, "frameSizeForContentSize:hasHorizontalScroller:hasVerticalScroller:borderType:", cSize, hFlag, vFlag, aType)

        public open fun contentSizeForFrameSize_hasHorizontalScroller_hasVerticalScroller_borderType(fSize: Any, hFlag: Boolean, vFlag: Boolean, aType: Any): Any =
            Native.objc_msgSend("class objc.Any", this, "contentSizeForFrameSize:hasHorizontalScroller:hasVerticalScroller:borderType:", fSize, hFlag, vFlag, aType)

    }

    companion object : NSObject(Native.objc_getClass("NSScrollView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSScrollView_NSRulerSupport : IObjCObject {
    public open fun rulersVisible(): Boolean =
        Native.objc_msgSend("boolean", this, "rulersVisible") as Boolean

    public open fun setRulersVisible(rulersVisible: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRulersVisible:", rulersVisible)
    }

    public open fun hasHorizontalRuler(): Boolean =
        Native.objc_msgSend("boolean", this, "hasHorizontalRuler") as Boolean

    public open fun setHasHorizontalRuler(hasHorizontalRuler: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasHorizontalRuler:", hasHorizontalRuler)
    }

    public open fun hasVerticalRuler(): Boolean =
        Native.objc_msgSend("boolean", this, "hasVerticalRuler") as Boolean

    public open fun setHasVerticalRuler(hasVerticalRuler: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHasVerticalRuler:", hasVerticalRuler)
    }

    public open fun horizontalRulerView(): NSRulerView =
        Native.objc_msgSend("class objc.NSRulerView", this, "horizontalRulerView") as NSRulerView

    public open fun setHorizontalRulerView(horizontalRulerView: NSRulerView): Unit {
        Native.objc_msgSend("void", this, "setHorizontalRulerView:", horizontalRulerView)
    }

    public open fun verticalRulerView(): NSRulerView =
        Native.objc_msgSend("class objc.NSRulerView", this, "verticalRulerView") as NSRulerView

    public open fun setVerticalRulerView(verticalRulerView: NSRulerView): Unit {
        Native.objc_msgSend("void", this, "setVerticalRulerView:", verticalRulerView)
    }

    trait metaclass : IObjCObject {
        public open fun setRulerViewClass(rulerViewClass: ObjCClass): Unit {
            Native.objc_msgSend("void", this, "setRulerViewClass:", rulerViewClass)
        }

        public open fun rulerViewClass(): ObjCClass =
            Native.objc_msgSend("interface kni.objc.ObjCClass", this, "rulerViewClass") as ObjCClass
    }
}

trait NSScrollView_NSFindBarSupport : IObjCObject {
    public open fun findBarPosition(): Any =
        Native.objc_msgSend("class objc.Any", this, "findBarPosition")

    public open fun setFindBarPosition(findBarPosition: Any): Unit {
        Native.objc_msgSend("void", this, "setFindBarPosition:", findBarPosition)
    }

    trait metaclass : IObjCObject
}
