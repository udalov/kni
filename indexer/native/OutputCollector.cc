
#include <fstream>

#include "asserts.h"
#include "OutputCollector.h"

std::string OutputCollector::serialize() {
    std::string result;
    m_result.SerializeToString(&result);
    return result;
}

namespace {
    template<typename T> void saveByUSR(std::map<std::string, T *>& map, const std::string& usr, T *t) {
        assertTrue(map.find(usr) == map.end());
        map[usr] = t;
    }

    template<typename T> T *loadByUSR(const std::map<std::string, T *>& map, const std::string& usr) {
        auto it = map.find(usr);
        if (it == map.end()) return nullptr;
        auto found = it->second;
        assertNotNull(found);
        return found;
    }

    template<typename T> bool checkByUSR(const std::map<std::string, T *>& map, const std::string& usr) {
        return (map.find(usr) != map.end());
    }
}

void OutputCollector::ObjCData::saveClassByUSR(const std::__1::string &usr, ObjCClass *clazz) {
    saveByUSR(m_classes, usr, clazz);
}

void OutputCollector::ObjCData::saveProtocolByUSR(const std::__1::string& usr, ObjCProtocol *protocol) {
    saveByUSR(m_protocols, usr, protocol);
}

void OutputCollector::ObjCData::saveCategoryByUSR(const std::__1::string &usr, ObjCCategory *category) {
    saveByUSR(m_categories, usr, category);
}

ObjCClass *OutputCollector::ObjCData::loadClassByUSR(const std::__1::string& usr) const {
    return loadByUSR(m_classes, usr);
}

ObjCProtocol *OutputCollector::ObjCData::loadProtocolByUSR(const std::__1::string& usr) const {
    return loadByUSR(m_protocols, usr);
}

ObjCCategory *OutputCollector::ObjCData::loadCategoryByUSR(const std::__1::string& usr) const {
    return loadByUSR(m_categories, usr);
}

bool OutputCollector::ObjCData::anyCategoryByUSR(const std::__1::string& usr) const {
    return  checkByUSR(m_classes, usr) ||
            checkByUSR(m_protocols, usr) ||
            checkByUSR(m_categories, usr);
}

void OutputCollector::ObjCData::saveForwardDeclaredClass(const std::__1::string& usr, const std::__1::string& name) {
    m_forwardClasses.insert(make_pair(usr, name));
}

void OutputCollector::ObjCData::saveForwardDeclaredProtocol(const std::__1::string& usr, const std::__1::string& name) {
    m_forwardProtocols.insert(make_pair(usr, name));
}

const std::__1::set<std::__1::pair<std::__1::string, std::__1::string>>&OutputCollector::ObjCData::loadForwardDeclaredClasses() const {
    return m_forwardClasses;
}

const std::__1::set<std::__1::pair<std::__1::string, std::__1::string>>&OutputCollector::ObjCData::loadForwardDeclaredProtocols() const {
    return m_forwardProtocols;
}