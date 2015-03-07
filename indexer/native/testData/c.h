int i;
char ch;
char* str;
void* ptr;

#ifdef __cplusplus
extern "C" {
#endif

typedef struct UndefinedStructImpl UndefinedStruct;

typedef struct {
    int j;
    char** p_str;
} Struct;

struct S1 {
    int x;
    float y;
};

int int_arr[100];


void foo();
void bar(int arg);
int baz(Struct by_value, Struct* by_reference);
void* quux(Struct, Struct*, UndefinedStruct, UndefinedStruct*);
int callfn1(int (*cb)(int,char*));

typedef int (Foo)();
typedef char* (Bar)(int k, int*);

#ifdef __cplusplus
}
#endif
