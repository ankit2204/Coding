#include<iostream>
using namespace std;

struct queue{
    int front,rear,size;
    unsigned capacity;
    int *array;
};

queue *create(unsigned capacity)
{
    queue *node=new queue();
    node->capacity=capacity;
    node->front=0;
    node->rear=-1;
    node->size=0;
    node->array=(int*)malloc(node->capacity*sizeof(int));
    return node;
}

bool isFull(queue *q)
{
    if(q->size==q->capacity)
    {
        return true;
    }
    return false;
}

void enqueue(queue *q,int item)
{
    if(isFull(q))
    {
        return;
    }
    q->rear=q->rear+1;
    q->array[q->rear]=item;
    q->size=q->size+1;
    cout<<item<<"inserted"<<endl;
}

bool isEmpty(queue *q)
{
    if(q->size==0)
    {
        return true;
    }
    return false;
}

int dequeue(queue *q)
{
    if(isEmpty(q))
    {
        return -1;
    }
    int r=q->array[q->front];
    q->front=q->front+1;
    q->size=q->size-1;
    return r;
}                                

int main(){
    unsigned capacity=5;
    queue *q=create(capacity);
    
    enqueue(q,1);
    enqueue(q,3);
  
    cout<<dequeue(q)<<endl;
    cout<<dequeue(q)<<endl;
    
      
    system("pause");
    return 0;
}    
    


        
    
