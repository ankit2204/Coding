import java.io.*;
class Prob
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int n=Integer.parseInt(br.readLine());
for(int j=0;j<n;j++)
{int s=0;
int ca[]=new int[62];
int cb[]=new int[62];
String a=br.readLine();
String b=br.readLine();
for(int x=0;x<a.length();x++)
{
char c=a.charAt(x);
int as=(int)c;
if(as>47 && as<58)
{
ca[as-48]=ca[as-48]+1;
}
if(as>64 && as<91)
{
ca[as-55]=ca[as-55]+1;
}
if(as>96 && as<123)
{
ca[as-61]=ca[as-61]+1;
}
}
for(int y=0;y<b.length();y++)
{
char c=b.charAt(y);
int as=(int)c;
if(as>47 && as<58)
{
cb[as-48]=cb[as-48]+1;
}
if(as>64 && as<91)
{
cb[as-55]=cb[as-55]+1;
}
if(as>96 && as<123)
{
cb[as-61]=cb[as-61]+1;
}
}
for(int i=0;i<62;i++)
{
if(ca[i]<=cb[i])
{
s=s+ca[i];
}
else
{
s=s+cb[i];
}
} 
System.out.println(+s);
}
}
}