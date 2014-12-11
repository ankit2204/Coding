#include<iostream>
#include<cmath>
#include<string>
#include<algorithm>
#include<vector>
using namespace std;

int main(){

int n,s;
cin>>n>>s;
int a[n];

for(int i=0;i<n;i++)
{
	cin>>a[i];
}

sort(a,a+n-1);
int i=0,j=n-1;
while(i<j)
{
	if(a[i]+a[j]==s)
	{
		cout<<a[i]<<" "<<a[j]<<endl;
		break;
	}
	else if(a[i]+a[j]<s)
	{
		i++;
	}
	else
	{
		j--;
	}
}

return 0;
}

