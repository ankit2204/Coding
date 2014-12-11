#include<iostream>
#include<cstring>
using namespace std;

void computelps(int m,string pat,int* lps)
{
	lps[0]=0;
	int i=1,len=0;
	while(i<m)
	{
		if(pat[i]==pat[len])
		{
			lps[i]=len+1;
			i++;
			len++;
		}
		else
		{
			if(len==0)
			{
				lps[i]=0;
				i++;
			}
			else
			{
				len=lps[len-1];
			}
		}
	}
}

void kmp(string text,string pat)
{
	int n=text.length();
	int m=pat.length();
	
	int* lps=new int[m];
	computelps(m,pat,lps);
	int i=0,j=0;
	while(i<n)
	{
		if(text[i]==pat[j])
		{
			i++;
			j++;
			
			if(j==m)
			{
				cout<<"string matched at index "<<i-j<<endl;
				j=lps[j-1];
			}
		}
		else
		{
			if(j==0)
			{
				i++;
			}
			else
			{
				j=lps[j-1];
			}
		}
	}
}

int main(){
	string text,pat;
	cin>>text>>pat;
	kmp(text,pat);
	return 0;
}
