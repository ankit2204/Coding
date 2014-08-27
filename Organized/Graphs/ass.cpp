#include <iostream>
#include <cmath>
using namespace std;

double newton(double a,double b,double c)
{
		double x[3][3];
	    x[0][0]=2*a*b*c;
	    x[0][1]=a*a*c;
	    x[0][2]=a*a*b;
	    x[1][0]=0;
	    x[1][1]=1.7*c*pow(b,0.7);
	    x[1][2]=pow(b,1.7);
	    x[2][0]=b;
	    x[2][1]=a+c*c;
	    x[2][2]=2*b*c;
	    
	    double y[3][1];
	    y[0][0]=(a*a*b*c)-6;
	    y[1][0]=(pow(b,1.7)*c)-8;
	    y[2][0]=(a*b+(b*c*c))-9;
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		cout<<x[i][j]<<" ";
	    	}
	    	
	    }
	    cout<<endl;
	     for(int i=0;i<3;i++)
	    {
	    	int j=0;
	    		cout<<y[i][j]<<" ";
	    }
}

int main() {

newton(1.235889,2.76237,1.4220327);
system("pause");
	return 0;
}
