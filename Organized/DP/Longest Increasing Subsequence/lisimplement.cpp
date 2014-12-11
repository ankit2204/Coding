#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;

int main() {
	int n;
	cin>>n;
	int a[n];
	int	lis[n];
	for(int i=0;i<n;i++)
	{
		lis[i]=1;
		cin>>a[i];
	}
	for(int i=1;i<n;i++)
	{
		for(int j=i-1;j>=0;j--)
		{
			if(a[i]>a[j])
			{
				lis[i]=max(lis[j]+1,lis[i]);
			}
		}
	}
    int	m=1;
	for(int i=0;i<n;i++)
	{
		if(lis[i]>m)
		{
			m=lis[i];
		}
	}
	cout<<m;
	return 0;
}
