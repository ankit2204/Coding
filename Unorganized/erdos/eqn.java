import java.io.*;
import java.lang.Math;
class Code
{
public static void main(String args[])throws IOException
{long fact=201413;
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
for(long i=1;i<=1000000007;i++)
{ 
if(fact>=2097152)
{
fact=fact%2097152;
if(fact==1)
{
i=i%1000000007;
System.out.println(i);
System.exit(0);
}
}
fact=fact*201413;
}
System.out.println(+fact); 
}
}

            

