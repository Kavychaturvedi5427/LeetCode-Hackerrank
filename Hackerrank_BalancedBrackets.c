#include <stdio.h>
#include <stdlib.h>
#define size 20
int top = -1;
char Stack[size];

void push(char data)
{
    if (top == size - 1)
    {
        printf("Stack overflow.");
        return;
    }
    top++;
    Stack[top] = data;
    return;
}

char pop()
{
    if (top == -1)
    {
        printf("Stack underflow");
        return 'N';
    }
    char data = Stack[top];
    top--;
    return data;
}

void isFull()
{
    if (top == size - 1)
    {
        printf("The stack is full");
        return;
    }
}

void isEmpty()
{
    if (top == -1)
    {
        printf("The stack is Empty");
        return;
    }
}

void PrintArray(char arr[], int n)
{
    printf("The array is -->");
    for (int i = 0; i < n; i++)
    {
        printf("%c , ", arr[i]);
    }
    return;
}

int check_pairs(char val1, char val2)
{
    if (val1 == '(' && val2 == ')')
    {
        return 1;
    }
    else if (val1 == '{' && val2 == '}')
    {
        return 1;
    }
    else if (val1 == '[' && val2 == ']')
    {
        return 1;
    }
    return 0;
}

void check_balanced(char arr[], int n)
{
    char popped;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')  // if the current element in the array is of openning type then push it into the stack.....
        {
            push(arr[i]);       
        }
        else if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']')       // if the brackets is of closing type then -->
        {
            popped = pop();                                             // pop out the top element in the stack .....
            int op = check_pairs(popped,arr[i]);                        // check if both the elements are in paris or not .....
            if(op!=1){  
                printf("Not balanced");                                 // if the pairs didn't match then it is not balanced....
                return ;
            }
        }
    }
    printf("Balanced.");                                                // if all the pairs matches then it is balanced....
    return;
}

    int main()
    {
        int n;

        // taking input of the number of brackets in the array we're going to check....
        printf("Enter number of elements you want -->");
        scanf("%d", &n);
        char brackets_arr[n];
        printf("Enter the elements in the array -->");

        // taking input of the array ....
        for (int i = 0; i < n; i++)
        {
            fflush(stdin);
            scanf("%c", &brackets_arr[i]);
        }
        PrintArray(brackets_arr, n);                        // function for printing the array ...
        check_balanced(brackets_arr,n);                     // to check whether the array is balanced or not ....
        return 0;
    }
