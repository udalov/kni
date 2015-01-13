
package org.jetbrains.kni.tests

import org.jetbrains.kni.indexer.NativeIndexingOptions
import java.io.File

public abstract class ObjCTest(options: NativeIndexingOptions) : AbstractIntegrationTest(options) {

    override protected fun compileNative(source: File, target: File) {
        runProcess("/usr/bin/clang -ObjC -dynamiclib -framework Foundation $source -o $target")
    }

}
