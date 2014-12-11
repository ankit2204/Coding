#include <iostream>
using namespace std;

struct stacknode{
int data;
stacknode* next;
};

stacknode* createnode(int data)
{
    stacknode *newnode=new stacknode();
    newnode->data=data;
    newnode->next=NULL;
    return newnode;
}

void push(stacknode** root,int data)
{
    stacknode* newnode=createnode(data);
    newnode->next=*root;
    *root=newnode;
    cout<<"item pushed into the stack"<<endl;
}

int isEmpty(stacknode *root)
{
    if(root->data!=NULL)
    {
        return 0;
    }
    return 1;    
}

int pop(stacknode** root)
{
    
    if(isEmpty(*root))
    {
        return -1;
    }   
    stacknode *temp=*root;
    *root=temp->next;
    return temp->data;
    free(temp);
}    
int main(){
    stacknode* root=createnode(NULL);
    
    push(&root,5);
    push(&root,3);
    push(&root,23);
    
    int x=pop(&root);
    int y=pop(&root);
    int z=pop(&root);
    int a=pop(&root);
    cout<<x<<" "<<"popped out"<<endl;
    cout<<y<<" "<<"popped out"<<endl;
    cout<<z<<" "<<"popped out"<<endl;
    cout<<a<<" "<<"popped out"<<endl;
    system("pause");
    return 0;
}    
    
    
