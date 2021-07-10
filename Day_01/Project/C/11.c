#include <stdio.h>


void hello() {

    printf("Hello World\n");
}

int area(int length, int width) {

    return length * width;

}

int main() {

    hello();
    printf("%d\n",area(1,6));
    return 0;

}
