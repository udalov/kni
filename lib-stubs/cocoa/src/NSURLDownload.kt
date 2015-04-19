// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSURLDownload.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSURLDownloadDelegate {
    trait metaclass
}

public open class NSURLDownload(pointer: Long) : NSObject(pointer) {
    public open fun initWithRequest_delegate(request: NSURLRequest, delegate: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithRequest:delegate:", request, delegate) as ObjCObject

    public open fun initWithResumeData_delegate_path(resumeData: NSData, delegate: Any, path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithResumeData:delegate:path:", resumeData, delegate, path) as ObjCObject

    public open fun cancel(): Unit {
        Native.objc_msgSend("void", this, "cancel")
    }

    public open fun setDestination_allowOverwrite(path: NSString, allowOverwrite: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDestination:allowOverwrite:", path, allowOverwrite)
    }

    public open fun request(): NSURLRequest =
        Native.objc_msgSend("class objc.NSURLRequest", this, "request") as NSURLRequest

    public open fun resumeData(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "resumeData") as NSData

    public open fun deletesFileUponFailure(): Boolean =
        Native.objc_msgSend("boolean", this, "deletesFileUponFailure") as Boolean

    public open fun setDeletesFileUponFailure(deletesFileUponFailure: Boolean): Unit {
        Native.objc_msgSend("void", this, "setDeletesFileUponFailure:", deletesFileUponFailure)
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun canResumeDownloadDecodedWithEncodingMIMEType(MIMEType: NSString): Boolean =
            Native.objc_msgSend("boolean", this, "canResumeDownloadDecodedWithEncodingMIMEType:", MIMEType) as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSURLDownload")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
