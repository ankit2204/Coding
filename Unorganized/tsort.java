import java.io.*;
class tsort
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int t=Integer.parseInt(br.readLine());
for(int x=0;x<t;x++)
{
int n=Integer.parseInt(br.readLine());
int a[]=new int[100000];
for(int i=0;i<n;i++)
{
int b=Integer.parseInt(br.readLine());
a[b]+=1;
}
for(int j=0;j<100000;j++)
{
for(int k=0;k<a[j];k++)
{
System.out.println(+j);
}
}
}
}
}

