#include<iostream>
using namespace std;

struct node{
	int data;
	node* next;
};

node* create(int data)
{
	node* newnode=new node();
	newnode->data=data;
	newnode->next=NULL;
	return newnode;
}

void insert(node** head,int data)
{
	node* temp=*head;
	while(temp->next!=NULL)
	{
		temp=temp->next;
	}
	node* newnode=create(data);
	temp->next=newnode;
}

void print(node* head)
{
	while(head!=NULL)
	{
		cout<<head->data<<" ";
		head=head->next;
	}
	cout<<endl;
}

void reverseprint(node* head)
{
	if(head==NULL)
	{
		return;
	}
	reverseprint(head->next);
	cout<<head->data<<endl;
}

void reverselist(node** head,node* p)
{
	if(p->next==NULL)
	{
		*head=p;
		return;
	}
	reverselist(head,p->next);
	node* q=p->next;
	q->next=p;
	p->next=NULL;
}

int main(){
	
	node* head=NULL;
	head=create(1);
	insert(&head,2);
	insert(&head,3);
	insert(&head,4);
	insert(&head,5);
	print(head);
	reverselist(&head,head);
	print(head);
	reverseprint(head);
	return 0;
}
