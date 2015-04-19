// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSearchField.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSSearchField(pointer: Long) : NSTextField(pointer) {
    public open fun recentSearches(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "recentSearches") as NSArray

    public open fun setRecentSearches(recentSearches: NSArray): Unit {
        Native.objc_msgSend("void", this, "setRecentSearches:", recentSearches)
    }

    public open fun recentsAutosaveName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "recentsAutosaveName") as NSString

    public open fun setRecentsAutosaveName(recentsAutosaveName: NSString): Unit {
        Native.objc_msgSend("void", this, "setRecentsAutosaveName:", recentsAutosaveName)
    }

    public open fun searchMenuTemplate(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "searchMenuTemplate") as NSMenu

    public open fun setSearchMenuTemplate(searchMenuTemplate: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setSearchMenuTemplate:", searchMenuTemplate)
    }

    public open fun sendsWholeSearchString(): Boolean =
        Native.objc_msgSend("boolean", this, "sendsWholeSearchString") as Boolean

    public open fun setSendsWholeSearchString(sendsWholeSearchString: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSendsWholeSearchString:", sendsWholeSearchString)
    }

    public open fun maximumRecents(): Int =
        Native.objc_msgSend("int", this, "maximumRecents") as Int

    public open fun setMaximumRecents(maximumRecents: Int): Unit {
        Native.objc_msgSend("void", this, "setMaximumRecents:", maximumRecents)
    }

    public open fun sendsSearchStringImmediately(): Boolean =
        Native.objc_msgSend("boolean", this, "sendsSearchStringImmediately") as Boolean

    public open fun setSendsSearchStringImmediately(sendsSearchStringImmediately: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSendsSearchStringImmediately:", sendsSearchStringImmediately)
    }

    override fun acceptsFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "acceptsFirstResponder") as Boolean

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun initWithFrame(frameRect: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFrame:", frameRect) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun mouseDown(theEvent: NSEvent): Unit {
        Native.objc_msgSend("void", this, "mouseDown:", theEvent)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    override fun refusesFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "refusesFirstResponder") as Boolean

    override fun setRefusesFirstResponder(flag: Boolean): Unit {
        Native.objc_msgSend("void", this, "setRefusesFirstResponder:", flag)
    }

    override fun tag(): Int =
        Native.objc_msgSend("int", this, "tag") as Int

    trait metaclass : NSTextField.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSSearchField")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
