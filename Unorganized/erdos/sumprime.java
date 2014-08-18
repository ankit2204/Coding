import java.io.*;
class Atm
{
public static void main(String args[])throws IOException
{
int z=1;
int arr[]=new int[100000];
arr[0]=3;
for(int i=5;i<1000000;i=i+2)
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
if(i!=r)
{
if(isPrime(i,arr));
{
System.out.println(+i);
}
}
}
}
public static boolean isPrime(int c,int arr[])
{int x=0;
double r=Math.sqrt(c);
while(a[x]<=r)
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