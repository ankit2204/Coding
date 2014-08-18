import java.io.*;
class mat
{public static int i;
  public static void main(String args[])throws IOException
  {int p=0,k=0,l=0;
    for(i=1;i<1000000;i++)
     {
       k=checkPrime(i);
        if(k==1)
        {
           l=checkSum(i);
           if(l==1)
           {
             p++;
             if(p==10000)
             {
               System.out.print(i);
             }
           }
        }
     }
  }

public static int checkPrime(int i)
{
int count=0;
  for(int j=2;j<i/2;j++)
    {
      if(i%j==0)
        count++;
    }
if(count==0)
{
 return 1;
}
else
{
return 0;
}
}
 
public static int checkSum(int i)
{
int sum=0;
while(i>0)
{
sum+=i%10;
i=i/10;
}
int x=checkPrime(sum);
if(x==1)
{
return 1;
}
else
{
return 0;
}
}
}