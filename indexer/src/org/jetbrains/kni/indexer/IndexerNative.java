package org.jetbrains.kni.indexer;

public class IndexerNative {
    static {
        System.loadLibrary("KNIIndexer");
    }

    public static native byte[] buildNativeIndex(String args);
}
