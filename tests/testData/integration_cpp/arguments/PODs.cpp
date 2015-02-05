
#include "PODs.hpp"
#include <cstring>

int ifathenbelsec(bool a, int b, int c)
{
    return a ? b : c;
}

int stringlen(char* s)
{
    return s ? strlen(s) : 0;
}
