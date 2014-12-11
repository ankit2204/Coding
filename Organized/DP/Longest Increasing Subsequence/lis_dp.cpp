#include<iostream>
#include<cmath>

using namespace std;

int _lis(int* a,int n)
{
	int* lis=new int[n];
	for(int i=0;i<n;i++)
	{
		lis[i]=1;
	}
	
	for(int i=1;i<n;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(a[j]<a[i])
			{
				lis[i]=max(lis[i],lis[j]+1);
				
			}
		}
	}
	int max=1;
	for(int i=0;i<n;i++)
	{
		if(lis[i]>max)
		{
			max=lis[i];
		}
	}
	delete(lis);
	return max;
}

int main()
{
	int n;
	cin>>n;
	int* a=new int[n];
	
	for(int i=0;i<n;++i)
	{
		cin>>a[i];
	}
	
	cout<<_lis(a,n);
	
	delete(a);
	return 0;
}
