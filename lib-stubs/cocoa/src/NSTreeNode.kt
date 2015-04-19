// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSTreeNode.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSTreeNode(pointer: Long) : NSObject(pointer) {
    public open fun initWithRepresentedObject(modelObject: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRepresentedObject:", modelObject) as ObjCObject

    public open fun representedObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "representedObject") as ObjCObject

    public open fun indexPath(): NSIndexPath =
        Native.objc_msgSend("class objc.NSIndexPath", this, "indexPath") as NSIndexPath

    public open fun isLeaf(): Boolean =
        Native.objc_msgSend("boolean", this, "isLeaf") as Boolean

    public open fun childNodes(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "childNodes") as NSArray

    public open fun mutableChildNodes(): NSMutableArray =
        Native.objc_msgSend("class objc.NSMutableArray", this, "mutableChildNodes") as NSMutableArray

    public open fun descendantNodeAtIndexPath(indexPath: NSIndexPath): NSTreeNode =
        Native.objc_msgSend("class objc.NSTreeNode", this, "descendantNodeAtIndexPath:", indexPath) as NSTreeNode

    public open fun parentNode(): NSTreeNode =
        Native.objc_msgSend("class objc.NSTreeNode", this, "parentNode") as NSTreeNode

    public open fun sortWithSortDescriptors_recursively(sortDescriptors: NSArray, recursively: Boolean): Unit {
        Native.objc_msgSend("void", this, "sortWithSortDescriptors:recursively:", sortDescriptors, recursively)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun treeNodeWithRepresentedObject(modelObject: ObjCObject): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "treeNodeWithRepresentedObject:", modelObject) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSTreeNode")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
