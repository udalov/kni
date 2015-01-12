# ----------------------------------------------------------------------------
#  KNI Indexer Makefile
#
#  Usages:
#
#  1. make clean
#     Remove previously compiled files
#
#  2. make
#     Compile everything and link to dist/build/indexer/native/libKNIIndexer.dylib
#
#  3. make test
#     Compile, link to .dylib and run tests
#
# ----------------------------------------------------------------------------



# ----------------------------------------------------------------------------
#  Variables
# ----------------------------------------------------------------------------

BASEDIR=../..

JAVA_HOME=$(shell /usr/libexec/java_home)
JAVA_INCLUDE=-I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/darwin

# libclang.dylib should be installed via Homebrew:
# brew install llvm --with-clang
# TODO: untie dependency on Homebrew
CLANG_LIB=/usr/local/Cellar/llvm/3.5.0/lib
CLANG_INCLUDE=$(BASEDIR)/lib

PROTOBUF_LIB=$(BASEDIR)/lib/protobuf/lib
PROTOBUF_INCLUDE=$(BASEDIR)/lib/protobuf/include

CXX=c++
CXXFLAGS=-O2 -Wall -std=c++11 $(JAVA_INCLUDE) -I$(CLANG_INCLUDE) -I$(PROTOBUF_INCLUDE) -stdlib=libc++
LDFLAGS=-Wl,-rpath,$(CLANG_LIB) -L$(CLANG_LIB) -lclang -L$(PROTOBUF_LIB) -lprotobuf

SRC_FILES=$(wildcard *.cc)
OBJ_FILES=$(patsubst %.cc,$(OUT)/%.o,$(SRC_FILES))
OUT=$(BASEDIR)/dist/build/indexer/native
DYLIB=$(OUT)/libKNIIndexer.dylib

TEST_FILES=$(wildcard tests/*.cc)
TEST_EXE=$(OUT)/tests


# ----------------------------------------------------------------------------
#  Targets
# ----------------------------------------------------------------------------

.PHONY: all mkdir dylib clean test


all: mkdir dylib

mkdir:
	@mkdir -p $(OUT)

dylib: $(OBJ_FILES)
	$(CXX) $(LDFLAGS) -dynamiclib -o $(DYLIB) $^

$(OUT)/%.o: %.cc
	$(CXX) $(CXXFLAGS) -c $^ -o $@



clean:
	@rm -rf $(OUT)



test: mkdir dylib
	$(CXX) $(CXXFLAGS) $(LDFLAGS) -I. -L$(OUT) -lKNIIndexer $(TEST_FILES) -o $(TEST_EXE)
	$(TEST_EXE)
