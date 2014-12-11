#include<iostream>
using namespace std;

int main()
{
    long long sav_pa=3500000,sav_pr=320000,increment=100000;
    int t=10,r=9;
    cout<<"enter your total savings till date"<<endl;
    cin>>sav_pa;
    cout<<"enter your present yearly saving"<<endl;
    cin>>sav_pr;
    cout<<"enter avg rate of interest"<<endl;
    cin>>r;
    cout<<"amount with which savings are likely to increase per year"<<endl;
    cin>>increment;
    cout<<"time period after which you want to know your total savings"<<endl;
    cin>>t;
    long long interest=0;
    long long sav_t=sav_pa+sav_pr;
    for(int i=1;i<=t;i++)
    {
        cout<<sav_t<<" "<<i<<endl;
        interest=(sav_t*r)/100;
        cout<<interest<<" "<<i<<endl;
        sav_t+=increment+interest;
    }
    cout<<sav_t<<endl;
    system("pause");
    return 0;
}        
