package org.jetbrains.kni.tests

import org.junit.Test as test

class IntegrationTestGenerated : AbstractIntegrationTest() {
    test fun simpleClass() = doTest("tests/testData/integration/simpleClass.kt")
}
