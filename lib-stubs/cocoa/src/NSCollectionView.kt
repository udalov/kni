// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSCollectionView.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSCollectionViewDelegate {
    trait metaclass
}

public open class NSCollectionViewItem(pointer: Long) : NSViewController(pointer), NSCopying {
    public open fun collectionView(): NSCollectionView =
        Native.objc_msgSend("class objc.NSCollectionView", this, "collectionView") as NSCollectionView

    public open fun isSelected(): Boolean =
        Native.objc_msgSend("boolean", this, "isSelected") as Boolean

    public open fun setSelected(selected: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelected:", selected)
    }

    public open fun imageView(): NSImageView =
        Native.objc_msgSend("class objc.NSImageView", this, "imageView") as NSImageView

    public open fun setImageView(imageView: NSImageView): Unit {
        Native.objc_msgSend("void", this, "setImageView:", imageView)
    }

    public open fun textField(): NSTextField =
        Native.objc_msgSend("class objc.NSTextField", this, "textField") as NSTextField

    public open fun setTextField(textField: NSTextField): Unit {
        Native.objc_msgSend("void", this, "setTextField:", textField)
    }

    public open fun draggingImageComponents(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "draggingImageComponents") as NSArray

    override fun commitEditing(): Boolean =
        Native.objc_msgSend("boolean", this, "commitEditing") as Boolean

    override fun commitEditingWithDelegate_didCommitSelector_contextInfo(delegate: ObjCObject, didCommitSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "commitEditingWithDelegate:didCommitSelector:contextInfo:", delegate, didCommitSelector, contextInfo)
    }

    override fun discardEditing(): Unit {
        Native.objc_msgSend("void", this, "discardEditing")
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSViewController.metaclass, NSCopying.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCollectionViewItem")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSCollectionView(pointer: Long) : NSView(pointer), NSDraggingSource, NSDraggingDestination {
    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun isFirstResponder(): Boolean =
        Native.objc_msgSend("boolean", this, "isFirstResponder") as Boolean

    public open fun content(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "content") as NSArray

    public open fun setContent(content: NSArray): Unit {
        Native.objc_msgSend("void", this, "setContent:", content)
    }

    public open fun isSelectable(): Boolean =
        Native.objc_msgSend("boolean", this, "isSelectable") as Boolean

    public open fun setSelectable(selectable: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSelectable:", selectable)
    }

    public open fun allowsMultipleSelection(): Boolean =
        Native.objc_msgSend("boolean", this, "allowsMultipleSelection") as Boolean

    public open fun setAllowsMultipleSelection(allowsMultipleSelection: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAllowsMultipleSelection:", allowsMultipleSelection)
    }

    public open fun selectionIndexes(): NSIndexSet =
        Native.objc_msgSend("class objc.NSIndexSet", this, "selectionIndexes") as NSIndexSet

    public open fun setSelectionIndexes(selectionIndexes: NSIndexSet): Unit {
        Native.objc_msgSend("void", this, "setSelectionIndexes:", selectionIndexes)
    }

    public open fun newItemForRepresentedObject(`object`: ObjCObject): NSCollectionViewItem =
        Native.objc_msgSend("class objc.NSCollectionViewItem", this, "newItemForRepresentedObject:", `object`) as NSCollectionViewItem

    public open fun itemPrototype(): NSCollectionViewItem =
        Native.objc_msgSend("class objc.NSCollectionViewItem", this, "itemPrototype") as NSCollectionViewItem

    public open fun setItemPrototype(itemPrototype: NSCollectionViewItem): Unit {
        Native.objc_msgSend("void", this, "setItemPrototype:", itemPrototype)
    }

    public open fun maxNumberOfRows(): Int =
        Native.objc_msgSend("int", this, "maxNumberOfRows") as Int

    public open fun setMaxNumberOfRows(maxNumberOfRows: Int): Unit {
        Native.objc_msgSend("void", this, "setMaxNumberOfRows:", maxNumberOfRows)
    }

    public open fun maxNumberOfColumns(): Int =
        Native.objc_msgSend("int", this, "maxNumberOfColumns") as Int

    public open fun setMaxNumberOfColumns(maxNumberOfColumns: Int): Unit {
        Native.objc_msgSend("void", this, "setMaxNumberOfColumns:", maxNumberOfColumns)
    }

    public open fun minItemSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "minItemSize")

    public open fun setMinItemSize(minItemSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMinItemSize:", minItemSize)
    }

    public open fun maxItemSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "maxItemSize")

    public open fun setMaxItemSize(maxItemSize: Any): Unit {
        Native.objc_msgSend("void", this, "setMaxItemSize:", maxItemSize)
    }

    public open fun backgroundColors(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "backgroundColors") as NSArray

    public open fun setBackgroundColors(backgroundColors: NSArray): Unit {
        Native.objc_msgSend("void", this, "setBackgroundColors:", backgroundColors)
    }

    public open fun itemAtIndex(index: Int): NSCollectionViewItem =
        Native.objc_msgSend("class objc.NSCollectionViewItem", this, "itemAtIndex:", index) as NSCollectionViewItem

    public open fun frameForItemAtIndex(index: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "frameForItemAtIndex:", index)

    public open fun frameForItemAtIndex_withNumberOfItems(index: Int, numberOfItems: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "frameForItemAtIndex:withNumberOfItems:", index, numberOfItems)

    public open fun setDraggingSourceOperationMask_forLocal(dragOperationMask: Any, localDestination: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDraggingSourceOperationMask:forLocal:", dragOperationMask, localDestination)
    }

    public open fun draggingImageForItemsAtIndexes_withEvent_offset(indexes: NSIndexSet, event: NSEvent, dragImageOffset: Pointer<Any>): NSImage =
        Native.objc_msgSend("class objc.NSImage", this, "draggingImageForItemsAtIndexes:withEvent:offset:", indexes, event, dragImageOffset) as NSImage

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    override fun performKeyEquivalent(theEvent: NSEvent): Boolean =
        Native.objc_msgSend("boolean", this, "performKeyEquivalent:", theEvent) as Boolean

    override fun performMnemonic(theString: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "performMnemonic:", theString) as Boolean

    trait metaclass : NSView.metaclass, NSDraggingSource.metaclass, NSDraggingDestination.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSCollectionView")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
