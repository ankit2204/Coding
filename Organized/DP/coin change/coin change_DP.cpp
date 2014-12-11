#include<iostream>

using namespace std;

int main(){
	int n,k;
	cin>>n>>k;
	int c[k];
	for(int i=0;i<k;++i)
	{
		cin>>c[i];
	}
	
	int dp[n+1];
	for(int i=0;i<=n;i++)
	{
		dp[i]=0;
	}
	dp[0]=1;
	
	for(int i=0;i<k;++i)
	{
		for(int j=1;j<=n;j++)
		{
			if(j>=c[i])
			{
				dp[j]+=dp[j-c[i]];
				cout<<i<<" "<<dp[i]<<endl;
			}
		}
	}
	cout<<dp[n];
	
	return 0;
}
