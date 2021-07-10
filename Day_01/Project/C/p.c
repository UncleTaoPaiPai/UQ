#include <stdio.h>

char * my_strcat(char* a, char* b) {

    char * temp = a;
    while(*temp != '\0') {
        temp++;
    }
    while(*b != '\0') {
        *temp = *b;
        temp++;
        b++;
    }
    *temp = '\0';
    return a;

}



int main() {

    char a[] = "hello ";
    char b[] = "world";

    printf("%s\n",my_strcat(a,b));

    return 0;
}
