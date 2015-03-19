#import "long.h"
#import <stdio.h>

@implementation A
+ (void) foo: (long long) arg {
    if (arg == 123456789123456789L)
        printf("OK");
    else
        printf("Fail %lld", arg);
}
@end
