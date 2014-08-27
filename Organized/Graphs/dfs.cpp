#include <iostream>
#include <vector>
using namespace std;

void dfs(vector<vector<int> >v,int s,bool visited[])
{ 
    visited[s] =false;
    std::vector<int>::iterator i;
    cout<<s<<"->";
    for(i=v[s].begin();i<v[s].end();i++)
    {
        if(visited[*i])
        {
            dfs(v,*i,visited);
        }
    }
}    		

int main() {
	int n,m;
	cin>>n>>m;
	vector<vector<int> >v;
	for(int i=0;i<n;i++)
	{
		v.push_back(vector<int>());
	}
	while(m--)
	{
		int a,b;
		cin>>a>>b;
		v[a].push_back(b);
		//v[b].push_back(a);
	}
	bool visited[n];
	for(int i=0;i<n;i++)
	{
		visited[i]=true;
	}
	for(int i=0;i<n;i++)
	{
	    if(visited[i])
	    {
         dfs(v,i,visited);
        }    
    }    
	system("pause");
	return 0;
}	
