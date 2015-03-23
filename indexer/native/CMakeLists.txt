cmake_minimum_required(VERSION 2.8.8)
project(native)

# todo - make cross-platform (should work without these defines on llvm-native platforms, but with brew the llvm/cmake integration dir is unknown to cmake)
set(LLVM_INSTALL_PREFIX "/usr/local/opt/llvm")
set(LLVM_DIR "${LLVM_INSTALL_PREFIX}/share/llvm/cmake/")

find_package(Java REQUIRED COMPONENTS Runtime Development)
find_package(JNI REQUIRED)
find_package(Boost 1.56.0 COMPONENTS system filesystem unit_test_framework)
find_package(Protobuf REQUIRED)
find_package(LLVM 3.5 REQUIRED CONFIG)

message(STATUS "Found LLVM ${LLVM_PACKAGE_VERSION} ")
find_library(libclang_lib clang "${LLVM_LIBRARY_DIRS}")
if ("${libclang_lib}" STREQUAL "libclang_lib-NOTFOUND")
    message(FATAL_ERROR "libclang not found, please check search paths or reinstall llvm with '--with-clang' flag")
endif()
message(STATUS "Using libclang: ${libclang_lib}")
# message(STATUS "Using LLVMConfig.cmake in: ${LLVM_DIR}")
# message(STATUS "LLVM/libCLang vars: '${LLVM_INCLUDE_DIRS}' '${LLVM_LIBRARY_DIRS}'")

include(UseJava)

message (STATUS "JNI_INCLUDE_DIRS=${JNI_INCLUDE_DIRS}")
message (STATUS "JNI_LIBRARIES=${JNI_LIBRARIES}")

include_directories(".")
include_directories(${JNI_INCLUDE_DIRS})
include_directories(${PROTOBUF_INCLUDE_DIR})
include_directories(${LLVM_INCLUDE_DIRS})
link_directories(${LLVM_LIBRARY_DIRS})

set(BASE_DIR "${CMAKE_CURRENT_SOURCE_DIR}/../..")
set(DIST_OUT_DIR "${BASE_DIR}/dist/build/indexer/native")
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY "${CMAKE_CURRENT_SOURCE_DIR}/out")
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY "${DIST_OUT_DIR}")

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -stdlib=libc++")

set(TESTDATA_SOURCE_FILES
    testData/objc/types/functionTypes.h
    testData/objc/types/objcPointers.h
    testData/objc/types/pointers.h
    testData/objc/types/primitives.h
    testData/objc/types/protocol.h
    testData/objc/types/typedef.h
    testData/objc/categories.h
    testData/objc/classes.h
    testData/objc/forwardClass.h
    testData/objc/forwardProtocol.h
    testData/objc/protocols.h
    testData/c.h)

set(TESTS_SOURCE_FILES
    tests/test.cc)

set(BOOST_TESTS_SOURCE_FILES
    boostTests/basicTests.cc)

set(INDEXER_SOURCE_FILES
    asserts.h
    AutoCXString.h
    Indexer.cc
    Indexer.h
    NativeIndex.pb.cc
    NativeIndex.pb.h
    OutputCollector.cc
    OutputCollector.h)

add_library(KNIIndexer SHARED ${INDEXER_SOURCE_FILES})
target_link_libraries(KNIIndexer clang ${PROTOBUF_LIBRARY})

add_executable(kniidx ${INDEXER_SOURCE_FILES} kniidx.cc)
target_link_libraries(kniidx ${libclang_lib} ${PROTOBUF_LIBRARY})

add_executable(tests ${INDEXER_SOURCE_FILES} ${TESTS_SOURCE_FILES})
target_link_libraries(tests ${libclang_lib} ${PROTOBUF_LIBRARY})

add_executable(boost_tests ${INDEXER_SOURCE_FILES} ${BOOST_TESTS_SOURCE_FILES})
target_link_libraries(boost_tests ${Boost_FILESYSTEM_LIBRARY}
                                  ${Boost_SYSTEM_LIBRARY}
                                  ${libclang_lib}
                                  ${PROTOBUF_LIBRARY})

