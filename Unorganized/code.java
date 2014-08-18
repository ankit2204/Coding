import java.io.*;
import java.lang.Math;
class Code
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int t=Integer.parseInt(br.readLine());
String out[]=new String[t];
for(int k=0;k<t;k++)
{
outerLoop://Label
{
int x=Integer.parseInt(br.readLine());
if(isPrime(x))
{
  for(int j=1;j<x;j=j+2)
    {
     if(isPrime(j))
       {
         int p=x-j;
        if(j!=p)
        {
         if(isPrime(p))
           {
               out[k]="BUY";
             break outerLoop;
           }
       }}
       }
    
out[k]="DONT BUY";
}
else
{
  out[k]="DONT BUY";
}
}
}
for(int y=0;y<t;y++)
{
System.out.println(out[y]);
}
}
public static boolean isPrime(int c)
{
double r=Math.sqrt(c);
for(int i=2;i<=r;i++)
{
if(c%i==0)
{
return false;
}
}
return true;
}
}
