package kni.objc;

import java.io.File;
import java.io.InputStream;

import static kotlin.io.IoPackage.readBytes;
import static kotlin.io.IoPackage.writeBytes;

@SuppressWarnings("UnusedDeclaration")
public class Native {
    private Native() {
    }

    public static final String KNI_OBJC_RUNTIME_LIBRARY_PATH = "/libKNIObjCRuntime.dylib";

    static {
        try {
            InputStream resource = Native.class.getResourceAsStream(KNI_OBJC_RUNTIME_LIBRARY_PATH);
            try {
                byte[] bytes = readBytes(resource, resource.available());
                File dylib = File.createTempFile("libKNIObjCRuntime", ".dylib");
                writeBytes(dylib, bytes);
                System.load(dylib.getAbsolutePath());
            }
            finally {
                resource.close();
            }
        }
        catch (Throwable e) {
            throw new IllegalStateException(
                    "KNI runtime library couldn't be loaded from " + KNI_OBJC_RUNTIME_LIBRARY_PATH, e
            );
        }
    }

    public static native void dlopen(String path);


    public static native long malloc(long bytes);

    public static native void free(long pointer);

    public static native long getWord(long pointer);

    public static native void setWord(long pointer, long value);


    public static native long objc_getClass(String name);

    public static native Object objc_msgSend(
            String returnType,
            IObjCObject receiver,
            String selectorName,
            Object... args
    );
}
