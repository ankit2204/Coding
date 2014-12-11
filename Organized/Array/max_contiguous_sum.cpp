#include<iostream>
#include<cmath>
#include<string>
#include<algorithm>
#include<vector>
using namespace std;

int main(){

int n;
cin>>n;
int a[n];

for(int i=0;i<n;i++)
{
	cin>>a[i];
}

int max_so_far=0;
int max_ending_here=0;

for(int i=0;i<n;++i)
{
	max_ending_here+=a[i];
	if(max_ending_here<0)
	{
		max_ending_here=0;
	}
	else if(max_ending_here>max_so_far)
	{
		max_so_far=max_ending_here;
	}
}
cout<<max_so_far;


return 0;
}

