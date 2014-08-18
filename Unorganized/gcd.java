import java.io.*;
import java.lang.Math;
class Code
{
public static void main(String args[])throws IOException
{
double c=Math.pow(2,50)+1;
double d=Math.pow(2,25)+1;
double e=Math.pow(2,25)-1;
double x=Math.pow(2,16)+1;;
if(c%x==0)
{
System.out.println("1");
}
else if(d%x==0)
{
System.out.println("2");
}
else if(e%x==0)
{
System.out.println("3");
}
}
}