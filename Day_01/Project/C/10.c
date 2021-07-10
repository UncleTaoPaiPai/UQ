#include <stdio.h>

int main() {


    int a[3][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    for(int i =0;i<3;i++){
        for(int x =0; x<4;x++){
            printf("%d\n",a[i][x]);
        }
    }
    return 0;

}
