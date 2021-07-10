#include <stdio.h>

#define NAME "tony"


typedef struct {

    char num[20];
    char name[10];

} Student;


typedef struct tagNode{

    Student stu;
    struct tagNode *pNext;
} Node;

Node *head = NULL;

void addNode(Node *node){
    node->pNext = NULL;
    if(head == NULL) {
        head = node;
    }else{

    }

}

int main() {

    printf("%s\n",NAME);
    return 0;

}
