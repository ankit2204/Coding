#include<iostream>

using namespace std;

int main(){
	
	int n;
	cin>>n;
	int* a=new int[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	
	for(int i=1;i<n;++i)
	{
		int key=a[i];
		int j=i-1;
		
		while(j>=0 && a[j]>key)
		{
			a[j+1]=a[j];
			a[j]=key;
			j-=1;
		}
	}
	
	for(int i=0;i<n;i++)
	{
		cout<<a[i]<<" ";
	}
	
	delete(a);
	return 0;
}
