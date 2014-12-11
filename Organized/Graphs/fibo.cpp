#include <iostream>
using namespace std;
 
int main() {
	long long dp[100000];
	dp[0]=0;
	dp[1]=1;
	for(int i=2;i<=100000;++i)
	{
		dp[i]=dp[i-1]+dp[i-2];
		dp[i]=dp[i]%1000000007;
	}
	cout<<dp[1000];
	system("pause");
	return 0;
}
