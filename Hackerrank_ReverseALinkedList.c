#include <stdio.h>
#include <stdlib.h>

typedef struct LinkedList
{
    int val;
    struct LinkedList *next;
} node;

node *createnode(int data)
{
    node *newnode = (node *)malloc(sizeof(node));
    if (newnode == NULL)
    {
        printf("Node can't be created.");
        return NULL;
    }
    newnode->val = data;
    newnode->next = NULL;
    return newnode;
}

void displayList(node *head)
{
    if (head == NULL)
    {
        printf("Linked List is empty.");
        return;
    }
    node *temp = head;
    while (temp != NULL)
    {
        printf("%d --> ", temp->val);
        temp = temp->next;
    }
    printf("NULL");
}

node *reverseList(node *head)
{
    if (head == NULL)
    {
        printf("The linked list is empty.");
        return NULL;
    }
    node *current = head, *prev = NULL, *next = NULL;
    while (current != NULL)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    return prev;
}

int main()
{
    node *start = NULL, *newnode = NULL, *forward = NULL;
    int n;
    printf("Enter the number of nodes you want to create -->");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        int data;
        printf("Enter the value that you want to place into the Node-->");
        scanf("%d", &data);
        node *newnode = createnode(data);
        if (start == NULL)
        {
            start = newnode;
        }
        else
        {
            forward->next = newnode;
        }
        forward = newnode;
    }
    displayList(start);
    printf("\n");
    displayList(reverseList(start));
    return 0;
}