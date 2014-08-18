import java.io.*;
class Atm
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
String s[]=br.readLine().split(" ");
int x=Integer.parseInt(s[0]);
float y=Float.parseFloat(s[1]);
if(x>y-0.50||x%5!=0)
{
System.out.printf("%.2f",y);
}
else
{
System.out.printf("%.2f",(y-0.50-(float)x));
}}
}