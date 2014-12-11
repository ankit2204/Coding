#include <iostream>
#include <cmath>

using namespace std;

struct tree{
	int data;
	tree* left;
	tree* right;
}; 

tree* create(int data)
{
	tree* node=new tree();
	node->data=data;
	node->left=NULL;
	node->right=NULL;
	return node;
}

void inorder(tree* root)
{
	if(root==NULL)
	{
		return;
	}
	
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
}

void preorder(tree* root)
{
	if(root==NULL)
	{
		return;
	}
	
	cout<<root->data<<" ";
	preorder(root->left);
	preorder(root->right);
}

void postorder(tree* root)
{
	if(root==NULL)
	{
		return;
	}
	
	postorder(root->left);
	postorder(root->right);
	cout<<root->data<<" ";
}

int height(tree* root)
{
	if(root==NULL)
	{
		return 0;
	}
	
	return 1+max(height(root->left),height(root->right));
}

int size(tree* root)
{
	if(root==NULL)
	{
		return 0;
	}
	return size(root->left)+1+size(root->right);
}

int maxelement(tree* root)
{
	int max=0,root_value,left,right;
	if(root==NULL)
	{
		return 0;
	}
	
	root_value=root->data;
	left=maxelement(root->left);
	right=maxelement(root->right);
	if(left>=right)
	{
		max=left;
	}
	else
	{
		max=right;
	}
	if(max<root_value)
	{
		max=root_value;	
	}
	
	return max;
}


int main(){
	tree* root=create(1);
    root->left=create(2);
    root->right=create(3);
    root->left->left=create(4);
    root->left->right=create(5); 
    root->right->left=create(8);
    
	cout<<height(root)<<endl;
	cout<<maxelement(root)<<endl; 
	cout<<size(root)<<endl;
	return 0;
}
