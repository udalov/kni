// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSAnimation.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSAnimationDelegate {
    trait metaclass
}

trait NSAnimatablePropertyContainer {
    trait metaclass
}

public open class NSAnimation(pointer: Long) : NSObject(pointer), NSCopying, NSCoding {
    public open fun initWithDuration_animationCurve(duration: Double, animationCurve: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithDuration:animationCurve:", duration, animationCurve) as ObjCObject

    public open fun startAnimation(): Unit {
        Native.objc_msgSend("void", this, "startAnimation")
    }

    public open fun stopAnimation(): Unit {
        Native.objc_msgSend("void", this, "stopAnimation")
    }

    public open fun isAnimating(): Boolean =
        Native.objc_msgSend("boolean", this, "isAnimating") as Boolean

    public open fun currentProgress(): Float =
        Native.objc_msgSend("float", this, "currentProgress") as Float

    public open fun setCurrentProgress(currentProgress: Float): Unit {
        Native.objc_msgSend("void", this, "setCurrentProgress:", currentProgress)
    }

    public open fun duration(): Double =
        Native.objc_msgSend("double", this, "duration") as Double

    public open fun setDuration(duration: Double): Unit {
        Native.objc_msgSend("void", this, "setDuration:", duration)
    }

    public open fun animationBlockingMode(): Any =
        Native.objc_msgSend("class objc.Any", this, "animationBlockingMode")

    public open fun setAnimationBlockingMode(animationBlockingMode: Any): Unit {
        Native.objc_msgSend("void", this, "setAnimationBlockingMode:", animationBlockingMode)
    }

    public open fun frameRate(): Float =
        Native.objc_msgSend("float", this, "frameRate") as Float

    public open fun setFrameRate(frameRate: Float): Unit {
        Native.objc_msgSend("void", this, "setFrameRate:", frameRate)
    }

    public open fun animationCurve(): Any =
        Native.objc_msgSend("class objc.Any", this, "animationCurve")

    public open fun setAnimationCurve(animationCurve: Any): Unit {
        Native.objc_msgSend("void", this, "setAnimationCurve:", animationCurve)
    }

    public open fun currentValue(): Float =
        Native.objc_msgSend("float", this, "currentValue") as Float

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun progressMarks(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "progressMarks") as NSArray

    public open fun setProgressMarks(progressMarks: NSArray): Unit {
        Native.objc_msgSend("void", this, "setProgressMarks:", progressMarks)
    }

    public open fun addProgressMark(progressMark: Float): Unit {
        Native.objc_msgSend("void", this, "addProgressMark:", progressMark)
    }

    public open fun removeProgressMark(progressMark: Float): Unit {
        Native.objc_msgSend("void", this, "removeProgressMark:", progressMark)
    }

    public open fun startWhenAnimation_reachesProgress(animation: NSAnimation, startProgress: Float): Unit {
        Native.objc_msgSend("void", this, "startWhenAnimation:reachesProgress:", animation, startProgress)
    }

    public open fun stopWhenAnimation_reachesProgress(animation: NSAnimation, stopProgress: Float): Unit {
        Native.objc_msgSend("void", this, "stopWhenAnimation:reachesProgress:", animation, stopProgress)
    }

    public open fun clearStartAnimation(): Unit {
        Native.objc_msgSend("void", this, "clearStartAnimation")
    }

    public open fun clearStopAnimation(): Unit {
        Native.objc_msgSend("void", this, "clearStopAnimation")
    }

    public open fun runLoopModesForAnimating(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "runLoopModesForAnimating") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSCopying.metaclass, NSCoding.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSAnimation")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSViewAnimation(pointer: Long) : NSAnimation(pointer) {
    public open fun initWithViewAnimations(viewAnimations: NSArray): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithViewAnimations:", viewAnimations) as ObjCObject

    public open fun viewAnimations(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "viewAnimations") as NSArray

    public open fun setViewAnimations(viewAnimations: NSArray): Unit {
        Native.objc_msgSend("void", this, "setViewAnimations:", viewAnimations)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSAnimation.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSViewAnimation")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
