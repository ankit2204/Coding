import java.io.*;
class Atm
{
public static void main(String args[])throws IOException
{int sum=0;
for(int c=1;c<=1000000000;c++)
{
if(isBinPal(c) && isOctPal(c) && isHexPal(c))
{
sum=sum+c;
}
}
System.out.println(+sum);
}

public static boolean isBinPal(int c) 
{
String b=Integer.toBinaryString(c);
int l=b.length();
for(int i=0;i<(l/2)+1;i++)
{
if(b.charAt(i)!=b.charAt(l-i-1))
{
return false;
}
} 
return true;
}

public static boolean isOctPal(int c) 
{
String o=Integer.toOctalString(c);
int l=o.length();
for(int i=0;i<(l/2)+1;i++)
{
if(o.charAt(i)!=o.charAt(l-i-1))
{
return false;
}
} 
return true;
}

public static boolean isHexPal(int c) 
{
String h=Integer.toHexString(c);
int l=h.length();
for(int i=0;i<(l/2)+1;i++)
{
if(h.charAt(i)!=h.charAt(l-i-1))
{
return false;
}
} 
return true;
}
}

    

