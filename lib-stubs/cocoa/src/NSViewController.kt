// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSViewController.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSViewControllerPresentationAnimator {
    trait metaclass
}

public open class NSViewController(pointer: Long) : NSResponder(pointer), NSCoding, NSSeguePerforming, NSUserInterfaceItemIdentification, NSViewController_NSViewControllerPresentation, NSViewController_NSViewControllerPresentationAndTransitionStyles, NSViewController_NSViewControllerContainer, NSViewController_NSViewControllerStoryboardingMethods, NSViewController_NSExtensionAdditions {
    public open fun initWithNibName_bundle(nibNameOrNil: NSString, nibBundleOrNil: NSBundle): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithNibName:bundle:", nibNameOrNil, nibBundleOrNil) as ObjCObject

    override fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    public open fun nibName(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "nibName") as NSString

    public open fun nibBundle(): NSBundle =
        Native.objc_msgSend("class objc.NSBundle", this, "nibBundle") as NSBundle

    public open fun representedObject(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "representedObject") as ObjCObject

    public open fun setRepresentedObject(representedObject: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "setRepresentedObject:", representedObject)
    }

    public open fun title(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "title") as NSString

    public open fun setTitle(title: NSString): Unit {
        Native.objc_msgSend("void", this, "setTitle:", title)
    }

    public open fun view(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "view") as NSView

    public open fun setView(view: NSView): Unit {
        Native.objc_msgSend("void", this, "setView:", view)
    }

    public open fun loadView(): Unit {
        Native.objc_msgSend("void", this, "loadView")
    }

    override fun commitEditingWithDelegate_didCommitSelector_contextInfo(delegate: ObjCObject, didCommitSelector: ObjCSelector, contextInfo: Pointer<*>): Unit {
        Native.objc_msgSend("void", this, "commitEditingWithDelegate:didCommitSelector:contextInfo:", delegate, didCommitSelector, contextInfo)
    }

    override fun commitEditing(): Boolean =
        Native.objc_msgSend("boolean", this, "commitEditing") as Boolean

    override fun discardEditing(): Unit {
        Native.objc_msgSend("void", this, "discardEditing")
    }

    public open fun viewDidLoad(): Unit {
        Native.objc_msgSend("void", this, "viewDidLoad")
    }

    public open fun isViewLoaded(): Boolean =
        Native.objc_msgSend("boolean", this, "isViewLoaded") as Boolean

    public open fun viewWillAppear(): Unit {
        Native.objc_msgSend("void", this, "viewWillAppear")
    }

    public open fun viewDidAppear(): Unit {
        Native.objc_msgSend("void", this, "viewDidAppear")
    }

    public open fun viewWillDisappear(): Unit {
        Native.objc_msgSend("void", this, "viewWillDisappear")
    }

    public open fun viewDidDisappear(): Unit {
        Native.objc_msgSend("void", this, "viewDidDisappear")
    }

    public open fun preferredContentSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "preferredContentSize")

    public open fun setPreferredContentSize(preferredContentSize: Any): Unit {
        Native.objc_msgSend("void", this, "setPreferredContentSize:", preferredContentSize)
    }

    public open fun updateViewConstraints(): Unit {
        Native.objc_msgSend("void", this, "updateViewConstraints")
    }

    public open fun viewWillLayout(): Unit {
        Native.objc_msgSend("void", this, "viewWillLayout")
    }

    public open fun viewDidLayout(): Unit {
        Native.objc_msgSend("void", this, "viewDidLayout")
    }

    override fun init(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "init") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSResponder.metaclass, NSCoding.metaclass, NSSeguePerforming.metaclass, NSUserInterfaceItemIdentification.metaclass, NSViewController_NSViewControllerPresentation.metaclass, NSViewController_NSViewControllerPresentationAndTransitionStyles.metaclass, NSViewController_NSViewControllerContainer.metaclass, NSViewController_NSViewControllerStoryboardingMethods.metaclass, NSViewController_NSExtensionAdditions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSViewController")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSViewController_NSViewControllerPresentation : IObjCObject {
    public open fun presentViewController_animator(viewController: NSViewController, animator: Any): Unit {
        Native.objc_msgSend("void", this, "presentViewController:animator:", viewController, animator)
    }

    public open fun dismissViewController(viewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "dismissViewController:", viewController)
    }

    public open fun dismissController(sender: ObjCObject): Unit {
        Native.objc_msgSend("void", this, "dismissController:", sender)
    }

    public open fun presentedViewControllers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "presentedViewControllers") as NSArray

    public open fun presentingViewController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "presentingViewController") as NSViewController

    trait metaclass : IObjCObject
}

