#include <iostream>
#include <cmath>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	int z;
	cin>>z;
	bool prime[z+1];
	for(int i=0;i<=z;++i)
	{
		prime[i]=true;
	}
	prime[0]=false;
	prime[1]=false;
	for(int i=2;i*i<=z;++i)
	{
		if(prime[i])
		{
			for(int j=i*i;j<=z;j+=i)
			{
				prime[j]=false;
			}
		}
	}
	for(int i=2;i<=z;++i)
	{
		if(prime[i])
		cout<<i<<endl;
	}
	system("pause");
	return 0;
}
