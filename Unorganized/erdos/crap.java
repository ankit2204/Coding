import java.io.*;
class Atm
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int t=Integer.parseInt(br.readLine());
int a[]=new int[t];
for(int i=0;i<t;i++)
{
String s[]=br.readLine().split(" ");
int x=Integer.parseInt(s[0]);
int y=Integer.parseInt(s[1]);
int z=x%y;
a[i]=z;
}
for(int i=0;i<t;i++)
{
System.out.println(a[i]);
}
}
}