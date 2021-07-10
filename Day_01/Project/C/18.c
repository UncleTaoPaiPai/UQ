#include <stdio.h>


struct student {

    char name[10];
    char gender[5];
    int age;

};

union student1 {

    char name[10];
    char gender[5];
    int age;

};


int main() {

    union student1 stu;
    strcpy(stu.name,"Tony");
    printf("%s\n",stu.name);
    strcpy(stu.gender,"male");
    printf("%s\n",stu.gender);
    stu.age = 23;
    printf("%d\n",stu.age);

    union student1 *tony = &stu;




    //printf("%s\n",tony->name);
    //printf("%s\n",tony->gender);
    //printf("%d\n",tony->age);
    return 0;
}
