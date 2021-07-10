#include <stdio.h>

int main() {

    int a[5] = {1,2,3,4};

    int *p[5];
    for(int i =0; i<5;i++) {
        p[i] = &a[i];
    }
    for(int x =0;x<5;x++) {
        printf("%d\n",*p[x]);
    }
    return 0;
}
