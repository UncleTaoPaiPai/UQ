#include <stdio.h>
#include <string.h>

int main(){

    char a[] = {"sjfhsdfjshdfj"};
    int num = sizeof(a) / sizeof(char);
    int num1 = strlen(a);
    //printf("%d\n",num);
    //printf("%d\n",num1);

    char b[100];
    strncpy(b,a,5);
    printf("%s\n",b);

    char i[] = {"I "};
    char y[] = {"Love You"};
    printf("%s\n",strcat(i,y));

    char u[] =


    return 0;


}
