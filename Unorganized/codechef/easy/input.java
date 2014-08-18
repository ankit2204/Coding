import java.io.*;
class Atm
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int g=Integer.parseInt(br.readLine());
for(int k=0;k<g;k++)
{int sumc=0,sumd=0;
String s[]=br.readLine().split(" ");
int x=Integer.parseInt(s[0]);
int y=Integer.parseInt(s[1]);
int a[]=new int[x];
String w[]=br.readLine().split(" ");
for(int i=0;i<x;i++)
{
a[i]=Integer.parseInt(w[i]);
}
int j=0,temp=0;
for(int i=1;i<x;i++)
{
   j=i-1;
   temp=a[i];
   while(j>=0 && a[j]>temp)
  {
    a[j+1]=a[j];
    a[j]=temp;
    j=j-1;
  }
}
int c;
if(y<=(x-y))
{
c=y;
}
else
{
c=x-y;
}
for(int i=0;i<c;i++)
{
sumc+=a[i];
}
for(int i=c;i<x;i++)
{
sumd+=a[i];
}
System.out.println(sumd-sumc);
}
}
}