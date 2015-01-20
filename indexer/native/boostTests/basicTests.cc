
#define BOOST_TEST_MAIN
#define BOOST_TEST_MODULE indexer_basics
#include <boost/test/included/unit_test.hpp>

#include "Indexer.hh"
#include "NativeIndex.pb.h"
#include <boost/filesystem/path.hpp>
#include <boost/filesystem/operations.hpp>
#include <boost/filesystem/fstream.hpp>
#include <boost/function_output_iterator.hpp>
#include <memory>

namespace fs = boost::filesystem;

namespace detail {
    class line {
        std::string data;
    public:
        friend std::istream &operator>>(std::istream &is, line &l) {
            std::getline(is, l.data);
            return is;
        }

        operator std::string() const {
            return data;
        }

        friend bool operator !=(const line& left, const line& right) {
            return left.data != right.data;
        }

        friend std::ostream &operator<<(std::ostream &os, const line& l) {
            return os << l;
        }
    };
}

void indexAndCompare(const fs::path& file) {

    BOOST_MESSAGE( file);

    fs::path expectedFile = file;
    expectedFile.replace_extension("out");

    BOOST_REQUIRE_MESSAGE(fs::exists(expectedFile), "File not found: " << expectedFile);

    TranslationUnit tu;
    {
        std::shared_ptr<std::string> message( doIndex( std::vector<std::string>(1, file.string())));
        tu.ParseFromString(*message);
    }

    std::istringstream actualStream(tu.DebugString());
    fs::ifstream expectedStream(expectedFile);

    typedef std::istream_iterator<detail::line> line_iterator;

    auto actualBegin = line_iterator(actualStream);
    auto actualEnd = line_iterator();
    auto expectedBegin = line_iterator(expectedStream);
    auto expectedEnd = line_iterator();

    BOOST_CHECK_EQUAL_COLLECTIONS(actualBegin, actualEnd, expectedBegin, expectedEnd);
}


BOOST_AUTO_TEST_CASE( indexer_basic)
{
    indexAndCompare("testData/c.h");
}
