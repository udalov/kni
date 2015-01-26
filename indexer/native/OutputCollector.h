#pragma once

#include <map>
#include <set>
#include <string>

#include "NativeIndex.pb.h"

struct ProcessingMode {
    typedef enum { unknown, c, cpp, objc } type;
};

class OutputCollector {
    public:

        class ObjCData {
            std::map<std::string, ObjCClass *> m_classes;
            std::map<std::string, ObjCProtocol *> m_protocols;
            std::map<std::string, ObjCCategory *> m_categories;
            std::set<std::pair<std::string, std::string>> m_forwardClasses;
            std::set<std::pair<std::string, std::string>> m_forwardProtocols;
        public:
            void saveClassByUSR(const std::string &usr, ObjCClass *clazz);
            void saveProtocolByUSR(const std::string& usr, ObjCProtocol *protocol);
            void saveCategoryByUSR(const std::string &usr, ObjCCategory *category);

            ObjCClass *loadClassByUSR(const std::string& usr) const;
            ObjCProtocol *loadProtocolByUSR(const std::string& usr) const;
            ObjCCategory *loadCategoryByUSR(const std::string& usr) const;

            bool anyCategoryByUSR(std::string const &usr) const;
            void saveForwardDeclaredClass(const std::string& usr, const std::string& name);
            void saveForwardDeclaredProtocol(const std::string& usr, const std::string& name);

            // TODO: get rid of std::pair here, invent something better
            const std::set<std::pair<std::string, std::string>>& loadForwardDeclaredClasses() const;
            const std::set<std::pair<std::string, std::string>>& loadForwardDeclaredProtocols() const;
        };

        class CData {
        public:
            std::map<std::string, CStruct *> structs;
            std::set<std::pair<std::string, std::string>> forwardStructs;
        };

        ObjCData objc;
        CData c;

        TranslationUnit& result() { return m_result; }

        // Transfers ownership of the returned string to the caller
        std::string *serialize();

        ProcessingMode::type mode() const { return m_mode; }

        OutputCollector(ProcessingMode::type mode): m_mode(mode) { assertFalse(mode == ProcessingMode::unknown); }
private:
        ProcessingMode::type m_mode;
        TranslationUnit m_result;
};
