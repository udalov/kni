cmake_minimum_required(VERSION 2.8.4)
project(native)

find_package(Java REQUIRED COMPONENTS Runtime Development)
find_package(JNI REQUIRED)
find_package(Boost 1.56.0 COMPONENTS system filesystem unit_test_framework)
include(UseJava)

message (STATUS "JNI_INCLUDE_DIRS=${JNI_INCLUDE_DIRS}")
message (STATUS "JNI_LIBRARIES=${JNI_LIBRARIES}")

include_directories(".")
include_directories(${JNI_INCLUDE_DIRS})
include_directories("/usr/local/include")
include_directories("../../lib")
include_directories("../../lib/protobuf/include")
link_directories("/usr/local/lib")
link_directories("/usr/local/Cellar/llvm/3.5.0/lib")
#link_directories("/Users/lige/Work/clang/build/Debug+Asserts/lib")
link_directories("../../lib")
link_directories("../../lib/protobuf/lib")

set(CMAKE_RUNTIME_OUTPUT_DIRECTORY "${CMAKE_CURRENT_SOURCE_DIR}/out")

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

add_library(libKNIIndexer SHARED ${INDEXER_SOURCE_FILES})
target_link_libraries(libKNIIndexer clang protobuf)

add_executable(tests ${INDEXER_SOURCE_FILES} ${TESTS_SOURCE_FILES})
target_link_libraries(tests clang protobuf)

add_executable(boost_tests ${INDEXER_SOURCE_FILES} ${BOOST_TESTS_SOURCE_FILES})
target_link_libraries(boost_tests ${Boost_FILESYSTEM_LIBRARY}
                                  ${Boost_SYSTEM_LIBRARY}
                                  clang
                                  protobuf)

