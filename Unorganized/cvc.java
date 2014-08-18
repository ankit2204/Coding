import java.io.*;
class Atm
{
public static void main(String args[])throws IOException
{int co=0;
int a[]=new int[100000000];
for(int i=11;i<100000000;i++)
{
a[i]=i;
}
for(int i=11;i<100000000;i++)
{
if(a[i]!=0)
{
int d=0;
String s=Integer.toString(i);
char ch=s.charAt(0);
if((int)ch%2!=0 && (int)ch!=5)
{
if(isPrime(i))
{
int j=i;
while(j>0)
{
int r=j%10;
d=d*10+r;
j=j/10;
}
if(isPrime(d))
{
if(i!=d)
{
if(i<d)
{
a[d]=0;
co++;
System.out.println(+i);
}
}
}
}
}}
}
System.out.println(co);
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