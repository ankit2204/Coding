import java.io.*;
class Atm
{
public static void main(String args[])throws IOException
{
int a[]=new int[100000000];
for(int i=11;i<10000000;i++)
{
a[i]=i;
}
 int z=1;
int arr[]=new int[100000000];
arr[0]=3;
for(int i=5;i<16999999;i=i+2)
{
int d=0;
String s=Integer.toString(i);
char ch=s.charAt(0);
if(a[i]!=0)
{
if((int)ch%2!=0 && (int)ch!=5)
{
if(isPrime(i,arr))
{
arr[z]=i;
z++;
int j=i;

while(j>0)
{
int r=j%10;
d=d*10+r;
j=j/10;
}
if(isPrime(d,arr))
{
if(i!=d)
{
if(i<d)
{
a[d]=0;
System.out.println(+i);
}
}
}
}
}
}
}
}
public static boolean isPrime(int c,int arr[])
{int x=0;
double r=Math.sqrt(c);
if(c%2==0)
{
return false;
}
while(arr[x]<=r)
{
if(c%arr[x]==0)
{
return false;
}
x++;
}
return true;
}
}