#include<iostream>
using namespace std;

void merge(int a[],int aux[],int low,int mid,int high)
{
	for(int i=low;i<=high;++i)
	{
		aux[i]=a[i];
	}
	
	int i=low,j=mid+1;
	for(int k=low;k<=high;++k)
	{
		if(i>mid)
		{
			a[k]=aux[j++];
		}
		else if(j>high)
		{
			a[k]=aux[i++];
		}
		else if(aux[j]>aux[i])
		{
			a[k]=aux[i++];
		}
		else
		{
			a[k]=a[j++];
		}
	}
}

void sort(int a[],int aux[],int low,int high)
{
	if(low>=high)
	{
		return;
	}
	int mid=low+(high-low)/2;
	sort(a,aux,low,mid);
	sort(a,aux,mid+1,high);
	merge(a,aux,low,mid,high);
}

int main(){
	int n;
	cin>>n;
	int a[n];
	int aux[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	sort(a,aux,0,n-1);
	for(int i=0;i<n;i++)
	{
		cout<<a[i]<<endl;
	}
	return 0;
}