trait NSViewController_NSViewControllerPresentationAndTransitionStyles : IObjCObject {
    public open fun presentViewControllerAsSheet(viewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "presentViewControllerAsSheet:", viewController)
    }

    public open fun presentViewControllerAsModalWindow(viewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "presentViewControllerAsModalWindow:", viewController)
    }

    public open fun presentViewController_asPopoverRelativeToRect_ofView_preferredEdge_behavior(viewController: NSViewController, positioningRect: Any, positioningView: NSView, preferredEdge: Int, behavior: Any): Unit {
        Native.objc_msgSend("void", this, "presentViewController:asPopoverRelativeToRect:ofView:preferredEdge:behavior:", viewController, positioningRect, positioningView, preferredEdge, behavior)
    }

    public open fun transitionFromViewController_toViewController_options_completionHandler(fromViewController: NSViewController, toViewController: NSViewController, options: Any, completion: Any): Unit {
        Native.objc_msgSend("void", this, "transitionFromViewController:toViewController:options:completionHandler:", fromViewController, toViewController, options, completion)
    }

    trait metaclass : IObjCObject
}

trait NSViewController_NSViewControllerContainer : IObjCObject {
    public open fun parentViewController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "parentViewController") as NSViewController

    public open fun childViewControllers(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "childViewControllers") as NSArray

    public open fun setChildViewControllers(childViewControllers: NSArray): Unit {
        Native.objc_msgSend("void", this, "setChildViewControllers:", childViewControllers)
    }

    public open fun addChildViewController(childViewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "addChildViewController:", childViewController)
    }

    public open fun removeFromParentViewController(): Unit {
        Native.objc_msgSend("void", this, "removeFromParentViewController")
    }

    public open fun insertChildViewController_atIndex(childViewController: NSViewController, index: Int): Unit {
        Native.objc_msgSend("void", this, "insertChildViewController:atIndex:", childViewController, index)
    }

    public open fun removeChildViewControllerAtIndex(index: Int): Unit {
        Native.objc_msgSend("void", this, "removeChildViewControllerAtIndex:", index)
    }

    public open fun preferredContentSizeDidChangeForViewController(viewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "preferredContentSizeDidChangeForViewController:", viewController)
    }

    public open fun viewWillTransitionToSize(newSize: Any): Unit {
        Native.objc_msgSend("void", this, "viewWillTransitionToSize:", newSize)
    }

    trait metaclass : IObjCObject
}

trait NSViewController_NSViewControllerStoryboardingMethods : IObjCObject {
    public open fun storyboard(): NSStoryboard =
        Native.objc_msgSend("class objc.NSStoryboard", this, "storyboard") as NSStoryboard

    trait metaclass : IObjCObject
}

trait NSViewController_NSExtensionAdditions : IObjCObject {
    public open fun extensionContext(): NSExtensionContext =
        Native.objc_msgSend("class objc.NSExtensionContext", this, "extensionContext") as NSExtensionContext

    public open fun sourceItemView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "sourceItemView") as NSView

    public open fun setSourceItemView(sourceItemView: NSView): Unit {
        Native.objc_msgSend("void", this, "setSourceItemView:", sourceItemView)
    }

    public open fun preferredScreenOrigin(): Any =
        Native.objc_msgSend("class objc.Any", this, "preferredScreenOrigin")

    public open fun setPreferredScreenOrigin(preferredScreenOrigin: Any): Unit {
        Native.objc_msgSend("void", this, "setPreferredScreenOrigin:", preferredScreenOrigin)
    }

    public open fun preferredMinimumSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "preferredMinimumSize")

    public open fun preferredMaximumSize(): Any =
        Native.objc_msgSend("class objc.Any", this, "preferredMaximumSize")

    trait metaclass : IObjCObject
}
