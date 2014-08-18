import java.io.*;
class Tour
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
String s[]=br.readLine().split(" ");
int t=Integer.parseInt(s[0]);
String m=s[1];
for(int i=0;i<t;i++)
{
String c=br.readLine();
for(int j=0;j<s.length();j++)
int a=(int)c.charAt(j);
if(a>=97 && a<=122)
{
 c.charAt(j)=m.charAt(a-97);
}
else if(a>=65 && a<=90)
{
 c.charAt(j)=m.charAt(a-65);
}
else if(c.charAt(i)=='_')
{
c.charAt(j)=" ";
}
System.out.println(+c);
}
}
}


 