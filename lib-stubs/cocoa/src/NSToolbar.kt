// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSToolbar.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSToolbarDelegate {
    trait metaclass
}

public open class NSToolbar(pointer: Long) : NSObject(pointer), NSToolbar_NSDeprecated {
    public open fun initWithIdentifier(identifier: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithIdentifier:", identifier) as ObjCObject

    public open fun insertItemWithItemIdentifier_atIndex(itemIdentifier: NSString, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertItemWithItemIdentifier:atIndex:", itemIdentifier, index)
    }

    public open fun removeItemAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeItemAtIndex:", index)
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun isVisible(): Boolean =
        Native.objc_msgSend("boolean", this, "isVisible") as Boolean

    public open fun setVisible(visible: Boolean): Unit {
        Native.objc_msgSend("void", this, "setVisible:", visible)
    }

    public open fun runCustomizationPalette(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "runCustomizationPalette:", sender)
    }

    public open fun customizationPaletteIsRunning(): Boolean =
        Native.objc_msgSend("boolean", this, "customizationPaletteIsRunning") as Boolean

    public open fun displayMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "displayMode")

    public open fun setDisplayMode(displayMode: Any): Unit {
        Native.objc_msgSend("void", this, "setDisplayMode:", displayMode)
    }

    public open fun selectedItemIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "selectedItemIdentifier") as NSString

    public open fun setSelectedItemIdentifier(selectedItemIdentifier: NSString): Unit {
        Native.objc_msgSend("void", this, "setSelectedItemIdentifier:", selectedItemIdentifier)
    }

    public open fun sizeMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "sizeMode")

    public open fun setSizeMode(sizeMode: Any): Unit {
        Native.objc_msgSend("void", this, "setSizeMode:", sizeMode)
    }

    public open fun showsBaselineSeparator(): Boolean =
        Native.objc_msgSend("boolean", this, "showsBaselineSeparator") as Boolean

    public open fun setShowsBaselineSeparator(showsBaselineSeparator: Boolean): Unit {
        Native.objc_msgSend("void", this, "setShowsBaselineSeparator:", showsBaselineSeparator)
    }

    public open fun allowsUserCustomization(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsUserCustomization") as Boolean

    public open fun setAllowsUserCustomization(allowsUserCustomization: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsUserCustomization:", allowsUserCustomization)
    }

    public open fun identifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "identifier") as NSString

    public open fun items(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "items") as NSArray

    public open fun visibleItems(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "visibleItems") as NSArray

    public open fun autosavesConfiguration(): Boolean =
        Native.objc_msgSend("boolean", this, "autosavesConfiguration") as Boolean

    public open fun setAutosavesConfiguration(autosavesConfiguration: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutosavesConfiguration:", autosavesConfiguration)
    }

    public open fun setConfigurationFromDictionary(configDict: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "setConfigurationFromDictionary:", configDict)
    }

    public open fun configurationDictionary(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "configurationDictionary") as NSDictionary

    public open fun validateVisibleItems(): Unit {
        Native.objc_msgSend("void", this, "validateVisibleItems")
    }

    public open fun allowsExtensionItems(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsExtensionItems") as Boolean

    public open fun setAllowsExtensionItems(allowsExtensionItems: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsExtensionItems:", allowsExtensionItems)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSToolbar_NSDeprecated.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSToolbar")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSToolbar_NSDeprecated : IObjCObject {
    public open fun fullScreenAccessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "fullScreenAccessoryView") as NSView

    public open fun setFullScreenAccessoryView(fullScreenAccessoryView: NSView): Unit {
        Native.objc_msgSend("void", this, "setFullScreenAccessoryView:", fullScreenAccessoryView)
    }

    public open fun fullScreenAccessoryViewMinHeight(): Double =
        Native.objc_msgSend("double", this, "fullScreenAccessoryViewMinHeight") as Double

    public open fun setFullScreenAccessoryViewMinHeight(fullScreenAccessoryViewMinHeight: Double): Unit {
        Native.objc_msgSend("void", this, "setFullScreenAccessoryViewMinHeight:", fullScreenAccessoryViewMinHeight)
    }

    public open fun fullScreenAccessoryViewMaxHeight(): Double =
        Native.objc_msgSend("double", this, "fullScreenAccessoryViewMaxHeight") as Double

    public open fun setFullScreenAccessoryViewMaxHeight(fullScreenAccessoryViewMaxHeight: Double): Unit {
        Native.objc_msgSend("void", this, "setFullScreenAccessoryViewMaxHeight:", fullScreenAccessoryViewMaxHeight)
    }

    trait metaclass : IObjCObject
}
