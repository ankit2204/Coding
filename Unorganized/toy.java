import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
public static void main(String args[] ) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
int o=0,temp=0,tempe=0,y=0,l=0;

String s[]=br.readLine().split(" ");

int n=Integer.parseInt(s[0]);

int p=Integer.parseInt(s[1]);

int q=Integer.parseInt(s[2]);

int a[]=new int[n];

int b[]=new int[n];

for (int j = 0; j <n; j++) 
     
{
String inp[]=br.readLine().split(" ");
a[j]=Integer.parseInt(inp[0]);

b[j]=Integer.parseInt(inp[1]);
     
}
for(int k=1;k<n;k++)
{
   l=k-1;
   temp=a[k];
   while(l>=0 && a[l]<temp)
  {
    a[l+1]=a[l];
    a[l]=temp;
    l=l-1;
  }
 y=k-1;
   tempe=b[k];
   while(y>=0 && b[y]<tempe)
  {
    b[y+1]=b[y];
    b[y]=tempe;
    y=y-1;
  }
} 
for(int z=0;z<n;z++)
{
int c=0;      
c=b[z]-a[z];
             
if(c>0)
             
{
             	
o=o+(p*c);
             
}
             
else if(c<0)
             
{
             	
o=o-(q*c);
       }
        
}
 System.out.println(+o);
    }
}}