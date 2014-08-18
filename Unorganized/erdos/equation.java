import java.io.*;
import java.Math.BigInteger;
class Atm
{
public static void main(String args[])throws IOException
{
for(int i=1;i<100000;i++)
{
for(int j=i+1;j<100000;j++)
{
BigInteger a=Math.pow(j,6);
BigInteger b=Math.pow(i,6)+8*Math.pow(i,4)-6*Math.pow(i,2)+8;
System.out.println(a);
System.out.println(b);
if(b.equals(a))
{
System.out.println(j);
break;
}
}
}
}
}