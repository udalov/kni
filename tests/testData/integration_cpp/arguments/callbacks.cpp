
#include "callbacks.hpp"

int callfn1(int (*cb)(int))
{
    return cb ? cb(42) : -1;
}

int callfn2(int (*cb)(int,const char*))
{
    return cb ? cb(42, "42") : -1;
}

int callwrapper(cbwrapper * w)
{
    return w ? callfn1(w->cb1) + callfn2(w->cb2) : -1;
}
