import java.io.*;
class Seg
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
int n=Integer.parseInt(br.readLine());
int x=0,v=0;
String s[]=br.readLine().split(" ");
for(int j=0;j<n;j++)
{
int y=Integer.parseInt(s[j]);
if(y>1)
{
x++;
if(y==2)
v++;
}
}
long c=x,z=v;
c=(c*(c-1))/2;
z=(z*(z-1))/2;
c=c-z;
System.out.println(c);
}
System.exit(0);
}
}