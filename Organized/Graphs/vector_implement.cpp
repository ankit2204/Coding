#include <iostream>
#include <vector>
using namespace std;

int main() {
	vector< vector<int> >v;
	int n,m;
	cin>>n>>m;
	for(int i=0;i<n;i++)
	{
	    //memory allocation to vector
		v.push_back(vector<int>());
	}
	//inserting the vertices in a undirected graph
	while(m--)
	{
		int a,b;
		cin>>a>>b;
		v[a].push_back(b);
		v[b].push_back(a);
	}
	//outputting the vertices connected to a particular vertex
	for(int i=0;i<v[1].size();i++)
	{
		cout<<v[1][i]<<" ";
	}
	system("pause");
	v.clear();
	return 0;
}
