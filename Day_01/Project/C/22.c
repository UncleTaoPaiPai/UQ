#include <stdio.h>


int main() {

    FILE *fp;
    fp = fopen("C:\\Users\\Yongzhi\\Desktop\\hh.txt","r+");

    //char *str;
    //fgets(str,255,fp);
    //printf("%s",str);

    fputs("cjkchjkchjdf",fp);
    return 0;

}
