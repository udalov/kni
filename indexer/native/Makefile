# ----------------------------------------------------------------------------
#  KNI Indexer Makefile
#
#  Usages:
#
#  1. make clean
#     Remove previously compiled files (out/ directory)
#
#  2. make proto
#     Launch Protocol Buffers compiler to generate C++ and Java classes
#
#  3. make
#     Compile everything and link to out/libKNIIndexer.dylib
#
#  4. make test
#     Compile (linking to the .dylib) and run tests
#
#  5. make javah
#     Launch javah on the compiled IndexerNative class (found in out/)
#     to produce a C header Indexer.h
#
# ----------------------------------------------------------------------------



# ----------------------------------------------------------------------------
#  Variables
# ----------------------------------------------------------------------------

PROJECT_NAME=KNIIndexer

JAVA_HOME=$(shell /usr/libexec/java_home)
JAVA_INCLUDE=-I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/darwin

CXX=c++
CXXFLAGS=-O2 -Wall -std=c++0x $(JAVA_INCLUDE) -I../../dependencies -stdlib=libc++
# libclang.dylib and libprotobuf.dylib should be installed via Homebrew:
# brew install llvm --with-clang
# brew switch llvm 3.5.0
# brew install protobuf
# brew switch protobuf 2.6.0
# TODO: untie dependency on Homebrew
LDFLAGS=-Wl,-rpath,/usr/local/Cellar/llvm/3.5.0/lib -L/usr/local/Cellar/llvm/3.5.0/lib -L/usr/local/Cellar/protobuf/2.6.0/lib -lclang -lprotobuf

SRC_FILES=$(wildcard *.cc)
OBJ_FILES=$(patsubst %.cc,$(OUT)/%.o,$(SRC_FILES))
OUT=out
DYLIB=$(OUT)/lib$(PROJECT_NAME).dylib

TEST_FILES=$(wildcard tests/*.cc)
TEST_EXE=$(OUT)/tests


# ----------------------------------------------------------------------------
#  Targets
# ----------------------------------------------------------------------------

.PHONY: all proto mkdir dylib javah clean test


all: proto mkdir dylib

proto:
	@make -C proto all

mkdir:
	@mkdir -p $(OUT)

dylib: $(OBJ_FILES)
	$(CXX) $(LDFLAGS) -dynamiclib -o $(DYLIB) $^

javah:
	@javah -classpath ../../out/production/indexer -o Indexer.h org.jetbrains.kni.indexer.IndexerNative

$(OUT)/%.o: %.cc
	$(CXX) $(CXXFLAGS) -c $^ -o $@



clean:
	@rm -rf $(OUT)



test: mkdir dylib
	$(CXX) $(CXXFLAGS) $(LDFLAGS) -I. -L$(OUT) -l$(PROJECT_NAME) $(TEST_FILES) -o $(TEST_EXE)
	$(TEST_EXE)
