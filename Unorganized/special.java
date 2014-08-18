import java.io.*;
class Prob
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
String in[]=br.readLine().split(" ");
for(int i=0;i<n;i++)
{
a[i]=Integer.parseInt(in[i]);
}
int q=Integer.parseInt(br.readLine());
for(int j=0;j<q;j++)
{int o=0,num=0;
int k=Integer.parseInt(br.readLine());
for(int l=0;l<n;l++)
{
int s=0,t=0;
if(a[l]==k)
{
num++;
int c=a[l];
int m=l-1;
while(m>=0 && a[m]>=c)
{
s++;
m--;
}
int d=a[l];
int p=l+1;
while(p<n && a[p]>d)
{
t++;
p++;
}
o+=t+s+t*s;
}
}
int ou=o+num;
System.out.println(+ou);
}
}
}