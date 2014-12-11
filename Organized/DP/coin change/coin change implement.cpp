#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;

int main() {
	int s,n;
	cin>>s>>n;
	int a[n];
	int	coin[s+1];
	for(int i=1;i<=s;i++)
	{
		coin[i]=32468;
	}
	coin[0]=0;
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	for(int i=1;i<=s;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(a[j]<=i)
			{
				coin[i]=min(coin[i-a[j]]+1,coin[i]);
			}
		}
	}
	cout<<coin[s];
	system("pause");
	return 0;
}
