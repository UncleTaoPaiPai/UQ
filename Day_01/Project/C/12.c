#include <stdio.h>

void buy() {

    printf("菜买好了\n");
}

void wash() {
    printf("把菜洗好了\n");
}

void cook() {
    printf("菜做好了\n");
}

void hh(int x) {
    if(x == 5) {
        return x;
    }
    printf("%d\n",x);
    hh(x+1);
}



int main() {
    hh(1);
    return 0;
}
