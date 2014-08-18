import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
class Pal
{
private static long startTime = System.currentTimeMillis();
public static void main(String args[])throws Exception
{int c,n;
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
PrintWriter pw = new PrintWriter(System.out);
n=Integer.parseInt(br.readLine());
for(c=n;true;c++)
{
if(isPrime(c) && (isPal(c)))
{
break;
}
}
pw.println(c);
pw.flush();
long endTime = System.currentTimeMillis();
System.out.println("It took " + (endTime - startTime) + " milliseconds");
}

public static boolean isPrime(int c)
{
for (int i=2;i<c;i++)
{
if(c%i==0)
{
return false;
}
}
return true;
}

public static boolean isPal(int c)
{
String s=Integer.toString(c);
int l=s.length();
for(int i=0;i<(l/2)+1;++i)
{
if(s.charAt(i)!=s.charAt(l-i-1))
{
return false;
}
} 
return true;
}}       