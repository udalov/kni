
#include "struct1.h"

int getabcdsize()
{
    return sizeof(abcd);
}

int getfromabcd(abcd * s)
{
    return s->i;
}

long long getabcdaddr(abcd * s)
{
    return (long long)s;
}

int setabcdi(abcd * s, int i)
{
    int prev = s->i;
    s->i = i;
    return prev;
}

int setabcdl(abcd * s, long l)
{
    long prev = s->l;
    s->l = l;
    return prev;
}

