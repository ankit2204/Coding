#include <iostream>
#include <vector>
#include <queue>
#include <list>
using namespace std;

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
		v[b].push_back(a);
	}
	bool visited[n];
	for(int i=0;i<n;i++)
	{
		visited[i]=true;
	}
	int distance[n];
	for(int i=0;i<n;i++)
	{
	    distance[i]=1000;
	}    
	cout<<"start bfs from"<<endl;
	int x;
	cin>>x;
	queue<int> bfs;
	bfs.push(x);
	visited[x]=false;
	distance[x]=0;
    std::vector<int>::iterator i;
	while(!bfs.empty())
	{
		int c=bfs.front();
		bfs.pop();
		for(i=v[c].begin();i<v[c].end();i++)
		{
			if(visited[*i])
			{
			    distance[*i]=distance[c]+1;
				visited[*i] =false;
				bfs.push(*i);
			}
		}
	}
	for(int i=0;i<n;i++)
	{
	    cout<<distance[i]<<" ";
	}    
	system("pause");
	return 0;
}
