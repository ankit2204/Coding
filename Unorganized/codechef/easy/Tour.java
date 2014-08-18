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
for(int j=0;j<c.length();j++)
{
char b= c.charAt(j);
int a=(int)b;
if(a>=97 && a<=122)
{
c=c.replace(b,m.charAt(a-97));
}
else if(a>=65 && a<=90)
{
 char ch=Character.toUpperCase(m.charAt(a-65));
 c=c.replace(b,ch);
}
else if(b=='_')
{
c=c.replace(b,' ');
}
}
System.out.println(c);
}
}
}


 