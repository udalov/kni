// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSOperation.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSOperation(pointer: Long) : NSObject(pointer) {
    public open fun start(): Unit {
        Native.objc_msgSend("void", this, "start")
    }

    public open fun main(): Unit {
        Native.objc_msgSend("void", this, "main")
    }

    public open fun isCancelled(): Boolean =
        Native.objc_msgSend("boolean", this, "isCancelled") as Boolean

    public open fun cancel(): Unit {
        Native.objc_msgSend("void", this, "cancel")
    }

    public open fun isExecuting(): Boolean =
        Native.objc_msgSend("boolean", this, "isExecuting") as Boolean

    public open fun isFinished(): Boolean =
        Native.objc_msgSend("boolean", this, "isFinished") as Boolean

    public open fun isConcurrent(): Boolean =
        Native.objc_msgSend("boolean", this, "isConcurrent") as Boolean

    public open fun isAsynchronous(): Boolean =
        Native.objc_msgSend("boolean", this, "isAsynchronous") as Boolean

    public open fun isReady(): Boolean =
        Native.objc_msgSend("boolean", this, "isReady") as Boolean

    public open fun addDependency(op: NSOperation): Unit {
        Native.objc_msgSend("void", this, "addDependency:", op)
    }

    public open fun removeDependency(op: NSOperation): Unit {
        Native.objc_msgSend("void", this, "removeDependency:", op)
    }

    public open fun dependencies(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "dependencies") as NSArray

    public open fun queuePriority(): Any =
        Native.objc_msgSend("class objc.Any", this, "queuePriority")

    public open fun setQueuePriority(queuePriority: Any): Unit {
        Native.objc_msgSend("void", this, "setQueuePriority:", queuePriority)
    }

    public open fun completionBlock(): Any =
        Native.objc_msgSend("class objc.Any", this, "completionBlock")

    public open fun setCompletionBlock(completionBlock: Any): Unit {
        Native.objc_msgSend("void", this, "setCompletionBlock:", completionBlock)
    }

    public open fun waitUntilFinished(): Unit {
        Native.objc_msgSend("void", this, "waitUntilFinished")
    }

    public open fun threadPriority(): Double =
        Native.objc_msgSend("double", this, "threadPriority") as Double

    public open fun setThreadPriority(threadPriority: Double): Unit {
        Native.objc_msgSend("void", this, "setThreadPriority:", threadPriority)
    }

    public open fun qualityOfService(): Any =
        Native.objc_msgSend("class objc.Any", this, "qualityOfService")

    public open fun setQualityOfService(qualityOfService: Any): Unit {
        Native.objc_msgSend("void", this, "setQualityOfService:", qualityOfService)
    }

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSOperation")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSBlockOperation(pointer: Long) : NSOperation(pointer) {
    public open fun addExecutionBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "addExecutionBlock:", block)
    }

    public open fun executionBlocks(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "executionBlocks") as NSArray

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSOperation.metaclass {
        public open fun blockOperationWithBlock(block: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "blockOperationWithBlock:", block) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSBlockOperation")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSInvocationOperation(pointer: Long) : NSOperation(pointer) {
    public open fun initWithTarget_selector_object(target: ObjCObject, sel: ObjCSelector, arg: ObjCObject): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithTarget:selector:object:", target, sel, arg) as ObjCObject

    public open fun initWithInvocation(inv: NSInvocation): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithInvocation:", inv) as ObjCObject

    public open fun invocation(): NSInvocation =
        Native.objc_msgSend("class objc.NSInvocation", this, "invocation") as NSInvocation

    public open fun result(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "result") as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSOperation.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSInvocationOperation")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSOperationQueue(pointer: Long) : NSObject(pointer) {
    public open fun addOperation(op: NSOperation): Unit {
        Native.objc_msgSend("void", this, "addOperation:", op)
    }

    public open fun addOperations_waitUntilFinished(ops: NSArray, wait: Boolean): Unit {
        Native.objc_msgSend("void", this, "addOperations:waitUntilFinished:", ops, wait)
    }

    public open fun addOperationWithBlock(block: Any): Unit {
        Native.objc_msgSend("void", this, "addOperationWithBlock:", block)
    }

    public open fun operations(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "operations") as NSArray

    public open fun operationCount(): Int =
        Native.objc_msgSend("int", this, "operationCount") as Int

    public open fun maxConcurrentOperationCount(): Int =
        Native.objc_msgSend("int", this, "maxConcurrentOperationCount") as Int

    public open fun setMaxConcurrentOperationCount(maxConcurrentOperationCount: Int): Unit {
        Native.objc_msgSend("void", this, "setMaxConcurrentOperationCount:", maxConcurrentOperationCount)
    }

    public open fun isSuspended(): Boolean =
        Native.objc_msgSend("boolean", this, "isSuspended") as Boolean

    public open fun setSuspended(suspended: Boolean): Unit {
        Native.objc_msgSend("void", this, "setSuspended:", suspended)
    }

    public open fun name(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "name") as NSString

    public open fun setName(name: NSString): Unit {
        Native.objc_msgSend("void", this, "setName:", name)
    }

    public open fun qualityOfService(): Any =
        Native.objc_msgSend("class objc.Any", this, "qualityOfService")

    public open fun setQualityOfService(qualityOfService: Any): Unit {
        Native.objc_msgSend("void", this, "setQualityOfService:", qualityOfService)
    }

    public open fun underlyingQueue(): Any =
        Native.objc_msgSend("class objc.Any", this, "underlyingQueue")

    public open fun setUnderlyingQueue(underlyingQueue: Any): Unit {
        Native.objc_msgSend("void", this, "setUnderlyingQueue:", underlyingQueue)
    }

    public open fun cancelAllOperations(): Unit {
        Native.objc_msgSend("void", this, "cancelAllOperations")
    }

    public open fun waitUntilAllOperationsAreFinished(): Unit {
        Native.objc_msgSend("void", this, "waitUntilAllOperationsAreFinished")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun currentQueue(): NSOperationQueue =
            Native.objc_msgSend("class objc.NSOperationQueue", this, "currentQueue") as NSOperationQueue

        public open fun mainQueue(): NSOperationQueue =
            Native.objc_msgSend("class objc.NSOperationQueue", this, "mainQueue") as NSOperationQueue

    }

    companion object : NSObject(Native.objc_getClass("NSOperationQueue")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
