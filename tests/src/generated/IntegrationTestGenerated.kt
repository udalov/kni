package org.jetbrains.kni.tests

import org.junit.Test as test

class IntegrationTestGenerated : AbstractIntegrationTest() {
    test fun arguments_bool() = doTest("tests/testData/integration/arguments/bool.kt")
    test fun arguments_char() = doTest("tests/testData/integration/arguments/char.kt")
    test fun arguments_double() = doTest("tests/testData/integration/arguments/double.kt")
    test fun arguments_float() = doTest("tests/testData/integration/arguments/float.kt")
    test fun arguments_int() = doTest("tests/testData/integration/arguments/int.kt")
    test fun arguments_long() = doTest("tests/testData/integration/arguments/long.kt")
    test fun arguments_manyPrimitives() = doTest("tests/testData/integration/arguments/manyPrimitives.kt")
    test fun arguments_objcObject() = doTest("tests/testData/integration/arguments/objcObject.kt")
    test fun arguments_short() = doTest("tests/testData/integration/arguments/short.kt")
    test fun callbacks_arguments_bool() = doTest("tests/testData/integration/callbacks/arguments/bool.kt")
    test fun callbacks_arguments_char() = doTest("tests/testData/integration/callbacks/arguments/char.kt")
    test fun callbacks_arguments_double() = doTest("tests/testData/integration/callbacks/arguments/double.kt")
    test fun callbacks_arguments_float() = doTest("tests/testData/integration/callbacks/arguments/float.kt")
    test fun callbacks_arguments_int() = doTest("tests/testData/integration/callbacks/arguments/int.kt")
    test fun callbacks_arguments_long() = doTest("tests/testData/integration/callbacks/arguments/long.kt")
    test fun callbacks_arguments_objcObject() = doTest("tests/testData/integration/callbacks/arguments/objcObject.kt")
    test fun callbacks_arguments_objcSelector() = doTest("tests/testData/integration/callbacks/arguments/objcSelector.kt")
    test fun callbacks_arguments_pointer() = doTest("tests/testData/integration/callbacks/arguments/pointer.kt")
    test fun callbacks_arguments_short() = doTest("tests/testData/integration/callbacks/arguments/short.kt")
    test fun callbacks_returnType_bool() = doTest("tests/testData/integration/callbacks/returnType/bool.kt")
    test fun callbacks_returnType_char() = doTest("tests/testData/integration/callbacks/returnType/char.kt")
    test fun callbacks_returnType_double() = doTest("tests/testData/integration/callbacks/returnType/double.kt")
    test fun callbacks_returnType_float() = doTest("tests/testData/integration/callbacks/returnType/float.kt")
    test fun callbacks_returnType_int() = doTest("tests/testData/integration/callbacks/returnType/int.kt")
    test fun callbacks_returnType_long() = doTest("tests/testData/integration/callbacks/returnType/long.kt")
    test fun callbacks_returnType_objcObject() = doTest("tests/testData/integration/callbacks/returnType/objcObject.kt")
    test fun callbacks_returnType_short() = doTest("tests/testData/integration/callbacks/returnType/short.kt")
    // test fun callbacks_simple() = doTest("tests/testData/integration/callbacks/simple.kt")
    // test fun callbacks_simpleWithClosure() = doTest("tests/testData/integration/callbacks/simpleWithClosure.kt")
    // test fun categories_callCategoryMetaclassMethod() = doTest("tests/testData/integration/categories/callCategoryMetaclassMethod.kt")
    // test fun categories_callCategoryMethod() = doTest("tests/testData/integration/categories/callCategoryMethod.kt")
    // test fun foundation_nsstringAsString() = doTest("tests/testData/integration/foundation/nsstringAsString.kt")
    test fun nil() = doTest("tests/testData/integration/nil.kt")
    test fun noFinalizeInJava() = doTest("tests/testData/integration/noFinalizeInJava.kt")
    test fun otherTypes_objcSelector() = doTest("tests/testData/integration/otherTypes/objcSelector.kt")
    // test fun pointers_argNSString() = doTest("tests/testData/integration/pointers/argNSString.kt")
    test fun pointers_argString() = doTest("tests/testData/integration/pointers/argString.kt")
    test fun pointers_pointerToChar() = doTest("tests/testData/integration/pointers/pointerToChar.kt")
    // test fun pointers_returnString() = doTest("tests/testData/integration/pointers/returnString.kt")
    test fun returnType_bool() = doTest("tests/testData/integration/returnType/bool.kt")
    test fun returnType_char() = doTest("tests/testData/integration/returnType/char.kt")
    test fun returnType_double() = doTest("tests/testData/integration/returnType/double.kt")
    test fun returnType_float() = doTest("tests/testData/integration/returnType/float.kt")
    test fun returnType_int() = doTest("tests/testData/integration/returnType/int.kt")
    test fun returnType_long() = doTest("tests/testData/integration/returnType/long.kt")
    test fun returnType_nsstring() = doTest("tests/testData/integration/returnType/nsstring.kt")
    test fun returnType_objcObject() = doTest("tests/testData/integration/returnType/objcObject.kt")
    test fun returnType_objcObjectIsCheck() = doTest("tests/testData/integration/returnType/objcObjectIsCheck.kt")
    test fun returnType_short() = doTest("tests/testData/integration/returnType/short.kt")
    test fun simpleClass() = doTest("tests/testData/integration/simpleClass.kt")
    test fun simpleClassObject() = doTest("tests/testData/integration/simpleClassObject.kt")
}
