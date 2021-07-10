#include <stdio.h>
int main() {

    int a = 100;
    int *p;
    p = &a;
    int **p1;
    p1 = &p;
    printf("%d\n",**p1);
    printf("%d\n",*p);
    return 0;


}
