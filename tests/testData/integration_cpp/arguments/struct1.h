
#ifndef kni_test_integration_arguments_struct1_h
#define kni_test_integration_arguments_struct1_h

#ifdef __cplusplus
extern "C" {
#endif

struct abcd {
    int i;
    bool b;
    float f;
    long l;
};

int getabcdsize();

int getfromabcd(abcd * s);

long long getabcdaddr(abcd * s);

int setabcdi(abcd * s, int i);

int setabcdl(abcd * s, long l);

#ifdef __cplusplus
}
#endif

#endif // kni_test_integration_arguments_struct1_h
