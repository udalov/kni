// This file is auto-generated. You can mute individual tests by commenting them:
// '// test fun ...'. All other changes will be lost!

package org.jetbrains.kni.tests

import org.junit.Test as test

class CPPIntegrationTestGenerated : CPlusPlusTest() {
    test fun arguments_callbacks() = doTest("tests/testData/integration_cpp/arguments/callbacks.kt")
    test fun arguments_PODs() = doTest("tests/testData/integration_cpp/arguments/PODs.kt")
    test fun arguments_struct1() = doTest("tests/testData/integration_cpp/arguments/struct1.kt")
}
