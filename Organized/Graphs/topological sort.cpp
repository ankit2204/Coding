#include<iostream>
#include<vector>
#include<stack>
using namespace std;
   
void topologicalSort(int s,vector<vector<int> >v,bool visited[],stack<int> &st)
{
    visited[s]=false;
    vector<int>::iterator i;
    for(i=v[s].begin();i!=v[s].end();i++)
    {
        if(visited[*i])
        {
            topologicalSort(*i,v,visited,st);
        }
    }
    st.push(s);
}             
                         
int main()
{
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
    }
    bool *visited=new bool[n];
    for(int i=0;i<n;i++)
    {
        visited[i]=true;
    }
    stack<int> st;
    for(int i=0;i<n;i++)
    {
        if(visited[i])
        {
            topologicalSort(i,v,visited,st);
        }
    }
    while(!st.empty())
    {
        cout<<st.top()<<" ";
        st.pop();
    }   
    system("pause");
    return 0;             
}           
    
