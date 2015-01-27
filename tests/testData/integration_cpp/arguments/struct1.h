
#ifndef kni_test_integration_arguments_struct1_h
#define kni_test_integration_arguments_struct1_h

#ifdef __cplusplus
extern "C" {
#endif

struct abcd {
    int i;
    bool b;
    float f;
};

int getfromabcd(abcd * s);

#ifdef __cplusplus
}
#endif

#endif // kni_test_integration_arguments_struct1_h
