import java.io.*;
import java.math.BigInteger;
class Atm
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{int j=1;
String s[]=br.readLine().split(" ");
BigInteger a=new BigInteger(s[0]);
BigInteger b=new BigInteger(s[1]);
BigInteger c=new BigInteger(s[2]);
BigInteger p=a.multiply(b);
BigInteger bigInteger=c.subtract(p);
while(bigInteger.signum() == 1)
{
  p=b.multiply(p);
  j++;
  bigInteger=c.subtract(p);
}
BigInteger bigInteger1=p.subtract(c);
if(p==c)
{
 System.out.println(+j);
}
else if(bigInteger1.signum() == 1)
{
System.out.println(j-1);
}
else
{
System.out.println(0);
}
}
}
} 
