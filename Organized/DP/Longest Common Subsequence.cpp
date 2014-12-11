#include<iostream>
#include<string>
#include<cmath>
using namespace std;

int LCS(string a,string b,int m,int n)
{
	if(m==0 || n==0)
	{
		return 0;
	}
	if(a[m]=b[n])
	{
		return 1+LCS(a,b,m-1,n-1);
	}
	else
	{
		return max(LCS(a,b,m,n-1),LCS(a,b,m-1,n));
	}
}

int main(){
	string a,b;
	cin>>a>>b;
	int m=a.length();
	int n=b.length();
	cout<<LCS(a,b,m-1,n-1);
	return 0;
}
