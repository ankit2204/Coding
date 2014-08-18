import java.io.*;
import java.math.*;
class Code
{
public static void main(String args[])throws IOException
{
BigInteger c=BigInteger.valueOf(0);
BigInteger f=BigInteger.valueOf(3334);
BigInteger s=BigInteger.valueOf(0);
BigInteger d=BigInteger.valueOf(10);
BigInteger su=BigInteger.valueOf(0);
for(int i=1;i<3334;i++)
{
f=f.multiply(f);
}
while(f.compareTo(c)>0)
{
s=s.add(f.remainder(d));
f=f.divide(d);
System.out.println(s);
}
while(s.compareTo(c)>0)
{
su=su.add(s.remainder(d));
s=s.divide(d);
}
System.out.println(su);
}
}