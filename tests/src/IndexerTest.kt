package org.jetbrains.kni.indexer

import org.junit.Test as test
import java.io.File
import org.junit.Assert

class IndexerTest {
    private fun doTest(content: String, expected: String) {
        val file = File.createTempFile("kni-test", ".h")
        file.deleteOnExit()
        file.writeText(content)

        val tu = buildNativeIndex(file)
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
