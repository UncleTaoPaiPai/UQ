#include <stdio.h>

char* buy(char* food ) {

    char *foods =food;
    return foods;
}

void wash(char* food){
    printf("??%sϴ?ɾ???\n",food);
}

int main() {
    char hhh[] = "eggs";
    char * hh = buy(hhh);
    wash(hh);
    return 0;
}

