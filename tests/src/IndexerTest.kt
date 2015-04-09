package org.jetbrains.kni.tests

import org.junit.Test as test
import java.io.File
import org.junit.Assert
import org.jetbrains.kni.indexer.buildNativeIndex
import org.jetbrains.kni.indexer.IndexerOptions
import org.jetbrains.kni.indexer.Language

class IndexerTest {
    private fun doTest(content: String, expected: String) {
        val file = File.createTempFile("kni-test", ".h")
        file.deleteOnExit()
        file.writeText(content)

        val tu = buildNativeIndex(file, IndexerOptions(Language.OBJC, verbose = true))
        val actual = tu.toString().replace(file.getPath(), "%SOURCE_PATH%")
        Assert.assertEquals(expected, actual)
    }

    test fun simpleClass() {
        doTest("""
@interface A
@end
""", expected = """name: "%SOURCE_PATH%"
class {
  name: "A"
  container: ""
  location_file: "%SOURCE_PATH%"
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
""", expected = """name: "%SOURCE_PATH%"
class {
  name: "A"
  category: "A+"
  category: "A+Cat"
  container: ""
  location_file: "%SOURCE_PATH%"
}
category {
  name: "A+"
  container: ""
  location_file: "%SOURCE_PATH%"
}
category {
  name: "A+Cat"
  container: ""
  location_file: "%SOURCE_PATH%"
}
"""
        )
    }
}
