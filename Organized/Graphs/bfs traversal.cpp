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
	bool visited[m];
	for(int i=0;i<m;i++)
	{
		visited[i]=true;
	}
	queue<int> bfs;
	bfs.push(0);
	visited[0]=false;
    std::vector<int>::iterator i;
	while(!bfs.empty())
	{
		int c=bfs.front();
		cout<<bfs.front()<<" ";
		bfs.pop();
		for(i=v[c].begin();i<v[c].end();i++)
		{
			if(visited[*i])
			{
				visited[*i] =false;
				bfs.push(*i);
			}
		}
	}
	system("pause");
	return 0;
}
