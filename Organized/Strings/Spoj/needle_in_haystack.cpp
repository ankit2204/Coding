#include<iostream>
#include<cstring>
#include<cstdio>

using namespace std;

void computelps(string pat,int m,int lps[])
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

int main()
{
	while(true)
	{
		int m;
		string pat;
		
		cin>>m>>pat;
		getchar();
		
		int lps[m];
		computelps(pat,m,lps);
		
		int i=0,j=0;
		bool found=true;
		
		char c=getchar();
		
		while(true)
		{
		    if(c==EOF || c=='\n')
		    {
		    	break;
		    }  
			
			if(pat[j]==c)
			{
				i++;
				j++;
				c=getchar();
				
				if(j==m)
				{
				   cout<<i-j<<endl;
				   j=lps[j-1];
				   found=false;
				}
			}
			else if(pat[j]!=c)
			{
				if(j==0)
				{
					i++;
					c=getchar();
				}
				else
				{
					j=lps[j-1];
				}
			}
		}
	if(found==true)
		{
			cout<<endl<<endl;
		}
		if(c==EOF)
		{
			break;
		}
	}
	return 0;	
}

