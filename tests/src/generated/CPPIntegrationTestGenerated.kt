package org.jetbrains.kni.tests

import org.junit.Test as test

class CPPIntegrationTestGenerated : CPlusPlusTest() {
    test fun arguments_PODs() = doTest("tests/testData/integration_cpp/arguments/PODs.kt")
}
