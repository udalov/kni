package org.jetbrains.kni.tests

import org.junit.Test as test
import java.io.File
import org.junit.Assert
import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.NativeIndexingOptions
import org.jetbrains.kni.indexer.Language

class IndexerTest {
    private fun doTest(content: String, expected: String) {
        val file = File.createTempFile("kni-test", ".h")
        file.deleteOnExit()
        file.writeText(content)

        val tu = buildNativeIndex(file, NativeIndexingOptions(Language.OBJC))
        Assert.assertEquals(expected, "$tu")
    }

    test fun simpleClass() {
        doTest("""
@interface A
@end
""", expected = """class {
  name: "A"
}
"""
        )
    }

    test fun simpleCategory() {
        doTest("""
@interface A
@end

@interface A()
@end

@interface A(Cat)
@end
""", expected = """class {
  name: "A"
  category: "A+"
  category: "A+Cat"
}
category {
  name: "A+"
}
category {
  name: "A+Cat"
}
"""
        )
    }
}
