// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSFileHandle.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSFileHandle(pointer: Long) : NSObject(pointer), NSSecureCoding, NSFileHandle_NSFileHandleCreation, NSFileHandle_NSFileHandleAsynchronousAccess, NSFileHandle_NSFileHandlePlatformSpecific {
    public open fun availableData(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "availableData") as NSData

    public open fun readDataToEndOfFile(): NSData =
        Native.objc_msgSend("class objc.NSData", this, "readDataToEndOfFile") as NSData

    public open fun readDataOfLength(length: Int): NSData =
        Native.objc_msgSend("class objc.NSData", this, "readDataOfLength:", length) as NSData

    public open fun writeData(data: NSData): Unit {
        Native.objc_msgSend("void", this, "writeData:", data)
    }

    public open fun offsetInFile(): Long =
        Native.objc_msgSend("long", this, "offsetInFile") as Long

    public open fun seekToEndOfFile(): Long =
        Native.objc_msgSend("long", this, "seekToEndOfFile") as Long

    public open fun seekToFileOffset(offset: Long): Unit {
        Native.objc_msgSend("void", this, "seekToFileOffset:", offset)
    }

    public open fun truncateFileAtOffset(offset: Long): Unit {
        Native.objc_msgSend("void", this, "truncateFileAtOffset:", offset)
    }

    public open fun synchronizeFile(): Unit {
        Native.objc_msgSend("void", this, "synchronizeFile")
    }

    public open fun closeFile(): Unit {
        Native.objc_msgSend("void", this, "closeFile")
    }

    public open fun initWithFileDescriptor_closeOnDealloc(fd: Int, closeopt: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFileDescriptor:closeOnDealloc:", fd, closeopt) as ObjCObject

    public open fun initWithCoder(coder: NSCoder): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithCoder:", coder) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSecureCoding.metaclass, NSFileHandle_NSFileHandleCreation.metaclass, NSFileHandle_NSFileHandleAsynchronousAccess.metaclass, NSFileHandle_NSFileHandlePlatformSpecific.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSFileHandle")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSPipe(pointer: Long) : NSObject(pointer) {
    public open fun fileHandleForReading(): NSFileHandle =
        Native.objc_msgSend("class objc.NSFileHandle", this, "fileHandleForReading") as NSFileHandle

    public open fun fileHandleForWriting(): NSFileHandle =
        Native.objc_msgSend("class objc.NSFileHandle", this, "fileHandleForWriting") as NSFileHandle

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass {
        public open fun pipe(): NSPipe =
            Native.objc_msgSend("class objc.NSPipe", this, "pipe") as NSPipe

    }

    companion object : NSObject(Native.objc_getClass("NSPipe")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSFileHandle_NSFileHandleCreation : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun fileHandleWithStandardInput(): NSFileHandle =
            Native.objc_msgSend("class objc.NSFileHandle", this, "fileHandleWithStandardInput") as NSFileHandle

        public open fun fileHandleWithStandardOutput(): NSFileHandle =
            Native.objc_msgSend("class objc.NSFileHandle", this, "fileHandleWithStandardOutput") as NSFileHandle

        public open fun fileHandleWithStandardError(): NSFileHandle =
            Native.objc_msgSend("class objc.NSFileHandle", this, "fileHandleWithStandardError") as NSFileHandle

        public open fun fileHandleWithNullDevice(): NSFileHandle =
            Native.objc_msgSend("class objc.NSFileHandle", this, "fileHandleWithNullDevice") as NSFileHandle

        public open fun fileHandleForReadingAtPath(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "fileHandleForReadingAtPath:", path) as ObjCObject

        public open fun fileHandleForWritingAtPath(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "fileHandleForWritingAtPath:", path) as ObjCObject

        public open fun fileHandleForUpdatingAtPath(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "fileHandleForUpdatingAtPath:", path) as ObjCObject

        public open fun fileHandleForReadingFromURL_error(url: NSURL, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "fileHandleForReadingFromURL:error:", url, error) as ObjCObject

        public open fun fileHandleForWritingToURL_error(url: NSURL, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "fileHandleForWritingToURL:error:", url, error) as ObjCObject

        public open fun fileHandleForUpdatingURL_error(url: NSURL, error: Pointer<NSError>): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "fileHandleForUpdatingURL:error:", url, error) as ObjCObject
    }
}

trait NSFileHandle_NSFileHandleAsynchronousAccess : IObjCObject {
    public open fun readInBackgroundAndNotifyForModes(modes: NSArray): Unit {
        Native.objc_msgSend("void", this, "readInBackgroundAndNotifyForModes:", modes)
    }

    public open fun readInBackgroundAndNotify(): Unit {
        Native.objc_msgSend("void", this, "readInBackgroundAndNotify")
    }

    public open fun readToEndOfFileInBackgroundAndNotifyForModes(modes: NSArray): Unit {
        Native.objc_msgSend("void", this, "readToEndOfFileInBackgroundAndNotifyForModes:", modes)
    }

    public open fun readToEndOfFileInBackgroundAndNotify(): Unit {
        Native.objc_msgSend("void", this, "readToEndOfFileInBackgroundAndNotify")
    }

    public open fun acceptConnectionInBackgroundAndNotifyForModes(modes: NSArray): Unit {
        Native.objc_msgSend("void", this, "acceptConnectionInBackgroundAndNotifyForModes:", modes)
    }

    public open fun acceptConnectionInBackgroundAndNotify(): Unit {
        Native.objc_msgSend("void", this, "acceptConnectionInBackgroundAndNotify")
    }

    public open fun waitForDataInBackgroundAndNotifyForModes(modes: NSArray): Unit {
        Native.objc_msgSend("void", this, "waitForDataInBackgroundAndNotifyForModes:", modes)
    }

    public open fun waitForDataInBackgroundAndNotify(): Unit {
        Native.objc_msgSend("void", this, "waitForDataInBackgroundAndNotify")
    }

    public open fun readabilityHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "readabilityHandler")

    public open fun setReadabilityHandler(readabilityHandler: Any): Unit {
        Native.objc_msgSend("void", this, "setReadabilityHandler:", readabilityHandler)
    }

    public open fun writeabilityHandler(): Any =
        Native.objc_msgSend("class objc.Any", this, "writeabilityHandler")

    public open fun setWriteabilityHandler(writeabilityHandler: Any): Unit {
        Native.objc_msgSend("void", this, "setWriteabilityHandler:", writeabilityHandler)
    }

    trait metaclass : IObjCObject
}

trait NSFileHandle_NSFileHandlePlatformSpecific : IObjCObject {
    public open fun initWithFileDescriptor(fd: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFileDescriptor:", fd) as ObjCObject

    public open fun fileDescriptor(): Int =
        Native.objc_msgSend("int", this, "fileDescriptor") as Int

    trait metaclass : IObjCObject
}
