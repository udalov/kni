int i;
char ch;
char* str;
void* ptr;

typedef struct UndefinedStructImpl UndefinedStruct;

typedef struct St {
    int j;
    bool b;
    char** p_str;
} Struct;

struct S1 {
    int x;
    float y;
};

int int_arr[100];


void foo();
void bar(int arg);
int baz(St by_value, St* by_reference);
void* quux(Struct, Struct*, UndefinedStruct, UndefinedStruct*);

typedef int (Foo)();
typedef char* (Bar)(int k, int*);

