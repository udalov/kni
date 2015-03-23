
#include <iostream>
#include <boost/range/adaptors.hpp>
#include <boost/range/algorithm.hpp>
#include "Indexer.hh"
#include "NativeIndex.pb.h"

int main(int argc, char *argv[]) {

    if (argc < 2)
        std::cout << "Usage: kniidx <c/c++ file> <-ObjC|-c++> [options...]" << std::endl;
    else {
        TranslationUnit tu;
        auto vargs = std::vector<std::string>();
        for (int i = 1; i < argc; ++i) vargs.push_back(argv[i]);
        auto message = doIndexToString(vargs);
        tu.ParseFromString(message);

        std::cout << tu.DebugString() << std::endl;
    }
}
