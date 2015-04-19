// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSMenuItem.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSMenuItem(pointer: Long) : NSObject(pointer), NSCopying, NSCoding, NSValidatedUserInterfaceItem, NSMenuItem_NSDeprecated {
    public open fun initWithTitle_action_keyEquivalent(aString: NSString, aSelector: ObjCSelector, charCode: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTitle:action:keyEquivalent:", aString, aSelector, charCode) as ObjCObject

    public open fun menu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menu") as NSMenu

    public open fun setMenu(menu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setMenu:", menu)
    }

    public open fun hasSubmenu(): Boolean =
        Native.objc_msgSend("boolean", this, "hasSubmenu") as Boolean

    public open fun submenu(): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "submenu") as NSMenu

    public open fun setSubmenu(submenu: NSMenu): Unit {
        Native.objc_msgSend("void", this, "setSubmenu:", submenu)
    }

    public open fun parentItem(): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "parentItem") as NSMenuItem

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun attributedTitle(): NSAttributedString =
        Native.objc_msgSend("class objc.NSAttributedString", this, "attributedTitle") as NSAttributedString

    public open fun setAttributedTitle(attributedTitle: NSAttributedString): Unit {
        Native.objc_msgSend("void", this, "setAttributedTitle:", attributedTitle)
    }

    public open fun isSeparatorItem(): Boolean =
        Native.objc_msgSend("boolean", this, "isSeparatorItem") as Boolean

    public open fun keyEquivalent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "keyEquivalent") as NSString

    public open fun setKeyEquivalent(keyEquivalent: NSString): Unit {
        Native.objc_msgSend("void", this, "setKeyEquivalent:", keyEquivalent)
    }

    public open fun keyEquivalentModifierMask(): Int =
        Native.objc_msgSend("int", this, "keyEquivalentModifierMask") as Int

    public open fun setKeyEquivalentModifierMask(keyEquivalentModifierMask: Int): Unit {
        Native.objc_msgSend("void", this, "setKeyEquivalentModifierMask:", keyEquivalentModifierMask)
    }

    public open fun userKeyEquivalent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "userKeyEquivalent") as NSString

    public open fun setTitleWithMnemonic(stringWithAmpersand: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitleWithMnemonic:", stringWithAmpersand)
    }

    public open fun image(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "image") as NSImage

    public open fun setImage(image: NSImage): Unit {
        Native.objc_msgSend("void", this, "setImage:", image)
    }

    public open fun state(): Int =
        Native.objc_msgSend("int", this, "state") as Int

    public open fun setState(state: Int): Unit {
        Native.objc_msgSend("void", this, "setState:", state)
    }

    public open fun onStateImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "onStateImage") as NSImage

    public open fun setOnStateImage(onStateImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setOnStateImage:", onStateImage)
    }

    public open fun offStateImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "offStateImage") as NSImage

    public open fun setOffStateImage(offStateImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setOffStateImage:", offStateImage)
    }

    public open fun mixedStateImage(): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "mixedStateImage") as NSImage

    public open fun setMixedStateImage(mixedStateImage: NSImage): Unit {
        Native.objc_msgSend("void", this, "setMixedStateImage:", mixedStateImage)
    }

    public open fun isEnabled(): Boolean =
        Native.objc_msgSend("boolean", this, "isEnabled") as Boolean

    public open fun setEnabled(enabled: Boolean): Unit {
        Native.objc_msgSend("void", this, "setEnabled:", enabled)
    }

    public open fun isAlternate(): Boolean =
        Native.objc_msgSend("boolean", this, "isAlternate") as Boolean

    public open fun setAlternate(alternate: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAlternate:", alternate)
    }

    public open fun indentationLevel(): Int =
        Native.objc_msgSend("int", this, "indentationLevel") as Int

    public open fun setIndentationLevel(indentationLevel: Int): Unit {
        Native.objc_msgSend("void", this, "setIndentationLevel:", indentationLevel)
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

    public open fun representedObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "representedObject") as ObjCObject

    public open fun setRepresentedObject(representedObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setRepresentedObject:", representedObject)
    }

    public open fun view(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "view") as NSView

    public open fun setView(view: NSView): Unit {
        Native.objc_msgSend("void", this, "setView:", view)
    }

    public open fun isHighlighted(): Boolean =
        Native.objc_msgSend("boolean", this, "isHighlighted") as Boolean

    public open fun isHidden(): Boolean =
        Native.objc_msgSend("boolean", this, "isHidden") as Boolean

    public open fun setHidden(hidden: Boolean): Unit {
        Native.objc_msgSend("void", this, "setHidden:", hidden)
    }

    public open fun isHiddenOrHasHiddenAncestor(): Boolean =
        Native.objc_msgSend("boolean", this, "isHiddenOrHasHiddenAncestor") as Boolean

    public open fun toolTip(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "toolTip") as NSString

    public open fun setToolTip(toolTip: NSString): Unit {
        Native.objc_msgSend("void", this, "setToolTip:", toolTip)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass, NSValidatedUserInterfaceItem.metaclass, NSMenuItem_NSDeprecated.metaclass {
        public open fun setUsesUserKeyEquivalents(flag: Boolean): Unit {
            Native.objc_msgSend("void", this, "setUsesUserKeyEquivalents:", flag)
        }

        public open fun usesUserKeyEquivalents(): Boolean =
            Native.objc_msgSend("boolean", this, "usesUserKeyEquivalents") as Boolean

        public open fun separatorItem(): NSMenuItem =
            Native.objc_msgSend("class objc.NSMenuItem", this, "separatorItem") as NSMenuItem

    }

    companion object : NSObject(Native.objc_getClass("NSMenuItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSView_NSViewEnclosingMenuItem : IObjCObject {
    public open fun enclosingMenuItem(): NSMenuItem =
        Native.objc_msgSend("class objc.NSMenuItem", this, "enclosingMenuItem") as NSMenuItem

    trait metaclass : IObjCObject
}

trait NSMenuItem_NSDeprecated : IObjCObject {
    public open fun setMnemonicLocation(location: Int): Unit {
        Native.objc_msgSend("void", this, "setMnemonicLocation:", location)
    }

    public open fun mnemonicLocation(): Int =
        Native.objc_msgSend("int", this, "mnemonicLocation") as Int

    public open fun mnemonic(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "mnemonic") as NSString

    trait metaclass : IObjCObject
}
