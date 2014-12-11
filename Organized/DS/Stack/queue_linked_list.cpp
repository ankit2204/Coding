#include<iostream>
using namespace std;

struct qnode{
	int key;
	qnode* next;
};

struct queue{
	qnode* front;
    qnode* rear;
};

queue* create()
{
	queue* q=new queue();
	q->front=NULL;
	q->rear=NULL;
	return q;
}

qnode* createnode(int key)
{
	qnode* newnode=new qnode();
	newnode->key=key;
	newnode->next=NULL;
	return newnode;
}

void enqueue(queue* q,int key)
{
	if(q->front==NULL)
	{
	   qnode* newnode=createnode(key);
	   q->front=newnode;
	   q->rear=newnode;
	   return;
	}
	qnode* newnode=createnode(key);
	q->rear->next=newnode;
	q->rear=newnode;
}

int dequeue(queue* q)
{
	if(q->front==NULL)
	{
	   return -1;
	}
	qnode* temp=q->front;
	q->front=q->front->next;
	return temp->key;
}

int main(){

queue* q=create();

enqueue(q,3);
enqueue(q,4);
enqueue(q,1);
enqueue(q,6);
enqueue(q,8);

cout<<dequeue(q)<<endl;
cout<<dequeue(q)<<endl;
cout<<dequeue(q)<<endl;
cout<<dequeue(q)<<endl;
cout<<dequeue(q)<<endl;

cout<<dequeue(q)<<endl;
cout<<dequeue(q)<<endl;

system("pause");
return 0;
	
 }
