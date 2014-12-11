#include<iostream>
#include<cstring>
using namespace std;

void search(string pat,string text)
{
	int n=text.length();
	int m=pat.length();
	
	for(int i=0;i<=n-m;++i)
	{
		int j;
		for(j=0;j<m;++j)
		{
			if(text[i+j]!=pat[j])
			{
				break;
			}
		}
		if(j==m)
		{
			cout<<"pattern found at index "<<i;
		}
	}
}

int main(){
	string text,pat;
	cin>>text>>pat;
	search(pat,text);
	return 0;
}
