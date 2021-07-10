#include <stdio.h>

int main() {



    enum week {
        Mon = 1,
        Tues,
        Wed,
        Thurs,
        Fri,
        Sat,
        Sun
    };

    int day =2;
    switch(day){
        case Mon:
            printf("Monday");
            break;
        case Tues:
            printf("Tuesday");
            break;
        case Wed:
            printf("Wednesday");
            break;
        case Thurs:
            printf("Thursday");
            break;
        case Fri:
            printf("Friday");
            break;
        case Sat:
            printf("Saturdat");
            break;
        case Sun:
            printf("Sunday");
            break;


    }

}
