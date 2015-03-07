
#include "callbacks.hpp"

int callfn1(int (*cb)(int))
{
    return cb(42);
}

int callfn2(int (*cb)(int,const char*))
{
    return cb(42, "42");
}

