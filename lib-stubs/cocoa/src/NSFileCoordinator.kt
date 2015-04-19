// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSFileCoordinator.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFileAccessIntent(pointer: Long) : NSObject(pointer) {
    public open fun URL(): NSURL =
        Native.objc_msgSend("class objc.NSURL", this, "URL") as NSURL

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun readingIntentWithURL_options(url: NSURL, options: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "readingIntentWithURL:options:", url, options) as ObjCObject

        public open fun writingIntentWithURL_options(url: NSURL, options: Any): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "writingIntentWithURL:options:", url, options) as ObjCObject

    }

    companion object : NSObject(Native.objc_getClass("NSFileAccessIntent")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSFileCoordinator(pointer: Long) : NSObject(pointer) {
    public open fun initWithFilePresenter(filePresenterOrNil: Any): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFilePresenter:", filePresenterOrNil) as ObjCObject

    public open fun purposeIdentifier(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "purposeIdentifier") as NSString

    public open fun setPurposeIdentifier(purposeIdentifier: NSString): Unit {
        Native.objc_msgSend("void", this, "setPurposeIdentifier:", purposeIdentifier)
    }

    public open fun coordinateAccessWithIntents_queue_byAccessor(intents: NSArray, queue: NSOperationQueue, accessor: Any): Unit {
        Native.objc_msgSend("void", this, "coordinateAccessWithIntents:queue:byAccessor:", intents, queue, accessor)
    }

    public open fun coordinateReadingItemAtURL_options_error_byAccessor(url: NSURL, options: Any, outError: Pointer<NSError>, reader: Any): Unit {
        Native.objc_msgSend("void", this, "coordinateReadingItemAtURL:options:error:byAccessor:", url, options, outError, reader)
    }

    public open fun coordinateWritingItemAtURL_options_error_byAccessor(url: NSURL, options: Any, outError: Pointer<NSError>, writer: Any): Unit {
        Native.objc_msgSend("void", this, "coordinateWritingItemAtURL:options:error:byAccessor:", url, options, outError, writer)
    }

    public open fun coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor(readingURL: NSURL, readingOptions: Any, writingURL: NSURL, writingOptions: Any, outError: Pointer<NSError>, readerWriter: Any): Unit {
        Native.objc_msgSend("void", this, "coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:", readingURL, readingOptions, writingURL, writingOptions, outError, readerWriter)
    }

    public open fun coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor(url1: NSURL, options1: Any, url2: NSURL, options2: Any, outError: Pointer<NSError>, writer: Any): Unit {
        Native.objc_msgSend("void", this, "coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:", url1, options1, url2, options2, outError, writer)
    }

    public open fun prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor(readingURLs: NSArray, readingOptions: Any, writingURLs: NSArray, writingOptions: Any, outError: Pointer<NSError>, batchAccessor: Any): Unit {
        Native.objc_msgSend("void", this, "prepareForReadingItemsAtURLs:options:writingItemsAtURLs:options:error:byAccessor:", readingURLs, readingOptions, writingURLs, writingOptions, outError, batchAccessor)
    }

    public open fun itemAtURL_willMoveToURL(oldURL: NSURL, newURL: NSURL): Unit {
        Native.objc_msgSend("void", this, "itemAtURL:willMoveToURL:", oldURL, newURL)
    }

    public open fun itemAtURL_didMoveToURL(oldURL: NSURL, newURL: NSURL): Unit {
        Native.objc_msgSend("void", this, "itemAtURL:didMoveToURL:", oldURL, newURL)
    }

    public open fun cancel(): Unit {
        Native.objc_msgSend("void", this, "cancel")
    }

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun addFilePresenter(filePresenter: Any): Unit {
            Native.objc_msgSend("void", this, "addFilePresenter:", filePresenter)
        }

        public open fun removeFilePresenter(filePresenter: Any): Unit {
            Native.objc_msgSend("void", this, "removeFilePresenter:", filePresenter)
        }

        public open fun filePresenters(): NSArray =
            Native.objc_msgSend("class objc.NSArray", this, "filePresenters") as NSArray

    }

    companion object : NSObject(Native.objc_getClass("NSFileCoordinator")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}
