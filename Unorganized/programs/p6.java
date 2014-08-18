import java.io.*;
class Append
{
public static void main(String args[])throws IOException
{int i=1;
System.out.println("Enter a string");
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
String s1=br.readLine();
String s2="";
String s3="";
char c=s1.charAt(0);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='e' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
{
s3=s1+"hp";
}
else
{while(i<s1.length())
{
s2=s2+s1.charAt(i);
i++;
}
s3=s2+"hp";
}
System.out.println(s3);
}
}