
#include <iostream>
#include <google/protobuf/text_format.h>
#include <google/protobuf/io/zero_copy_stream_impl.h>
#include "Indexer.hh"
#include "NativeIndex.pb.h"

int main(int argc, char *argv[]) {

    if (argc < 2)
        std::cout << "Usage: kniidx <c/c++ file> <-ObjC|-c++> [options...]" << std::endl;
    else {
        TranslationUnit tu;
        auto vargs = std::vector<std::string>();
        bool bin_format = false;
        const std::string bin_fmt_key("---b");
        for (int i = 1; i < argc; ++i)
            if (bin_fmt_key == argv[i]) bin_format = true;
            else vargs.push_back(argv[i]);
        auto message = doIndexToString(vargs);
        tu.ParseFromString(message);

        if (bin_format)
            tu.SerializeToOstream(&std::cout);
        else
        {
            google::protobuf::io::OstreamOutputStream stream(&std::cout);
            google::protobuf::TextFormat::Print(tu, &stream);
            // seems the same, but we need explicit TextFormat to parse on the other side
//            std::cout << tu.DebugString() << std::endl;
        }
    }
}
