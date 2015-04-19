// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSStream.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSStreamDelegate {
    trait metaclass
}

public open class NSStream(pointer: Long) : NSObject(pointer), NSStream_NSSocketStreamCreationExtensions, NSStream_NSStreamBoundPairCreationExtensions {
    public open fun open(): Unit {
        Native.objc_msgSend("void", this, "open")
    }

    public open fun close(): Unit {
        Native.objc_msgSend("void", this, "close")
    }

    public open fun delegate(): Any =
        Native.objc_msgSend("class objc.Any", this, "delegate")

    public open fun setDelegate(delegate: Any): Unit {
        Native.objc_msgSend("void", this, "setDelegate:", delegate)
    }

    public open fun propertyForKey(key: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "propertyForKey:", key) as ObjCObject

    public open fun setProperty_forKey(property: ObjCObject, key: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setProperty:forKey:", property, key) as Boolean

    public open fun scheduleInRunLoop_forMode(aRunLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "scheduleInRunLoop:forMode:", aRunLoop, mode)
    }

    public open fun removeFromRunLoop_forMode(aRunLoop: NSRunLoop, mode: NSString): Unit {
        Native.objc_msgSend("void", this, "removeFromRunLoop:forMode:", aRunLoop, mode)
    }

    public open fun streamStatus(): Any =
        Native.objc_msgSend("class objc.Any", this, "streamStatus")

    public open fun streamError(): NSError =
        Native.objc_msgSend("class objc.NSError", this, "streamError") as NSError

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSStream_NSSocketStreamCreationExtensions.metaclass, NSStream_NSStreamBoundPairCreationExtensions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSStream")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSInputStream(pointer: Long) : NSStream(pointer), NSInputStream_NSInputStreamExtensions {
    public open fun read_maxLength(buffer: Pointer<Byte>, len: Int): Int =
        Native.objc_msgSend("int", this, "read:maxLength:", buffer, len) as Int

    public open fun getBuffer_length(buffer: Pointer<Pointer<Byte>>, len: Pointer<Int>): Boolean =
        Native.objc_msgSend("boolean", this, "getBuffer:length:", buffer, len) as Boolean

    public open fun hasBytesAvailable(): Boolean =
        Native.objc_msgSend("boolean", this, "hasBytesAvailable") as Boolean

    public open fun initWithData(data: NSData): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithData:", data) as ObjCObject

    public open fun initWithURL(url: NSURL): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:", url) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSStream.metaclass, NSInputStream_NSInputStreamExtensions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSInputStream")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

public open class NSOutputStream(pointer: Long) : NSStream(pointer), NSOutputStream_NSOutputStreamExtensions {
    public open fun write_maxLength(buffer: Pointer<Byte>, len: Int): Int =
        Native.objc_msgSend("int", this, "write:maxLength:", buffer, len) as Int

    public open fun hasSpaceAvailable(): Boolean =
        Native.objc_msgSend("boolean", this, "hasSpaceAvailable") as Boolean

    public open fun initToMemory(): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initToMemory") as ObjCObject

    public open fun initToBuffer_capacity(buffer: Pointer<Byte>, capacity: Int): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initToBuffer:capacity:", buffer, capacity) as ObjCObject

    public open fun initWithURL_append(url: NSURL, shouldAppend: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithURL:append:", url, shouldAppend) as ObjCObject

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSStream.metaclass, NSOutputStream_NSOutputStreamExtensions.metaclass {
    }

    companion object : NSObject(Native.objc_getClass("NSOutputStream")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSStream_NSSocketStreamCreationExtensions : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun getStreamsToHostWithName_port_inputStream_outputStream(hostname: NSString, port: Int, inputStream: Pointer<NSInputStream>, outputStream: Pointer<NSOutputStream>): Unit {
            Native.objc_msgSend("void", this, "getStreamsToHostWithName:port:inputStream:outputStream:", hostname, port, inputStream, outputStream)
        }

        public open fun getStreamsToHost_port_inputStream_outputStream(host: NSHost, port: Int, inputStream: Pointer<NSInputStream>, outputStream: Pointer<NSOutputStream>): Unit {
            Native.objc_msgSend("void", this, "getStreamsToHost:port:inputStream:outputStream:", host, port, inputStream, outputStream)
        }
    }
}

trait NSStream_NSStreamBoundPairCreationExtensions : IObjCObject {
    trait metaclass : IObjCObject {
        public open fun getBoundStreamsWithBufferSize_inputStream_outputStream(bufferSize: Int, inputStream: Pointer<NSInputStream>, outputStream: Pointer<NSOutputStream>): Unit {
            Native.objc_msgSend("void", this, "getBoundStreamsWithBufferSize:inputStream:outputStream:", bufferSize, inputStream, outputStream)
        }
    }
}

trait NSInputStream_NSInputStreamExtensions : IObjCObject {
    public open fun initWithFileAtPath(path: NSString): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initWithFileAtPath:", path) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun inputStreamWithData(data: NSData): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "inputStreamWithData:", data) as ObjCObject

        public open fun inputStreamWithFileAtPath(path: NSString): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "inputStreamWithFileAtPath:", path) as ObjCObject

        public open fun inputStreamWithURL(url: NSURL): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "inputStreamWithURL:", url) as ObjCObject
    }
}

trait NSOutputStream_NSOutputStreamExtensions : IObjCObject {
    public open fun initToFileAtPath_append(path: NSString, shouldAppend: Boolean): ObjCObject =
        Native.objc_msgSend("class kni.objc.ObjCObject", this, "initToFileAtPath:append:", path, shouldAppend) as ObjCObject

    trait metaclass : IObjCObject {
        public open fun outputStreamToMemory(): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "outputStreamToMemory") as ObjCObject

        public open fun outputStreamToBuffer_capacity(buffer: Pointer<Byte>, capacity: Int): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "outputStreamToBuffer:capacity:", buffer, capacity) as ObjCObject

        public open fun outputStreamToFileAtPath_append(path: NSString, shouldAppend: Boolean): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "outputStreamToFileAtPath:append:", path, shouldAppend) as ObjCObject

        public open fun outputStreamWithURL_append(url: NSURL, shouldAppend: Boolean): ObjCObject =
            Native.objc_msgSend("class kni.objc.ObjCObject", this, "outputStreamWithURL:append:", url, shouldAppend) as ObjCObject
    }
}
