#include<iostream>
using namespace std;

struct node{
	int key;
	node* left;
	node* right;
};

node* newnode(int data)
{
	node* temp=new node();
	temp->key=data;
	temp->left=NULL;
	temp->right=NULL;
	return temp;
}

void inorder(node *root)
{
    if (root != NULL)
    {
        inorder(root->left);
        printf("%d ", root->key);
        inorder(root->right);
    }
}

node* search(node* root,int key)
{
	if(root==NULL || root->key==key)
	{
		return root;
	}
	if(key<root->key)
	{
		return search(root->left,key);
	}
	else if(key>root->key)
	{
		return search(root->right,key);
	}

}

node* insert(node* root,int data)
{
	if(root==NULL)
	{
		return newnode(data);
	}
	if(data<root->key)
	{
		root->left=insert(root->left,data);
	}
	else if(data>root->key)
	{
		root->right=insert(root->right,data);
	}
	
	return root;
}

int treeMin(node* root)
{
	if(root->left==NULL)
	{
		return root->key ;
	}
	else
	{
		treeMin(root->left);
	}
}

int treeMax(node* root)
{
	if(root->right==NULL)
	{
		return root->key;
	}
	else
	{
		treeMax(root->right);
	}
}

/*node* delete(node* root,int key)
{
	if(root==NULL)
	{
		return root;
	}
	
	if(key<root->key)
	{
		root->left=delete(root->left,key);
	}
}
*/
int main(){
	
	node* root=newnode(50);
	 insert(root, 30);
	
    insert(root, 20);
     inorder(root);
	 cout<<endl;
    insert(root, 40);
     inorder(root);
	 cout<<endl;
    insert(root, 70);
     inorder(root);
	 cout<<endl;
    insert(root, 60);
     inorder(root);
	 cout<<endl;
    insert(root, 80);
    
    inorder(root);
    system("pause");
    return 0;
	 
}
