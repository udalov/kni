// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTextFinder.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSTextFinderClient {
    trait metaclass
}

trait NSTextFinderBarContainer {
    trait metaclass
}

public open class NSTextFinder(pointer: Long) : NSObject(pointer), NSCoding {
    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    public open fun client(): Any =
        Native.objc_msgSend("class objc.Any", this, "client")

    public open fun setClient(client: Any): Unit {
        Native.objc_msgSend("void", this, "setClient:", client)
    }

    public open fun performAction(op: Any): Unit {
        Native.objc_msgSend("void", this, "performAction:", op)
    }

    public open fun validateAction(op: Any): Boolean =
        Native.objc_msgSend("boolean", this, "validateAction:", op) as Boolean

    public open fun findBarContainer(): Any =
        Native.objc_msgSend("class objc.Any", this, "findBarContainer")

    public open fun setFindBarContainer(findBarContainer: Any): Unit {
        Native.objc_msgSend("void", this, "setFindBarContainer:", findBarContainer)
    }

    public open fun cancelFindIndicator(): Unit {
        Native.objc_msgSend("void", this, "cancelFindIndicator")
    }

    public open fun findIndicatorNeedsUpdate(): Boolean =
        Native.objc_msgSend("boolean", this, "findIndicatorNeedsUpdate") as Boolean

    public open fun setFindIndicatorNeedsUpdate(findIndicatorNeedsUpdate: Boolean): Unit {
        Native.objc_msgSend("void", this, "setFindIndicatorNeedsUpdate:", findIndicatorNeedsUpdate)
    }

    public open fun isIncrementalSearchingEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isIncrementalSearchingEnabled") as Boolean

    public open fun setIncrementalSearchingEnabled(incrementalSearchingEnabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncrementalSearchingEnabled:", incrementalSearchingEnabled)
    }

    public open fun incrementalSearchingShouldDimContentView(): Boolean =
        Native.objc_msgSend("boolean", this, "incrementalSearchingShouldDimContentView") as Boolean

    public open fun setIncrementalSearchingShouldDimContentView(incrementalSearchingShouldDimContentView: Boolean): Unit {
        Native.objc_msgSend("void", this, "setIncrementalSearchingShouldDimContentView:", incrementalSearchingShouldDimContentView)
    }

    public open fun incrementalMatchRanges(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "incrementalMatchRanges") as NSArray

    public open fun noteClientStringWillChange(): Unit {
        Native.objc_msgSend("void", this, "noteClientStringWillChange")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCoding.metaclass {
        public open fun drawIncrementalMatchHighlightInRect(rect: Any): Unit {
            Native.objc_msgSend("void", this, "drawIncrementalMatchHighlightInRect:", rect)
        }

    }

    companion object : NSObject(Native.objc_getClass("NSTextFinder")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
