import java.io.*;
class Pal
{
 private static long startTime = System.currentTimeMillis();
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int n=Integer.parseInt(br.readLine());
int c=n;
while(true)
{
boolean p=true;
for (int i=2;i<=c/2;i++)
{
if(c%i==0)
{
p=false;
break;
}
}
if(p)
{int d=0;
int z=c;
while(z>0)
{
int b=z%10;
d=d*10+b;
z=z/10;
}
if(d==c)
{
System.out.println(+c);
break;
}
else
{
c++;
}
}
else
{ 
c++;
} 
}
long endTime = System.currentTimeMillis();
System.out.println("It took " + (endTime - startTime) + " milliseconds");
}}      