#pragma once

#include <string.h>

#include "clang-c/Index.h"

class AutoCXString {
    public:
        /* implicit */ AutoCXString(const CXString& source): m_cxString(source) {}

        ~AutoCXString() { clang_disposeString(m_cxString); }

        const char* str() const { return clang_getCString(m_cxString); }

        bool empty() const {
            auto chars = str();
            return !chars || strlen(chars) == 0;
        }

    private:
        CXString m_cxString;
};


//class AutoCXString {
//public:
//    /* implicit */ AutoCXString(const CXString& source):
//            m_string(clang_getCString(source))
//    {
//        clang_disposeString(source);
//    }
//
//    const std::string& str() const { return m_string; }
//
//private:
//    const std::string m_string;
//};
