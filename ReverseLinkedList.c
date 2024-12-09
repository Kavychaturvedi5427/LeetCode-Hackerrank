#include <stdio.h>
#include <stdlib.h>

typedef struct LinkedList{
    int data;
    struct LinkedList * next;
}node;

node * CreateNode(int data){
    node * newnode=(node *)malloc(sizeof(node));
    newnode->data=data;
    newnode->next=NULL;
    return newnode;
}

int main(){
    int n;
    printf("Enter the number of nodes you want to create -->");
    scanf("%d",&n);
    node *head=NULL,node;
    for(int i=1;i<=n;i++){
        int data;
        printf("Enter data-->");
        scanf("%d",&data);
        if(head ==NULL){
            
        }
    }
    return 0;
}


// def decentNumber(n):
//     for i in range(n + 1):
//         if (n - i) % 3 == 0 and i % 5 == 0:
//             print('5' * (n - i) + '3' * i)
//             return
//     print(-1)
