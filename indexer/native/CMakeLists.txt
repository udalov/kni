cmake_minimum_required(VERSION 2.8.4)
project(native)

find_package(Java REQUIRED COMPONENTS Runtime Development)
find_package(JNI REQUIRED)
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
link_directories("../../lib")
link_directories("../../lib/protobuf/lib")

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -stdlib=libc++")

set(SOURCE_FILES
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
    testData/c.h
    tests/test.cc
    asserts.h
    AutoCXString.h
    Indexer.cc
    Indexer.h
    NativeIndex.pb.cc
    NativeIndex.pb.h
    OutputCollector.cc
    OutputCollector.h)

add_executable(native ${SOURCE_FILES})
target_link_libraries(native clang protobuf)
